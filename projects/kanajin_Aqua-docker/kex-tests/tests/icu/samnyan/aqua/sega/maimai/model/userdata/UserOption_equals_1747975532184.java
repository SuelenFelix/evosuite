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

public class UserOption_equals_1747975532184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84033;

    public UserOption_equals_1747975532184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84033 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term84033, term84033.getClass(), "id", 0L);
        setField(term84033, term84033.getClass(), "user", null);
        setIntField(term84033, term84033.getClass(), "soudEffect", 0);
        setIntField(term84033, term84033.getClass(), "mirrorMode", 0);
        setIntField(term84033, term84033.getClass(), "guideSpeed", 0);
        setIntField(term84033, term84033.getClass(), "bgInfo", 0);
        setIntField(term84033, term84033.getClass(), "brightness", 0);
        setIntField(term84033, term84033.getClass(), "isStarRot", 0);
        setIntField(term84033, term84033.getClass(), "breakSe", 0);
        setIntField(term84033, term84033.getClass(), "slideSe", 0);
        setIntField(term84033, term84033.getClass(), "hardJudge", 0);
        setIntField(term84033, term84033.getClass(), "isTagJump", 0);
        setIntField(term84033, term84033.getClass(), "breakSeVol", 0);
        setIntField(term84033, term84033.getClass(), "slideSeVol", 0);
        setIntField(term84033, term84033.getClass(), "isUpperDisp", 0);
        setIntField(term84033, term84033.getClass(), "trackSkip", 0);
        setIntField(term84033, term84033.getClass(), "optionMode", 0);
        setIntField(term84033, term84033.getClass(), "simpleOptionParam", 0);
        setIntField(term84033, term84033.getClass(), "adjustTiming", 0);
        setIntField(term84033, term84033.getClass(), "dispTiming", 0);
        setIntField(term84033, term84033.getClass(), "timingPos", 0);
        setIntField(term84033, term84033.getClass(), "ansVol", 0);
        setIntField(term84033, term84033.getClass(), "noteVol", 0);
        setIntField(term84033, term84033.getClass(), "dmgVol", 0);
        setIntField(term84033, term84033.getClass(), "appealFlame", 0);
        setIntField(term84033, term84033.getClass(), "isFeverDisp", 0);
        setIntField(term84033, term84033.getClass(), "dispJudge", 0);
        setIntField(term84033, term84033.getClass(), "judgePos", 0);
        setIntField(term84033, term84033.getClass(), "ratingGuard", 0);
        setIntField(term84033, term84033.getClass(), "selectChara", 0);
        setIntField(term84033, term84033.getClass(), "sortType", 0);
        setIntField(term84033, term84033.getClass(), "filterGenre", 0);
        setIntField(term84033, term84033.getClass(), "filterLevel", 0);
        setIntField(term84033, term84033.getClass(), "filterRank", 0);
        setIntField(term84033, term84033.getClass(), "filterVersion", 0);
        setIntField(term84033, term84033.getClass(), "filterRec", 0);
        setIntField(term84033, term84033.getClass(), "filterFullCombo", 0);
        setIntField(term84033, term84033.getClass(), "filterAllPerfect", 0);
        setIntField(term84033, term84033.getClass(), "filterDifficulty", 0);
        setIntField(term84033, term84033.getClass(), "filterFullSync", 0);
        setIntField(term84033, term84033.getClass(), "filterReMaster", 0);
        setIntField(term84033, term84033.getClass(), "filterMaxFever", 0);
        setIntField(term84033, term84033.getClass(), "finalSelectId", 0);
        setIntField(term84033, term84033.getClass(), "finalSelectCategory", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term84033, args);
    }

};


