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
import java.lang.Integer;

public class UserOption_setDispRate_1077593694163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561592;
     Object term561638;

    public UserOption_setDispRate_1077593694163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561592 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term561592, term561592.getClass(), "id", 0L);
        setField(term561592, term561592.getClass(), "user", null);
        setIntField(term561592, term561592.getClass(), "optionKind", 0);
        setIntField(term561592, term561592.getClass(), "noteSpeed", 0);
        setIntField(term561592, term561592.getClass(), "slideSpeed", 0);
        setIntField(term561592, term561592.getClass(), "touchSpeed", 0);
        setIntField(term561592, term561592.getClass(), "tapDesign", 0);
        setIntField(term561592, term561592.getClass(), "holdDesign", 0);
        setIntField(term561592, term561592.getClass(), "slideDesign", 0);
        setIntField(term561592, term561592.getClass(), "starType", 0);
        setIntField(term561592, term561592.getClass(), "outlineDesign", 0);
        setIntField(term561592, term561592.getClass(), "noteSize", 0);
        setIntField(term561592, term561592.getClass(), "slideSize", 0);
        setIntField(term561592, term561592.getClass(), "touchSize", 0);
        setIntField(term561592, term561592.getClass(), "starRotate", 0);
        setIntField(term561592, term561592.getClass(), "dispCenter", 0);
        setIntField(term561592, term561592.getClass(), "dispChain", 0);
        setIntField(term561592, term561592.getClass(), "dispRate", 0);
        setIntField(term561592, term561592.getClass(), "dispBar", 0);
        setIntField(term561592, term561592.getClass(), "touchEffect", 0);
        setIntField(term561592, term561592.getClass(), "submonitorAnimation", 0);
        setIntField(term561592, term561592.getClass(), "submonitorAchive", 0);
        setIntField(term561592, term561592.getClass(), "submonitorAppeal", 0);
        setIntField(term561592, term561592.getClass(), "matching", 0);
        setIntField(term561592, term561592.getClass(), "trackSkip", 0);
        setIntField(term561592, term561592.getClass(), "brightness", 0);
        setIntField(term561592, term561592.getClass(), "mirrorMode", 0);
        setIntField(term561592, term561592.getClass(), "dispJudge", 0);
        setIntField(term561592, term561592.getClass(), "dispJudgePos", 0);
        setIntField(term561592, term561592.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term561592, term561592.getClass(), "adjustTiming", 0);
        setIntField(term561592, term561592.getClass(), "judgeTiming", 0);
        setIntField(term561592, term561592.getClass(), "ansVolume", 0);
        setIntField(term561592, term561592.getClass(), "tapHoldVolume", 0);
        setIntField(term561592, term561592.getClass(), "criticalSe", 0);
        setIntField(term561592, term561592.getClass(), "breakSe", 0);
        setIntField(term561592, term561592.getClass(), "breakVolume", 0);
        setIntField(term561592, term561592.getClass(), "exSe", 0);
        setIntField(term561592, term561592.getClass(), "exVolume", 0);
        setIntField(term561592, term561592.getClass(), "slideSe", 0);
        setIntField(term561592, term561592.getClass(), "slideVolume", 0);
        setIntField(term561592, term561592.getClass(), "touchHoldVolume", 0);
        setIntField(term561592, term561592.getClass(), "damageSeVolume", 0);
        setIntField(term561592, term561592.getClass(), "headPhoneVolume", 0);
        setIntField(term561592, term561592.getClass(), "sortTab", 0);
        setIntField(term561592, term561592.getClass(), "sortMusic", 0);
        term561638 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term561638;
        callMethod(klass, "setDispRate", argTypes, term561592, args);
    }

};


