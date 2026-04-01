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

public class WorkflowSettings_Builder_withInputSpec_9239559412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31151;

    public WorkflowSettings_Builder_withInputSpec_9239559412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term31167 = new Boolean(false);
        Boolean term31169 = new Boolean(false);
        Boolean term31171 = new Boolean(false);
        Boolean term31173 = new Boolean(false);
        Boolean term31175 = new Boolean(false);
        Boolean term31177 = new Boolean(false);
        Boolean term31179 = new Boolean(true);
        Boolean term31181 = new Boolean(false);
        Boolean term31183 = new Boolean(false);
        Boolean term31185 = new Boolean(true);
        Boolean term31223 = new Boolean(true);
        Boolean term31225 = new Boolean(false);
        HashMap term31227 = new HashMap();
        term31151 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term31151, term31151.getClass(), "inputSpec", "JkgoRtImdE");
        setField(term31151, term31151.getClass(), "outputDir", ".");
        setField(term31151, term31151.getClass(), "verbose", term31167);
        setField(term31151, term31151.getClass(), "skipOverwrite", term31169);
        setField(term31151, term31151.getClass(), "removeOperationIdPrefix", term31171);
        setField(term31151, term31151.getClass(), "removeEnumValuePrefix", term31173);
        setField(term31151, term31151.getClass(), "skipOperationExample", term31175);
        setField(term31151, term31151.getClass(), "logToStderr", term31177);
        setField(term31151, term31151.getClass(), "validateSpec", term31179);
        setField(term31151, term31151.getClass(), "enablePostProcessFile", term31181);
        setField(term31151, term31151.getClass(), "enableMinimalUpdate", term31183);
        setField(term31151, term31151.getClass(), "strictSpecBehavior", term31185);
        setField(term31151, term31151.getClass(), "templateDir", "qFGKIJjlmV");
        setField(term31151, term31151.getClass(), "templatingEngineName", "handlebars");
        setField(term31151, term31151.getClass(), "ignoreFileOverride", "IHqvyhMtuM");
        setField(term31151, term31151.getClass(), "hideGenerationTimestamp", term31223);
        setField(term31151, term31151.getClass(), "intsAllowedForFloatDoubleFormats", term31225);
        setField(term31151, term31151.getClass(), "globalProperties", term31227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dAldIGYAXV";
        callMethod(klass, "withInputSpec", argTypes, term31151, args);
    }

};


