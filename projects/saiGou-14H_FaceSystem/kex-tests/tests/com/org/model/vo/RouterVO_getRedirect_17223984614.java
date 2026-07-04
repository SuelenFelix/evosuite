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

public class RouterVO_getRedirect_17223984614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553;

    public RouterVO_getRedirect_17223984614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term578 = new Boolean(true);
        Boolean term634 = new Boolean(true);
        ArrayList term639 = new ArrayList();
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        Object term631 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term638 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term631, term631.getClass(), "name", "");
        setField(term631, term631.getClass(), "path", "");
        setField(term631, term631.getClass(), "hidden", term634);
        setField(term631, term631.getClass(), "redirect", "");
        setField(term631, term631.getClass(), "component", "");
        setField(term638, term638.getClass(), "title", null);
        setField(term638, term638.getClass(), "icon", null);
        setField(term631, term631.getClass(), "meta", term638);
        setField(term631, term631.getClass(), "children", term639);
        Boolean term645 = new Boolean(true);
        ArrayList term650 = new ArrayList();
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        Object term642 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term649 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term642, term642.getClass(), "name", "");
        setField(term642, term642.getClass(), "path", "");
        setField(term642, term642.getClass(), "hidden", term645);
        setField(term642, term642.getClass(), "redirect", "");
        setField(term642, term642.getClass(), "component", "");
        setField(term649, term649.getClass(), "title", null);
        setField(term649, term649.getClass(), "icon", null);
        setField(term642, term642.getClass(), "meta", term649);
        setField(term642, term642.getClass(), "children", term650);
        Boolean term656 = new Boolean(true);
        ArrayList term661 = new ArrayList();
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        Object term653 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term660 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term653, term653.getClass(), "name", "");
        setField(term653, term653.getClass(), "path", "");
        setField(term653, term653.getClass(), "hidden", term656);
        setField(term653, term653.getClass(), "redirect", "");
        setField(term653, term653.getClass(), "component", "");
        setField(term660, term660.getClass(), "title", null);
        setField(term660, term660.getClass(), "icon", null);
        setField(term653, term653.getClass(), "meta", term660);
        setField(term653, term653.getClass(), "children", term661);
        Boolean term667 = new Boolean(true);
        ArrayList term672 = new ArrayList();
        ((ArrayList) term672).add((Object)null);
        Object term664 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term671 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term664, term664.getClass(), "name", "");
        setField(term664, term664.getClass(), "path", "");
        setField(term664, term664.getClass(), "hidden", term667);
        setField(term664, term664.getClass(), "redirect", "");
        setField(term664, term664.getClass(), "component", "");
        setField(term671, term671.getClass(), "title", null);
        setField(term671, term671.getClass(), "icon", null);
        setField(term664, term664.getClass(), "meta", term671);
        setField(term664, term664.getClass(), "children", term672);
        ArrayList term629 = new ArrayList();
        ((ArrayList) term629).add(term631);
        ((ArrayList) term629).add(term642);
        ((ArrayList) term629).add(term653);
        ((ArrayList) term629).add(term631);
        ((ArrayList) term629).add(term664);
        ((ArrayList) term629).add(term653);
        term553 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term604 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term553, term553.getClass(), "name", "lihXWlGDxk");
        setField(term553, term553.getClass(), "path", "JmcmxoGhIK");
        setField(term553, term553.getClass(), "hidden", term578);
        setField(term553, term553.getClass(), "redirect", "jXzmYyrnnT");
        setField(term553, term553.getClass(), "component", "igCAtimmYB");
        setField(term604, term604.getClass(), "title", "DyiXbeYIaN");
        setField(term604, term604.getClass(), "icon", "VGizxZnyHX");
        setField(term553, term553.getClass(), "meta", term604);
        setField(term553, term553.getClass(), "children", term629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRedirect", argTypes, term553, args);
    }

};


