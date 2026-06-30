package icu.samnyan.aqua.sega.maimai.model.userdata;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserOption_setFilterDifficulty_344891575178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83757;
     Object term83801;

    public UserOption_setFilterDifficulty_344891575178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83757 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term83757, term83757.getClass(), "id", 0L);
        setField(term83757, term83757.getClass(), "user", null);
        setIntField(term83757, term83757.getClass(), "soudEffect", 0);
        setIntField(term83757, term83757.getClass(), "mirrorMode", 0);
        setIntField(term83757, term83757.getClass(), "guideSpeed", 0);
        setIntField(term83757, term83757.getClass(), "bgInfo", 0);
        setIntField(term83757, term83757.getClass(), "brightness", 0);
        setIntField(term83757, term83757.getClass(), "isStarRot", 0);
        setIntField(term83757, term83757.getClass(), "breakSe", 0);
        setIntField(term83757, term83757.getClass(), "slideSe", 0);
        setIntField(term83757, term83757.getClass(), "hardJudge", 0);
        setIntField(term83757, term83757.getClass(), "isTagJump", 0);
        setIntField(term83757, term83757.getClass(), "breakSeVol", 0);
        setIntField(term83757, term83757.getClass(), "slideSeVol", 0);
        setIntField(term83757, term83757.getClass(), "isUpperDisp", 0);
        setIntField(term83757, term83757.getClass(), "trackSkip", 0);
        setIntField(term83757, term83757.getClass(), "optionMode", 0);
        setIntField(term83757, term83757.getClass(), "simpleOptionParam", 0);
        setIntField(term83757, term83757.getClass(), "adjustTiming", 0);
        setIntField(term83757, term83757.getClass(), "dispTiming", 0);
        setIntField(term83757, term83757.getClass(), "timingPos", 0);
        setIntField(term83757, term83757.getClass(), "ansVol", 0);
        setIntField(term83757, term83757.getClass(), "noteVol", 0);
        setIntField(term83757, term83757.getClass(), "dmgVol", 0);
        setIntField(term83757, term83757.getClass(), "appealFlame", 0);
        setIntField(term83757, term83757.getClass(), "isFeverDisp", 0);
        setIntField(term83757, term83757.getClass(), "dispJudge", 0);
        setIntField(term83757, term83757.getClass(), "judgePos", 0);
        setIntField(term83757, term83757.getClass(), "ratingGuard", 0);
        setIntField(term83757, term83757.getClass(), "selectChara", 0);
        setIntField(term83757, term83757.getClass(), "sortType", 0);
        setIntField(term83757, term83757.getClass(), "filterGenre", 0);
        setIntField(term83757, term83757.getClass(), "filterLevel", 0);
        setIntField(term83757, term83757.getClass(), "filterRank", 0);
        setIntField(term83757, term83757.getClass(), "filterVersion", 0);
        setIntField(term83757, term83757.getClass(), "filterRec", 0);
        setIntField(term83757, term83757.getClass(), "filterFullCombo", 0);
        setIntField(term83757, term83757.getClass(), "filterAllPerfect", 0);
        setIntField(term83757, term83757.getClass(), "filterDifficulty", 0);
        setIntField(term83757, term83757.getClass(), "filterFullSync", 0);
        setIntField(term83757, term83757.getClass(), "filterReMaster", 0);
        setIntField(term83757, term83757.getClass(), "filterMaxFever", 0);
        setIntField(term83757, term83757.getClass(), "finalSelectId", 0);
        setIntField(term83757, term83757.getClass(), "finalSelectCategory", 0);
        term83801 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term83801;
        callMethod(klass, "setFilterDifficulty", argTypes, term83757, args);
    }

};


