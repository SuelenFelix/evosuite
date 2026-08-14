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

public class UserDTO_setCreatedAt_41414555515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3986;
     Object term4053;

    public UserDTO_setCreatedAt_41414555515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3987 = new Long(-1983291584002806658L);
        Object term4039 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4039, term4039.getClass(), "email", "");
        Object term4041 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4041, term4041.getClass(), "email", "");
        Object term4043 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4043, term4043.getClass(), "email", "");
        Object term4045 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4045, term4045.getClass(), "email", "");
        ArrayList term4037 = new ArrayList();
        ((ArrayList) term4037).add(term4039);
        ((ArrayList) term4037).add(term4041);
        ((ArrayList) term4037).add(term4043);
        ((ArrayList) term4037).add(term4045);
        Long term4049 = new Long(5946780097489996391L);
        Long term4051 = new Long(-8652538484981166496L);
        term3986 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term3986, term3986.getClass(), "id", term3987);
        setField(term3986, term3986.getClass(), "userName", "SOrEHbcbmn");
        setField(term3986, term3986.getClass(), "firstName", "bnsyeQXFdu");
        setField(term3986, term3986.getClass(), "lastName", "BwtdjiefJn");
        setField(term3986, term3986.getClass(), "primaryEmail", "jDmhBrIoDa");
        setField(term3986, term3986.getClass(), "secondaryEmails", term4037);
        setField(term3986, term3986.getClass(), "createdAt", term4049);
        setField(term3986, term3986.getClass(), "updatedAt", term4051);
        term4053 = new Long(2701184207686293431L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4053;
        callMethod(klass, "setCreatedAt", argTypes, term3986, args);
    }

};


