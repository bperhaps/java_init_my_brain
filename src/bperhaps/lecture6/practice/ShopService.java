package bperhaps.lecture6.practice;

public class ShopService {
    static ShopService shopService = new ShopService();

    private ShopService() {}

    static public ShopService getInstance() {
        return shopService;
    }
}
