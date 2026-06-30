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

public class NoticeCreationDto_setType_17349313036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14134;
     Object enum34;

    public NoticeCreationDto_setType_17349313036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14194 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term14193 = ((Class) term14194).getDeclaredField((String) "PASSWORD_UPDATE");
        ((Field) term14193).setAccessible(true);
        Object enum33 = ((Field) term14193).get((Object) null);
        term14134 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term14166 = newInstance(Class.forName("java.lang.Object"));
        setField(term14134, term14134.getClass(), "type", enum33);
        setField(term14134, term14134.getClass(), "text", "AijpHYOFuy");
        setField(term14134, term14134.getClass(), "data", term14166);
        setIntField(term14134, term14134.getClass(), "createdBy", 1596070772);
        Class<? extends Object> term14561 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term14560 = ((Class) term14561).getDeclaredField((String) "REGISTER_NEW_EMPLOYEE");
        ((Field) term14560).setAccessible(true);
        enum34 = ((Field) term14560).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Object[] args = new Object[1];
        args[0] = enum34;
        callMethod(klass, "setType", argTypes, term14134, args);
    }

};


