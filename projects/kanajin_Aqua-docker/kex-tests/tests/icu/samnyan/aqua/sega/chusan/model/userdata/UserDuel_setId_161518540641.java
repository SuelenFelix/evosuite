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
import java.lang.Long;

public class UserDuel_setId_161518540641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17538;
     Object term17548;

    public UserDuel_setId_161518540641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17538 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel"));
        setLongField(term17538, term17538.getClass(), "id", 0L);
        setField(term17538, term17538.getClass(), "user", null);
        setIntField(term17538, term17538.getClass(), "duelId", 0);
        setIntField(term17538, term17538.getClass(), "progress", 0);
        setIntField(term17538, term17538.getClass(), "point", 0);
        setBooleanField(term17538, term17538.getClass(), "isClear", false);
        setField(term17538, term17538.getClass(), "lastPlayDate", null);
        setIntField(term17538, term17538.getClass(), "param1", 0);
        setIntField(term17538, term17538.getClass(), "param2", 0);
        setIntField(term17538, term17538.getClass(), "param3", 0);
        setIntField(term17538, term17538.getClass(), "param4", 0);
        term17548 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term17548;
        callMethod(klass, "setId", argTypes, term17538, args);
    }

};


