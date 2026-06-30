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

public class UserBoss_equals_71235338332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141964;

    public UserBoss_equals_71235338332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141964 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        setLongField(term141964, term141964.getClass(), "id", 0L);
        setField(term141964, term141964.getClass(), "user", null);
        setIntField(term141964, term141964.getClass(), "musicId", 0);
        setIntField(term141964, term141964.getClass(), "damage", 0);
        setBooleanField(term141964, term141964.getClass(), "isClear", false);
        setIntField(term141964, term141964.getClass(), "eventId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term141964, args);
    }

};


