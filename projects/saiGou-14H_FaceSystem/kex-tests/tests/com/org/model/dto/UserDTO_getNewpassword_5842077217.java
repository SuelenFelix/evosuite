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

public class UserDTO_getNewpassword_5842077217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12478;

    public UserDTO_getNewpassword_5842077217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12493 = new Integer(575249858);
        Integer term12495 = new Integer(-297957951);
        Integer term12497 = new Integer(-1816920588);
        ArrayList term12491 = new ArrayList();
        ((ArrayList) term12491).add(term12493);
        ((ArrayList) term12491).add(term12495);
        ((ArrayList) term12491).add(term12497);
        Integer term12501 = new Integer(1674165862);
        term12478 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term12478, term12478.getClass(), "Type", "paedcGulXI");
        setField(term12478, term12478.getClass(), "idList", term12491);
        setField(term12478, term12478.getClass(), "meetingid", term12501);
        setField(term12478, term12478.getClass(), "email", "voVkXMJSsx");
        setField(term12478, term12478.getClass(), "username", "tOqDchKApH");
        setField(term12478, term12478.getClass(), "base64Face", "iqeVuiibgM");
        setField(term12478, term12478.getClass(), "oldpassword", "LCPfALdqnP");
        setField(term12478, term12478.getClass(), "newpassword", "YRvjJByBZa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewpassword", argTypes, term12478, args);
    }

};


