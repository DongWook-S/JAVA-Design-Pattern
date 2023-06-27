package Part14_Chain_of_Responsibility.Class;

/*
 *  지정한 번호의 문제에 한해 해결하는 클래스
 */
public class SpecialSupport extends Support {
    private int number; // 이 번호만 해결할 수 있다.

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        }
        else {
            return false;
        }
    }
}
