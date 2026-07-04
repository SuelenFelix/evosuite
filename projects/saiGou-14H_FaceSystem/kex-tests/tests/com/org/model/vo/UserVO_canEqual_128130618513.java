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

public class UserVO_canEqual_128130618513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43938;
     Object term44020;

    public UserVO_canEqual_128130618513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term43939 = new Integer(-561801733);
        Integer term43980 = new Integer(2134609936);
        Integer term43984 = new Integer(-409989519);
        ArrayList term43988 = new ArrayList();
        ((ArrayList) term43988).add((Object)null);
        ((ArrayList) term43988).add((Object)null);
        ((ArrayList) term43988).add((Object)null);
        ((ArrayList) term43988).add((Object)null);
        ((ArrayList) term43988).add((Object)null);
        ((ArrayList) term43988).add((Object)null);
        Object term43979 = newInstance(Class.forName("com.org.model.Menu"));
        Object term43991 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term43979, term43979.getClass(), "id", term43980);
        setField(term43979, term43979.getClass(), "name", "");
        setField(term43979, term43979.getClass(), "path", "");
        setField(term43979, term43979.getClass(), "parentId", term43984);
        setField(term43979, term43979.getClass(), "icon", "");
        setField(term43979, term43979.getClass(), "introduce", "");
        setField(term43979, term43979.getClass(), "children", term43988);
        setField(term43991, term43991.getClass(), "title", null);
        setField(term43991, term43991.getClass(), "icon", null);
        setField(term43979, term43979.getClass(), "meta", term43991);
        Integer term43993 = new Integer(254385018);
        Integer term43997 = new Integer(672070228);
        ArrayList term44001 = new ArrayList();
        ((ArrayList) term44001).add((Object)null);
        ((ArrayList) term44001).add((Object)null);
        ((ArrayList) term44001).add((Object)null);
        Object term43992 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44004 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term43992, term43992.getClass(), "id", term43993);
        setField(term43992, term43992.getClass(), "name", "");
        setField(term43992, term43992.getClass(), "path", "");
        setField(term43992, term43992.getClass(), "parentId", term43997);
        setField(term43992, term43992.getClass(), "icon", "");
        setField(term43992, term43992.getClass(), "introduce", "");
        setField(term43992, term43992.getClass(), "children", term44001);
        setField(term44004, term44004.getClass(), "title", null);
        setField(term44004, term44004.getClass(), "icon", null);
        setField(term43992, term43992.getClass(), "meta", term44004);
        Integer term44006 = new Integer(-2015476493);
        Integer term44010 = new Integer(41528103);
        ArrayList term44014 = new ArrayList();
        ((ArrayList) term44014).add((Object)null);
        ((ArrayList) term44014).add((Object)null);
        ((ArrayList) term44014).add((Object)null);
        ((ArrayList) term44014).add((Object)null);
        ((ArrayList) term44014).add((Object)null);
        ((ArrayList) term44014).add((Object)null);
        ((ArrayList) term44014).add((Object)null);
        ((ArrayList) term44014).add((Object)null);
        ((ArrayList) term44014).add((Object)null);
        Object term44005 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44017 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44005, term44005.getClass(), "id", term44006);
        setField(term44005, term44005.getClass(), "name", "");
        setField(term44005, term44005.getClass(), "path", "");
        setField(term44005, term44005.getClass(), "parentId", term44010);
        setField(term44005, term44005.getClass(), "icon", "");
        setField(term44005, term44005.getClass(), "introduce", "");
        setField(term44005, term44005.getClass(), "children", term44014);
        setField(term44017, term44017.getClass(), "title", null);
        setField(term44017, term44017.getClass(), "icon", null);
        setField(term44005, term44005.getClass(), "meta", term44017);
        ArrayList term43977 = new ArrayList();
        ((ArrayList) term43977).add(term43979);
        ((ArrayList) term43977).add(term43992);
        ((ArrayList) term43977).add(term44005);
        term43938 = newInstance(Class.forName("com.org.model.vo.UserVO"));
        setField(term43938, term43938.getClass(), "id", term43939);
        setField(term43938, term43938.getClass(), "email", "UJPTKcUnZi");
        setField(term43938, term43938.getClass(), "username", "GzcrOTeeyR");
        setField(term43938, term43938.getClass(), "power", "OePvhoTVgk");
        setField(term43938, term43938.getClass(), "menus", term43977);
        term44020 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.UserVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44020;
        callMethod(klass, "canEqual", argTypes, term43938, args);
    }

};


