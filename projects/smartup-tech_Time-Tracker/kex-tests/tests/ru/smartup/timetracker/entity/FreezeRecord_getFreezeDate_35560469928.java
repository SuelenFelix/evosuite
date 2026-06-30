package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FreezeRecord_getFreezeDate_35560469928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62993;

    public FreezeRecord_getFreezeDate_35560469928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62993 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        setIntField(term62993, term62993.getClass(), "id", 0);
        setField(term62993, term62993.getClass(), "freezeDate", null);
        setField(term62993, term62993.getClass(), "employee", null);
        setField(term62993, term62993.getClass(), "status", null);
        setField(term62993, term62993.getClass(), "info", null);
        setField(term62993, term62993.getClass(), "createdDate", null);
        setField(term62993, term62993.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreezeDate", argTypes, term62993, args);
    }

};


