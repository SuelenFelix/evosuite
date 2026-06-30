package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserGameOption_equals_1772434932104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74715;

    public UserGameOption_equals_1772434932104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74715 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74715, term74715.getClass(), "id", 0L);
        setField(term74715, term74715.getClass(), "user", null);
        setIntField(term74715, term74715.getClass(), "bgInfo", 0);
        setIntField(term74715, term74715.getClass(), "fieldColor", 0);
        setIntField(term74715, term74715.getClass(), "guideSound", 0);
        setIntField(term74715, term74715.getClass(), "soundEffect", 0);
        setIntField(term74715, term74715.getClass(), "guideLine", 0);
        setIntField(term74715, term74715.getClass(), "speed", 0);
        setIntField(term74715, term74715.getClass(), "optionSet", 0);
        setIntField(term74715, term74715.getClass(), "matching", 0);
        setIntField(term74715, term74715.getClass(), "judgePos", 0);
        setIntField(term74715, term74715.getClass(), "rating", 0);
        setIntField(term74715, term74715.getClass(), "judgeJustice", 0);
        setIntField(term74715, term74715.getClass(), "judgeAttack", 0);
        setIntField(term74715, term74715.getClass(), "headphone", 0);
        setIntField(term74715, term74715.getClass(), "playerLevel", 0);
        setIntField(term74715, term74715.getClass(), "successTap", 0);
        setIntField(term74715, term74715.getClass(), "successExTap", 0);
        setIntField(term74715, term74715.getClass(), "successSlideHold", 0);
        setIntField(term74715, term74715.getClass(), "successAir", 0);
        setIntField(term74715, term74715.getClass(), "successFlick", 0);
        setIntField(term74715, term74715.getClass(), "successSkill", 0);
        setIntField(term74715, term74715.getClass(), "successTapTimbre", 0);
        setIntField(term74715, term74715.getClass(), "privacy", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term74715, args);
    }

};


