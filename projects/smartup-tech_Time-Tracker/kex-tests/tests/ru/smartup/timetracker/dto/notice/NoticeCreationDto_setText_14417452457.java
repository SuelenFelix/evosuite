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

public class NoticeCreationDto_setText_14417452457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14935;

    public NoticeCreationDto_setText_14417452457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14988 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term14987 = ((Class) term14988).getDeclaredField((String) "REGISTER_NEW_EMPLOYEE");
        ((Field) term14987).setAccessible(true);
        Object enum35 = ((Field) term14987).get((Object) null);
        term14935 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term14973 = newInstance(Class.forName("java.lang.Object"));
        setField(term14935, term14935.getClass(), "type", enum35);
        setField(term14935, term14935.getClass(), "text", "SbAoxhfrkn");
        setField(term14935, term14935.getClass(), "data", term14973);
        setIntField(term14935, term14935.getClass(), "createdBy", 97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kuTXqwMtDB";
        callMethod(klass, "setText", argTypes, term14935, args);
    }

};


