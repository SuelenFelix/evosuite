package ru.smartup.timetracker.dto.employee.request;

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
import static ru.smartup.timetracker.dto.employee.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class EmployeeCreateDto_setEmail_95941371711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22170;

    public EmployeeCreateDto_setEmail_95941371711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22232 = new ArrayList();
        term22170 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term22170, term22170.getClass(), "firstName", "WHcwFgsGFC");
        setField(term22170, term22170.getClass(), "middleName", "HzqpegHiRq");
        setField(term22170, term22170.getClass(), "lastName", "jwsfVjMoJT");
        setField(term22170, term22170.getClass(), "email", "ZfdXfCCFDf");
        setField(term22170, term22170.getClass(), "password", "MwwjNtdOFT");
        setIntField(term22170, term22170.getClass(), "positionId", -244121226);
        setField(term22170, term22170.getClass(), "roles", term22232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VYkqXKVlAJ";
        callMethod(klass, "setEmail", argTypes, term22170, args);
    }

};


