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
     Object term92920;

    public AstCache_getSerializedModule_11721143307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92921 = new HashMap();
        HashMap term93004 = new HashMap();
        Set<Object> term93082 =  ((Map) term93004).keySet();
        HashSet term93003 = new HashSet((Collection<? extends Object>) term93082);
        term92920 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term92930 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term92920, term92920.getClass(), "cache", term92921);
        setField(term92930, term92930.getClass(), "juliaProcess", null);
        setField(term92930, term92930.getClass(), "jsonizer", "cPlYOAUqsP");
        setField(term92930, term92930.getClass(), "parserLog", "ritBUyuuKt");
        setField(term92930, term92930.getClass(), "exchangeFile", "YfziBBiPvL");
        setField(term92930, term92930.getClass(), "endMark", "lNBaHEkYui");
        setField(term92930, term92930.getClass(), "file", "BqxRCYZwmn");
        setField(term92930, term92930.getClass(), "content", "KHPDZjrXQp");
        setField(term92930, term92930.getClass(), "typeTable", term93003);
        setIntField(term92930, term92930.getClass(), "logCount", 1572907769);
        setField(term92920, term92920.getClass(), "parser", term92930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fpyUFzdCwQ";
        callMethod(klass, "getSerializedModule", argTypes, term92920, args);
    }

};


