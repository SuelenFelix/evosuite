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

public class UserDTO_setUpdatedAt_33427363816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4095;
     Object term4172;

    public UserDTO_setUpdatedAt_33427363816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4096 = new Long(4474998035090263139L);
        Object term4148 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4148, term4148.getClass(), "email", "");
        Object term4150 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4150, term4150.getClass(), "email", "");
        Object term4152 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4152, term4152.getClass(), "email", "");
        Object term4154 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4154, term4154.getClass(), "email", "");
        Object term4156 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4156, term4156.getClass(), "email", "");
        Object term4158 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4158, term4158.getClass(), "email", "");
        Object term4160 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4160, term4160.getClass(), "email", "");
        Object term4162 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4162, term4162.getClass(), "email", "");
        Object term4164 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4164, term4164.getClass(), "email", "");
        ArrayList term4146 = new ArrayList();
        ((ArrayList) term4146).add(term4148);
        ((ArrayList) term4146).add(term4150);
        ((ArrayList) term4146).add(term4152);
        ((ArrayList) term4146).add(term4154);
        ((ArrayList) term4146).add(term4156);
        ((ArrayList) term4146).add(term4158);
        ((ArrayList) term4146).add(term4160);
        ((ArrayList) term4146).add(term4162);
        ((ArrayList) term4146).add(term4164);
        Long term4168 = new Long(2848819812340321742L);
        Long term4170 = new Long(-8876856890348836498L);
        term4095 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term4095, term4095.getClass(), "id", term4096);
        setField(term4095, term4095.getClass(), "userName", "zaloBqlrSo");
        setField(term4095, term4095.getClass(), "firstName", "vvoLrMGCoN");
        setField(term4095, term4095.getClass(), "lastName", "pXdglvyrQe");
        setField(term4095, term4095.getClass(), "primaryEmail", "OcfNzHYdki");
        setField(term4095, term4095.getClass(), "secondaryEmails", term4146);
        setField(term4095, term4095.getClass(), "createdAt", term4168);
        setField(term4095, term4095.getClass(), "updatedAt", term4170);
        term4172 = new Long(846579494941632714L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4172;
        callMethod(klass, "setUpdatedAt", argTypes, term4095, args);
    }

};


