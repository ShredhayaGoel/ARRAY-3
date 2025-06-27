public boolean linearIn(int[] outer, int[] inner) {
    for (int i = 0; i < inner.length; i++) {
        boolean found = false;

        for (int j = 0; j < outer.length; j++) {
            if (inner[i] == outer[j]) {
                found = true;
                break;             }
        }

        if (!found) {
            return false;
            }
    }
    return true;
}
