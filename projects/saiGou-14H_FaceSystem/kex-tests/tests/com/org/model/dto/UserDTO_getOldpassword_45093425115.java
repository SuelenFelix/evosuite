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

public class UserDTO_getOldpassword_45093425115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12320;

    public UserDTO_getOldpassword_45093425115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12335 = new Integer(360715062);
        Integer term12337 = new Integer(1047409266);
        Integer term12339 = new Integer(1427248961);
        Integer term12341 = new Integer(1445291866);
        Integer term12343 = new Integer(-139927812);
        Integer term12345 = new Integer(-2065157320);
        Integer term12347 = new Integer(1782011477);
        Integer term12349 = new Integer(2129957018);
        Integer term12351 = new Integer(691663312);
        ArrayList term12333 = new ArrayList();
        ((ArrayList) term12333).add(term12335);
        ((ArrayList) term12333).add(term12337);
        ((ArrayList) term12333).add(term12339);
        ((ArrayList) term12333).add(term12341);
        ((ArrayList) term12333).add(term12343);
        ((ArrayList) term12333).add(term12345);
        ((ArrayList) term12333).add(term12347);
        ((ArrayList) term12333).add(term12349);
        ((ArrayList) term12333).add(term12351);
        Integer term12355 = new Integer(-1236696275);
        term12320 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term12320, term12320.getClass(), "Type", "qokvePyIUm");
        setField(term12320, term12320.getClass(), "idList", term12333);
        setField(term12320, term12320.getClass(), "meetingid", term12355);
        setField(term12320, term12320.getClass(), "email", "mdkCDAisEP");
        setField(term12320, term12320.getClass(), "username", "KCXlVnMQNa");
        setField(term12320, term12320.getClass(), "base64Face", "itHxInHLQD");
        setField(term12320, term12320.getClass(), "oldpassword", "YKcZHffhWM");
        setField(term12320, term12320.getClass(), "newpassword", "FVvtvTPEiD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOldpassword", argTypes, term12320, args);
    }

};


