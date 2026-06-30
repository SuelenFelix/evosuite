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

public class NoticeCreationDto_NoticeCreationDtoBuilder_build_3304822225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3205;

    public NoticeCreationDto_NoticeCreationDtoBuilder_build_3304822225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3244 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term3243 = ((Class) term3244).getDeclaredField((String) "PROJECT_ROLE_CHANGE");
        ((Field) term3243).setAccessible(true);
        Object enum7 = ((Field) term3243).get((Object) null);
        term3205 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder"));
        Object term3241 = newInstance(Class.forName("java.lang.Object"));
        setField(term3205, term3205.getClass(), "type", enum7);
        setField(term3205, term3205.getClass(), "text", "SzjVpOQTyS");
        setField(term3205, term3205.getClass(), "data", term3241);
        setIntField(term3205, term3205.getClass(), "createdBy", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3205, args);
    }

};


