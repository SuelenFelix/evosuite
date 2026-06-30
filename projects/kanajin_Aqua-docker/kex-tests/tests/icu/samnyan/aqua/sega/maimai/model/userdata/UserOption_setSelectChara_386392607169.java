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

public class UserOption_setSelectChara_386392607169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83343;
     Object term83387;

    public UserOption_setSelectChara_386392607169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83343 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term83343, term83343.getClass(), "id", 0L);
        setField(term83343, term83343.getClass(), "user", null);
        setIntField(term83343, term83343.getClass(), "soudEffect", 0);
        setIntField(term83343, term83343.getClass(), "mirrorMode", 0);
        setIntField(term83343, term83343.getClass(), "guideSpeed", 0);
        setIntField(term83343, term83343.getClass(), "bgInfo", 0);
        setIntField(term83343, term83343.getClass(), "brightness", 0);
        setIntField(term83343, term83343.getClass(), "isStarRot", 0);
        setIntField(term83343, term83343.getClass(), "breakSe", 0);
        setIntField(term83343, term83343.getClass(), "slideSe", 0);
        setIntField(term83343, term83343.getClass(), "hardJudge", 0);
        setIntField(term83343, term83343.getClass(), "isTagJump", 0);
        setIntField(term83343, term83343.getClass(), "breakSeVol", 0);
        setIntField(term83343, term83343.getClass(), "slideSeVol", 0);
        setIntField(term83343, term83343.getClass(), "isUpperDisp", 0);
        setIntField(term83343, term83343.getClass(), "trackSkip", 0);
        setIntField(term83343, term83343.getClass(), "optionMode", 0);
        setIntField(term83343, term83343.getClass(), "simpleOptionParam", 0);
        setIntField(term83343, term83343.getClass(), "adjustTiming", 0);
        setIntField(term83343, term83343.getClass(), "dispTiming", 0);
        setIntField(term83343, term83343.getClass(), "timingPos", 0);
        setIntField(term83343, term83343.getClass(), "ansVol", 0);
        setIntField(term83343, term83343.getClass(), "noteVol", 0);
        setIntField(term83343, term83343.getClass(), "dmgVol", 0);
        setIntField(term83343, term83343.getClass(), "appealFlame", 0);
        setIntField(term83343, term83343.getClass(), "isFeverDisp", 0);
        setIntField(term83343, term83343.getClass(), "dispJudge", 0);
        setIntField(term83343, term83343.getClass(), "judgePos", 0);
        setIntField(term83343, term83343.getClass(), "ratingGuard", 0);
        setIntField(term83343, term83343.getClass(), "selectChara", 0);
        setIntField(term83343, term83343.getClass(), "sortType", 0);
        setIntField(term83343, term83343.getClass(), "filterGenre", 0);
        setIntField(term83343, term83343.getClass(), "filterLevel", 0);
        setIntField(term83343, term83343.getClass(), "filterRank", 0);
        setIntField(term83343, term83343.getClass(), "filterVersion", 0);
        setIntField(term83343, term83343.getClass(), "filterRec", 0);
        setIntField(term83343, term83343.getClass(), "filterFullCombo", 0);
        setIntField(term83343, term83343.getClass(), "filterAllPerfect", 0);
        setIntField(term83343, term83343.getClass(), "filterDifficulty", 0);
        setIntField(term83343, term83343.getClass(), "filterFullSync", 0);
        setIntField(term83343, term83343.getClass(), "filterReMaster", 0);
        setIntField(term83343, term83343.getClass(), "filterMaxFever", 0);
        setIntField(term83343, term83343.getClass(), "finalSelectId", 0);
        setIntField(term83343, term83343.getClass(), "finalSelectCategory", 0);
        term83387 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term83387;
        callMethod(klass, "setSelectChara", argTypes, term83343, args);
    }

};


