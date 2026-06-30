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

public class ResultDto_getErrorCode_18927124976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124732;

    public ResultDto_getErrorCode_18927124976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term124734 = new HashMap();
        Class<? extends Object> term124812 = Class.forName((String) "ru.smartup.timetracker.dto.ErrorCode");
        Field term124811 = ((Class) term124812).getDeclaredField((String) "NOT_PROCESSED_TRACK_UNITS_FOR_PROJECT");
        ((Field) term124811).setAccessible(true);
        Object enum246 = ((Field) term124811).get((Object) null);
        HashMap term124797 = new HashMap();
        ArrayList term124807 = new ArrayList();
        term124732 = newInstance(Class.forName("ru.smartup.timetracker.dto.ResultDto"));
        setBooleanField(term124732, term124732.getClass(), "success", true);
        setField(term124732, term124732.getClass(), "params", term124734);
        setField(term124732, term124732.getClass(), "errorCode", enum246);
        setField(term124732, term124732.getClass(), "errorMessage", "qvqwmSUIiP");
        setField(term124732, term124732.getClass(), "validationErrors", term124797);
        setField(term124732, term124732.getClass(), "relatedEntities", term124807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.ResultDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorCode", argTypes, term124732, args);
    }

};


