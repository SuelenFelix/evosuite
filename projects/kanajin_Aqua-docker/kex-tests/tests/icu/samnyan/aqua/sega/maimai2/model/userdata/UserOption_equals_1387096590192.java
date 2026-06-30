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

public class UserOption_equals_1387096590192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562984;

    public UserOption_equals_1387096590192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562984 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term562984, term562984.getClass(), "id", 0L);
        setField(term562984, term562984.getClass(), "user", null);
        setIntField(term562984, term562984.getClass(), "optionKind", 0);
        setIntField(term562984, term562984.getClass(), "noteSpeed", 0);
        setIntField(term562984, term562984.getClass(), "slideSpeed", 0);
        setIntField(term562984, term562984.getClass(), "touchSpeed", 0);
        setIntField(term562984, term562984.getClass(), "tapDesign", 0);
        setIntField(term562984, term562984.getClass(), "holdDesign", 0);
        setIntField(term562984, term562984.getClass(), "slideDesign", 0);
        setIntField(term562984, term562984.getClass(), "starType", 0);
        setIntField(term562984, term562984.getClass(), "outlineDesign", 0);
        setIntField(term562984, term562984.getClass(), "noteSize", 0);
        setIntField(term562984, term562984.getClass(), "slideSize", 0);
        setIntField(term562984, term562984.getClass(), "touchSize", 0);
        setIntField(term562984, term562984.getClass(), "starRotate", 0);
        setIntField(term562984, term562984.getClass(), "dispCenter", 0);
        setIntField(term562984, term562984.getClass(), "dispChain", 0);
        setIntField(term562984, term562984.getClass(), "dispRate", 0);
        setIntField(term562984, term562984.getClass(), "dispBar", 0);
        setIntField(term562984, term562984.getClass(), "touchEffect", 0);
        setIntField(term562984, term562984.getClass(), "submonitorAnimation", 0);
        setIntField(term562984, term562984.getClass(), "submonitorAchive", 0);
        setIntField(term562984, term562984.getClass(), "submonitorAppeal", 0);
        setIntField(term562984, term562984.getClass(), "matching", 0);
        setIntField(term562984, term562984.getClass(), "trackSkip", 0);
        setIntField(term562984, term562984.getClass(), "brightness", 0);
        setIntField(term562984, term562984.getClass(), "mirrorMode", 0);
        setIntField(term562984, term562984.getClass(), "dispJudge", 0);
        setIntField(term562984, term562984.getClass(), "dispJudgePos", 0);
        setIntField(term562984, term562984.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term562984, term562984.getClass(), "adjustTiming", 0);
        setIntField(term562984, term562984.getClass(), "judgeTiming", 0);
        setIntField(term562984, term562984.getClass(), "ansVolume", 0);
        setIntField(term562984, term562984.getClass(), "tapHoldVolume", 0);
        setIntField(term562984, term562984.getClass(), "criticalSe", 0);
        setIntField(term562984, term562984.getClass(), "breakSe", 0);
        setIntField(term562984, term562984.getClass(), "breakVolume", 0);
        setIntField(term562984, term562984.getClass(), "exSe", 0);
        setIntField(term562984, term562984.getClass(), "exVolume", 0);
        setIntField(term562984, term562984.getClass(), "slideSe", 0);
        setIntField(term562984, term562984.getClass(), "slideVolume", 0);
        setIntField(term562984, term562984.getClass(), "touchHoldVolume", 0);
        setIntField(term562984, term562984.getClass(), "damageSeVolume", 0);
        setIntField(term562984, term562984.getClass(), "headPhoneVolume", 0);
        setIntField(term562984, term562984.getClass(), "sortTab", 0);
        setIntField(term562984, term562984.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term562984, args);
    }

};


