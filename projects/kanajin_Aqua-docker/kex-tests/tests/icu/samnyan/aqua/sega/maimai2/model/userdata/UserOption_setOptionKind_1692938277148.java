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

public class UserOption_setOptionKind_1692938277148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560872;
     Object term560918;

    public UserOption_setOptionKind_1692938277148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560872 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term560872, term560872.getClass(), "id", 0L);
        setField(term560872, term560872.getClass(), "user", null);
        setIntField(term560872, term560872.getClass(), "optionKind", 0);
        setIntField(term560872, term560872.getClass(), "noteSpeed", 0);
        setIntField(term560872, term560872.getClass(), "slideSpeed", 0);
        setIntField(term560872, term560872.getClass(), "touchSpeed", 0);
        setIntField(term560872, term560872.getClass(), "tapDesign", 0);
        setIntField(term560872, term560872.getClass(), "holdDesign", 0);
        setIntField(term560872, term560872.getClass(), "slideDesign", 0);
        setIntField(term560872, term560872.getClass(), "starType", 0);
        setIntField(term560872, term560872.getClass(), "outlineDesign", 0);
        setIntField(term560872, term560872.getClass(), "noteSize", 0);
        setIntField(term560872, term560872.getClass(), "slideSize", 0);
        setIntField(term560872, term560872.getClass(), "touchSize", 0);
        setIntField(term560872, term560872.getClass(), "starRotate", 0);
        setIntField(term560872, term560872.getClass(), "dispCenter", 0);
        setIntField(term560872, term560872.getClass(), "dispChain", 0);
        setIntField(term560872, term560872.getClass(), "dispRate", 0);
        setIntField(term560872, term560872.getClass(), "dispBar", 0);
        setIntField(term560872, term560872.getClass(), "touchEffect", 0);
        setIntField(term560872, term560872.getClass(), "submonitorAnimation", 0);
        setIntField(term560872, term560872.getClass(), "submonitorAchive", 0);
        setIntField(term560872, term560872.getClass(), "submonitorAppeal", 0);
        setIntField(term560872, term560872.getClass(), "matching", 0);
        setIntField(term560872, term560872.getClass(), "trackSkip", 0);
        setIntField(term560872, term560872.getClass(), "brightness", 0);
        setIntField(term560872, term560872.getClass(), "mirrorMode", 0);
        setIntField(term560872, term560872.getClass(), "dispJudge", 0);
        setIntField(term560872, term560872.getClass(), "dispJudgePos", 0);
        setIntField(term560872, term560872.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term560872, term560872.getClass(), "adjustTiming", 0);
        setIntField(term560872, term560872.getClass(), "judgeTiming", 0);
        setIntField(term560872, term560872.getClass(), "ansVolume", 0);
        setIntField(term560872, term560872.getClass(), "tapHoldVolume", 0);
        setIntField(term560872, term560872.getClass(), "criticalSe", 0);
        setIntField(term560872, term560872.getClass(), "breakSe", 0);
        setIntField(term560872, term560872.getClass(), "breakVolume", 0);
        setIntField(term560872, term560872.getClass(), "exSe", 0);
        setIntField(term560872, term560872.getClass(), "exVolume", 0);
        setIntField(term560872, term560872.getClass(), "slideSe", 0);
        setIntField(term560872, term560872.getClass(), "slideVolume", 0);
        setIntField(term560872, term560872.getClass(), "touchHoldVolume", 0);
        setIntField(term560872, term560872.getClass(), "damageSeVolume", 0);
        setIntField(term560872, term560872.getClass(), "headPhoneVolume", 0);
        setIntField(term560872, term560872.getClass(), "sortTab", 0);
        setIntField(term560872, term560872.getClass(), "sortMusic", 0);
        term560918 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term560918;
        callMethod(klass, "setOptionKind", argTypes, term560872, args);
    }

};


