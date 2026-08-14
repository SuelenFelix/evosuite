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

public class AutocompleteQueryBuilder_FieldsAndW_init_1517142320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term27;
     Object term41;
     Object term55;
     Object term69;

    public AutocompleteQueryBuilder_FieldsAndW_init_1517142320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new Float(0.13238746F);
        term27 = new Float(0.2707036F);
        term41 = new Float(0.3455959F);
        term55 = new Float(0.09123778F);
        term69 = new Float(0.5523636F);
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
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        args[2] = "sjlJAEtRrb";
        args[3] = term27;
        args[4] = "MuLcgQHgqz";
        args[5] = term41;
        args[6] = "xxtlPwDYFs";
        args[7] = term55;
        args[8] = "jJCZpVmanW";
        args[9] = term69;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


