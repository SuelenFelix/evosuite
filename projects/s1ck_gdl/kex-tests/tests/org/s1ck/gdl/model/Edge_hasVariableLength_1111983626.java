package org.s1ck.gdl.model;

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
import static org.s1ck.gdl.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class Edge_hasVariableLength_1111983626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604;

    public Edge_hasVariableLength_1111983626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term605 = new Long(-872011222785455006L);
        Long term607 = new Long(-316468845751588286L);
        HashMap term612 = new HashMap();
        Set<Object> term712 =  ((Map) term612).keySet();
        HashSet term611 = new HashSet((Collection<? extends Object>) term712);
        Long term617 = new Long(5127676408959197577L);
        ArrayList term619 = new ArrayList();
        ((ArrayList) term619).add("xOEqzGAmDU");
        ((ArrayList) term619).add("eZFUvlxvGV");
        ((ArrayList) term619).add("BYqFIqCKAV");
        ((ArrayList) term619).add("vrQLuWIDJX");
        ((ArrayList) term619).add("flxyYxBRtu");
        ((ArrayList) term619).add("OclPbYPkcH");
        HashMap term695 = new HashMap();
        term604 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term604, term604.getClass(), "sourceVertexId", term605);
        setField(term604, term604.getClass(), "targetVertexId", term607);
        setIntField(term604, term604.getClass(), "lowerBound", 1);
        setIntField(term604, term604.getClass(), "upperBound", 1);
        setField(term604, term604.getClass(), "graphs", term611);
        setField(term604, term604.getClass(), "id", term617);
        setField(term604, term604.getClass(), "labels", term619);
        setField(term604, term604.getClass(), "properties", term695);
        setField(term604, term604.getClass(), "variable", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasVariableLength", argTypes, term604, args);
    }

};


