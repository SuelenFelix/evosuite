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

public class RouterVO_getHidden_4570571463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391;

    public RouterVO_getHidden_4570571463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term416 = new Boolean(true);
        Boolean term472 = new Boolean(true);
        ArrayList term477 = new ArrayList();
        ((ArrayList) term477).add((Object)null);
        Object term469 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term476 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term469, term469.getClass(), "name", "");
        setField(term469, term469.getClass(), "path", "");
        setField(term469, term469.getClass(), "hidden", term472);
        setField(term469, term469.getClass(), "redirect", "");
        setField(term469, term469.getClass(), "component", "");
        setField(term476, term476.getClass(), "title", null);
        setField(term476, term476.getClass(), "icon", null);
        setField(term469, term469.getClass(), "meta", term476);
        setField(term469, term469.getClass(), "children", term477);
        Boolean term483 = new Boolean(false);
        ArrayList term488 = new ArrayList();
        ((ArrayList) term488).add((Object)null);
        ((ArrayList) term488).add((Object)null);
        ((ArrayList) term488).add((Object)null);
        ((ArrayList) term488).add((Object)null);
        ((ArrayList) term488).add((Object)null);
        ((ArrayList) term488).add((Object)null);
        Object term480 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term487 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term480, term480.getClass(), "name", "");
        setField(term480, term480.getClass(), "path", "");
        setField(term480, term480.getClass(), "hidden", term483);
        setField(term480, term480.getClass(), "redirect", "");
        setField(term480, term480.getClass(), "component", "");
        setField(term487, term487.getClass(), "title", null);
        setField(term487, term487.getClass(), "icon", null);
        setField(term480, term480.getClass(), "meta", term487);
        setField(term480, term480.getClass(), "children", term488);
        ArrayList term467 = new ArrayList();
        ((ArrayList) term467).add(term469);
        ((ArrayList) term467).add(term480);
        term391 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term442 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term391, term391.getClass(), "name", "pORebkoRdD");
        setField(term391, term391.getClass(), "path", "mXGCWJDOqA");
        setField(term391, term391.getClass(), "hidden", term416);
        setField(term391, term391.getClass(), "redirect", "dpNsDgfPso");
        setField(term391, term391.getClass(), "component", "hCWPJQKpdc");
        setField(term442, term442.getClass(), "title", "WzMEhMXkKx");
        setField(term442, term442.getClass(), "icon", "XOiDvlDhdc");
        setField(term391, term391.getClass(), "meta", term442);
        setField(term391, term391.getClass(), "children", term467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHidden", argTypes, term391, args);
    }

};


