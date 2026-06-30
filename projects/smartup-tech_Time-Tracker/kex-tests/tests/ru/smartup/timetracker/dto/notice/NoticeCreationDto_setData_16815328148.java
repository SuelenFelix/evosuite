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

public class NoticeCreationDto_setData_16815328148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15382;
     Object term15414;

    public NoticeCreationDto_setData_16815328148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15416 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term15415 = ((Class) term15416).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term15415).setAccessible(true);
        Object enum36 = ((Field) term15415).get((Object) null);
        term15382 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term15412 = newInstance(Class.forName("java.lang.Object"));
        setField(term15382, term15382.getClass(), "type", enum36);
        setField(term15382, term15382.getClass(), "text", "Ghbwtircqb");
        setField(term15382, term15382.getClass(), "data", term15412);
        setIntField(term15382, term15382.getClass(), "createdBy", -1371869594);
        term15414 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15414;
        callMethod(klass, "setData", argTypes, term15382, args);
    }

};


