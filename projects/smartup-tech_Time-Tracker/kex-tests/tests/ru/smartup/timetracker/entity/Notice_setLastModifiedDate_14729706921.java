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

public class Notice_setLastModifiedDate_14729706921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11774;
     Object term11817;

    public Notice_setLastModifiedDate_14729706921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11821 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term11820 = ((Class) term11821).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term11820).setAccessible(true);
        Object enum28 = ((Field) term11820).get((Object) null);
        term11774 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term11807 = newInstance(Class.forName("java.lang.Object"));
        Object term11811 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term11814 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term11774, term11774.getClass(), "id", 8428634514691209827L);
        setField(term11774, term11774.getClass(), "type", enum28);
        setIntField(term11774, term11774.getClass(), "employeeId", -1016503459);
        setField(term11774, term11774.getClass(), "text", "IoAlmYsBwc");
        setField(term11774, term11774.getClass(), "data", term11807);
        setBooleanField(term11774, term11774.getClass(), "read", false);
        setBooleanField(term11774, term11774.getClass(), "deleted", false);
        setIntField(term11774, term11774.getClass(), "createdBy", -1968847291);
        setIntField(term11811, term11811.getClass(), "nanos", 888000000);
        setLongField(term11811, term11811.getClass(), "fastTime", 1464410989000L);
        setField(term11811, term11811.getClass(), "cdate", null);
        setField(term11774, term11774.getClass(), "createdDate", term11811);
        setIntField(term11814, term11814.getClass(), "nanos", 488000000);
        setLongField(term11814, term11814.getClass(), "fastTime", 1405268389000L);
        setField(term11814, term11814.getClass(), "cdate", null);
        setField(term11774, term11774.getClass(), "lastModifiedDate", term11814);
        term11817 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term11817, term11817.getClass(), "nanos", 50000000);
        setLongField(term11817, term11817.getClass(), "fastTime", 1822693844000L);
        setField(term11817, term11817.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term11817;
        callMethod(klass, "setLastModifiedDate", argTypes, term11774, args);
    }

};


