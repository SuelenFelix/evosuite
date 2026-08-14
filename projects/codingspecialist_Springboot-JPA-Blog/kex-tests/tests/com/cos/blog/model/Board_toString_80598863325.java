package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Board_toString_80598863325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21152;

    public Board_toString_80598863325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21315 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term21314 = ((Class) term21315).getDeclaredField((String) "ADMIN");
        ((Field) term21314).setAccessible(true);
        Object enum50 = ((Field) term21314).get((Object) null);
        Object term21243 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term21246 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term21249 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term21251 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term21243, term21243.getClass(), "id", 1970654816);
        setField(term21243, term21243.getClass(), "content", "");
        setIntField(term21246, term21246.getClass(), "id", 1354781442);
        setField(term21246, term21246.getClass(), "title", null);
        setField(term21246, term21246.getClass(), "content", null);
        setIntField(term21246, term21246.getClass(), "count", -393590701);
        setField(term21246, term21246.getClass(), "user", null);
        setField(term21246, term21246.getClass(), "replys", null);
        setField(term21246, term21246.getClass(), "createDate", null);
        setField(term21243, term21243.getClass(), "board", term21246);
        setIntField(term21249, term21249.getClass(), "id", -712023865);
        setField(term21249, term21249.getClass(), "username", null);
        setField(term21249, term21249.getClass(), "password", null);
        setField(term21249, term21249.getClass(), "email", null);
        setField(term21249, term21249.getClass(), "role", null);
        setField(term21249, term21249.getClass(), "oauth", null);
        setField(term21249, term21249.getClass(), "createDate", null);
        setField(term21243, term21243.getClass(), "user", term21249);
        setField(term21251, term21251.getClass(), "date", null);
        setField(term21251, term21251.getClass(), "time", null);
        setField(term21243, term21243.getClass(), "createDate", term21251);
        ArrayList term21241 = new ArrayList();
        ((ArrayList) term21241).add(term21243);
        term21152 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term21179 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term21238 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term21254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21259 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term21152, term21152.getClass(), "id", 1985432430);
        setField(term21152, term21152.getClass(), "title", "ZGnUKGTWCn");
        setField(term21152, term21152.getClass(), "content", "cHRLXsgRzr");
        setIntField(term21152, term21152.getClass(), "count", -1769933499);
        setIntField(term21179, term21179.getClass(), "id", -1510932472);
        setField(term21179, term21179.getClass(), "username", "QpqQKmCtoC");
        setField(term21179, term21179.getClass(), "password", "AYRvbRJxWI");
        setField(term21179, term21179.getClass(), "email", "MGNiaVqEDc");
        setField(term21179, term21179.getClass(), "role", enum50);
        setField(term21179, term21179.getClass(), "oauth", "qeVNCFrTbT");
        setIntField(term21238, term21238.getClass(), "nanos", 454000000);
        setLongField(term21238, term21238.getClass(), "fastTime", 1390689541000L);
        setField(term21238, term21238.getClass(), "cdate", null);
        setField(term21179, term21179.getClass(), "createDate", term21238);
        setField(term21152, term21152.getClass(), "user", term21179);
        setField(term21152, term21152.getClass(), "replys", term21241);
        setIntField(term21255, term21255.getClass(), "year", 2012);
        setShortField(term21255, term21255.getClass(), "month", (short) 4);
        setShortField(term21255, term21255.getClass(), "day", (short) 21);
        setField(term21254, term21254.getClass(), "date", term21255);
        setByteField(term21259, term21259.getClass(), "hour", (byte) 8);
        setByteField(term21259, term21259.getClass(), "minute", (byte) 7);
        setByteField(term21259, term21259.getClass(), "second", (byte) 21);
        setIntField(term21259, term21259.getClass(), "nano", 641327534);
        setField(term21254, term21254.getClass(), "time", term21259);
        setField(term21152, term21152.getClass(), "createDate", term21254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term21152, args);
    }

};


