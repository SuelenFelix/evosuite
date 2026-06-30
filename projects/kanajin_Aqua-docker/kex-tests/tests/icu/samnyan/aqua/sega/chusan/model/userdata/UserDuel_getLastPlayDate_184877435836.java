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

public class UserDuel_getLastPlayDate_184877435836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17488;

    public UserDuel_getLastPlayDate_184877435836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17488 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel"));
        setLongField(term17488, term17488.getClass(), "id", 0L);
        setField(term17488, term17488.getClass(), "user", null);
        setIntField(term17488, term17488.getClass(), "duelId", 0);
        setIntField(term17488, term17488.getClass(), "progress", 0);
        setIntField(term17488, term17488.getClass(), "point", 0);
        setBooleanField(term17488, term17488.getClass(), "isClear", false);
        setField(term17488, term17488.getClass(), "lastPlayDate", null);
        setIntField(term17488, term17488.getClass(), "param1", 0);
        setIntField(term17488, term17488.getClass(), "param2", 0);
        setIntField(term17488, term17488.getClass(), "param3", 0);
        setIntField(term17488, term17488.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term17488, args);
    }

};


