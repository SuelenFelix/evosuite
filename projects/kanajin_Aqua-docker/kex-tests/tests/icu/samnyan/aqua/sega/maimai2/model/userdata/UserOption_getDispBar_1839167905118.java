package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserOption_getDispBar_1839167905118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559490;

    public UserOption_getDispBar_1839167905118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559490 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term559490, term559490.getClass(), "id", 0L);
        setField(term559490, term559490.getClass(), "user", null);
        setIntField(term559490, term559490.getClass(), "optionKind", 0);
        setIntField(term559490, term559490.getClass(), "noteSpeed", 0);
        setIntField(term559490, term559490.getClass(), "slideSpeed", 0);
        setIntField(term559490, term559490.getClass(), "touchSpeed", 0);
        setIntField(term559490, term559490.getClass(), "tapDesign", 0);
        setIntField(term559490, term559490.getClass(), "holdDesign", 0);
        setIntField(term559490, term559490.getClass(), "slideDesign", 0);
        setIntField(term559490, term559490.getClass(), "starType", 0);
        setIntField(term559490, term559490.getClass(), "outlineDesign", 0);
        setIntField(term559490, term559490.getClass(), "noteSize", 0);
        setIntField(term559490, term559490.getClass(), "slideSize", 0);
        setIntField(term559490, term559490.getClass(), "touchSize", 0);
        setIntField(term559490, term559490.getClass(), "starRotate", 0);
        setIntField(term559490, term559490.getClass(), "dispCenter", 0);
        setIntField(term559490, term559490.getClass(), "dispChain", 0);
        setIntField(term559490, term559490.getClass(), "dispRate", 0);
        setIntField(term559490, term559490.getClass(), "dispBar", 0);
        setIntField(term559490, term559490.getClass(), "touchEffect", 0);
        setIntField(term559490, term559490.getClass(), "submonitorAnimation", 0);
        setIntField(term559490, term559490.getClass(), "submonitorAchive", 0);
        setIntField(term559490, term559490.getClass(), "submonitorAppeal", 0);
        setIntField(term559490, term559490.getClass(), "matching", 0);
        setIntField(term559490, term559490.getClass(), "trackSkip", 0);
        setIntField(term559490, term559490.getClass(), "brightness", 0);
        setIntField(term559490, term559490.getClass(), "mirrorMode", 0);
        setIntField(term559490, term559490.getClass(), "dispJudge", 0);
        setIntField(term559490, term559490.getClass(), "dispJudgePos", 0);
        setIntField(term559490, term559490.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term559490, term559490.getClass(), "adjustTiming", 0);
        setIntField(term559490, term559490.getClass(), "judgeTiming", 0);
        setIntField(term559490, term559490.getClass(), "ansVolume", 0);
        setIntField(term559490, term559490.getClass(), "tapHoldVolume", 0);
        setIntField(term559490, term559490.getClass(), "criticalSe", 0);
        setIntField(term559490, term559490.getClass(), "breakSe", 0);
        setIntField(term559490, term559490.getClass(), "breakVolume", 0);
        setIntField(term559490, term559490.getClass(), "exSe", 0);
        setIntField(term559490, term559490.getClass(), "exVolume", 0);
        setIntField(term559490, term559490.getClass(), "slideSe", 0);
        setIntField(term559490, term559490.getClass(), "slideVolume", 0);
        setIntField(term559490, term559490.getClass(), "touchHoldVolume", 0);
        setIntField(term559490, term559490.getClass(), "damageSeVolume", 0);
        setIntField(term559490, term559490.getClass(), "headPhoneVolume", 0);
        setIntField(term559490, term559490.getClass(), "sortTab", 0);
        setIntField(term559490, term559490.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispBar", argTypes, term559490, args);
    }

};


