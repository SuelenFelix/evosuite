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

public class RouterVO_getMeta_2437139306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910;

    public RouterVO_getMeta_2437139306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term935 = new Boolean(false);
        Boolean term991 = new Boolean(false);
        ArrayList term996 = new ArrayList();
        ((ArrayList) term996).add((Object)null);
        ((ArrayList) term996).add((Object)null);
        ((ArrayList) term996).add((Object)null);
        ((ArrayList) term996).add((Object)null);
        Object term988 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term995 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term988, term988.getClass(), "name", "");
        setField(term988, term988.getClass(), "path", "");
        setField(term988, term988.getClass(), "hidden", term991);
        setField(term988, term988.getClass(), "redirect", "");
        setField(term988, term988.getClass(), "component", "");
        setField(term995, term995.getClass(), "title", null);
        setField(term995, term995.getClass(), "icon", null);
        setField(term988, term988.getClass(), "meta", term995);
        setField(term988, term988.getClass(), "children", term996);
        Boolean term1002 = new Boolean(true);
        ArrayList term1007 = new ArrayList();
        ((ArrayList) term1007).add((Object)null);
        ((ArrayList) term1007).add((Object)null);
        Object term999 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1006 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term999, term999.getClass(), "name", "");
        setField(term999, term999.getClass(), "path", "");
        setField(term999, term999.getClass(), "hidden", term1002);
        setField(term999, term999.getClass(), "redirect", "");
        setField(term999, term999.getClass(), "component", "");
        setField(term1006, term1006.getClass(), "title", null);
        setField(term1006, term1006.getClass(), "icon", null);
        setField(term999, term999.getClass(), "meta", term1006);
        setField(term999, term999.getClass(), "children", term1007);
        ArrayList term986 = new ArrayList();
        ((ArrayList) term986).add(term988);
        ((ArrayList) term986).add(term988);
        ((ArrayList) term986).add(term999);
        term910 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term961 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term910, term910.getClass(), "name", "DIbeDHICho");
        setField(term910, term910.getClass(), "path", "dJGPlmSRnz");
        setField(term910, term910.getClass(), "hidden", term935);
        setField(term910, term910.getClass(), "redirect", "DPskuFUobI");
        setField(term910, term910.getClass(), "component", "wBGfLpNNiZ");
        setField(term961, term961.getClass(), "title", "yUGCjlqgJE");
        setField(term961, term961.getClass(), "icon", "PXdVZyoJyC");
        setField(term910, term910.getClass(), "meta", term961);
        setField(term910, term910.getClass(), "children", term986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeta", argTypes, term910, args);
    }

};


