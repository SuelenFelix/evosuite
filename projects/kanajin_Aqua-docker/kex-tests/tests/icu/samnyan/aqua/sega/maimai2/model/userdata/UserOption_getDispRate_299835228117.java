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

public class UserOption_getDispRate_299835228117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559444;

    public UserOption_getDispRate_299835228117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559444 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term559444, term559444.getClass(), "id", 0L);
        setField(term559444, term559444.getClass(), "user", null);
        setIntField(term559444, term559444.getClass(), "optionKind", 0);
        setIntField(term559444, term559444.getClass(), "noteSpeed", 0);
        setIntField(term559444, term559444.getClass(), "slideSpeed", 0);
        setIntField(term559444, term559444.getClass(), "touchSpeed", 0);
        setIntField(term559444, term559444.getClass(), "tapDesign", 0);
        setIntField(term559444, term559444.getClass(), "holdDesign", 0);
        setIntField(term559444, term559444.getClass(), "slideDesign", 0);
        setIntField(term559444, term559444.getClass(), "starType", 0);
        setIntField(term559444, term559444.getClass(), "outlineDesign", 0);
        setIntField(term559444, term559444.getClass(), "noteSize", 0);
        setIntField(term559444, term559444.getClass(), "slideSize", 0);
        setIntField(term559444, term559444.getClass(), "touchSize", 0);
        setIntField(term559444, term559444.getClass(), "starRotate", 0);
        setIntField(term559444, term559444.getClass(), "dispCenter", 0);
        setIntField(term559444, term559444.getClass(), "dispChain", 0);
        setIntField(term559444, term559444.getClass(), "dispRate", 0);
        setIntField(term559444, term559444.getClass(), "dispBar", 0);
        setIntField(term559444, term559444.getClass(), "touchEffect", 0);
        setIntField(term559444, term559444.getClass(), "submonitorAnimation", 0);
        setIntField(term559444, term559444.getClass(), "submonitorAchive", 0);
        setIntField(term559444, term559444.getClass(), "submonitorAppeal", 0);
        setIntField(term559444, term559444.getClass(), "matching", 0);
        setIntField(term559444, term559444.getClass(), "trackSkip", 0);
        setIntField(term559444, term559444.getClass(), "brightness", 0);
        setIntField(term559444, term559444.getClass(), "mirrorMode", 0);
        setIntField(term559444, term559444.getClass(), "dispJudge", 0);
        setIntField(term559444, term559444.getClass(), "dispJudgePos", 0);
        setIntField(term559444, term559444.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term559444, term559444.getClass(), "adjustTiming", 0);
        setIntField(term559444, term559444.getClass(), "judgeTiming", 0);
        setIntField(term559444, term559444.getClass(), "ansVolume", 0);
        setIntField(term559444, term559444.getClass(), "tapHoldVolume", 0);
        setIntField(term559444, term559444.getClass(), "criticalSe", 0);
        setIntField(term559444, term559444.getClass(), "breakSe", 0);
        setIntField(term559444, term559444.getClass(), "breakVolume", 0);
        setIntField(term559444, term559444.getClass(), "exSe", 0);
        setIntField(term559444, term559444.getClass(), "exVolume", 0);
        setIntField(term559444, term559444.getClass(), "slideSe", 0);
        setIntField(term559444, term559444.getClass(), "slideVolume", 0);
        setIntField(term559444, term559444.getClass(), "touchHoldVolume", 0);
        setIntField(term559444, term559444.getClass(), "damageSeVolume", 0);
        setIntField(term559444, term559444.getClass(), "headPhoneVolume", 0);
        setIntField(term559444, term559444.getClass(), "sortTab", 0);
        setIntField(term559444, term559444.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispRate", argTypes, term559444, args);
    }

};


