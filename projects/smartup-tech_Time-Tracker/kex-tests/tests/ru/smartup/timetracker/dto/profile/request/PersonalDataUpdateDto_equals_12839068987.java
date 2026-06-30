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

public class PersonalDataUpdateDto_equals_12839068987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469;
     Object term506;

    public PersonalDataUpdateDto_equals_12839068987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.request.PersonalDataUpdateDto"));
        setField(term469, term469.getClass(), "firstName", "RkybSrpybU");
        setField(term469, term469.getClass(), "middleName", "xOEqzGAmDU");
        setField(term469, term469.getClass(), "lastName", "eZFUvlxvGV");
        term506 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.request.PersonalDataUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term506;
        callMethod(klass, "equals", argTypes, term469, args);
    }

};


