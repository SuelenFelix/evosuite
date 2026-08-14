package com.leosam.tvbox.mv.data;

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
import static com.leosam.tvbox.mv.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class MvResult_getList_8451047865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3119;

    public MvResult_getList_8451047865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3135 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term3135, term3135.getClass(), "name", "");
        setField(term3135, term3135.getClass(), "songName", "");
        setField(term3135, term3135.getClass(), "songUser", "");
        setField(term3135, term3135.getClass(), "url", "");
        setFloatField(term3135, term3135.getClass(), "score", 0.20144695F);
        ArrayList term3133 = new ArrayList();
        ((ArrayList) term3133).add(term3135);
        term3119 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvResult"));
        setField(term3119, term3119.getClass(), "query", "kGMQdqJYyB");
        setLongField(term3119, term3119.getClass(), "totalHits", 7411271909051562686L);
        setField(term3119, term3119.getClass(), "list", term3133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getList", argTypes, term3119, args);
    }

};


