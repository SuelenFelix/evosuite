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

public class Notice_equals_102799427622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12184;
     Object term12234;

    public Notice_equals_102799427622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12236 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term12235 = ((Class) term12236).getDeclaredField((String) "REGISTER_NEW_EMPLOYEE");
        ((Field) term12235).setAccessible(true);
        Object enum29 = ((Field) term12235).get((Object) null);
        term12184 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term12224 = newInstance(Class.forName("java.lang.Object"));
        Object term12228 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term12231 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term12184, term12184.getClass(), "id", -2585684163342970173L);
        setField(term12184, term12184.getClass(), "type", enum29);
        setIntField(term12184, term12184.getClass(), "employeeId", 579005622);
        setField(term12184, term12184.getClass(), "text", "TEParAifyi");
        setField(term12184, term12184.getClass(), "data", term12224);
        setBooleanField(term12184, term12184.getClass(), "read", true);
        setBooleanField(term12184, term12184.getClass(), "deleted", true);
        setIntField(term12184, term12184.getClass(), "createdBy", -14890619);
        setIntField(term12228, term12228.getClass(), "nanos", 298000000);
        setLongField(term12228, term12228.getClass(), "fastTime", 1678166815000L);
        setField(term12228, term12228.getClass(), "cdate", null);
        setField(term12184, term12184.getClass(), "createdDate", term12228);
        setIntField(term12231, term12231.getClass(), "nanos", 186000000);
        setLongField(term12231, term12231.getClass(), "fastTime", 1666065487000L);
        setField(term12231, term12231.getClass(), "cdate", null);
        setField(term12184, term12184.getClass(), "lastModifiedDate", term12231);
        term12234 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12234;
        callMethod(klass, "equals", argTypes, term12184, args);
    }

};


