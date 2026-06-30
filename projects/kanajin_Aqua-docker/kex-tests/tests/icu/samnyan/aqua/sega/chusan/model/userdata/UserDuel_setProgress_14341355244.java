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

public class UserDuel_setProgress_14341355244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17572;
     Object term17582;

    public UserDuel_setProgress_14341355244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17572 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel"));
        setLongField(term17572, term17572.getClass(), "id", 0L);
        setField(term17572, term17572.getClass(), "user", null);
        setIntField(term17572, term17572.getClass(), "duelId", 0);
        setIntField(term17572, term17572.getClass(), "progress", 0);
        setIntField(term17572, term17572.getClass(), "point", 0);
        setBooleanField(term17572, term17572.getClass(), "isClear", false);
        setField(term17572, term17572.getClass(), "lastPlayDate", null);
        setIntField(term17572, term17572.getClass(), "param1", 0);
        setIntField(term17572, term17572.getClass(), "param2", 0);
        setIntField(term17572, term17572.getClass(), "param3", 0);
        setIntField(term17572, term17572.getClass(), "param4", 0);
        term17582 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17582;
        callMethod(klass, "setProgress", argTypes, term17572, args);
    }

};


