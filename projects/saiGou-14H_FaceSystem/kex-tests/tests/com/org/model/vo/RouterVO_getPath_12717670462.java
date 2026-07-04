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

public class RouterVO_getPath_12717670462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;

    public RouterVO_getPath_12717670462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term221 = new Boolean(false);
        Boolean term277 = new Boolean(true);
        ArrayList term282 = new ArrayList();
        ((ArrayList) term282).add((Object)null);
        ((ArrayList) term282).add((Object)null);
        ((ArrayList) term282).add((Object)null);
        ((ArrayList) term282).add((Object)null);
        ((ArrayList) term282).add((Object)null);
        Object term274 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term281 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term274, term274.getClass(), "name", "");
        setField(term274, term274.getClass(), "path", "");
        setField(term274, term274.getClass(), "hidden", term277);
        setField(term274, term274.getClass(), "redirect", "");
        setField(term274, term274.getClass(), "component", "");
        setField(term281, term281.getClass(), "title", null);
        setField(term281, term281.getClass(), "icon", null);
        setField(term274, term274.getClass(), "meta", term281);
        setField(term274, term274.getClass(), "children", term282);
        Boolean term288 = new Boolean(true);
        ArrayList term293 = new ArrayList();
        Object term285 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term292 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term285, term285.getClass(), "name", "");
        setField(term285, term285.getClass(), "path", "");
        setField(term285, term285.getClass(), "hidden", term288);
        setField(term285, term285.getClass(), "redirect", "");
        setField(term285, term285.getClass(), "component", "");
        setField(term292, term292.getClass(), "title", null);
        setField(term292, term292.getClass(), "icon", null);
        setField(term285, term285.getClass(), "meta", term292);
        setField(term285, term285.getClass(), "children", term293);
        Boolean term299 = new Boolean(false);
        ArrayList term304 = new ArrayList();
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        Object term296 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term303 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term296, term296.getClass(), "name", "");
        setField(term296, term296.getClass(), "path", "");
        setField(term296, term296.getClass(), "hidden", term299);
        setField(term296, term296.getClass(), "redirect", "");
        setField(term296, term296.getClass(), "component", "");
        setField(term303, term303.getClass(), "title", null);
        setField(term303, term303.getClass(), "icon", null);
        setField(term296, term296.getClass(), "meta", term303);
        setField(term296, term296.getClass(), "children", term304);
        Boolean term310 = new Boolean(false);
        ArrayList term315 = new ArrayList();
        ((ArrayList) term315).add((Object)null);
        ((ArrayList) term315).add((Object)null);
        ((ArrayList) term315).add((Object)null);
        ((ArrayList) term315).add((Object)null);
        ((ArrayList) term315).add((Object)null);
        ((ArrayList) term315).add((Object)null);
        Object term307 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term314 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term307, term307.getClass(), "name", "");
        setField(term307, term307.getClass(), "path", "");
        setField(term307, term307.getClass(), "hidden", term310);
        setField(term307, term307.getClass(), "redirect", "");
        setField(term307, term307.getClass(), "component", "");
        setField(term314, term314.getClass(), "title", null);
        setField(term314, term314.getClass(), "icon", null);
        setField(term307, term307.getClass(), "meta", term314);
        setField(term307, term307.getClass(), "children", term315);
        Boolean term321 = new Boolean(false);
        ArrayList term326 = new ArrayList();
        ((ArrayList) term326).add((Object)null);
        ((ArrayList) term326).add((Object)null);
        ((ArrayList) term326).add((Object)null);
        ((ArrayList) term326).add((Object)null);
        ((ArrayList) term326).add((Object)null);
        Object term318 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term325 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term318, term318.getClass(), "name", "");
        setField(term318, term318.getClass(), "path", "");
        setField(term318, term318.getClass(), "hidden", term321);
        setField(term318, term318.getClass(), "redirect", "");
        setField(term318, term318.getClass(), "component", "");
        setField(term325, term325.getClass(), "title", null);
        setField(term325, term325.getClass(), "icon", null);
        setField(term318, term318.getClass(), "meta", term325);
        setField(term318, term318.getClass(), "children", term326);
        ArrayList term272 = new ArrayList();
        ((ArrayList) term272).add(term274);
        ((ArrayList) term272).add(term285);
        ((ArrayList) term272).add(term296);
        ((ArrayList) term272).add(term307);
        ((ArrayList) term272).add(term318);
        ((ArrayList) term272).add(term285);
        term196 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term247 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term196, term196.getClass(), "name", "ytSBIKXogI");
        setField(term196, term196.getClass(), "path", "nHXjMycHlU");
        setField(term196, term196.getClass(), "hidden", term221);
        setField(term196, term196.getClass(), "redirect", "ieCtQFdkii");
        setField(term196, term196.getClass(), "component", "dEnhdmILtU");
        setField(term247, term247.getClass(), "title", "hoicvmsovO");
        setField(term247, term247.getClass(), "icon", "eqJfYWRaEL");
        setField(term196, term196.getClass(), "meta", term247);
        setField(term196, term196.getClass(), "children", term272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term196, args);
    }

};


