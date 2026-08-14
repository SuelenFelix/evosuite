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

public class Field_isStatic_161618669429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58799;

    public Field_isStatic_161618669429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term58802 = new ArrayList();
        ((ArrayList) term58802).add((Object)null);
        ((ArrayList) term58802).add((Object)null);
        ArrayList term58806 = new ArrayList();
        ((ArrayList) term58806).add((Object)null);
        ((ArrayList) term58806).add((Object)null);
        ((ArrayList) term58806).add((Object)null);
        ((ArrayList) term58806).add((Object)null);
        ((ArrayList) term58806).add((Object)null);
        ((ArrayList) term58806).add((Object)null);
        Object term58812 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58812, term58812.getClass(), "wildcard", null);
        setField(term58812, term58812.getClass(), "generic", null);
        setField(term58812, term58812.getClass(), "qualified", null);
        setField(term58812, term58812.getClass(), "dimension", null);
        Object term58813 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58813, term58813.getClass(), "wildcard", null);
        setField(term58813, term58813.getClass(), "generic", null);
        setField(term58813, term58813.getClass(), "qualified", null);
        setField(term58813, term58813.getClass(), "dimension", null);
        Object term58814 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58814, term58814.getClass(), "wildcard", null);
        setField(term58814, term58814.getClass(), "generic", null);
        setField(term58814, term58814.getClass(), "qualified", null);
        setField(term58814, term58814.getClass(), "dimension", null);
        Object term58815 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58815, term58815.getClass(), "wildcard", null);
        setField(term58815, term58815.getClass(), "generic", null);
        setField(term58815, term58815.getClass(), "qualified", null);
        setField(term58815, term58815.getClass(), "dimension", null);
        Object term58816 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term58816, term58816.getClass(), "wildcard", null);
        setField(term58816, term58816.getClass(), "generic", null);
        setField(term58816, term58816.getClass(), "qualified", null);
        setField(term58816, term58816.getClass(), "dimension", null);
        ArrayList term58810 = new ArrayList();
        ((ArrayList) term58810).add(term58812);
        ((ArrayList) term58810).add(term58813);
        ((ArrayList) term58810).add(term58812);
        ((ArrayList) term58810).add(term58814);
        ((ArrayList) term58810).add(term58815);
        ((ArrayList) term58810).add(term58816);
        ((ArrayList) term58810).add(term58815);
        Object term58857 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58857, term58857.getClass(), "name", "");
        setField(term58857, term58857.getClass(), "text", "");
        Object term58860 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58860, term58860.getClass(), "name", "");
        setField(term58860, term58860.getClass(), "text", "");
        Object term58863 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58863, term58863.getClass(), "name", "");
        setField(term58863, term58863.getClass(), "text", "");
        Object term58866 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term58866, term58866.getClass(), "name", "");
        setField(term58866, term58866.getClass(), "text", "");
        ArrayList term58855 = new ArrayList();
        ((ArrayList) term58855).add(term58857);
        ((ArrayList) term58855).add(term58860);
        ((ArrayList) term58855).add(term58863);
        ((ArrayList) term58855).add(term58866);
        ArrayList term58886 = new ArrayList();
        ((ArrayList) term58886).add((Object)null);
        ((ArrayList) term58886).add((Object)null);
        ((ArrayList) term58886).add((Object)null);
        ((ArrayList) term58886).add((Object)null);
        ((ArrayList) term58886).add((Object)null);
        Object term58885 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58885, term58885.getClass(), "argument", term58886);
        setField(term58885, term58885.getClass(), "name", "");
        setField(term58885, term58885.getClass(), "qualified", "");
        ArrayList term58892 = new ArrayList();
        ((ArrayList) term58892).add((Object)null);
        ((ArrayList) term58892).add((Object)null);
        ((ArrayList) term58892).add((Object)null);
        ((ArrayList) term58892).add((Object)null);
        ((ArrayList) term58892).add((Object)null);
        ((ArrayList) term58892).add((Object)null);
        ((ArrayList) term58892).add((Object)null);
        Object term58891 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58891, term58891.getClass(), "argument", term58892);
        setField(term58891, term58891.getClass(), "name", "");
        setField(term58891, term58891.getClass(), "qualified", "");
        ArrayList term58898 = new ArrayList();
        ((ArrayList) term58898).add((Object)null);
        ((ArrayList) term58898).add((Object)null);
        ((ArrayList) term58898).add((Object)null);
        ((ArrayList) term58898).add((Object)null);
        ((ArrayList) term58898).add((Object)null);
        ((ArrayList) term58898).add((Object)null);
        ((ArrayList) term58898).add((Object)null);
        ((ArrayList) term58898).add((Object)null);
        ((ArrayList) term58898).add((Object)null);
        Object term58897 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58897, term58897.getClass(), "argument", term58898);
        setField(term58897, term58897.getClass(), "name", "");
        setField(term58897, term58897.getClass(), "qualified", "");
        ArrayList term58904 = new ArrayList();
        ((ArrayList) term58904).add((Object)null);
        ((ArrayList) term58904).add((Object)null);
        ((ArrayList) term58904).add((Object)null);
        ((ArrayList) term58904).add((Object)null);
        ((ArrayList) term58904).add((Object)null);
        ((ArrayList) term58904).add((Object)null);
        ((ArrayList) term58904).add((Object)null);
        Object term58903 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term58903, term58903.getClass(), "argument", term58904);
        setField(term58903, term58903.getClass(), "name", "");
        setField(term58903, term58903.getClass(), "qualified", "");
        ArrayList term58883 = new ArrayList();
        ((ArrayList) term58883).add(term58885);
        ((ArrayList) term58883).add(term58885);
        ((ArrayList) term58883).add(term58891);
        ((ArrayList) term58883).add(term58897);
        ((ArrayList) term58883).add(term58903);
        ((ArrayList) term58883).add(term58897);
        ((ArrayList) term58883).add(term58903);
        Boolean term58947 = new Boolean(true);
        Boolean term58949 = new Boolean(false);
        Boolean term58951 = new Boolean(false);
        Boolean term58953 = new Boolean(true);
        term58799 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term58800 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term58801 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term58801, term58801.getClass(), "extendsBound", term58802);
        setField(term58801, term58801.getClass(), "superBound", term58806);
        setField(term58800, term58800.getClass(), "wildcard", term58801);
        setField(term58800, term58800.getClass(), "generic", term58810);
        setField(term58800, term58800.getClass(), "qualified", "SOAWbJbEzg");
        setField(term58800, term58800.getClass(), "dimension", "tkeZEzguFX");
        setField(term58799, term58799.getClass(), "type", term58800);
        setField(term58799, term58799.getClass(), "comment", "ENcLKqInNp");
        setField(term58799, term58799.getClass(), "tag", term58855);
        setField(term58799, term58799.getClass(), "constant", "uXqlYjKAFD");
        setField(term58799, term58799.getClass(), "annotation", term58883);
        setField(term58799, term58799.getClass(), "name", "SVlhDVVbvf");
        setField(term58799, term58799.getClass(), "qualified", "ftDnyBWgXL");
        setField(term58799, term58799.getClass(), "scope", "ueasPFDvHz");
        setField(term58799, term58799.getClass(), "_volatile", term58947);
        setField(term58799, term58799.getClass(), "_transient", term58949);
        setField(term58799, term58799.getClass(), "_static", term58951);
        setField(term58799, term58799.getClass(), "_final", term58953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStatic", argTypes, term58799, args);
    }

};


