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

public class UserOption_setBgInfo_1204640521145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82239;
     Object term82283;

    public UserOption_setBgInfo_1204640521145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82239 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term82239, term82239.getClass(), "id", 0L);
        setField(term82239, term82239.getClass(), "user", null);
        setIntField(term82239, term82239.getClass(), "soudEffect", 0);
        setIntField(term82239, term82239.getClass(), "mirrorMode", 0);
        setIntField(term82239, term82239.getClass(), "guideSpeed", 0);
        setIntField(term82239, term82239.getClass(), "bgInfo", 0);
        setIntField(term82239, term82239.getClass(), "brightness", 0);
        setIntField(term82239, term82239.getClass(), "isStarRot", 0);
        setIntField(term82239, term82239.getClass(), "breakSe", 0);
        setIntField(term82239, term82239.getClass(), "slideSe", 0);
        setIntField(term82239, term82239.getClass(), "hardJudge", 0);
        setIntField(term82239, term82239.getClass(), "isTagJump", 0);
        setIntField(term82239, term82239.getClass(), "breakSeVol", 0);
        setIntField(term82239, term82239.getClass(), "slideSeVol", 0);
        setIntField(term82239, term82239.getClass(), "isUpperDisp", 0);
        setIntField(term82239, term82239.getClass(), "trackSkip", 0);
        setIntField(term82239, term82239.getClass(), "optionMode", 0);
        setIntField(term82239, term82239.getClass(), "simpleOptionParam", 0);
        setIntField(term82239, term82239.getClass(), "adjustTiming", 0);
        setIntField(term82239, term82239.getClass(), "dispTiming", 0);
        setIntField(term82239, term82239.getClass(), "timingPos", 0);
        setIntField(term82239, term82239.getClass(), "ansVol", 0);
        setIntField(term82239, term82239.getClass(), "noteVol", 0);
        setIntField(term82239, term82239.getClass(), "dmgVol", 0);
        setIntField(term82239, term82239.getClass(), "appealFlame", 0);
        setIntField(term82239, term82239.getClass(), "isFeverDisp", 0);
        setIntField(term82239, term82239.getClass(), "dispJudge", 0);
        setIntField(term82239, term82239.getClass(), "judgePos", 0);
        setIntField(term82239, term82239.getClass(), "ratingGuard", 0);
        setIntField(term82239, term82239.getClass(), "selectChara", 0);
        setIntField(term82239, term82239.getClass(), "sortType", 0);
        setIntField(term82239, term82239.getClass(), "filterGenre", 0);
        setIntField(term82239, term82239.getClass(), "filterLevel", 0);
        setIntField(term82239, term82239.getClass(), "filterRank", 0);
        setIntField(term82239, term82239.getClass(), "filterVersion", 0);
        setIntField(term82239, term82239.getClass(), "filterRec", 0);
        setIntField(term82239, term82239.getClass(), "filterFullCombo", 0);
        setIntField(term82239, term82239.getClass(), "filterAllPerfect", 0);
        setIntField(term82239, term82239.getClass(), "filterDifficulty", 0);
        setIntField(term82239, term82239.getClass(), "filterFullSync", 0);
        setIntField(term82239, term82239.getClass(), "filterReMaster", 0);
        setIntField(term82239, term82239.getClass(), "filterMaxFever", 0);
        setIntField(term82239, term82239.getClass(), "finalSelectId", 0);
        setIntField(term82239, term82239.getClass(), "finalSelectCategory", 0);
        term82283 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82283;
        callMethod(klass, "setBgInfo", argTypes, term82239, args);
    }

};


