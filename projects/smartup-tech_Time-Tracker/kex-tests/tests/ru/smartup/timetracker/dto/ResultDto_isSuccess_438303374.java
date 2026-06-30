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

public class ResultDto_isSuccess_438303374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124034;

    public ResultDto_isSuccess_438303374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term124036 = new HashMap();
        Class<? extends Object> term124097 = Class.forName((String) "ru.smartup.timetracker.dto.ErrorCode");
        Field term124096 = ((Class) term124097).getDeclaredField((String) "NOT_UNIQUE_TASK_NAME");
        ((Field) term124096).setAccessible(true);
        Object enum244 = ((Field) term124096).get((Object) null);
        HashMap term124082 = new HashMap();
        ArrayList term124092 = new ArrayList();
        term124034 = newInstance(Class.forName("ru.smartup.timetracker.dto.ResultDto"));
        setBooleanField(term124034, term124034.getClass(), "success", false);
        setField(term124034, term124034.getClass(), "params", term124036);
        setField(term124034, term124034.getClass(), "errorCode", enum244);
        setField(term124034, term124034.getClass(), "errorMessage", "GeVOqtDiGv");
        setField(term124034, term124034.getClass(), "validationErrors", term124082);
        setField(term124034, term124034.getClass(), "relatedEntities", term124092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.ResultDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term124034, args);
    }

};


