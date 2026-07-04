package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Menu_getName_1140442492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44456;

    public Menu_getName_1140442492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44457 = new Integer(-1904196296);
        Integer term44483 = new Integer(-1857445668);
        Integer term44512 = new Integer(-1481132293);
        Integer term44516 = new Integer(-1458633954);
        ArrayList term44520 = new ArrayList();
        ((ArrayList) term44520).add((Object)null);
        ((ArrayList) term44520).add((Object)null);
        ((ArrayList) term44520).add((Object)null);
        Object term44511 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44523 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44511, term44511.getClass(), "id", term44512);
        setField(term44511, term44511.getClass(), "name", "");
        setField(term44511, term44511.getClass(), "path", "");
        setField(term44511, term44511.getClass(), "parentId", term44516);
        setField(term44511, term44511.getClass(), "icon", "");
        setField(term44511, term44511.getClass(), "introduce", "");
        setField(term44511, term44511.getClass(), "children", term44520);
        setField(term44523, term44523.getClass(), "title", null);
        setField(term44523, term44523.getClass(), "icon", null);
        setField(term44511, term44511.getClass(), "meta", term44523);
        ArrayList term44509 = new ArrayList();
        ((ArrayList) term44509).add(term44511);
        term44456 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44526 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44456, term44456.getClass(), "id", term44457);
        setField(term44456, term44456.getClass(), "name", "CwRPXztOjP");
        setField(term44456, term44456.getClass(), "path", "QgzTGvUEih");
        setField(term44456, term44456.getClass(), "parentId", term44483);
        setField(term44456, term44456.getClass(), "icon", "zrNjaPflQE");
        setField(term44456, term44456.getClass(), "introduce", "GOiokVGJWe");
        setField(term44456, term44456.getClass(), "children", term44509);
        setField(term44526, term44526.getClass(), "title", "PKZWDyuIDG");
        setField(term44526, term44526.getClass(), "icon", "XPgkQgDDZM");
        setField(term44456, term44456.getClass(), "meta", term44526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term44456, args);
    }

};


