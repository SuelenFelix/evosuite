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

public class UserOption_canEqual_582933961193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563030;

    public UserOption_canEqual_582933961193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563030 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term563030, term563030.getClass(), "id", 0L);
        setField(term563030, term563030.getClass(), "user", null);
        setIntField(term563030, term563030.getClass(), "optionKind", 0);
        setIntField(term563030, term563030.getClass(), "noteSpeed", 0);
        setIntField(term563030, term563030.getClass(), "slideSpeed", 0);
        setIntField(term563030, term563030.getClass(), "touchSpeed", 0);
        setIntField(term563030, term563030.getClass(), "tapDesign", 0);
        setIntField(term563030, term563030.getClass(), "holdDesign", 0);
        setIntField(term563030, term563030.getClass(), "slideDesign", 0);
        setIntField(term563030, term563030.getClass(), "starType", 0);
        setIntField(term563030, term563030.getClass(), "outlineDesign", 0);
        setIntField(term563030, term563030.getClass(), "noteSize", 0);
        setIntField(term563030, term563030.getClass(), "slideSize", 0);
        setIntField(term563030, term563030.getClass(), "touchSize", 0);
        setIntField(term563030, term563030.getClass(), "starRotate", 0);
        setIntField(term563030, term563030.getClass(), "dispCenter", 0);
        setIntField(term563030, term563030.getClass(), "dispChain", 0);
        setIntField(term563030, term563030.getClass(), "dispRate", 0);
        setIntField(term563030, term563030.getClass(), "dispBar", 0);
        setIntField(term563030, term563030.getClass(), "touchEffect", 0);
        setIntField(term563030, term563030.getClass(), "submonitorAnimation", 0);
        setIntField(term563030, term563030.getClass(), "submonitorAchive", 0);
        setIntField(term563030, term563030.getClass(), "submonitorAppeal", 0);
        setIntField(term563030, term563030.getClass(), "matching", 0);
        setIntField(term563030, term563030.getClass(), "trackSkip", 0);
        setIntField(term563030, term563030.getClass(), "brightness", 0);
        setIntField(term563030, term563030.getClass(), "mirrorMode", 0);
        setIntField(term563030, term563030.getClass(), "dispJudge", 0);
        setIntField(term563030, term563030.getClass(), "dispJudgePos", 0);
        setIntField(term563030, term563030.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term563030, term563030.getClass(), "adjustTiming", 0);
        setIntField(term563030, term563030.getClass(), "judgeTiming", 0);
        setIntField(term563030, term563030.getClass(), "ansVolume", 0);
        setIntField(term563030, term563030.getClass(), "tapHoldVolume", 0);
        setIntField(term563030, term563030.getClass(), "criticalSe", 0);
        setIntField(term563030, term563030.getClass(), "breakSe", 0);
        setIntField(term563030, term563030.getClass(), "breakVolume", 0);
        setIntField(term563030, term563030.getClass(), "exSe", 0);
        setIntField(term563030, term563030.getClass(), "exVolume", 0);
        setIntField(term563030, term563030.getClass(), "slideSe", 0);
        setIntField(term563030, term563030.getClass(), "slideVolume", 0);
        setIntField(term563030, term563030.getClass(), "touchHoldVolume", 0);
        setIntField(term563030, term563030.getClass(), "damageSeVolume", 0);
        setIntField(term563030, term563030.getClass(), "headPhoneVolume", 0);
        setIntField(term563030, term563030.getClass(), "sortTab", 0);
        setIntField(term563030, term563030.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term563030, args);
    }

};


