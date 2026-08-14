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

public class Method_setFinal_177325109527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49773;
     Object term49951;

    public Method_setFinal_177325109527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49788 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term49788, term49788.getClass(), "name", "");
        setField(term49788, term49788.getClass(), "text", "");
        Object term49791 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term49791, term49791.getClass(), "name", "");
        setField(term49791, term49791.getClass(), "text", "");
        Object term49794 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term49794, term49794.getClass(), "name", "");
        setField(term49794, term49794.getClass(), "text", "");
        Object term49797 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term49797, term49797.getClass(), "name", "");
        setField(term49797, term49797.getClass(), "text", "");
        ArrayList term49786 = new ArrayList();
        ((ArrayList) term49786).add(term49788);
        ((ArrayList) term49786).add(term49791);
        ((ArrayList) term49786).add(term49794);
        ((ArrayList) term49786).add(term49797);
        ArrayList term49802 = new ArrayList();
        ArrayList term49808 = new ArrayList();
        ((ArrayList) term49808).add((Object)null);
        ((ArrayList) term49808).add((Object)null);
        ((ArrayList) term49808).add((Object)null);
        ((ArrayList) term49808).add((Object)null);
        ((ArrayList) term49808).add((Object)null);
        ArrayList term49812 = new ArrayList();
        ((ArrayList) term49812).add((Object)null);
        ((ArrayList) term49812).add((Object)null);
        ((ArrayList) term49812).add((Object)null);
        ((ArrayList) term49812).add((Object)null);
        ((ArrayList) term49812).add((Object)null);
        ((ArrayList) term49812).add((Object)null);
        ((ArrayList) term49812).add((Object)null);
        ArrayList term49816 = new ArrayList();
        Object term49846 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term49846, term49846.getClass(), "wildcard", null);
        setField(term49846, term49846.getClass(), "generic", null);
        setField(term49846, term49846.getClass(), "qualified", null);
        setField(term49846, term49846.getClass(), "dimension", null);
        ArrayList term49844 = new ArrayList();
        ((ArrayList) term49844).add(term49846);
        ArrayList term49852 = new ArrayList();
        ((ArrayList) term49852).add((Object)null);
        Object term49851 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49851, term49851.getClass(), "argument", term49852);
        setField(term49851, term49851.getClass(), "name", "");
        setField(term49851, term49851.getClass(), "qualified", "");
        ArrayList term49858 = new ArrayList();
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        ((ArrayList) term49858).add((Object)null);
        Object term49857 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49857, term49857.getClass(), "argument", term49858);
        setField(term49857, term49857.getClass(), "name", "");
        setField(term49857, term49857.getClass(), "qualified", "");
        ArrayList term49864 = new ArrayList();
        ((ArrayList) term49864).add((Object)null);
        Object term49863 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49863, term49863.getClass(), "argument", term49864);
        setField(term49863, term49863.getClass(), "name", "");
        setField(term49863, term49863.getClass(), "qualified", "");
        ArrayList term49870 = new ArrayList();
        ((ArrayList) term49870).add((Object)null);
        ((ArrayList) term49870).add((Object)null);
        ((ArrayList) term49870).add((Object)null);
        ((ArrayList) term49870).add((Object)null);
        ((ArrayList) term49870).add((Object)null);
        ((ArrayList) term49870).add((Object)null);
        ((ArrayList) term49870).add((Object)null);
        ((ArrayList) term49870).add((Object)null);
        ((ArrayList) term49870).add((Object)null);
        Object term49869 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49869, term49869.getClass(), "argument", term49870);
        setField(term49869, term49869.getClass(), "name", "");
        setField(term49869, term49869.getClass(), "qualified", "");
        ArrayList term49876 = new ArrayList();
        ((ArrayList) term49876).add((Object)null);
        ((ArrayList) term49876).add((Object)null);
        ((ArrayList) term49876).add((Object)null);
        ((ArrayList) term49876).add((Object)null);
        ((ArrayList) term49876).add((Object)null);
        ((ArrayList) term49876).add((Object)null);
        ((ArrayList) term49876).add((Object)null);
        ((ArrayList) term49876).add((Object)null);
        Object term49875 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49875, term49875.getClass(), "argument", term49876);
        setField(term49875, term49875.getClass(), "name", "");
        setField(term49875, term49875.getClass(), "qualified", "");
        ArrayList term49882 = new ArrayList();
        ((ArrayList) term49882).add((Object)null);
        Object term49881 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term49881, term49881.getClass(), "argument", term49882);
        setField(term49881, term49881.getClass(), "name", "");
        setField(term49881, term49881.getClass(), "qualified", "");
        ArrayList term49849 = new ArrayList();
        ((ArrayList) term49849).add(term49851);
        ((ArrayList) term49849).add(term49857);
        ((ArrayList) term49849).add(term49863);
        ((ArrayList) term49849).add(term49869);
        ((ArrayList) term49849).add(term49875);
        ((ArrayList) term49849).add(term49881);
        Boolean term49937 = new Boolean(true);
        Boolean term49939 = new Boolean(false);
        Boolean term49941 = new Boolean(false);
        Boolean term49943 = new Boolean(false);
        Boolean term49945 = new Boolean(true);
        Boolean term49947 = new Boolean(true);
        Boolean term49949 = new Boolean(false);
        term49773 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        Object term49806 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term49807 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term49773, term49773.getClass(), "comment", "HyvmFAUmbf");
        setField(term49773, term49773.getClass(), "tag", term49786);
        setField(term49773, term49773.getClass(), "parameter", term49802);
        setField(term49807, term49807.getClass(), "extendsBound", term49808);
        setField(term49807, term49807.getClass(), "superBound", term49812);
        setField(term49806, term49806.getClass(), "wildcard", term49807);
        setField(term49806, term49806.getClass(), "generic", term49816);
        setField(term49806, term49806.getClass(), "qualified", "FwMzlNzHAM");
        setField(term49806, term49806.getClass(), "dimension", "CXSpCisENQ");
        setField(term49773, term49773.getClass(), "_return", term49806);
        setField(term49773, term49773.getClass(), "exception", term49844);
        setField(term49773, term49773.getClass(), "annotation", term49849);
        setField(term49773, term49773.getClass(), "name", "wqzkntpgIm");
        setField(term49773, term49773.getClass(), "signature", "HxfIYZhAyB");
        setField(term49773, term49773.getClass(), "qualified", "XHKjnsOHDU");
        setField(term49773, term49773.getClass(), "scope", "XsCWWlJnzy");
        setField(term49773, term49773.getClass(), "_abstract", term49937);
        setField(term49773, term49773.getClass(), "_final", term49939);
        setField(term49773, term49773.getClass(), "included", term49941);
        setField(term49773, term49773.getClass(), "_native", term49943);
        setField(term49773, term49773.getClass(), "_synchronized", term49945);
        setField(term49773, term49773.getClass(), "_static", term49947);
        setField(term49773, term49773.getClass(), "varArgs", term49949);
        term49951 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term49951;
        callMethod(klass, "setFinal", argTypes, term49773, args);
    }

};


