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
import java.lang.Boolean;

public class Notice_setDeleted_156103773118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10498;
     Object term10541;

    public Notice_setDeleted_156103773118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10544 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term10543 = ((Class) term10544).getDeclaredField((String) "HOURS_REJECTED");
        ((Field) term10543).setAccessible(true);
        Object enum25 = ((Field) term10543).get((Object) null);
        term10498 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term10531 = newInstance(Class.forName("java.lang.Object"));
        Object term10535 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term10538 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term10498, term10498.getClass(), "id", 5127676408959197577L);
        setField(term10498, term10498.getClass(), "type", enum25);
        setIntField(term10498, term10498.getClass(), "employeeId", 679763016);
        setField(term10498, term10498.getClass(), "text", "vrQLuWIDJX");
        setField(term10498, term10498.getClass(), "data", term10531);
        setBooleanField(term10498, term10498.getClass(), "read", true);
        setBooleanField(term10498, term10498.getClass(), "deleted", false);
        setIntField(term10498, term10498.getClass(), "createdBy", 1962444399);
        setIntField(term10535, term10535.getClass(), "nanos", 632000000);
        setLongField(term10535, term10535.getClass(), "fastTime", 1442359734000L);
        setField(term10535, term10535.getClass(), "cdate", null);
        setField(term10498, term10498.getClass(), "createdDate", term10535);
        setIntField(term10538, term10538.getClass(), "nanos", 918000000);
        setLongField(term10538, term10538.getClass(), "fastTime", 1659983392000L);
        setField(term10538, term10538.getClass(), "cdate", null);
        setField(term10498, term10498.getClass(), "lastModifiedDate", term10538);
        term10541 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10541;
        callMethod(klass, "setDeleted", argTypes, term10498, args);
    }

};


