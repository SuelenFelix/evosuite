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

public class UserCharacter_getPlayCount_25987979733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120760;

    public UserCharacter_getPlayCount_25987979733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120760 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120760, term120760.getClass(), "id", 0L);
        setField(term120760, term120760.getClass(), "user", null);
        setIntField(term120760, term120760.getClass(), "characterId", 0);
        setIntField(term120760, term120760.getClass(), "playCount", 0);
        setIntField(term120760, term120760.getClass(), "level", 0);
        setIntField(term120760, term120760.getClass(), "skillId", 0);
        setIntField(term120760, term120760.getClass(), "friendshipExp", 0);
        setBooleanField(term120760, term120760.getClass(), "isValid", false);
        setBooleanField(term120760, term120760.getClass(), "isNewMark", false);
        setIntField(term120760, term120760.getClass(), "param1", 0);
        setIntField(term120760, term120760.getClass(), "param2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term120760, args);
    }

};


