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

public class UserDTO_hashCode_97930167526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13896;

    public UserDTO_hashCode_97930167526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13911 = new Integer(1989014880);
        ArrayList term13909 = new ArrayList();
        ((ArrayList) term13909).add(term13911);
        Integer term13915 = new Integer(-330280702);
        term13896 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term13896, term13896.getClass(), "Type", "lEtoSVazWN");
        setField(term13896, term13896.getClass(), "idList", term13909);
        setField(term13896, term13896.getClass(), "meetingid", term13915);
        setField(term13896, term13896.getClass(), "email", "ddDDOEjMuN");
        setField(term13896, term13896.getClass(), "username", "tHBufRenNj");
        setField(term13896, term13896.getClass(), "base64Face", "wtWSSbxhjb");
        setField(term13896, term13896.getClass(), "oldpassword", "ibhIEMBJkC");
        setField(term13896, term13896.getClass(), "newpassword", "ozYBIBVPBo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term13896, args);
    }

};


