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

public class ResultDto_getValidationErrors_7078328948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125410;

    public ResultDto_getValidationErrors_7078328948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term125412 = new HashMap();
        Class<? extends Object> term125477 = Class.forName((String) "ru.smartup.timetracker.dto.ErrorCode");
        Field term125476 = ((Class) term125477).getDeclaredField((String) "NOT_UNIQUE_EMPLOYEE_NAME");
        ((Field) term125476).setAccessible(true);
        Object enum248 = ((Field) term125476).get((Object) null);
        HashMap term125462 = new HashMap();
        ArrayList term125472 = new ArrayList();
        term125410 = newInstance(Class.forName("ru.smartup.timetracker.dto.ResultDto"));
        setBooleanField(term125410, term125410.getClass(), "success", false);
        setField(term125410, term125410.getClass(), "params", term125412);
        setField(term125410, term125410.getClass(), "errorCode", enum248);
        setField(term125410, term125410.getClass(), "errorMessage", "rsnXTpfhqf");
        setField(term125410, term125410.getClass(), "validationErrors", term125462);
        setField(term125410, term125410.getClass(), "relatedEntities", term125472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.ResultDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValidationErrors", argTypes, term125410, args);
    }

};


