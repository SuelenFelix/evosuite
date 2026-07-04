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

public class Menu_setMeta_9906762516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47072;
     Object term47193;

    public Menu_setMeta_9906762516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term47073 = new Integer(1122198417);
        Integer term47099 = new Integer(1853596233);
        Integer term47128 = new Integer(995880114);
        Integer term47132 = new Integer(-375101902);
        ArrayList term47136 = new ArrayList();
        ((ArrayList) term47136).add((Object)null);
        ((ArrayList) term47136).add((Object)null);
        ((ArrayList) term47136).add((Object)null);
        ((ArrayList) term47136).add((Object)null);
        ((ArrayList) term47136).add((Object)null);
        ((ArrayList) term47136).add((Object)null);
        ((ArrayList) term47136).add((Object)null);
        ((ArrayList) term47136).add((Object)null);
        Object term47127 = newInstance(Class.forName("com.org.model.Menu"));
        Object term47139 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term47127, term47127.getClass(), "id", term47128);
        setField(term47127, term47127.getClass(), "name", "");
        setField(term47127, term47127.getClass(), "path", "");
        setField(term47127, term47127.getClass(), "parentId", term47132);
        setField(term47127, term47127.getClass(), "icon", "");
        setField(term47127, term47127.getClass(), "introduce", "");
        setField(term47127, term47127.getClass(), "children", term47136);
        setField(term47139, term47139.getClass(), "title", null);
        setField(term47139, term47139.getClass(), "icon", null);
        setField(term47127, term47127.getClass(), "meta", term47139);
        Integer term47141 = new Integer(38995637);
        Integer term47145 = new Integer(-2106212589);
        ArrayList term47149 = new ArrayList();
        ((ArrayList) term47149).add((Object)null);
        ((ArrayList) term47149).add((Object)null);
        Object term47140 = newInstance(Class.forName("com.org.model.Menu"));
        Object term47152 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term47140, term47140.getClass(), "id", term47141);
        setField(term47140, term47140.getClass(), "name", "");
        setField(term47140, term47140.getClass(), "path", "");
        setField(term47140, term47140.getClass(), "parentId", term47145);
        setField(term47140, term47140.getClass(), "icon", "");
        setField(term47140, term47140.getClass(), "introduce", "");
        setField(term47140, term47140.getClass(), "children", term47149);
        setField(term47152, term47152.getClass(), "title", null);
        setField(term47152, term47152.getClass(), "icon", null);
        setField(term47140, term47140.getClass(), "meta", term47152);
        Integer term47154 = new Integer(1881486751);
        Integer term47158 = new Integer(-92679624);
        ArrayList term47162 = new ArrayList();
        ((ArrayList) term47162).add((Object)null);
        ((ArrayList) term47162).add((Object)null);
        ((ArrayList) term47162).add((Object)null);
        ((ArrayList) term47162).add((Object)null);
        Object term47153 = newInstance(Class.forName("com.org.model.Menu"));
        Object term47165 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term47153, term47153.getClass(), "id", term47154);
        setField(term47153, term47153.getClass(), "name", "");
        setField(term47153, term47153.getClass(), "path", "");
        setField(term47153, term47153.getClass(), "parentId", term47158);
        setField(term47153, term47153.getClass(), "icon", "");
        setField(term47153, term47153.getClass(), "introduce", "");
        setField(term47153, term47153.getClass(), "children", term47162);
        setField(term47165, term47165.getClass(), "title", null);
        setField(term47165, term47165.getClass(), "icon", null);
        setField(term47153, term47153.getClass(), "meta", term47165);
        ArrayList term47125 = new ArrayList();
        ((ArrayList) term47125).add(term47127);
        ((ArrayList) term47125).add(term47140);
        ((ArrayList) term47125).add(term47153);
        ((ArrayList) term47125).add(term47127);
        term47072 = newInstance(Class.forName("com.org.model.Menu"));
        Object term47168 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term47072, term47072.getClass(), "id", term47073);
        setField(term47072, term47072.getClass(), "name", "hKGdlGWpgE");
        setField(term47072, term47072.getClass(), "path", "CAoRKdEDwC");
        setField(term47072, term47072.getClass(), "parentId", term47099);
        setField(term47072, term47072.getClass(), "icon", "DEbtEvScYS");
        setField(term47072, term47072.getClass(), "introduce", "JHsrcnGhTe");
        setField(term47072, term47072.getClass(), "children", term47125);
        setField(term47168, term47168.getClass(), "title", "BviqbLXTPZ");
        setField(term47168, term47168.getClass(), "icon", "FwyFCiPSrm");
        setField(term47072, term47072.getClass(), "meta", term47168);
        term47193 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term47193, term47193.getClass(), "title", "KUcTWyEqgi");
        setField(term47193, term47193.getClass(), "icon", "IymNZoTRUi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.org.model.vo.MetaVO");
        Object[] args = new Object[1];
        args[0] = term47193;
        callMethod(klass, "setMeta", argTypes, term47072, args);
    }

};


