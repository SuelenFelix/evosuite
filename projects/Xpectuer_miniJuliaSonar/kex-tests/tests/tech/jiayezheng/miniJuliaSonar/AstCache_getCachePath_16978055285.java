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
     Object term92600;

    public AstCache_getCachePath_16978055285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92601 = new HashMap();
        HashMap term92684 = new HashMap();
        Set<Object> term92763 =  ((Map) term92684).keySet();
        HashSet term92683 = new HashSet((Collection<? extends Object>) term92763);
        term92600 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term92610 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term92600, term92600.getClass(), "cache", term92601);
        setField(term92610, term92610.getClass(), "juliaProcess", null);
        setField(term92610, term92610.getClass(), "jsonizer", "VgAyBhgBhq");
        setField(term92610, term92610.getClass(), "parserLog", "nhpssUKjpK");
        setField(term92610, term92610.getClass(), "exchangeFile", "lnJVsFNsCN");
        setField(term92610, term92610.getClass(), "endMark", "CUagRkEuzN");
        setField(term92610, term92610.getClass(), "file", "eWIWfWobXm");
        setField(term92610, term92610.getClass(), "content", "lkPJVVXhDd");
        setField(term92610, term92610.getClass(), "typeTable", term92683);
        setIntField(term92610, term92610.getClass(), "logCount", 319853052);
        setField(term92600, term92600.getClass(), "parser", term92610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JlnoFYxLfk";
        callMethod(klass, "getCachePath", argTypes, term92600, args);
    }

};


