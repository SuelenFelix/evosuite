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

public class NoticeDto_getId_17641189971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;

    public NoticeDto_getId_17641189971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term415 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term414 = ((Class) term415).getDeclaredField((String) "APPROVAL_REQUIRED");
        ((Field) term414).setAccessible(true);
        Object enum0 = ((Field) term414).get((Object) null);
        term72 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term107 = newInstance(Class.forName("java.lang.Object"));
        Object term110 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term72, term72.getClass(), "id", 2442117782898005296L);
        setField(term72, term72.getClass(), "type", enum0);
        setField(term72, term72.getClass(), "text", "PAEBtnZtTD");
        setField(term72, term72.getClass(), "data", term107);
        setBooleanField(term72, term72.getClass(), "read", false);
        setIntField(term72, term72.getClass(), "createdBy", 1135664017);
        setIntField(term110, term110.getClass(), "nanos", 244000000);
        setLongField(term110, term110.getClass(), "fastTime", 1345860612000L);
        setField(term110, term110.getClass(), "cdate", null);
        setField(term72, term72.getClass(), "createdDate", term110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term72, args);
    }

};


