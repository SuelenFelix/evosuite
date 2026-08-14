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

public class Meeting1DTO_toString_63706223013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4373;

    public Meeting1DTO_toString_63706223013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4374 = new Integer(1844345719);
        term4373 = newInstance(Class.forName("com.org.model.dto.Meeting1DTO"));
        setField(term4373, term4373.getClass(), "userid", term4374);
        setField(term4373, term4373.getClass(), "host", "qTRnuuLERk");
        setField(term4373, term4373.getClass(), "meetingname", "ieCQQDUgWu");
        setField(term4373, term4373.getClass(), "meetingroom", "tIHHXpuCOh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.Meeting1DTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4373, args);
    }

};


