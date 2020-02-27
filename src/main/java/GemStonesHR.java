
public class GemStonesHR {
    static int gemstones(String[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr[0].length(); i++) {
            char c = arr[0].charAt(i);
            String s = Character.toString(c);
            if (result.toString().contains(s))
                continue;
            boolean isAvail = true;
            for (int k = 1; k < arr.length; k++) {

                if (!arr[k].contains(s)) {
                    isAvail = false;
                    break;
                }
            }
            if (isAvail && !result.toString().contains(s))
                result.append(s);
        }

        return result.length();

    }

    public static void main(String[] args) {
        int v = gemstones(new String[]{"xhsbaqwbokcaqbkhrzddydwirmldcr",
                "kwkbkhlwmlpuomfaenahhnnpgqpkcxlspbomrweoqq",
                "rtdckeukfoppbsiccflxqcoxrhwnxpwyjsrvjngqmbgqfwahhkzcbifrvpamffoxcetdochazcqsqhazndwdk",
                "cakdnrducighyuuemxhqmujauwxabextkdamxybkoyexmdmlyvnmlrwwrt",
                "czuzxlzrmuaa",
                "gquymxuabmymtnljadbqxjsipnixbyhwhaoaciinwdhppbpyxswcveddpojlopqsuqsvjhpobpdefuj",
                "abtwcqoib",
                "vqpgcuwvxdlaquaiwydejgpwvpwdjeybgbtienzijzeah",
                "shrcvpgwzdkfcvpmjeuslonwerklxysafwgeurdnshmzunpaxmgfiwsehowfyjboeahpuqlatcmooenlicnrkhcbkl"});
        System.out.println(v);

    }
}
