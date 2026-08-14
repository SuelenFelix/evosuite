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

public class UserDTO_setFirstName_184899743811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3483;

    public UserDTO_setFirstName_184899743811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3484 = new Long(-5248475803419977214L);
        Object term3536 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3536, term3536.getClass(), "email", "");
        Object term3538 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3538, term3538.getClass(), "email", "");
        Object term3540 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3540, term3540.getClass(), "email", "");
        ArrayList term3534 = new ArrayList();
        ((ArrayList) term3534).add(term3536);
        ((ArrayList) term3534).add(term3538);
        ((ArrayList) term3534).add(term3540);
        Long term3544 = new Long(-6723783499250797216L);
        Long term3546 = new Long(41775768178052008L);
        term3483 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term3483, term3483.getClass(), "id", term3484);
        setField(term3483, term3483.getClass(), "userName", "gUvcueTURF");
        setField(term3483, term3483.getClass(), "firstName", "EwQBhZjCIT");
        setField(term3483, term3483.getClass(), "lastName", "aSkmSwTnEw");
        setField(term3483, term3483.getClass(), "primaryEmail", "xvkbvaEGYd");
        setField(term3483, term3483.getClass(), "secondaryEmails", term3534);
        setField(term3483, term3483.getClass(), "createdAt", term3544);
        setField(term3483, term3483.getClass(), "updatedAt", term3546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XfRABIFVEp";
        callMethod(klass, "setFirstName", argTypes, term3483, args);
    }

};


