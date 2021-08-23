public class Matriz {
        public static void main(String[] args) {

            String cidade[] = new String[10];
            int temperatura[][] = new int[10][2];
            int i, tempMenor = 5, tempMaior = 5;

            cidade[0] = "Londres";
            cidade[1] = "Madri";
            cidade[2] = "Nova York";
            cidade[3] = "Buenos Ares";
            cidade[4] = "Assuncao";
            cidade[5] = "Sao Paulo";
            cidade[6] = "Lima";
            cidade[7] = "Santiago do Chile";
            cidade[8] = "Lisboa";
            cidade[9] = "Tokio";

            temperatura[0][0] = -2;
            temperatura[0][1] = 33;
            temperatura[1][0] = -3;
            temperatura[1][1] = 32;
            temperatura[2][0] = -8;
            temperatura[2][1] = 27;
            temperatura[3][0] = 4;
            temperatura[3][1] = 37;
            temperatura[4][0] = 6;
            temperatura[4][1] = 42;
            temperatura[5][0] = 5;
            temperatura[5][1] = 43;
            temperatura[6][0] = 0;
            temperatura[6][1] = 39;
            temperatura[7][0] = -7;
            temperatura[7][1] = 26;
            temperatura[8][0] = -1;
            temperatura[8][1] = 31;
            temperatura[9][0] = -10;
            temperatura[9][1] = 35;

            for(i=0;i<10;i++){
                if(temperatura[i][0]<temperatura[tempMenor][0])
                    tempMenor = i;
                if(temperatura[i][1]>temperatura[tempMaior][1])
                    tempMaior = i;
            }

            System.out.println(cidade[tempMenor] + " tem a menor temparatura com " + temperatura[tempMenor][0]);
            System.out.println(cidade[tempMaior] + " tem a maior temparatura com " + temperatura[tempMaior][1]);
    }


}
