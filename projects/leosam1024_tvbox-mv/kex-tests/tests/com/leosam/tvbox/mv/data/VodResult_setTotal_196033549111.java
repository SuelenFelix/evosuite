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
import java.lang.Integer;

public class VodResult_setTotal_196033549111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4093;
     Object term4140;

    public VodResult_setTotal_196033549111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4101 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4101, term4101.getClass(), "vodId", "");
        setField(term4101, term4101.getClass(), "vodName", "");
        setField(term4101, term4101.getClass(), "vodActor", "");
        setField(term4101, term4101.getClass(), "vodPlayFrom", "");
        setField(term4101, term4101.getClass(), "vodPic", "");
        setField(term4101, term4101.getClass(), "vodPlayUrl", "");
        Object term4108 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4108, term4108.getClass(), "vodId", "");
        setField(term4108, term4108.getClass(), "vodName", "");
        setField(term4108, term4108.getClass(), "vodActor", "");
        setField(term4108, term4108.getClass(), "vodPlayFrom", "");
        setField(term4108, term4108.getClass(), "vodPic", "");
        setField(term4108, term4108.getClass(), "vodPlayUrl", "");
        Object term4115 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4115, term4115.getClass(), "vodId", "");
        setField(term4115, term4115.getClass(), "vodName", "");
        setField(term4115, term4115.getClass(), "vodActor", "");
        setField(term4115, term4115.getClass(), "vodPlayFrom", "");
        setField(term4115, term4115.getClass(), "vodPic", "");
        setField(term4115, term4115.getClass(), "vodPlayUrl", "");
        ArrayList term4099 = new ArrayList();
        ((ArrayList) term4099).add(term4101);
        ((ArrayList) term4099).add(term4108);
        ((ArrayList) term4099).add(term4115);
        Object term4126 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4126, term4126.getClass(), "typeId", "");
        setField(term4126, term4126.getClass(), "typeName", "");
        Object term4129 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4129, term4129.getClass(), "typeId", "");
        setField(term4129, term4129.getClass(), "typeName", "");
        Object term4132 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4132, term4132.getClass(), "typeId", "");
        setField(term4132, term4132.getClass(), "typeName", "");
        Object term4135 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4135, term4135.getClass(), "typeId", "");
        setField(term4135, term4135.getClass(), "typeName", "");
        ArrayList term4124 = new ArrayList();
        ((ArrayList) term4124).add(term4126);
        ((ArrayList) term4124).add(term4129);
        ((ArrayList) term4124).add(term4132);
        ((ArrayList) term4124).add(term4135);
        term4093 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term4093, term4093.getClass(), "code", -1048298087);
        setIntField(term4093, term4093.getClass(), "page", 292681826);
        setIntField(term4093, term4093.getClass(), "pagecount", 458147407);
        setIntField(term4093, term4093.getClass(), "limit", -184153539);
        setIntField(term4093, term4093.getClass(), "total", 493620644);
        setField(term4093, term4093.getClass(), "list", term4099);
        setField(term4093, term4093.getClass(), "vodClassList", term4124);
        term4140 = new Integer(1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4140;
        callMethod(klass, "setTotal", argTypes, term4093, args);
    }

};


