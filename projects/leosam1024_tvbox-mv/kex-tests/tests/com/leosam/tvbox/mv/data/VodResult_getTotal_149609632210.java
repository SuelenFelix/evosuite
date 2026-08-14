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

public class VodResult_getTotal_149609632210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4066;

    public VodResult_getTotal_149609632210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4074 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4074, term4074.getClass(), "vodId", "");
        setField(term4074, term4074.getClass(), "vodName", "");
        setField(term4074, term4074.getClass(), "vodActor", "");
        setField(term4074, term4074.getClass(), "vodPlayFrom", "");
        setField(term4074, term4074.getClass(), "vodPic", "");
        setField(term4074, term4074.getClass(), "vodPlayUrl", "");
        ArrayList term4072 = new ArrayList();
        ((ArrayList) term4072).add(term4074);
        Object term4085 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4085, term4085.getClass(), "typeId", "");
        setField(term4085, term4085.getClass(), "typeName", "");
        Object term4088 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4088, term4088.getClass(), "typeId", "");
        setField(term4088, term4088.getClass(), "typeName", "");
        ArrayList term4083 = new ArrayList();
        ((ArrayList) term4083).add(term4085);
        ((ArrayList) term4083).add(term4088);
        term4066 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term4066, term4066.getClass(), "code", -14890619);
        setIntField(term4066, term4066.getClass(), "page", 1632125673);
        setIntField(term4066, term4066.getClass(), "pagecount", 454281060);
        setIntField(term4066, term4066.getClass(), "limit", -1786399638);
        setIntField(term4066, term4066.getClass(), "total", 2055867847);
        setField(term4066, term4066.getClass(), "list", term4072);
        setField(term4066, term4066.getClass(), "vodClassList", term4083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotal", argTypes, term4066, args);
    }

};


