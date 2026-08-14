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

public class Meeting1DTO_getMeetingname_564533824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3682;

    public Meeting1DTO_getMeetingname_564533824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3683 = new Integer(1009915858);
        term3682 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term3682, term3682.getClass(), "userid", term3683);
        setField(term3682, term3682.getClass(), "host", "VhpcclRPZX");
        setField(term3682, term3682.getClass(), "meetingname", "jecnsmPrVs");
        setField(term3682, term3682.getClass(), "meetingroom", "QkdgrEdqYo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeetingname", argTypes, term3682, args);
    }

};


