package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserBoss_setClear_182451730030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141948;
     Object term141954;

    public UserBoss_setClear_182451730030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141948 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        setLongField(term141948, term141948.getClass(), "id", 0L);
        setField(term141948, term141948.getClass(), "user", null);
        setIntField(term141948, term141948.getClass(), "musicId", 0);
        setIntField(term141948, term141948.getClass(), "damage", 0);
        setBooleanField(term141948, term141948.getClass(), "isClear", false);
        setIntField(term141948, term141948.getClass(), "eventId", 0);
        term141954 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term141954;
        callMethod(klass, "setClear", argTypes, term141948, args);
    }

};


