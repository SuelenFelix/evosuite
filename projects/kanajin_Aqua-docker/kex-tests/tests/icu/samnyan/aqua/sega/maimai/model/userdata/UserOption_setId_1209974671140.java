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
import java.lang.Long;

public class UserOption_setId_1209974671140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82011;
     Object term82055;

    public UserOption_setId_1209974671140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82011 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term82011, term82011.getClass(), "id", 0L);
        setField(term82011, term82011.getClass(), "user", null);
        setIntField(term82011, term82011.getClass(), "soudEffect", 0);
        setIntField(term82011, term82011.getClass(), "mirrorMode", 0);
        setIntField(term82011, term82011.getClass(), "guideSpeed", 0);
        setIntField(term82011, term82011.getClass(), "bgInfo", 0);
        setIntField(term82011, term82011.getClass(), "brightness", 0);
        setIntField(term82011, term82011.getClass(), "isStarRot", 0);
        setIntField(term82011, term82011.getClass(), "breakSe", 0);
        setIntField(term82011, term82011.getClass(), "slideSe", 0);
        setIntField(term82011, term82011.getClass(), "hardJudge", 0);
        setIntField(term82011, term82011.getClass(), "isTagJump", 0);
        setIntField(term82011, term82011.getClass(), "breakSeVol", 0);
        setIntField(term82011, term82011.getClass(), "slideSeVol", 0);
        setIntField(term82011, term82011.getClass(), "isUpperDisp", 0);
        setIntField(term82011, term82011.getClass(), "trackSkip", 0);
        setIntField(term82011, term82011.getClass(), "optionMode", 0);
        setIntField(term82011, term82011.getClass(), "simpleOptionParam", 0);
        setIntField(term82011, term82011.getClass(), "adjustTiming", 0);
        setIntField(term82011, term82011.getClass(), "dispTiming", 0);
        setIntField(term82011, term82011.getClass(), "timingPos", 0);
        setIntField(term82011, term82011.getClass(), "ansVol", 0);
        setIntField(term82011, term82011.getClass(), "noteVol", 0);
        setIntField(term82011, term82011.getClass(), "dmgVol", 0);
        setIntField(term82011, term82011.getClass(), "appealFlame", 0);
        setIntField(term82011, term82011.getClass(), "isFeverDisp", 0);
        setIntField(term82011, term82011.getClass(), "dispJudge", 0);
        setIntField(term82011, term82011.getClass(), "judgePos", 0);
        setIntField(term82011, term82011.getClass(), "ratingGuard", 0);
        setIntField(term82011, term82011.getClass(), "selectChara", 0);
        setIntField(term82011, term82011.getClass(), "sortType", 0);
        setIntField(term82011, term82011.getClass(), "filterGenre", 0);
        setIntField(term82011, term82011.getClass(), "filterLevel", 0);
        setIntField(term82011, term82011.getClass(), "filterRank", 0);
        setIntField(term82011, term82011.getClass(), "filterVersion", 0);
        setIntField(term82011, term82011.getClass(), "filterRec", 0);
        setIntField(term82011, term82011.getClass(), "filterFullCombo", 0);
        setIntField(term82011, term82011.getClass(), "filterAllPerfect", 0);
        setIntField(term82011, term82011.getClass(), "filterDifficulty", 0);
        setIntField(term82011, term82011.getClass(), "filterFullSync", 0);
        setIntField(term82011, term82011.getClass(), "filterReMaster", 0);
        setIntField(term82011, term82011.getClass(), "filterMaxFever", 0);
        setIntField(term82011, term82011.getClass(), "finalSelectId", 0);
        setIntField(term82011, term82011.getClass(), "finalSelectCategory", 0);
        term82055 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term82055;
        callMethod(klass, "setId", argTypes, term82011, args);
    }

};


