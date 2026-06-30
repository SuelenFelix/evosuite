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

public class BookRequestDto_hashCode_8749785639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1160;

    public BookRequestDto_hashCode_8749785639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1175 = new Long(-6723783499250797216L);
        Long term1177 = new Long(41775768178052008L);
        Long term1179 = new Long(6682528376118987775L);
        Long term1181 = new Long(682356318767179819L);
        Long term1183 = new Long(-7291743527973326814L);
        Long term1185 = new Long(-5963439350418910964L);
        Long term1187 = new Long(9013624480170062917L);
        Long term1189 = new Long(7862575738391801707L);
        Long term1191 = new Long(50358265865610362L);
        ArrayList term1173 = new ArrayList();
        ((ArrayList) term1173).add(term1175);
        ((ArrayList) term1173).add(term1177);
        ((ArrayList) term1173).add(term1179);
        ((ArrayList) term1173).add(term1181);
        ((ArrayList) term1173).add(term1183);
        ((ArrayList) term1173).add(term1185);
        ((ArrayList) term1173).add(term1187);
        ((ArrayList) term1173).add(term1189);
        ((ArrayList) term1173).add(term1191);
        Long term1195 = new Long(5510783420697225605L);
        term1160 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term1160, term1160.getClass(), "name", "UlajhuVLaP");
        setField(term1160, term1160.getClass(), "authorIds", term1173);
        setField(term1160, term1160.getClass(), "categoryId", term1195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1160, args);
    }

};


