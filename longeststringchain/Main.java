package longeststringchain;

public class Main {
    public static void main(String[] args) {
        BackTrack bt = new BackTrack();
        Memoization mem = new Memoization();
        System.out.println(bt.longestStringChainLength(new String[]{"xb", "xbc", "cxbc", "pcxbc", "pcxbcf"}));
        System.out.println(mem.longestStringChainLength(new String[]{"xb", "xbc", "cxbc", "pcxbc", "pcxbcf"}));
    }
}
