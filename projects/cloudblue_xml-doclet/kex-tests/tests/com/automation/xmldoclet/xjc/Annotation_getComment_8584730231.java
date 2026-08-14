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

public class Annotation_getComment_8584730231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42591;

    public Annotation_getComment_8584730231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42606 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42606, term42606.getClass(), "name", "");
        setField(term42606, term42606.getClass(), "text", "");
        Object term42609 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42609, term42609.getClass(), "name", "");
        setField(term42609, term42609.getClass(), "text", "");
        Object term42612 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42612, term42612.getClass(), "name", "");
        setField(term42612, term42612.getClass(), "text", "");
        Object term42615 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42615, term42615.getClass(), "name", "");
        setField(term42615, term42615.getClass(), "text", "");
        Object term42618 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42618, term42618.getClass(), "name", "");
        setField(term42618, term42618.getClass(), "text", "");
        Object term42621 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42621, term42621.getClass(), "name", "");
        setField(term42621, term42621.getClass(), "text", "");
        Object term42624 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42624, term42624.getClass(), "name", "");
        setField(term42624, term42624.getClass(), "text", "");
        Object term42627 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42627, term42627.getClass(), "name", "");
        setField(term42627, term42627.getClass(), "text", "");
        ArrayList term42604 = new ArrayList();
        ((ArrayList) term42604).add(term42606);
        ((ArrayList) term42604).add(term42609);
        ((ArrayList) term42604).add(term42612);
        ((ArrayList) term42604).add(term42615);
        ((ArrayList) term42604).add(term42618);
        ((ArrayList) term42604).add(term42621);
        ((ArrayList) term42604).add(term42624);
        ((ArrayList) term42604).add(term42627);
        Object term42634 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term42635 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term42635, term42635.getClass(), "wildcard", null);
        setField(term42635, term42635.getClass(), "generic", null);
        setField(term42635, term42635.getClass(), "qualified", null);
        setField(term42635, term42635.getClass(), "dimension", null);
        setField(term42634, term42634.getClass(), "type", term42635);
        setField(term42634, term42634.getClass(), "name", "");
        setField(term42634, term42634.getClass(), "qualified", "");
        setField(term42634, term42634.getClass(), "_default", "");
        Object term42639 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term42640 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term42640, term42640.getClass(), "wildcard", null);
        setField(term42640, term42640.getClass(), "generic", null);
        setField(term42640, term42640.getClass(), "qualified", null);
        setField(term42640, term42640.getClass(), "dimension", null);
        setField(term42639, term42639.getClass(), "type", term42640);
        setField(term42639, term42639.getClass(), "name", "");
        setField(term42639, term42639.getClass(), "qualified", "");
        setField(term42639, term42639.getClass(), "_default", "");
        Object term42644 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        setField(term42644, term42644.getClass(), "type", term42635);
        setField(term42644, term42644.getClass(), "name", "");
        setField(term42644, term42644.getClass(), "qualified", "");
        setField(term42644, term42644.getClass(), "_default", "");
        Object term42648 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term42649 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term42649, term42649.getClass(), "wildcard", null);
        setField(term42649, term42649.getClass(), "generic", null);
        setField(term42649, term42649.getClass(), "qualified", null);
        setField(term42649, term42649.getClass(), "dimension", null);
        setField(term42648, term42648.getClass(), "type", term42649);
        setField(term42648, term42648.getClass(), "name", "");
        setField(term42648, term42648.getClass(), "qualified", "");
        setField(term42648, term42648.getClass(), "_default", "");
        Object term42653 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term42654 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term42654, term42654.getClass(), "wildcard", null);
        setField(term42654, term42654.getClass(), "generic", null);
        setField(term42654, term42654.getClass(), "qualified", null);
        setField(term42654, term42654.getClass(), "dimension", null);
        setField(term42653, term42653.getClass(), "type", term42654);
        setField(term42653, term42653.getClass(), "name", "");
        setField(term42653, term42653.getClass(), "qualified", "");
        setField(term42653, term42653.getClass(), "_default", "");
        Object term42658 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term42659 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term42659, term42659.getClass(), "wildcard", null);
        setField(term42659, term42659.getClass(), "generic", null);
        setField(term42659, term42659.getClass(), "qualified", null);
        setField(term42659, term42659.getClass(), "dimension", null);
        setField(term42658, term42658.getClass(), "type", term42659);
        setField(term42658, term42658.getClass(), "name", "");
        setField(term42658, term42658.getClass(), "qualified", "");
        setField(term42658, term42658.getClass(), "_default", "");
        Object term42663 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        setField(term42663, term42663.getClass(), "type", term42654);
        setField(term42663, term42663.getClass(), "name", "");
        setField(term42663, term42663.getClass(), "qualified", "");
        setField(term42663, term42663.getClass(), "_default", "");
        Object term42667 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        setField(term42667, term42667.getClass(), "type", term42654);
        setField(term42667, term42667.getClass(), "name", "");
        setField(term42667, term42667.getClass(), "qualified", "");
        setField(term42667, term42667.getClass(), "_default", "");
        ArrayList term42632 = new ArrayList();
        ((ArrayList) term42632).add(term42634);
        ((ArrayList) term42632).add(term42639);
        ((ArrayList) term42632).add(term42644);
        ((ArrayList) term42632).add(term42648);
        ((ArrayList) term42632).add(term42653);
        ((ArrayList) term42632).add(term42658);
        ((ArrayList) term42632).add(term42663);
        ((ArrayList) term42632).add(term42667);
        ArrayList term42673 = new ArrayList();
        Boolean term42713 = new Boolean(true);
        term42591 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term42591, term42591.getClass(), "comment", "tCtbghmxDD");
        setField(term42591, term42591.getClass(), "tag", term42604);
        setField(term42591, term42591.getClass(), "element", term42632);
        setField(term42591, term42591.getClass(), "annotation", term42673);
        setField(term42591, term42591.getClass(), "name", "umddgEOWtX");
        setField(term42591, term42591.getClass(), "qualified", "udBKZLMvWb");
        setField(term42591, term42591.getClass(), "scope", "QkjteoXNAt");
        setField(term42591, term42591.getClass(), "included", term42713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComment", argTypes, term42591, args);
    }

};


