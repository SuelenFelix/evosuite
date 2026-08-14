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
     Object term96292;

    public Options_getArgs_12139711244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term96293 = new HashMap();
        ArrayList term96303 = new ArrayList();
        ((ArrayList) term96303).add("mZsPsRzyhQ");
        ((ArrayList) term96303).add("IExlbTemvJ");
        ((ArrayList) term96303).add("zaljyXXCoy");
        ((ArrayList) term96303).add("dKoYnXLGEI");
        ((ArrayList) term96303).add("MQvSpklpkB");
        term96292 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Options"));
        setField(term96292, term96292.getClass(), "optionsMap", term96293);
        setField(term96292, term96292.getClass(), "args", term96303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Options");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArgs", argTypes, term96292, args);
    }

};


