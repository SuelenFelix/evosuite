package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class BacktrackColoringBase_Worker_init_14587659610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5879;
     Object term5881;

    public BacktrackColoringBase_Worker_init_14587659610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5879 = new Integer(2085098404);
        term5881 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term5884 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term5887 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term5890 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term5893 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term5899 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term5901 = (Object[]) newArray("org.graph4j.util.Domain", 6);
        Object term5902 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term5908 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term5910 = (Object[]) newArray("org.graph4j.util.Domain", 9);
        Object term5911 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term5914 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term5917 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term5920 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term5923 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term5926 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term5929 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term5935 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term5937 = (Object[]) newArray("org.graph4j.util.Domain", 4);
        Object term5938 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term5944 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term5946 = (Object[]) newArray("org.graph4j.util.Domain", 0);
        setField(term5881, term5881.getClass(), "alg", null);
        setIntField(term5881, term5881.getClass(), "vertex", -684064427);
        setIntField(term5881, term5881.getClass(), "color", -1981080836);
        setField(term5884, term5884.getClass(), "alg", null);
        setIntField(term5884, term5884.getClass(), "vertex", -176676344);
        setIntField(term5884, term5884.getClass(), "color", 1949009312);
        setField(term5887, term5887.getClass(), "alg", null);
        setIntField(term5887, term5887.getClass(), "vertex", -432054743);
        setIntField(term5887, term5887.getClass(), "color", -859726380);
        setField(term5890, term5890.getClass(), "alg", null);
        setIntField(term5890, term5890.getClass(), "vertex", -1498422654);
        setIntField(term5890, term5890.getClass(), "color", -1499829233);
        setField(term5893, term5893.getClass(), "alg", null);
        setIntField(term5893, term5893.getClass(), "vertex", -888855662);
        setIntField(term5893, term5893.getClass(), "color", -1483966656);
        setField(term5893, term5893.getClass(), "parent", null);
        setField(term5893, term5893.getClass(), "coloring", null);
        setField(term5893, term5893.getClass(), "domains", null);
        setField(term5893, term5893.getClass(), "minDomain", null);
        setBooleanField(term5893, term5893.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term5893, term5893.getClass(), "propagator", false);
        setBooleanField(term5893, term5893.getClass(), "failed", false);
        setField(term5890, term5890.getClass(), "parent", term5893);
        setField(term5899, term5899.getClass(), "graph", null);
        setField(term5899, term5899.getClass(), "vertexColor", null);
        setIntField(term5899, term5899.getClass(), "numColoredVertices", 0);
        setField(term5899, term5899.getClass(), "usedColors", null);
        setField(term5899, term5899.getClass(), "colorMap", null);
        setField(term5890, term5890.getClass(), "coloring", term5899);
        setField(term5890, term5890.getClass(), "domains", term5901);
        setIntField(term5902, term5902.getClass(), "vertex", 0);
        setField(term5902, term5902.getClass(), "values", null);
        setField(term5902, term5902.getClass(), "positions", null);
        setIntField(term5902, term5902.getClass(), "size", 0);
        setField(term5890, term5890.getClass(), "minDomain", term5902);
        setBooleanField(term5890, term5890.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term5890, term5890.getClass(), "propagator", false);
        setBooleanField(term5890, term5890.getClass(), "failed", false);
        setField(term5887, term5887.getClass(), "parent", term5890);
        setField(term5908, term5908.getClass(), "graph", null);
        setField(term5908, term5908.getClass(), "vertexColor", null);
        setIntField(term5908, term5908.getClass(), "numColoredVertices", 0);
        setField(term5908, term5908.getClass(), "usedColors", null);
        setField(term5908, term5908.getClass(), "colorMap", null);
        setField(term5887, term5887.getClass(), "coloring", term5908);
        setIntField(term5911, term5911.getClass(), "vertex", 0);
        setField(term5911, term5911.getClass(), "values", null);
        setField(term5911, term5911.getClass(), "positions", null);
        setIntField(term5911, term5911.getClass(), "size", 0);
        setElement(term5910, 0, term5911);
        setIntField(term5914, term5914.getClass(), "vertex", 0);
        setField(term5914, term5914.getClass(), "values", null);
        setField(term5914, term5914.getClass(), "positions", null);
        setIntField(term5914, term5914.getClass(), "size", 0);
        setElement(term5910, 1, term5914);
        setIntField(term5917, term5917.getClass(), "vertex", 0);
        setField(term5917, term5917.getClass(), "values", null);
        setField(term5917, term5917.getClass(), "positions", null);
        setIntField(term5917, term5917.getClass(), "size", 0);
        setElement(term5910, 2, term5917);
        setIntField(term5920, term5920.getClass(), "vertex", 0);
        setField(term5920, term5920.getClass(), "values", null);
        setField(term5920, term5920.getClass(), "positions", null);
        setIntField(term5920, term5920.getClass(), "size", 0);
        setElement(term5910, 3, term5920);
        setElement(term5910, 4, term5920);
        setIntField(term5923, term5923.getClass(), "vertex", 0);
        setField(term5923, term5923.getClass(), "values", null);
        setField(term5923, term5923.getClass(), "positions", null);
        setIntField(term5923, term5923.getClass(), "size", 0);
        setElement(term5910, 5, term5923);
        setIntField(term5926, term5926.getClass(), "vertex", 0);
        setField(term5926, term5926.getClass(), "values", null);
        setField(term5926, term5926.getClass(), "positions", null);
        setIntField(term5926, term5926.getClass(), "size", 0);
        setElement(term5910, 6, term5926);
        setElement(term5910, 7, term5926);
        setIntField(term5929, term5929.getClass(), "vertex", 0);
        setField(term5929, term5929.getClass(), "values", null);
        setField(term5929, term5929.getClass(), "positions", null);
        setIntField(term5929, term5929.getClass(), "size", 0);
        setElement(term5910, 8, term5929);
        setField(term5887, term5887.getClass(), "domains", term5910);
        setField(term5887, term5887.getClass(), "minDomain", term5923);
        setBooleanField(term5887, term5887.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term5887, term5887.getClass(), "propagator", false);
        setBooleanField(term5887, term5887.getClass(), "failed", true);
        setField(term5884, term5884.getClass(), "parent", term5887);
        setField(term5935, term5935.getClass(), "graph", null);
        setField(term5935, term5935.getClass(), "vertexColor", null);
        setIntField(term5935, term5935.getClass(), "numColoredVertices", 0);
        setField(term5935, term5935.getClass(), "usedColors", null);
        setField(term5935, term5935.getClass(), "colorMap", null);
        setField(term5884, term5884.getClass(), "coloring", term5935);
        setElement(term5937, 0, term5926);
        setElement(term5937, 1, term5914);
        setIntField(term5938, term5938.getClass(), "vertex", 0);
        setField(term5938, term5938.getClass(), "values", null);
        setField(term5938, term5938.getClass(), "positions", null);
        setIntField(term5938, term5938.getClass(), "size", 0);
        setElement(term5937, 2, term5938);
        setElement(term5937, 3, term5929);
        setField(term5884, term5884.getClass(), "domains", term5937);
        setField(term5884, term5884.getClass(), "minDomain", term5926);
        setBooleanField(term5884, term5884.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term5884, term5884.getClass(), "propagator", true);
        setBooleanField(term5884, term5884.getClass(), "failed", true);
        setField(term5881, term5881.getClass(), "parent", term5884);
        setField(term5944, term5944.getClass(), "graph", null);
        setField(term5944, term5944.getClass(), "vertexColor", null);
        setIntField(term5944, term5944.getClass(), "numColoredVertices", 0);
        setField(term5944, term5944.getClass(), "usedColors", null);
        setField(term5944, term5944.getClass(), "colorMap", null);
        setField(term5881, term5881.getClass(), "coloring", term5944);
        setField(term5881, term5881.getClass(), "domains", term5946);
        setField(term5881, term5881.getClass(), "minDomain", term5923);
        setBooleanField(term5881, term5881.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term5881, term5881.getClass(), "propagator", false);
        setBooleanField(term5881, term5881.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoringBase$Worker");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.coloring.BacktrackColoringBase");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.coloring.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5879;
        args[2] = term5881;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


