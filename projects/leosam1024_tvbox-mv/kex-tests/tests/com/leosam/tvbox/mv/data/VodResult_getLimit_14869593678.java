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

public class VodResult_getLimit_14869593678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3978;

    public VodResult_getLimit_14869593678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3986 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3986, term3986.getClass(), "vodId", "");
        setField(term3986, term3986.getClass(), "vodName", "");
        setField(term3986, term3986.getClass(), "vodActor", "");
        setField(term3986, term3986.getClass(), "vodPlayFrom", "");
        setField(term3986, term3986.getClass(), "vodPic", "");
        setField(term3986, term3986.getClass(), "vodPlayUrl", "");
        ArrayList term3984 = new ArrayList();
        ((ArrayList) term3984).add(term3986);
        Object term3997 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3997, term3997.getClass(), "typeId", "");
        setField(term3997, term3997.getClass(), "typeName", "");
        Object term4000 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4000, term4000.getClass(), "typeId", "");
        setField(term4000, term4000.getClass(), "typeName", "");
        ArrayList term3995 = new ArrayList();
        ((ArrayList) term3995).add(term3997);
        ((ArrayList) term3995).add(term4000);
        term3978 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term3978, term3978.getClass(), "code", -1145578966);
        setIntField(term3978, term3978.getClass(), "page", 679763016);
        setIntField(term3978, term3978.getClass(), "pagecount", 1962444399);
        setIntField(term3978, term3978.getClass(), "limit", 767834723);
        setIntField(term3978, term3978.getClass(), "total", -602026508);
        setField(term3978, term3978.getClass(), "list", term3984);
        setField(term3978, term3978.getClass(), "vodClassList", term3995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLimit", argTypes, term3978, args);
    }

};


