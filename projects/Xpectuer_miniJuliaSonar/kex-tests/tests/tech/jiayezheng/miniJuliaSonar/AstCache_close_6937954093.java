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

public class AstCache_close_6937954093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92274;

    public AstCache_close_6937954093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92275 = new HashMap();
        HashMap term92358 = new HashMap();
        Set<Object> term92425 =  ((Map) term92358).keySet();
        HashSet term92357 = new HashSet((Collection<? extends Object>) term92425);
        term92274 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term92284 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term92274, term92274.getClass(), "cache", term92275);
        setField(term92284, term92284.getClass(), "juliaProcess", null);
        setField(term92284, term92284.getClass(), "jsonizer", "ALRSeULyWV");
        setField(term92284, term92284.getClass(), "parserLog", "WVhzXHdyFF");
        setField(term92284, term92284.getClass(), "exchangeFile", "GLAWYoxkyw");
        setField(term92284, term92284.getClass(), "endMark", "cfpPTNNVnW");
        setField(term92284, term92284.getClass(), "file", "VPkEFShMUB");
        setField(term92284, term92284.getClass(), "content", "ZIgHysIFcL");
        setField(term92284, term92284.getClass(), "typeTable", term92357);
        setIntField(term92284, term92284.getClass(), "logCount", 21031843);
        setField(term92274, term92274.getClass(), "parser", term92284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term92274, args);
    }

};


