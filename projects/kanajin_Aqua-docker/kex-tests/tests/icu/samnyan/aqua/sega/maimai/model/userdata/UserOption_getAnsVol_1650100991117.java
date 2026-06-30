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

public class UserOption_getAnsVol_1650100991117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80999;

    public UserOption_getAnsVol_1650100991117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80999 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term80999, term80999.getClass(), "id", 0L);
        setField(term80999, term80999.getClass(), "user", null);
        setIntField(term80999, term80999.getClass(), "soudEffect", 0);
        setIntField(term80999, term80999.getClass(), "mirrorMode", 0);
        setIntField(term80999, term80999.getClass(), "guideSpeed", 0);
        setIntField(term80999, term80999.getClass(), "bgInfo", 0);
        setIntField(term80999, term80999.getClass(), "brightness", 0);
        setIntField(term80999, term80999.getClass(), "isStarRot", 0);
        setIntField(term80999, term80999.getClass(), "breakSe", 0);
        setIntField(term80999, term80999.getClass(), "slideSe", 0);
        setIntField(term80999, term80999.getClass(), "hardJudge", 0);
        setIntField(term80999, term80999.getClass(), "isTagJump", 0);
        setIntField(term80999, term80999.getClass(), "breakSeVol", 0);
        setIntField(term80999, term80999.getClass(), "slideSeVol", 0);
        setIntField(term80999, term80999.getClass(), "isUpperDisp", 0);
        setIntField(term80999, term80999.getClass(), "trackSkip", 0);
        setIntField(term80999, term80999.getClass(), "optionMode", 0);
        setIntField(term80999, term80999.getClass(), "simpleOptionParam", 0);
        setIntField(term80999, term80999.getClass(), "adjustTiming", 0);
        setIntField(term80999, term80999.getClass(), "dispTiming", 0);
        setIntField(term80999, term80999.getClass(), "timingPos", 0);
        setIntField(term80999, term80999.getClass(), "ansVol", 0);
        setIntField(term80999, term80999.getClass(), "noteVol", 0);
        setIntField(term80999, term80999.getClass(), "dmgVol", 0);
        setIntField(term80999, term80999.getClass(), "appealFlame", 0);
        setIntField(term80999, term80999.getClass(), "isFeverDisp", 0);
        setIntField(term80999, term80999.getClass(), "dispJudge", 0);
        setIntField(term80999, term80999.getClass(), "judgePos", 0);
        setIntField(term80999, term80999.getClass(), "ratingGuard", 0);
        setIntField(term80999, term80999.getClass(), "selectChara", 0);
        setIntField(term80999, term80999.getClass(), "sortType", 0);
        setIntField(term80999, term80999.getClass(), "filterGenre", 0);
        setIntField(term80999, term80999.getClass(), "filterLevel", 0);
        setIntField(term80999, term80999.getClass(), "filterRank", 0);
        setIntField(term80999, term80999.getClass(), "filterVersion", 0);
        setIntField(term80999, term80999.getClass(), "filterRec", 0);
        setIntField(term80999, term80999.getClass(), "filterFullCombo", 0);
        setIntField(term80999, term80999.getClass(), "filterAllPerfect", 0);
        setIntField(term80999, term80999.getClass(), "filterDifficulty", 0);
        setIntField(term80999, term80999.getClass(), "filterFullSync", 0);
        setIntField(term80999, term80999.getClass(), "filterReMaster", 0);
        setIntField(term80999, term80999.getClass(), "filterMaxFever", 0);
        setIntField(term80999, term80999.getClass(), "finalSelectId", 0);
        setIntField(term80999, term80999.getClass(), "finalSelectCategory", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnsVol", argTypes, term80999, args);
    }

};


