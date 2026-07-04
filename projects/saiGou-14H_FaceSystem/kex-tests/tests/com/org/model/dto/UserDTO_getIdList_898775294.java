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

public class UserDTO_getIdList_898775294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3454;

    public UserDTO_getIdList_898775294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3469 = new Integer(-1801760683);
        Integer term3471 = new Integer(1141317871);
        Integer term3473 = new Integer(890669485);
        Integer term3475 = new Integer(691577392);
        ArrayList term3467 = new ArrayList();
        ((ArrayList) term3467).add(term3469);
        ((ArrayList) term3467).add(term3471);
        ((ArrayList) term3467).add(term3473);
        ((ArrayList) term3467).add(term3475);
        Integer term3479 = new Integer(-893623680);
        term3454 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term3454, term3454.getClass(), "Type", "pXOkjyeIRb");
        setField(term3454, term3454.getClass(), "idList", term3467);
        setField(term3454, term3454.getClass(), "meetingid", term3479);
        setField(term3454, term3454.getClass(), "email", "GgZWSjxjyE");
        setField(term3454, term3454.getClass(), "username", "EeBVbzjcCI");
        setField(term3454, term3454.getClass(), "base64Face", "UfQtPRyWRC");
        setField(term3454, term3454.getClass(), "oldpassword", "FPvxVzzSvD");
        setField(term3454, term3454.getClass(), "newpassword", "WHcwFgsGFC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdList", argTypes, term3454, args);
    }

};


