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

public class Notice_isRead_1157828387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5612;

    public Notice_isRead_1157828387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5656 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term5655 = ((Class) term5656).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term5655).setAccessible(true);
        Object enum13 = ((Field) term5655).get((Object) null);
        term5612 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term5645 = newInstance(Class.forName("java.lang.Object"));
        Object term5649 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5652 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term5612, term5612.getClass(), "id", 7411271909051562686L);
        setField(term5612, term5612.getClass(), "type", enum13);
        setIntField(term5612, term5612.getClass(), "employeeId", -1685132342);
        setField(term5612, term5612.getClass(), "text", "LQFpaHEwXR");
        setField(term5612, term5612.getClass(), "data", term5645);
        setBooleanField(term5612, term5612.getClass(), "read", false);
        setBooleanField(term5612, term5612.getClass(), "deleted", true);
        setIntField(term5612, term5612.getClass(), "createdBy", -1456670397);
        setIntField(term5649, term5649.getClass(), "nanos", 25000000);
        setLongField(term5649, term5649.getClass(), "fastTime", 1797192828000L);
        setField(term5649, term5649.getClass(), "cdate", null);
        setField(term5612, term5612.getClass(), "createdDate", term5649);
        setIntField(term5652, term5652.getClass(), "nanos", 30000000);
        setLongField(term5652, term5652.getClass(), "fastTime", 1589447121000L);
        setField(term5652, term5652.getClass(), "cdate", null);
        setField(term5612, term5612.getClass(), "lastModifiedDate", term5652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRead", argTypes, term5612, args);
    }

};


