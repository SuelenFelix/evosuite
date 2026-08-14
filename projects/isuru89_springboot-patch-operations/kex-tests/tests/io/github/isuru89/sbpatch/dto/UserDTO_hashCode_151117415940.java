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

public class UserDTO_hashCode_151117415940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4670;

    public UserDTO_hashCode_151117415940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4670 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term4670, term4670.getClass(), "id", null);
        setField(term4670, term4670.getClass(), "userName", null);
        setField(term4670, term4670.getClass(), "firstName", null);
        setField(term4670, term4670.getClass(), "lastName", null);
        setField(term4670, term4670.getClass(), "primaryEmail", null);
        setField(term4670, term4670.getClass(), "secondaryEmails", null);
        setField(term4670, term4670.getClass(), "createdAt", null);
        setField(term4670, term4670.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4670, args);
    }

};


