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

public class Menu_getPath_565745273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44611;

    public Menu_getPath_565745273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44612 = new Integer(820400430);
        Integer term44638 = new Integer(-1841078275);
        Integer term44667 = new Integer(-875421053);
        Integer term44671 = new Integer(212464780);
        ArrayList term44675 = new ArrayList();
        ((ArrayList) term44675).add((Object)null);
        ((ArrayList) term44675).add((Object)null);
        ((ArrayList) term44675).add((Object)null);
        ((ArrayList) term44675).add((Object)null);
        ((ArrayList) term44675).add((Object)null);
        Object term44666 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44678 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44666, term44666.getClass(), "id", term44667);
        setField(term44666, term44666.getClass(), "name", "");
        setField(term44666, term44666.getClass(), "path", "");
        setField(term44666, term44666.getClass(), "parentId", term44671);
        setField(term44666, term44666.getClass(), "icon", "");
        setField(term44666, term44666.getClass(), "introduce", "");
        setField(term44666, term44666.getClass(), "children", term44675);
        setField(term44678, term44678.getClass(), "title", null);
        setField(term44678, term44678.getClass(), "icon", null);
        setField(term44666, term44666.getClass(), "meta", term44678);
        ArrayList term44664 = new ArrayList();
        ((ArrayList) term44664).add(term44666);
        term44611 = newInstance(Class.forName("com.org.model.Menu"));
        Object term44681 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term44611, term44611.getClass(), "id", term44612);
        setField(term44611, term44611.getClass(), "name", "BksKBJoApS");
        setField(term44611, term44611.getClass(), "path", "WJRkcFVplq");
        setField(term44611, term44611.getClass(), "parentId", term44638);
        setField(term44611, term44611.getClass(), "icon", "alTGbTVimv");
        setField(term44611, term44611.getClass(), "introduce", "BuHcxQArjr");
        setField(term44611, term44611.getClass(), "children", term44664);
        setField(term44681, term44681.getClass(), "title", "fTsnJYdRRQ");
        setField(term44681, term44681.getClass(), "icon", "laItnuvHbN");
        setField(term44611, term44611.getClass(), "meta", term44681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term44611, args);
    }

};


