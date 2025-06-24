public class Execption {

    public static void main(String[] args) {

        String ans[]=new String[5];

        try {
            //array index out of bound execption

            String a[]= {"jaya","balaji","charlie","donlee,","erfan","fayaz"};
            for(int i=0;i<a.length;i++) {
                ans[i]=a[i];
                System.out.println(ans[i]);


                //Null pointer execption
                String name[]=null;
                if(name.equals("Chennai")){
                    System.out.println(name);
                }
            }
        }
        catch(Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        finally {
            System.out.println("always execute");
        }

    }
}
