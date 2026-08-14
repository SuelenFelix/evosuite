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

public class UserDTO_setUserName_122733494710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3344;

    public UserDTO_setUserName_122733494710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3345 = new Long(463622836963501975L);
        Object term3397 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3397, term3397.getClass(), "email", "");
        Object term3399 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3399, term3399.getClass(), "email", "");
        Object term3401 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3401, term3401.getClass(), "email", "");
        Object term3403 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3403, term3403.getClass(), "email", "");
        Object term3405 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3405, term3405.getClass(), "email", "");
        Object term3407 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3407, term3407.getClass(), "email", "");
        Object term3409 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3409, term3409.getClass(), "email", "");
        Object term3411 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3411, term3411.getClass(), "email", "");
        Object term3413 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3413, term3413.getClass(), "email", "");
        ArrayList term3395 = new ArrayList();
        ((ArrayList) term3395).add(term3397);
        ((ArrayList) term3395).add(term3399);
        ((ArrayList) term3395).add(term3401);
        ((ArrayList) term3395).add(term3403);
        ((ArrayList) term3395).add(term3405);
        ((ArrayList) term3395).add(term3407);
        ((ArrayList) term3395).add(term3409);
        ((ArrayList) term3395).add(term3411);
        ((ArrayList) term3395).add(term3413);
        Long term3417 = new Long(305759998609888272L);
        Long term3419 = new Long(-8654565919063661957L);
        term3344 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term3344, term3344.getClass(), "id", term3345);
        setField(term3344, term3344.getClass(), "userName", "tlQSNgTkQX");
        setField(term3344, term3344.getClass(), "firstName", "PCipZnmBOF");
        setField(term3344, term3344.getClass(), "lastName", "zcorEihhLK");
        setField(term3344, term3344.getClass(), "primaryEmail", "GrqozDKFOk");
        setField(term3344, term3344.getClass(), "secondaryEmails", term3395);
        setField(term3344, term3344.getClass(), "createdAt", term3417);
        setField(term3344, term3344.getClass(), "updatedAt", term3419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TwfWVQGiIj";
        callMethod(klass, "setUserName", argTypes, term3344, args);
    }

};


