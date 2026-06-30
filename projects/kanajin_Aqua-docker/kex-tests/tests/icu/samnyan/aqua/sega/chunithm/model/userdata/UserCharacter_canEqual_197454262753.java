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

public class UserCharacter_canEqual_197454262753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121000;

    public UserCharacter_canEqual_197454262753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121000 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term121000, term121000.getClass(), "id", 0L);
        setField(term121000, term121000.getClass(), "user", null);
        setIntField(term121000, term121000.getClass(), "characterId", 0);
        setIntField(term121000, term121000.getClass(), "playCount", 0);
        setIntField(term121000, term121000.getClass(), "level", 0);
        setIntField(term121000, term121000.getClass(), "skillId", 0);
        setIntField(term121000, term121000.getClass(), "friendshipExp", 0);
        setBooleanField(term121000, term121000.getClass(), "isValid", false);
        setBooleanField(term121000, term121000.getClass(), "isNewMark", false);
        setIntField(term121000, term121000.getClass(), "param1", 0);
        setIntField(term121000, term121000.getClass(), "param2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term121000, args);
    }

};


