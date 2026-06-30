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

public class UserCharacter_canEqual_49384149957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87661;

    public UserCharacter_canEqual_49384149957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87661 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter"));
        setLongField(term87661, term87661.getClass(), "id", 0L);
        setField(term87661, term87661.getClass(), "user", null);
        setIntField(term87661, term87661.getClass(), "characterId", 0);
        setIntField(term87661, term87661.getClass(), "playCount", 0);
        setIntField(term87661, term87661.getClass(), "level", 0);
        setIntField(term87661, term87661.getClass(), "friendshipExp", 0);
        setBooleanField(term87661, term87661.getClass(), "isValid", false);
        setBooleanField(term87661, term87661.getClass(), "isNewMark", false);
        setIntField(term87661, term87661.getClass(), "exMaxLv", 0);
        setIntField(term87661, term87661.getClass(), "assignIllust", 0);
        setIntField(term87661, term87661.getClass(), "param1", 0);
        setIntField(term87661, term87661.getClass(), "param2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term87661, args);
    }

};


