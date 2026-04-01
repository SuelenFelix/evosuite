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

public class Member_getMemberNum_12667251602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9789;

    public Member_getMemberNum_12667251602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9789 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term9789, term9789.getClass(), "memberNum", 1240914516);
        setField(term9789, term9789.getClass(), "memberNumHash", "MnovcqFhCl");
        setField(term9789, term9789.getClass(), "email", "qYtAeLzOhW");
        setField(term9789, term9789.getClass(), "pwd", "tJzmOfcUnY");
        setField(term9789, term9789.getClass(), "nickName", "TKlccZUpjz");
        setField(term9789, term9789.getClass(), "countryCode", "GGzwMoHZXC");
        setIntField(term9789, term9789.getClass(), "age", -1465035361);
        setField(term9789, term9789.getClass(), "gender", "IpmgwHTgnG");
        setField(term9789, term9789.getClass(), "pfUrl", "tIpkeYIezR");
        setIntField(term9789, term9789.getClass(), "mg", 1090617576);
        setIntField(term9789, term9789.getClass(), "status", -1547384488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberNum", argTypes, term9789, args);
    }

};


