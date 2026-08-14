package org.apache.solr.suggest.analyzing;

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
import static org.apache.solr.suggest.analyzing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class AutocompleteQueryBuilder_FieldsAndW_init_1517142321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;
     Object term123;
     Object term125;
     Object term127;
     Object term129;

    public AutocompleteQueryBuilder_FieldsAndW_init_1517142321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = new Float(0.0F);
        term123 = new Float(0.0F);
        term125 = new Float(0.0F);
        term127 = new Float(0.0F);
        term129 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.solr.suggest.analyzing.AutocompleteQueryBuilder$FieldsAndW");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = float.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = float.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = float.class;
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = float.class;
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = float.class;
        Object[] args = new Object[10];
        args[0] = null;
        args[1] = term121;
        args[2] = null;
        args[3] = term123;
        args[4] = null;
        args[5] = term125;
        args[6] = null;
        args[7] = term127;
        args[8] = null;
        args[9] = term129;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


