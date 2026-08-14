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

public class AstCache_getAST_1325823454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92426;

    public AstCache_getAST_1325823454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92427 = new HashMap();
        HashMap term92510 = new HashMap();
        Set<Object> term92589 =  ((Map) term92510).keySet();
        HashSet term92509 = new HashSet((Collection<? extends Object>) term92589);
        term92426 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term92436 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term92426, term92426.getClass(), "cache", term92427);
        setField(term92436, term92436.getClass(), "juliaProcess", null);
        setField(term92436, term92436.getClass(), "jsonizer", "FuWUjAYXxz");
        setField(term92436, term92436.getClass(), "parserLog", "rKIvvYydou");
        setField(term92436, term92436.getClass(), "exchangeFile", "KNgeIkQoef");
        setField(term92436, term92436.getClass(), "endMark", "MeMWAHyjMR");
        setField(term92436, term92436.getClass(), "file", "lTuLOcnSnJ");
        setField(term92436, term92436.getClass(), "content", "govbBrRstA");
        setField(term92436, term92436.getClass(), "typeTable", term92509);
        setIntField(term92436, term92436.getClass(), "logCount", -380787857);
        setField(term92426, term92426.getClass(), "parser", term92436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TirWkyiCHh";
        callMethod(klass, "getAST", argTypes, term92426, args);
    }

};


