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

public class Options_hasOption_12724456712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96107;

    public Options_hasOption_12724456712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term96108 = new HashMap();
        ArrayList term96118 = new ArrayList();
        ((ArrayList) term96118).add("wKeyHBCSLZ");
        ((ArrayList) term96118).add("iQCLduwSPi");
        term96107 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Options"));
        setField(term96107, term96107.getClass(), "optionsMap", term96108);
        setField(term96107, term96107.getClass(), "args", term96118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZcODLNhxqg";
        callMethod(klass, "hasOption", argTypes, term96107, args);
    }

};


