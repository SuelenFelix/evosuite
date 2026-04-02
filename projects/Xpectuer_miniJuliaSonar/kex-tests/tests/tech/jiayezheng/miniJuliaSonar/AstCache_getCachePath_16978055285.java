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

public class AstCache_getCachePath_16978055285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92594;

    public AstCache_getCachePath_16978055285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92595 = new HashMap();
        HashMap term92678 = new HashMap();
        Set<Object> term92757 =  ((Map) term92678).keySet();
        HashSet term92677 = new HashSet((Collection<? extends Object>) term92757);
        term92594 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term92604 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term92594, term92594.getClass(), "cache", term92595);
        setField(term92604, term92604.getClass(), "juliaProcess", null);
        setField(term92604, term92604.getClass(), "jsonizer", "VgAyBhgBhq");
        setField(term92604, term92604.getClass(), "parserLog", "nhpssUKjpK");
        setField(term92604, term92604.getClass(), "exchangeFile", "lnJVsFNsCN");
        setField(term92604, term92604.getClass(), "endMark", "CUagRkEuzN");
        setField(term92604, term92604.getClass(), "file", "eWIWfWobXm");
        setField(term92604, term92604.getClass(), "content", "lkPJVVXhDd");
        setField(term92604, term92604.getClass(), "typeTable", term92677);
        setIntField(term92604, term92604.getClass(), "logCount", 319853052);
        setField(term92594, term92594.getClass(), "parser", term92604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JlnoFYxLfk";
        callMethod(klass, "getCachePath", argTypes, term92594, args);
    }

};


