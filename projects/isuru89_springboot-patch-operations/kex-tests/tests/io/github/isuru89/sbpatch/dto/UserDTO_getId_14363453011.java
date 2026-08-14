package io.github.isuru89.sbpatch.dto;

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
import static io.github.isuru89.sbpatch.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class UserDTO_getId_14363453011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2401;

    public UserDTO_getId_14363453011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2402 = new Long(5907001541142728739L);
        Object term2454 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2454, term2454.getClass(), "email", "");
        Object term2456 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2456, term2456.getClass(), "email", "");
        ArrayList term2452 = new ArrayList();
        ((ArrayList) term2452).add(term2454);
        ((ArrayList) term2452).add(term2456);
        Long term2460 = new Long(4178434741742309755L);
        Long term2462 = new Long(-2068172595987555756L);
        term2401 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term2401, term2401.getClass(), "id", term2402);
        setField(term2401, term2401.getClass(), "userName", "VYkqXKVlAJ");
        setField(term2401, term2401.getClass(), "firstName", "XkIoWJRNwN");
        setField(term2401, term2401.getClass(), "lastName", "aNWLJdrZMq");
        setField(term2401, term2401.getClass(), "primaryEmail", "HHmNoYxIGj");
        setField(term2401, term2401.getClass(), "secondaryEmails", term2452);
        setField(term2401, term2401.getClass(), "createdAt", term2460);
        setField(term2401, term2401.getClass(), "updatedAt", term2462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2401, args);
    }

};


