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
     Object term91970;

    public AstCache_clear_6840364541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term91971 = new HashMap();
        HashMap term92054 = new HashMap();
        Set<Object> term92121 =  ((Map) term92054).keySet();
        HashSet term92053 = new HashSet((Collection<? extends Object>) term92121);
        term91970 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term91980 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term91970, term91970.getClass(), "cache", term91971);
        setField(term91980, term91980.getClass(), "juliaProcess", null);
        setField(term91980, term91980.getClass(), "jsonizer", "fNlDLqQZFT");
        setField(term91980, term91980.getClass(), "parserLog", "szCfpoTDXX");
        setField(term91980, term91980.getClass(), "exchangeFile", "blnSDUyHkS");
        setField(term91980, term91980.getClass(), "endMark", "byyepwHlHN");
        setField(term91980, term91980.getClass(), "file", "akVNsUcFra");
        setField(term91980, term91980.getClass(), "content", "BKiHMTzLoY");
        setField(term91980, term91980.getClass(), "typeTable", term92053);
        setIntField(term91980, term91980.getClass(), "logCount", -330897705);
        setField(term91970, term91970.getClass(), "parser", term91980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term91970, args);
    }

};


