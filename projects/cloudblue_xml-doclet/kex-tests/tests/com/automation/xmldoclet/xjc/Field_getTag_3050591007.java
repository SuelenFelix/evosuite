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

public class Field_getTag_3050591007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55565;

    public Field_getTag_3050591007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55568 = new ArrayList();
        ((ArrayList) term55568).add((Object)null);
        ArrayList term55572 = new ArrayList();
        Object term55578 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55578, term55578.getClass(), "wildcard", null);
        setField(term55578, term55578.getClass(), "generic", null);
        setField(term55578, term55578.getClass(), "qualified", null);
        setField(term55578, term55578.getClass(), "dimension", null);
        Object term55579 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55579, term55579.getClass(), "wildcard", null);
        setField(term55579, term55579.getClass(), "generic", null);
        setField(term55579, term55579.getClass(), "qualified", null);
        setField(term55579, term55579.getClass(), "dimension", null);
        Object term55580 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55580, term55580.getClass(), "wildcard", null);
        setField(term55580, term55580.getClass(), "generic", null);
        setField(term55580, term55580.getClass(), "qualified", null);
        setField(term55580, term55580.getClass(), "dimension", null);
        ArrayList term55576 = new ArrayList();
        ((ArrayList) term55576).add(term55578);
        ((ArrayList) term55576).add(term55579);
        ((ArrayList) term55576).add(term55580);
        Object term55621 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term55621, term55621.getClass(), "name", "");
        setField(term55621, term55621.getClass(), "text", "");
        Object term55624 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term55624, term55624.getClass(), "name", "");
        setField(term55624, term55624.getClass(), "text", "");
        Object term55627 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term55627, term55627.getClass(), "name", "");
        setField(term55627, term55627.getClass(), "text", "");
        ArrayList term55619 = new ArrayList();
        ((ArrayList) term55619).add(term55621);
        ((ArrayList) term55619).add(term55624);
        ((ArrayList) term55619).add(term55627);
        ArrayList term55647 = new ArrayList();
        ((ArrayList) term55647).add((Object)null);
        ((ArrayList) term55647).add((Object)null);
        ((ArrayList) term55647).add((Object)null);
        Object term55646 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term55646, term55646.getClass(), "argument", term55647);
        setField(term55646, term55646.getClass(), "name", "");
        setField(term55646, term55646.getClass(), "qualified", "");
        ArrayList term55653 = new ArrayList();
        ((ArrayList) term55653).add((Object)null);
        ((ArrayList) term55653).add((Object)null);
        ((ArrayList) term55653).add((Object)null);
        ((ArrayList) term55653).add((Object)null);
        ((ArrayList) term55653).add((Object)null);
        ((ArrayList) term55653).add((Object)null);
        ((ArrayList) term55653).add((Object)null);
        ((ArrayList) term55653).add((Object)null);
        ((ArrayList) term55653).add((Object)null);
        Object term55652 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term55652, term55652.getClass(), "argument", term55653);
        setField(term55652, term55652.getClass(), "name", "");
        setField(term55652, term55652.getClass(), "qualified", "");
        ArrayList term55659 = new ArrayList();
        ((ArrayList) term55659).add((Object)null);
        ((ArrayList) term55659).add((Object)null);
        ((ArrayList) term55659).add((Object)null);
        ((ArrayList) term55659).add((Object)null);
        ((ArrayList) term55659).add((Object)null);
        Object term55658 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term55658, term55658.getClass(), "argument", term55659);
        setField(term55658, term55658.getClass(), "name", "");
        setField(term55658, term55658.getClass(), "qualified", "");
        ArrayList term55644 = new ArrayList();
        ((ArrayList) term55644).add(term55646);
        ((ArrayList) term55644).add(term55646);
        ((ArrayList) term55644).add(term55652);
        ((ArrayList) term55644).add(term55658);
        Boolean term55702 = new Boolean(true);
        Boolean term55704 = new Boolean(true);
        Boolean term55706 = new Boolean(true);
        Boolean term55708 = new Boolean(false);
        term55565 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term55566 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term55567 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term55567, term55567.getClass(), "extendsBound", term55568);
        setField(term55567, term55567.getClass(), "superBound", term55572);
        setField(term55566, term55566.getClass(), "wildcard", term55567);
        setField(term55566, term55566.getClass(), "generic", term55576);
        setField(term55566, term55566.getClass(), "qualified", "DcuCMyITMf");
        setField(term55566, term55566.getClass(), "dimension", "jMbwDwRnJg");
        setField(term55565, term55565.getClass(), "type", term55566);
        setField(term55565, term55565.getClass(), "comment", "IWwUWlkpXp");
        setField(term55565, term55565.getClass(), "tag", term55619);
        setField(term55565, term55565.getClass(), "constant", "LfROTdbawi");
        setField(term55565, term55565.getClass(), "annotation", term55644);
        setField(term55565, term55565.getClass(), "name", "aOVoESOppu");
        setField(term55565, term55565.getClass(), "qualified", "SlDqohJiKb");
        setField(term55565, term55565.getClass(), "scope", "iiabGchugi");
        setField(term55565, term55565.getClass(), "_volatile", term55702);
        setField(term55565, term55565.getClass(), "_transient", term55704);
        setField(term55565, term55565.getClass(), "_static", term55706);
        setField(term55565, term55565.getClass(), "_final", term55708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTag", argTypes, term55565, args);
    }

};


