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

public class Menu_getIcon_2552747315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44908;

    public Menu_getIcon_2552747315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44909 = new Integer(-855464783);
        Integer term44935 = new Integer(1496015170);
        Integer term44964 = new Integer(412507839);
        Integer term44968 = new Integer(-143522206);
        ArrayList term44972 = new ArrayList();
        ((ArrayList) term44972).add((Object)null);
        Object term44963 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44975 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44963, term44963.getClass(), "id", term44964);
        setField(term44963, term44963.getClass(), "name", "");
        setField(term44963, term44963.getClass(), "path", "");
        setField(term44963, term44963.getClass(), "parentId", term44968);
        setField(term44963, term44963.getClass(), "icon", "");
        setField(term44963, term44963.getClass(), "introduce", "");
        setField(term44963, term44963.getClass(), "children", term44972);
        setField(term44975, term44975.getClass(), "title", null);
        setField(term44975, term44975.getClass(), "icon", null);
        setField(term44963, term44963.getClass(), "meta", term44975);
        ArrayList term44961 = new ArrayList();
        ((ArrayList) term44961).add(term44963);
        term44908 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44978 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44908, term44908.getClass(), "id", term44909);
        setField(term44908, term44908.getClass(), "name", "JFrZgnScnM");
        setField(term44908, term44908.getClass(), "path", "JThfvXjdYb");
        setField(term44908, term44908.getClass(), "parentId", term44935);
        setField(term44908, term44908.getClass(), "icon", "ZBXJUQCEuy");
        setField(term44908, term44908.getClass(), "introduce", "TNojhgLvJO");
        setField(term44908, term44908.getClass(), "children", term44961);
        setField(term44978, term44978.getClass(), "title", "KrPrUSgnHn");
        setField(term44978, term44978.getClass(), "icon", "mCLwpbFxDT");
        setField(term44908, term44908.getClass(), "meta", term44978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIcon", argTypes, term44908, args);
    }

};


