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

public class UserOption_getDispJudgeTouchPos_229396696129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559996;

    public UserOption_getDispJudgeTouchPos_229396696129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559996 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term559996, term559996.getClass(), "id", 0L);
        setField(term559996, term559996.getClass(), "user", null);
        setIntField(term559996, term559996.getClass(), "optionKind", 0);
        setIntField(term559996, term559996.getClass(), "noteSpeed", 0);
        setIntField(term559996, term559996.getClass(), "slideSpeed", 0);
        setIntField(term559996, term559996.getClass(), "touchSpeed", 0);
        setIntField(term559996, term559996.getClass(), "tapDesign", 0);
        setIntField(term559996, term559996.getClass(), "holdDesign", 0);
        setIntField(term559996, term559996.getClass(), "slideDesign", 0);
        setIntField(term559996, term559996.getClass(), "starType", 0);
        setIntField(term559996, term559996.getClass(), "outlineDesign", 0);
        setIntField(term559996, term559996.getClass(), "noteSize", 0);
        setIntField(term559996, term559996.getClass(), "slideSize", 0);
        setIntField(term559996, term559996.getClass(), "touchSize", 0);
        setIntField(term559996, term559996.getClass(), "starRotate", 0);
        setIntField(term559996, term559996.getClass(), "dispCenter", 0);
        setIntField(term559996, term559996.getClass(), "dispChain", 0);
        setIntField(term559996, term559996.getClass(), "dispRate", 0);
        setIntField(term559996, term559996.getClass(), "dispBar", 0);
        setIntField(term559996, term559996.getClass(), "touchEffect", 0);
        setIntField(term559996, term559996.getClass(), "submonitorAnimation", 0);
        setIntField(term559996, term559996.getClass(), "submonitorAchive", 0);
        setIntField(term559996, term559996.getClass(), "submonitorAppeal", 0);
        setIntField(term559996, term559996.getClass(), "matching", 0);
        setIntField(term559996, term559996.getClass(), "trackSkip", 0);
        setIntField(term559996, term559996.getClass(), "brightness", 0);
        setIntField(term559996, term559996.getClass(), "mirrorMode", 0);
        setIntField(term559996, term559996.getClass(), "dispJudge", 0);
        setIntField(term559996, term559996.getClass(), "dispJudgePos", 0);
        setIntField(term559996, term559996.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term559996, term559996.getClass(), "adjustTiming", 0);
        setIntField(term559996, term559996.getClass(), "judgeTiming", 0);
        setIntField(term559996, term559996.getClass(), "ansVolume", 0);
        setIntField(term559996, term559996.getClass(), "tapHoldVolume", 0);
        setIntField(term559996, term559996.getClass(), "criticalSe", 0);
        setIntField(term559996, term559996.getClass(), "breakSe", 0);
        setIntField(term559996, term559996.getClass(), "breakVolume", 0);
        setIntField(term559996, term559996.getClass(), "exSe", 0);
        setIntField(term559996, term559996.getClass(), "exVolume", 0);
        setIntField(term559996, term559996.getClass(), "slideSe", 0);
        setIntField(term559996, term559996.getClass(), "slideVolume", 0);
        setIntField(term559996, term559996.getClass(), "touchHoldVolume", 0);
        setIntField(term559996, term559996.getClass(), "damageSeVolume", 0);
        setIntField(term559996, term559996.getClass(), "headPhoneVolume", 0);
        setIntField(term559996, term559996.getClass(), "sortTab", 0);
        setIntField(term559996, term559996.getClass(), "sortMusic", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispJudgeTouchPos", argTypes, term559996, args);
    }

};


