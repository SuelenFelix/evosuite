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

public class UserDuel_setPoint_209137790545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17584;
     Object term17594;

    public UserDuel_setPoint_209137790545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17584 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel"));
        setLongField(term17584, term17584.getClass(), "id", 0L);
        setField(term17584, term17584.getClass(), "user", null);
        setIntField(term17584, term17584.getClass(), "duelId", 0);
        setIntField(term17584, term17584.getClass(), "progress", 0);
        setIntField(term17584, term17584.getClass(), "point", 0);
        setBooleanField(term17584, term17584.getClass(), "isClear", false);
        setField(term17584, term17584.getClass(), "lastPlayDate", null);
        setIntField(term17584, term17584.getClass(), "param1", 0);
        setIntField(term17584, term17584.getClass(), "param2", 0);
        setIntField(term17584, term17584.getClass(), "param3", 0);
        setIntField(term17584, term17584.getClass(), "param4", 0);
        term17594 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17594;
        callMethod(klass, "setPoint", argTypes, term17584, args);
    }

};


