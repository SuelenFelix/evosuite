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
import java.lang.Boolean;

public class UserCharacter_setValid_56731430448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120937;
     Object term120948;

    public UserCharacter_setValid_56731430448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120937 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120937, term120937.getClass(), "id", 0L);
        setField(term120937, term120937.getClass(), "user", null);
        setIntField(term120937, term120937.getClass(), "characterId", 0);
        setIntField(term120937, term120937.getClass(), "playCount", 0);
        setIntField(term120937, term120937.getClass(), "level", 0);
        setIntField(term120937, term120937.getClass(), "skillId", 0);
        setIntField(term120937, term120937.getClass(), "friendshipExp", 0);
        setBooleanField(term120937, term120937.getClass(), "isValid", false);
        setBooleanField(term120937, term120937.getClass(), "isNewMark", false);
        setIntField(term120937, term120937.getClass(), "param1", 0);
        setIntField(term120937, term120937.getClass(), "param2", 0);
        term120948 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term120948;
        callMethod(klass, "setValid", argTypes, term120937, args);
    }

};


