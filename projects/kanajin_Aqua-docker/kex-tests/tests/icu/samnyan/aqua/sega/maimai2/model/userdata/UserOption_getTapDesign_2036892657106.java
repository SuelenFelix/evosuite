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

public class UserOption_getTapDesign_2036892657106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558938;

    public UserOption_getTapDesign_2036892657106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558938 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term558938, term558938.getClass(), "id", 0L);
        setField(term558938, term558938.getClass(), "user", null);
        setIntField(term558938, term558938.getClass(), "optionKind", 0);
        setIntField(term558938, term558938.getClass(), "noteSpeed", 0);
        setIntField(term558938, term558938.getClass(), "slideSpeed", 0);
        setIntField(term558938, term558938.getClass(), "touchSpeed", 0);
        setIntField(term558938, term558938.getClass(), "tapDesign", 0);
        setIntField(term558938, term558938.getClass(), "holdDesign", 0);
        setIntField(term558938, term558938.getClass(), "slideDesign", 0);
        setIntField(term558938, term558938.getClass(), "starType", 0);
        setIntField(term558938, term558938.getClass(), "outlineDesign", 0);
        setIntField(term558938, term558938.getClass(), "noteSize", 0);
        setIntField(term558938, term558938.getClass(), "slideSize", 0);
        setIntField(term558938, term558938.getClass(), "touchSize", 0);
        setIntField(term558938, term558938.getClass(), "starRotate", 0);
        setIntField(term558938, term558938.getClass(), "dispCenter", 0);
        setIntField(term558938, term558938.getClass(), "dispChain", 0);
        setIntField(term558938, term558938.getClass(), "dispRate", 0);
        setIntField(term558938, term558938.getClass(), "dispBar", 0);
        setIntField(term558938, term558938.getClass(), "touchEffect", 0);
        setIntField(term558938, term558938.getClass(), "submonitorAnimation", 0);
        setIntField(term558938, term558938.getClass(), "submonitorAchive", 0);
        setIntField(term558938, term558938.getClass(), "submonitorAppeal", 0);
        setIntField(term558938, term558938.getClass(), "matching", 0);
        setIntField(term558938, term558938.getClass(), "trackSkip", 0);
        setIntField(term558938, term558938.getClass(), "brightness", 0);
        setIntField(term558938, term558938.getClass(), "mirrorMode", 0);
        setIntField(term558938, term558938.getClass(), "dispJudge", 0);
        setIntField(term558938, term558938.getClass(), "dispJudgePos", 0);
        setIntField(term558938, term558938.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term558938, term558938.getClass(), "adjustTiming", 0);
        setIntField(term558938, term558938.getClass(), "judgeTiming", 0);
        setIntField(term558938, term558938.getClass(), "ansVolume", 0);
        setIntField(term558938, term558938.getClass(), "tapHoldVolume", 0);
        setIntField(term558938, term558938.getClass(), "criticalSe", 0);
        setIntField(term558938, term558938.getClass(), "breakSe", 0);
        setIntField(term558938, term558938.getClass(), "breakVolume", 0);
        setIntField(term558938, term558938.getClass(), "exSe", 0);
        setIntField(term558938, term558938.getClass(), "exVolume", 0);
        setIntField(term558938, term558938.getClass(), "slideSe", 0);
        setIntField(term558938, term558938.getClass(), "slideVolume", 0);
        setIntField(term558938, term558938.getClass(), "touchHoldVolume", 0);
        setIntField(term558938, term558938.getClass(), "damageSeVolume", 0);
        setIntField(term558938, term558938.getClass(), "headPhoneVolume", 0);
        setIntField(term558938, term558938.getClass(), "sortTab", 0);
        setIntField(term558938, term558938.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapDesign", argTypes, term558938, args);
    }

};


