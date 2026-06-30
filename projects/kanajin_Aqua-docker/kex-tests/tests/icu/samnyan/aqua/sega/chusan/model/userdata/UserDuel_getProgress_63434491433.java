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

public class UserDuel_getProgress_63434491433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17458;

    public UserDuel_getProgress_63434491433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17458 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel"));
        setLongField(term17458, term17458.getClass(), "id", 0L);
        setField(term17458, term17458.getClass(), "user", null);
        setIntField(term17458, term17458.getClass(), "duelId", 0);
        setIntField(term17458, term17458.getClass(), "progress", 0);
        setIntField(term17458, term17458.getClass(), "point", 0);
        setBooleanField(term17458, term17458.getClass(), "isClear", false);
        setField(term17458, term17458.getClass(), "lastPlayDate", null);
        setIntField(term17458, term17458.getClass(), "param1", 0);
        setIntField(term17458, term17458.getClass(), "param2", 0);
        setIntField(term17458, term17458.getClass(), "param3", 0);
        setIntField(term17458, term17458.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProgress", argTypes, term17458, args);
    }

};


