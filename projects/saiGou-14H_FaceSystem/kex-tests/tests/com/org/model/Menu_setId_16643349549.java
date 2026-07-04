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

public class Menu_setId_16643349549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45606;
     Object term45714;

    public Menu_setId_16643349549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45607 = new Integer(-1155698012);
        Integer term45633 = new Integer(-1635314310);
        Integer term45662 = new Integer(-1583672247);
        Integer term45666 = new Integer(1150713854);
        ArrayList term45670 = new ArrayList();
        Object term45661 = newInstance(Class.forName("com.org.model.Menu"));
        Object term45673 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term45661, term45661.getClass(), "id", term45662);
        setField(term45661, term45661.getClass(), "name", "");
        setField(term45661, term45661.getClass(), "path", "");
        setField(term45661, term45661.getClass(), "parentId", term45666);
        setField(term45661, term45661.getClass(), "icon", "");
        setField(term45661, term45661.getClass(), "introduce", "");
        setField(term45661, term45661.getClass(), "children", term45670);
        setField(term45673, term45673.getClass(), "title", null);
        setField(term45673, term45673.getClass(), "icon", null);
        setField(term45661, term45661.getClass(), "meta", term45673);
        Integer term45675 = new Integer(999843869);
        Integer term45679 = new Integer(1047162942);
        ArrayList term45683 = new ArrayList();
        ((ArrayList) term45683).add((Object)null);
        ((ArrayList) term45683).add((Object)null);
        ((ArrayList) term45683).add((Object)null);
        Object term45674 = newInstance(Class.forName("com.org.model.Menu"));
        Object term45686 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term45674, term45674.getClass(), "id", term45675);
        setField(term45674, term45674.getClass(), "name", "");
        setField(term45674, term45674.getClass(), "path", "");
        setField(term45674, term45674.getClass(), "parentId", term45679);
        setField(term45674, term45674.getClass(), "icon", "");
        setField(term45674, term45674.getClass(), "introduce", "");
        setField(term45674, term45674.getClass(), "children", term45683);
        setField(term45686, term45686.getClass(), "title", null);
        setField(term45686, term45686.getClass(), "icon", null);
        setField(term45674, term45674.getClass(), "meta", term45686);
        ArrayList term45659 = new ArrayList();
        ((ArrayList) term45659).add(term45661);
        ((ArrayList) term45659).add(term45674);
        ((ArrayList) term45659).add(term45661);
        term45606 = newInstance(Class.forName("com.org.model.Menu"));
        Object term45689 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term45606, term45606.getClass(), "id", term45607);
        setField(term45606, term45606.getClass(), "name", "CZHHeRyhGd");
        setField(term45606, term45606.getClass(), "path", "LnjxlHgiSg");
        setField(term45606, term45606.getClass(), "parentId", term45633);
        setField(term45606, term45606.getClass(), "icon", "dvGoacPxWs");
        setField(term45606, term45606.getClass(), "introduce", "iaFnkcCpId");
        setField(term45606, term45606.getClass(), "children", term45659);
        setField(term45689, term45689.getClass(), "title", "zuSHCmjoJr");
        setField(term45689, term45689.getClass(), "icon", "oFWSOiBgQG");
        setField(term45606, term45606.getClass(), "meta", term45689);
        term45714 = new Integer(828708445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term45714;
        callMethod(klass, "setId", argTypes, term45606, args);
    }

};


