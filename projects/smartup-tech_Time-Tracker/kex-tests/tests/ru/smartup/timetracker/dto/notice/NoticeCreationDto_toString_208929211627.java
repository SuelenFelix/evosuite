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

public class NoticeCreationDto_toString_208929211627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17837;

    public NoticeCreationDto_toString_208929211627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17837 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        setField(term17837, term17837.getClass(), "type", null);
        setField(term17837, term17837.getClass(), "text", null);
        setField(term17837, term17837.getClass(), "data", null);
        setIntField(term17837, term17837.getClass(), "createdBy", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17837, args);
    }

};


