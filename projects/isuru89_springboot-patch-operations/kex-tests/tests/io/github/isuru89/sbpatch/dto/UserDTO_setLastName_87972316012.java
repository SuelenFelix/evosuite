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

public class UserDTO_setLastName_87972316012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3610;

    public UserDTO_setLastName_87972316012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3611 = new Long(6682528376118987775L);
        Object term3663 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3663, term3663.getClass(), "email", "");
        Object term3665 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3665, term3665.getClass(), "email", "");
        Object term3667 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3667, term3667.getClass(), "email", "");
        Object term3669 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3669, term3669.getClass(), "email", "");
        Object term3671 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3671, term3671.getClass(), "email", "");
        ArrayList term3661 = new ArrayList();
        ((ArrayList) term3661).add(term3663);
        ((ArrayList) term3661).add(term3665);
        ((ArrayList) term3661).add(term3667);
        ((ArrayList) term3661).add(term3669);
        ((ArrayList) term3661).add(term3671);
        Long term3675 = new Long(682356318767179819L);
        Long term3677 = new Long(-7291743527973326814L);
        term3610 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term3610, term3610.getClass(), "id", term3611);
        setField(term3610, term3610.getClass(), "userName", "MHGKyEnwKc");
        setField(term3610, term3610.getClass(), "firstName", "ShIELyuULw");
        setField(term3610, term3610.getClass(), "lastName", "IpQuOGMgmj");
        setField(term3610, term3610.getClass(), "primaryEmail", "pJbnHTYrxn");
        setField(term3610, term3610.getClass(), "secondaryEmails", term3661);
        setField(term3610, term3610.getClass(), "createdAt", term3675);
        setField(term3610, term3610.getClass(), "updatedAt", term3677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UKAReurpHG";
        callMethod(klass, "setLastName", argTypes, term3610, args);
    }

};


