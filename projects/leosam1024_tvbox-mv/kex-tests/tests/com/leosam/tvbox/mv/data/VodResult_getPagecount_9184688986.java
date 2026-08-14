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

public class VodResult_getPagecount_9184688986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3879;

    public VodResult_getPagecount_9184688986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3887 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3887, term3887.getClass(), "vodId", "");
        setField(term3887, term3887.getClass(), "vodName", "");
        setField(term3887, term3887.getClass(), "vodActor", "");
        setField(term3887, term3887.getClass(), "vodPlayFrom", "");
        setField(term3887, term3887.getClass(), "vodPic", "");
        setField(term3887, term3887.getClass(), "vodPlayUrl", "");
        ArrayList term3885 = new ArrayList();
        ((ArrayList) term3885).add(term3887);
        Object term3898 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3898, term3898.getClass(), "typeId", "");
        setField(term3898, term3898.getClass(), "typeName", "");
        Object term3901 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3901, term3901.getClass(), "typeId", "");
        setField(term3901, term3901.getClass(), "typeName", "");
        Object term3904 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3904, term3904.getClass(), "typeId", "");
        setField(term3904, term3904.getClass(), "typeName", "");
        Object term3907 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3907, term3907.getClass(), "typeId", "");
        setField(term3907, term3907.getClass(), "typeName", "");
        Object term3910 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3910, term3910.getClass(), "typeId", "");
        setField(term3910, term3910.getClass(), "typeName", "");
        ArrayList term3896 = new ArrayList();
        ((ArrayList) term3896).add(term3898);
        ((ArrayList) term3896).add(term3901);
        ((ArrayList) term3896).add(term3904);
        ((ArrayList) term3896).add(term3907);
        ((ArrayList) term3896).add(term3910);
        term3879 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term3879, term3879.getClass(), "code", 865208305);
        setIntField(term3879, term3879.getClass(), "page", -1275173084);
        setIntField(term3879, term3879.getClass(), "pagecount", -244121226);
        setIntField(term3879, term3879.getClass(), "limit", -203030934);
        setIntField(term3879, term3879.getClass(), "total", -1179120542);
        setField(term3879, term3879.getClass(), "list", term3885);
        setField(term3879, term3879.getClass(), "vodClassList", term3896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPagecount", argTypes, term3879, args);
    }

};


