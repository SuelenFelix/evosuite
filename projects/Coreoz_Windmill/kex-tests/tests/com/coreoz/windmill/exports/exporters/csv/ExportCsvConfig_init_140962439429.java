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

public class ExportCsvConfig_init_140962439429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790;
     Object term792;
     Object term794;
     Object term796;
     Object term798;

    public ExportCsvConfig_init_140962439429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term790 = new Character((char) 0);
        term792 = new Character((char) 0);
        term794 = new Character((char) 0);
        term796 = new Boolean(false);
        term798 = new Boolean(false);
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
        args[0] = null;
        args[1] = term790;
        args[2] = term792;
        args[3] = term794;
        args[4] = null;
        args[5] = term796;
        args[6] = term798;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


