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

public class Field_getConstant_4328176318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55780;

    public Field_getConstant_4328176318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55783 = new ArrayList();
        ((ArrayList) term55783).add((Object)null);
        ((ArrayList) term55783).add((Object)null);
        ((ArrayList) term55783).add((Object)null);
        ((ArrayList) term55783).add((Object)null);
        ArrayList term55787 = new ArrayList();
        ((ArrayList) term55787).add((Object)null);
        ((ArrayList) term55787).add((Object)null);
        ((ArrayList) term55787).add((Object)null);
        ((ArrayList) term55787).add((Object)null);
        Object term55793 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55793, term55793.getClass(), "wildcard", null);
        setField(term55793, term55793.getClass(), "generic", null);
        setField(term55793, term55793.getClass(), "qualified", null);
        setField(term55793, term55793.getClass(), "dimension", null);
        Object term55794 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55794, term55794.getClass(), "wildcard", null);
        setField(term55794, term55794.getClass(), "generic", null);
        setField(term55794, term55794.getClass(), "qualified", null);
        setField(term55794, term55794.getClass(), "dimension", null);
        ArrayList term55791 = new ArrayList();
        ((ArrayList) term55791).add(term55793);
        ((ArrayList) term55791).add(term55794);
        Object term55835 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term55835, term55835.getClass(), "name", "");
        setField(term55835, term55835.getClass(), "text", "");
        Object term55838 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term55838, term55838.getClass(), "name", "");
        setField(term55838, term55838.getClass(), "text", "");
        ArrayList term55833 = new ArrayList();
        ((ArrayList) term55833).add(term55835);
        ((ArrayList) term55833).add(term55838);
        ArrayList term55855 = new ArrayList();
        Boolean term55895 = new Boolean(false);
        Boolean term55897 = new Boolean(true);
        Boolean term55899 = new Boolean(false);
        Boolean term55901 = new Boolean(false);
        term55780 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term55781 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term55782 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term55782, term55782.getClass(), "extendsBound", term55783);
        setField(term55782, term55782.getClass(), "superBound", term55787);
        setField(term55781, term55781.getClass(), "wildcard", term55782);
        setField(term55781, term55781.getClass(), "generic", term55791);
        setField(term55781, term55781.getClass(), "qualified", "bPWhFUZrHo");
        setField(term55781, term55781.getClass(), "dimension", "USKluFVLGF");
        setField(term55780, term55780.getClass(), "type", term55781);
        setField(term55780, term55780.getClass(), "comment", "wwVaOdVQEn");
        setField(term55780, term55780.getClass(), "tag", term55833);
        setField(term55780, term55780.getClass(), "constant", "TtsrbRRDsO");
        setField(term55780, term55780.getClass(), "annotation", term55855);
        setField(term55780, term55780.getClass(), "name", "eynbEBrWWB");
        setField(term55780, term55780.getClass(), "qualified", "TiqrELzyOQ");
        setField(term55780, term55780.getClass(), "scope", "aNiaixjJtJ");
        setField(term55780, term55780.getClass(), "_volatile", term55895);
        setField(term55780, term55780.getClass(), "_transient", term55897);
        setField(term55780, term55780.getClass(), "_static", term55899);
        setField(term55780, term55780.getClass(), "_final", term55901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConstant", argTypes, term55780, args);
    }

};


