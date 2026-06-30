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

public class Notice_isDeleted_11964433018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6019;

    public Notice_isDeleted_11964433018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6062 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term6061 = ((Class) term6062).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term6061).setAccessible(true);
        Object enum14 = ((Field) term6061).get((Object) null);
        term6019 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term6051 = newInstance(Class.forName("java.lang.Object"));
        Object term6055 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6058 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term6019, term6019.getClass(), "id", 4872422362414183754L);
        setField(term6019, term6019.getClass(), "type", enum14);
        setIntField(term6019, term6019.getClass(), "employeeId", 1622346318);
        setField(term6019, term6019.getClass(), "text", "oVcInYnLWB");
        setField(term6019, term6019.getClass(), "data", term6051);
        setBooleanField(term6019, term6019.getClass(), "read", false);
        setBooleanField(term6019, term6019.getClass(), "deleted", true);
        setIntField(term6019, term6019.getClass(), "createdBy", 1048535127);
        setIntField(term6055, term6055.getClass(), "nanos", 80000000);
        setLongField(term6055, term6055.getClass(), "fastTime", 1745452162000L);
        setField(term6055, term6055.getClass(), "cdate", null);
        setField(term6019, term6019.getClass(), "createdDate", term6055);
        setIntField(term6058, term6058.getClass(), "nanos", 960000000);
        setLongField(term6058, term6058.getClass(), "fastTime", 1349058953000L);
        setField(term6058, term6058.getClass(), "cdate", null);
        setField(term6019, term6019.getClass(), "lastModifiedDate", term6058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDeleted", argTypes, term6019, args);
    }

};


