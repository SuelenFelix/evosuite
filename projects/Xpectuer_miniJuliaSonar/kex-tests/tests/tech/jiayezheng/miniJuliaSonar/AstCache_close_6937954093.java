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
     Object term92268;

    public AstCache_close_6937954093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92269 = new HashMap();
        HashMap term92352 = new HashMap();
        Set<Object> term92419 =  ((Map) term92352).keySet();
        HashSet term92351 = new HashSet((Collection<? extends Object>) term92419);
        term92268 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term92278 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term92268, term92268.getClass(), "cache", term92269);
        setField(term92278, term92278.getClass(), "juliaProcess", null);
        setField(term92278, term92278.getClass(), "jsonizer", "ALRSeULyWV");
        setField(term92278, term92278.getClass(), "parserLog", "WVhzXHdyFF");
        setField(term92278, term92278.getClass(), "exchangeFile", "GLAWYoxkyw");
        setField(term92278, term92278.getClass(), "endMark", "cfpPTNNVnW");
        setField(term92278, term92278.getClass(), "file", "VPkEFShMUB");
        setField(term92278, term92278.getClass(), "content", "ZIgHysIFcL");
        setField(term92278, term92278.getClass(), "typeTable", term92351);
        setIntField(term92278, term92278.getClass(), "logCount", 21031843);
        setField(term92268, term92268.getClass(), "parser", term92278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term92268, args);
    }

};


