package Chapter1.code1_2;

public class Account {
  String accountNo;  //口座番号(先頭に空白が入ることもある)

  public boolean equals (Object o) {
    if (o == this) return true;  //①自分自身が引数として渡されたら、無条件でtrueを返す。
    if (o == null) return false;  //②nullが引数として渡されたら、無条件でfalseを返す。
    if (!(o instanceof Account)) return false;  // ③型が異なるならば、falseを返す
    Account r = (Account) o;                    //(同じなら④に備え、比較できるよう適切にキャストする)
    if (!this.accountNo.trim().equals(r.accountNo.trim())) {  //先頭と末尾の空白を取り除いた口座番号を文字列比較
      return false;  //④2つのインスタンスが持つしかるべきフィールド同士を比較して等価か判定し、trueかfalse返す
    }
    return true;
  }
}
