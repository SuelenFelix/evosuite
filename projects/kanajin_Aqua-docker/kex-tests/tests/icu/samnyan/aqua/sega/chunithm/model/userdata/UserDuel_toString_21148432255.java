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

public class UserDuel_toString_21148432255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88057;

    public UserDuel_toString_21148432255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88057 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        setLongField(term88057, term88057.getClass(), "id", 0L);
        setField(term88057, term88057.getClass(), "user", null);
        setIntField(term88057, term88057.getClass(), "duelId", 0);
        setIntField(term88057, term88057.getClass(), "progress", 0);
        setIntField(term88057, term88057.getClass(), "point", 0);
        setBooleanField(term88057, term88057.getClass(), "isClear", false);
        setField(term88057, term88057.getClass(), "lastPlayDate", null);
        setIntField(term88057, term88057.getClass(), "param1", 0);
        setIntField(term88057, term88057.getClass(), "param2", 0);
        setIntField(term88057, term88057.getClass(), "param3", 0);
        setIntField(term88057, term88057.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term88057, args);
    }

};


