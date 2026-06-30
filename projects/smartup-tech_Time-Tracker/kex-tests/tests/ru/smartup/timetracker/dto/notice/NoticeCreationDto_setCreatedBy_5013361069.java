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
import java.lang.Integer;

public class NoticeCreationDto_setCreatedBy_5013361069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15776;
     Object term15810;

    public NoticeCreationDto_setCreatedBy_5013361069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15813 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term15812 = ((Class) term15813).getDeclaredField((String) "PASSWORD_UPDATE");
        ((Field) term15812).setAccessible(true);
        Object enum37 = ((Field) term15812).get((Object) null);
        term15776 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term15808 = newInstance(Class.forName("java.lang.Object"));
        setField(term15776, term15776.getClass(), "type", enum37);
        setField(term15776, term15776.getClass(), "text", "xrwlQZdwCp");
        setField(term15776, term15776.getClass(), "data", term15808);
        setIntField(term15776, term15776.getClass(), "createdBy", -2095575670);
        term15810 = new Integer(1225272962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15810;
        callMethod(klass, "setCreatedBy", argTypes, term15776, args);
    }

};


