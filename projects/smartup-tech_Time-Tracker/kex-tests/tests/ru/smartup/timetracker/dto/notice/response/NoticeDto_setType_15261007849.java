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

public class NoticeDto_setType_15261007849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3595;
     Object enum9;

    public NoticeDto_setType_15261007849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3652 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term3651 = ((Class) term3652).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term3651).setAccessible(true);
        Object enum8 = ((Field) term3651).get((Object) null);
        term3595 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term3626 = newInstance(Class.forName("java.lang.Object"));
        Object term3629 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term3595, term3595.getClass(), "id", 6967924379644551255L);
        setField(term3595, term3595.getClass(), "type", enum8);
        setField(term3595, term3595.getClass(), "text", "hRNSzYYIrc");
        setField(term3595, term3595.getClass(), "data", term3626);
        setBooleanField(term3595, term3595.getClass(), "read", false);
        setIntField(term3595, term3595.getClass(), "createdBy", -226514366);
        setIntField(term3629, term3629.getClass(), "nanos", 896000000);
        setLongField(term3629, term3629.getClass(), "fastTime", 1645823234000L);
        setField(term3629, term3629.getClass(), "cdate", null);
        setField(term3595, term3595.getClass(), "createdDate", term3629);
        Class<? extends Object> term4013 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term4012 = ((Class) term4013).getDeclaredField((String) "PASSWORD_UPDATE");
        ((Field) term4012).setAccessible(true);
        enum9 = ((Field) term4012).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Object[] args = new Object[1];
        args[0] = enum9;
        callMethod(klass, "setType", argTypes, term3595, args);
    }

};


