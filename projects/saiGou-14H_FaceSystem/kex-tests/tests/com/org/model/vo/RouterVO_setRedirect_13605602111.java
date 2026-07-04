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

public class RouterVO_setRedirect_13605602111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1799;

    public RouterVO_setRedirect_13605602111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1824 = new Boolean(true);
        Boolean term1880 = new Boolean(true);
        ArrayList term1885 = new ArrayList();
        ((ArrayList) term1885).add((Object)null);
        Object term1877 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1884 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1877, term1877.getClass(), "name", "");
        setField(term1877, term1877.getClass(), "path", "");
        setField(term1877, term1877.getClass(), "hidden", term1880);
        setField(term1877, term1877.getClass(), "redirect", "");
        setField(term1877, term1877.getClass(), "component", "");
        setField(term1884, term1884.getClass(), "title", null);
        setField(term1884, term1884.getClass(), "icon", null);
        setField(term1877, term1877.getClass(), "meta", term1884);
        setField(term1877, term1877.getClass(), "children", term1885);
        Boolean term1891 = new Boolean(true);
        ArrayList term1896 = new ArrayList();
        ((ArrayList) term1896).add((Object)null);
        ((ArrayList) term1896).add((Object)null);
        ((ArrayList) term1896).add((Object)null);
        ((ArrayList) term1896).add((Object)null);
        ((ArrayList) term1896).add((Object)null);
        ((ArrayList) term1896).add((Object)null);
        ((ArrayList) term1896).add((Object)null);
        ((ArrayList) term1896).add((Object)null);
        ((ArrayList) term1896).add((Object)null);
        Object term1888 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1895 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1888, term1888.getClass(), "name", "");
        setField(term1888, term1888.getClass(), "path", "");
        setField(term1888, term1888.getClass(), "hidden", term1891);
        setField(term1888, term1888.getClass(), "redirect", "");
        setField(term1888, term1888.getClass(), "component", "");
        setField(term1895, term1895.getClass(), "title", null);
        setField(term1895, term1895.getClass(), "icon", null);
        setField(term1888, term1888.getClass(), "meta", term1895);
        setField(term1888, term1888.getClass(), "children", term1896);
        ArrayList term1875 = new ArrayList();
        ((ArrayList) term1875).add(term1877);
        ((ArrayList) term1875).add(term1888);
        term1799 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1850 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1799, term1799.getClass(), "name", "TcuXODkzBV");
        setField(term1799, term1799.getClass(), "path", "coJPjrBZNe");
        setField(term1799, term1799.getClass(), "hidden", term1824);
        setField(term1799, term1799.getClass(), "redirect", "vMsWjuPTnO");
        setField(term1799, term1799.getClass(), "component", "zHvfKaOstO");
        setField(term1850, term1850.getClass(), "title", "tOszriqETr");
        setField(term1850, term1850.getClass(), "icon", "ncSPTkhKjO");
        setField(term1799, term1799.getClass(), "meta", term1850);
        setField(term1799, term1799.getClass(), "children", term1875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ndAITnOsny";
        callMethod(klass, "setRedirect", argTypes, term1799, args);
    }

};


