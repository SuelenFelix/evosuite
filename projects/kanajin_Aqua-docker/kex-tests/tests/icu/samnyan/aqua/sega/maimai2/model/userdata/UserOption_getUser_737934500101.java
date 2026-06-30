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

public class UserOption_getUser_737934500101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558708;

    public UserOption_getUser_737934500101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558708 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term558708, term558708.getClass(), "id", 0L);
        setField(term558708, term558708.getClass(), "user", null);
        setIntField(term558708, term558708.getClass(), "optionKind", 0);
        setIntField(term558708, term558708.getClass(), "noteSpeed", 0);
        setIntField(term558708, term558708.getClass(), "slideSpeed", 0);
        setIntField(term558708, term558708.getClass(), "touchSpeed", 0);
        setIntField(term558708, term558708.getClass(), "tapDesign", 0);
        setIntField(term558708, term558708.getClass(), "holdDesign", 0);
        setIntField(term558708, term558708.getClass(), "slideDesign", 0);
        setIntField(term558708, term558708.getClass(), "starType", 0);
        setIntField(term558708, term558708.getClass(), "outlineDesign", 0);
        setIntField(term558708, term558708.getClass(), "noteSize", 0);
        setIntField(term558708, term558708.getClass(), "slideSize", 0);
        setIntField(term558708, term558708.getClass(), "touchSize", 0);
        setIntField(term558708, term558708.getClass(), "starRotate", 0);
        setIntField(term558708, term558708.getClass(), "dispCenter", 0);
        setIntField(term558708, term558708.getClass(), "dispChain", 0);
        setIntField(term558708, term558708.getClass(), "dispRate", 0);
        setIntField(term558708, term558708.getClass(), "dispBar", 0);
        setIntField(term558708, term558708.getClass(), "touchEffect", 0);
        setIntField(term558708, term558708.getClass(), "submonitorAnimation", 0);
        setIntField(term558708, term558708.getClass(), "submonitorAchive", 0);
        setIntField(term558708, term558708.getClass(), "submonitorAppeal", 0);
        setIntField(term558708, term558708.getClass(), "matching", 0);
        setIntField(term558708, term558708.getClass(), "trackSkip", 0);
        setIntField(term558708, term558708.getClass(), "brightness", 0);
        setIntField(term558708, term558708.getClass(), "mirrorMode", 0);
        setIntField(term558708, term558708.getClass(), "dispJudge", 0);
        setIntField(term558708, term558708.getClass(), "dispJudgePos", 0);
        setIntField(term558708, term558708.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term558708, term558708.getClass(), "adjustTiming", 0);
        setIntField(term558708, term558708.getClass(), "judgeTiming", 0);
        setIntField(term558708, term558708.getClass(), "ansVolume", 0);
        setIntField(term558708, term558708.getClass(), "tapHoldVolume", 0);
        setIntField(term558708, term558708.getClass(), "criticalSe", 0);
        setIntField(term558708, term558708.getClass(), "breakSe", 0);
        setIntField(term558708, term558708.getClass(), "breakVolume", 0);
        setIntField(term558708, term558708.getClass(), "exSe", 0);
        setIntField(term558708, term558708.getClass(), "exVolume", 0);
        setIntField(term558708, term558708.getClass(), "slideSe", 0);
        setIntField(term558708, term558708.getClass(), "slideVolume", 0);
        setIntField(term558708, term558708.getClass(), "touchHoldVolume", 0);
        setIntField(term558708, term558708.getClass(), "damageSeVolume", 0);
        setIntField(term558708, term558708.getClass(), "headPhoneVolume", 0);
        setIntField(term558708, term558708.getClass(), "sortTab", 0);
        setIntField(term558708, term558708.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term558708, args);
    }

};


