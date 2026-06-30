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

public class UserOption_getSubmonitorAchive_348238970121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559628;

    public UserOption_getSubmonitorAchive_348238970121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559628 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term559628, term559628.getClass(), "id", 0L);
        setField(term559628, term559628.getClass(), "user", null);
        setIntField(term559628, term559628.getClass(), "optionKind", 0);
        setIntField(term559628, term559628.getClass(), "noteSpeed", 0);
        setIntField(term559628, term559628.getClass(), "slideSpeed", 0);
        setIntField(term559628, term559628.getClass(), "touchSpeed", 0);
        setIntField(term559628, term559628.getClass(), "tapDesign", 0);
        setIntField(term559628, term559628.getClass(), "holdDesign", 0);
        setIntField(term559628, term559628.getClass(), "slideDesign", 0);
        setIntField(term559628, term559628.getClass(), "starType", 0);
        setIntField(term559628, term559628.getClass(), "outlineDesign", 0);
        setIntField(term559628, term559628.getClass(), "noteSize", 0);
        setIntField(term559628, term559628.getClass(), "slideSize", 0);
        setIntField(term559628, term559628.getClass(), "touchSize", 0);
        setIntField(term559628, term559628.getClass(), "starRotate", 0);
        setIntField(term559628, term559628.getClass(), "dispCenter", 0);
        setIntField(term559628, term559628.getClass(), "dispChain", 0);
        setIntField(term559628, term559628.getClass(), "dispRate", 0);
        setIntField(term559628, term559628.getClass(), "dispBar", 0);
        setIntField(term559628, term559628.getClass(), "touchEffect", 0);
        setIntField(term559628, term559628.getClass(), "submonitorAnimation", 0);
        setIntField(term559628, term559628.getClass(), "submonitorAchive", 0);
        setIntField(term559628, term559628.getClass(), "submonitorAppeal", 0);
        setIntField(term559628, term559628.getClass(), "matching", 0);
        setIntField(term559628, term559628.getClass(), "trackSkip", 0);
        setIntField(term559628, term559628.getClass(), "brightness", 0);
        setIntField(term559628, term559628.getClass(), "mirrorMode", 0);
        setIntField(term559628, term559628.getClass(), "dispJudge", 0);
        setIntField(term559628, term559628.getClass(), "dispJudgePos", 0);
        setIntField(term559628, term559628.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term559628, term559628.getClass(), "adjustTiming", 0);
        setIntField(term559628, term559628.getClass(), "judgeTiming", 0);
        setIntField(term559628, term559628.getClass(), "ansVolume", 0);
        setIntField(term559628, term559628.getClass(), "tapHoldVolume", 0);
        setIntField(term559628, term559628.getClass(), "criticalSe", 0);
        setIntField(term559628, term559628.getClass(), "breakSe", 0);
        setIntField(term559628, term559628.getClass(), "breakVolume", 0);
        setIntField(term559628, term559628.getClass(), "exSe", 0);
        setIntField(term559628, term559628.getClass(), "exVolume", 0);
        setIntField(term559628, term559628.getClass(), "slideSe", 0);
        setIntField(term559628, term559628.getClass(), "slideVolume", 0);
        setIntField(term559628, term559628.getClass(), "touchHoldVolume", 0);
        setIntField(term559628, term559628.getClass(), "damageSeVolume", 0);
        setIntField(term559628, term559628.getClass(), "headPhoneVolume", 0);
        setIntField(term559628, term559628.getClass(), "sortTab", 0);
        setIntField(term559628, term559628.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubmonitorAchive", argTypes, term559628, args);
    }

};


