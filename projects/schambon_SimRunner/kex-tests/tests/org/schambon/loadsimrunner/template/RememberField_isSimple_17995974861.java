package org.schambon.loadsimrunner.template;

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
import static org.schambon.loadsimrunner.template.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class RememberField_isSimple_17995974861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116;

    public RememberField_isSimple_17995974861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term130 = new ArrayList();
        ((ArrayList) term130).add("hRNSzYYIrc");
        ((ArrayList) term130).add("RMFIsYGgne");
        ((ArrayList) term130).add("NRdvgJlhkX");
        ((ArrayList) term130).add("uuaPigETmJ");
        ((ArrayList) term130).add("MxlszYVzRf");
        ((ArrayList) term130).add("LQFpaHEwXR");
        ((ArrayList) term130).add("oVcInYnLWB");
        ((ArrayList) term130).add("aJlieCFVtF");
        ((ArrayList) term130).add("ZiaGIbnzTs");
        term116 = newInstance(Class.forName("org.schambon.loadsimrunner.template.RememberField"));
        setField(term116, term116.getClass(), "field", "MjGYSRKTNF");
        setBooleanField(term116, term116.getClass(), "preload", false);
        setField(term116, term116.getClass(), "compound", term130);
        setField(term116, term116.getClass(), "name", "tbcdzjIfER");
        setIntField(term116, term116.getClass(), "number", 1484323161);
        setIntField(term116, term116.getClass(), "capped", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.template.RememberField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSimple", argTypes, term116, args);
    }

};


