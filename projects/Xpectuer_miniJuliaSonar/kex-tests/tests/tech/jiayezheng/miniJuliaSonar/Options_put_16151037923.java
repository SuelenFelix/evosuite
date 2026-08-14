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

public class Options_put_16151037923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96188;
     Object term96251;

    public Options_put_16151037923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term96189 = new HashMap();
        ArrayList term96199 = new ArrayList();
        ((ArrayList) term96199).add("GbvfbbsrOl");
        ((ArrayList) term96199).add("IIZlqzOmtY");
        ((ArrayList) term96199).add("iRFRSxtnkr");
        term96188 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Options"));
        setField(term96188, term96188.getClass(), "optionsMap", term96189);
        setField(term96188, term96188.getClass(), "args", term96199);
        term96251 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Options");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "iGWkLjLGBY";
        args[1] = term96251;
        callMethod(klass, "put", argTypes, term96188, args);
    }

};


