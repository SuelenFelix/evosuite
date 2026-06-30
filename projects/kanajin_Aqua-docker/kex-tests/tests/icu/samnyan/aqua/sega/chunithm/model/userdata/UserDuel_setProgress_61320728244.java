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

public class UserDuel_setProgress_61320728244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87933;
     Object term87943;

    public UserDuel_setProgress_61320728244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87933 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        setLongField(term87933, term87933.getClass(), "id", 0L);
        setField(term87933, term87933.getClass(), "user", null);
        setIntField(term87933, term87933.getClass(), "duelId", 0);
        setIntField(term87933, term87933.getClass(), "progress", 0);
        setIntField(term87933, term87933.getClass(), "point", 0);
        setBooleanField(term87933, term87933.getClass(), "isClear", false);
        setField(term87933, term87933.getClass(), "lastPlayDate", null);
        setIntField(term87933, term87933.getClass(), "param1", 0);
        setIntField(term87933, term87933.getClass(), "param2", 0);
        setIntField(term87933, term87933.getClass(), "param3", 0);
        setIntField(term87933, term87933.getClass(), "param4", 0);
        term87943 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term87943;
        callMethod(klass, "setProgress", argTypes, term87933, args);
    }

};


