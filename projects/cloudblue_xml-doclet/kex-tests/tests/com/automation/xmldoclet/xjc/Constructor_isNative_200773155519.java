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

public class Constructor_isNative_200773155519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4310;

    public Constructor_isNative_200773155519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4325 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term4325, term4325.getClass(), "name", "");
        setField(term4325, term4325.getClass(), "text", "");
        Object term4328 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term4328, term4328.getClass(), "name", "");
        setField(term4328, term4328.getClass(), "text", "");
        Object term4331 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term4331, term4331.getClass(), "name", "");
        setField(term4331, term4331.getClass(), "text", "");
        Object term4334 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term4334, term4334.getClass(), "name", "");
        setField(term4334, term4334.getClass(), "text", "");
        Object term4337 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term4337, term4337.getClass(), "name", "");
        setField(term4337, term4337.getClass(), "text", "");
        Object term4340 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term4340, term4340.getClass(), "name", "");
        setField(term4340, term4340.getClass(), "text", "");
        ArrayList term4323 = new ArrayList();
        ((ArrayList) term4323).add(term4325);
        ((ArrayList) term4323).add(term4328);
        ((ArrayList) term4323).add(term4331);
        ((ArrayList) term4323).add(term4334);
        ((ArrayList) term4323).add(term4337);
        ((ArrayList) term4323).add(term4340);
        ArrayList term4349 = new ArrayList();
        Object term4347 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term4348 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term4348, term4348.getClass(), "wildcard", null);
        setField(term4348, term4348.getClass(), "generic", null);
        setField(term4348, term4348.getClass(), "qualified", null);
        setField(term4348, term4348.getClass(), "dimension", null);
        setField(term4347, term4347.getClass(), "type", term4348);
        setField(term4347, term4347.getClass(), "annotation", term4349);
        setField(term4347, term4347.getClass(), "name", "");
        ArrayList term4345 = new ArrayList();
        ((ArrayList) term4345).add(term4347);
        ArrayList term4355 = new ArrayList();
        ArrayList term4362 = new ArrayList();
        ((ArrayList) term4362).add((Object)null);
        ((ArrayList) term4362).add((Object)null);
        ((ArrayList) term4362).add((Object)null);
        Object term4361 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term4361, term4361.getClass(), "argument", term4362);
        setField(term4361, term4361.getClass(), "name", "");
        setField(term4361, term4361.getClass(), "qualified", "");
        ArrayList term4368 = new ArrayList();
        ((ArrayList) term4368).add((Object)null);
        ((ArrayList) term4368).add((Object)null);
        ((ArrayList) term4368).add((Object)null);
        ((ArrayList) term4368).add((Object)null);
        ((ArrayList) term4368).add((Object)null);
        ((ArrayList) term4368).add((Object)null);
        ((ArrayList) term4368).add((Object)null);
        ((ArrayList) term4368).add((Object)null);
        ((ArrayList) term4368).add((Object)null);
        Object term4367 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term4367, term4367.getClass(), "argument", term4368);
        setField(term4367, term4367.getClass(), "name", "");
        setField(term4367, term4367.getClass(), "qualified", "");
        ArrayList term4374 = new ArrayList();
        ((ArrayList) term4374).add((Object)null);
        ((ArrayList) term4374).add((Object)null);
        ((ArrayList) term4374).add((Object)null);
        ((ArrayList) term4374).add((Object)null);
        ((ArrayList) term4374).add((Object)null);
        ((ArrayList) term4374).add((Object)null);
        ((ArrayList) term4374).add((Object)null);
        ((ArrayList) term4374).add((Object)null);
        Object term4373 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term4373, term4373.getClass(), "argument", term4374);
        setField(term4373, term4373.getClass(), "name", "");
        setField(term4373, term4373.getClass(), "qualified", "");
        ArrayList term4380 = new ArrayList();
        ((ArrayList) term4380).add((Object)null);
        ((ArrayList) term4380).add((Object)null);
        ((ArrayList) term4380).add((Object)null);
        Object term4379 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term4379, term4379.getClass(), "argument", term4380);
        setField(term4379, term4379.getClass(), "name", "");
        setField(term4379, term4379.getClass(), "qualified", "");
        ArrayList term4386 = new ArrayList();
        ((ArrayList) term4386).add((Object)null);
        ((ArrayList) term4386).add((Object)null);
        ((ArrayList) term4386).add((Object)null);
        ((ArrayList) term4386).add((Object)null);
        ((ArrayList) term4386).add((Object)null);
        ((ArrayList) term4386).add((Object)null);
        ((ArrayList) term4386).add((Object)null);
        ((ArrayList) term4386).add((Object)null);
        ((ArrayList) term4386).add((Object)null);
        Object term4385 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term4385, term4385.getClass(), "argument", term4386);
        setField(term4385, term4385.getClass(), "name", "");
        setField(term4385, term4385.getClass(), "qualified", "");
        ArrayList term4392 = new ArrayList();
        ((ArrayList) term4392).add((Object)null);
        ((ArrayList) term4392).add((Object)null);
        ((ArrayList) term4392).add((Object)null);
        ((ArrayList) term4392).add((Object)null);
        ((ArrayList) term4392).add((Object)null);
        ((ArrayList) term4392).add((Object)null);
        ((ArrayList) term4392).add((Object)null);
        ((ArrayList) term4392).add((Object)null);
        Object term4391 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term4391, term4391.getClass(), "argument", term4392);
        setField(term4391, term4391.getClass(), "name", "");
        setField(term4391, term4391.getClass(), "qualified", "");
        ArrayList term4398 = new ArrayList();
        ((ArrayList) term4398).add((Object)null);
        ((ArrayList) term4398).add((Object)null);
        ((ArrayList) term4398).add((Object)null);
        Object term4397 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term4397, term4397.getClass(), "argument", term4398);
        setField(term4397, term4397.getClass(), "name", "");
        setField(term4397, term4397.getClass(), "qualified", "");
        ArrayList term4359 = new ArrayList();
        ((ArrayList) term4359).add(term4361);
        ((ArrayList) term4359).add(term4367);
        ((ArrayList) term4359).add(term4361);
        ((ArrayList) term4359).add(term4373);
        ((ArrayList) term4359).add(term4379);
        ((ArrayList) term4359).add(term4385);
        ((ArrayList) term4359).add(term4391);
        ((ArrayList) term4359).add(term4367);
        ((ArrayList) term4359).add(term4397);
        Boolean term4453 = new Boolean(false);
        Boolean term4455 = new Boolean(true);
        Boolean term4457 = new Boolean(true);
        Boolean term4459 = new Boolean(false);
        Boolean term4461 = new Boolean(true);
        Boolean term4463 = new Boolean(false);
        term4310 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term4310, term4310.getClass(), "comment", "cPlYOAUqsP");
        setField(term4310, term4310.getClass(), "tag", term4323);
        setField(term4310, term4310.getClass(), "parameter", term4345);
        setField(term4310, term4310.getClass(), "exception", term4355);
        setField(term4310, term4310.getClass(), "annotation", term4359);
        setField(term4310, term4310.getClass(), "name", "CpdMEgjUka");
        setField(term4310, term4310.getClass(), "signature", "WRisHdgnmm");
        setField(term4310, term4310.getClass(), "qualified", "XxZiwWPLOx");
        setField(term4310, term4310.getClass(), "scope", "nyqsjMHTba");
        setField(term4310, term4310.getClass(), "_final", term4453);
        setField(term4310, term4310.getClass(), "included", term4455);
        setField(term4310, term4310.getClass(), "_native", term4457);
        setField(term4310, term4310.getClass(), "_synchronized", term4459);
        setField(term4310, term4310.getClass(), "_static", term4461);
        setField(term4310, term4310.getClass(), "varArgs", term4463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNative", argTypes, term4310, args);
    }

};


