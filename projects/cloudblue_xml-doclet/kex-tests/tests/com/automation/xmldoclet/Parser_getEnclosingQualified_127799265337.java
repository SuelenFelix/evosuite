package com.automation.xmldoclet;

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
import static com.automation.xmldoclet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_getEnclosingQualified_127799265337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38301;

    public Parser_getEnclosingQualified_127799265337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38305 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38305, term38305.getClass(), "comment", null);
        setField(term38305, term38305.getClass(), "tag", null);
        setField(term38305, term38305.getClass(), "annotation", null);
        setField(term38305, term38305.getClass(), "_enum", null);
        setField(term38305, term38305.getClass(), "_interface", null);
        setField(term38305, term38305.getClass(), "clazz", null);
        setField(term38305, term38305.getClass(), "name", null);
        Object term38306 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38306, term38306.getClass(), "comment", null);
        setField(term38306, term38306.getClass(), "tag", null);
        setField(term38306, term38306.getClass(), "annotation", null);
        setField(term38306, term38306.getClass(), "_enum", null);
        setField(term38306, term38306.getClass(), "_interface", null);
        setField(term38306, term38306.getClass(), "clazz", null);
        setField(term38306, term38306.getClass(), "name", null);
        Object term38307 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38307, term38307.getClass(), "comment", null);
        setField(term38307, term38307.getClass(), "tag", null);
        setField(term38307, term38307.getClass(), "annotation", null);
        setField(term38307, term38307.getClass(), "_enum", null);
        setField(term38307, term38307.getClass(), "_interface", null);
        setField(term38307, term38307.getClass(), "clazz", null);
        setField(term38307, term38307.getClass(), "name", null);
        Object term38308 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38308, term38308.getClass(), "comment", null);
        setField(term38308, term38308.getClass(), "tag", null);
        setField(term38308, term38308.getClass(), "annotation", null);
        setField(term38308, term38308.getClass(), "_enum", null);
        setField(term38308, term38308.getClass(), "_interface", null);
        setField(term38308, term38308.getClass(), "clazz", null);
        setField(term38308, term38308.getClass(), "name", null);
        Object term38309 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38309, term38309.getClass(), "comment", null);
        setField(term38309, term38309.getClass(), "tag", null);
        setField(term38309, term38309.getClass(), "annotation", null);
        setField(term38309, term38309.getClass(), "_enum", null);
        setField(term38309, term38309.getClass(), "_interface", null);
        setField(term38309, term38309.getClass(), "clazz", null);
        setField(term38309, term38309.getClass(), "name", null);
        Object term38310 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38310, term38310.getClass(), "comment", null);
        setField(term38310, term38310.getClass(), "tag", null);
        setField(term38310, term38310.getClass(), "annotation", null);
        setField(term38310, term38310.getClass(), "_enum", null);
        setField(term38310, term38310.getClass(), "_interface", null);
        setField(term38310, term38310.getClass(), "clazz", null);
        setField(term38310, term38310.getClass(), "name", null);
        Object term38311 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38311, term38311.getClass(), "comment", null);
        setField(term38311, term38311.getClass(), "tag", null);
        setField(term38311, term38311.getClass(), "annotation", null);
        setField(term38311, term38311.getClass(), "_enum", null);
        setField(term38311, term38311.getClass(), "_interface", null);
        setField(term38311, term38311.getClass(), "clazz", null);
        setField(term38311, term38311.getClass(), "name", null);
        Object term38312 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38312, term38312.getClass(), "comment", null);
        setField(term38312, term38312.getClass(), "tag", null);
        setField(term38312, term38312.getClass(), "annotation", null);
        setField(term38312, term38312.getClass(), "_enum", null);
        setField(term38312, term38312.getClass(), "_interface", null);
        setField(term38312, term38312.getClass(), "clazz", null);
        setField(term38312, term38312.getClass(), "name", null);
        Object term38313 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38313, term38313.getClass(), "comment", null);
        setField(term38313, term38313.getClass(), "tag", null);
        setField(term38313, term38313.getClass(), "annotation", null);
        setField(term38313, term38313.getClass(), "_enum", null);
        setField(term38313, term38313.getClass(), "_interface", null);
        setField(term38313, term38313.getClass(), "clazz", null);
        setField(term38313, term38313.getClass(), "name", null);
        ArrayList term38303 = new ArrayList();
        ((ArrayList) term38303).add(term38305);
        ((ArrayList) term38303).add(term38306);
        ((ArrayList) term38303).add(term38307);
        ((ArrayList) term38303).add(term38308);
        ((ArrayList) term38303).add(term38309);
        ((ArrayList) term38303).add(term38310);
        ((ArrayList) term38303).add(term38311);
        ((ArrayList) term38303).add(term38312);
        ((ArrayList) term38303).add(term38313);
        term38301 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38302 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38302, term38302.getClass(), "_package", term38303);
        setField(term38301, term38301.getClass(), "xmlRoot", term38302);
        setField(term38301, term38301.getClass(), "environment", null);
        setField(term38301, term38301.getClass(), "docTreesUtils", null);
        setField(term38301, term38301.getClass(), "elementUtils", null);
        setField(term38301, term38301.getClass(), "typeUtils", null);
        setField(term38301, term38301.getClass(), "objectType", null);
        setField(term38301, term38301.getClass(), "errorType", null);
        setField(term38301, term38301.getClass(), "exceptionType", null);
        setField(term38301, term38301.getClass(), "externalizableType", null);
        setField(term38301, term38301.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getEnclosingQualified", argTypes, term38301, args);
    }

};


