package tech.jiayezheng.miniJuliaSonar.visitor;

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
import static tech.jiayezheng.miniJuliaSonar.visitor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeInferencer_bindIter_330350012136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125297;

    public TypeInferencer_bindIter_330350012136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125297 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.visitor.TypeInferencer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.visitor.TypeInferencer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[3] = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "bindIter", argTypes, term125297, args);
    }

};


