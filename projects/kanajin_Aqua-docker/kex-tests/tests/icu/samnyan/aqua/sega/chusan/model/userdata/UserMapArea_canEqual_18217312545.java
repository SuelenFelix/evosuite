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

public class UserMapArea_canEqual_18217312545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157555;

    public UserMapArea_canEqual_18217312545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157555 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea"));
        setLongField(term157555, term157555.getClass(), "id", 0L);
        setField(term157555, term157555.getClass(), "user", null);
        setIntField(term157555, term157555.getClass(), "mapAreaId", 0);
        setIntField(term157555, term157555.getClass(), "position", 0);
        setBooleanField(term157555, term157555.getClass(), "isClear", false);
        setIntField(term157555, term157555.getClass(), "rate", 0);
        setIntField(term157555, term157555.getClass(), "statusCount", 0);
        setIntField(term157555, term157555.getClass(), "remainGridCount", 0);
        setBooleanField(term157555, term157555.getClass(), "isLocked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term157555, args);
    }

};


