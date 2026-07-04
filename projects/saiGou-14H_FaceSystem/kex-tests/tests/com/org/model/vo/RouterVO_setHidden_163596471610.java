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

public class RouterVO_setHidden_163596471610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1646;
     Object term1737;

    public RouterVO_setHidden_163596471610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1671 = new Boolean(false);
        Boolean term1727 = new Boolean(true);
        ArrayList term1732 = new ArrayList();
        ((ArrayList) term1732).add((Object)null);
        ((ArrayList) term1732).add((Object)null);
        ((ArrayList) term1732).add((Object)null);
        ((ArrayList) term1732).add((Object)null);
        ((ArrayList) term1732).add((Object)null);
        ((ArrayList) term1732).add((Object)null);
        Object term1724 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1731 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1724, term1724.getClass(), "name", "");
        setField(term1724, term1724.getClass(), "path", "");
        setField(term1724, term1724.getClass(), "hidden", term1727);
        setField(term1724, term1724.getClass(), "redirect", "");
        setField(term1724, term1724.getClass(), "component", "");
        setField(term1731, term1731.getClass(), "title", null);
        setField(term1731, term1731.getClass(), "icon", null);
        setField(term1724, term1724.getClass(), "meta", term1731);
        setField(term1724, term1724.getClass(), "children", term1732);
        ArrayList term1722 = new ArrayList();
        ((ArrayList) term1722).add(term1724);
        term1646 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1697 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1646, term1646.getClass(), "name", "JWodNQzjjV");
        setField(term1646, term1646.getClass(), "path", "CAgxWjhxNf");
        setField(term1646, term1646.getClass(), "hidden", term1671);
        setField(term1646, term1646.getClass(), "redirect", "goAoCMhKBu");
        setField(term1646, term1646.getClass(), "component", "BWxJSgKHRT");
        setField(term1697, term1697.getClass(), "title", "AGXoIndFnm");
        setField(term1697, term1697.getClass(), "icon", "mwmFMNEzkK");
        setField(term1646, term1646.getClass(), "meta", term1697);
        setField(term1646, term1646.getClass(), "children", term1722);
        term1737 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term1737;
        callMethod(klass, "setHidden", argTypes, term1646, args);
    }

};


