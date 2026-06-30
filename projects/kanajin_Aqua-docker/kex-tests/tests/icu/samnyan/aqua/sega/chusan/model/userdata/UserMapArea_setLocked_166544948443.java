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

public class UserMapArea_setLocked_166544948443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157535;
     Object term157544;

    public UserMapArea_setLocked_166544948443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157535 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea"));
        setLongField(term157535, term157535.getClass(), "id", 0L);
        setField(term157535, term157535.getClass(), "user", null);
        setIntField(term157535, term157535.getClass(), "mapAreaId", 0);
        setIntField(term157535, term157535.getClass(), "position", 0);
        setBooleanField(term157535, term157535.getClass(), "isClear", false);
        setIntField(term157535, term157535.getClass(), "rate", 0);
        setIntField(term157535, term157535.getClass(), "statusCount", 0);
        setIntField(term157535, term157535.getClass(), "remainGridCount", 0);
        setBooleanField(term157535, term157535.getClass(), "isLocked", false);
        term157544 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term157544;
        callMethod(klass, "setLocked", argTypes, term157535, args);
    }

};


