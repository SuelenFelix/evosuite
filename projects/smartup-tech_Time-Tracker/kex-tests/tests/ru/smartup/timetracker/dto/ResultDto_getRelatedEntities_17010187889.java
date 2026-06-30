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

public class ResultDto_getRelatedEntities_17010187889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125745;

    public ResultDto_getRelatedEntities_17010187889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term125747 = new HashMap();
        Class<? extends Object> term125823 = Class.forName((String) "ru.smartup.timetracker.dto.ErrorCode");
        Field term125822 = ((Class) term125823).getDeclaredField((String) "RELATED_ENTITIES_FOUND_FOR_POSITION");
        ((Field) term125822).setAccessible(true);
        Object enum249 = ((Field) term125822).get((Object) null);
        HashMap term125808 = new HashMap();
        ArrayList term125818 = new ArrayList();
        term125745 = newInstance(Class.forName("ru.smartup.timetracker.dto.ResultDto"));
        setBooleanField(term125745, term125745.getClass(), "success", false);
        setField(term125745, term125745.getClass(), "params", term125747);
        setField(term125745, term125745.getClass(), "errorCode", enum249);
        setField(term125745, term125745.getClass(), "errorMessage", "XnZHOhTfxL");
        setField(term125745, term125745.getClass(), "validationErrors", term125808);
        setField(term125745, term125745.getClass(), "relatedEntities", term125818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.ResultDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelatedEntities", argTypes, term125745, args);
    }

};


