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

public class UserOption_getSlideSe_1450491569139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560456;

    public UserOption_getSlideSe_1450491569139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560456 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term560456, term560456.getClass(), "id", 0L);
        setField(term560456, term560456.getClass(), "user", null);
        setIntField(term560456, term560456.getClass(), "optionKind", 0);
        setIntField(term560456, term560456.getClass(), "noteSpeed", 0);
        setIntField(term560456, term560456.getClass(), "slideSpeed", 0);
        setIntField(term560456, term560456.getClass(), "touchSpeed", 0);
        setIntField(term560456, term560456.getClass(), "tapDesign", 0);
        setIntField(term560456, term560456.getClass(), "holdDesign", 0);
        setIntField(term560456, term560456.getClass(), "slideDesign", 0);
        setIntField(term560456, term560456.getClass(), "starType", 0);
        setIntField(term560456, term560456.getClass(), "outlineDesign", 0);
        setIntField(term560456, term560456.getClass(), "noteSize", 0);
        setIntField(term560456, term560456.getClass(), "slideSize", 0);
        setIntField(term560456, term560456.getClass(), "touchSize", 0);
        setIntField(term560456, term560456.getClass(), "starRotate", 0);
        setIntField(term560456, term560456.getClass(), "dispCenter", 0);
        setIntField(term560456, term560456.getClass(), "dispChain", 0);
        setIntField(term560456, term560456.getClass(), "dispRate", 0);
        setIntField(term560456, term560456.getClass(), "dispBar", 0);
        setIntField(term560456, term560456.getClass(), "touchEffect", 0);
        setIntField(term560456, term560456.getClass(), "submonitorAnimation", 0);
        setIntField(term560456, term560456.getClass(), "submonitorAchive", 0);
        setIntField(term560456, term560456.getClass(), "submonitorAppeal", 0);
        setIntField(term560456, term560456.getClass(), "matching", 0);
        setIntField(term560456, term560456.getClass(), "trackSkip", 0);
        setIntField(term560456, term560456.getClass(), "brightness", 0);
        setIntField(term560456, term560456.getClass(), "mirrorMode", 0);
        setIntField(term560456, term560456.getClass(), "dispJudge", 0);
        setIntField(term560456, term560456.getClass(), "dispJudgePos", 0);
        setIntField(term560456, term560456.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term560456, term560456.getClass(), "adjustTiming", 0);
        setIntField(term560456, term560456.getClass(), "judgeTiming", 0);
        setIntField(term560456, term560456.getClass(), "ansVolume", 0);
        setIntField(term560456, term560456.getClass(), "tapHoldVolume", 0);
        setIntField(term560456, term560456.getClass(), "criticalSe", 0);
        setIntField(term560456, term560456.getClass(), "breakSe", 0);
        setIntField(term560456, term560456.getClass(), "breakVolume", 0);
        setIntField(term560456, term560456.getClass(), "exSe", 0);
        setIntField(term560456, term560456.getClass(), "exVolume", 0);
        setIntField(term560456, term560456.getClass(), "slideSe", 0);
        setIntField(term560456, term560456.getClass(), "slideVolume", 0);
        setIntField(term560456, term560456.getClass(), "touchHoldVolume", 0);
        setIntField(term560456, term560456.getClass(), "damageSeVolume", 0);
        setIntField(term560456, term560456.getClass(), "headPhoneVolume", 0);
        setIntField(term560456, term560456.getClass(), "sortTab", 0);
        setIntField(term560456, term560456.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideSe", argTypes, term560456, args);
    }

};


