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

public class NoticeCreationDto_NoticeCreationDtoBuilder_type_2289460791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term935;
     Object enum3;

    public NoticeCreationDto_NoticeCreationDtoBuilder_type_2289460791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1290 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term1289 = ((Class) term1290).getDeclaredField((String) "APPROVAL_REQUIRED");
        ((Field) term1289).setAccessible(true);
        Object enum2 = ((Field) term1289).get((Object) null);
        term935 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder"));
        Object term969 = newInstance(Class.forName("java.lang.Object"));
        setField(term935, term935.getClass(), "type", enum2);
        setField(term935, term935.getClass(), "text", "sjlJAEtRrb");
        setField(term935, term935.getClass(), "data", term969);
        setIntField(term935, term935.getClass(), "createdBy", 568599855);
        Class<? extends Object> term1663 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term1662 = ((Class) term1663).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term1662).setAccessible(true);
        enum3 = ((Field) term1662).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Object[] args = new Object[1];
        args[0] = enum3;
        callMethod(klass, "type", argTypes, term935, args);
    }

};


