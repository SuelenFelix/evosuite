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

public class UserOption_hashCode_1835783265194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563076;

    public UserOption_hashCode_1835783265194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563076 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term563076, term563076.getClass(), "id", 0L);
        setField(term563076, term563076.getClass(), "user", null);
        setIntField(term563076, term563076.getClass(), "optionKind", 0);
        setIntField(term563076, term563076.getClass(), "noteSpeed", 0);
        setIntField(term563076, term563076.getClass(), "slideSpeed", 0);
        setIntField(term563076, term563076.getClass(), "touchSpeed", 0);
        setIntField(term563076, term563076.getClass(), "tapDesign", 0);
        setIntField(term563076, term563076.getClass(), "holdDesign", 0);
        setIntField(term563076, term563076.getClass(), "slideDesign", 0);
        setIntField(term563076, term563076.getClass(), "starType", 0);
        setIntField(term563076, term563076.getClass(), "outlineDesign", 0);
        setIntField(term563076, term563076.getClass(), "noteSize", 0);
        setIntField(term563076, term563076.getClass(), "slideSize", 0);
        setIntField(term563076, term563076.getClass(), "touchSize", 0);
        setIntField(term563076, term563076.getClass(), "starRotate", 0);
        setIntField(term563076, term563076.getClass(), "dispCenter", 0);
        setIntField(term563076, term563076.getClass(), "dispChain", 0);
        setIntField(term563076, term563076.getClass(), "dispRate", 0);
        setIntField(term563076, term563076.getClass(), "dispBar", 0);
        setIntField(term563076, term563076.getClass(), "touchEffect", 0);
        setIntField(term563076, term563076.getClass(), "submonitorAnimation", 0);
        setIntField(term563076, term563076.getClass(), "submonitorAchive", 0);
        setIntField(term563076, term563076.getClass(), "submonitorAppeal", 0);
        setIntField(term563076, term563076.getClass(), "matching", 0);
        setIntField(term563076, term563076.getClass(), "trackSkip", 0);
        setIntField(term563076, term563076.getClass(), "brightness", 0);
        setIntField(term563076, term563076.getClass(), "mirrorMode", 0);
        setIntField(term563076, term563076.getClass(), "dispJudge", 0);
        setIntField(term563076, term563076.getClass(), "dispJudgePos", 0);
        setIntField(term563076, term563076.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term563076, term563076.getClass(), "adjustTiming", 0);
        setIntField(term563076, term563076.getClass(), "judgeTiming", 0);
        setIntField(term563076, term563076.getClass(), "ansVolume", 0);
        setIntField(term563076, term563076.getClass(), "tapHoldVolume", 0);
        setIntField(term563076, term563076.getClass(), "criticalSe", 0);
        setIntField(term563076, term563076.getClass(), "breakSe", 0);
        setIntField(term563076, term563076.getClass(), "breakVolume", 0);
        setIntField(term563076, term563076.getClass(), "exSe", 0);
        setIntField(term563076, term563076.getClass(), "exVolume", 0);
        setIntField(term563076, term563076.getClass(), "slideSe", 0);
        setIntField(term563076, term563076.getClass(), "slideVolume", 0);
        setIntField(term563076, term563076.getClass(), "touchHoldVolume", 0);
        setIntField(term563076, term563076.getClass(), "damageSeVolume", 0);
        setIntField(term563076, term563076.getClass(), "headPhoneVolume", 0);
        setIntField(term563076, term563076.getClass(), "sortTab", 0);
        setIntField(term563076, term563076.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term563076, args);
    }

};


