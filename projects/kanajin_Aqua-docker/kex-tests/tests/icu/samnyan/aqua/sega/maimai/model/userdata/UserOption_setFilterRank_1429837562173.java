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

public class UserOption_setFilterRank_1429837562173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83527;
     Object term83571;

    public UserOption_setFilterRank_1429837562173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83527 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term83527, term83527.getClass(), "id", 0L);
        setField(term83527, term83527.getClass(), "user", null);
        setIntField(term83527, term83527.getClass(), "soudEffect", 0);
        setIntField(term83527, term83527.getClass(), "mirrorMode", 0);
        setIntField(term83527, term83527.getClass(), "guideSpeed", 0);
        setIntField(term83527, term83527.getClass(), "bgInfo", 0);
        setIntField(term83527, term83527.getClass(), "brightness", 0);
        setIntField(term83527, term83527.getClass(), "isStarRot", 0);
        setIntField(term83527, term83527.getClass(), "breakSe", 0);
        setIntField(term83527, term83527.getClass(), "slideSe", 0);
        setIntField(term83527, term83527.getClass(), "hardJudge", 0);
        setIntField(term83527, term83527.getClass(), "isTagJump", 0);
        setIntField(term83527, term83527.getClass(), "breakSeVol", 0);
        setIntField(term83527, term83527.getClass(), "slideSeVol", 0);
        setIntField(term83527, term83527.getClass(), "isUpperDisp", 0);
        setIntField(term83527, term83527.getClass(), "trackSkip", 0);
        setIntField(term83527, term83527.getClass(), "optionMode", 0);
        setIntField(term83527, term83527.getClass(), "simpleOptionParam", 0);
        setIntField(term83527, term83527.getClass(), "adjustTiming", 0);
        setIntField(term83527, term83527.getClass(), "dispTiming", 0);
        setIntField(term83527, term83527.getClass(), "timingPos", 0);
        setIntField(term83527, term83527.getClass(), "ansVol", 0);
        setIntField(term83527, term83527.getClass(), "noteVol", 0);
        setIntField(term83527, term83527.getClass(), "dmgVol", 0);
        setIntField(term83527, term83527.getClass(), "appealFlame", 0);
        setIntField(term83527, term83527.getClass(), "isFeverDisp", 0);
        setIntField(term83527, term83527.getClass(), "dispJudge", 0);
        setIntField(term83527, term83527.getClass(), "judgePos", 0);
        setIntField(term83527, term83527.getClass(), "ratingGuard", 0);
        setIntField(term83527, term83527.getClass(), "selectChara", 0);
        setIntField(term83527, term83527.getClass(), "sortType", 0);
        setIntField(term83527, term83527.getClass(), "filterGenre", 0);
        setIntField(term83527, term83527.getClass(), "filterLevel", 0);
        setIntField(term83527, term83527.getClass(), "filterRank", 0);
        setIntField(term83527, term83527.getClass(), "filterVersion", 0);
        setIntField(term83527, term83527.getClass(), "filterRec", 0);
        setIntField(term83527, term83527.getClass(), "filterFullCombo", 0);
        setIntField(term83527, term83527.getClass(), "filterAllPerfect", 0);
        setIntField(term83527, term83527.getClass(), "filterDifficulty", 0);
        setIntField(term83527, term83527.getClass(), "filterFullSync", 0);
        setIntField(term83527, term83527.getClass(), "filterReMaster", 0);
        setIntField(term83527, term83527.getClass(), "filterMaxFever", 0);
        setIntField(term83527, term83527.getClass(), "finalSelectId", 0);
        setIntField(term83527, term83527.getClass(), "finalSelectCategory", 0);
        term83571 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term83571;
        callMethod(klass, "setFilterRank", argTypes, term83527, args);
    }

};


