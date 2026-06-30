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

public class Task_toString_3699609018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100702;

    public Task_toString_3699609018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100702 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100719 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100722 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100702, term100702.getClass(), "id", -7291742736502427077L);
        setField(term100702, term100702.getClass(), "name", "VfmNFpEuax");
        setIntField(term100702, term100702.getClass(), "projectId", -838848221);
        setBooleanField(term100702, term100702.getClass(), "billable", true);
        setBooleanField(term100702, term100702.getClass(), "isArchived", false);
        setIntField(term100719, term100719.getClass(), "nanos", 747000000);
        setLongField(term100719, term100719.getClass(), "fastTime", 1453651149000L);
        setField(term100719, term100719.getClass(), "cdate", null);
        setField(term100702, term100702.getClass(), "createdDate", term100719);
        setIntField(term100722, term100722.getClass(), "nanos", 945000000);
        setLongField(term100722, term100722.getClass(), "fastTime", 1805270024000L);
        setField(term100722, term100722.getClass(), "cdate", null);
        setField(term100702, term100702.getClass(), "lastModifiedDate", term100722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term100702, args);
    }

};


