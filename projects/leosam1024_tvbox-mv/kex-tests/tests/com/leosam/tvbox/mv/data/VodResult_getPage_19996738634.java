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

public class VodResult_getPage_19996738634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3807;

    public VodResult_getPage_19996738634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3815 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3815, term3815.getClass(), "vodId", "");
        setField(term3815, term3815.getClass(), "vodName", "");
        setField(term3815, term3815.getClass(), "vodActor", "");
        setField(term3815, term3815.getClass(), "vodPlayFrom", "");
        setField(term3815, term3815.getClass(), "vodPic", "");
        setField(term3815, term3815.getClass(), "vodPlayUrl", "");
        ArrayList term3813 = new ArrayList();
        ((ArrayList) term3813).add(term3815);
        ArrayList term3824 = new ArrayList();
        term3807 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term3807, term3807.getClass(), "code", -1685132342);
        setIntField(term3807, term3807.getClass(), "page", -1456670397);
        setIntField(term3807, term3807.getClass(), "pagecount", 1622346318);
        setIntField(term3807, term3807.getClass(), "limit", 1048535127);
        setIntField(term3807, term3807.getClass(), "total", -655067527);
        setField(term3807, term3807.getClass(), "list", term3813);
        setField(term3807, term3807.getClass(), "vodClassList", term3824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPage", argTypes, term3807, args);
    }

};


