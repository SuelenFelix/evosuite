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

public class WorkflowSettings_Builder_withSkipOverwrite_14321813255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31563;
     Object term31644;

    public WorkflowSettings_Builder_withSkipOverwrite_14321813255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term31579 = new Boolean(false);
        Boolean term31581 = new Boolean(false);
        Boolean term31583 = new Boolean(false);
        Boolean term31585 = new Boolean(false);
        Boolean term31587 = new Boolean(false);
        Boolean term31589 = new Boolean(false);
        Boolean term31591 = new Boolean(true);
        Boolean term31593 = new Boolean(false);
        Boolean term31595 = new Boolean(false);
        Boolean term31597 = new Boolean(true);
        Boolean term31635 = new Boolean(true);
        Boolean term31637 = new Boolean(false);
        HashMap term31639 = new HashMap();
        term31563 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term31563, term31563.getClass(), "inputSpec", "hulYxtowxw");
        setField(term31563, term31563.getClass(), "outputDir", ".");
        setField(term31563, term31563.getClass(), "verbose", term31579);
        setField(term31563, term31563.getClass(), "skipOverwrite", term31581);
        setField(term31563, term31563.getClass(), "removeOperationIdPrefix", term31583);
        setField(term31563, term31563.getClass(), "removeEnumValuePrefix", term31585);
        setField(term31563, term31563.getClass(), "skipOperationExample", term31587);
        setField(term31563, term31563.getClass(), "logToStderr", term31589);
        setField(term31563, term31563.getClass(), "validateSpec", term31591);
        setField(term31563, term31563.getClass(), "enablePostProcessFile", term31593);
        setField(term31563, term31563.getClass(), "enableMinimalUpdate", term31595);
        setField(term31563, term31563.getClass(), "strictSpecBehavior", term31597);
        setField(term31563, term31563.getClass(), "templateDir", "GNEmuHPNcU");
        setField(term31563, term31563.getClass(), "templatingEngineName", "handlebars");
        setField(term31563, term31563.getClass(), "ignoreFileOverride", "IoSfuKDFRe");
        setField(term31563, term31563.getClass(), "hideGenerationTimestamp", term31635);
        setField(term31563, term31563.getClass(), "intsAllowedForFloatDoubleFormats", term31637);
        setField(term31563, term31563.getClass(), "globalProperties", term31639);
        term31644 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term31644;
        callMethod(klass, "withSkipOverwrite", argTypes, term31563, args);
    }

};


