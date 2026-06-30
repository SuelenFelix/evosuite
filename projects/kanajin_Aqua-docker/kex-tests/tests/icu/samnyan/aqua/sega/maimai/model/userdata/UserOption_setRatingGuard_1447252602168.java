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

public class UserOption_setRatingGuard_1447252602168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83297;
     Object term83341;

    public UserOption_setRatingGuard_1447252602168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83297 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term83297, term83297.getClass(), "id", 0L);
        setField(term83297, term83297.getClass(), "user", null);
        setIntField(term83297, term83297.getClass(), "soudEffect", 0);
        setIntField(term83297, term83297.getClass(), "mirrorMode", 0);
        setIntField(term83297, term83297.getClass(), "guideSpeed", 0);
        setIntField(term83297, term83297.getClass(), "bgInfo", 0);
        setIntField(term83297, term83297.getClass(), "brightness", 0);
        setIntField(term83297, term83297.getClass(), "isStarRot", 0);
        setIntField(term83297, term83297.getClass(), "breakSe", 0);
        setIntField(term83297, term83297.getClass(), "slideSe", 0);
        setIntField(term83297, term83297.getClass(), "hardJudge", 0);
        setIntField(term83297, term83297.getClass(), "isTagJump", 0);
        setIntField(term83297, term83297.getClass(), "breakSeVol", 0);
        setIntField(term83297, term83297.getClass(), "slideSeVol", 0);
        setIntField(term83297, term83297.getClass(), "isUpperDisp", 0);
        setIntField(term83297, term83297.getClass(), "trackSkip", 0);
        setIntField(term83297, term83297.getClass(), "optionMode", 0);
        setIntField(term83297, term83297.getClass(), "simpleOptionParam", 0);
        setIntField(term83297, term83297.getClass(), "adjustTiming", 0);
        setIntField(term83297, term83297.getClass(), "dispTiming", 0);
        setIntField(term83297, term83297.getClass(), "timingPos", 0);
        setIntField(term83297, term83297.getClass(), "ansVol", 0);
        setIntField(term83297, term83297.getClass(), "noteVol", 0);
        setIntField(term83297, term83297.getClass(), "dmgVol", 0);
        setIntField(term83297, term83297.getClass(), "appealFlame", 0);
        setIntField(term83297, term83297.getClass(), "isFeverDisp", 0);
        setIntField(term83297, term83297.getClass(), "dispJudge", 0);
        setIntField(term83297, term83297.getClass(), "judgePos", 0);
        setIntField(term83297, term83297.getClass(), "ratingGuard", 0);
        setIntField(term83297, term83297.getClass(), "selectChara", 0);
        setIntField(term83297, term83297.getClass(), "sortType", 0);
        setIntField(term83297, term83297.getClass(), "filterGenre", 0);
        setIntField(term83297, term83297.getClass(), "filterLevel", 0);
        setIntField(term83297, term83297.getClass(), "filterRank", 0);
        setIntField(term83297, term83297.getClass(), "filterVersion", 0);
        setIntField(term83297, term83297.getClass(), "filterRec", 0);
        setIntField(term83297, term83297.getClass(), "filterFullCombo", 0);
        setIntField(term83297, term83297.getClass(), "filterAllPerfect", 0);
        setIntField(term83297, term83297.getClass(), "filterDifficulty", 0);
        setIntField(term83297, term83297.getClass(), "filterFullSync", 0);
        setIntField(term83297, term83297.getClass(), "filterReMaster", 0);
        setIntField(term83297, term83297.getClass(), "filterMaxFever", 0);
        setIntField(term83297, term83297.getClass(), "finalSelectId", 0);
        setIntField(term83297, term83297.getClass(), "finalSelectCategory", 0);
        term83341 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term83341;
        callMethod(klass, "setRatingGuard", argTypes, term83297, args);
    }

};


