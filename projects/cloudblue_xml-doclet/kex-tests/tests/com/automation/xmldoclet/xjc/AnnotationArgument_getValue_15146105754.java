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

public class AnnotationArgument_getValue_15146105754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52732;

    public AnnotationArgument_getValue_15146105754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term52735 = new ArrayList();
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        ((ArrayList) term52735).add((Object)null);
        ArrayList term52739 = new ArrayList();
        ((ArrayList) term52739).add((Object)null);
        ((ArrayList) term52739).add((Object)null);
        ((ArrayList) term52739).add((Object)null);
        ((ArrayList) term52739).add((Object)null);
        ((ArrayList) term52739).add((Object)null);
        ((ArrayList) term52739).add((Object)null);
        Object term52745 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term52745, term52745.getClass(), "wildcard", null);
        setField(term52745, term52745.getClass(), "generic", null);
        setField(term52745, term52745.getClass(), "qualified", null);
        setField(term52745, term52745.getClass(), "dimension", null);
        ArrayList term52743 = new ArrayList();
        ((ArrayList) term52743).add(term52745);
        ArrayList term52772 = new ArrayList();
        ((ArrayList) term52772).add("TEOKQBulXn");
        ArrayList term52791 = new ArrayList();
        ((ArrayList) term52791).add((Object)null);
        ((ArrayList) term52791).add((Object)null);
        ((ArrayList) term52791).add((Object)null);
        ((ArrayList) term52791).add((Object)null);
        ((ArrayList) term52791).add((Object)null);
        ((ArrayList) term52791).add((Object)null);
        ((ArrayList) term52791).add((Object)null);
        ((ArrayList) term52791).add((Object)null);
        ((ArrayList) term52791).add((Object)null);
        Object term52790 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52790, term52790.getClass(), "argument", term52791);
        setField(term52790, term52790.getClass(), "name", "");
        setField(term52790, term52790.getClass(), "qualified", "");
        ArrayList term52797 = new ArrayList();
        ((ArrayList) term52797).add((Object)null);
        ((ArrayList) term52797).add((Object)null);
        ((ArrayList) term52797).add((Object)null);
        ((ArrayList) term52797).add((Object)null);
        Object term52796 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52796, term52796.getClass(), "argument", term52797);
        setField(term52796, term52796.getClass(), "name", "");
        setField(term52796, term52796.getClass(), "qualified", "");
        ArrayList term52803 = new ArrayList();
        ((ArrayList) term52803).add((Object)null);
        Object term52802 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52802, term52802.getClass(), "argument", term52803);
        setField(term52802, term52802.getClass(), "name", "");
        setField(term52802, term52802.getClass(), "qualified", "");
        ArrayList term52809 = new ArrayList();
        ((ArrayList) term52809).add((Object)null);
        ((ArrayList) term52809).add((Object)null);
        ((ArrayList) term52809).add((Object)null);
        Object term52808 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52808, term52808.getClass(), "argument", term52809);
        setField(term52808, term52808.getClass(), "name", "");
        setField(term52808, term52808.getClass(), "qualified", "");
        ArrayList term52815 = new ArrayList();
        ((ArrayList) term52815).add((Object)null);
        ((ArrayList) term52815).add((Object)null);
        ((ArrayList) term52815).add((Object)null);
        Object term52814 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52814, term52814.getClass(), "argument", term52815);
        setField(term52814, term52814.getClass(), "name", "");
        setField(term52814, term52814.getClass(), "qualified", "");
        ArrayList term52788 = new ArrayList();
        ((ArrayList) term52788).add(term52790);
        ((ArrayList) term52788).add(term52796);
        ((ArrayList) term52788).add(term52802);
        ((ArrayList) term52788).add(term52808);
        ((ArrayList) term52788).add(term52802);
        ((ArrayList) term52788).add(term52814);
        Boolean term52834 = new Boolean(false);
        Boolean term52836 = new Boolean(true);
        term52732 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term52733 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term52734 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term52734, term52734.getClass(), "extendsBound", term52735);
        setField(term52734, term52734.getClass(), "superBound", term52739);
        setField(term52733, term52733.getClass(), "wildcard", term52734);
        setField(term52733, term52733.getClass(), "generic", term52743);
        setField(term52733, term52733.getClass(), "qualified", "JvjJcIVdSV");
        setField(term52733, term52733.getClass(), "dimension", "eqANQrfmpz");
        setField(term52732, term52732.getClass(), "type", term52733);
        setField(term52732, term52732.getClass(), "value", term52772);
        setField(term52732, term52732.getClass(), "annotation", term52788);
        setField(term52732, term52732.getClass(), "name", "fXywzoCBZL");
        setField(term52732, term52732.getClass(), "primitive", term52834);
        setField(term52732, term52732.getClass(), "array", term52836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term52732, args);
    }

};


