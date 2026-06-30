package ru.smartup.timetracker.dto;

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
import static ru.smartup.timetracker.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class ResultDto_getErrorMessage_8027064667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125119;

    public ResultDto_getErrorMessage_8027064667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term125121 = new HashMap();
        Class<? extends Object> term125175 = Class.forName((String) "ru.smartup.timetracker.dto.ErrorCode");
        Field term125174 = ((Class) term125175).getDeclaredField((String) "ACCESS_DENIED");
        ((Field) term125174).setAccessible(true);
        Object enum247 = ((Field) term125174).get((Object) null);
        HashMap term125160 = new HashMap();
        ArrayList term125170 = new ArrayList();
        term125119 = newInstance(Class.forName("ru.smartup.timetracker.dto.ResultDto"));
        setBooleanField(term125119, term125119.getClass(), "success", false);
        setField(term125119, term125119.getClass(), "params", term125121);
        setField(term125119, term125119.getClass(), "errorCode", enum247);
        setField(term125119, term125119.getClass(), "errorMessage", "SQnbnBmbcf");
        setField(term125119, term125119.getClass(), "validationErrors", term125160);
        setField(term125119, term125119.getClass(), "relatedEntities", term125170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.ResultDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorMessage", argTypes, term125119, args);
    }

};


