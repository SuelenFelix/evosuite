package ru.smartup.timetracker.service.freeze;

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
import static ru.smartup.timetracker.service.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FreezeService_createOrUpdateTask_439296456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1059;
     Object term1060;

    public FreezeService_createOrUpdateTask_439296456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1059 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        setField(term1059, term1059.getClass(), "freezeSchedulePlanner", null);
        setField(term1059, term1059.getClass(), "crudFreezeService", null);
        setField(term1059, term1059.getClass(), "freezeValidator", null);
        setField(term1059, term1059.getClass(), "freezeDateUtils", null);
        setField(term1059, term1059.getClass(), "lockManager", null);
        term1060 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1060;
        callMethod(klass, "createOrUpdateTask", argTypes, term1059, args);
    }

};


