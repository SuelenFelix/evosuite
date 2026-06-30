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

public class UserOption_getCriticalSe_1277391563134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560226;

    public UserOption_getCriticalSe_1277391563134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560226 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term560226, term560226.getClass(), "id", 0L);
        setField(term560226, term560226.getClass(), "user", null);
        setIntField(term560226, term560226.getClass(), "optionKind", 0);
        setIntField(term560226, term560226.getClass(), "noteSpeed", 0);
        setIntField(term560226, term560226.getClass(), "slideSpeed", 0);
        setIntField(term560226, term560226.getClass(), "touchSpeed", 0);
        setIntField(term560226, term560226.getClass(), "tapDesign", 0);
        setIntField(term560226, term560226.getClass(), "holdDesign", 0);
        setIntField(term560226, term560226.getClass(), "slideDesign", 0);
        setIntField(term560226, term560226.getClass(), "starType", 0);
        setIntField(term560226, term560226.getClass(), "outlineDesign", 0);
        setIntField(term560226, term560226.getClass(), "noteSize", 0);
        setIntField(term560226, term560226.getClass(), "slideSize", 0);
        setIntField(term560226, term560226.getClass(), "touchSize", 0);
        setIntField(term560226, term560226.getClass(), "starRotate", 0);
        setIntField(term560226, term560226.getClass(), "dispCenter", 0);
        setIntField(term560226, term560226.getClass(), "dispChain", 0);
        setIntField(term560226, term560226.getClass(), "dispRate", 0);
        setIntField(term560226, term560226.getClass(), "dispBar", 0);
        setIntField(term560226, term560226.getClass(), "touchEffect", 0);
        setIntField(term560226, term560226.getClass(), "submonitorAnimation", 0);
        setIntField(term560226, term560226.getClass(), "submonitorAchive", 0);
        setIntField(term560226, term560226.getClass(), "submonitorAppeal", 0);
        setIntField(term560226, term560226.getClass(), "matching", 0);
        setIntField(term560226, term560226.getClass(), "trackSkip", 0);
        setIntField(term560226, term560226.getClass(), "brightness", 0);
        setIntField(term560226, term560226.getClass(), "mirrorMode", 0);
        setIntField(term560226, term560226.getClass(), "dispJudge", 0);
        setIntField(term560226, term560226.getClass(), "dispJudgePos", 0);
        setIntField(term560226, term560226.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term560226, term560226.getClass(), "adjustTiming", 0);
        setIntField(term560226, term560226.getClass(), "judgeTiming", 0);
        setIntField(term560226, term560226.getClass(), "ansVolume", 0);
        setIntField(term560226, term560226.getClass(), "tapHoldVolume", 0);
        setIntField(term560226, term560226.getClass(), "criticalSe", 0);
        setIntField(term560226, term560226.getClass(), "breakSe", 0);
        setIntField(term560226, term560226.getClass(), "breakVolume", 0);
        setIntField(term560226, term560226.getClass(), "exSe", 0);
        setIntField(term560226, term560226.getClass(), "exVolume", 0);
        setIntField(term560226, term560226.getClass(), "slideSe", 0);
        setIntField(term560226, term560226.getClass(), "slideVolume", 0);
        setIntField(term560226, term560226.getClass(), "touchHoldVolume", 0);
        setIntField(term560226, term560226.getClass(), "damageSeVolume", 0);
        setIntField(term560226, term560226.getClass(), "headPhoneVolume", 0);
        setIntField(term560226, term560226.getClass(), "sortTab", 0);
        setIntField(term560226, term560226.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCriticalSe", argTypes, term560226, args);
    }

};


