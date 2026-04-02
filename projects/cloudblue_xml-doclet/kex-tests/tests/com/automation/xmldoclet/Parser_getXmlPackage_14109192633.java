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

public class Parser_getXmlPackage_14109192633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38236;

    public Parser_getXmlPackage_14109192633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38240 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38240, term38240.getClass(), "comment", null);
        setField(term38240, term38240.getClass(), "tag", null);
        setField(term38240, term38240.getClass(), "annotation", null);
        setField(term38240, term38240.getClass(), "_enum", null);
        setField(term38240, term38240.getClass(), "_interface", null);
        setField(term38240, term38240.getClass(), "clazz", null);
        setField(term38240, term38240.getClass(), "name", null);
        Object term38241 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38241, term38241.getClass(), "comment", null);
        setField(term38241, term38241.getClass(), "tag", null);
        setField(term38241, term38241.getClass(), "annotation", null);
        setField(term38241, term38241.getClass(), "_enum", null);
        setField(term38241, term38241.getClass(), "_interface", null);
        setField(term38241, term38241.getClass(), "clazz", null);
        setField(term38241, term38241.getClass(), "name", null);
        Object term38242 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38242, term38242.getClass(), "comment", null);
        setField(term38242, term38242.getClass(), "tag", null);
        setField(term38242, term38242.getClass(), "annotation", null);
        setField(term38242, term38242.getClass(), "_enum", null);
        setField(term38242, term38242.getClass(), "_interface", null);
        setField(term38242, term38242.getClass(), "clazz", null);
        setField(term38242, term38242.getClass(), "name", null);
        Object term38243 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38243, term38243.getClass(), "comment", null);
        setField(term38243, term38243.getClass(), "tag", null);
        setField(term38243, term38243.getClass(), "annotation", null);
        setField(term38243, term38243.getClass(), "_enum", null);
        setField(term38243, term38243.getClass(), "_interface", null);
        setField(term38243, term38243.getClass(), "clazz", null);
        setField(term38243, term38243.getClass(), "name", null);
        Object term38244 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38244, term38244.getClass(), "comment", null);
        setField(term38244, term38244.getClass(), "tag", null);
        setField(term38244, term38244.getClass(), "annotation", null);
        setField(term38244, term38244.getClass(), "_enum", null);
        setField(term38244, term38244.getClass(), "_interface", null);
        setField(term38244, term38244.getClass(), "clazz", null);
        setField(term38244, term38244.getClass(), "name", null);
        Object term38245 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38245, term38245.getClass(), "comment", null);
        setField(term38245, term38245.getClass(), "tag", null);
        setField(term38245, term38245.getClass(), "annotation", null);
        setField(term38245, term38245.getClass(), "_enum", null);
        setField(term38245, term38245.getClass(), "_interface", null);
        setField(term38245, term38245.getClass(), "clazz", null);
        setField(term38245, term38245.getClass(), "name", null);
        Object term38246 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38246, term38246.getClass(), "comment", null);
        setField(term38246, term38246.getClass(), "tag", null);
        setField(term38246, term38246.getClass(), "annotation", null);
        setField(term38246, term38246.getClass(), "_enum", null);
        setField(term38246, term38246.getClass(), "_interface", null);
        setField(term38246, term38246.getClass(), "clazz", null);
        setField(term38246, term38246.getClass(), "name", null);
        Object term38247 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38247, term38247.getClass(), "comment", null);
        setField(term38247, term38247.getClass(), "tag", null);
        setField(term38247, term38247.getClass(), "annotation", null);
        setField(term38247, term38247.getClass(), "_enum", null);
        setField(term38247, term38247.getClass(), "_interface", null);
        setField(term38247, term38247.getClass(), "clazz", null);
        setField(term38247, term38247.getClass(), "name", null);
        ArrayList term38238 = new ArrayList();
        ((ArrayList) term38238).add(term38240);
        ((ArrayList) term38238).add(term38241);
        ((ArrayList) term38238).add(term38242);
        ((ArrayList) term38238).add(term38243);
        ((ArrayList) term38238).add(term38244);
        ((ArrayList) term38238).add(term38245);
        ((ArrayList) term38238).add(term38246);
        ((ArrayList) term38238).add(term38247);
        term38236 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38237 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38237, term38237.getClass(), "_package", term38238);
        setField(term38236, term38236.getClass(), "xmlRoot", term38237);
        setField(term38236, term38236.getClass(), "environment", null);
        setField(term38236, term38236.getClass(), "docTreesUtils", null);
        setField(term38236, term38236.getClass(), "elementUtils", null);
        setField(term38236, term38236.getClass(), "typeUtils", null);
        setField(term38236, term38236.getClass(), "objectType", null);
        setField(term38236, term38236.getClass(), "errorType", null);
        setField(term38236, term38236.getClass(), "exceptionType", null);
        setField(term38236, term38236.getClass(), "externalizableType", null);
        setField(term38236, term38236.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.element.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getXmlPackage", argTypes, term38236, args);
    }

};


