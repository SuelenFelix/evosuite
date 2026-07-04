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

public class Menu_getChildren_20243389247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45283;

    public Menu_getChildren_20243389247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45284 = new Integer(1902576230);
        Integer term45310 = new Integer(-1040460528);
        ArrayList term45336 = new ArrayList();
        term45283 = newInstance(Class.forName("com.org.model.Menu"));
        Object term45340 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term45283, term45283.getClass(), "id", term45284);
        setField(term45283, term45283.getClass(), "name", "iRQWZXiEUH");
        setField(term45283, term45283.getClass(), "path", "fcdVEOaHHw");
        setField(term45283, term45283.getClass(), "parentId", term45310);
        setField(term45283, term45283.getClass(), "icon", "jUXTpaaeTB");
        setField(term45283, term45283.getClass(), "introduce", "pCAsGhdPxl");
        setField(term45283, term45283.getClass(), "children", term45336);
        setField(term45340, term45340.getClass(), "title", "lszpDVqIUa");
        setField(term45340, term45340.getClass(), "icon", "yyvXqLmYib");
        setField(term45283, term45283.getClass(), "meta", term45340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChildren", argTypes, term45283, args);
    }

};


