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

public class UserMapArea_isClear_99625671530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157404;

    public UserMapArea_isClear_99625671530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157404 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea"));
        setLongField(term157404, term157404.getClass(), "id", 0L);
        setField(term157404, term157404.getClass(), "user", null);
        setIntField(term157404, term157404.getClass(), "mapAreaId", 0);
        setIntField(term157404, term157404.getClass(), "position", 0);
        setBooleanField(term157404, term157404.getClass(), "isClear", false);
        setIntField(term157404, term157404.getClass(), "rate", 0);
        setIntField(term157404, term157404.getClass(), "statusCount", 0);
        setIntField(term157404, term157404.getClass(), "remainGridCount", 0);
        setBooleanField(term157404, term157404.getClass(), "isLocked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term157404, args);
    }

};


