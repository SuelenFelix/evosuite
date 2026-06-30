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
import java.lang.Integer;

public class Project_setId_18019157986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63208;
     Object term63229;

    public Project_setId_18019157986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63208 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63223 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63226 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63208, term63208.getClass(), "id", -1529797673);
        setField(term63208, term63208.getClass(), "name", "jnwVnmKAFv");
        setBooleanField(term63208, term63208.getClass(), "isArchived", false);
        setIntField(term63223, term63223.getClass(), "nanos", 130000000);
        setLongField(term63223, term63223.getClass(), "fastTime", 1374834529000L);
        setField(term63223, term63223.getClass(), "cdate", null);
        setField(term63208, term63208.getClass(), "createdDate", term63223);
        setIntField(term63226, term63226.getClass(), "nanos", 74000000);
        setLongField(term63226, term63226.getClass(), "fastTime", 1608172679000L);
        setField(term63226, term63226.getClass(), "cdate", null);
        setField(term63208, term63208.getClass(), "lastModifiedDate", term63226);
        term63229 = new Integer(-868676396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63229;
        callMethod(klass, "setId", argTypes, term63208, args);
    }

};


