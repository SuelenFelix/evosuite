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

public class UserDTO_setMeetingid_182790544620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12956;
     Object term13035;

    public UserDTO_setMeetingid_182790544620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12969 = new ArrayList();
        Integer term12973 = new Integer(-1493632787);
        term12956 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term12956, term12956.getClass(), "Type", "qlzeNoUsis");
        setField(term12956, term12956.getClass(), "idList", term12969);
        setField(term12956, term12956.getClass(), "meetingid", term12973);
        setField(term12956, term12956.getClass(), "email", "yzmxcgrHQF");
        setField(term12956, term12956.getClass(), "username", "XCCRJOWaYi");
        setField(term12956, term12956.getClass(), "base64Face", "LGjjIEeXNn");
        setField(term12956, term12956.getClass(), "oldpassword", "gxjxaNDCjb");
        setField(term12956, term12956.getClass(), "newpassword", "ZkckWvQlSC");
        term13035 = new Integer(-1056969264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term13035;
        callMethod(klass, "setMeetingid", argTypes, term12956, args);
    }

};


