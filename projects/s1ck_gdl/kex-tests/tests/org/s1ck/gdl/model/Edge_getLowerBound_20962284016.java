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

public class Edge_getLowerBound_20962284016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614;

    public Edge_getLowerBound_20962284016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term615 = new Long(5127676408959197577L);
        Long term617 = new Long(-6573104506744284592L);
        HashMap term622 = new HashMap();
        Set<Object> term722 =  ((Map) term622).keySet();
        HashSet term621 = new HashSet((Collection<? extends Object>) term722);
        Long term627 = new Long(-4920224193275732920L);
        ArrayList term629 = new ArrayList();
        ((ArrayList) term629).add("xOEqzGAmDU");
        ((ArrayList) term629).add("eZFUvlxvGV");
        ((ArrayList) term629).add("BYqFIqCKAV");
        ((ArrayList) term629).add("vrQLuWIDJX");
        ((ArrayList) term629).add("flxyYxBRtu");
        ((ArrayList) term629).add("OclPbYPkcH");
        HashMap term705 = new HashMap();
        term614 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term614, term614.getClass(), "sourceVertexId", term615);
        setField(term614, term614.getClass(), "targetVertexId", term617);
        setIntField(term614, term614.getClass(), "lowerBound", 1);
        setIntField(term614, term614.getClass(), "upperBound", 1);
        setField(term614, term614.getClass(), "graphs", term621);
        setField(term614, term614.getClass(), "id", term627);
        setField(term614, term614.getClass(), "labels", term629);
        setField(term614, term614.getClass(), "properties", term705);
        setField(term614, term614.getClass(), "variable", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLowerBound", argTypes, term614, args);
    }

};


