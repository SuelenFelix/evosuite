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

public class Options_getOptionsMap_6256625815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96417;

    public Options_getOptionsMap_6256625815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term96418 = new HashMap();
        ArrayList term96428 = new ArrayList();
        ((ArrayList) term96428).add("MrVdoUYAdO");
        ((ArrayList) term96428).add("schPUnVfDW");
        term96417 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Options"));
        setField(term96417, term96417.getClass(), "optionsMap", term96418);
        setField(term96417, term96417.getClass(), "args", term96428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Options");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOptionsMap", argTypes, term96417, args);
    }

};


