package io.github.isuru89.sbpatch.service;

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
import static io.github.isuru89.sbpatch.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class UserService_addUser_2642864740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserService_addUser_2642864740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Object term54 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term54, term54.getClass(), "email", "");
        Object term56 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term56, term56.getClass(), "email", "");
        Object term58 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term58, term58.getClass(), "email", "");
        Object term60 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term60, term60.getClass(), "email", "");
        Object term62 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term62, term62.getClass(), "email", "");
        ArrayList term52 = new ArrayList();
        ((ArrayList) term52).add(term54);
        ((ArrayList) term52).add(term56);
        ((ArrayList) term52).add(term58);
        ((ArrayList) term52).add(term60);
        ((ArrayList) term52).add(term62);
        Long term66 = new Long(6375119433582206027L);
        Long term68 = new Long(-8257434502486459194L);
        term1 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "userName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "firstName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "lastName", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "primaryEmail", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "secondaryEmails", term52);
        setField(term1, term1.getClass(), "createdAt", term66);
        setField(term1, term1.getClass(), "updatedAt", term68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "addUser", argTypes, null, args);
    }

};


