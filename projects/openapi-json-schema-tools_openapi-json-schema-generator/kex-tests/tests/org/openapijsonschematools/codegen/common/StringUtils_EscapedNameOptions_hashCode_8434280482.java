package org.openapijsonschematools.codegen.common;

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
import static org.openapijsonschematools.codegen.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class StringUtils_EscapedNameOptions_hashCode_8434280482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13355;

    public StringUtils_EscapedNameOptions_hashCode_8434280482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13381 = new HashMap();
        Set<Object> term13523 =  ((Map) term13381).keySet();
        HashSet term13380 = new HashSet((Collection<? extends Object>) term13523);
        ArrayList term13391 = new ArrayList();
        ((ArrayList) term13391).add("GzFkzHGYFt");
        ((ArrayList) term13391).add("tShwQLRGNe");
        ((ArrayList) term13391).add("LvtrsXUliU");
        ((ArrayList) term13391).add("xLbjWUgOIL");
        ((ArrayList) term13391).add("jDtqGUpnZN");
        ((ArrayList) term13391).add("nGKItKLYNC");
        ((ArrayList) term13391).add("UiUYnPrcCi");
        ((ArrayList) term13391).add("UoYtihxVaS");
        ((ArrayList) term13391).add("JDswTTCZHV");
        term13355 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.StringUtils$EscapedNameOptions"));
        setField(term13355, term13355.getClass(), "name", "UlajhuVLaP");
        setField(term13355, term13355.getClass(), "appendToReplacement", "gGSMzuGICf");
        setField(term13355, term13355.getClass(), "specialChars", term13380);
        setField(term13355, term13355.getClass(), "charactersToAllow", term13391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.StringUtils$EscapedNameOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term13355, args);
    }

};


