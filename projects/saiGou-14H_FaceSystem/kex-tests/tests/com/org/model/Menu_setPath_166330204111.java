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

public class Menu_setPath_166330204111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45992;

    public Menu_setPath_166330204111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45993 = new Integer(-68148707);
        Integer term46019 = new Integer(-487634357);
        Integer term46048 = new Integer(52605389);
        Integer term46052 = new Integer(-769585004);
        ArrayList term46056 = new ArrayList();
        ((ArrayList) term46056).add((Object)null);
        ((ArrayList) term46056).add((Object)null);
        ((ArrayList) term46056).add((Object)null);
        ((ArrayList) term46056).add((Object)null);
        ((ArrayList) term46056).add((Object)null);
        ((ArrayList) term46056).add((Object)null);
        ((ArrayList) term46056).add((Object)null);
        ((ArrayList) term46056).add((Object)null);
        ((ArrayList) term46056).add((Object)null);
        Object term46047 = newInstance(Class.forName("com.org.model.Menu"));
        Object term46059 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term46047, term46047.getClass(), "id", term46048);
        setField(term46047, term46047.getClass(), "name", "");
        setField(term46047, term46047.getClass(), "path", "");
        setField(term46047, term46047.getClass(), "parentId", term46052);
        setField(term46047, term46047.getClass(), "icon", "");
        setField(term46047, term46047.getClass(), "introduce", "");
        setField(term46047, term46047.getClass(), "children", term46056);
        setField(term46059, term46059.getClass(), "title", null);
        setField(term46059, term46059.getClass(), "icon", null);
        setField(term46047, term46047.getClass(), "meta", term46059);
        Integer term46061 = new Integer(1811211444);
        Integer term46065 = new Integer(-1188357817);
        ArrayList term46069 = new ArrayList();
        ((ArrayList) term46069).add((Object)null);
        ((ArrayList) term46069).add((Object)null);
        ((ArrayList) term46069).add((Object)null);
        ((ArrayList) term46069).add((Object)null);
        ((ArrayList) term46069).add((Object)null);
        ((ArrayList) term46069).add((Object)null);
        Object term46060 = newInstance(Class.forName("com.org.model.Menu"));
        Object term46072 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term46060, term46060.getClass(), "id", term46061);
        setField(term46060, term46060.getClass(), "name", "");
        setField(term46060, term46060.getClass(), "path", "");
        setField(term46060, term46060.getClass(), "parentId", term46065);
        setField(term46060, term46060.getClass(), "icon", "");
        setField(term46060, term46060.getClass(), "introduce", "");
        setField(term46060, term46060.getClass(), "children", term46069);
        setField(term46072, term46072.getClass(), "title", null);
        setField(term46072, term46072.getClass(), "icon", null);
        setField(term46060, term46060.getClass(), "meta", term46072);
        Integer term46074 = new Integer(-1554795442);
        Integer term46078 = new Integer(1486110844);
        ArrayList term46082 = new ArrayList();
        ((ArrayList) term46082).add((Object)null);
        ((ArrayList) term46082).add((Object)null);
        Object term46073 = newInstance(Class.forName("com.org.model.Menu"));
        Object term46085 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term46073, term46073.getClass(), "id", term46074);
        setField(term46073, term46073.getClass(), "name", "");
        setField(term46073, term46073.getClass(), "path", "");
        setField(term46073, term46073.getClass(), "parentId", term46078);
        setField(term46073, term46073.getClass(), "icon", "");
        setField(term46073, term46073.getClass(), "introduce", "");
        setField(term46073, term46073.getClass(), "children", term46082);
        setField(term46085, term46085.getClass(), "title", null);
        setField(term46085, term46085.getClass(), "icon", null);
        setField(term46073, term46073.getClass(), "meta", term46085);
        ArrayList term46045 = new ArrayList();
        ((ArrayList) term46045).add(term46047);
        ((ArrayList) term46045).add(term46060);
        ((ArrayList) term46045).add(term46073);
        term45992 = newInstance(Class.forName("com.org.model.Menu"));
        Object term46088 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term45992, term45992.getClass(), "id", term45993);
        setField(term45992, term45992.getClass(), "name", "YgPDOKUqzz");
        setField(term45992, term45992.getClass(), "path", "YdnSnYhvAc");
        setField(term45992, term45992.getClass(), "parentId", term46019);
        setField(term45992, term45992.getClass(), "icon", "hSvzaodHpr");
        setField(term45992, term45992.getClass(), "introduce", "YfRaGHwBdR");
        setField(term45992, term45992.getClass(), "children", term46045);
        setField(term46088, term46088.getClass(), "title", "emYcsVGUYx");
        setField(term46088, term46088.getClass(), "icon", "XjePexyWCG");
        setField(term45992, term45992.getClass(), "meta", term46088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JTkwAPwsKT";
        callMethod(klass, "setPath", argTypes, term45992, args);
    }

};


