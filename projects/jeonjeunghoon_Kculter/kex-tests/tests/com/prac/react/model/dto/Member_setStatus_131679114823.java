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
import java.lang.Integer;

public class Member_setStatus_131679114823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13288;
     Object term13377;

    public Member_setStatus_131679114823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13288 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term13288, term13288.getClass(), "memberNum", 628918458);
        setField(term13288, term13288.getClass(), "memberNumHash", "PGfCDJTBek");
        setField(term13288, term13288.getClass(), "email", "ZwjARhAtHC");
        setField(term13288, term13288.getClass(), "pwd", "XXvscsYBWv");
        setField(term13288, term13288.getClass(), "nickName", "uePedtiAfL");
        setField(term13288, term13288.getClass(), "countryCode", "AdSHvysxQB");
        setIntField(term13288, term13288.getClass(), "age", -1274456137);
        setField(term13288, term13288.getClass(), "gender", "jlraKkBWFA");
        setField(term13288, term13288.getClass(), "pfUrl", "mRBtFTxVdE");
        setIntField(term13288, term13288.getClass(), "mg", 1041916673);
        setIntField(term13288, term13288.getClass(), "status", -601863069);
        term13377 = new Integer(663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13377;
        callMethod(klass, "setStatus", argTypes, term13288, args);
    }

};


