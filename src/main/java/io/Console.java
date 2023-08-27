package io;

public class Console {
    public static void printWelcome(){
        System.out.println("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************\n");
    }

    public static void mainMenu() {
        System.out.println("" +
                "****************************************************\n" +
                "***           Please make a selection            ***\n" +
                "***        1  Show All Products                  ***\n" +
                "***        2  Show Certain Product               ***\n" +
                "***        3  Add Product                        ***\n" +
                "***        4  Update Product                     ***\n" +
                "***        5  Delete Product                     ***\n" +
                "***        6  Exit                               ***\n" +
                "***                                              ***\n" +
                "****************************************************\n");
    }

    public static void mainMenuLogic(int selection) {

        switch (selection){
            case 1:
                showAllProducts();
                break;
            case 2:
                showCertainProduct();
                break;
            case 3:
                addProduct();
                break;
            case 4:
                updateProduct();
                break;
            case 5:
                deleteProduct();
                break;
            case 6:
                exitApp();
        }

        mainMenu();

    }

    public static void showAllProducts() {}

    public static void showCertainProduct() {}

    public static void addProduct() {}

    public static void updateProduct() {}

    public static void deleteProduct() {}

    public static void exitApp(){}


}
