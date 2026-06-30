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

public class UserOption_setSoudEffect_877478034142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82101;
     Object term82145;

    public UserOption_setSoudEffect_877478034142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82101 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term82101, term82101.getClass(), "id", 0L);
        setField(term82101, term82101.getClass(), "user", null);
        setIntField(term82101, term82101.getClass(), "soudEffect", 0);
        setIntField(term82101, term82101.getClass(), "mirrorMode", 0);
        setIntField(term82101, term82101.getClass(), "guideSpeed", 0);
        setIntField(term82101, term82101.getClass(), "bgInfo", 0);
        setIntField(term82101, term82101.getClass(), "brightness", 0);
        setIntField(term82101, term82101.getClass(), "isStarRot", 0);
        setIntField(term82101, term82101.getClass(), "breakSe", 0);
        setIntField(term82101, term82101.getClass(), "slideSe", 0);
        setIntField(term82101, term82101.getClass(), "hardJudge", 0);
        setIntField(term82101, term82101.getClass(), "isTagJump", 0);
        setIntField(term82101, term82101.getClass(), "breakSeVol", 0);
        setIntField(term82101, term82101.getClass(), "slideSeVol", 0);
        setIntField(term82101, term82101.getClass(), "isUpperDisp", 0);
        setIntField(term82101, term82101.getClass(), "trackSkip", 0);
        setIntField(term82101, term82101.getClass(), "optionMode", 0);
        setIntField(term82101, term82101.getClass(), "simpleOptionParam", 0);
        setIntField(term82101, term82101.getClass(), "adjustTiming", 0);
        setIntField(term82101, term82101.getClass(), "dispTiming", 0);
        setIntField(term82101, term82101.getClass(), "timingPos", 0);
        setIntField(term82101, term82101.getClass(), "ansVol", 0);
        setIntField(term82101, term82101.getClass(), "noteVol", 0);
        setIntField(term82101, term82101.getClass(), "dmgVol", 0);
        setIntField(term82101, term82101.getClass(), "appealFlame", 0);
        setIntField(term82101, term82101.getClass(), "isFeverDisp", 0);
        setIntField(term82101, term82101.getClass(), "dispJudge", 0);
        setIntField(term82101, term82101.getClass(), "judgePos", 0);
        setIntField(term82101, term82101.getClass(), "ratingGuard", 0);
        setIntField(term82101, term82101.getClass(), "selectChara", 0);
        setIntField(term82101, term82101.getClass(), "sortType", 0);
        setIntField(term82101, term82101.getClass(), "filterGenre", 0);
        setIntField(term82101, term82101.getClass(), "filterLevel", 0);
        setIntField(term82101, term82101.getClass(), "filterRank", 0);
        setIntField(term82101, term82101.getClass(), "filterVersion", 0);
        setIntField(term82101, term82101.getClass(), "filterRec", 0);
        setIntField(term82101, term82101.getClass(), "filterFullCombo", 0);
        setIntField(term82101, term82101.getClass(), "filterAllPerfect", 0);
        setIntField(term82101, term82101.getClass(), "filterDifficulty", 0);
        setIntField(term82101, term82101.getClass(), "filterFullSync", 0);
        setIntField(term82101, term82101.getClass(), "filterReMaster", 0);
        setIntField(term82101, term82101.getClass(), "filterMaxFever", 0);
        setIntField(term82101, term82101.getClass(), "finalSelectId", 0);
        setIntField(term82101, term82101.getClass(), "finalSelectCategory", 0);
        term82145 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82145;
        callMethod(klass, "setSoudEffect", argTypes, term82101, args);
    }

};


