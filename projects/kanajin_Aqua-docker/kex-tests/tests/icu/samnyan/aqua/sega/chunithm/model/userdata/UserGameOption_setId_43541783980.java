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
import java.lang.Long;

public class UserGameOption_setId_43541783980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74093;
     Object term74117;

    public UserGameOption_setId_43541783980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74093 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74093, term74093.getClass(), "id", 0L);
        setField(term74093, term74093.getClass(), "user", null);
        setIntField(term74093, term74093.getClass(), "bgInfo", 0);
        setIntField(term74093, term74093.getClass(), "fieldColor", 0);
        setIntField(term74093, term74093.getClass(), "guideSound", 0);
        setIntField(term74093, term74093.getClass(), "soundEffect", 0);
        setIntField(term74093, term74093.getClass(), "guideLine", 0);
        setIntField(term74093, term74093.getClass(), "speed", 0);
        setIntField(term74093, term74093.getClass(), "optionSet", 0);
        setIntField(term74093, term74093.getClass(), "matching", 0);
        setIntField(term74093, term74093.getClass(), "judgePos", 0);
        setIntField(term74093, term74093.getClass(), "rating", 0);
        setIntField(term74093, term74093.getClass(), "judgeJustice", 0);
        setIntField(term74093, term74093.getClass(), "judgeAttack", 0);
        setIntField(term74093, term74093.getClass(), "headphone", 0);
        setIntField(term74093, term74093.getClass(), "playerLevel", 0);
        setIntField(term74093, term74093.getClass(), "successTap", 0);
        setIntField(term74093, term74093.getClass(), "successExTap", 0);
        setIntField(term74093, term74093.getClass(), "successSlideHold", 0);
        setIntField(term74093, term74093.getClass(), "successAir", 0);
        setIntField(term74093, term74093.getClass(), "successFlick", 0);
        setIntField(term74093, term74093.getClass(), "successSkill", 0);
        setIntField(term74093, term74093.getClass(), "successTapTimbre", 0);
        setIntField(term74093, term74093.getClass(), "privacy", 0);
        term74117 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term74117;
        callMethod(klass, "setId", argTypes, term74093, args);
    }

};


