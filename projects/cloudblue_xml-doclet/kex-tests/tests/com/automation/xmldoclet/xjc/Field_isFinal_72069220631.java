package com.automation.xmldoclet.xjc;

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
import static com.automation.xmldoclet.xjc.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class Field_isFinal_72069220631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59257;

    public Field_isFinal_72069220631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term59260 = new ArrayList();
        ((ArrayList) term59260).add((Object)null);
        ((ArrayList) term59260).add((Object)null);
        ((ArrayList) term59260).add((Object)null);
        ((ArrayList) term59260).add((Object)null);
        ((ArrayList) term59260).add((Object)null);
        ((ArrayList) term59260).add((Object)null);
        ((ArrayList) term59260).add((Object)null);
        ((ArrayList) term59260).add((Object)null);
        ((ArrayList) term59260).add((Object)null);
        ArrayList term59264 = new ArrayList();
        ((ArrayList) term59264).add((Object)null);
        ((ArrayList) term59264).add((Object)null);
        ((ArrayList) term59264).add((Object)null);
        ((ArrayList) term59264).add((Object)null);
        Object term59270 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term59270, term59270.getClass(), "wildcard", null);
        setField(term59270, term59270.getClass(), "generic", null);
        setField(term59270, term59270.getClass(), "qualified", null);
        setField(term59270, term59270.getClass(), "dimension", null);
        ArrayList term59268 = new ArrayList();
        ((ArrayList) term59268).add(term59270);
        Object term59311 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term59311, term59311.getClass(), "name", "");
        setField(term59311, term59311.getClass(), "text", "");
        ArrayList term59309 = new ArrayList();
        ((ArrayList) term59309).add(term59311);
        ArrayList term59331 = new ArrayList();
        Object term59330 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term59330, term59330.getClass(), "argument", term59331);
        setField(term59330, term59330.getClass(), "name", "");
        setField(term59330, term59330.getClass(), "qualified", "");
        ArrayList term59328 = new ArrayList();
        ((ArrayList) term59328).add(term59330);
        Boolean term59374 = new Boolean(true);
        Boolean term59376 = new Boolean(false);
        Boolean term59378 = new Boolean(false);
        Boolean term59380 = new Boolean(true);
        term59257 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term59258 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term59259 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term59259, term59259.getClass(), "extendsBound", term59260);
        setField(term59259, term59259.getClass(), "superBound", term59264);
        setField(term59258, term59258.getClass(), "wildcard", term59259);
        setField(term59258, term59258.getClass(), "generic", term59268);
        setField(term59258, term59258.getClass(), "qualified", "EXEDsJqTLl");
        setField(term59258, term59258.getClass(), "dimension", "REjhaEPdoq");
        setField(term59257, term59257.getClass(), "type", term59258);
        setField(term59257, term59257.getClass(), "comment", "aRXrfzjwRY");
        setField(term59257, term59257.getClass(), "tag", term59309);
        setField(term59257, term59257.getClass(), "constant", "nubLJEISEW");
        setField(term59257, term59257.getClass(), "annotation", term59328);
        setField(term59257, term59257.getClass(), "name", "ImetawLqrg");
        setField(term59257, term59257.getClass(), "qualified", "zYncodsfQi");
        setField(term59257, term59257.getClass(), "scope", "nhZsvxPuWm");
        setField(term59257, term59257.getClass(), "_volatile", term59374);
        setField(term59257, term59257.getClass(), "_transient", term59376);
        setField(term59257, term59257.getClass(), "_static", term59378);
        setField(term59257, term59257.getClass(), "_final", term59380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFinal", argTypes, term59257, args);
    }

};


