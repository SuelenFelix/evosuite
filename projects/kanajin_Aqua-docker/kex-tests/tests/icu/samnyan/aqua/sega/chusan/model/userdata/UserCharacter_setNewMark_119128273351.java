package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserCharacter_setNewMark_119128273351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87579;
     Object term87591;

    public UserCharacter_setNewMark_119128273351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87579 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter"));
        setLongField(term87579, term87579.getClass(), "id", 0L);
        setField(term87579, term87579.getClass(), "user", null);
        setIntField(term87579, term87579.getClass(), "characterId", 0);
        setIntField(term87579, term87579.getClass(), "playCount", 0);
        setIntField(term87579, term87579.getClass(), "level", 0);
        setIntField(term87579, term87579.getClass(), "friendshipExp", 0);
        setBooleanField(term87579, term87579.getClass(), "isValid", false);
        setBooleanField(term87579, term87579.getClass(), "isNewMark", false);
        setIntField(term87579, term87579.getClass(), "exMaxLv", 0);
        setIntField(term87579, term87579.getClass(), "assignIllust", 0);
        setIntField(term87579, term87579.getClass(), "param1", 0);
        setIntField(term87579, term87579.getClass(), "param2", 0);
        term87591 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term87591;
        callMethod(klass, "setNewMark", argTypes, term87579, args);
    }

};


