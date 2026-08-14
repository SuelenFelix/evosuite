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
import java.util.LinkedList;

public class UserDTO_setSecondaryEmails_184081317314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3874;
     Object term3943;

    public UserDTO_setSecondaryEmails_184081317314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3875 = new Long(50358265865610362L);
        Object term3927 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3927, term3927.getClass(), "email", "");
        Object term3929 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3929, term3929.getClass(), "email", "");
        Object term3931 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3931, term3931.getClass(), "email", "");
        Object term3933 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3933, term3933.getClass(), "email", "");
        Object term3935 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3935, term3935.getClass(), "email", "");
        ArrayList term3925 = new ArrayList();
        ((ArrayList) term3925).add(term3927);
        ((ArrayList) term3925).add(term3929);
        ((ArrayList) term3925).add(term3931);
        ((ArrayList) term3925).add(term3933);
        ((ArrayList) term3925).add(term3935);
        Long term3939 = new Long(5510783420697225605L);
        Long term3941 = new Long(6005241913654469005L);
        term3874 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term3874, term3874.getClass(), "id", term3875);
        setField(term3874, term3874.getClass(), "userName", "CGOpQSZZwI");
        setField(term3874, term3874.getClass(), "firstName", "ypEdrstygY");
        setField(term3874, term3874.getClass(), "lastName", "sNQFlATEeQ");
        setField(term3874, term3874.getClass(), "primaryEmail", "ZKMLioamsY");
        setField(term3874, term3874.getClass(), "secondaryEmails", term3925);
        setField(term3874, term3874.getClass(), "createdAt", term3939);
        setField(term3874, term3874.getClass(), "updatedAt", term3941);
        term3943 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3943;
        callMethod(klass, "setSecondaryEmails", argTypes, term3874, args);
    }

};


