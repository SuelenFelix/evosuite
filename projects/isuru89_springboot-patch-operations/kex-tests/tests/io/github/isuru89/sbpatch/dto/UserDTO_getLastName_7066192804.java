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

public class UserDTO_getLastName_7066192804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2710;

    public UserDTO_getLastName_7066192804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2711 = new Long(-4443169559037975007L);
        ArrayList term2761 = new ArrayList();
        Long term2765 = new Long(-3842548265506930260L);
        Long term2767 = new Long(-5788180182343976541L);
        term2710 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term2710, term2710.getClass(), "id", term2711);
        setField(term2710, term2710.getClass(), "userName", "rLHAoqXgPh");
        setField(term2710, term2710.getClass(), "firstName", "zUlRdimJtU");
        setField(term2710, term2710.getClass(), "lastName", "vwbEQQNQrx");
        setField(term2710, term2710.getClass(), "primaryEmail", "xtftXXMbem");
        setField(term2710, term2710.getClass(), "secondaryEmails", term2761);
        setField(term2710, term2710.getClass(), "createdAt", term2765);
        setField(term2710, term2710.getClass(), "updatedAt", term2767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term2710, args);
    }

};


