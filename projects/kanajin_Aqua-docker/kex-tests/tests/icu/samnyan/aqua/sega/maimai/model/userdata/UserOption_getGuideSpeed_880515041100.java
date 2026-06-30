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

public class UserOption_getGuideSpeed_880515041100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80251;

    public UserOption_getGuideSpeed_880515041100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80251 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term80251, term80251.getClass(), "id", 0L);
        setField(term80251, term80251.getClass(), "user", null);
        setIntField(term80251, term80251.getClass(), "soudEffect", 0);
        setIntField(term80251, term80251.getClass(), "mirrorMode", 0);
        setIntField(term80251, term80251.getClass(), "guideSpeed", 0);
        setIntField(term80251, term80251.getClass(), "bgInfo", 0);
        setIntField(term80251, term80251.getClass(), "brightness", 0);
        setIntField(term80251, term80251.getClass(), "isStarRot", 0);
        setIntField(term80251, term80251.getClass(), "breakSe", 0);
        setIntField(term80251, term80251.getClass(), "slideSe", 0);
        setIntField(term80251, term80251.getClass(), "hardJudge", 0);
        setIntField(term80251, term80251.getClass(), "isTagJump", 0);
        setIntField(term80251, term80251.getClass(), "breakSeVol", 0);
        setIntField(term80251, term80251.getClass(), "slideSeVol", 0);
        setIntField(term80251, term80251.getClass(), "isUpperDisp", 0);
        setIntField(term80251, term80251.getClass(), "trackSkip", 0);
        setIntField(term80251, term80251.getClass(), "optionMode", 0);
        setIntField(term80251, term80251.getClass(), "simpleOptionParam", 0);
        setIntField(term80251, term80251.getClass(), "adjustTiming", 0);
        setIntField(term80251, term80251.getClass(), "dispTiming", 0);
        setIntField(term80251, term80251.getClass(), "timingPos", 0);
        setIntField(term80251, term80251.getClass(), "ansVol", 0);
        setIntField(term80251, term80251.getClass(), "noteVol", 0);
        setIntField(term80251, term80251.getClass(), "dmgVol", 0);
        setIntField(term80251, term80251.getClass(), "appealFlame", 0);
        setIntField(term80251, term80251.getClass(), "isFeverDisp", 0);
        setIntField(term80251, term80251.getClass(), "dispJudge", 0);
        setIntField(term80251, term80251.getClass(), "judgePos", 0);
        setIntField(term80251, term80251.getClass(), "ratingGuard", 0);
        setIntField(term80251, term80251.getClass(), "selectChara", 0);
        setIntField(term80251, term80251.getClass(), "sortType", 0);
        setIntField(term80251, term80251.getClass(), "filterGenre", 0);
        setIntField(term80251, term80251.getClass(), "filterLevel", 0);
        setIntField(term80251, term80251.getClass(), "filterRank", 0);
        setIntField(term80251, term80251.getClass(), "filterVersion", 0);
        setIntField(term80251, term80251.getClass(), "filterRec", 0);
        setIntField(term80251, term80251.getClass(), "filterFullCombo", 0);
        setIntField(term80251, term80251.getClass(), "filterAllPerfect", 0);
        setIntField(term80251, term80251.getClass(), "filterDifficulty", 0);
        setIntField(term80251, term80251.getClass(), "filterFullSync", 0);
        setIntField(term80251, term80251.getClass(), "filterReMaster", 0);
        setIntField(term80251, term80251.getClass(), "filterMaxFever", 0);
        setIntField(term80251, term80251.getClass(), "finalSelectId", 0);
        setIntField(term80251, term80251.getClass(), "finalSelectCategory", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGuideSpeed", argTypes, term80251, args);
    }

};


