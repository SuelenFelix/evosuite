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

public class NoticeDto_getType_21133349062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787;

    public NoticeDto_getType_21133349062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term825 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term824 = ((Class) term825).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term824).setAccessible(true);
        Object enum1 = ((Field) term824).get((Object) null);
        term787 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term818 = newInstance(Class.forName("java.lang.Object"));
        Object term821 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term787, term787.getClass(), "id", 6375119433582206027L);
        setField(term787, term787.getClass(), "type", enum1);
        setField(term787, term787.getClass(), "text", "sjlJAEtRrb");
        setField(term787, term787.getClass(), "data", term818);
        setBooleanField(term787, term787.getClass(), "read", false);
        setIntField(term787, term787.getClass(), "createdBy", 590364439);
        setIntField(term821, term821.getClass(), "nanos", 369000000);
        setLongField(term821, term821.getClass(), "fastTime", 1480427551000L);
        setField(term821, term821.getClass(), "cdate", null);
        setField(term787, term787.getClass(), "createdDate", term821);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term787, args);
    }

};


