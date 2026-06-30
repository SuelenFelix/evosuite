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

public class UserMapArea_setPosition_58779435538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157480;
     Object term157489;

    public UserMapArea_setPosition_58779435538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157480 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea"));
        setLongField(term157480, term157480.getClass(), "id", 0L);
        setField(term157480, term157480.getClass(), "user", null);
        setIntField(term157480, term157480.getClass(), "mapAreaId", 0);
        setIntField(term157480, term157480.getClass(), "position", 0);
        setBooleanField(term157480, term157480.getClass(), "isClear", false);
        setIntField(term157480, term157480.getClass(), "rate", 0);
        setIntField(term157480, term157480.getClass(), "statusCount", 0);
        setIntField(term157480, term157480.getClass(), "remainGridCount", 0);
        setBooleanField(term157480, term157480.getClass(), "isLocked", false);
        term157489 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157489;
        callMethod(klass, "setPosition", argTypes, term157480, args);
    }

};


