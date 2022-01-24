class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake == true)
            return false;
        else
            return true;

    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake || archerIsAwake || prisonerIsAwake)
            return true;
        else
            return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!archerIsAwake && prisonerIsAwake)
            return true;
        else
            return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean result = false;
        if (petDogIsPresent) {
            if (!archerIsAwake)
                result = true;
        } else {
            if (!knightIsAwake && !archerIsAwake) {
                if (prisonerIsAwake)
                    result = true;
            }
        }
        return result;
    }
}
