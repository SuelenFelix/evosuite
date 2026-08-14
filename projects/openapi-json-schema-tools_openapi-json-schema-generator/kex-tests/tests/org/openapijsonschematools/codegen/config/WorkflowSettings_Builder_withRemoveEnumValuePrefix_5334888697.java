package org.openapijsonschematools.codegen.config;

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
import static org.openapijsonschematools.codegen.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.util.HashMap;

public class WorkflowSettings_Builder_withRemoveEnumValuePrefix_5334888697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31811;
     Object term31892;

    public WorkflowSettings_Builder_withRemoveEnumValuePrefix_5334888697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term31827 = new Boolean(false);
        Boolean term31829 = new Boolean(false);
        Boolean term31831 = new Boolean(false);
        Boolean term31833 = new Boolean(false);
        Boolean term31835 = new Boolean(false);
        Boolean term31837 = new Boolean(false);
        Boolean term31839 = new Boolean(true);
        Boolean term31841 = new Boolean(false);
        Boolean term31843 = new Boolean(false);
        Boolean term31845 = new Boolean(true);
        Boolean term31883 = new Boolean(true);
        Boolean term31885 = new Boolean(false);
        HashMap term31887 = new HashMap();
        term31811 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term31811, term31811.getClass(), "inputSpec", "sUEeHQTWkA");
        setField(term31811, term31811.getClass(), "outputDir", ".");
        setField(term31811, term31811.getClass(), "verbose", term31827);
        setField(term31811, term31811.getClass(), "skipOverwrite", term31829);
        setField(term31811, term31811.getClass(), "removeOperationIdPrefix", term31831);
        setField(term31811, term31811.getClass(), "removeEnumValuePrefix", term31833);
        setField(term31811, term31811.getClass(), "skipOperationExample", term31835);
        setField(term31811, term31811.getClass(), "logToStderr", term31837);
        setField(term31811, term31811.getClass(), "validateSpec", term31839);
        setField(term31811, term31811.getClass(), "enablePostProcessFile", term31841);
        setField(term31811, term31811.getClass(), "enableMinimalUpdate", term31843);
        setField(term31811, term31811.getClass(), "strictSpecBehavior", term31845);
        setField(term31811, term31811.getClass(), "templateDir", "BDIRCxAWLA");
        setField(term31811, term31811.getClass(), "templatingEngineName", "handlebars");
        setField(term31811, term31811.getClass(), "ignoreFileOverride", "eOJfbiZLnb");
        setField(term31811, term31811.getClass(), "hideGenerationTimestamp", term31883);
        setField(term31811, term31811.getClass(), "intsAllowedForFloatDoubleFormats", term31885);
        setField(term31811, term31811.getClass(), "globalProperties", term31887);
        term31892 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term31892;
        callMethod(klass, "withRemoveEnumValuePrefix", argTypes, term31811, args);
    }

};


