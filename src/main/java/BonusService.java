public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 2 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
