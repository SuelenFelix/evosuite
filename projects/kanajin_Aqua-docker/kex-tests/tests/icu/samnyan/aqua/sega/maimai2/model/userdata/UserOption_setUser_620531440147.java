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

public class UserOption_setUser_620531440147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560826;

    public UserOption_setUser_620531440147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560826 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term560826, term560826.getClass(), "id", 0L);
        setField(term560826, term560826.getClass(), "user", null);
        setIntField(term560826, term560826.getClass(), "optionKind", 0);
        setIntField(term560826, term560826.getClass(), "noteSpeed", 0);
        setIntField(term560826, term560826.getClass(), "slideSpeed", 0);
        setIntField(term560826, term560826.getClass(), "touchSpeed", 0);
        setIntField(term560826, term560826.getClass(), "tapDesign", 0);
        setIntField(term560826, term560826.getClass(), "holdDesign", 0);
        setIntField(term560826, term560826.getClass(), "slideDesign", 0);
        setIntField(term560826, term560826.getClass(), "starType", 0);
        setIntField(term560826, term560826.getClass(), "outlineDesign", 0);
        setIntField(term560826, term560826.getClass(), "noteSize", 0);
        setIntField(term560826, term560826.getClass(), "slideSize", 0);
        setIntField(term560826, term560826.getClass(), "touchSize", 0);
        setIntField(term560826, term560826.getClass(), "starRotate", 0);
        setIntField(term560826, term560826.getClass(), "dispCenter", 0);
        setIntField(term560826, term560826.getClass(), "dispChain", 0);
        setIntField(term560826, term560826.getClass(), "dispRate", 0);
        setIntField(term560826, term560826.getClass(), "dispBar", 0);
        setIntField(term560826, term560826.getClass(), "touchEffect", 0);
        setIntField(term560826, term560826.getClass(), "submonitorAnimation", 0);
        setIntField(term560826, term560826.getClass(), "submonitorAchive", 0);
        setIntField(term560826, term560826.getClass(), "submonitorAppeal", 0);
        setIntField(term560826, term560826.getClass(), "matching", 0);
        setIntField(term560826, term560826.getClass(), "trackSkip", 0);
        setIntField(term560826, term560826.getClass(), "brightness", 0);
        setIntField(term560826, term560826.getClass(), "mirrorMode", 0);
        setIntField(term560826, term560826.getClass(), "dispJudge", 0);
        setIntField(term560826, term560826.getClass(), "dispJudgePos", 0);
        setIntField(term560826, term560826.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term560826, term560826.getClass(), "adjustTiming", 0);
        setIntField(term560826, term560826.getClass(), "judgeTiming", 0);
        setIntField(term560826, term560826.getClass(), "ansVolume", 0);
        setIntField(term560826, term560826.getClass(), "tapHoldVolume", 0);
        setIntField(term560826, term560826.getClass(), "criticalSe", 0);
        setIntField(term560826, term560826.getClass(), "breakSe", 0);
        setIntField(term560826, term560826.getClass(), "breakVolume", 0);
        setIntField(term560826, term560826.getClass(), "exSe", 0);
        setIntField(term560826, term560826.getClass(), "exVolume", 0);
        setIntField(term560826, term560826.getClass(), "slideSe", 0);
        setIntField(term560826, term560826.getClass(), "slideVolume", 0);
        setIntField(term560826, term560826.getClass(), "touchHoldVolume", 0);
        setIntField(term560826, term560826.getClass(), "damageSeVolume", 0);
        setIntField(term560826, term560826.getClass(), "headPhoneVolume", 0);
        setIntField(term560826, term560826.getClass(), "sortTab", 0);
        setIntField(term560826, term560826.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term560826, args);
    }

};


