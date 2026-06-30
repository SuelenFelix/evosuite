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

public class NoticeCreationDto_NoticeCreationDtoBuilder_createdBy_106097680011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4025;
     Object term4027;

    public NoticeCreationDto_NoticeCreationDtoBuilder_createdBy_106097680011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4025 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder"));
        setField(term4025, term4025.getClass(), "type", null);
        setField(term4025, term4025.getClass(), "text", null);
        setField(term4025, term4025.getClass(), "data", null);
        setIntField(term4025, term4025.getClass(), "createdBy", 0);
        term4027 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4027;
        callMethod(klass, "createdBy", argTypes, term4025, args);
    }

};


