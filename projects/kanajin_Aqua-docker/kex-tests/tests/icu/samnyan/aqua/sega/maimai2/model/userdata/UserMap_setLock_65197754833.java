package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserMap_setLock_65197754833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585407;
     Object term585414;

    public UserMap_setLock_65197754833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585407 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        setLongField(term585407, term585407.getClass(), "id", 0L);
        setField(term585407, term585407.getClass(), "user", null);
        setIntField(term585407, term585407.getClass(), "mapId", 0);
        setIntField(term585407, term585407.getClass(), "distance", 0);
        setBooleanField(term585407, term585407.getClass(), "isLock", false);
        setBooleanField(term585407, term585407.getClass(), "isClear", false);
        setBooleanField(term585407, term585407.getClass(), "isComplete", false);
        term585414 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term585414;
        callMethod(klass, "setLock", argTypes, term585407, args);
    }

};


