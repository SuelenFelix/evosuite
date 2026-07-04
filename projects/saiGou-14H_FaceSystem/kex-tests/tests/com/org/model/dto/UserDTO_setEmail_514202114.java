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

public class UserDTO_setEmail_514202114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4949;

    public UserDTO_setEmail_514202114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4962 = new ArrayList();
        Integer term4966 = new Integer(1398204340);
        term4949 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term4949, term4949.getClass(), "Type", "BjugTaMcxJ");
        setField(term4949, term4949.getClass(), "idList", term4962);
        setField(term4949, term4949.getClass(), "meetingid", term4966);
        setField(term4949, term4949.getClass(), "email", "vGiuZVPJNH");
        setField(term4949, term4949.getClass(), "username", "tlzpzIjMib");
        setField(term4949, term4949.getClass(), "base64Face", "AZdLeSugwv");
        setField(term4949, term4949.getClass(), "oldpassword", "RMsXuyzKJV");
        setField(term4949, term4949.getClass(), "newpassword", "FwPbDZcHmB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hOncybyCAH";
        callMethod(klass, "setEmail", argTypes, term4949, args);
    }

};


