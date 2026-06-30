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

public class BookRequestDto_canEqual_3778707418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1112;
     Object term1149;

    public BookRequestDto_canEqual_3778707418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1127 = new Long(7994303628307559416L);
        Long term1129 = new Long(2443640364875054177L);
        Long term1131 = new Long(-1610676979013636850L);
        Long term1133 = new Long(2062173786000223358L);
        Long term1135 = new Long(-8658027316505137504L);
        Long term1137 = new Long(414749984815662075L);
        Long term1139 = new Long(463622836963501975L);
        Long term1141 = new Long(305759998609888272L);
        Long term1143 = new Long(-8654565919063661957L);
        ArrayList term1125 = new ArrayList();
        ((ArrayList) term1125).add(term1127);
        ((ArrayList) term1125).add(term1129);
        ((ArrayList) term1125).add(term1131);
        ((ArrayList) term1125).add(term1133);
        ((ArrayList) term1125).add(term1135);
        ((ArrayList) term1125).add(term1137);
        ((ArrayList) term1125).add(term1139);
        ((ArrayList) term1125).add(term1141);
        ((ArrayList) term1125).add(term1143);
        Long term1147 = new Long(-5248475803419977214L);
        term1112 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term1112, term1112.getClass(), "name", "wSQxaModmm");
        setField(term1112, term1112.getClass(), "authorIds", term1125);
        setField(term1112, term1112.getClass(), "categoryId", term1147);
        term1149 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1149;
        callMethod(klass, "canEqual", argTypes, term1112, args);
    }

};


