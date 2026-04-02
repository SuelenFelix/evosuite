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

public class Options_get_6557150731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95866;

    public Options_get_6557150731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term95867 = new HashMap();
        ArrayList term95877 = new ArrayList();
        ((ArrayList) term95877).add("dZVxzYEeZe");
        ((ArrayList) term95877).add("TnCQRmzwPf");
        ((ArrayList) term95877).add("ZGnUKGTWCn");
        ((ArrayList) term95877).add("cHRLXsgRzr");
        ((ArrayList) term95877).add("QpqQKmCtoC");
        ((ArrayList) term95877).add("AYRvbRJxWI");
        ((ArrayList) term95877).add("MGNiaVqEDc");
        ((ArrayList) term95877).add("qeVNCFrTbT");
        ((ArrayList) term95877).add("sreEtRBWQl");
        term95866 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Options"));
        setField(term95866, term95866.getClass(), "optionsMap", term95867);
        setField(term95866, term95866.getClass(), "args", term95877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UKQejaeJWY";
        callMethod(klass, "get", argTypes, term95866, args);
    }

};


