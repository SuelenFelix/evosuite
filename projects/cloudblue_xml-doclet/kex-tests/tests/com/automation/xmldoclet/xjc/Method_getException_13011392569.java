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

public class Method_getException_13011392569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47007;

    public Method_getException_13011392569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47022 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47022, term47022.getClass(), "name", "");
        setField(term47022, term47022.getClass(), "text", "");
        Object term47025 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47025, term47025.getClass(), "name", "");
        setField(term47025, term47025.getClass(), "text", "");
        Object term47028 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47028, term47028.getClass(), "name", "");
        setField(term47028, term47028.getClass(), "text", "");
        Object term47031 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47031, term47031.getClass(), "name", "");
        setField(term47031, term47031.getClass(), "text", "");
        ArrayList term47020 = new ArrayList();
        ((ArrayList) term47020).add(term47022);
        ((ArrayList) term47020).add(term47025);
        ((ArrayList) term47020).add(term47028);
        ((ArrayList) term47020).add(term47031);
        ArrayList term47040 = new ArrayList();
        ((ArrayList) term47040).add((Object)null);
        ((ArrayList) term47040).add((Object)null);
        ((ArrayList) term47040).add((Object)null);
        ((ArrayList) term47040).add((Object)null);
        ((ArrayList) term47040).add((Object)null);
        Object term47038 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term47039 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47039, term47039.getClass(), "wildcard", null);
        setField(term47039, term47039.getClass(), "generic", null);
        setField(term47039, term47039.getClass(), "qualified", null);
        setField(term47039, term47039.getClass(), "dimension", null);
        setField(term47038, term47038.getClass(), "type", term47039);
        setField(term47038, term47038.getClass(), "annotation", term47040);
        setField(term47038, term47038.getClass(), "name", "");
        ArrayList term47046 = new ArrayList();
        ((ArrayList) term47046).add((Object)null);
        ((ArrayList) term47046).add((Object)null);
        Object term47044 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term47045 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47045, term47045.getClass(), "wildcard", null);
        setField(term47045, term47045.getClass(), "generic", null);
        setField(term47045, term47045.getClass(), "qualified", null);
        setField(term47045, term47045.getClass(), "dimension", null);
        setField(term47044, term47044.getClass(), "type", term47045);
        setField(term47044, term47044.getClass(), "annotation", term47046);
        setField(term47044, term47044.getClass(), "name", "");
        ArrayList term47052 = new ArrayList();
        ((ArrayList) term47052).add((Object)null);
        ((ArrayList) term47052).add((Object)null);
        ((ArrayList) term47052).add((Object)null);
        ((ArrayList) term47052).add((Object)null);
        ((ArrayList) term47052).add((Object)null);
        ((ArrayList) term47052).add((Object)null);
        ((ArrayList) term47052).add((Object)null);
        ((ArrayList) term47052).add((Object)null);
        Object term47050 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term47051 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47051, term47051.getClass(), "wildcard", null);
        setField(term47051, term47051.getClass(), "generic", null);
        setField(term47051, term47051.getClass(), "qualified", null);
        setField(term47051, term47051.getClass(), "dimension", null);
        setField(term47050, term47050.getClass(), "type", term47051);
        setField(term47050, term47050.getClass(), "annotation", term47052);
        setField(term47050, term47050.getClass(), "name", "");
        ArrayList term47058 = new ArrayList();
        ((ArrayList) term47058).add((Object)null);
        ((ArrayList) term47058).add((Object)null);
        ((ArrayList) term47058).add((Object)null);
        ((ArrayList) term47058).add((Object)null);
        Object term47056 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term47057 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47057, term47057.getClass(), "wildcard", null);
        setField(term47057, term47057.getClass(), "generic", null);
        setField(term47057, term47057.getClass(), "qualified", null);
        setField(term47057, term47057.getClass(), "dimension", null);
        setField(term47056, term47056.getClass(), "type", term47057);
        setField(term47056, term47056.getClass(), "annotation", term47058);
        setField(term47056, term47056.getClass(), "name", "");
        ArrayList term47064 = new ArrayList();
        ((ArrayList) term47064).add((Object)null);
        ((ArrayList) term47064).add((Object)null);
        ((ArrayList) term47064).add((Object)null);
        ((ArrayList) term47064).add((Object)null);
        ((ArrayList) term47064).add((Object)null);
        ((ArrayList) term47064).add((Object)null);
        Object term47062 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term47063 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47063, term47063.getClass(), "wildcard", null);
        setField(term47063, term47063.getClass(), "generic", null);
        setField(term47063, term47063.getClass(), "qualified", null);
        setField(term47063, term47063.getClass(), "dimension", null);
        setField(term47062, term47062.getClass(), "type", term47063);
        setField(term47062, term47062.getClass(), "annotation", term47064);
        setField(term47062, term47062.getClass(), "name", "");
        ArrayList term47036 = new ArrayList();
        ((ArrayList) term47036).add(term47038);
        ((ArrayList) term47036).add(term47044);
        ((ArrayList) term47036).add(term47050);
        ((ArrayList) term47036).add(term47056);
        ((ArrayList) term47036).add(term47062);
        ArrayList term47071 = new ArrayList();
        ((ArrayList) term47071).add(term47039);
        ArrayList term47075 = new ArrayList();
        Boolean term47127 = new Boolean(false);
        Boolean term47129 = new Boolean(true);
        Boolean term47131 = new Boolean(true);
        Boolean term47133 = new Boolean(false);
        Boolean term47135 = new Boolean(true);
        Boolean term47137 = new Boolean(true);
        Boolean term47139 = new Boolean(false);
        term47007 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        Object term47070 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47007, term47007.getClass(), "comment", "hfjlLNIfVY");
        setField(term47007, term47007.getClass(), "tag", term47020);
        setField(term47007, term47007.getClass(), "parameter", term47036);
        setField(term47070, term47070.getClass(), "wildcard", null);
        setField(term47070, term47070.getClass(), "generic", null);
        setField(term47070, term47070.getClass(), "qualified", null);
        setField(term47070, term47070.getClass(), "dimension", null);
        setField(term47007, term47007.getClass(), "_return", term47070);
        setField(term47007, term47007.getClass(), "exception", term47071);
        setField(term47007, term47007.getClass(), "annotation", term47075);
        setField(term47007, term47007.getClass(), "name", "YyJErGfWOq");
        setField(term47007, term47007.getClass(), "signature", "yBCjwOIEUT");
        setField(term47007, term47007.getClass(), "qualified", "UfEQfSHIiQ");
        setField(term47007, term47007.getClass(), "scope", "BmqvwTiWcU");
        setField(term47007, term47007.getClass(), "_abstract", term47127);
        setField(term47007, term47007.getClass(), "_final", term47129);
        setField(term47007, term47007.getClass(), "included", term47131);
        setField(term47007, term47007.getClass(), "_native", term47133);
        setField(term47007, term47007.getClass(), "_synchronized", term47135);
        setField(term47007, term47007.getClass(), "_static", term47137);
        setField(term47007, term47007.getClass(), "varArgs", term47139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getException", argTypes, term47007, args);
    }

};


