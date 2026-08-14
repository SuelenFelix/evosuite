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

public class VodResult_setPagecount_1321961277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3915;
     Object term3976;

    public VodResult_setPagecount_1321961277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3923 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3923, term3923.getClass(), "vodId", "");
        setField(term3923, term3923.getClass(), "vodName", "");
        setField(term3923, term3923.getClass(), "vodActor", "");
        setField(term3923, term3923.getClass(), "vodPlayFrom", "");
        setField(term3923, term3923.getClass(), "vodPic", "");
        setField(term3923, term3923.getClass(), "vodPlayUrl", "");
        Object term3930 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3930, term3930.getClass(), "vodId", "");
        setField(term3930, term3930.getClass(), "vodName", "");
        setField(term3930, term3930.getClass(), "vodActor", "");
        setField(term3930, term3930.getClass(), "vodPlayFrom", "");
        setField(term3930, term3930.getClass(), "vodPic", "");
        setField(term3930, term3930.getClass(), "vodPlayUrl", "");
        Object term3937 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3937, term3937.getClass(), "vodId", "");
        setField(term3937, term3937.getClass(), "vodName", "");
        setField(term3937, term3937.getClass(), "vodActor", "");
        setField(term3937, term3937.getClass(), "vodPlayFrom", "");
        setField(term3937, term3937.getClass(), "vodPic", "");
        setField(term3937, term3937.getClass(), "vodPlayUrl", "");
        Object term3944 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3944, term3944.getClass(), "vodId", "");
        setField(term3944, term3944.getClass(), "vodName", "");
        setField(term3944, term3944.getClass(), "vodActor", "");
        setField(term3944, term3944.getClass(), "vodPlayFrom", "");
        setField(term3944, term3944.getClass(), "vodPic", "");
        setField(term3944, term3944.getClass(), "vodPlayUrl", "");
        Object term3951 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3951, term3951.getClass(), "vodId", "");
        setField(term3951, term3951.getClass(), "vodName", "");
        setField(term3951, term3951.getClass(), "vodActor", "");
        setField(term3951, term3951.getClass(), "vodPlayFrom", "");
        setField(term3951, term3951.getClass(), "vodPic", "");
        setField(term3951, term3951.getClass(), "vodPlayUrl", "");
        ArrayList term3921 = new ArrayList();
        ((ArrayList) term3921).add(term3923);
        ((ArrayList) term3921).add(term3930);
        ((ArrayList) term3921).add(term3937);
        ((ArrayList) term3921).add(term3944);
        ((ArrayList) term3921).add(term3951);
        Object term3962 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3962, term3962.getClass(), "typeId", "");
        setField(term3962, term3962.getClass(), "typeName", "");
        Object term3965 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3965, term3965.getClass(), "typeId", "");
        setField(term3965, term3965.getClass(), "typeName", "");
        Object term3968 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3968, term3968.getClass(), "typeId", "");
        setField(term3968, term3968.getClass(), "typeName", "");
        Object term3971 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3971, term3971.getClass(), "typeId", "");
        setField(term3971, term3971.getClass(), "typeName", "");
        ArrayList term3960 = new ArrayList();
        ((ArrayList) term3960).add(term3962);
        ((ArrayList) term3960).add(term3965);
        ((ArrayList) term3960).add(term3968);
        ((ArrayList) term3960).add(term3971);
        term3915 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term3915, term3915.getClass(), "code", -73683645);
        setIntField(term3915, term3915.getClass(), "page", -226514366);
        setIntField(term3915, term3915.getClass(), "pagecount", 1193880199);
        setIntField(term3915, term3915.getClass(), "limit", -1087774327);
        setIntField(term3915, term3915.getClass(), "total", -1530420153);
        setField(term3915, term3915.getClass(), "list", term3921);
        setField(term3915, term3915.getClass(), "vodClassList", term3960);
        term3976 = new Integer(-469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3976;
        callMethod(klass, "setPagecount", argTypes, term3915, args);
    }

};


