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

public class UserCharacter_setFriendshipExp_60631207147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120924;
     Object term120935;

    public UserCharacter_setFriendshipExp_60631207147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120924 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        setLongField(term120924, term120924.getClass(), "id", 0L);
        setField(term120924, term120924.getClass(), "user", null);
        setIntField(term120924, term120924.getClass(), "characterId", 0);
        setIntField(term120924, term120924.getClass(), "playCount", 0);
        setIntField(term120924, term120924.getClass(), "level", 0);
        setIntField(term120924, term120924.getClass(), "skillId", 0);
        setIntField(term120924, term120924.getClass(), "friendshipExp", 0);
        setBooleanField(term120924, term120924.getClass(), "isValid", false);
        setBooleanField(term120924, term120924.getClass(), "isNewMark", false);
        setIntField(term120924, term120924.getClass(), "param1", 0);
        setIntField(term120924, term120924.getClass(), "param2", 0);
        term120935 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120935;
        callMethod(klass, "setFriendshipExp", argTypes, term120924, args);
    }

};


