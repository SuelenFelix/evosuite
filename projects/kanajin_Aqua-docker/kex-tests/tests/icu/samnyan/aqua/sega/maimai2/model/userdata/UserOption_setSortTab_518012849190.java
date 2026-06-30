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
import java.lang.Integer;

public class UserOption_setSortTab_518012849190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562888;
     Object term562934;

    public UserOption_setSortTab_518012849190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562888 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term562888, term562888.getClass(), "id", 0L);
        setField(term562888, term562888.getClass(), "user", null);
        setIntField(term562888, term562888.getClass(), "optionKind", 0);
        setIntField(term562888, term562888.getClass(), "noteSpeed", 0);
        setIntField(term562888, term562888.getClass(), "slideSpeed", 0);
        setIntField(term562888, term562888.getClass(), "touchSpeed", 0);
        setIntField(term562888, term562888.getClass(), "tapDesign", 0);
        setIntField(term562888, term562888.getClass(), "holdDesign", 0);
        setIntField(term562888, term562888.getClass(), "slideDesign", 0);
        setIntField(term562888, term562888.getClass(), "starType", 0);
        setIntField(term562888, term562888.getClass(), "outlineDesign", 0);
        setIntField(term562888, term562888.getClass(), "noteSize", 0);
        setIntField(term562888, term562888.getClass(), "slideSize", 0);
        setIntField(term562888, term562888.getClass(), "touchSize", 0);
        setIntField(term562888, term562888.getClass(), "starRotate", 0);
        setIntField(term562888, term562888.getClass(), "dispCenter", 0);
        setIntField(term562888, term562888.getClass(), "dispChain", 0);
        setIntField(term562888, term562888.getClass(), "dispRate", 0);
        setIntField(term562888, term562888.getClass(), "dispBar", 0);
        setIntField(term562888, term562888.getClass(), "touchEffect", 0);
        setIntField(term562888, term562888.getClass(), "submonitorAnimation", 0);
        setIntField(term562888, term562888.getClass(), "submonitorAchive", 0);
        setIntField(term562888, term562888.getClass(), "submonitorAppeal", 0);
        setIntField(term562888, term562888.getClass(), "matching", 0);
        setIntField(term562888, term562888.getClass(), "trackSkip", 0);
        setIntField(term562888, term562888.getClass(), "brightness", 0);
        setIntField(term562888, term562888.getClass(), "mirrorMode", 0);
        setIntField(term562888, term562888.getClass(), "dispJudge", 0);
        setIntField(term562888, term562888.getClass(), "dispJudgePos", 0);
        setIntField(term562888, term562888.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term562888, term562888.getClass(), "adjustTiming", 0);
        setIntField(term562888, term562888.getClass(), "judgeTiming", 0);
        setIntField(term562888, term562888.getClass(), "ansVolume", 0);
        setIntField(term562888, term562888.getClass(), "tapHoldVolume", 0);
        setIntField(term562888, term562888.getClass(), "criticalSe", 0);
        setIntField(term562888, term562888.getClass(), "breakSe", 0);
        setIntField(term562888, term562888.getClass(), "breakVolume", 0);
        setIntField(term562888, term562888.getClass(), "exSe", 0);
        setIntField(term562888, term562888.getClass(), "exVolume", 0);
        setIntField(term562888, term562888.getClass(), "slideSe", 0);
        setIntField(term562888, term562888.getClass(), "slideVolume", 0);
        setIntField(term562888, term562888.getClass(), "touchHoldVolume", 0);
        setIntField(term562888, term562888.getClass(), "damageSeVolume", 0);
        setIntField(term562888, term562888.getClass(), "headPhoneVolume", 0);
        setIntField(term562888, term562888.getClass(), "sortTab", 0);
        setIntField(term562888, term562888.getClass(), "sortMusic", 0);
        term562934 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term562934;
        callMethod(klass, "setSortTab", argTypes, term562888, args);
    }

};


