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
import java.lang.Object;
import java.lang.Float;

public class Position_setExternalRate_19388388369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108460;
     Object term108482;

    public Position_setExternalRate_19388388369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108460 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108476 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108479 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108460, term108460.getClass(), "id", -829088844);
        setField(term108460, term108460.getClass(), "name", "ZEXFoMSKeG");
        setFloatField(term108460, term108460.getClass(), "externalRate", 0.75913525F);
        setBooleanField(term108460, term108460.getClass(), "isArchived", false);
        setIntField(term108476, term108476.getClass(), "nanos", 660000000);
        setLongField(term108476, term108476.getClass(), "fastTime", 1873238772000L);
        setField(term108476, term108476.getClass(), "cdate", null);
        setField(term108460, term108460.getClass(), "createdDate", term108476);
        setIntField(term108479, term108479.getClass(), "nanos", 11000000);
        setLongField(term108479, term108479.getClass(), "fastTime", 1501073782000L);
        setField(term108479, term108479.getClass(), "cdate", null);
        setField(term108460, term108460.getClass(), "lastModifiedDate", term108479);
        term108482 = new Float(0.7059082F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term108482;
        callMethod(klass, "setExternalRate", argTypes, term108460, args);
    }

};


