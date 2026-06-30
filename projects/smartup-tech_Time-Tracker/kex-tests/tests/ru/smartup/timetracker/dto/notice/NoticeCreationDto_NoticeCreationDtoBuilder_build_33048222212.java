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

public class NoticeCreationDto_NoticeCreationDtoBuilder_build_33048222212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4029;

    public NoticeCreationDto_NoticeCreationDtoBuilder_build_33048222212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4029 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder"));
        setField(term4029, term4029.getClass(), "type", null);
        setField(term4029, term4029.getClass(), "text", null);
        setField(term4029, term4029.getClass(), "data", null);
        setIntField(term4029, term4029.getClass(), "createdBy", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4029, args);
    }

};


