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

public class NoticeCreationDto_canEqual_44206618611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16577;
     Object term16616;

    public NoticeCreationDto_canEqual_44206618611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16618 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term16617 = ((Class) term16618).getDeclaredField((String) "PROJECT_ROLE_GRANTED");
        ((Field) term16617).setAccessible(true);
        Object enum39 = ((Field) term16617).get((Object) null);
        term16577 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term16614 = newInstance(Class.forName("java.lang.Object"));
        setField(term16577, term16577.getClass(), "type", enum39);
        setField(term16577, term16577.getClass(), "text", "nyiiPDVjAc");
        setField(term16577, term16577.getClass(), "data", term16614);
        setIntField(term16577, term16577.getClass(), "createdBy", -1588772968);
        term16616 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16616;
        callMethod(klass, "canEqual", argTypes, term16577, args);
    }

};


