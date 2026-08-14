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
import java.util.LinkedList;

public class VodResult_setVodClassList_213850475215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4587;
     Object term4651;

    public VodResult_setVodClassList_213850475215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4595 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4595, term4595.getClass(), "vodId", "");
        setField(term4595, term4595.getClass(), "vodName", "");
        setField(term4595, term4595.getClass(), "vodActor", "");
        setField(term4595, term4595.getClass(), "vodPlayFrom", "");
        setField(term4595, term4595.getClass(), "vodPic", "");
        setField(term4595, term4595.getClass(), "vodPlayUrl", "");
        Object term4602 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4602, term4602.getClass(), "vodId", "");
        setField(term4602, term4602.getClass(), "vodName", "");
        setField(term4602, term4602.getClass(), "vodActor", "");
        setField(term4602, term4602.getClass(), "vodPlayFrom", "");
        setField(term4602, term4602.getClass(), "vodPic", "");
        setField(term4602, term4602.getClass(), "vodPlayUrl", "");
        Object term4609 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4609, term4609.getClass(), "vodId", "");
        setField(term4609, term4609.getClass(), "vodName", "");
        setField(term4609, term4609.getClass(), "vodActor", "");
        setField(term4609, term4609.getClass(), "vodPlayFrom", "");
        setField(term4609, term4609.getClass(), "vodPic", "");
        setField(term4609, term4609.getClass(), "vodPlayUrl", "");
        Object term4616 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4616, term4616.getClass(), "vodId", "");
        setField(term4616, term4616.getClass(), "vodName", "");
        setField(term4616, term4616.getClass(), "vodActor", "");
        setField(term4616, term4616.getClass(), "vodPlayFrom", "");
        setField(term4616, term4616.getClass(), "vodPic", "");
        setField(term4616, term4616.getClass(), "vodPlayUrl", "");
        Object term4623 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term4623, term4623.getClass(), "vodId", "");
        setField(term4623, term4623.getClass(), "vodName", "");
        setField(term4623, term4623.getClass(), "vodActor", "");
        setField(term4623, term4623.getClass(), "vodPlayFrom", "");
        setField(term4623, term4623.getClass(), "vodPic", "");
        setField(term4623, term4623.getClass(), "vodPlayUrl", "");
        ArrayList term4593 = new ArrayList();
        ((ArrayList) term4593).add(term4595);
        ((ArrayList) term4593).add(term4602);
        ((ArrayList) term4593).add(term4609);
        ((ArrayList) term4593).add(term4616);
        ((ArrayList) term4593).add(term4623);
        Object term4634 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4634, term4634.getClass(), "typeId", "");
        setField(term4634, term4634.getClass(), "typeName", "");
        Object term4637 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4637, term4637.getClass(), "typeId", "");
        setField(term4637, term4637.getClass(), "typeName", "");
        Object term4640 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4640, term4640.getClass(), "typeId", "");
        setField(term4640, term4640.getClass(), "typeName", "");
        Object term4643 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4643, term4643.getClass(), "typeId", "");
        setField(term4643, term4643.getClass(), "typeName", "");
        Object term4646 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4646, term4646.getClass(), "typeId", "");
        setField(term4646, term4646.getClass(), "typeName", "");
        ArrayList term4632 = new ArrayList();
        ((ArrayList) term4632).add(term4634);
        ((ArrayList) term4632).add(term4637);
        ((ArrayList) term4632).add(term4640);
        ((ArrayList) term4632).add(term4643);
        ((ArrayList) term4632).add(term4646);
        term4587 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term4587, term4587.getClass(), "code", 1551099402);
        setIntField(term4587, term4587.getClass(), "page", -2027534003);
        setIntField(term4587, term4587.getClass(), "pagecount", 1063420942);
        setIntField(term4587, term4587.getClass(), "limit", 1375330971);
        setIntField(term4587, term4587.getClass(), "total", -478195677);
        setField(term4587, term4587.getClass(), "list", term4593);
        setField(term4587, term4587.getClass(), "vodClassList", term4632);
        Object term4654 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4654, term4654.getClass(), "typeId", "XCZmhkblRc");
        setField(term4654, term4654.getClass(), "typeName", "gFUWMydGCU");
        Object term4680 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4680, term4680.getClass(), "typeId", "");
        setField(term4680, term4680.getClass(), "typeName", "");
        Object term4684 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term4684, term4684.getClass(), "typeId", null);
        setField(term4684, term4684.getClass(), "typeName", null);
        term4651 = new LinkedList();
        ((LinkedList) term4651).add(term4654);
        ((LinkedList) term4651).add(term4680);
        ((LinkedList) term4651).add(term4684);
        ((LinkedList) term4651).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4651;
        callMethod(klass, "setVodClassList", argTypes, term4587, args);
    }

};


