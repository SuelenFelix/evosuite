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

public class UserOption_setTouchEffect_934886488165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561688;
     Object term561734;

    public UserOption_setTouchEffect_934886488165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561688 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term561688, term561688.getClass(), "id", 0L);
        setField(term561688, term561688.getClass(), "user", null);
        setIntField(term561688, term561688.getClass(), "optionKind", 0);
        setIntField(term561688, term561688.getClass(), "noteSpeed", 0);
        setIntField(term561688, term561688.getClass(), "slideSpeed", 0);
        setIntField(term561688, term561688.getClass(), "touchSpeed", 0);
        setIntField(term561688, term561688.getClass(), "tapDesign", 0);
        setIntField(term561688, term561688.getClass(), "holdDesign", 0);
        setIntField(term561688, term561688.getClass(), "slideDesign", 0);
        setIntField(term561688, term561688.getClass(), "starType", 0);
        setIntField(term561688, term561688.getClass(), "outlineDesign", 0);
        setIntField(term561688, term561688.getClass(), "noteSize", 0);
        setIntField(term561688, term561688.getClass(), "slideSize", 0);
        setIntField(term561688, term561688.getClass(), "touchSize", 0);
        setIntField(term561688, term561688.getClass(), "starRotate", 0);
        setIntField(term561688, term561688.getClass(), "dispCenter", 0);
        setIntField(term561688, term561688.getClass(), "dispChain", 0);
        setIntField(term561688, term561688.getClass(), "dispRate", 0);
        setIntField(term561688, term561688.getClass(), "dispBar", 0);
        setIntField(term561688, term561688.getClass(), "touchEffect", 0);
        setIntField(term561688, term561688.getClass(), "submonitorAnimation", 0);
        setIntField(term561688, term561688.getClass(), "submonitorAchive", 0);
        setIntField(term561688, term561688.getClass(), "submonitorAppeal", 0);
        setIntField(term561688, term561688.getClass(), "matching", 0);
        setIntField(term561688, term561688.getClass(), "trackSkip", 0);
        setIntField(term561688, term561688.getClass(), "brightness", 0);
        setIntField(term561688, term561688.getClass(), "mirrorMode", 0);
        setIntField(term561688, term561688.getClass(), "dispJudge", 0);
        setIntField(term561688, term561688.getClass(), "dispJudgePos", 0);
        setIntField(term561688, term561688.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term561688, term561688.getClass(), "adjustTiming", 0);
        setIntField(term561688, term561688.getClass(), "judgeTiming", 0);
        setIntField(term561688, term561688.getClass(), "ansVolume", 0);
        setIntField(term561688, term561688.getClass(), "tapHoldVolume", 0);
        setIntField(term561688, term561688.getClass(), "criticalSe", 0);
        setIntField(term561688, term561688.getClass(), "breakSe", 0);
        setIntField(term561688, term561688.getClass(), "breakVolume", 0);
        setIntField(term561688, term561688.getClass(), "exSe", 0);
        setIntField(term561688, term561688.getClass(), "exVolume", 0);
        setIntField(term561688, term561688.getClass(), "slideSe", 0);
        setIntField(term561688, term561688.getClass(), "slideVolume", 0);
        setIntField(term561688, term561688.getClass(), "touchHoldVolume", 0);
        setIntField(term561688, term561688.getClass(), "damageSeVolume", 0);
        setIntField(term561688, term561688.getClass(), "headPhoneVolume", 0);
        setIntField(term561688, term561688.getClass(), "sortTab", 0);
        setIntField(term561688, term561688.getClass(), "sortMusic", 0);
        term561734 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term561734;
        callMethod(klass, "setTouchEffect", argTypes, term561688, args);
    }

};


