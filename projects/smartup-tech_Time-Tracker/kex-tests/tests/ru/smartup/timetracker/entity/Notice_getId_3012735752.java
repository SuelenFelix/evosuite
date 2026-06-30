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

public class Notice_getId_3012735752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3581;

    public Notice_getId_3012735752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3620 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term3619 = ((Class) term3620).getDeclaredField((String) "UN_FREEZE");
        ((Field) term3619).setAccessible(true);
        Object enum8 = ((Field) term3619).get((Object) null);
        term3581 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term3609 = newInstance(Class.forName("java.lang.Object"));
        Object term3613 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3616 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term3581, term3581.getClass(), "id", 2442117782898005296L);
        setField(term3581, term3581.getClass(), "type", enum8);
        setIntField(term3581, term3581.getClass(), "employeeId", -1955890973);
        setField(term3581, term3581.getClass(), "text", "hRNSzYYIrc");
        setField(term3581, term3581.getClass(), "data", term3609);
        setBooleanField(term3581, term3581.getClass(), "read", false);
        setBooleanField(term3581, term3581.getClass(), "deleted", false);
        setIntField(term3581, term3581.getClass(), "createdBy", -2038273078);
        setIntField(term3613, term3613.getClass(), "nanos", 244000000);
        setLongField(term3613, term3613.getClass(), "fastTime", 1345860612000L);
        setField(term3613, term3613.getClass(), "cdate", null);
        setField(term3581, term3581.getClass(), "createdDate", term3613);
        setIntField(term3616, term3616.getClass(), "nanos", 369000000);
        setLongField(term3616, term3616.getClass(), "fastTime", 1480427551000L);
        setField(term3616, term3616.getClass(), "cdate", null);
        setField(term3581, term3581.getClass(), "lastModifiedDate", term3616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3581, args);
    }

};


