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
import java.util.LinkedList;
import java.lang.Integer;

public class TypeInferencer_reportUnpackMismatch_566707063137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125298;
     Object term125299;
     Object term125302;

    public TypeInferencer_reportUnpackMismatch_566707063137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125298 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.visitor.TypeInferencer"));
        term125299 = new LinkedList();
        term125302 = new Integer(-420030135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.visitor.TypeInferencer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term125299;
        args[1] = term125302;
        callMethod(klass, "reportUnpackMismatch", argTypes, term125298, args);
    }

};


