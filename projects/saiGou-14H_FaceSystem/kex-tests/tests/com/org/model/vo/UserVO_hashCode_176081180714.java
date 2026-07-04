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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class UserVO_hashCode_176081180714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44051;

    public UserVO_hashCode_176081180714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44052 = new Integer(1014463904);
        Integer term44093 = new Integer(928673401);
        Integer term44097 = new Integer(-631739609);
        ArrayList term44101 = new ArrayList();
        Object term44092 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44104 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44092, term44092.getClass(), "id", term44093);
        setField(term44092, term44092.getClass(), "name", "");
        setField(term44092, term44092.getClass(), "path", "");
        setField(term44092, term44092.getClass(), "parentId", term44097);
        setField(term44092, term44092.getClass(), "icon", "");
        setField(term44092, term44092.getClass(), "introduce", "");
        setField(term44092, term44092.getClass(), "children", term44101);
        setField(term44104, term44104.getClass(), "title", null);
        setField(term44104, term44104.getClass(), "icon", null);
        setField(term44092, term44092.getClass(), "meta", term44104);
        Integer term44106 = new Integer(-2045566233);
        Integer term44110 = new Integer(102632361);
        ArrayList term44114 = new ArrayList();
        ((ArrayList) term44114).add((Object)null);
        ((ArrayList) term44114).add((Object)null);
        ((ArrayList) term44114).add((Object)null);
        ((ArrayList) term44114).add((Object)null);
        ((ArrayList) term44114).add((Object)null);
        ((ArrayList) term44114).add((Object)null);
        ((ArrayList) term44114).add((Object)null);
        ((ArrayList) term44114).add((Object)null);
        ((ArrayList) term44114).add((Object)null);
        Object term44105 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44117 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44105, term44105.getClass(), "id", term44106);
        setField(term44105, term44105.getClass(), "name", "");
        setField(term44105, term44105.getClass(), "path", "");
        setField(term44105, term44105.getClass(), "parentId", term44110);
        setField(term44105, term44105.getClass(), "icon", "");
        setField(term44105, term44105.getClass(), "introduce", "");
        setField(term44105, term44105.getClass(), "children", term44114);
        setField(term44117, term44117.getClass(), "title", null);
        setField(term44117, term44117.getClass(), "icon", null);
        setField(term44105, term44105.getClass(), "meta", term44117);
        Integer term44119 = new Integer(678776902);
        Integer term44123 = new Integer(-1148076813);
        ArrayList term44127 = new ArrayList();
        ((ArrayList) term44127).add((Object)null);
        ((ArrayList) term44127).add((Object)null);
        Object term44118 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44130 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44118, term44118.getClass(), "id", term44119);
        setField(term44118, term44118.getClass(), "name", "");
        setField(term44118, term44118.getClass(), "path", "");
        setField(term44118, term44118.getClass(), "parentId", term44123);
        setField(term44118, term44118.getClass(), "icon", "");
        setField(term44118, term44118.getClass(), "introduce", "");
        setField(term44118, term44118.getClass(), "children", term44127);
        setField(term44130, term44130.getClass(), "title", null);
        setField(term44130, term44130.getClass(), "icon", null);
        setField(term44118, term44118.getClass(), "meta", term44130);
        ArrayList term44090 = new ArrayList();
        ((ArrayList) term44090).add(term44092);
        ((ArrayList) term44090).add(term44105);
        ((ArrayList) term44090).add(term44118);
        term44051 = newInstance(Class.forName("com.org.model.vo.UserVO"));
        setField(term44051, term44051.getClass(), "id", term44052);
        setField(term44051, term44051.getClass(), "email", "VkHSPWaJkj");
        setField(term44051, term44051.getClass(), "username", "xWmJSkwYQZ");
        setField(term44051, term44051.getClass(), "power", "jjKfBPODKz");
        setField(term44051, term44051.getClass(), "menus", term44090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.UserVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term44051, args);
    }

};


