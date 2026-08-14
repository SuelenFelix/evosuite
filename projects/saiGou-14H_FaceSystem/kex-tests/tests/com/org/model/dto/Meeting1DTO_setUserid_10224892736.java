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
import java.lang.Integer;

public class Meeting1DTO_setUserid_10224892736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3820;
     Object term3859;

    public Meeting1DTO_setUserid_10224892736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3821 = new Integer(-1482530168);
        term3820 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term3820, term3820.getClass(), "userid", term3821);
        setField(term3820, term3820.getClass(), "host", "DeWUQxbivp");
        setField(term3820, term3820.getClass(), "meetingname", "PcRiAbKXvK");
        setField(term3820, term3820.getClass(), "meetingroom", "EhjpwiDlaG");
        term3859 = new Integer(-432987116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3859;
        callMethod(klass, "setUserid", argTypes, term3820, args);
    }

};


