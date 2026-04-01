package org.graph4j.support;

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
import static org.graph4j.support.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BipartiteGraphSupport_BFSBipartiteVisitor_crossEdge_6225871802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156135;
     Object term156136;
     Object term156161;

    public BipartiteGraphSupport_BFSBipartiteVisitor_crossEdge_6225871802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156135 = newInstance(Class.forName("org.graph4j.support.BipartiteGraphSupport$BFSBipartiteVisitor"));
        setField(term156135, term156135.getClass(), "this$0", null);
        term156136 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156141 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156146 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156151 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156156 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term156136, term156136.getClass(), "component", 1100455295);
        setIntField(term156136, term156136.getClass(), "vertex", -132594423);
        setIntField(term156136, term156136.getClass(), "level", -1840942989);
        setIntField(term156136, term156136.getClass(), "order", 454359791);
        setIntField(term156141, term156141.getClass(), "component", -1910186746);
        setIntField(term156141, term156141.getClass(), "vertex", 819309245);
        setIntField(term156141, term156141.getClass(), "level", 738674183);
        setIntField(term156141, term156141.getClass(), "order", -1232491822);
        setIntField(term156146, term156146.getClass(), "component", -1765362170);
        setIntField(term156146, term156146.getClass(), "vertex", -561878947);
        setIntField(term156146, term156146.getClass(), "level", 927274599);
        setIntField(term156146, term156146.getClass(), "order", 692360705);
        setIntField(term156151, term156151.getClass(), "component", -2051243960);
        setIntField(term156151, term156151.getClass(), "vertex", -1006723448);
        setIntField(term156151, term156151.getClass(), "level", 1756712473);
        setIntField(term156151, term156151.getClass(), "order", 977558608);
        setIntField(term156156, term156156.getClass(), "component", 2145350429);
        setIntField(term156156, term156156.getClass(), "vertex", 1371780999);
        setIntField(term156156, term156156.getClass(), "level", 2017347122);
        setIntField(term156156, term156156.getClass(), "order", -2030833535);
        setField(term156156, term156156.getClass(), "parent", null);
        setField(term156151, term156151.getClass(), "parent", term156156);
        setField(term156146, term156146.getClass(), "parent", term156151);
        setField(term156141, term156141.getClass(), "parent", term156146);
        setField(term156136, term156136.getClass(), "parent", term156141);
        term156161 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156166 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156171 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156176 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term156181 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term156161, term156161.getClass(), "component", 439697904);
        setIntField(term156161, term156161.getClass(), "vertex", 8601453);
        setIntField(term156161, term156161.getClass(), "level", -837111711);
        setIntField(term156161, term156161.getClass(), "order", 617318389);
        setIntField(term156166, term156166.getClass(), "component", -1447537091);
        setIntField(term156166, term156166.getClass(), "vertex", -688463445);
        setIntField(term156166, term156166.getClass(), "level", -599297853);
        setIntField(term156166, term156166.getClass(), "order", -731570224);
        setIntField(term156171, term156171.getClass(), "component", 483982822);
        setIntField(term156171, term156171.getClass(), "vertex", 431893171);
        setIntField(term156171, term156171.getClass(), "level", -1268740382);
        setIntField(term156171, term156171.getClass(), "order", -1000571507);
        setIntField(term156176, term156176.getClass(), "component", -379942329);
        setIntField(term156176, term156176.getClass(), "vertex", -483287674);
        setIntField(term156176, term156176.getClass(), "level", -991064744);
        setIntField(term156176, term156176.getClass(), "order", 323805077);
        setIntField(term156181, term156181.getClass(), "component", -1339743508);
        setIntField(term156181, term156181.getClass(), "vertex", -1830192044);
        setIntField(term156181, term156181.getClass(), "level", 1967625787);
        setIntField(term156181, term156181.getClass(), "order", 401005574);
        setField(term156181, term156181.getClass(), "parent", null);
        setField(term156176, term156176.getClass(), "parent", term156181);
        setField(term156171, term156171.getClass(), "parent", term156176);
        setField(term156166, term156166.getClass(), "parent", term156171);
        setField(term156161, term156161.getClass(), "parent", term156166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.BipartiteGraphSupport$BFSBipartiteVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term156136;
        args[1] = term156161;
        callMethod(klass, "crossEdge", argTypes, term156135, args);
    }

};


