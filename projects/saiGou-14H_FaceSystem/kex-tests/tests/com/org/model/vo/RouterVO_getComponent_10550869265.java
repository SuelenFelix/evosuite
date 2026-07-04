package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class RouterVO_getComponent_10550869265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;

    public RouterVO_getComponent_10550869265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term762 = new Boolean(false);
        Boolean term818 = new Boolean(false);
        ArrayList term823 = new ArrayList();
        ((ArrayList) term823).add((Object)null);
        ((ArrayList) term823).add((Object)null);
        ((ArrayList) term823).add((Object)null);
        ((ArrayList) term823).add((Object)null);
        ((ArrayList) term823).add((Object)null);
        ((ArrayList) term823).add((Object)null);
        ((ArrayList) term823).add((Object)null);
        ((ArrayList) term823).add((Object)null);
        Object term815 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term822 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term815, term815.getClass(), "name", "");
        setField(term815, term815.getClass(), "path", "");
        setField(term815, term815.getClass(), "hidden", term818);
        setField(term815, term815.getClass(), "redirect", "");
        setField(term815, term815.getClass(), "component", "");
        setField(term822, term822.getClass(), "title", null);
        setField(term822, term822.getClass(), "icon", null);
        setField(term815, term815.getClass(), "meta", term822);
        setField(term815, term815.getClass(), "children", term823);
        Boolean term829 = new Boolean(false);
        ArrayList term834 = new ArrayList();
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        ((ArrayList) term834).add((Object)null);
        Object term826 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term833 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term826, term826.getClass(), "name", "");
        setField(term826, term826.getClass(), "path", "");
        setField(term826, term826.getClass(), "hidden", term829);
        setField(term826, term826.getClass(), "redirect", "");
        setField(term826, term826.getClass(), "component", "");
        setField(term833, term833.getClass(), "title", null);
        setField(term833, term833.getClass(), "icon", null);
        setField(term826, term826.getClass(), "meta", term833);
        setField(term826, term826.getClass(), "children", term834);
        Boolean term840 = new Boolean(true);
        ArrayList term845 = new ArrayList();
        ((ArrayList) term845).add((Object)null);
        ((ArrayList) term845).add((Object)null);
        ((ArrayList) term845).add((Object)null);
        ((ArrayList) term845).add((Object)null);
        ((ArrayList) term845).add((Object)null);
        ((ArrayList) term845).add((Object)null);
        Object term837 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term844 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term837, term837.getClass(), "name", "");
        setField(term837, term837.getClass(), "path", "");
        setField(term837, term837.getClass(), "hidden", term840);
        setField(term837, term837.getClass(), "redirect", "");
        setField(term837, term837.getClass(), "component", "");
        setField(term844, term844.getClass(), "title", null);
        setField(term844, term844.getClass(), "icon", null);
        setField(term837, term837.getClass(), "meta", term844);
        setField(term837, term837.getClass(), "children", term845);
        ArrayList term813 = new ArrayList();
        ((ArrayList) term813).add(term815);
        ((ArrayList) term813).add(term826);
        ((ArrayList) term813).add(term837);
        ((ArrayList) term813).add(term737);
        term737 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term788 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term737, term737.getClass(), "name", "MHGKyEnwKc");
        setField(term737, term737.getClass(), "path", "ShIELyuULw");
        setField(term737, term737.getClass(), "hidden", term762);
        setField(term737, term737.getClass(), "redirect", "IpQuOGMgmj");
        setField(term737, term737.getClass(), "component", "pJbnHTYrxn");
        setField(term788, term788.getClass(), "title", "iIRsCSYqXH");
        setField(term788, term788.getClass(), "icon", "nghfqDXyCG");
        setField(term737, term737.getClass(), "meta", term788);
        setField(term737, term737.getClass(), "children", term813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComponent", argTypes, term737, args);
    }

};


