package jp.ac.uryukyu.ie.e165729;

/**
 * Created by e165729 on 2016/12/05.
 */
public class Main {
    public static void main(String[] args){
        String str = "3．14";

        try {
            System.out.println("文字列の長さ:"+str.length());
            Double.parseDouble(str);
        }
        catch (NullPointerException e) {
            System.out.println("エラー:" + e.toString() + "が発生しました。プログラムを終了します。");
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("エラー:" + e.toString() +"が発生しました。プログラムを終了します。" );
            e.printStackTrace();
        }
    }

}
