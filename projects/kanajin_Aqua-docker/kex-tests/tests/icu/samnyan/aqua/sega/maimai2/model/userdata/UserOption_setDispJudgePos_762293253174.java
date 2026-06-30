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

public class UserOption_setDispJudgePos_762293253174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562120;
     Object term562166;

    public UserOption_setDispJudgePos_762293253174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562120 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term562120, term562120.getClass(), "id", 0L);
        setField(term562120, term562120.getClass(), "user", null);
        setIntField(term562120, term562120.getClass(), "optionKind", 0);
        setIntField(term562120, term562120.getClass(), "noteSpeed", 0);
        setIntField(term562120, term562120.getClass(), "slideSpeed", 0);
        setIntField(term562120, term562120.getClass(), "touchSpeed", 0);
        setIntField(term562120, term562120.getClass(), "tapDesign", 0);
        setIntField(term562120, term562120.getClass(), "holdDesign", 0);
        setIntField(term562120, term562120.getClass(), "slideDesign", 0);
        setIntField(term562120, term562120.getClass(), "starType", 0);
        setIntField(term562120, term562120.getClass(), "outlineDesign", 0);
        setIntField(term562120, term562120.getClass(), "noteSize", 0);
        setIntField(term562120, term562120.getClass(), "slideSize", 0);
        setIntField(term562120, term562120.getClass(), "touchSize", 0);
        setIntField(term562120, term562120.getClass(), "starRotate", 0);
        setIntField(term562120, term562120.getClass(), "dispCenter", 0);
        setIntField(term562120, term562120.getClass(), "dispChain", 0);
        setIntField(term562120, term562120.getClass(), "dispRate", 0);
        setIntField(term562120, term562120.getClass(), "dispBar", 0);
        setIntField(term562120, term562120.getClass(), "touchEffect", 0);
        setIntField(term562120, term562120.getClass(), "submonitorAnimation", 0);
        setIntField(term562120, term562120.getClass(), "submonitorAchive", 0);
        setIntField(term562120, term562120.getClass(), "submonitorAppeal", 0);
        setIntField(term562120, term562120.getClass(), "matching", 0);
        setIntField(term562120, term562120.getClass(), "trackSkip", 0);
        setIntField(term562120, term562120.getClass(), "brightness", 0);
        setIntField(term562120, term562120.getClass(), "mirrorMode", 0);
        setIntField(term562120, term562120.getClass(), "dispJudge", 0);
        setIntField(term562120, term562120.getClass(), "dispJudgePos", 0);
        setIntField(term562120, term562120.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term562120, term562120.getClass(), "adjustTiming", 0);
        setIntField(term562120, term562120.getClass(), "judgeTiming", 0);
        setIntField(term562120, term562120.getClass(), "ansVolume", 0);
        setIntField(term562120, term562120.getClass(), "tapHoldVolume", 0);
        setIntField(term562120, term562120.getClass(), "criticalSe", 0);
        setIntField(term562120, term562120.getClass(), "breakSe", 0);
        setIntField(term562120, term562120.getClass(), "breakVolume", 0);
        setIntField(term562120, term562120.getClass(), "exSe", 0);
        setIntField(term562120, term562120.getClass(), "exVolume", 0);
        setIntField(term562120, term562120.getClass(), "slideSe", 0);
        setIntField(term562120, term562120.getClass(), "slideVolume", 0);
        setIntField(term562120, term562120.getClass(), "touchHoldVolume", 0);
        setIntField(term562120, term562120.getClass(), "damageSeVolume", 0);
        setIntField(term562120, term562120.getClass(), "headPhoneVolume", 0);
        setIntField(term562120, term562120.getClass(), "sortTab", 0);
        setIntField(term562120, term562120.getClass(), "sortMusic", 0);
        term562166 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term562166;
        callMethod(klass, "setDispJudgePos", argTypes, term562120, args);
    }

};


