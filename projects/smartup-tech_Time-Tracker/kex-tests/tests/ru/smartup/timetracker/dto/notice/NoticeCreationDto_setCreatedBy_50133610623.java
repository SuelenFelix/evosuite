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
import java.lang.Integer;

public class NoticeCreationDto_setCreatedBy_50133610623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17827;
     Object term17829;

    public NoticeCreationDto_setCreatedBy_50133610623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17827 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        setField(term17827, term17827.getClass(), "type", null);
        setField(term17827, term17827.getClass(), "text", null);
        setField(term17827, term17827.getClass(), "data", null);
        setIntField(term17827, term17827.getClass(), "createdBy", 0);
        term17829 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17829;
        callMethod(klass, "setCreatedBy", argTypes, term17827, args);
    }

};


