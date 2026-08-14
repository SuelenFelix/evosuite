package com.usantatecla.ustumlserver.domain.model.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Enum_getObjects_182575712911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73758;

    public Enum_getObjects_182575712911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term73759 = new ArrayList();
        ((ArrayList) term73759).add("IeromvfDmz");
        ((ArrayList) term73759).add("xJLHPTRSqe");
        ((ArrayList) term73759).add("OIFZYdbUZz");
        ArrayList term73799 = new ArrayList();
        ArrayList term73808 = new ArrayList();
        Object term73805 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73805, term73805.getClass(), "name", "");
        setField(term73805, term73805.getClass(), "type", "");
        setField(term73805, term73805.getClass(), "modifiers", term73808);
        ArrayList term73814 = new ArrayList();
        Object term73811 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73811, term73811.getClass(), "name", "");
        setField(term73811, term73811.getClass(), "type", "");
        setField(term73811, term73811.getClass(), "modifiers", term73814);
        ArrayList term73820 = new ArrayList();
        ((ArrayList) term73820).add((Object)null);
        ((ArrayList) term73820).add((Object)null);
        ((ArrayList) term73820).add((Object)null);
        ((ArrayList) term73820).add((Object)null);
        ((ArrayList) term73820).add((Object)null);
        ((ArrayList) term73820).add((Object)null);
        ((ArrayList) term73820).add((Object)null);
        Object term73817 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73817, term73817.getClass(), "name", "");
        setField(term73817, term73817.getClass(), "type", "");
        setField(term73817, term73817.getClass(), "modifiers", term73820);
        ArrayList term73826 = new ArrayList();
        ((ArrayList) term73826).add((Object)null);
        ((ArrayList) term73826).add((Object)null);
        ((ArrayList) term73826).add((Object)null);
        ((ArrayList) term73826).add((Object)null);
        ((ArrayList) term73826).add((Object)null);
        ((ArrayList) term73826).add((Object)null);
        Object term73823 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term73823, term73823.getClass(), "name", "");
        setField(term73823, term73823.getClass(), "type", "");
        setField(term73823, term73823.getClass(), "modifiers", term73826);
        ArrayList term73803 = new ArrayList();
        ((ArrayList) term73803).add(term73805);
        ((ArrayList) term73803).add(term73811);
        ((ArrayList) term73803).add(term73817);
        ((ArrayList) term73803).add(term73823);
        ArrayList term73834 = new ArrayList();
        ((ArrayList) term73834).add((Object)null);
        ((ArrayList) term73834).add((Object)null);
        ArrayList term73839 = new ArrayList();
        ((ArrayList) term73839).add((Object)null);
        Object term73833 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term73833, term73833.getClass(), "parameters", term73834);
        setField(term73833, term73833.getClass(), "name", "");
        setField(term73833, term73833.getClass(), "type", "");
        setField(term73833, term73833.getClass(), "modifiers", term73839);
        ArrayList term73843 = new ArrayList();
        ((ArrayList) term73843).add((Object)null);
        ((ArrayList) term73843).add((Object)null);
        ((ArrayList) term73843).add((Object)null);
        ((ArrayList) term73843).add((Object)null);
        ArrayList term73848 = new ArrayList();
        ((ArrayList) term73848).add((Object)null);
        ((ArrayList) term73848).add((Object)null);
        ((ArrayList) term73848).add((Object)null);
        ((ArrayList) term73848).add((Object)null);
        Object term73842 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term73842, term73842.getClass(), "parameters", term73843);
        setField(term73842, term73842.getClass(), "name", "");
        setField(term73842, term73842.getClass(), "type", "");
        setField(term73842, term73842.getClass(), "modifiers", term73848);
        ArrayList term73831 = new ArrayList();
        ((ArrayList) term73831).add(term73833);
        ((ArrayList) term73831).add(term73842);
        ArrayList term73877 = new ArrayList();
        ((ArrayList) term73877).add((Object)null);
        ((ArrayList) term73877).add((Object)null);
        ((ArrayList) term73877).add((Object)null);
        ((ArrayList) term73877).add((Object)null);
        term73758 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term73758, term73758.getClass(), "objects", term73759);
        setField(term73758, term73758.getClass(), "modifiers", term73799);
        setField(term73758, term73758.getClass(), "attributes", term73803);
        setField(term73758, term73758.getClass(), "methods", term73831);
        setField(term73758, term73758.getClass(), "id", "rvYqMRgiPA");
        setField(term73758, term73758.getClass(), "name", "qOZXeUUmdz");
        setField(term73758, term73758.getClass(), "relations", term73877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getObjects", argTypes, term73758, args);
    }

};


