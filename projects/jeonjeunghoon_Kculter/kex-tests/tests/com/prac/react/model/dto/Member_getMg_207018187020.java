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

public class Member_getMg_207018187020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12809;

    public Member_getMg_207018187020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12809 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term12809, term12809.getClass(), "memberNum", -227365013);
        setField(term12809, term12809.getClass(), "memberNumHash", "QpYltHAdyY");
        setField(term12809, term12809.getClass(), "email", "lbmSGBwIiV");
        setField(term12809, term12809.getClass(), "pwd", "DAxyHoTLzZ");
        setField(term12809, term12809.getClass(), "nickName", "fhZgTouhCC");
        setField(term12809, term12809.getClass(), "countryCode", "wrikqJwXvL");
        setIntField(term12809, term12809.getClass(), "age", 11724947);
        setField(term12809, term12809.getClass(), "gender", "UiWhvbypdr");
        setField(term12809, term12809.getClass(), "pfUrl", "CgleElJNje");
        setIntField(term12809, term12809.getClass(), "mg", 1953277050);
        setIntField(term12809, term12809.getClass(), "status", 1283079251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMg", argTypes, term12809, args);
    }

};


