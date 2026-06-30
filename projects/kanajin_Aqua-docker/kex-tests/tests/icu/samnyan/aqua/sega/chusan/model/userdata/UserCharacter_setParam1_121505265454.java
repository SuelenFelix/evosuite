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
import java.lang.Integer;

public class UserCharacter_setParam1_121505265454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87621;
     Object term87633;

    public UserCharacter_setParam1_121505265454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87621 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter"));
        setLongField(term87621, term87621.getClass(), "id", 0L);
        setField(term87621, term87621.getClass(), "user", null);
        setIntField(term87621, term87621.getClass(), "characterId", 0);
        setIntField(term87621, term87621.getClass(), "playCount", 0);
        setIntField(term87621, term87621.getClass(), "level", 0);
        setIntField(term87621, term87621.getClass(), "friendshipExp", 0);
        setBooleanField(term87621, term87621.getClass(), "isValid", false);
        setBooleanField(term87621, term87621.getClass(), "isNewMark", false);
        setIntField(term87621, term87621.getClass(), "exMaxLv", 0);
        setIntField(term87621, term87621.getClass(), "assignIllust", 0);
        setIntField(term87621, term87621.getClass(), "param1", 0);
        setIntField(term87621, term87621.getClass(), "param2", 0);
        term87633 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term87633;
        callMethod(klass, "setParam1", argTypes, term87621, args);
    }

};


