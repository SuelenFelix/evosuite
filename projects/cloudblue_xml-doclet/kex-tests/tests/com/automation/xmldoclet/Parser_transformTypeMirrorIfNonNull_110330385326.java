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

public class Parser_transformTypeMirrorIfNonNull_110330385326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38127;

    public Parser_transformTypeMirrorIfNonNull_110330385326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38131 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38131, term38131.getClass(), "comment", null);
        setField(term38131, term38131.getClass(), "tag", null);
        setField(term38131, term38131.getClass(), "annotation", null);
        setField(term38131, term38131.getClass(), "_enum", null);
        setField(term38131, term38131.getClass(), "_interface", null);
        setField(term38131, term38131.getClass(), "clazz", null);
        setField(term38131, term38131.getClass(), "name", null);
        Object term38132 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38132, term38132.getClass(), "comment", null);
        setField(term38132, term38132.getClass(), "tag", null);
        setField(term38132, term38132.getClass(), "annotation", null);
        setField(term38132, term38132.getClass(), "_enum", null);
        setField(term38132, term38132.getClass(), "_interface", null);
        setField(term38132, term38132.getClass(), "clazz", null);
        setField(term38132, term38132.getClass(), "name", null);
        Object term38133 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38133, term38133.getClass(), "comment", null);
        setField(term38133, term38133.getClass(), "tag", null);
        setField(term38133, term38133.getClass(), "annotation", null);
        setField(term38133, term38133.getClass(), "_enum", null);
        setField(term38133, term38133.getClass(), "_interface", null);
        setField(term38133, term38133.getClass(), "clazz", null);
        setField(term38133, term38133.getClass(), "name", null);
        Object term38134 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38134, term38134.getClass(), "comment", null);
        setField(term38134, term38134.getClass(), "tag", null);
        setField(term38134, term38134.getClass(), "annotation", null);
        setField(term38134, term38134.getClass(), "_enum", null);
        setField(term38134, term38134.getClass(), "_interface", null);
        setField(term38134, term38134.getClass(), "clazz", null);
        setField(term38134, term38134.getClass(), "name", null);
        Object term38135 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38135, term38135.getClass(), "comment", null);
        setField(term38135, term38135.getClass(), "tag", null);
        setField(term38135, term38135.getClass(), "annotation", null);
        setField(term38135, term38135.getClass(), "_enum", null);
        setField(term38135, term38135.getClass(), "_interface", null);
        setField(term38135, term38135.getClass(), "clazz", null);
        setField(term38135, term38135.getClass(), "name", null);
        Object term38136 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38136, term38136.getClass(), "comment", null);
        setField(term38136, term38136.getClass(), "tag", null);
        setField(term38136, term38136.getClass(), "annotation", null);
        setField(term38136, term38136.getClass(), "_enum", null);
        setField(term38136, term38136.getClass(), "_interface", null);
        setField(term38136, term38136.getClass(), "clazz", null);
        setField(term38136, term38136.getClass(), "name", null);
        Object term38137 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38137, term38137.getClass(), "comment", null);
        setField(term38137, term38137.getClass(), "tag", null);
        setField(term38137, term38137.getClass(), "annotation", null);
        setField(term38137, term38137.getClass(), "_enum", null);
        setField(term38137, term38137.getClass(), "_interface", null);
        setField(term38137, term38137.getClass(), "clazz", null);
        setField(term38137, term38137.getClass(), "name", null);
        Object term38138 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term38138, term38138.getClass(), "comment", null);
        setField(term38138, term38138.getClass(), "tag", null);
        setField(term38138, term38138.getClass(), "annotation", null);
        setField(term38138, term38138.getClass(), "_enum", null);
        setField(term38138, term38138.getClass(), "_interface", null);
        setField(term38138, term38138.getClass(), "clazz", null);
        setField(term38138, term38138.getClass(), "name", null);
        ArrayList term38129 = new ArrayList();
        ((ArrayList) term38129).add(term38131);
        ((ArrayList) term38129).add(term38132);
        ((ArrayList) term38129).add(term38133);
        ((ArrayList) term38129).add(term38134);
        ((ArrayList) term38129).add(term38135);
        ((ArrayList) term38129).add(term38136);
        ((ArrayList) term38129).add(term38137);
        ((ArrayList) term38129).add(term38138);
        term38127 = newInstance(Class.forName("com.automation.xmldoclet.Parser"));
        Object term38128 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Root"));
        setField(term38128, term38128.getClass(), "_package", term38129);
        setField(term38127, term38127.getClass(), "xmlRoot", term38128);
        setField(term38127, term38127.getClass(), "environment", null);
        setField(term38127, term38127.getClass(), "docTreesUtils", null);
        setField(term38127, term38127.getClass(), "elementUtils", null);
        setField(term38127, term38127.getClass(), "typeUtils", null);
        setField(term38127, term38127.getClass(), "objectType", null);
        setField(term38127, term38127.getClass(), "errorType", null);
        setField(term38127, term38127.getClass(), "exceptionType", null);
        setField(term38127, term38127.getClass(), "externalizableType", null);
        setField(term38127, term38127.getClass(), "serializableType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.lang.model.type.TypeMirror");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transformTypeMirrorIfNonNull", argTypes, term38127, args);
    }

};


