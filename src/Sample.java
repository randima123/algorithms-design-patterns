public class Sample {

    public void reversArray(int[] arr) {

        for (int t : arr) {
            System.out.print(t);
        }

        for (int n = 0, m = arr.length - 1; m > n; n++, m--) {
            int temp = arr[n];
            arr[n] = arr[m];
            arr[m] = temp;
        }

        for (int t : arr) {
            System.out.println(t);
        }
    }

    public void reverseWords(String sentence) {

        String[] arr = sentence.split(" ");
        String reveseSentece = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reveseSentece = reveseSentece + " " + arr[i];
        }

        System.out.println(reveseSentece);
    }

    public void reverseEachWord(String sentence) {

        String[] arr = sentence.split(" ");
        String newSen = "";
        for (int j = 0; j < arr.length; j++) {

            char[] letterArr = arr[j].toCharArray();
            String revWord = "";
            for (int i = letterArr.length - 1; i >= 0; i--) {

                revWord = revWord + "" + letterArr[i];
            }
            newSen = newSen + " " + revWord;
        }
        System.out.println(newSen);
    }

    public void swapFirstLast(String sentence) {

        String[] arr = sentence.split(" ");
        String newSent = "";

        for (String word : arr) {
            String res = "";
            if (word.length() > 1) {
                res = word.substring(word.length() - 1, word.length()) + word.substring(1, word.length() - 1) + word.substring(0, 1);
            } else {
                res = word;
            }
            newSent = newSent + " " + res;
        }
        System.out.println(newSent);
    }

    public void logic(Animal obj) {
        obj.run();
    }
}


