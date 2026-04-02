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

public class AstCache_clearDiskCache_12560708772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92116;

    public AstCache_clearDiskCache_12560708772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92117 = new HashMap();
        HashMap term92200 = new HashMap();
        Set<Object> term92267 =  ((Map) term92200).keySet();
        HashSet term92199 = new HashSet((Collection<? extends Object>) term92267);
        term92116 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term92126 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term92116, term92116.getClass(), "cache", term92117);
        setField(term92126, term92126.getClass(), "juliaProcess", null);
        setField(term92126, term92126.getClass(), "jsonizer", "mBrbyQVzve");
        setField(term92126, term92126.getClass(), "parserLog", "FQODEbQeKa");
        setField(term92126, term92126.getClass(), "exchangeFile", "iLsUPvsdys");
        setField(term92126, term92126.getClass(), "endMark", "zsglFxvzdp");
        setField(term92126, term92126.getClass(), "file", "zhXtSGLnJR");
        setField(term92126, term92126.getClass(), "content", "XlNXxsYNss");
        setField(term92126, term92126.getClass(), "typeTable", term92199);
        setIntField(term92126, term92126.getClass(), "logCount", 1065595802);
        setField(term92116, term92116.getClass(), "parser", term92126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearDiskCache", argTypes, term92116, args);
    }

};


