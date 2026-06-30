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

public class UserMapArea_getMapAreaId_2702198428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157386;

    public UserMapArea_getMapAreaId_2702198428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157386 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea"));
        setLongField(term157386, term157386.getClass(), "id", 0L);
        setField(term157386, term157386.getClass(), "user", null);
        setIntField(term157386, term157386.getClass(), "mapAreaId", 0);
        setIntField(term157386, term157386.getClass(), "position", 0);
        setBooleanField(term157386, term157386.getClass(), "isClear", false);
        setIntField(term157386, term157386.getClass(), "rate", 0);
        setIntField(term157386, term157386.getClass(), "statusCount", 0);
        setIntField(term157386, term157386.getClass(), "remainGridCount", 0);
        setBooleanField(term157386, term157386.getClass(), "isLocked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapAreaId", argTypes, term157386, args);
    }

};


