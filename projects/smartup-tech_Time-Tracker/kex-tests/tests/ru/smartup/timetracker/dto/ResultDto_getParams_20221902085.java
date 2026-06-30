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

public class ResultDto_getParams_20221902085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124353;

    public ResultDto_getParams_20221902085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term124355 = new HashMap();
        Class<? extends Object> term124431 = Class.forName((String) "ru.smartup.timetracker.dto.ErrorCode");
        Field term124430 = ((Class) term124431).getDeclaredField((String) "RELATED_ENTITIES_FOUND_FOR_POSITION");
        ((Field) term124430).setAccessible(true);
        Object enum245 = ((Field) term124430).get((Object) null);
        HashMap term124416 = new HashMap();
        ArrayList term124426 = new ArrayList();
        term124353 = newInstance(Class.forName("ru.smartup.timetracker.dto.ResultDto"));
        setBooleanField(term124353, term124353.getClass(), "success", false);
        setField(term124353, term124353.getClass(), "params", term124355);
        setField(term124353, term124353.getClass(), "errorCode", enum245);
        setField(term124353, term124353.getClass(), "errorMessage", "WmSSWHEELj");
        setField(term124353, term124353.getClass(), "validationErrors", term124416);
        setField(term124353, term124353.getClass(), "relatedEntities", term124426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.ResultDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParams", argTypes, term124353, args);
    }

};


