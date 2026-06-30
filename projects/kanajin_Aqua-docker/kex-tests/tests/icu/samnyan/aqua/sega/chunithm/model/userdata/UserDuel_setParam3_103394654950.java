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

public class UserDuel_setParam3_103394654950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88003;
     Object term88013;

    public UserDuel_setParam3_103394654950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88003 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        setLongField(term88003, term88003.getClass(), "id", 0L);
        setField(term88003, term88003.getClass(), "user", null);
        setIntField(term88003, term88003.getClass(), "duelId", 0);
        setIntField(term88003, term88003.getClass(), "progress", 0);
        setIntField(term88003, term88003.getClass(), "point", 0);
        setBooleanField(term88003, term88003.getClass(), "isClear", false);
        setField(term88003, term88003.getClass(), "lastPlayDate", null);
        setIntField(term88003, term88003.getClass(), "param1", 0);
        setIntField(term88003, term88003.getClass(), "param2", 0);
        setIntField(term88003, term88003.getClass(), "param3", 0);
        setIntField(term88003, term88003.getClass(), "param4", 0);
        term88013 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term88013;
        callMethod(klass, "setParam3", argTypes, term88003, args);
    }

};


