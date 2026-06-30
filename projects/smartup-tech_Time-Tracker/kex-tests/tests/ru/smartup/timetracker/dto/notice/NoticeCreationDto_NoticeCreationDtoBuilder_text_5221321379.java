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

public class NoticeCreationDto_NoticeCreationDtoBuilder_text_5221321379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4021;

    public NoticeCreationDto_NoticeCreationDtoBuilder_text_5221321379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4021 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder"));
        setField(term4021, term4021.getClass(), "type", null);
        setField(term4021, term4021.getClass(), "text", null);
        setField(term4021, term4021.getClass(), "data", null);
        setIntField(term4021, term4021.getClass(), "createdBy", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "text", argTypes, term4021, args);
    }

};


