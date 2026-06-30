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

public class NoticeCreationDto_NoticeCreationDtoBuilder_createdBy_10609768004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2806;
     Object term2839;

    public NoticeCreationDto_NoticeCreationDtoBuilder_createdBy_10609768004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2842 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term2841 = ((Class) term2842).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term2841).setAccessible(true);
        Object enum6 = ((Field) term2841).get((Object) null);
        term2806 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder"));
        Object term2837 = newInstance(Class.forName("java.lang.Object"));
        setField(term2806, term2806.getClass(), "type", enum6);
        setField(term2806, term2806.getClass(), "text", "EGtDIRbSSb");
        setField(term2806, term2806.getClass(), "data", term2837);
        setIntField(term2806, term2806.getClass(), "createdBy", 391863371);
        term2839 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2839;
        callMethod(klass, "createdBy", argTypes, term2806, args);
    }

};


