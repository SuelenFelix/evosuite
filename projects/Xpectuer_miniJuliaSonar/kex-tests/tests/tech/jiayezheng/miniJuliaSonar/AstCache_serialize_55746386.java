package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class AstCache_serialize_55746386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92774;

    public AstCache_serialize_55746386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92775 = new HashMap();
        HashMap term92858 = new HashMap();
        Set<Object> term92925 =  ((Map) term92858).keySet();
        HashSet term92857 = new HashSet((Collection<? extends Object>) term92925);
        term92774 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term92784 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term92774, term92774.getClass(), "cache", term92775);
        setField(term92784, term92784.getClass(), "juliaProcess", null);
        setField(term92784, term92784.getClass(), "jsonizer", "EYJXMlkLoO");
        setField(term92784, term92784.getClass(), "parserLog", "qJtkJJhOSV");
        setField(term92784, term92784.getClass(), "exchangeFile", "vQbiGKncal");
        setField(term92784, term92784.getClass(), "endMark", "NTSNSiYeUu");
        setField(term92784, term92784.getClass(), "file", "SBTEFDmQVY");
        setField(term92784, term92784.getClass(), "content", "ohZpRiNDZM");
        setField(term92784, term92784.getClass(), "typeTable", term92857);
        setIntField(term92784, term92784.getClass(), "logCount", -1097563716);
        setField(term92774, term92774.getClass(), "parser", term92784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "serialize", argTypes, term92774, args);
    }

};


