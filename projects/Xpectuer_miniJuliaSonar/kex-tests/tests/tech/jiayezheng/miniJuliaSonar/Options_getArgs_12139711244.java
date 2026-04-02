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
import java.util.ArrayList;

public class Options_getArgs_12139711244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96286;

    public Options_getArgs_12139711244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term96287 = new HashMap();
        ArrayList term96297 = new ArrayList();
        ((ArrayList) term96297).add("mZsPsRzyhQ");
        ((ArrayList) term96297).add("IExlbTemvJ");
        ((ArrayList) term96297).add("zaljyXXCoy");
        ((ArrayList) term96297).add("dKoYnXLGEI");
        ((ArrayList) term96297).add("MQvSpklpkB");
        term96286 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Options"));
        setField(term96286, term96286.getClass(), "optionsMap", term96287);
        setField(term96286, term96286.getClass(), "args", term96297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Options");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArgs", argTypes, term96286, args);
    }

};


