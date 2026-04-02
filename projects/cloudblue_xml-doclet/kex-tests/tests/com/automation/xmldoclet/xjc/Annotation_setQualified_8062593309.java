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

public class Annotation_setQualified_8062593309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43821;

    public Annotation_setQualified_8062593309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43836 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43836, term43836.getClass(), "name", "");
        setField(term43836, term43836.getClass(), "text", "");
        Object term43839 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43839, term43839.getClass(), "name", "");
        setField(term43839, term43839.getClass(), "text", "");
        ArrayList term43834 = new ArrayList();
        ((ArrayList) term43834).add(term43836);
        ((ArrayList) term43834).add(term43839);
        Object term43846 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43847 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43847, term43847.getClass(), "wildcard", null);
        setField(term43847, term43847.getClass(), "generic", null);
        setField(term43847, term43847.getClass(), "qualified", null);
        setField(term43847, term43847.getClass(), "dimension", null);
        setField(term43846, term43846.getClass(), "type", term43847);
        setField(term43846, term43846.getClass(), "name", "");
        setField(term43846, term43846.getClass(), "qualified", "");
        setField(term43846, term43846.getClass(), "_default", "");
        Object term43851 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43852 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43852, term43852.getClass(), "wildcard", null);
        setField(term43852, term43852.getClass(), "generic", null);
        setField(term43852, term43852.getClass(), "qualified", null);
        setField(term43852, term43852.getClass(), "dimension", null);
        setField(term43851, term43851.getClass(), "type", term43852);
        setField(term43851, term43851.getClass(), "name", "");
        setField(term43851, term43851.getClass(), "qualified", "");
        setField(term43851, term43851.getClass(), "_default", "");
        Object term43856 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43857 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43857, term43857.getClass(), "wildcard", null);
        setField(term43857, term43857.getClass(), "generic", null);
        setField(term43857, term43857.getClass(), "qualified", null);
        setField(term43857, term43857.getClass(), "dimension", null);
        setField(term43856, term43856.getClass(), "type", term43857);
        setField(term43856, term43856.getClass(), "name", "");
        setField(term43856, term43856.getClass(), "qualified", "");
        setField(term43856, term43856.getClass(), "_default", "");
        Object term43861 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43862 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43862, term43862.getClass(), "wildcard", null);
        setField(term43862, term43862.getClass(), "generic", null);
        setField(term43862, term43862.getClass(), "qualified", null);
        setField(term43862, term43862.getClass(), "dimension", null);
        setField(term43861, term43861.getClass(), "type", term43862);
        setField(term43861, term43861.getClass(), "name", "");
        setField(term43861, term43861.getClass(), "qualified", "");
        setField(term43861, term43861.getClass(), "_default", "");
        Object term43866 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43867 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43867, term43867.getClass(), "wildcard", null);
        setField(term43867, term43867.getClass(), "generic", null);
        setField(term43867, term43867.getClass(), "qualified", null);
        setField(term43867, term43867.getClass(), "dimension", null);
        setField(term43866, term43866.getClass(), "type", term43867);
        setField(term43866, term43866.getClass(), "name", "");
        setField(term43866, term43866.getClass(), "qualified", "");
        setField(term43866, term43866.getClass(), "_default", "");
        Object term43871 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43872 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43872, term43872.getClass(), "wildcard", null);
        setField(term43872, term43872.getClass(), "generic", null);
        setField(term43872, term43872.getClass(), "qualified", null);
        setField(term43872, term43872.getClass(), "dimension", null);
        setField(term43871, term43871.getClass(), "type", term43872);
        setField(term43871, term43871.getClass(), "name", "");
        setField(term43871, term43871.getClass(), "qualified", "");
        setField(term43871, term43871.getClass(), "_default", "");
        Object term43876 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43877 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43877, term43877.getClass(), "wildcard", null);
        setField(term43877, term43877.getClass(), "generic", null);
        setField(term43877, term43877.getClass(), "qualified", null);
        setField(term43877, term43877.getClass(), "dimension", null);
        setField(term43876, term43876.getClass(), "type", term43877);
        setField(term43876, term43876.getClass(), "name", "");
        setField(term43876, term43876.getClass(), "qualified", "");
        setField(term43876, term43876.getClass(), "_default", "");
        Object term43881 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        setField(term43881, term43881.getClass(), "type", term43872);
        setField(term43881, term43881.getClass(), "name", "");
        setField(term43881, term43881.getClass(), "qualified", "");
        setField(term43881, term43881.getClass(), "_default", "");
        Object term43885 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43886 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43886, term43886.getClass(), "wildcard", null);
        setField(term43886, term43886.getClass(), "generic", null);
        setField(term43886, term43886.getClass(), "qualified", null);
        setField(term43886, term43886.getClass(), "dimension", null);
        setField(term43885, term43885.getClass(), "type", term43886);
        setField(term43885, term43885.getClass(), "name", "");
        setField(term43885, term43885.getClass(), "qualified", "");
        setField(term43885, term43885.getClass(), "_default", "");
        ArrayList term43844 = new ArrayList();
        ((ArrayList) term43844).add(term43846);
        ((ArrayList) term43844).add(term43851);
        ((ArrayList) term43844).add(term43856);
        ((ArrayList) term43844).add(term43861);
        ((ArrayList) term43844).add(term43866);
        ((ArrayList) term43844).add(term43871);
        ((ArrayList) term43844).add(term43876);
        ((ArrayList) term43844).add(term43881);
        ((ArrayList) term43844).add(term43885);
        ArrayList term43895 = new ArrayList();
        ((ArrayList) term43895).add((Object)null);
        ((ArrayList) term43895).add((Object)null);
        ((ArrayList) term43895).add((Object)null);
        ((ArrayList) term43895).add((Object)null);
        ((ArrayList) term43895).add((Object)null);
        ((ArrayList) term43895).add((Object)null);
        ((ArrayList) term43895).add((Object)null);
        Object term43894 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43894, term43894.getClass(), "argument", term43895);
        setField(term43894, term43894.getClass(), "name", "");
        setField(term43894, term43894.getClass(), "qualified", "");
        ArrayList term43901 = new ArrayList();
        ((ArrayList) term43901).add((Object)null);
        ((ArrayList) term43901).add((Object)null);
        ((ArrayList) term43901).add((Object)null);
        ((ArrayList) term43901).add((Object)null);
        ((ArrayList) term43901).add((Object)null);
        Object term43900 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43900, term43900.getClass(), "argument", term43901);
        setField(term43900, term43900.getClass(), "name", "");
        setField(term43900, term43900.getClass(), "qualified", "");
        ArrayList term43907 = new ArrayList();
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        Object term43906 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43906, term43906.getClass(), "argument", term43907);
        setField(term43906, term43906.getClass(), "name", "");
        setField(term43906, term43906.getClass(), "qualified", "");
        ArrayList term43892 = new ArrayList();
        ((ArrayList) term43892).add(term43894);
        ((ArrayList) term43892).add(term43900);
        ((ArrayList) term43892).add(term43906);
        Boolean term43950 = new Boolean(false);
        term43821 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term43821, term43821.getClass(), "comment", "glkgsgHOAq");
        setField(term43821, term43821.getClass(), "tag", term43834);
        setField(term43821, term43821.getClass(), "element", term43844);
        setField(term43821, term43821.getClass(), "annotation", term43892);
        setField(term43821, term43821.getClass(), "name", "HKeSGNcwws");
        setField(term43821, term43821.getClass(), "qualified", "ICRQUprMha");
        setField(term43821, term43821.getClass(), "scope", "UPGMEnCagP");
        setField(term43821, term43821.getClass(), "included", term43950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lyrqFsdTgV";
        callMethod(klass, "setQualified", argTypes, term43821, args);
    }

};


