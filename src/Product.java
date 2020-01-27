public class Product {
    String sql;

    public Product showProduct(int num){
        sql = "select * from Product";
        return null;
    }
    public int readCnt(int num){
        return 0;
    }
    public void buyProduct(int num){}
    public void cartProduct(int num){}
    public Product sortProduct(int num, int sort){
        return null;
    }
    //sort는 조회순, 인기순, 구매순 3중 1
}
