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

public class UserOption_setJudgeTiming_1752274951177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562264;
     Object term562310;

    public UserOption_setJudgeTiming_1752274951177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562264 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term562264, term562264.getClass(), "id", 0L);
        setField(term562264, term562264.getClass(), "user", null);
        setIntField(term562264, term562264.getClass(), "optionKind", 0);
        setIntField(term562264, term562264.getClass(), "noteSpeed", 0);
        setIntField(term562264, term562264.getClass(), "slideSpeed", 0);
        setIntField(term562264, term562264.getClass(), "touchSpeed", 0);
        setIntField(term562264, term562264.getClass(), "tapDesign", 0);
        setIntField(term562264, term562264.getClass(), "holdDesign", 0);
        setIntField(term562264, term562264.getClass(), "slideDesign", 0);
        setIntField(term562264, term562264.getClass(), "starType", 0);
        setIntField(term562264, term562264.getClass(), "outlineDesign", 0);
        setIntField(term562264, term562264.getClass(), "noteSize", 0);
        setIntField(term562264, term562264.getClass(), "slideSize", 0);
        setIntField(term562264, term562264.getClass(), "touchSize", 0);
        setIntField(term562264, term562264.getClass(), "starRotate", 0);
        setIntField(term562264, term562264.getClass(), "dispCenter", 0);
        setIntField(term562264, term562264.getClass(), "dispChain", 0);
        setIntField(term562264, term562264.getClass(), "dispRate", 0);
        setIntField(term562264, term562264.getClass(), "dispBar", 0);
        setIntField(term562264, term562264.getClass(), "touchEffect", 0);
        setIntField(term562264, term562264.getClass(), "submonitorAnimation", 0);
        setIntField(term562264, term562264.getClass(), "submonitorAchive", 0);
        setIntField(term562264, term562264.getClass(), "submonitorAppeal", 0);
        setIntField(term562264, term562264.getClass(), "matching", 0);
        setIntField(term562264, term562264.getClass(), "trackSkip", 0);
        setIntField(term562264, term562264.getClass(), "brightness", 0);
        setIntField(term562264, term562264.getClass(), "mirrorMode", 0);
        setIntField(term562264, term562264.getClass(), "dispJudge", 0);
        setIntField(term562264, term562264.getClass(), "dispJudgePos", 0);
        setIntField(term562264, term562264.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term562264, term562264.getClass(), "adjustTiming", 0);
        setIntField(term562264, term562264.getClass(), "judgeTiming", 0);
        setIntField(term562264, term562264.getClass(), "ansVolume", 0);
        setIntField(term562264, term562264.getClass(), "tapHoldVolume", 0);
        setIntField(term562264, term562264.getClass(), "criticalSe", 0);
        setIntField(term562264, term562264.getClass(), "breakSe", 0);
        setIntField(term562264, term562264.getClass(), "breakVolume", 0);
        setIntField(term562264, term562264.getClass(), "exSe", 0);
        setIntField(term562264, term562264.getClass(), "exVolume", 0);
        setIntField(term562264, term562264.getClass(), "slideSe", 0);
        setIntField(term562264, term562264.getClass(), "slideVolume", 0);
        setIntField(term562264, term562264.getClass(), "touchHoldVolume", 0);
        setIntField(term562264, term562264.getClass(), "damageSeVolume", 0);
        setIntField(term562264, term562264.getClass(), "headPhoneVolume", 0);
        setIntField(term562264, term562264.getClass(), "sortTab", 0);
        setIntField(term562264, term562264.getClass(), "sortMusic", 0);
        term562310 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term562310;
        callMethod(klass, "setJudgeTiming", argTypes, term562264, args);
    }

};


