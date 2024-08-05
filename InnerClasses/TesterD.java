package InnerClasses;


class Category {
    Category() {
        System.out.print("category_");
    }
    }
    class SubCategory extends Category {
    SubCategory() {
        System.out.print("SubCategory_");
    }
    }
    class SubSubCategory extends SubCategory {
    SubSubCategory() {
        System.out.print("SubSubCategory_");
    }
    }
    public class TesterD {
    public static void main(String[] args) { 
        new SubSubCategory();
    }
    }
    // Options:
    // SubSubCategory_SubCategory_Category_
    // SubSubCategory_
    // Category SubCategory_SubSubCategory_ 
    //Compiler Error