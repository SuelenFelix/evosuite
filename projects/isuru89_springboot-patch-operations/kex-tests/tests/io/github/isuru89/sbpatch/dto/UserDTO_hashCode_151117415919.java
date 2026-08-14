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

public class UserDTO_hashCode_151117415919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4436;

    public UserDTO_hashCode_151117415919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4437 = new Long(2135754395358000892L);
        Object term4489 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term4489, term4489.getClass(), "email", "");
        ArrayList term4487 = new ArrayList();
        ((ArrayList) term4487).add(term4489);
        Long term4493 = new Long(-8085190702504231560L);
        Long term4495 = new Long(1672578078364590450L);
        term4436 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term4436, term4436.getClass(), "id", term4437);
        setField(term4436, term4436.getClass(), "userName", "QSrDQfEsTR");
        setField(term4436, term4436.getClass(), "firstName", "PsqusYmejD");
        setField(term4436, term4436.getClass(), "lastName", "NTWMiBEaDF");
        setField(term4436, term4436.getClass(), "primaryEmail", "SPBstwKFVr");
        setField(term4436, term4436.getClass(), "secondaryEmails", term4487);
        setField(term4436, term4436.getClass(), "createdAt", term4493);
        setField(term4436, term4436.getClass(), "updatedAt", term4495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4436, args);
    }

};


