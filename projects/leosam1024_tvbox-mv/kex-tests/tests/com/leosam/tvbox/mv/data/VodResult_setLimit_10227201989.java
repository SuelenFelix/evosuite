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

public class VodResult_setLimit_10227201989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4005;
     Object term4064;

    public VodResult_setLimit_10227201989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4013 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4013, term4013.getClass(), "vodId", "");
        setField(term4013, term4013.getClass(), "vodName", "");
        setField(term4013, term4013.getClass(), "vodActor", "");
        setField(term4013, term4013.getClass(), "vodPlayFrom", "");
        setField(term4013, term4013.getClass(), "vodPic", "");
        setField(term4013, term4013.getClass(), "vodPlayUrl", "");
        Object term4020 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4020, term4020.getClass(), "vodId", "");
        setField(term4020, term4020.getClass(), "vodName", "");
        setField(term4020, term4020.getClass(), "vodActor", "");
        setField(term4020, term4020.getClass(), "vodPlayFrom", "");
        setField(term4020, term4020.getClass(), "vodPic", "");
        setField(term4020, term4020.getClass(), "vodPlayUrl", "");
        Object term4027 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4027, term4027.getClass(), "vodId", "");
        setField(term4027, term4027.getClass(), "vodName", "");
        setField(term4027, term4027.getClass(), "vodActor", "");
        setField(term4027, term4027.getClass(), "vodPlayFrom", "");
        setField(term4027, term4027.getClass(), "vodPic", "");
        setField(term4027, term4027.getClass(), "vodPlayUrl", "");
        Object term4034 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4034, term4034.getClass(), "vodId", "");
        setField(term4034, term4034.getClass(), "vodName", "");
        setField(term4034, term4034.getClass(), "vodActor", "");
        setField(term4034, term4034.getClass(), "vodPlayFrom", "");
        setField(term4034, term4034.getClass(), "vodPic", "");
        setField(term4034, term4034.getClass(), "vodPlayUrl", "");
        Object term4041 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4041, term4041.getClass(), "vodId", "");
        setField(term4041, term4041.getClass(), "vodName", "");
        setField(term4041, term4041.getClass(), "vodActor", "");
        setField(term4041, term4041.getClass(), "vodPlayFrom", "");
        setField(term4041, term4041.getClass(), "vodPic", "");
        setField(term4041, term4041.getClass(), "vodPlayUrl", "");
        Object term4048 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4048, term4048.getClass(), "vodId", "");
        setField(term4048, term4048.getClass(), "vodName", "");
        setField(term4048, term4048.getClass(), "vodActor", "");
        setField(term4048, term4048.getClass(), "vodPlayFrom", "");
        setField(term4048, term4048.getClass(), "vodPic", "");
        setField(term4048, term4048.getClass(), "vodPlayUrl", "");
        ArrayList term4011 = new ArrayList();
        ((ArrayList) term4011).add(term4013);
        ((ArrayList) term4011).add(term4020);
        ((ArrayList) term4011).add(term4027);
        ((ArrayList) term4011).add(term4034);
        ((ArrayList) term4011).add(term4041);
        ((ArrayList) term4011).add(term4048);
        Object term4059 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4059, term4059.getClass(), "typeId", "");
        setField(term4059, term4059.getClass(), "typeName", "");
        ArrayList term4057 = new ArrayList();
        ((ArrayList) term4057).add(term4059);
        term4005 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term4005, term4005.getClass(), "code", -157887805);
        setIntField(term4005, term4005.getClass(), "page", 1876565163);
        setIntField(term4005, term4005.getClass(), "pagecount", -817164822);
        setIntField(term4005, term4005.getClass(), "limit", -1016503459);
        setIntField(term4005, term4005.getClass(), "total", -1968847291);
        setField(term4005, term4005.getClass(), "list", term4011);
        setField(term4005, term4005.getClass(), "vodClassList", term4057);
        term4064 = new Integer(579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4064;
        callMethod(klass, "setLimit", argTypes, term4005, args);
    }

};


