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

public class Position_hashCode_127260476815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108664;

    public Position_hashCode_127260476815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108664 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108680 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108683 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108664, term108664.getClass(), "id", 86041387);
        setField(term108664, term108664.getClass(), "name", "PTEndmPMzk");
        setFloatField(term108664, term108664.getClass(), "externalRate", 0.37164736F);
        setBooleanField(term108664, term108664.getClass(), "isArchived", false);
        setIntField(term108680, term108680.getClass(), "nanos", 773000000);
        setLongField(term108680, term108680.getClass(), "fastTime", 1483421792000L);
        setField(term108680, term108680.getClass(), "cdate", null);
        setField(term108664, term108664.getClass(), "createdDate", term108680);
        setIntField(term108683, term108683.getClass(), "nanos", 925000000);
        setLongField(term108683, term108683.getClass(), "fastTime", 1784347917000L);
        setField(term108683, term108683.getClass(), "cdate", null);
        setField(term108664, term108664.getClass(), "lastModifiedDate", term108683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term108664, args);
    }

};


