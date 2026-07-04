package com.org.model.dto;

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
import static com.org.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.LinkedList;

public class UserDTO_setIdList_22707505312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4654;
     Object term4743;

    public UserDTO_setIdList_22707505312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4669 = new Integer(-1498296052);
        Integer term4671 = new Integer(2098647989);
        Integer term4673 = new Integer(1598895173);
        Integer term4675 = new Integer(1830648570);
        Integer term4677 = new Integer(-227365013);
        ArrayList term4667 = new ArrayList();
        ((ArrayList) term4667).add(term4669);
        ((ArrayList) term4667).add(term4671);
        ((ArrayList) term4667).add(term4673);
        ((ArrayList) term4667).add(term4675);
        ((ArrayList) term4667).add(term4677);
        Integer term4681 = new Integer(11724947);
        term4654 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term4654, term4654.getClass(), "Type", "OqbwYQfvAe");
        setField(term4654, term4654.getClass(), "idList", term4667);
        setField(term4654, term4654.getClass(), "meetingid", term4681);
        setField(term4654, term4654.getClass(), "email", "tRxZafjqIx");
        setField(term4654, term4654.getClass(), "username", "DhjNLmRMCu");
        setField(term4654, term4654.getClass(), "base64Face", "PgPzMSEjjX");
        setField(term4654, term4654.getClass(), "oldpassword", "wzsPSPcRdj");
        setField(term4654, term4654.getClass(), "newpassword", "kGMQdqJYyB");
        term4743 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4743;
        callMethod(klass, "setIdList", argTypes, term4654, args);
    }

};


