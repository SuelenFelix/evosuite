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

public class UserDTO_canEqual_27354762918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5592;
     Object term5681;

    public UserDTO_canEqual_27354762918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5607 = new Integer(-2066804303);
        Integer term5609 = new Integer(-1731761810);
        Integer term5611 = new Integer(197109649);
        Integer term5613 = new Integer(-1239406390);
        Integer term5615 = new Integer(1557431527);
        ArrayList term5605 = new ArrayList();
        ((ArrayList) term5605).add(term5607);
        ((ArrayList) term5605).add(term5609);
        ((ArrayList) term5605).add(term5611);
        ((ArrayList) term5605).add(term5613);
        ((ArrayList) term5605).add(term5615);
        Integer term5619 = new Integer(-1504890659);
        term5592 = newInstance(Class.forName("com.org.model.dto.UserDTO"));
        setField(term5592, term5592.getClass(), "Type", "xvkbvaEGYd");
        setField(term5592, term5592.getClass(), "idList", term5605);
        setField(term5592, term5592.getClass(), "meetingid", term5619);
        setField(term5592, term5592.getClass(), "email", "HBGNxdNURv");
        setField(term5592, term5592.getClass(), "username", "mfCpTPPQQm");
        setField(term5592, term5592.getClass(), "base64Face", "OcJCIDNIXA");
        setField(term5592, term5592.getClass(), "oldpassword", "XfRABIFVEp");
        setField(term5592, term5592.getClass(), "newpassword", "MHGKyEnwKc");
        term5681 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5681;
        callMethod(klass, "canEqual", argTypes, term5592, args);
    }

};


