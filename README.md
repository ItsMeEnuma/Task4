# Task4 №4
Молин Д.М. 1 курс 3.1 группа.

2.Написать программу, которая иллюстрирует работу сортировки пузырьком (Bubble sort) на примере массива целых чисел. Для описания текущего состояния сортировки должен быть описан класс SortState, в котором будут храниться:
–	массив (текущее состояние на данном шаге, естественно, надо делать копию массива, т.к. исходный массив будет меняться в процессе сортировки);
–	переменная цикла i;
–	переменная вложенного цикла j;
–	возможно еще какие-то данные, необходимые для визуализации.
В модифицированной процедуре сортировки помимо соответствующих действий на каждом шаге необходимо создать экземпляр класса SortState, соответствующий текущему шагу сортировки, и добавлять этот экземпляр в список состояний, который будет возвращаться, т.е. сортировка будет иметь следующую сигнатуру:
List<SortState> sort(int[] arr)
Далее необходимо реализовать наглядное отображение на форме состояния SortState (возможно с использованием JTable или нарисовать). К таймеру следует привязать обработчик событий, который будет обновлять форму (перерисовывать очередное состояние в процессе сортировки).
Таким образом, непосредственно сортировка выполняется сразу же, а отображение на форме произошедших событий осуществляется позже с задержками, чтобы пользователь мог оценить, что происходит.
Предусмотреть режим, когда таймер отключается и очередное состояние отображается по нажатию кнопки (причем, чтобы можно было «проигрывать» события как вперед, так и назад).
**№4.Реализовать вариант №2, но для сортировки выбором (Selection sort).**
