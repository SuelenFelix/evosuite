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
import java.lang.Integer;

public class UserGameOption_setHeadphone_154794844894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74455;
     Object term74479;

    public UserGameOption_setHeadphone_154794844894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74455 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74455, term74455.getClass(), "id", 0L);
        setField(term74455, term74455.getClass(), "user", null);
        setIntField(term74455, term74455.getClass(), "bgInfo", 0);
        setIntField(term74455, term74455.getClass(), "fieldColor", 0);
        setIntField(term74455, term74455.getClass(), "guideSound", 0);
        setIntField(term74455, term74455.getClass(), "soundEffect", 0);
        setIntField(term74455, term74455.getClass(), "guideLine", 0);
        setIntField(term74455, term74455.getClass(), "speed", 0);
        setIntField(term74455, term74455.getClass(), "optionSet", 0);
        setIntField(term74455, term74455.getClass(), "matching", 0);
        setIntField(term74455, term74455.getClass(), "judgePos", 0);
        setIntField(term74455, term74455.getClass(), "rating", 0);
        setIntField(term74455, term74455.getClass(), "judgeJustice", 0);
        setIntField(term74455, term74455.getClass(), "judgeAttack", 0);
        setIntField(term74455, term74455.getClass(), "headphone", 0);
        setIntField(term74455, term74455.getClass(), "playerLevel", 0);
        setIntField(term74455, term74455.getClass(), "successTap", 0);
        setIntField(term74455, term74455.getClass(), "successExTap", 0);
        setIntField(term74455, term74455.getClass(), "successSlideHold", 0);
        setIntField(term74455, term74455.getClass(), "successAir", 0);
        setIntField(term74455, term74455.getClass(), "successFlick", 0);
        setIntField(term74455, term74455.getClass(), "successSkill", 0);
        setIntField(term74455, term74455.getClass(), "successTapTimbre", 0);
        setIntField(term74455, term74455.getClass(), "privacy", 0);
        term74479 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74479;
        callMethod(klass, "setHeadphone", argTypes, term74455, args);
    }

};


