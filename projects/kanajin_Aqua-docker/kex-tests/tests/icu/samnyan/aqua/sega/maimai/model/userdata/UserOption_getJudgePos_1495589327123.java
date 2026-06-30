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

public class UserOption_getJudgePos_1495589327123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81263;

    public UserOption_getJudgePos_1495589327123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81263 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term81263, term81263.getClass(), "id", 0L);
        setField(term81263, term81263.getClass(), "user", null);
        setIntField(term81263, term81263.getClass(), "soudEffect", 0);
        setIntField(term81263, term81263.getClass(), "mirrorMode", 0);
        setIntField(term81263, term81263.getClass(), "guideSpeed", 0);
        setIntField(term81263, term81263.getClass(), "bgInfo", 0);
        setIntField(term81263, term81263.getClass(), "brightness", 0);
        setIntField(term81263, term81263.getClass(), "isStarRot", 0);
        setIntField(term81263, term81263.getClass(), "breakSe", 0);
        setIntField(term81263, term81263.getClass(), "slideSe", 0);
        setIntField(term81263, term81263.getClass(), "hardJudge", 0);
        setIntField(term81263, term81263.getClass(), "isTagJump", 0);
        setIntField(term81263, term81263.getClass(), "breakSeVol", 0);
        setIntField(term81263, term81263.getClass(), "slideSeVol", 0);
        setIntField(term81263, term81263.getClass(), "isUpperDisp", 0);
        setIntField(term81263, term81263.getClass(), "trackSkip", 0);
        setIntField(term81263, term81263.getClass(), "optionMode", 0);
        setIntField(term81263, term81263.getClass(), "simpleOptionParam", 0);
        setIntField(term81263, term81263.getClass(), "adjustTiming", 0);
        setIntField(term81263, term81263.getClass(), "dispTiming", 0);
        setIntField(term81263, term81263.getClass(), "timingPos", 0);
        setIntField(term81263, term81263.getClass(), "ansVol", 0);
        setIntField(term81263, term81263.getClass(), "noteVol", 0);
        setIntField(term81263, term81263.getClass(), "dmgVol", 0);
        setIntField(term81263, term81263.getClass(), "appealFlame", 0);
        setIntField(term81263, term81263.getClass(), "isFeverDisp", 0);
        setIntField(term81263, term81263.getClass(), "dispJudge", 0);
        setIntField(term81263, term81263.getClass(), "judgePos", 0);
        setIntField(term81263, term81263.getClass(), "ratingGuard", 0);
        setIntField(term81263, term81263.getClass(), "selectChara", 0);
        setIntField(term81263, term81263.getClass(), "sortType", 0);
        setIntField(term81263, term81263.getClass(), "filterGenre", 0);
        setIntField(term81263, term81263.getClass(), "filterLevel", 0);
        setIntField(term81263, term81263.getClass(), "filterRank", 0);
        setIntField(term81263, term81263.getClass(), "filterVersion", 0);
        setIntField(term81263, term81263.getClass(), "filterRec", 0);
        setIntField(term81263, term81263.getClass(), "filterFullCombo", 0);
        setIntField(term81263, term81263.getClass(), "filterAllPerfect", 0);
        setIntField(term81263, term81263.getClass(), "filterDifficulty", 0);
        setIntField(term81263, term81263.getClass(), "filterFullSync", 0);
        setIntField(term81263, term81263.getClass(), "filterReMaster", 0);
        setIntField(term81263, term81263.getClass(), "filterMaxFever", 0);
        setIntField(term81263, term81263.getClass(), "finalSelectId", 0);
        setIntField(term81263, term81263.getClass(), "finalSelectCategory", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgePos", argTypes, term81263, args);
    }

};


