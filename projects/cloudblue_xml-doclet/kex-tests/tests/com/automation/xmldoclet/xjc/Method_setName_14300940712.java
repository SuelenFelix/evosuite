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

public class Method_setName_14300940712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47604;

    public Method_setName_14300940712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47619 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47619, term47619.getClass(), "name", "");
        setField(term47619, term47619.getClass(), "text", "");
        Object term47622 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47622, term47622.getClass(), "name", "");
        setField(term47622, term47622.getClass(), "text", "");
        Object term47625 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47625, term47625.getClass(), "name", "");
        setField(term47625, term47625.getClass(), "text", "");
        Object term47628 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47628, term47628.getClass(), "name", "");
        setField(term47628, term47628.getClass(), "text", "");
        Object term47631 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47631, term47631.getClass(), "name", "");
        setField(term47631, term47631.getClass(), "text", "");
        Object term47634 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term47634, term47634.getClass(), "name", "");
        setField(term47634, term47634.getClass(), "text", "");
        ArrayList term47617 = new ArrayList();
        ((ArrayList) term47617).add(term47619);
        ((ArrayList) term47617).add(term47622);
        ((ArrayList) term47617).add(term47625);
        ((ArrayList) term47617).add(term47628);
        ((ArrayList) term47617).add(term47631);
        ((ArrayList) term47617).add(term47634);
        ArrayList term47643 = new ArrayList();
        ((ArrayList) term47643).add((Object)null);
        ((ArrayList) term47643).add((Object)null);
        ((ArrayList) term47643).add((Object)null);
        ((ArrayList) term47643).add((Object)null);
        ((ArrayList) term47643).add((Object)null);
        ((ArrayList) term47643).add((Object)null);
        ((ArrayList) term47643).add((Object)null);
        ((ArrayList) term47643).add((Object)null);
        Object term47641 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term47642 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47642, term47642.getClass(), "wildcard", null);
        setField(term47642, term47642.getClass(), "generic", null);
        setField(term47642, term47642.getClass(), "qualified", null);
        setField(term47642, term47642.getClass(), "dimension", null);
        setField(term47641, term47641.getClass(), "type", term47642);
        setField(term47641, term47641.getClass(), "annotation", term47643);
        setField(term47641, term47641.getClass(), "name", "");
        ArrayList term47649 = new ArrayList();
        ((ArrayList) term47649).add((Object)null);
        ((ArrayList) term47649).add((Object)null);
        ((ArrayList) term47649).add((Object)null);
        ((ArrayList) term47649).add((Object)null);
        ((ArrayList) term47649).add((Object)null);
        ((ArrayList) term47649).add((Object)null);
        ((ArrayList) term47649).add((Object)null);
        Object term47647 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term47648 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47648, term47648.getClass(), "wildcard", null);
        setField(term47648, term47648.getClass(), "generic", null);
        setField(term47648, term47648.getClass(), "qualified", null);
        setField(term47648, term47648.getClass(), "dimension", null);
        setField(term47647, term47647.getClass(), "type", term47648);
        setField(term47647, term47647.getClass(), "annotation", term47649);
        setField(term47647, term47647.getClass(), "name", "");
        ArrayList term47655 = new ArrayList();
        ((ArrayList) term47655).add((Object)null);
        ((ArrayList) term47655).add((Object)null);
        ((ArrayList) term47655).add((Object)null);
        ((ArrayList) term47655).add((Object)null);
        ((ArrayList) term47655).add((Object)null);
        ((ArrayList) term47655).add((Object)null);
        ((ArrayList) term47655).add((Object)null);
        ((ArrayList) term47655).add((Object)null);
        Object term47653 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term47654 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47654, term47654.getClass(), "wildcard", null);
        setField(term47654, term47654.getClass(), "generic", null);
        setField(term47654, term47654.getClass(), "qualified", null);
        setField(term47654, term47654.getClass(), "dimension", null);
        setField(term47653, term47653.getClass(), "type", term47654);
        setField(term47653, term47653.getClass(), "annotation", term47655);
        setField(term47653, term47653.getClass(), "name", "");
        ArrayList term47639 = new ArrayList();
        ((ArrayList) term47639).add(term47641);
        ((ArrayList) term47639).add(term47647);
        ((ArrayList) term47639).add(term47653);
        Object term47663 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47663, term47663.getClass(), "wildcard", null);
        setField(term47663, term47663.getClass(), "generic", null);
        setField(term47663, term47663.getClass(), "qualified", null);
        setField(term47663, term47663.getClass(), "dimension", null);
        Object term47664 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47664, term47664.getClass(), "wildcard", null);
        setField(term47664, term47664.getClass(), "generic", null);
        setField(term47664, term47664.getClass(), "qualified", null);
        setField(term47664, term47664.getClass(), "dimension", null);
        Object term47665 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term47665, term47665.getClass(), "wildcard", null);
        setField(term47665, term47665.getClass(), "generic", null);
        setField(term47665, term47665.getClass(), "qualified", null);
        setField(term47665, term47665.getClass(), "dimension", null);
        ArrayList term47661 = new ArrayList();
        ((ArrayList) term47661).add(term47663);
        ((ArrayList) term47661).add(term47654);
        ((ArrayList) term47661).add(term47664);
        ((ArrayList) term47661).add(term47648);
        ((ArrayList) term47661).add(term47665);
        ArrayList term47671 = new ArrayList();
        Object term47670 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term47670, term47670.getClass(), "argument", term47671);
        setField(term47670, term47670.getClass(), "name", "");
        setField(term47670, term47670.getClass(), "qualified", "");
        Object term47676 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term47676, term47676.getClass(), "argument", null);
        setField(term47676, term47676.getClass(), "name", null);
        setField(term47676, term47676.getClass(), "qualified", null);
        Object term47677 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term47677, term47677.getClass(), "argument", null);
        setField(term47677, term47677.getClass(), "name", null);
        setField(term47677, term47677.getClass(), "qualified", null);
        Object term47678 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term47678, term47678.getClass(), "argument", null);
        setField(term47678, term47678.getClass(), "name", null);
        setField(term47678, term47678.getClass(), "qualified", null);
        ArrayList term47668 = new ArrayList();
        ((ArrayList) term47668).add(term47670);
        ((ArrayList) term47668).add(term47676);
        ((ArrayList) term47668).add(term47677);
        ((ArrayList) term47668).add(term47678);
        ((ArrayList) term47668).add(term47676);
        Boolean term47729 = new Boolean(false);
        Boolean term47731 = new Boolean(false);
        Boolean term47733 = new Boolean(false);
        Boolean term47735 = new Boolean(false);
        Boolean term47737 = new Boolean(false);
        Boolean term47739 = new Boolean(true);
        Boolean term47741 = new Boolean(true);
        term47604 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term47604, term47604.getClass(), "comment", "sMeNxUqYxA");
        setField(term47604, term47604.getClass(), "tag", term47617);
        setField(term47604, term47604.getClass(), "parameter", term47639);
        setField(term47604, term47604.getClass(), "_return", term47642);
        setField(term47604, term47604.getClass(), "exception", term47661);
        setField(term47604, term47604.getClass(), "annotation", term47668);
        setField(term47604, term47604.getClass(), "name", "aMpEumYaTn");
        setField(term47604, term47604.getClass(), "signature", "LSKcUuiFai");
        setField(term47604, term47604.getClass(), "qualified", "fDoMKPKJZC");
        setField(term47604, term47604.getClass(), "scope", "wIZgRCewck");
        setField(term47604, term47604.getClass(), "_abstract", term47729);
        setField(term47604, term47604.getClass(), "_final", term47731);
        setField(term47604, term47604.getClass(), "included", term47733);
        setField(term47604, term47604.getClass(), "_native", term47735);
        setField(term47604, term47604.getClass(), "_synchronized", term47737);
        setField(term47604, term47604.getClass(), "_static", term47739);
        setField(term47604, term47604.getClass(), "varArgs", term47741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SWdeigbHCn";
        callMethod(klass, "setName", argTypes, term47604, args);
    }

};


