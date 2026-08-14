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

public class AstCache_getSerializedModule_11721143307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92926;

    public AstCache_getSerializedModule_11721143307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92927 = new HashMap();
        HashMap term93010 = new HashMap();
        Set<Object> term93088 =  ((Map) term93010).keySet();
        HashSet term93009 = new HashSet((Collection<? extends Object>) term93088);
        term92926 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term92936 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term92926, term92926.getClass(), "cache", term92927);
        setField(term92936, term92936.getClass(), "juliaProcess", null);
        setField(term92936, term92936.getClass(), "jsonizer", "cPlYOAUqsP");
        setField(term92936, term92936.getClass(), "parserLog", "ritBUyuuKt");
        setField(term92936, term92936.getClass(), "exchangeFile", "YfziBBiPvL");
        setField(term92936, term92936.getClass(), "endMark", "lNBaHEkYui");
        setField(term92936, term92936.getClass(), "file", "BqxRCYZwmn");
        setField(term92936, term92936.getClass(), "content", "KHPDZjrXQp");
        setField(term92936, term92936.getClass(), "typeTable", term93009);
        setIntField(term92936, term92936.getClass(), "logCount", 1572907769);
        setField(term92926, term92926.getClass(), "parser", term92936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fpyUFzdCwQ";
        callMethod(klass, "getSerializedModule", argTypes, term92926, args);
    }

};


