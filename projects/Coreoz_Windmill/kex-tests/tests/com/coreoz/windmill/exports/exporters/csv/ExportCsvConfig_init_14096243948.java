package com.coreoz.windmill.exports.exporters.csv;

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
import static com.coreoz.windmill.exports.exporters.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExportCsvConfig_init_14096243948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;
     Object term137;
     Object term139;
     Object term141;
     Object term155;
     Object term157;
     Object term159;

    public ExportCsvConfig_init_14096243948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        byte[] term133 = (byte[]) newByteArray(3);
        setField(term132, term132.getClass(), "charset", null);
        setByteElement(term133, 0, (byte) -58);
        setByteElement(term133, 1, (byte) -29);
        setByteElement(term133, 2, (byte) -54);
        setField(term132, term132.getClass(), "bomBytes", term133);
        term137 = new Character('B');
        term139 = new Character('t');
        term141 = new Character('n');
        term155 = new Boolean(false);
        term157 = new Boolean(false);
        HashMap term160 = new HashMap();
        Set<Object> term178 =  ((Map) term160).keySet();
        term159 = new HashSet((Collection<? extends Object>) term178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.exports.exporters.csv.ExportCsvConfig");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.coreoz.windmill.files.BomCharset");
        argTypes[1] = char.class;
        argTypes[2] = char.class;
        argTypes[3] = char.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("java.util.Set");
        Object[] args = new Object[8];
        args[0] = term132;
        args[1] = term137;
        args[2] = term139;
        args[3] = term141;
        args[4] = "hRNSzYYIrc";
        args[5] = term155;
        args[6] = term157;
        args[7] = term159;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


