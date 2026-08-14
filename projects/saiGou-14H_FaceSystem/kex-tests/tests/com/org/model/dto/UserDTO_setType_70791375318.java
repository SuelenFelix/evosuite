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

public class UserDTO_setType_70791375318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12623;

    public UserDTO_setType_70791375318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12638 = new Integer(1875252647);
        Integer term12640 = new Integer(-1298688401);
        Integer term12642 = new Integer(1907832341);
        Integer term12644 = new Integer(932199784);
        Integer term12646 = new Integer(1953620444);
        Integer term12648 = new Integer(-1111307978);
        Integer term12650 = new Integer(609697271);
        Integer term12652 = new Integer(1121247998);
        Integer term12654 = new Integer(-710001354);
        ArrayList term12636 = new ArrayList();
        ((ArrayList) term12636).add(term12638);
        ((ArrayList) term12636).add(term12640);
        ((ArrayList) term12636).add(term12642);
        ((ArrayList) term12636).add(term12644);
        ((ArrayList) term12636).add(term12646);
        ((ArrayList) term12636).add(term12648);
        ((ArrayList) term12636).add(term12650);
        ((ArrayList) term12636).add(term12652);
        ((ArrayList) term12636).add(term12654);
        Integer term12658 = new Integer(2007404429);
        term12623 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term12623, term12623.getClass(), "Type", "yWPHiAqZcQ");
        setField(term12623, term12623.getClass(), "idList", term12636);
        setField(term12623, term12623.getClass(), "meetingid", term12658);
        setField(term12623, term12623.getClass(), "email", "IppcpUlrjC");
        setField(term12623, term12623.getClass(), "username", "hxSnnaHCFY");
        setField(term12623, term12623.getClass(), "base64Face", "SQvESbffjw");
        setField(term12623, term12623.getClass(), "oldpassword", "eOSkqEXcaE");
        setField(term12623, term12623.getClass(), "newpassword", "MAHSuEBjDv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FJPRnSrJmK";
        callMethod(klass, "setType", argTypes, term12623, args);
    }

};


