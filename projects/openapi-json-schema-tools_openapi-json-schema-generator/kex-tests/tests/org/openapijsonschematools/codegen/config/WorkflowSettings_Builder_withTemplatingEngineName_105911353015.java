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

public class WorkflowSettings_Builder_withTemplatingEngineName_105911353015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32823;

    public WorkflowSettings_Builder_withTemplatingEngineName_105911353015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term32839 = new Boolean(false);
        Boolean term32841 = new Boolean(false);
        Boolean term32843 = new Boolean(false);
        Boolean term32845 = new Boolean(false);
        Boolean term32847 = new Boolean(false);
        Boolean term32849 = new Boolean(false);
        Boolean term32851 = new Boolean(true);
        Boolean term32853 = new Boolean(false);
        Boolean term32855 = new Boolean(false);
        Boolean term32857 = new Boolean(true);
        Boolean term32895 = new Boolean(true);
        Boolean term32897 = new Boolean(false);
        HashMap term32899 = new HashMap();
        term32823 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term32823, term32823.getClass(), "inputSpec", "PqywFWJlpE");
        setField(term32823, term32823.getClass(), "outputDir", ".");
        setField(term32823, term32823.getClass(), "verbose", term32839);
        setField(term32823, term32823.getClass(), "skipOverwrite", term32841);
        setField(term32823, term32823.getClass(), "removeOperationIdPrefix", term32843);
        setField(term32823, term32823.getClass(), "removeEnumValuePrefix", term32845);
        setField(term32823, term32823.getClass(), "skipOperationExample", term32847);
        setField(term32823, term32823.getClass(), "logToStderr", term32849);
        setField(term32823, term32823.getClass(), "validateSpec", term32851);
        setField(term32823, term32823.getClass(), "enablePostProcessFile", term32853);
        setField(term32823, term32823.getClass(), "enableMinimalUpdate", term32855);
        setField(term32823, term32823.getClass(), "strictSpecBehavior", term32857);
        setField(term32823, term32823.getClass(), "templateDir", "OzXRsFGTIp");
        setField(term32823, term32823.getClass(), "templatingEngineName", "handlebars");
        setField(term32823, term32823.getClass(), "ignoreFileOverride", "TjWpyghUWN");
        setField(term32823, term32823.getClass(), "hideGenerationTimestamp", term32895);
        setField(term32823, term32823.getClass(), "intsAllowedForFloatDoubleFormats", term32897);
        setField(term32823, term32823.getClass(), "globalProperties", term32899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dkZFDZxcde";
        callMethod(klass, "withTemplatingEngineName", argTypes, term32823, args);
    }

};


