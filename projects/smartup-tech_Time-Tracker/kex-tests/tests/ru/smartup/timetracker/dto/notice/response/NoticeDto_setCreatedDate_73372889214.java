package ru.smartup.timetracker.dto.notice.response;

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
import static ru.smartup.timetracker.dto.notice.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NoticeDto_setCreatedDate_73372889214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6016;
     Object term6049;

    public NoticeDto_setCreatedDate_73372889214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6053 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term6052 = ((Class) term6053).getDeclaredField((String) "UN_FREEZE");
        ((Field) term6052).setAccessible(true);
        Object enum14 = ((Field) term6052).get((Object) null);
        term6016 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term6043 = newInstance(Class.forName("java.lang.Object"));
        Object term6046 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term6016, term6016.getClass(), "id", -5476826692763582090L);
        setField(term6016, term6016.getClass(), "type", enum14);
        setField(term6016, term6016.getClass(), "text", "oVcInYnLWB");
        setField(term6016, term6016.getClass(), "data", term6043);
        setBooleanField(term6016, term6016.getClass(), "read", false);
        setIntField(term6016, term6016.getClass(), "createdBy", 679763016);
        setIntField(term6046, term6046.getClass(), "nanos", 960000000);
        setLongField(term6046, term6046.getClass(), "fastTime", 1349058953000L);
        setField(term6046, term6046.getClass(), "cdate", null);
        setField(term6016, term6016.getClass(), "createdDate", term6046);
        term6049 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term6049, term6049.getClass(), "nanos", 457000000);
        setLongField(term6049, term6049.getClass(), "fastTime", 1706067372000L);
        setField(term6049, term6049.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term6049;
        callMethod(klass, "setCreatedDate", argTypes, term6016, args);
    }

};


