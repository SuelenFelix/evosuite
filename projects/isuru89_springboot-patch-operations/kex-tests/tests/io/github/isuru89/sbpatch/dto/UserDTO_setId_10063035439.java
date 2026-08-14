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

public class UserDTO_setId_10063035439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3241;
     Object term3302;

    public UserDTO_setId_10063035439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3242 = new Long(-1610676979013636850L);
        Object term3294 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3294, term3294.getClass(), "email", "");
        ArrayList term3292 = new ArrayList();
        ((ArrayList) term3292).add(term3294);
        Long term3298 = new Long(2062173786000223358L);
        Long term3300 = new Long(-8658027316505137504L);
        term3241 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term3241, term3241.getClass(), "id", term3242);
        setField(term3241, term3241.getClass(), "userName", "FwPbDZcHmB");
        setField(term3241, term3241.getClass(), "firstName", "hOncybyCAH");
        setField(term3241, term3241.getClass(), "lastName", "QduALnDSVo");
        setField(term3241, term3241.getClass(), "primaryEmail", "izPpKDErnQ");
        setField(term3241, term3241.getClass(), "secondaryEmails", term3292);
        setField(term3241, term3241.getClass(), "createdAt", term3298);
        setField(term3241, term3241.getClass(), "updatedAt", term3300);
        term3302 = new Long(414749984815662075L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3302;
        callMethod(klass, "setId", argTypes, term3241, args);
    }

};


