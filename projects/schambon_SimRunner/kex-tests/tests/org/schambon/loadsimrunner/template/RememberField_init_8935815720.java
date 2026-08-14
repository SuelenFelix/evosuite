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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class RememberField_init_8935815720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term70;
     Object term72;
     Object term74;

    public RememberField_init_8935815720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new LinkedList();
        ((LinkedList) term13).add("sjlJAEtRrb");
        ((LinkedList) term13).add("MuLcgQHgqz");
        ((LinkedList) term13).add("");
        ((LinkedList) term13).add((Object)null);
        ((LinkedList) term13).add((Object)null);
        term70 = new Boolean(false);
        term72 = new Integer(568599855);
        term74 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.template.RememberField");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        args[2] = "SzjVpOQTyS";
        args[3] = term70;
        args[4] = term72;
        args[5] = term74;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


