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

public class VodResult_getList_205876816612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4142;

    public VodResult_getList_205876816612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4150 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4150, term4150.getClass(), "vodId", "");
        setField(term4150, term4150.getClass(), "vodName", "");
        setField(term4150, term4150.getClass(), "vodActor", "");
        setField(term4150, term4150.getClass(), "vodPlayFrom", "");
        setField(term4150, term4150.getClass(), "vodPic", "");
        setField(term4150, term4150.getClass(), "vodPlayUrl", "");
        Object term4157 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4157, term4157.getClass(), "vodId", "");
        setField(term4157, term4157.getClass(), "vodName", "");
        setField(term4157, term4157.getClass(), "vodActor", "");
        setField(term4157, term4157.getClass(), "vodPlayFrom", "");
        setField(term4157, term4157.getClass(), "vodPic", "");
        setField(term4157, term4157.getClass(), "vodPlayUrl", "");
        Object term4164 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4164, term4164.getClass(), "vodId", "");
        setField(term4164, term4164.getClass(), "vodName", "");
        setField(term4164, term4164.getClass(), "vodActor", "");
        setField(term4164, term4164.getClass(), "vodPlayFrom", "");
        setField(term4164, term4164.getClass(), "vodPic", "");
        setField(term4164, term4164.getClass(), "vodPlayUrl", "");
        Object term4171 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4171, term4171.getClass(), "vodId", "");
        setField(term4171, term4171.getClass(), "vodName", "");
        setField(term4171, term4171.getClass(), "vodActor", "");
        setField(term4171, term4171.getClass(), "vodPlayFrom", "");
        setField(term4171, term4171.getClass(), "vodPic", "");
        setField(term4171, term4171.getClass(), "vodPlayUrl", "");
        Object term4178 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4178, term4178.getClass(), "vodId", "");
        setField(term4178, term4178.getClass(), "vodName", "");
        setField(term4178, term4178.getClass(), "vodActor", "");
        setField(term4178, term4178.getClass(), "vodPlayFrom", "");
        setField(term4178, term4178.getClass(), "vodPic", "");
        setField(term4178, term4178.getClass(), "vodPlayUrl", "");
        Object term4185 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4185, term4185.getClass(), "vodId", "");
        setField(term4185, term4185.getClass(), "vodName", "");
        setField(term4185, term4185.getClass(), "vodActor", "");
        setField(term4185, term4185.getClass(), "vodPlayFrom", "");
        setField(term4185, term4185.getClass(), "vodPic", "");
        setField(term4185, term4185.getClass(), "vodPlayUrl", "");
        Object term4192 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4192, term4192.getClass(), "vodId", "");
        setField(term4192, term4192.getClass(), "vodName", "");
        setField(term4192, term4192.getClass(), "vodActor", "");
        setField(term4192, term4192.getClass(), "vodPlayFrom", "");
        setField(term4192, term4192.getClass(), "vodPic", "");
        setField(term4192, term4192.getClass(), "vodPlayUrl", "");
        Object term4199 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4199, term4199.getClass(), "vodId", "");
        setField(term4199, term4199.getClass(), "vodName", "");
        setField(term4199, term4199.getClass(), "vodActor", "");
        setField(term4199, term4199.getClass(), "vodPlayFrom", "");
        setField(term4199, term4199.getClass(), "vodPic", "");
        setField(term4199, term4199.getClass(), "vodPlayUrl", "");
        Object term4206 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4206, term4206.getClass(), "vodId", "");
        setField(term4206, term4206.getClass(), "vodName", "");
        setField(term4206, term4206.getClass(), "vodActor", "");
        setField(term4206, term4206.getClass(), "vodPlayFrom", "");
        setField(term4206, term4206.getClass(), "vodPic", "");
        setField(term4206, term4206.getClass(), "vodPlayUrl", "");
        ArrayList term4148 = new ArrayList();
        ((ArrayList) term4148).add(term4150);
        ((ArrayList) term4148).add(term4157);
        ((ArrayList) term4148).add(term4164);
        ((ArrayList) term4148).add(term4171);
        ((ArrayList) term4148).add(term4178);
        ((ArrayList) term4148).add(term4185);
        ((ArrayList) term4148).add(term4192);
        ((ArrayList) term4148).add(term4199);
        ((ArrayList) term4148).add(term4206);
        Object term4217 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4217, term4217.getClass(), "typeId", "");
        setField(term4217, term4217.getClass(), "typeName", "");
        Object term4220 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4220, term4220.getClass(), "typeId", "");
        setField(term4220, term4220.getClass(), "typeName", "");
        Object term4223 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4223, term4223.getClass(), "typeId", "");
        setField(term4223, term4223.getClass(), "typeName", "");
        Object term4226 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4226, term4226.getClass(), "typeId", "");
        setField(term4226, term4226.getClass(), "typeName", "");
        ArrayList term4215 = new ArrayList();
        ((ArrayList) term4215).add(term4217);
        ((ArrayList) term4215).add(term4220);
        ((ArrayList) term4215).add(term4223);
        ((ArrayList) term4215).add(term4226);
        term4142 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term4142, term4142.getClass(), "code", 1596070772);
        setIntField(term4142, term4142.getClass(), "page", 97029295);
        setIntField(term4142, term4142.getClass(), "pagecount", -1371869594);
        setIntField(term4142, term4142.getClass(), "limit", -2095575670);
        setIntField(term4142, term4142.getClass(), "total", 1225272962);
        setField(term4142, term4142.getClass(), "list", term4148);
        setField(term4142, term4142.getClass(), "vodClassList", term4215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getList", argTypes, term4142, args);
    }

};


