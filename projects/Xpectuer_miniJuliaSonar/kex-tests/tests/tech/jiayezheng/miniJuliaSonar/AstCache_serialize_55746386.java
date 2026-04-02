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
     Object term92768;

    public AstCache_serialize_55746386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92769 = new HashMap();
        HashMap term92852 = new HashMap();
        Set<Object> term92919 =  ((Map) term92852).keySet();
        HashSet term92851 = new HashSet((Collection<? extends Object>) term92919);
        term92768 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term92778 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term92768, term92768.getClass(), "cache", term92769);
        setField(term92778, term92778.getClass(), "juliaProcess", null);
        setField(term92778, term92778.getClass(), "jsonizer", "EYJXMlkLoO");
        setField(term92778, term92778.getClass(), "parserLog", "qJtkJJhOSV");
        setField(term92778, term92778.getClass(), "exchangeFile", "vQbiGKncal");
        setField(term92778, term92778.getClass(), "endMark", "NTSNSiYeUu");
        setField(term92778, term92778.getClass(), "file", "SBTEFDmQVY");
        setField(term92778, term92778.getClass(), "content", "ohZpRiNDZM");
        setField(term92778, term92778.getClass(), "typeTable", term92851);
        setIntField(term92778, term92778.getClass(), "logCount", -1097563716);
        setField(term92768, term92768.getClass(), "parser", term92778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "serialize", argTypes, term92768, args);
    }

};


