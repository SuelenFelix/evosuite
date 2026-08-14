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

public class AstCache_deserialize_16289154258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93099;

    public AstCache_deserialize_16289154258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term93100 = new HashMap();
        HashMap term93183 = new HashMap();
        Set<Object> term93262 =  ((Map) term93183).keySet();
        HashSet term93182 = new HashSet((Collection<? extends Object>) term93262);
        term93099 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term93109 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term93099, term93099.getClass(), "cache", term93100);
        setField(term93109, term93109.getClass(), "juliaProcess", null);
        setField(term93109, term93109.getClass(), "jsonizer", "vZzZOvsIYn");
        setField(term93109, term93109.getClass(), "parserLog", "pAIBwhAbDu");
        setField(term93109, term93109.getClass(), "exchangeFile", "iqhNUjVbRG");
        setField(term93109, term93109.getClass(), "endMark", "SSqIrPwJXd");
        setField(term93109, term93109.getClass(), "file", "jAxYagPvcV");
        setField(term93109, term93109.getClass(), "content", "ZXLgGUqgyW");
        setField(term93109, term93109.getClass(), "typeTable", term93182);
        setIntField(term93109, term93109.getClass(), "logCount", 1608016787);
        setField(term93099, term93099.getClass(), "parser", term93109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "belyXxMqFm";
        callMethod(klass, "deserialize", argTypes, term93099, args);
    }

};


