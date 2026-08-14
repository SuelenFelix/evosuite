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

public class UserDTO_getUsername_121533550913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12042;

    public UserDTO_getUsername_121533550913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12055 = new ArrayList();
        Integer term12059 = new Integer(996017434);
        term12042 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term12042, term12042.getClass(), "Type", "RqPlzjjWzi");
        setField(term12042, term12042.getClass(), "idList", term12055);
        setField(term12042, term12042.getClass(), "meetingid", term12059);
        setField(term12042, term12042.getClass(), "email", "rTGRmrdzoJ");
        setField(term12042, term12042.getClass(), "username", "ZWjeJhPPnm");
        setField(term12042, term12042.getClass(), "base64Face", "yPIlHPlNib");
        setField(term12042, term12042.getClass(), "oldpassword", "qdtUDYxxKy");
        setField(term12042, term12042.getClass(), "newpassword", "fSxuiDFwrP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term12042, args);
    }

};


