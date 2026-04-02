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
     Object term93093;

    public AstCache_deserialize_16289154258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term93094 = new HashMap();
        HashMap term93177 = new HashMap();
        Set<Object> term93256 =  ((Map) term93177).keySet();
        HashSet term93176 = new HashSet((Collection<? extends Object>) term93256);
        term93093 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache"));
        Object term93103 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Parser"));
        setField(term93093, term93093.getClass(), "cache", term93094);
        setField(term93103, term93103.getClass(), "juliaProcess", null);
        setField(term93103, term93103.getClass(), "jsonizer", "vZzZOvsIYn");
        setField(term93103, term93103.getClass(), "parserLog", "pAIBwhAbDu");
        setField(term93103, term93103.getClass(), "exchangeFile", "iqhNUjVbRG");
        setField(term93103, term93103.getClass(), "endMark", "SSqIrPwJXd");
        setField(term93103, term93103.getClass(), "file", "jAxYagPvcV");
        setField(term93103, term93103.getClass(), "content", "ZXLgGUqgyW");
        setField(term93103, term93103.getClass(), "typeTable", term93176);
        setIntField(term93103, term93103.getClass(), "logCount", 1608016787);
        setField(term93093, term93093.getClass(), "parser", term93103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.AstCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "belyXxMqFm";
        callMethod(klass, "deserialize", argTypes, term93093, args);
    }

};


