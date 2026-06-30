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

public class UserOption_toString_1948424341195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563122;

    public UserOption_toString_1948424341195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563122 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term563122, term563122.getClass(), "id", 0L);
        setField(term563122, term563122.getClass(), "user", null);
        setIntField(term563122, term563122.getClass(), "optionKind", 0);
        setIntField(term563122, term563122.getClass(), "noteSpeed", 0);
        setIntField(term563122, term563122.getClass(), "slideSpeed", 0);
        setIntField(term563122, term563122.getClass(), "touchSpeed", 0);
        setIntField(term563122, term563122.getClass(), "tapDesign", 0);
        setIntField(term563122, term563122.getClass(), "holdDesign", 0);
        setIntField(term563122, term563122.getClass(), "slideDesign", 0);
        setIntField(term563122, term563122.getClass(), "starType", 0);
        setIntField(term563122, term563122.getClass(), "outlineDesign", 0);
        setIntField(term563122, term563122.getClass(), "noteSize", 0);
        setIntField(term563122, term563122.getClass(), "slideSize", 0);
        setIntField(term563122, term563122.getClass(), "touchSize", 0);
        setIntField(term563122, term563122.getClass(), "starRotate", 0);
        setIntField(term563122, term563122.getClass(), "dispCenter", 0);
        setIntField(term563122, term563122.getClass(), "dispChain", 0);
        setIntField(term563122, term563122.getClass(), "dispRate", 0);
        setIntField(term563122, term563122.getClass(), "dispBar", 0);
        setIntField(term563122, term563122.getClass(), "touchEffect", 0);
        setIntField(term563122, term563122.getClass(), "submonitorAnimation", 0);
        setIntField(term563122, term563122.getClass(), "submonitorAchive", 0);
        setIntField(term563122, term563122.getClass(), "submonitorAppeal", 0);
        setIntField(term563122, term563122.getClass(), "matching", 0);
        setIntField(term563122, term563122.getClass(), "trackSkip", 0);
        setIntField(term563122, term563122.getClass(), "brightness", 0);
        setIntField(term563122, term563122.getClass(), "mirrorMode", 0);
        setIntField(term563122, term563122.getClass(), "dispJudge", 0);
        setIntField(term563122, term563122.getClass(), "dispJudgePos", 0);
        setIntField(term563122, term563122.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term563122, term563122.getClass(), "adjustTiming", 0);
        setIntField(term563122, term563122.getClass(), "judgeTiming", 0);
        setIntField(term563122, term563122.getClass(), "ansVolume", 0);
        setIntField(term563122, term563122.getClass(), "tapHoldVolume", 0);
        setIntField(term563122, term563122.getClass(), "criticalSe", 0);
        setIntField(term563122, term563122.getClass(), "breakSe", 0);
        setIntField(term563122, term563122.getClass(), "breakVolume", 0);
        setIntField(term563122, term563122.getClass(), "exSe", 0);
        setIntField(term563122, term563122.getClass(), "exVolume", 0);
        setIntField(term563122, term563122.getClass(), "slideSe", 0);
        setIntField(term563122, term563122.getClass(), "slideVolume", 0);
        setIntField(term563122, term563122.getClass(), "touchHoldVolume", 0);
        setIntField(term563122, term563122.getClass(), "damageSeVolume", 0);
        setIntField(term563122, term563122.getClass(), "headPhoneVolume", 0);
        setIntField(term563122, term563122.getClass(), "sortTab", 0);
        setIntField(term563122, term563122.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term563122, args);
    }

};


