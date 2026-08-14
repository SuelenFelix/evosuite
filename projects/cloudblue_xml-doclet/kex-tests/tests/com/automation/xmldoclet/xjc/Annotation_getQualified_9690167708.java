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

public class Annotation_getQualified_9690167708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43643;

    public Annotation_getQualified_9690167708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43658 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43658, term43658.getClass(), "name", "");
        setField(term43658, term43658.getClass(), "text", "");
        Object term43661 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43661, term43661.getClass(), "name", "");
        setField(term43661, term43661.getClass(), "text", "");
        Object term43664 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43664, term43664.getClass(), "name", "");
        setField(term43664, term43664.getClass(), "text", "");
        Object term43667 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43667, term43667.getClass(), "name", "");
        setField(term43667, term43667.getClass(), "text", "");
        Object term43670 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43670, term43670.getClass(), "name", "");
        setField(term43670, term43670.getClass(), "text", "");
        Object term43673 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43673, term43673.getClass(), "name", "");
        setField(term43673, term43673.getClass(), "text", "");
        Object term43676 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43676, term43676.getClass(), "name", "");
        setField(term43676, term43676.getClass(), "text", "");
        ArrayList term43656 = new ArrayList();
        ((ArrayList) term43656).add(term43658);
        ((ArrayList) term43656).add(term43661);
        ((ArrayList) term43656).add(term43664);
        ((ArrayList) term43656).add(term43667);
        ((ArrayList) term43656).add(term43670);
        ((ArrayList) term43656).add(term43673);
        ((ArrayList) term43656).add(term43676);
        Object term43683 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43684 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43684, term43684.getClass(), "wildcard", null);
        setField(term43684, term43684.getClass(), "generic", null);
        setField(term43684, term43684.getClass(), "qualified", null);
        setField(term43684, term43684.getClass(), "dimension", null);
        setField(term43683, term43683.getClass(), "type", term43684);
        setField(term43683, term43683.getClass(), "name", "");
        setField(term43683, term43683.getClass(), "qualified", "");
        setField(term43683, term43683.getClass(), "_default", "");
        Object term43688 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43689 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43689, term43689.getClass(), "wildcard", null);
        setField(term43689, term43689.getClass(), "generic", null);
        setField(term43689, term43689.getClass(), "qualified", null);
        setField(term43689, term43689.getClass(), "dimension", null);
        setField(term43688, term43688.getClass(), "type", term43689);
        setField(term43688, term43688.getClass(), "name", "");
        setField(term43688, term43688.getClass(), "qualified", "");
        setField(term43688, term43688.getClass(), "_default", "");
        Object term43693 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43694 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43694, term43694.getClass(), "wildcard", null);
        setField(term43694, term43694.getClass(), "generic", null);
        setField(term43694, term43694.getClass(), "qualified", null);
        setField(term43694, term43694.getClass(), "dimension", null);
        setField(term43693, term43693.getClass(), "type", term43694);
        setField(term43693, term43693.getClass(), "name", "");
        setField(term43693, term43693.getClass(), "qualified", "");
        setField(term43693, term43693.getClass(), "_default", "");
        Object term43698 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43699 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43699, term43699.getClass(), "wildcard", null);
        setField(term43699, term43699.getClass(), "generic", null);
        setField(term43699, term43699.getClass(), "qualified", null);
        setField(term43699, term43699.getClass(), "dimension", null);
        setField(term43698, term43698.getClass(), "type", term43699);
        setField(term43698, term43698.getClass(), "name", "");
        setField(term43698, term43698.getClass(), "qualified", "");
        setField(term43698, term43698.getClass(), "_default", "");
        Object term43703 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43704 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43704, term43704.getClass(), "wildcard", null);
        setField(term43704, term43704.getClass(), "generic", null);
        setField(term43704, term43704.getClass(), "qualified", null);
        setField(term43704, term43704.getClass(), "dimension", null);
        setField(term43703, term43703.getClass(), "type", term43704);
        setField(term43703, term43703.getClass(), "name", "");
        setField(term43703, term43703.getClass(), "qualified", "");
        setField(term43703, term43703.getClass(), "_default", "");
        Object term43708 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43709 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43709, term43709.getClass(), "wildcard", null);
        setField(term43709, term43709.getClass(), "generic", null);
        setField(term43709, term43709.getClass(), "qualified", null);
        setField(term43709, term43709.getClass(), "dimension", null);
        setField(term43708, term43708.getClass(), "type", term43709);
        setField(term43708, term43708.getClass(), "name", "");
        setField(term43708, term43708.getClass(), "qualified", "");
        setField(term43708, term43708.getClass(), "_default", "");
        ArrayList term43681 = new ArrayList();
        ((ArrayList) term43681).add(term43683);
        ((ArrayList) term43681).add(term43688);
        ((ArrayList) term43681).add(term43693);
        ((ArrayList) term43681).add(term43698);
        ((ArrayList) term43681).add(term43703);
        ((ArrayList) term43681).add(term43708);
        ArrayList term43718 = new ArrayList();
        ((ArrayList) term43718).add((Object)null);
        ((ArrayList) term43718).add((Object)null);
        ((ArrayList) term43718).add((Object)null);
        ((ArrayList) term43718).add((Object)null);
        ((ArrayList) term43718).add((Object)null);
        ((ArrayList) term43718).add((Object)null);
        ((ArrayList) term43718).add((Object)null);
        ((ArrayList) term43718).add((Object)null);
        Object term43717 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43717, term43717.getClass(), "argument", term43718);
        setField(term43717, term43717.getClass(), "name", "");
        setField(term43717, term43717.getClass(), "qualified", "");
        ArrayList term43724 = new ArrayList();
        ((ArrayList) term43724).add((Object)null);
        ((ArrayList) term43724).add((Object)null);
        ((ArrayList) term43724).add((Object)null);
        ((ArrayList) term43724).add((Object)null);
        ((ArrayList) term43724).add((Object)null);
        ((ArrayList) term43724).add((Object)null);
        ((ArrayList) term43724).add((Object)null);
        Object term43723 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43723, term43723.getClass(), "argument", term43724);
        setField(term43723, term43723.getClass(), "name", "");
        setField(term43723, term43723.getClass(), "qualified", "");
        ArrayList term43730 = new ArrayList();
        ((ArrayList) term43730).add((Object)null);
        ((ArrayList) term43730).add((Object)null);
        ((ArrayList) term43730).add((Object)null);
        ((ArrayList) term43730).add((Object)null);
        ((ArrayList) term43730).add((Object)null);
        ((ArrayList) term43730).add((Object)null);
        ((ArrayList) term43730).add((Object)null);
        Object term43729 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43729, term43729.getClass(), "argument", term43730);
        setField(term43729, term43729.getClass(), "name", "");
        setField(term43729, term43729.getClass(), "qualified", "");
        ArrayList term43736 = new ArrayList();
        Object term43735 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43735, term43735.getClass(), "argument", term43736);
        setField(term43735, term43735.getClass(), "name", "");
        setField(term43735, term43735.getClass(), "qualified", "");
        ArrayList term43715 = new ArrayList();
        ((ArrayList) term43715).add(term43717);
        ((ArrayList) term43715).add(term43723);
        ((ArrayList) term43715).add(term43723);
        ((ArrayList) term43715).add(term43717);
        ((ArrayList) term43715).add(term43729);
        ((ArrayList) term43715).add(term43735);
        Boolean term43779 = new Boolean(true);
        term43643 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term43643, term43643.getClass(), "comment", "RHWLEqitql");
        setField(term43643, term43643.getClass(), "tag", term43656);
        setField(term43643, term43643.getClass(), "element", term43681);
        setField(term43643, term43643.getClass(), "annotation", term43715);
        setField(term43643, term43643.getClass(), "name", "tvYZYTHbds");
        setField(term43643, term43643.getClass(), "qualified", "DVmBwHcdHm");
        setField(term43643, term43643.getClass(), "scope", "cBGYXhehzr");
        setField(term43643, term43643.getClass(), "included", term43779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQualified", argTypes, term43643, args);
    }

};


