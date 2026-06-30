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

public class UserOption_setOutlineDesign_302501096156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561256;
     Object term561302;

    public UserOption_setOutlineDesign_302501096156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561256 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption"));
        setLongField(term561256, term561256.getClass(), "id", 0L);
        setField(term561256, term561256.getClass(), "user", null);
        setIntField(term561256, term561256.getClass(), "optionKind", 0);
        setIntField(term561256, term561256.getClass(), "noteSpeed", 0);
        setIntField(term561256, term561256.getClass(), "slideSpeed", 0);
        setIntField(term561256, term561256.getClass(), "touchSpeed", 0);
        setIntField(term561256, term561256.getClass(), "tapDesign", 0);
        setIntField(term561256, term561256.getClass(), "holdDesign", 0);
        setIntField(term561256, term561256.getClass(), "slideDesign", 0);
        setIntField(term561256, term561256.getClass(), "starType", 0);
        setIntField(term561256, term561256.getClass(), "outlineDesign", 0);
        setIntField(term561256, term561256.getClass(), "noteSize", 0);
        setIntField(term561256, term561256.getClass(), "slideSize", 0);
        setIntField(term561256, term561256.getClass(), "touchSize", 0);
        setIntField(term561256, term561256.getClass(), "starRotate", 0);
        setIntField(term561256, term561256.getClass(), "dispCenter", 0);
        setIntField(term561256, term561256.getClass(), "dispChain", 0);
        setIntField(term561256, term561256.getClass(), "dispRate", 0);
        setIntField(term561256, term561256.getClass(), "dispBar", 0);
        setIntField(term561256, term561256.getClass(), "touchEffect", 0);
        setIntField(term561256, term561256.getClass(), "submonitorAnimation", 0);
        setIntField(term561256, term561256.getClass(), "submonitorAchive", 0);
        setIntField(term561256, term561256.getClass(), "submonitorAppeal", 0);
        setIntField(term561256, term561256.getClass(), "matching", 0);
        setIntField(term561256, term561256.getClass(), "trackSkip", 0);
        setIntField(term561256, term561256.getClass(), "brightness", 0);
        setIntField(term561256, term561256.getClass(), "mirrorMode", 0);
        setIntField(term561256, term561256.getClass(), "dispJudge", 0);
        setIntField(term561256, term561256.getClass(), "dispJudgePos", 0);
        setIntField(term561256, term561256.getClass(), "dispJudgeTouchPos", 0);
        setIntField(term561256, term561256.getClass(), "adjustTiming", 0);
        setIntField(term561256, term561256.getClass(), "judgeTiming", 0);
        setIntField(term561256, term561256.getClass(), "ansVolume", 0);
        setIntField(term561256, term561256.getClass(), "tapHoldVolume", 0);
        setIntField(term561256, term561256.getClass(), "criticalSe", 0);
        setIntField(term561256, term561256.getClass(), "breakSe", 0);
        setIntField(term561256, term561256.getClass(), "breakVolume", 0);
        setIntField(term561256, term561256.getClass(), "exSe", 0);
        setIntField(term561256, term561256.getClass(), "exVolume", 0);
        setIntField(term561256, term561256.getClass(), "slideSe", 0);
        setIntField(term561256, term561256.getClass(), "slideVolume", 0);
        setIntField(term561256, term561256.getClass(), "touchHoldVolume", 0);
        setIntField(term561256, term561256.getClass(), "damageSeVolume", 0);
        setIntField(term561256, term561256.getClass(), "headPhoneVolume", 0);
        setIntField(term561256, term561256.getClass(), "sortTab", 0);
        setIntField(term561256, term561256.getClass(), "sortMusic", 0);
        term561302 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term561302;
        callMethod(klass, "setOutlineDesign", argTypes, term561256, args);
    }

};


