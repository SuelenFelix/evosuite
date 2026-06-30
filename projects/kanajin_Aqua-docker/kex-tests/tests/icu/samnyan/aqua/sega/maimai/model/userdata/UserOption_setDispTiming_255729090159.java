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

public class UserOption_setDispTiming_255729090159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82883;
     Object term82927;

    public UserOption_setDispTiming_255729090159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82883 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term82883, term82883.getClass(), "id", 0L);
        setField(term82883, term82883.getClass(), "user", null);
        setIntField(term82883, term82883.getClass(), "soudEffect", 0);
        setIntField(term82883, term82883.getClass(), "mirrorMode", 0);
        setIntField(term82883, term82883.getClass(), "guideSpeed", 0);
        setIntField(term82883, term82883.getClass(), "bgInfo", 0);
        setIntField(term82883, term82883.getClass(), "brightness", 0);
        setIntField(term82883, term82883.getClass(), "isStarRot", 0);
        setIntField(term82883, term82883.getClass(), "breakSe", 0);
        setIntField(term82883, term82883.getClass(), "slideSe", 0);
        setIntField(term82883, term82883.getClass(), "hardJudge", 0);
        setIntField(term82883, term82883.getClass(), "isTagJump", 0);
        setIntField(term82883, term82883.getClass(), "breakSeVol", 0);
        setIntField(term82883, term82883.getClass(), "slideSeVol", 0);
        setIntField(term82883, term82883.getClass(), "isUpperDisp", 0);
        setIntField(term82883, term82883.getClass(), "trackSkip", 0);
        setIntField(term82883, term82883.getClass(), "optionMode", 0);
        setIntField(term82883, term82883.getClass(), "simpleOptionParam", 0);
        setIntField(term82883, term82883.getClass(), "adjustTiming", 0);
        setIntField(term82883, term82883.getClass(), "dispTiming", 0);
        setIntField(term82883, term82883.getClass(), "timingPos", 0);
        setIntField(term82883, term82883.getClass(), "ansVol", 0);
        setIntField(term82883, term82883.getClass(), "noteVol", 0);
        setIntField(term82883, term82883.getClass(), "dmgVol", 0);
        setIntField(term82883, term82883.getClass(), "appealFlame", 0);
        setIntField(term82883, term82883.getClass(), "isFeverDisp", 0);
        setIntField(term82883, term82883.getClass(), "dispJudge", 0);
        setIntField(term82883, term82883.getClass(), "judgePos", 0);
        setIntField(term82883, term82883.getClass(), "ratingGuard", 0);
        setIntField(term82883, term82883.getClass(), "selectChara", 0);
        setIntField(term82883, term82883.getClass(), "sortType", 0);
        setIntField(term82883, term82883.getClass(), "filterGenre", 0);
        setIntField(term82883, term82883.getClass(), "filterLevel", 0);
        setIntField(term82883, term82883.getClass(), "filterRank", 0);
        setIntField(term82883, term82883.getClass(), "filterVersion", 0);
        setIntField(term82883, term82883.getClass(), "filterRec", 0);
        setIntField(term82883, term82883.getClass(), "filterFullCombo", 0);
        setIntField(term82883, term82883.getClass(), "filterAllPerfect", 0);
        setIntField(term82883, term82883.getClass(), "filterDifficulty", 0);
        setIntField(term82883, term82883.getClass(), "filterFullSync", 0);
        setIntField(term82883, term82883.getClass(), "filterReMaster", 0);
        setIntField(term82883, term82883.getClass(), "filterMaxFever", 0);
        setIntField(term82883, term82883.getClass(), "finalSelectId", 0);
        setIntField(term82883, term82883.getClass(), "finalSelectCategory", 0);
        term82927 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82927;
        callMethod(klass, "setDispTiming", argTypes, term82883, args);
    }

};


