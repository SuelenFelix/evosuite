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

public class UserOption_getTouchSpeed_237017858105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558892;

    public UserOption_getTouchSpeed_237017858105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558892 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term558892, term558892.getClass(), "id", 0L);
        setField(term558892, term558892.getClass(), "user", null);
        setIntField(term558892, term558892.getClass(), "optionKind", 0);
        setIntField(term558892, term558892.getClass(), "noteSpeed", 0);
        setIntField(term558892, term558892.getClass(), "slideSpeed", 0);
        setIntField(term558892, term558892.getClass(), "touchSpeed", 0);
        setIntField(term558892, term558892.getClass(), "tapDesign", 0);
        setIntField(term558892, term558892.getClass(), "holdDesign", 0);
        setIntField(term558892, term558892.getClass(), "slideDesign", 0);
        setIntField(term558892, term558892.getClass(), "starType", 0);
        setIntField(term558892, term558892.getClass(), "outlineDesign", 0);
        setIntField(term558892, term558892.getClass(), "noteSize", 0);
        setIntField(term558892, term558892.getClass(), "slideSize", 0);
        setIntField(term558892, term558892.getClass(), "touchSize", 0);
        setIntField(term558892, term558892.getClass(), "starRotate", 0);
        setIntField(term558892, term558892.getClass(), "dispCenter", 0);
        setIntField(term558892, term558892.getClass(), "dispChain", 0);
        setIntField(term558892, term558892.getClass(), "dispRate", 0);
        setIntField(term558892, term558892.getClass(), "dispBar", 0);
        setIntField(term558892, term558892.getClass(), "touchEffect", 0);
        setIntField(term558892, term558892.getClass(), "submonitorAnimation", 0);
        setIntField(term558892, term558892.getClass(), "submonitorAchive", 0);
        setIntField(term558892, term558892.getClass(), "submonitorAppeal", 0);
        setIntField(term558892, term558892.getClass(), "matching", 0);
        setIntField(term558892, term558892.getClass(), "trackSkip", 0);
        setIntField(term558892, term558892.getClass(), "brightness", 0);
        setIntField(term558892, term558892.getClass(), "mirrorMode", 0);
        setIntField(term558892, term558892.getClass(), "dispJudge", 0);
        setIntField(term558892, term558892.getClass(), "dispJudgePos", 0);
        setIntField(term558892, term558892.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term558892, term558892.getClass(), "adjustTiming", 0);
        setIntField(term558892, term558892.getClass(), "judgeTiming", 0);
        setIntField(term558892, term558892.getClass(), "ansVolume", 0);
        setIntField(term558892, term558892.getClass(), "tapHoldVolume", 0);
        setIntField(term558892, term558892.getClass(), "criticalSe", 0);
        setIntField(term558892, term558892.getClass(), "breakSe", 0);
        setIntField(term558892, term558892.getClass(), "breakVolume", 0);
        setIntField(term558892, term558892.getClass(), "exSe", 0);
        setIntField(term558892, term558892.getClass(), "exVolume", 0);
        setIntField(term558892, term558892.getClass(), "slideSe", 0);
        setIntField(term558892, term558892.getClass(), "slideVolume", 0);
        setIntField(term558892, term558892.getClass(), "touchHoldVolume", 0);
        setIntField(term558892, term558892.getClass(), "damageSeVolume", 0);
        setIntField(term558892, term558892.getClass(), "headPhoneVolume", 0);
        setIntField(term558892, term558892.getClass(), "sortTab", 0);
        setIntField(term558892, term558892.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTouchSpeed", argTypes, term558892, args);
    }

};


