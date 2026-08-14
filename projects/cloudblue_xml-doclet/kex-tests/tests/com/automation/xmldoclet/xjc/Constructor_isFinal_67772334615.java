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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class Constructor_isFinal_67772334615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3496;

    public Constructor_isFinal_67772334615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3511 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term3511, term3511.getClass(), "name", "");
        setField(term3511, term3511.getClass(), "text", "");
        Object term3514 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term3514, term3514.getClass(), "name", "");
        setField(term3514, term3514.getClass(), "text", "");
        Object term3517 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term3517, term3517.getClass(), "name", "");
        setField(term3517, term3517.getClass(), "text", "");
        Object term3520 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term3520, term3520.getClass(), "name", "");
        setField(term3520, term3520.getClass(), "text", "");
        ArrayList term3509 = new ArrayList();
        ((ArrayList) term3509).add(term3511);
        ((ArrayList) term3509).add(term3514);
        ((ArrayList) term3509).add(term3517);
        ((ArrayList) term3509).add(term3520);
        ArrayList term3529 = new ArrayList();
        ((ArrayList) term3529).add((Object)null);
        ((ArrayList) term3529).add((Object)null);
        ((ArrayList) term3529).add((Object)null);
        ((ArrayList) term3529).add((Object)null);
        ((ArrayList) term3529).add((Object)null);
        ((ArrayList) term3529).add((Object)null);
        ((ArrayList) term3529).add((Object)null);
        ((ArrayList) term3529).add((Object)null);
        ((ArrayList) term3529).add((Object)null);
        Object term3527 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term3528 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term3528, term3528.getClass(), "wildcard", null);
        setField(term3528, term3528.getClass(), "generic", null);
        setField(term3528, term3528.getClass(), "qualified", null);
        setField(term3528, term3528.getClass(), "dimension", null);
        setField(term3527, term3527.getClass(), "type", term3528);
        setField(term3527, term3527.getClass(), "annotation", term3529);
        setField(term3527, term3527.getClass(), "name", "");
        ArrayList term3535 = new ArrayList();
        ((ArrayList) term3535).add((Object)null);
        ((ArrayList) term3535).add((Object)null);
        ((ArrayList) term3535).add((Object)null);
        ((ArrayList) term3535).add((Object)null);
        Object term3533 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term3534 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term3534, term3534.getClass(), "wildcard", null);
        setField(term3534, term3534.getClass(), "generic", null);
        setField(term3534, term3534.getClass(), "qualified", null);
        setField(term3534, term3534.getClass(), "dimension", null);
        setField(term3533, term3533.getClass(), "type", term3534);
        setField(term3533, term3533.getClass(), "annotation", term3535);
        setField(term3533, term3533.getClass(), "name", "");
        ArrayList term3541 = new ArrayList();
        Object term3539 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term3540 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term3540, term3540.getClass(), "wildcard", null);
        setField(term3540, term3540.getClass(), "generic", null);
        setField(term3540, term3540.getClass(), "qualified", null);
        setField(term3540, term3540.getClass(), "dimension", null);
        setField(term3539, term3539.getClass(), "type", term3540);
        setField(term3539, term3539.getClass(), "annotation", term3541);
        setField(term3539, term3539.getClass(), "name", "");
        ArrayList term3525 = new ArrayList();
        ((ArrayList) term3525).add(term3527);
        ((ArrayList) term3525).add(term3533);
        ((ArrayList) term3525).add(term3539);
        ArrayList term3547 = new ArrayList();
        ((ArrayList) term3547).add(term3540);
        ArrayList term3554 = new ArrayList();
        ((ArrayList) term3554).add((Object)null);
        ((ArrayList) term3554).add((Object)null);
        ((ArrayList) term3554).add((Object)null);
        ((ArrayList) term3554).add((Object)null);
        ((ArrayList) term3554).add((Object)null);
        Object term3553 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term3553, term3553.getClass(), "argument", term3554);
        setField(term3553, term3553.getClass(), "name", "");
        setField(term3553, term3553.getClass(), "qualified", "");
        Object term3559 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term3559, term3559.getClass(), "argument", null);
        setField(term3559, term3559.getClass(), "name", null);
        setField(term3559, term3559.getClass(), "qualified", null);
        Object term3560 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term3560, term3560.getClass(), "argument", null);
        setField(term3560, term3560.getClass(), "name", null);
        setField(term3560, term3560.getClass(), "qualified", null);
        Object term3561 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term3561, term3561.getClass(), "argument", null);
        setField(term3561, term3561.getClass(), "name", null);
        setField(term3561, term3561.getClass(), "qualified", null);
        ArrayList term3551 = new ArrayList();
        ((ArrayList) term3551).add(term3553);
        ((ArrayList) term3551).add(term3559);
        ((ArrayList) term3551).add(term3560);
        ((ArrayList) term3551).add(term3561);
        Boolean term3612 = new Boolean(true);
        Boolean term3614 = new Boolean(false);
        Boolean term3616 = new Boolean(false);
        Boolean term3618 = new Boolean(false);
        Boolean term3620 = new Boolean(true);
        Boolean term3622 = new Boolean(false);
        term3496 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term3496, term3496.getClass(), "comment", "CEtjGBplmv");
        setField(term3496, term3496.getClass(), "tag", term3509);
        setField(term3496, term3496.getClass(), "parameter", term3525);
        setField(term3496, term3496.getClass(), "exception", term3547);
        setField(term3496, term3496.getClass(), "annotation", term3551);
        setField(term3496, term3496.getClass(), "name", "baJbjUImxp");
        setField(term3496, term3496.getClass(), "signature", "lPERFqPpGz");
        setField(term3496, term3496.getClass(), "qualified", "jleFBTYSNb");
        setField(term3496, term3496.getClass(), "scope", "WmSSWHEELj");
        setField(term3496, term3496.getClass(), "_final", term3612);
        setField(term3496, term3496.getClass(), "included", term3614);
        setField(term3496, term3496.getClass(), "_native", term3616);
        setField(term3496, term3496.getClass(), "_synchronized", term3618);
        setField(term3496, term3496.getClass(), "_static", term3620);
        setField(term3496, term3496.getClass(), "varArgs", term3622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFinal", argTypes, term3496, args);
    }

};


