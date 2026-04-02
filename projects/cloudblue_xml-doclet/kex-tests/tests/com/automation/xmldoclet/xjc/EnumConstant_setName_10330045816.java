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

public class EnumConstant_setName_10330045816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7802;

    public EnumConstant_setName_10330045816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7817 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7817, term7817.getClass(), "name", "");
        setField(term7817, term7817.getClass(), "text", "");
        Object term7820 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7820, term7820.getClass(), "name", "");
        setField(term7820, term7820.getClass(), "text", "");
        Object term7823 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7823, term7823.getClass(), "name", "");
        setField(term7823, term7823.getClass(), "text", "");
        Object term7826 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7826, term7826.getClass(), "name", "");
        setField(term7826, term7826.getClass(), "text", "");
        Object term7829 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7829, term7829.getClass(), "name", "");
        setField(term7829, term7829.getClass(), "text", "");
        Object term7832 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7832, term7832.getClass(), "name", "");
        setField(term7832, term7832.getClass(), "text", "");
        ArrayList term7815 = new ArrayList();
        ((ArrayList) term7815).add(term7817);
        ((ArrayList) term7815).add(term7820);
        ((ArrayList) term7815).add(term7823);
        ((ArrayList) term7815).add(term7826);
        ((ArrayList) term7815).add(term7829);
        ((ArrayList) term7815).add(term7832);
        ArrayList term7837 = new ArrayList();
        term7802 = newInstance(Class.forName("com.automation.xmldoclet.xjc.EnumConstant"));
        setField(term7802, term7802.getClass(), "comment", "PASAYkwcOc");
        setField(term7802, term7802.getClass(), "tag", term7815);
        setField(term7802, term7802.getClass(), "annotation", term7837);
        setField(term7802, term7802.getClass(), "name", "PTMnmtfPDP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.EnumConstant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "POLJqDqHhk";
        callMethod(klass, "setName", argTypes, term7802, args);
    }

};


