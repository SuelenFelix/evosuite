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

public class VodResult_setPage_6081102905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3828;
     Object term3877;

    public VodResult_setPage_6081102905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3836 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3836, term3836.getClass(), "vodId", "");
        setField(term3836, term3836.getClass(), "vodName", "");
        setField(term3836, term3836.getClass(), "vodActor", "");
        setField(term3836, term3836.getClass(), "vodPlayFrom", "");
        setField(term3836, term3836.getClass(), "vodPic", "");
        setField(term3836, term3836.getClass(), "vodPlayUrl", "");
        Object term3843 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3843, term3843.getClass(), "vodId", "");
        setField(term3843, term3843.getClass(), "vodName", "");
        setField(term3843, term3843.getClass(), "vodActor", "");
        setField(term3843, term3843.getClass(), "vodPlayFrom", "");
        setField(term3843, term3843.getClass(), "vodPic", "");
        setField(term3843, term3843.getClass(), "vodPlayUrl", "");
        ArrayList term3834 = new ArrayList();
        ((ArrayList) term3834).add(term3836);
        ((ArrayList) term3834).add(term3843);
        Object term3854 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3854, term3854.getClass(), "typeId", "");
        setField(term3854, term3854.getClass(), "typeName", "");
        Object term3857 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3857, term3857.getClass(), "typeId", "");
        setField(term3857, term3857.getClass(), "typeName", "");
        Object term3860 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3860, term3860.getClass(), "typeId", "");
        setField(term3860, term3860.getClass(), "typeName", "");
        Object term3863 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3863, term3863.getClass(), "typeId", "");
        setField(term3863, term3863.getClass(), "typeName", "");
        Object term3866 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3866, term3866.getClass(), "typeId", "");
        setField(term3866, term3866.getClass(), "typeName", "");
        Object term3869 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3869, term3869.getClass(), "typeId", "");
        setField(term3869, term3869.getClass(), "typeName", "");
        Object term3872 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3872, term3872.getClass(), "typeId", "");
        setField(term3872, term3872.getClass(), "typeName", "");
        ArrayList term3852 = new ArrayList();
        ((ArrayList) term3852).add(term3854);
        ((ArrayList) term3852).add(term3857);
        ((ArrayList) term3852).add(term3860);
        ((ArrayList) term3852).add(term3863);
        ((ArrayList) term3852).add(term3866);
        ((ArrayList) term3852).add(term3869);
        ((ArrayList) term3852).add(term3872);
        term3828 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term3828, term3828.getClass(), "code", -6029667);
        setIntField(term3828, term3828.getClass(), "page", -2068769794);
        setIntField(term3828, term3828.getClass(), "pagecount", -117576464);
        setIntField(term3828, term3828.getClass(), "limit", -1007160944);
        setIntField(term3828, term3828.getClass(), "total", 1135664017);
        setField(term3828, term3828.getClass(), "list", term3834);
        setField(term3828, term3828.getClass(), "vodClassList", term3852);
        term3877 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3877;
        callMethod(klass, "setPage", argTypes, term3828, args);
    }

};


