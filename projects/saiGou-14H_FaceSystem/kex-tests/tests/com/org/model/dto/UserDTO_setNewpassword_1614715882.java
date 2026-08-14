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

public class UserDTO_setNewpassword_1614715882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11255;

    public UserDTO_setNewpassword_1614715882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11270 = new Integer(-1343269854);
        Integer term11272 = new Integer(-731459309);
        Integer term11274 = new Integer(-913468095);
        Integer term11276 = new Integer(38489871);
        Integer term11278 = new Integer(-1667787735);
        ArrayList term11268 = new ArrayList();
        ((ArrayList) term11268).add(term11270);
        ((ArrayList) term11268).add(term11272);
        ((ArrayList) term11268).add(term11274);
        ((ArrayList) term11268).add(term11276);
        ((ArrayList) term11268).add(term11278);
        Integer term11282 = new Integer(1841765799);
        term11255 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term11255, term11255.getClass(), "Type", "dVNQlaRjno");
        setField(term11255, term11255.getClass(), "idList", term11268);
        setField(term11255, term11255.getClass(), "meetingid", term11282);
        setField(term11255, term11255.getClass(), "email", "heuePoxaMW");
        setField(term11255, term11255.getClass(), "username", "MxqYtTLyvM");
        setField(term11255, term11255.getClass(), "base64Face", "FuAWIrUgQq");
        setField(term11255, term11255.getClass(), "oldpassword", "GMuFrECYuC");
        setField(term11255, term11255.getClass(), "newpassword", "sgrKLUdnej");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "COSohDlJwZ";
        callMethod(klass, "setNewpassword", argTypes, term11255, args);
    }

};


