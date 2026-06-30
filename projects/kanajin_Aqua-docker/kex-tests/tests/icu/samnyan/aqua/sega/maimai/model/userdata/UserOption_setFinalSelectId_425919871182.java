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

public class UserOption_setFinalSelectId_425919871182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83941;
     Object term83985;

    public UserOption_setFinalSelectId_425919871182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83941 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term83941, term83941.getClass(), "id", 0L);
        setField(term83941, term83941.getClass(), "user", null);
        setIntField(term83941, term83941.getClass(), "soudEffect", 0);
        setIntField(term83941, term83941.getClass(), "mirrorMode", 0);
        setIntField(term83941, term83941.getClass(), "guideSpeed", 0);
        setIntField(term83941, term83941.getClass(), "bgInfo", 0);
        setIntField(term83941, term83941.getClass(), "brightness", 0);
        setIntField(term83941, term83941.getClass(), "isStarRot", 0);
        setIntField(term83941, term83941.getClass(), "breakSe", 0);
        setIntField(term83941, term83941.getClass(), "slideSe", 0);
        setIntField(term83941, term83941.getClass(), "hardJudge", 0);
        setIntField(term83941, term83941.getClass(), "isTagJump", 0);
        setIntField(term83941, term83941.getClass(), "breakSeVol", 0);
        setIntField(term83941, term83941.getClass(), "slideSeVol", 0);
        setIntField(term83941, term83941.getClass(), "isUpperDisp", 0);
        setIntField(term83941, term83941.getClass(), "trackSkip", 0);
        setIntField(term83941, term83941.getClass(), "optionMode", 0);
        setIntField(term83941, term83941.getClass(), "simpleOptionParam", 0);
        setIntField(term83941, term83941.getClass(), "adjustTiming", 0);
        setIntField(term83941, term83941.getClass(), "dispTiming", 0);
        setIntField(term83941, term83941.getClass(), "timingPos", 0);
        setIntField(term83941, term83941.getClass(), "ansVol", 0);
        setIntField(term83941, term83941.getClass(), "noteVol", 0);
        setIntField(term83941, term83941.getClass(), "dmgVol", 0);
        setIntField(term83941, term83941.getClass(), "appealFlame", 0);
        setIntField(term83941, term83941.getClass(), "isFeverDisp", 0);
        setIntField(term83941, term83941.getClass(), "dispJudge", 0);
        setIntField(term83941, term83941.getClass(), "judgePos", 0);
        setIntField(term83941, term83941.getClass(), "ratingGuard", 0);
        setIntField(term83941, term83941.getClass(), "selectChara", 0);
        setIntField(term83941, term83941.getClass(), "sortType", 0);
        setIntField(term83941, term83941.getClass(), "filterGenre", 0);
        setIntField(term83941, term83941.getClass(), "filterLevel", 0);
        setIntField(term83941, term83941.getClass(), "filterRank", 0);
        setIntField(term83941, term83941.getClass(), "filterVersion", 0);
        setIntField(term83941, term83941.getClass(), "filterRec", 0);
        setIntField(term83941, term83941.getClass(), "filterFullCombo", 0);
        setIntField(term83941, term83941.getClass(), "filterAllPerfect", 0);
        setIntField(term83941, term83941.getClass(), "filterDifficulty", 0);
        setIntField(term83941, term83941.getClass(), "filterFullSync", 0);
        setIntField(term83941, term83941.getClass(), "filterReMaster", 0);
        setIntField(term83941, term83941.getClass(), "filterMaxFever", 0);
        setIntField(term83941, term83941.getClass(), "finalSelectId", 0);
        setIntField(term83941, term83941.getClass(), "finalSelectCategory", 0);
        term83985 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term83985;
        callMethod(klass, "setFinalSelectId", argTypes, term83941, args);
    }

};


