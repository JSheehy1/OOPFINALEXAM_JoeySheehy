package bankingapp2020;

public class CurrentAccount {
    String type;
    boolean chequeBook;

    public CurrentAccount() {this("Type not found",false);}

    public CurrentAccount(String type, boolean chequeBook){
        setType(type);
        setChequeBook(chequeBook);
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public boolean getChequeBook() {
        return chequeBook;
    }

    public void setChequeBook(boolean chequeBook) {
        this.chequeBook = chequeBook;
    }


}
