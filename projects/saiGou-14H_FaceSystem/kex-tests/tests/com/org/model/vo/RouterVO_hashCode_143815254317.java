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

public class RouterVO_hashCode_143815254317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3206;

    public RouterVO_hashCode_143815254317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3231 = new Boolean(true);
        Boolean term3287 = new Boolean(true);
        ArrayList term3292 = new ArrayList();
        ((ArrayList) term3292).add((Object)null);
        ((ArrayList) term3292).add((Object)null);
        ((ArrayList) term3292).add((Object)null);
        ((ArrayList) term3292).add((Object)null);
        ((ArrayList) term3292).add((Object)null);
        ((ArrayList) term3292).add((Object)null);
        Object term3284 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term3291 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term3284, term3284.getClass(), "name", "");
        setField(term3284, term3284.getClass(), "path", "");
        setField(term3284, term3284.getClass(), "hidden", term3287);
        setField(term3284, term3284.getClass(), "redirect", "");
        setField(term3284, term3284.getClass(), "component", "");
        setField(term3291, term3291.getClass(), "title", null);
        setField(term3291, term3291.getClass(), "icon", null);
        setField(term3284, term3284.getClass(), "meta", term3291);
        setField(term3284, term3284.getClass(), "children", term3292);
        ArrayList term3282 = new ArrayList();
        ((ArrayList) term3282).add(term3284);
        term3206 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term3257 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term3206, term3206.getClass(), "name", "qBcAJgrABE");
        setField(term3206, term3206.getClass(), "path", "JKdZuLFRwC");
        setField(term3206, term3206.getClass(), "hidden", term3231);
        setField(term3206, term3206.getClass(), "redirect", "hfhLLoWnRU");
        setField(term3206, term3206.getClass(), "component", "RpofnOPYha");
        setField(term3257, term3257.getClass(), "title", "CQYmAsjvPU");
        setField(term3257, term3257.getClass(), "icon", "NNkIIFpxiB");
        setField(term3206, term3206.getClass(), "meta", term3257);
        setField(term3206, term3206.getClass(), "children", term3282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3206, args);
    }

};


