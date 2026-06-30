package com.datajpa.relationship.dto.responseDto;

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
import static com.datajpa.relationship.dto.responseDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class BookResponseDto_setName_6817998926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1837;

    public BookResponseDto_setName_6817998926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1838 = new Long(5127676408959197577L);
        ArrayList term1852 = new ArrayList();
        ((ArrayList) term1852).add("VgZnGoIFwQ");
        ((ArrayList) term1852).add("jUbSRrkrYZ");
        ((ArrayList) term1852).add("bWWfajKbEX");
        ((ArrayList) term1852).add("cAPeiZHKGJ");
        ((ArrayList) term1852).add("LvJFtLBaxj");
        ((ArrayList) term1852).add("PHvxnGHptP");
        ((ArrayList) term1852).add("TimdotUuNC");
        term1837 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto"));
        setField(term1837, term1837.getClass(), "id", term1838);
        setField(term1837, term1837.getClass(), "name", "idgaQsnJpQ");
        setField(term1837, term1837.getClass(), "authorNames", term1852);
        setField(term1837, term1837.getClass(), "categoryName", "PkWMRdJcBb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jSpAteRute";
        callMethod(klass, "setName", argTypes, term1837, args);
    }

};


