package com.datajpa.relationship.dto.requestDto;

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
import static com.datajpa.relationship.dto.requestDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;

public class BookRequestDto_setCategoryId_4013393256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1033;
     Object term1070;

    public BookRequestDto_setCategoryId_4013393256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1048 = new Long(-3842548265506930260L);
        Long term1050 = new Long(-5788180182343976541L);
        Long term1052 = new Long(2936323121573284007L);
        Long term1054 = new Long(-1154553077993834885L);
        Long term1056 = new Long(-2850532706972744550L);
        Long term1058 = new Long(-2644215923136513282L);
        Long term1060 = new Long(-1468719814009985452L);
        Long term1062 = new Long(-7738503207562305297L);
        Long term1064 = new Long(3825396310311739952L);
        ArrayList term1046 = new ArrayList();
        ((ArrayList) term1046).add(term1048);
        ((ArrayList) term1046).add(term1050);
        ((ArrayList) term1046).add(term1052);
        ((ArrayList) term1046).add(term1054);
        ((ArrayList) term1046).add(term1056);
        ((ArrayList) term1046).add(term1058);
        ((ArrayList) term1046).add(term1060);
        ((ArrayList) term1046).add(term1062);
        ((ArrayList) term1046).add(term1064);
        Long term1068 = new Long(-3838084482494604218L);
        term1033 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term1033, term1033.getClass(), "name", "nyiiPDVjAc");
        setField(term1033, term1033.getClass(), "authorIds", term1046);
        setField(term1033, term1033.getClass(), "categoryId", term1068);
        term1070 = new Long(3892018155439224435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1070;
        callMethod(klass, "setCategoryId", argTypes, term1033, args);
    }

};


