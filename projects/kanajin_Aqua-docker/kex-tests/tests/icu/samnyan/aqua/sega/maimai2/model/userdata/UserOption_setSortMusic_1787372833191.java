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

public class UserOption_setSortMusic_1787372833191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562936;
     Object term562982;

    public UserOption_setSortMusic_1787372833191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562936 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term562936, term562936.getClass(), "id", 0L);
        setField(term562936, term562936.getClass(), "user", null);
        setIntField(term562936, term562936.getClass(), "optionKind", 0);
        setIntField(term562936, term562936.getClass(), "noteSpeed", 0);
        setIntField(term562936, term562936.getClass(), "slideSpeed", 0);
        setIntField(term562936, term562936.getClass(), "touchSpeed", 0);
        setIntField(term562936, term562936.getClass(), "tapDesign", 0);
        setIntField(term562936, term562936.getClass(), "holdDesign", 0);
        setIntField(term562936, term562936.getClass(), "slideDesign", 0);
        setIntField(term562936, term562936.getClass(), "starType", 0);
        setIntField(term562936, term562936.getClass(), "outlineDesign", 0);
        setIntField(term562936, term562936.getClass(), "noteSize", 0);
        setIntField(term562936, term562936.getClass(), "slideSize", 0);
        setIntField(term562936, term562936.getClass(), "touchSize", 0);
        setIntField(term562936, term562936.getClass(), "starRotate", 0);
        setIntField(term562936, term562936.getClass(), "dispCenter", 0);
        setIntField(term562936, term562936.getClass(), "dispChain", 0);
        setIntField(term562936, term562936.getClass(), "dispRate", 0);
        setIntField(term562936, term562936.getClass(), "dispBar", 0);
        setIntField(term562936, term562936.getClass(), "touchEffect", 0);
        setIntField(term562936, term562936.getClass(), "submonitorAnimation", 0);
        setIntField(term562936, term562936.getClass(), "submonitorAchive", 0);
        setIntField(term562936, term562936.getClass(), "submonitorAppeal", 0);
        setIntField(term562936, term562936.getClass(), "matching", 0);
        setIntField(term562936, term562936.getClass(), "trackSkip", 0);
        setIntField(term562936, term562936.getClass(), "brightness", 0);
        setIntField(term562936, term562936.getClass(), "mirrorMode", 0);
        setIntField(term562936, term562936.getClass(), "dispJudge", 0);
        setIntField(term562936, term562936.getClass(), "dispJudgePos", 0);
        setIntField(term562936, term562936.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term562936, term562936.getClass(), "adjustTiming", 0);
        setIntField(term562936, term562936.getClass(), "judgeTiming", 0);
        setIntField(term562936, term562936.getClass(), "ansVolume", 0);
        setIntField(term562936, term562936.getClass(), "tapHoldVolume", 0);
        setIntField(term562936, term562936.getClass(), "criticalSe", 0);
        setIntField(term562936, term562936.getClass(), "breakSe", 0);
        setIntField(term562936, term562936.getClass(), "breakVolume", 0);
        setIntField(term562936, term562936.getClass(), "exSe", 0);
        setIntField(term562936, term562936.getClass(), "exVolume", 0);
        setIntField(term562936, term562936.getClass(), "slideSe", 0);
        setIntField(term562936, term562936.getClass(), "slideVolume", 0);
        setIntField(term562936, term562936.getClass(), "touchHoldVolume", 0);
        setIntField(term562936, term562936.getClass(), "damageSeVolume", 0);
        setIntField(term562936, term562936.getClass(), "headPhoneVolume", 0);
        setIntField(term562936, term562936.getClass(), "sortTab", 0);
        setIntField(term562936, term562936.getClass(), "sortMusic", 0);
        term562982 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term562982;
        callMethod(klass, "setSortMusic", argTypes, term562936, args);
    }

};


