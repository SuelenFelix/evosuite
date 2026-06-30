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
import java.lang.Boolean;

public class UserMapArea_setClear_173415342139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157491;
     Object term157500;

    public UserMapArea_setClear_173415342139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157491 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea"));
        setLongField(term157491, term157491.getClass(), "id", 0L);
        setField(term157491, term157491.getClass(), "user", null);
        setIntField(term157491, term157491.getClass(), "mapAreaId", 0);
        setIntField(term157491, term157491.getClass(), "position", 0);
        setBooleanField(term157491, term157491.getClass(), "isClear", false);
        setIntField(term157491, term157491.getClass(), "rate", 0);
        setIntField(term157491, term157491.getClass(), "statusCount", 0);
        setIntField(term157491, term157491.getClass(), "remainGridCount", 0);
        setBooleanField(term157491, term157491.getClass(), "isLocked", false);
        term157500 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term157500;
        callMethod(klass, "setClear", argTypes, term157491, args);
    }

};


