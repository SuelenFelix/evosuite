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

public class UserOption_setIsStarRot_2001839053147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82331;
     Object term82375;

    public UserOption_setIsStarRot_2001839053147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82331 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term82331, term82331.getClass(), "id", 0L);
        setField(term82331, term82331.getClass(), "user", null);
        setIntField(term82331, term82331.getClass(), "soudEffect", 0);
        setIntField(term82331, term82331.getClass(), "mirrorMode", 0);
        setIntField(term82331, term82331.getClass(), "guideSpeed", 0);
        setIntField(term82331, term82331.getClass(), "bgInfo", 0);
        setIntField(term82331, term82331.getClass(), "brightness", 0);
        setIntField(term82331, term82331.getClass(), "isStarRot", 0);
        setIntField(term82331, term82331.getClass(), "breakSe", 0);
        setIntField(term82331, term82331.getClass(), "slideSe", 0);
        setIntField(term82331, term82331.getClass(), "hardJudge", 0);
        setIntField(term82331, term82331.getClass(), "isTagJump", 0);
        setIntField(term82331, term82331.getClass(), "breakSeVol", 0);
        setIntField(term82331, term82331.getClass(), "slideSeVol", 0);
        setIntField(term82331, term82331.getClass(), "isUpperDisp", 0);
        setIntField(term82331, term82331.getClass(), "trackSkip", 0);
        setIntField(term82331, term82331.getClass(), "optionMode", 0);
        setIntField(term82331, term82331.getClass(), "simpleOptionParam", 0);
        setIntField(term82331, term82331.getClass(), "adjustTiming", 0);
        setIntField(term82331, term82331.getClass(), "dispTiming", 0);
        setIntField(term82331, term82331.getClass(), "timingPos", 0);
        setIntField(term82331, term82331.getClass(), "ansVol", 0);
        setIntField(term82331, term82331.getClass(), "noteVol", 0);
        setIntField(term82331, term82331.getClass(), "dmgVol", 0);
        setIntField(term82331, term82331.getClass(), "appealFlame", 0);
        setIntField(term82331, term82331.getClass(), "isFeverDisp", 0);
        setIntField(term82331, term82331.getClass(), "dispJudge", 0);
        setIntField(term82331, term82331.getClass(), "judgePos", 0);
        setIntField(term82331, term82331.getClass(), "ratingGuard", 0);
        setIntField(term82331, term82331.getClass(), "selectChara", 0);
        setIntField(term82331, term82331.getClass(), "sortType", 0);
        setIntField(term82331, term82331.getClass(), "filterGenre", 0);
        setIntField(term82331, term82331.getClass(), "filterLevel", 0);
        setIntField(term82331, term82331.getClass(), "filterRank", 0);
        setIntField(term82331, term82331.getClass(), "filterVersion", 0);
        setIntField(term82331, term82331.getClass(), "filterRec", 0);
        setIntField(term82331, term82331.getClass(), "filterFullCombo", 0);
        setIntField(term82331, term82331.getClass(), "filterAllPerfect", 0);
        setIntField(term82331, term82331.getClass(), "filterDifficulty", 0);
        setIntField(term82331, term82331.getClass(), "filterFullSync", 0);
        setIntField(term82331, term82331.getClass(), "filterReMaster", 0);
        setIntField(term82331, term82331.getClass(), "filterMaxFever", 0);
        setIntField(term82331, term82331.getClass(), "finalSelectId", 0);
        setIntField(term82331, term82331.getClass(), "finalSelectCategory", 0);
        term82375 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82375;
        callMethod(klass, "setIsStarRot", argTypes, term82331, args);
    }

};


