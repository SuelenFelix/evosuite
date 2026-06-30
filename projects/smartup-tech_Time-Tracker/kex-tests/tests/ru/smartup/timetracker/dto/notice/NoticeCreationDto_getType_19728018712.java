package ru.smartup.timetracker.dto.notice;

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
import static ru.smartup.timetracker.dto.notice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NoticeCreationDto_getType_19728018712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12486;

    public NoticeCreationDto_getType_19728018712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12520 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term12519 = ((Class) term12520).getDeclaredField((String) "HOURS_REJECTED");
        ((Field) term12519).setAccessible(true);
        Object enum29 = ((Field) term12519).get((Object) null);
        term12486 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term12517 = newInstance(Class.forName("java.lang.Object"));
        setField(term12486, term12486.getClass(), "type", enum29);
        setField(term12486, term12486.getClass(), "text", "IoAlmYsBwc");
        setField(term12486, term12486.getClass(), "data", term12517);
        setIntField(term12486, term12486.getClass(), "createdBy", 458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term12486, args);
    }

};


