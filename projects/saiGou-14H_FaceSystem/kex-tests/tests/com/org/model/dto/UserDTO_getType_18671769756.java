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

public class UserDTO_getType_18671769756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11427;

    public UserDTO_getType_18671769756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11442 = new Integer(72160200);
        Integer term11444 = new Integer(-1870567623);
        Integer term11446 = new Integer(-1442923471);
        Integer term11448 = new Integer(-434247549);
        Integer term11450 = new Integer(1246505552);
        Integer term11452 = new Integer(-1456497810);
        ArrayList term11440 = new ArrayList();
        ((ArrayList) term11440).add(term11442);
        ((ArrayList) term11440).add(term11444);
        ((ArrayList) term11440).add(term11446);
        ((ArrayList) term11440).add(term11448);
        ((ArrayList) term11440).add(term11450);
        ((ArrayList) term11440).add(term11452);
        Integer term11456 = new Integer(61954667);
        term11427 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term11427, term11427.getClass(), "Type", "mnrQVzZjuq");
        setField(term11427, term11427.getClass(), "idList", term11440);
        setField(term11427, term11427.getClass(), "meetingid", term11456);
        setField(term11427, term11427.getClass(), "email", "SwynsBLJcI");
        setField(term11427, term11427.getClass(), "username", "yXgTitaDXW");
        setField(term11427, term11427.getClass(), "base64Face", "qiYIlJidwz");
        setField(term11427, term11427.getClass(), "oldpassword", "bTxEkaNhzD");
        setField(term11427, term11427.getClass(), "newpassword", "GJhlvPIEzj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term11427, args);
    }

};


