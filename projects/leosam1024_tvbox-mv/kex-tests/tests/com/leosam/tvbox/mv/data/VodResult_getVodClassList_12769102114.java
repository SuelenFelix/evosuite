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

public class VodResult_getVodClassList_12769102114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4529;

    public VodResult_getVodClassList_12769102114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4537 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4537, term4537.getClass(), "vodId", "");
        setField(term4537, term4537.getClass(), "vodName", "");
        setField(term4537, term4537.getClass(), "vodActor", "");
        setField(term4537, term4537.getClass(), "vodPlayFrom", "");
        setField(term4537, term4537.getClass(), "vodPic", "");
        setField(term4537, term4537.getClass(), "vodPlayUrl", "");
        Object term4544 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4544, term4544.getClass(), "vodId", "");
        setField(term4544, term4544.getClass(), "vodName", "");
        setField(term4544, term4544.getClass(), "vodActor", "");
        setField(term4544, term4544.getClass(), "vodPlayFrom", "");
        setField(term4544, term4544.getClass(), "vodPic", "");
        setField(term4544, term4544.getClass(), "vodPlayUrl", "");
        Object term4551 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4551, term4551.getClass(), "vodId", "");
        setField(term4551, term4551.getClass(), "vodName", "");
        setField(term4551, term4551.getClass(), "vodActor", "");
        setField(term4551, term4551.getClass(), "vodPlayFrom", "");
        setField(term4551, term4551.getClass(), "vodPic", "");
        setField(term4551, term4551.getClass(), "vodPlayUrl", "");
        Object term4558 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4558, term4558.getClass(), "vodId", "");
        setField(term4558, term4558.getClass(), "vodName", "");
        setField(term4558, term4558.getClass(), "vodActor", "");
        setField(term4558, term4558.getClass(), "vodPlayFrom", "");
        setField(term4558, term4558.getClass(), "vodPic", "");
        setField(term4558, term4558.getClass(), "vodPlayUrl", "");
        Object term4565 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4565, term4565.getClass(), "vodId", "");
        setField(term4565, term4565.getClass(), "vodName", "");
        setField(term4565, term4565.getClass(), "vodActor", "");
        setField(term4565, term4565.getClass(), "vodPlayFrom", "");
        setField(term4565, term4565.getClass(), "vodPic", "");
        setField(term4565, term4565.getClass(), "vodPlayUrl", "");
        ArrayList term4535 = new ArrayList();
        ((ArrayList) term4535).add(term4537);
        ((ArrayList) term4535).add(term4544);
        ((ArrayList) term4535).add(term4551);
        ((ArrayList) term4535).add(term4558);
        ((ArrayList) term4535).add(term4565);
        Object term4576 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4576, term4576.getClass(), "typeId", "");
        setField(term4576, term4576.getClass(), "typeName", "");
        Object term4579 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4579, term4579.getClass(), "typeId", "");
        setField(term4579, term4579.getClass(), "typeName", "");
        Object term4582 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4582, term4582.getClass(), "typeId", "");
        setField(term4582, term4582.getClass(), "typeName", "");
        ArrayList term4574 = new ArrayList();
        ((ArrayList) term4574).add(term4576);
        ((ArrayList) term4574).add(term4579);
        ((ArrayList) term4574).add(term4582);
        term4529 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term4529, term4529.getClass(), "code", 287287233);
        setIntField(term4529, term4529.getClass(), "page", 962840079);
        setIntField(term4529, term4529.getClass(), "pagecount", 1540719661);
        setIntField(term4529, term4529.getClass(), "limit", 1265463001);
        setIntField(term4529, term4529.getClass(), "total", 335112684);
        setField(term4529, term4529.getClass(), "list", term4535);
        setField(term4529, term4529.getClass(), "vodClassList", term4574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVodClassList", argTypes, term4529, args);
    }

};


