public class AdapterImpl implements Adapter {
    @Override
    public Float twiceOf(Float num) {
        return Math.doubled(num.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float num) {
        System.out.println("halfOf");
        return (float) Math.half(num);
    }


}
