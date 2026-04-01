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

public class Culture_setFileUrl_59010807415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32438;

    public Culture_setFileUrl_59010807415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32438 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32438, term32438.getClass(), "keyNum", -431440129);
        setField(term32438, term32438.getClass(), "keyHash", "TGnzPlGFMb");
        setField(term32438, term32438.getClass(), "name", "yEvLMSpdHy");
        setIntField(term32438, term32438.getClass(), "likeCount", -763576148);
        setIntField(term32438, term32438.getClass(), "status", 1568948514);
        setField(term32438, term32438.getClass(), "explain", "qdErlZeTVv");
        setField(term32438, term32438.getClass(), "fileUrl", "OCCDQbndDE");
        setIntField(term32438, term32438.getClass(), "spot", -1511130237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NMANMKfctU";
        callMethod(klass, "setFileUrl", argTypes, term32438, args);
    }

};


