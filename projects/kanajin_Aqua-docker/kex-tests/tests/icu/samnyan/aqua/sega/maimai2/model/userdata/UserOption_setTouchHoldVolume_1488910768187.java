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

public class UserOption_setTouchHoldVolume_1488910768187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562744;
     Object term562790;

    public UserOption_setTouchHoldVolume_1488910768187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562744 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term562744, term562744.getClass(), "id", 0L);
        setField(term562744, term562744.getClass(), "user", null);
        setIntField(term562744, term562744.getClass(), "optionKind", 0);
        setIntField(term562744, term562744.getClass(), "noteSpeed", 0);
        setIntField(term562744, term562744.getClass(), "slideSpeed", 0);
        setIntField(term562744, term562744.getClass(), "touchSpeed", 0);
        setIntField(term562744, term562744.getClass(), "tapDesign", 0);
        setIntField(term562744, term562744.getClass(), "holdDesign", 0);
        setIntField(term562744, term562744.getClass(), "slideDesign", 0);
        setIntField(term562744, term562744.getClass(), "starType", 0);
        setIntField(term562744, term562744.getClass(), "outlineDesign", 0);
        setIntField(term562744, term562744.getClass(), "noteSize", 0);
        setIntField(term562744, term562744.getClass(), "slideSize", 0);
        setIntField(term562744, term562744.getClass(), "touchSize", 0);
        setIntField(term562744, term562744.getClass(), "starRotate", 0);
        setIntField(term562744, term562744.getClass(), "dispCenter", 0);
        setIntField(term562744, term562744.getClass(), "dispChain", 0);
        setIntField(term562744, term562744.getClass(), "dispRate", 0);
        setIntField(term562744, term562744.getClass(), "dispBar", 0);
        setIntField(term562744, term562744.getClass(), "touchEffect", 0);
        setIntField(term562744, term562744.getClass(), "submonitorAnimation", 0);
        setIntField(term562744, term562744.getClass(), "submonitorAchive", 0);
        setIntField(term562744, term562744.getClass(), "submonitorAppeal", 0);
        setIntField(term562744, term562744.getClass(), "matching", 0);
        setIntField(term562744, term562744.getClass(), "trackSkip", 0);
        setIntField(term562744, term562744.getClass(), "brightness", 0);
        setIntField(term562744, term562744.getClass(), "mirrorMode", 0);
        setIntField(term562744, term562744.getClass(), "dispJudge", 0);
        setIntField(term562744, term562744.getClass(), "dispJudgePos", 0);
        setIntField(term562744, term562744.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term562744, term562744.getClass(), "adjustTiming", 0);
        setIntField(term562744, term562744.getClass(), "judgeTiming", 0);
        setIntField(term562744, term562744.getClass(), "ansVolume", 0);
        setIntField(term562744, term562744.getClass(), "tapHoldVolume", 0);
        setIntField(term562744, term562744.getClass(), "criticalSe", 0);
        setIntField(term562744, term562744.getClass(), "breakSe", 0);
        setIntField(term562744, term562744.getClass(), "breakVolume", 0);
        setIntField(term562744, term562744.getClass(), "exSe", 0);
        setIntField(term562744, term562744.getClass(), "exVolume", 0);
        setIntField(term562744, term562744.getClass(), "slideSe", 0);
        setIntField(term562744, term562744.getClass(), "slideVolume", 0);
        setIntField(term562744, term562744.getClass(), "touchHoldVolume", 0);
        setIntField(term562744, term562744.getClass(), "damageSeVolume", 0);
        setIntField(term562744, term562744.getClass(), "headPhoneVolume", 0);
        setIntField(term562744, term562744.getClass(), "sortTab", 0);
        setIntField(term562744, term562744.getClass(), "sortMusic", 0);
        term562790 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term562790;
        callMethod(klass, "setTouchHoldVolume", argTypes, term562744, args);
    }

};


