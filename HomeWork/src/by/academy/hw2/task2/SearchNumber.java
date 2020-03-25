package by.academy.hw2.task2;

public class SearchNumber {

    public void search(Integer array[]){

        StringBuilder builder = new StringBuilder();
        builder.append(array[0]+",");

        int coute = 0;

        for (int i = 1; i < array.length; i++){
            if (!builder.toString().contains(array[i].toString()+",")){
                builder.append(array[i]+",");
            }
        }

        String[] strArr = String.valueOf(builder).split(",");
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        Integer[] counter = new Integer[numArr.length];

        for(int i = 0; i < counter.length; i++){counter[i] = 0;}

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < counter.length; j++){
                if (numArr[j] == array[i]) counter[j] += 1;
            }
        }
        for (int i = 0; i < counter.length; i++){
            if (counter[i]%2 == 1){
                coute = i;
            }
        }
        System.out.print(numArr[coute]+"  ");
    }
}