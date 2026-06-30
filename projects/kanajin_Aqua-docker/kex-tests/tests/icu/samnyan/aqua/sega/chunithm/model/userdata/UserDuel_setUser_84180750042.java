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

public class UserDuel_setUser_84180750042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87911;

    public UserDuel_setUser_84180750042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87911 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        setLongField(term87911, term87911.getClass(), "id", 0L);
        setField(term87911, term87911.getClass(), "user", null);
        setIntField(term87911, term87911.getClass(), "duelId", 0);
        setIntField(term87911, term87911.getClass(), "progress", 0);
        setIntField(term87911, term87911.getClass(), "point", 0);
        setBooleanField(term87911, term87911.getClass(), "isClear", false);
        setField(term87911, term87911.getClass(), "lastPlayDate", null);
        setIntField(term87911, term87911.getClass(), "param1", 0);
        setIntField(term87911, term87911.getClass(), "param2", 0);
        setIntField(term87911, term87911.getClass(), "param3", 0);
        setIntField(term87911, term87911.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term87911, args);
    }

};


