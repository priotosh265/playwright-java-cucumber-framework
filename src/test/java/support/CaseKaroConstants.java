package support;

public class CaseKaroConstants {
    public static String ButtonMobileCover = "//a[normalize-space()='Choose my phone model →']";
    public static String Search = "//input[@id='search_main']";
    public static String BrandNameLocator = "//h1[normalize-space()='%s']";
    public static String ModelNameLocator = "//div[@class='brand-name-main' and text()='%s']";
    public static String FirstProductCard = "(//li[contains(@class, 'product-card')])[1]";
    public static String ChooseOption = "(//a[contains(@class, 'overlay-buy_button') and normalize-space()='Options'])[1]";
    public static String MaterialsLocator = "//li//span[normalize-space(text())='%s']";
    public static String AddToCart = "//button[contains(normalize-space(), 'Add to cart')]";
    public static String CloseCart = "(//a[contains(@class, 'm6pn-close')])[1]";
    public static String Cart = "(//a[@href='/cart'])[1]";


    public static String MaterialInCart = "//div[@class='product-option']//dd[normalize-space()='%s']";
    public static String CartItemCount = "//tr[@class='cart-item']";
    public static String Material = "//div[@class='product-option'][dt='Material:']/dd";
    public static String Price = "//tr[@class='cart-item']//span[contains(@class,'price')]";
    public static String Link = "//tr[@class='cart-item']//a[contains(@class,'cart-item__name')]";

}
