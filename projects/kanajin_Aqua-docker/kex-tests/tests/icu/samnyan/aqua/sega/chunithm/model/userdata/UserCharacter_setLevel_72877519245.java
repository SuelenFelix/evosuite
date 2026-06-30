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

public class UserCharacter_setLevel_72877519245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120898;
     Object term120909;

    public UserCharacter_setLevel_72877519245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120898 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120898, term120898.getClass(), "id", 0L);
        setField(term120898, term120898.getClass(), "user", null);
        setIntField(term120898, term120898.getClass(), "characterId", 0);
        setIntField(term120898, term120898.getClass(), "playCount", 0);
        setIntField(term120898, term120898.getClass(), "level", 0);
        setIntField(term120898, term120898.getClass(), "skillId", 0);
        setIntField(term120898, term120898.getClass(), "friendshipExp", 0);
        setBooleanField(term120898, term120898.getClass(), "isValid", false);
        setBooleanField(term120898, term120898.getClass(), "isNewMark", false);
        setIntField(term120898, term120898.getClass(), "param1", 0);
        setIntField(term120898, term120898.getClass(), "param2", 0);
        term120909 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120909;
        callMethod(klass, "setLevel", argTypes, term120898, args);
    }

};


