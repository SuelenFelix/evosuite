package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Member_setMemberNumHash_13704525655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10268;

    public Member_setMemberNumHash_13704525655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10268 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term10268, term10268.getClass(), "memberNum", -1034506028);
        setField(term10268, term10268.getClass(), "memberNumHash", "ubodzJoMGW");
        setField(term10268, term10268.getClass(), "email", "weddIktxOA");
        setField(term10268, term10268.getClass(), "pwd", "uSlMeISsDD");
        setField(term10268, term10268.getClass(), "nickName", "WdCiTDUKqn");
        setField(term10268, term10268.getClass(), "countryCode", "PSizQDoxxe");
        setIntField(term10268, term10268.getClass(), "age", -1263114719);
        setField(term10268, term10268.getClass(), "gender", "mKaHyMybrK");
        setField(term10268, term10268.getClass(), "pfUrl", "AyrEXuGrEj");
        setIntField(term10268, term10268.getClass(), "mg", -894662986);
        setIntField(term10268, term10268.getClass(), "status", 304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yevIIoVYHq";
        callMethod(klass, "setMemberNumHash", argTypes, term10268, args);
    }

};


