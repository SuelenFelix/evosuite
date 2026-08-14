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

public class UserDTO_getUserName_3590074932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2504;

    public UserDTO_getUserName_3590074932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2505 = new Long(-6292278961887936280L);
        Object term2557 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2557, term2557.getClass(), "email", "");
        Object term2559 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2559, term2559.getClass(), "email", "");
        Object term2561 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2561, term2561.getClass(), "email", "");
        ArrayList term2555 = new ArrayList();
        ((ArrayList) term2555).add(term2557);
        ((ArrayList) term2555).add(term2559);
        ((ArrayList) term2555).add(term2561);
        Long term2565 = new Long(-6645965768855543712L);
        Long term2567 = new Long(4784595517102746672L);
        term2504 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term2504, term2504.getClass(), "id", term2505);
        setField(term2504, term2504.getClass(), "userName", "hMmaoREuCK");
        setField(term2504, term2504.getClass(), "firstName", "VeDtgDzGAN");
        setField(term2504, term2504.getClass(), "lastName", "aWYOWZFyaX");
        setField(term2504, term2504.getClass(), "primaryEmail", "BRIVNtfUWU");
        setField(term2504, term2504.getClass(), "secondaryEmails", term2555);
        setField(term2504, term2504.getClass(), "createdAt", term2565);
        setField(term2504, term2504.getClass(), "updatedAt", term2567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term2504, args);
    }

};


