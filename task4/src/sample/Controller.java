package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import sample.sort.SelectionSort;
import sample.sort.SortState;
import java.util.List;

public class Controller{

    @FXML
    private TextField input;

    @FXML
    private Canvas canvas;

    @FXML
    private Button button;

    private GraphicsContext context;

    @FXML
    private void initialize() {
        context = canvas.getGraphicsContext2D();
    }


    private void clear(){
        context.setFill(Color.WHITE);
        context.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
    }

    private void print(SortState state){
        clear();

        int arr[] = state.getArr();
        int WIDTH = 8;

        context.setFill(Color.BLACK);

        int prevLength = 0;
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i] + " ";
            context.fillText(str, prevLength + 4 , 20);

            if (i == state.getFirstIndex()) {
                context.setStroke(state.isSwap() ? Color.BLACK : Color.ORANGE);
                context.strokeRect(prevLength, 0, str.length() * WIDTH, 30);
            }

            if (i == state.getSecondIndex()) {
                context.setStroke(state.isSwap() ? Color.BLACK : Color.RED);
                context.strokeRect(prevLength, 0, str.length() * WIDTH, 30);
            }
            prevLength += str.length() * WIDTH;
        }
    }

    @FXML
    private void run() {

        int[] arr = Utils.toIntArray(input.getText());

        List<SortState> states = SelectionSort.sort(arr);

        new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(i < states.size()) {
                    try {
                        Thread.sleep(100);
                        SortState state = states.get(i);
                        print(state);
                        i++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
