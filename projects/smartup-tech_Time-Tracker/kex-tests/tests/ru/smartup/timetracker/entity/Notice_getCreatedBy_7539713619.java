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
import java.lang.String;
import java.lang.Object;

public class Notice_getCreatedBy_7539713619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6422;

    public Notice_getCreatedBy_7539713619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6467 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term6466 = ((Class) term6467).getDeclaredField((String) "PASSWORD_UPDATE");
        ((Field) term6466).setAccessible(true);
        Object enum15 = ((Field) term6466).get((Object) null);
        term6422 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term6456 = newInstance(Class.forName("java.lang.Object"));
        Object term6460 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6463 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term6422, term6422.getClass(), "id", 6811161968424632369L);
        setField(term6422, term6422.getClass(), "type", enum15);
        setIntField(term6422, term6422.getClass(), "employeeId", -655067527);
        setField(term6422, term6422.getClass(), "text", "aJlieCFVtF");
        setField(term6422, term6422.getClass(), "data", term6456);
        setBooleanField(term6422, term6422.getClass(), "read", false);
        setBooleanField(term6422, term6422.getClass(), "deleted", false);
        setIntField(term6422, term6422.getClass(), "createdBy", -6029667);
        setIntField(term6460, term6460.getClass(), "nanos", 457000000);
        setLongField(term6460, term6460.getClass(), "fastTime", 1706067372000L);
        setField(term6460, term6460.getClass(), "cdate", null);
        setField(term6422, term6422.getClass(), "createdDate", term6460);
        setIntField(term6463, term6463.getClass(), "nanos", 992000000);
        setLongField(term6463, term6463.getClass(), "fastTime", 1863620294000L);
        setField(term6463, term6463.getClass(), "cdate", null);
        setField(term6422, term6422.getClass(), "lastModifiedDate", term6463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedBy", argTypes, term6422, args);
    }

};


