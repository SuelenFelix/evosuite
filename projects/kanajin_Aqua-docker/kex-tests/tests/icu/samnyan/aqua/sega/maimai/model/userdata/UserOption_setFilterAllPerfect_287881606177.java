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

public class UserOption_setFilterAllPerfect_287881606177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83711;
     Object term83755;

    public UserOption_setFilterAllPerfect_287881606177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83711 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term83711, term83711.getClass(), "id", 0L);
        setField(term83711, term83711.getClass(), "user", null);
        setIntField(term83711, term83711.getClass(), "soudEffect", 0);
        setIntField(term83711, term83711.getClass(), "mirrorMode", 0);
        setIntField(term83711, term83711.getClass(), "guideSpeed", 0);
        setIntField(term83711, term83711.getClass(), "bgInfo", 0);
        setIntField(term83711, term83711.getClass(), "brightness", 0);
        setIntField(term83711, term83711.getClass(), "isStarRot", 0);
        setIntField(term83711, term83711.getClass(), "breakSe", 0);
        setIntField(term83711, term83711.getClass(), "slideSe", 0);
        setIntField(term83711, term83711.getClass(), "hardJudge", 0);
        setIntField(term83711, term83711.getClass(), "isTagJump", 0);
        setIntField(term83711, term83711.getClass(), "breakSeVol", 0);
        setIntField(term83711, term83711.getClass(), "slideSeVol", 0);
        setIntField(term83711, term83711.getClass(), "isUpperDisp", 0);
        setIntField(term83711, term83711.getClass(), "trackSkip", 0);
        setIntField(term83711, term83711.getClass(), "optionMode", 0);
        setIntField(term83711, term83711.getClass(), "simpleOptionParam", 0);
        setIntField(term83711, term83711.getClass(), "adjustTiming", 0);
        setIntField(term83711, term83711.getClass(), "dispTiming", 0);
        setIntField(term83711, term83711.getClass(), "timingPos", 0);
        setIntField(term83711, term83711.getClass(), "ansVol", 0);
        setIntField(term83711, term83711.getClass(), "noteVol", 0);
        setIntField(term83711, term83711.getClass(), "dmgVol", 0);
        setIntField(term83711, term83711.getClass(), "appealFlame", 0);
        setIntField(term83711, term83711.getClass(), "isFeverDisp", 0);
        setIntField(term83711, term83711.getClass(), "dispJudge", 0);
        setIntField(term83711, term83711.getClass(), "judgePos", 0);
        setIntField(term83711, term83711.getClass(), "ratingGuard", 0);
        setIntField(term83711, term83711.getClass(), "selectChara", 0);
        setIntField(term83711, term83711.getClass(), "sortType", 0);
        setIntField(term83711, term83711.getClass(), "filterGenre", 0);
        setIntField(term83711, term83711.getClass(), "filterLevel", 0);
        setIntField(term83711, term83711.getClass(), "filterRank", 0);
        setIntField(term83711, term83711.getClass(), "filterVersion", 0);
        setIntField(term83711, term83711.getClass(), "filterRec", 0);
        setIntField(term83711, term83711.getClass(), "filterFullCombo", 0);
        setIntField(term83711, term83711.getClass(), "filterAllPerfect", 0);
        setIntField(term83711, term83711.getClass(), "filterDifficulty", 0);
        setIntField(term83711, term83711.getClass(), "filterFullSync", 0);
        setIntField(term83711, term83711.getClass(), "filterReMaster", 0);
        setIntField(term83711, term83711.getClass(), "filterMaxFever", 0);
        setIntField(term83711, term83711.getClass(), "finalSelectId", 0);
        setIntField(term83711, term83711.getClass(), "finalSelectCategory", 0);
        term83755 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term83755;
        callMethod(klass, "setFilterAllPerfect", argTypes, term83711, args);
    }

};


