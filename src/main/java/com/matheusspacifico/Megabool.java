package com.matheusspacifico;

public enum Megabool {
    // for the true ones
    TRUE(Category.AFFIRMATIVE, 1),
    DOUBLE_TRUE(Category.AFFIRMATIVE, 1),
    BIG_IF_TRUE(Category.AFFIRMATIVE, 1),
    TRUE_ON_MY_COMPUTER(Category.AFFIRMATIVE, 1),
    TRUEISH(Category.AFFIRMATIVE, 1),
    TRUE_BUT_IRRELEVANT(Category.AFFIRMATIVE, 1),
    HARDCODED_TRUE(Category.AFFIRMATIVE, 1),
    MEGATRUE(Category.AFFIRMATIVE, 1),
    GASLIT_INTO_TRUE(Category.AFFIRMATIVE, 1),
    TRUE_ON_A_GOOD_DAY(Category.AFFIRMATIVE, 1),
    SOMETIMES_TRUE(Category.AFFIRMATIVE, 1),
    FACTS(Category.AFFIRMATIVE, 1),
    I_MEAN_IT_IS_TRUE(Category.AFFIRMATIVE, 1),
    KINDA_TRUE(Category.AFFIRMATIVE, 1),
    PROBABLY_TRUE_I_COULD_BE_WRONG_THO(Category.AFFIRMATIVE, 1),
    TRUE_IN_BRAZIL(Category.AFFIRMATIVE, 1),

    // for the false ones
    FALSE(Category.NEGATIVE, 1),
    DOUBLE_FALSE(Category.NEGATIVE, 1),
    BIG_IF_FALSE(Category.NEGATIVE, 1),
    HELL_NAH(Category.NEGATIVE, 1),
    SKILL_ISSUE(Category.NEGATIVE, 1),
    FALSEISH(Category.NEGATIVE, 1),
    WISH_IT_WAS_TRUE(Category.NEGATIVE, 1),
    ITS_FALSE_LITTLE_BRO(Category.NEGATIVE, 1),
    BRO_THOUGHT_IT_WAS_TRUE(Category.NEGATIVE, 1),
    HARDCODED_FALSE(Category.NEGATIVE, 1),
    MEGAFALSE(Category.NEGATIVE, 1),
    GASLIT_INTO_FALSE(Category.NEGATIVE, 1),
    FALSE_ON_A_BAD_DAY(Category.NEGATIVE, 1),
    SOMETIMES_FALSE(Category.NEGATIVE, 1),
    I_MEAN_IT_IS_FALSE(Category.NEGATIVE, 1),
    KINDA_FALSE(Category.NEGATIVE, 1),
    PROBABLY_FALSE_I_COULD_BE_WRONG_THO(Category.NEGATIVE, 1),

    // for the uncertain ones
    MAYBE(Category.UNCERTAIN, 1),
    PERHAPS(Category.UNCERTAIN, 1),
    BIG_MAYBE(Category.UNCERTAIN, 1),
    IT_DEPENDS(Category.UNCERTAIN, 1),
    ITS_COMPLICATED(Category.UNCERTAIN, 1),
    IDK_BRO(Category.UNCERTAIN, 1),
    DONT_CARE(Category.UNCERTAIN, 1),

    // for the quantum state of mind ones
    BOTH(Category.CHAOTIC, 1),
    SCHRODINGER_BOOL(Category.CHAOTIC, 1),
    OSCILLATING(Category.CHAOTIC, 1),
    YOU_DONT_WANNA_KNOW_THIS_ONE_BUDDY(Category.CHAOTIC, 1),
    RAGEQUIT(Category.CHAOTIC, 1),
    JUST_PUSH_TO_MAIN_ALREADY(Category.CHAOTIC, 1);

    private final Category category;
    private final int power;

    Megabool(Category category, int power) {
        this.category = category;
        this.power = power;
    }

    public Megabool resolve() {
        return this;
    }

    public boolean isAffirmative() {
        return this.category == Category.AFFIRMATIVE;
    }

    public boolean isNegative() {
        return this.category == Category.NEGATIVE;
    }

    public boolean isUncertain() {
        return this.category == Category.UNCERTAIN;
    }

    public boolean isChaotic() {
        return this.category == Category.CHAOTIC;
    }

    public boolean isStrongerThan(Megabool other) {
        return this.power > other.power;
    }

    public int getPower() {
        return this.power;
    }

    public Category getCategory() {
        return this.category;
    }
}
