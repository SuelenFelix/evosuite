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

public class RouterVO_toString_194891223318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3357;

    public RouterVO_toString_194891223318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3382 = new Boolean(true);
        Boolean term3438 = new Boolean(true);
        ArrayList term3443 = new ArrayList();
        ((ArrayList) term3443).add((Object)null);
        ((ArrayList) term3443).add((Object)null);
        ((ArrayList) term3443).add((Object)null);
        ((ArrayList) term3443).add((Object)null);
        ((ArrayList) term3443).add((Object)null);
        ((ArrayList) term3443).add((Object)null);
        ((ArrayList) term3443).add((Object)null);
        Object term3435 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term3442 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term3435, term3435.getClass(), "name", "");
        setField(term3435, term3435.getClass(), "path", "");
        setField(term3435, term3435.getClass(), "hidden", term3438);
        setField(term3435, term3435.getClass(), "redirect", "");
        setField(term3435, term3435.getClass(), "component", "");
        setField(term3442, term3442.getClass(), "title", null);
        setField(term3442, term3442.getClass(), "icon", null);
        setField(term3435, term3435.getClass(), "meta", term3442);
        setField(term3435, term3435.getClass(), "children", term3443);
        Boolean term3449 = new Boolean(true);
        ArrayList term3454 = new ArrayList();
        ((ArrayList) term3454).add((Object)null);
        ((ArrayList) term3454).add((Object)null);
        Object term3446 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term3453 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term3446, term3446.getClass(), "name", "");
        setField(term3446, term3446.getClass(), "path", "");
        setField(term3446, term3446.getClass(), "hidden", term3449);
        setField(term3446, term3446.getClass(), "redirect", "");
        setField(term3446, term3446.getClass(), "component", "");
        setField(term3453, term3453.getClass(), "title", null);
        setField(term3453, term3453.getClass(), "icon", null);
        setField(term3446, term3446.getClass(), "meta", term3453);
        setField(term3446, term3446.getClass(), "children", term3454);
        ArrayList term3433 = new ArrayList();
        ((ArrayList) term3433).add(term3435);
        ((ArrayList) term3433).add(term3435);
        ((ArrayList) term3433).add(term3446);
        term3357 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term3408 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term3357, term3357.getClass(), "name", "iQRfDlaoYD");
        setField(term3357, term3357.getClass(), "path", "kpcyrjDQzN");
        setField(term3357, term3357.getClass(), "hidden", term3382);
        setField(term3357, term3357.getClass(), "redirect", "IyukykAHLQ");
        setField(term3357, term3357.getClass(), "component", "CwZcgFJqMh");
        setField(term3408, term3408.getClass(), "title", "RldCZqgRbO");
        setField(term3408, term3408.getClass(), "icon", "LOVugCAgJs");
        setField(term3357, term3357.getClass(), "meta", term3408);
        setField(term3357, term3357.getClass(), "children", term3433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3357, args);
    }

};


