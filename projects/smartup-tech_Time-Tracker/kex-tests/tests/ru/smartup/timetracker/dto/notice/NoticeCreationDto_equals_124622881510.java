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

public class NoticeCreationDto_equals_124622881510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16179;
     Object term16212;

    public NoticeCreationDto_equals_124622881510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16214 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term16213 = ((Class) term16214).getDeclaredField((String) "PASSWORD_RESET");
        ((Field) term16213).setAccessible(true);
        Object enum38 = ((Field) term16213).get((Object) null);
        term16179 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term16210 = newInstance(Class.forName("java.lang.Object"));
        setField(term16179, term16179.getClass(), "type", enum38);
        setField(term16179, term16179.getClass(), "text", "IDCWpPLRkE");
        setField(term16179, term16179.getClass(), "data", term16210);
        setIntField(term16179, term16179.getClass(), "createdBy", 1324040357);
        term16212 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16212;
        callMethod(klass, "equals", argTypes, term16179, args);
    }

};


