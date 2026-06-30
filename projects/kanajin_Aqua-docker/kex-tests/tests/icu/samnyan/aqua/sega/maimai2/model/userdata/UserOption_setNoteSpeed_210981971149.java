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

public class UserOption_setNoteSpeed_210981971149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560920;
     Object term560966;

    public UserOption_setNoteSpeed_210981971149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560920 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term560920, term560920.getClass(), "id", 0L);
        setField(term560920, term560920.getClass(), "user", null);
        setIntField(term560920, term560920.getClass(), "optionKind", 0);
        setIntField(term560920, term560920.getClass(), "noteSpeed", 0);
        setIntField(term560920, term560920.getClass(), "slideSpeed", 0);
        setIntField(term560920, term560920.getClass(), "touchSpeed", 0);
        setIntField(term560920, term560920.getClass(), "tapDesign", 0);
        setIntField(term560920, term560920.getClass(), "holdDesign", 0);
        setIntField(term560920, term560920.getClass(), "slideDesign", 0);
        setIntField(term560920, term560920.getClass(), "starType", 0);
        setIntField(term560920, term560920.getClass(), "outlineDesign", 0);
        setIntField(term560920, term560920.getClass(), "noteSize", 0);
        setIntField(term560920, term560920.getClass(), "slideSize", 0);
        setIntField(term560920, term560920.getClass(), "touchSize", 0);
        setIntField(term560920, term560920.getClass(), "starRotate", 0);
        setIntField(term560920, term560920.getClass(), "dispCenter", 0);
        setIntField(term560920, term560920.getClass(), "dispChain", 0);
        setIntField(term560920, term560920.getClass(), "dispRate", 0);
        setIntField(term560920, term560920.getClass(), "dispBar", 0);
        setIntField(term560920, term560920.getClass(), "touchEffect", 0);
        setIntField(term560920, term560920.getClass(), "submonitorAnimation", 0);
        setIntField(term560920, term560920.getClass(), "submonitorAchive", 0);
        setIntField(term560920, term560920.getClass(), "submonitorAppeal", 0);
        setIntField(term560920, term560920.getClass(), "matching", 0);
        setIntField(term560920, term560920.getClass(), "trackSkip", 0);
        setIntField(term560920, term560920.getClass(), "brightness", 0);
        setIntField(term560920, term560920.getClass(), "mirrorMode", 0);
        setIntField(term560920, term560920.getClass(), "dispJudge", 0);
        setIntField(term560920, term560920.getClass(), "dispJudgePos", 0);
        setIntField(term560920, term560920.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term560920, term560920.getClass(), "adjustTiming", 0);
        setIntField(term560920, term560920.getClass(), "judgeTiming", 0);
        setIntField(term560920, term560920.getClass(), "ansVolume", 0);
        setIntField(term560920, term560920.getClass(), "tapHoldVolume", 0);
        setIntField(term560920, term560920.getClass(), "criticalSe", 0);
        setIntField(term560920, term560920.getClass(), "breakSe", 0);
        setIntField(term560920, term560920.getClass(), "breakVolume", 0);
        setIntField(term560920, term560920.getClass(), "exSe", 0);
        setIntField(term560920, term560920.getClass(), "exVolume", 0);
        setIntField(term560920, term560920.getClass(), "slideSe", 0);
        setIntField(term560920, term560920.getClass(), "slideVolume", 0);
        setIntField(term560920, term560920.getClass(), "touchHoldVolume", 0);
        setIntField(term560920, term560920.getClass(), "damageSeVolume", 0);
        setIntField(term560920, term560920.getClass(), "headPhoneVolume", 0);
        setIntField(term560920, term560920.getClass(), "sortTab", 0);
        setIntField(term560920, term560920.getClass(), "sortMusic", 0);
        term560966 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term560966;
        callMethod(klass, "setNoteSpeed", argTypes, term560920, args);
    }

};


