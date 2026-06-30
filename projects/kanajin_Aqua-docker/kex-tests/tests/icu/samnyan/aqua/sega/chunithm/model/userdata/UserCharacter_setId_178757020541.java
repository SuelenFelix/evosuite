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

public class UserCharacter_setId_178757020541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120848;
     Object term120859;

    public UserCharacter_setId_178757020541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120848 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120848, term120848.getClass(), "id", 0L);
        setField(term120848, term120848.getClass(), "user", null);
        setIntField(term120848, term120848.getClass(), "characterId", 0);
        setIntField(term120848, term120848.getClass(), "playCount", 0);
        setIntField(term120848, term120848.getClass(), "level", 0);
        setIntField(term120848, term120848.getClass(), "skillId", 0);
        setIntField(term120848, term120848.getClass(), "friendshipExp", 0);
        setBooleanField(term120848, term120848.getClass(), "isValid", false);
        setBooleanField(term120848, term120848.getClass(), "isNewMark", false);
        setIntField(term120848, term120848.getClass(), "param1", 0);
        setIntField(term120848, term120848.getClass(), "param2", 0);
        term120859 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term120859;
        callMethod(klass, "setId", argTypes, term120848, args);
    }

};


