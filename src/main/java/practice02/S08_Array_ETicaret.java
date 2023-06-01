package practice02;

public class S08_Array_ETicaret {
    public static void main(String[] args) {
        /*
        Bir e-ticaret uygulamasında, bir kullanıcının sepetindeki ürünleri bir array'de tutuyorsunuz.
        Kullanıcının sepetinde belirli bir ürünün olup olmadığını kontrol edin.
        {"Telefon", "Bilgisayar", "Klavye", "Mouse"}
    */
        String product [] =  {"Telefon", "Bilgisayar", "Klavye", "Mouse"};
        String searchProduct = "Klavye";

        boolean isHasProduct = false;

        for(String w: product){
            if(w.equals(searchProduct)){
                isHasProduct = true;
                break;
            }
        }
        if (isHasProduct){
            System.out.println(searchProduct +  " listede var...");
        } else {
            System.out.println(searchProduct +  " listede yoktur...");
        }
    }
}
