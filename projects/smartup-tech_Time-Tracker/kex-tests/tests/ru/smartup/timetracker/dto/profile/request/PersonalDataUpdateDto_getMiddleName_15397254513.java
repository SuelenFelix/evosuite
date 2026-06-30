package ru.smartup.timetracker.dto.profile.request;

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
import static ru.smartup.timetracker.dto.profile.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PersonalDataUpdateDto_getMiddleName_15397254513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740;

    public PersonalDataUpdateDto_getMiddleName_15397254513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term740 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.request.PersonalDataUpdateDto"));
        setField(term740, term740.getClass(), "firstName", null);
        setField(term740, term740.getClass(), "middleName", null);
        setField(term740, term740.getClass(), "lastName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.request.PersonalDataUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiddleName", argTypes, term740, args);
    }

};


