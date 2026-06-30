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

public class UserOption_getDispTiming_658650688115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80911;

    public UserOption_getDispTiming_658650688115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80911 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term80911, term80911.getClass(), "id", 0L);
        setField(term80911, term80911.getClass(), "user", null);
        setIntField(term80911, term80911.getClass(), "soudEffect", 0);
        setIntField(term80911, term80911.getClass(), "mirrorMode", 0);
        setIntField(term80911, term80911.getClass(), "guideSpeed", 0);
        setIntField(term80911, term80911.getClass(), "bgInfo", 0);
        setIntField(term80911, term80911.getClass(), "brightness", 0);
        setIntField(term80911, term80911.getClass(), "isStarRot", 0);
        setIntField(term80911, term80911.getClass(), "breakSe", 0);
        setIntField(term80911, term80911.getClass(), "slideSe", 0);
        setIntField(term80911, term80911.getClass(), "hardJudge", 0);
        setIntField(term80911, term80911.getClass(), "isTagJump", 0);
        setIntField(term80911, term80911.getClass(), "breakSeVol", 0);
        setIntField(term80911, term80911.getClass(), "slideSeVol", 0);
        setIntField(term80911, term80911.getClass(), "isUpperDisp", 0);
        setIntField(term80911, term80911.getClass(), "trackSkip", 0);
        setIntField(term80911, term80911.getClass(), "optionMode", 0);
        setIntField(term80911, term80911.getClass(), "simpleOptionParam", 0);
        setIntField(term80911, term80911.getClass(), "adjustTiming", 0);
        setIntField(term80911, term80911.getClass(), "dispTiming", 0);
        setIntField(term80911, term80911.getClass(), "timingPos", 0);
        setIntField(term80911, term80911.getClass(), "ansVol", 0);
        setIntField(term80911, term80911.getClass(), "noteVol", 0);
        setIntField(term80911, term80911.getClass(), "dmgVol", 0);
        setIntField(term80911, term80911.getClass(), "appealFlame", 0);
        setIntField(term80911, term80911.getClass(), "isFeverDisp", 0);
        setIntField(term80911, term80911.getClass(), "dispJudge", 0);
        setIntField(term80911, term80911.getClass(), "judgePos", 0);
        setIntField(term80911, term80911.getClass(), "ratingGuard", 0);
        setIntField(term80911, term80911.getClass(), "selectChara", 0);
        setIntField(term80911, term80911.getClass(), "sortType", 0);
        setIntField(term80911, term80911.getClass(), "filterGenre", 0);
        setIntField(term80911, term80911.getClass(), "filterLevel", 0);
        setIntField(term80911, term80911.getClass(), "filterRank", 0);
        setIntField(term80911, term80911.getClass(), "filterVersion", 0);
        setIntField(term80911, term80911.getClass(), "filterRec", 0);
        setIntField(term80911, term80911.getClass(), "filterFullCombo", 0);
        setIntField(term80911, term80911.getClass(), "filterAllPerfect", 0);
        setIntField(term80911, term80911.getClass(), "filterDifficulty", 0);
        setIntField(term80911, term80911.getClass(), "filterFullSync", 0);
        setIntField(term80911, term80911.getClass(), "filterReMaster", 0);
        setIntField(term80911, term80911.getClass(), "filterMaxFever", 0);
        setIntField(term80911, term80911.getClass(), "finalSelectId", 0);
        setIntField(term80911, term80911.getClass(), "finalSelectCategory", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispTiming", argTypes, term80911, args);
    }

};


