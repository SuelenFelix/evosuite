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

public class TypeInferencer_visit_1532163773100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94473;

    public TypeInferencer_visit_1532163773100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94473 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.visitor.TypeInferencer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.visitor.TypeInferencer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.AbstractType");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "visit", argTypes, term94473, args);
    }

};


