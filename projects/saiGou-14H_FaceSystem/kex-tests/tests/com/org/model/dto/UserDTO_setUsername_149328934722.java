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

public class UserDTO_setUsername_149328934722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13264;

    public UserDTO_setUsername_149328934722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13277 = new ArrayList();
        Integer term13281 = new Integer(637942911);
        term13264 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term13264, term13264.getClass(), "Type", "OpDokNbkSu");
        setField(term13264, term13264.getClass(), "idList", term13277);
        setField(term13264, term13264.getClass(), "meetingid", term13281);
        setField(term13264, term13264.getClass(), "email", "yHeJtottbK");
        setField(term13264, term13264.getClass(), "username", "EsebiMkeGU");
        setField(term13264, term13264.getClass(), "base64Face", "ronKInFVff");
        setField(term13264, term13264.getClass(), "oldpassword", "OTWCnNUjew");
        setField(term13264, term13264.getClass(), "newpassword", "oUSILMxQiI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dohWFHGwwR";
        callMethod(klass, "setUsername", argTypes, term13264, args);
    }

};


