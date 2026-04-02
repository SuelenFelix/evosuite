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

public class AstCache_clear_6840364541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91964;

    public AstCache_clear_6840364541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term91965 = new HashMap();
        HashMap term92048 = new HashMap();
        Set<Object> term92115 =  ((Map) term92048).keySet();
        HashSet term92047 = new HashSet((Collection<? extends Object>) term92115);
        term91964 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term91974 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term91964, term91964.getClass(), "cache", term91965);
        setField(term91974, term91974.getClass(), "juliaProcess", null);
        setField(term91974, term91974.getClass(), "jsonizer", "fNlDLqQZFT");
        setField(term91974, term91974.getClass(), "parserLog", "szCfpoTDXX");
        setField(term91974, term91974.getClass(), "exchangeFile", "blnSDUyHkS");
        setField(term91974, term91974.getClass(), "endMark", "byyepwHlHN");
        setField(term91974, term91974.getClass(), "file", "akVNsUcFra");
        setField(term91974, term91974.getClass(), "content", "BKiHMTzLoY");
        setField(term91974, term91974.getClass(), "typeTable", term92047);
        setIntField(term91974, term91974.getClass(), "logCount", -330897705);
        setField(term91964, term91964.getClass(), "parser", term91974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term91964, args);
    }

};


