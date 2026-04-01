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

public class WorkflowSettings_Builder_withIgnoreFileOverride_116578204416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32967;

    public WorkflowSettings_Builder_withIgnoreFileOverride_116578204416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term32983 = new Boolean(false);
        Boolean term32985 = new Boolean(false);
        Boolean term32987 = new Boolean(false);
        Boolean term32989 = new Boolean(false);
        Boolean term32991 = new Boolean(false);
        Boolean term32993 = new Boolean(false);
        Boolean term32995 = new Boolean(true);
        Boolean term32997 = new Boolean(false);
        Boolean term32999 = new Boolean(false);
        Boolean term33001 = new Boolean(true);
        Boolean term33039 = new Boolean(true);
        Boolean term33041 = new Boolean(false);
        HashMap term33043 = new HashMap();
        term32967 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term32967, term32967.getClass(), "inputSpec", "WXcZEtUKlI");
        setField(term32967, term32967.getClass(), "outputDir", ".");
        setField(term32967, term32967.getClass(), "verbose", term32983);
        setField(term32967, term32967.getClass(), "skipOverwrite", term32985);
        setField(term32967, term32967.getClass(), "removeOperationIdPrefix", term32987);
        setField(term32967, term32967.getClass(), "removeEnumValuePrefix", term32989);
        setField(term32967, term32967.getClass(), "skipOperationExample", term32991);
        setField(term32967, term32967.getClass(), "logToStderr", term32993);
        setField(term32967, term32967.getClass(), "validateSpec", term32995);
        setField(term32967, term32967.getClass(), "enablePostProcessFile", term32997);
        setField(term32967, term32967.getClass(), "enableMinimalUpdate", term32999);
        setField(term32967, term32967.getClass(), "strictSpecBehavior", term33001);
        setField(term32967, term32967.getClass(), "templateDir", "IkpjUOuWQU");
        setField(term32967, term32967.getClass(), "templatingEngineName", "handlebars");
        setField(term32967, term32967.getClass(), "ignoreFileOverride", "boSSpezHeU");
        setField(term32967, term32967.getClass(), "hideGenerationTimestamp", term33039);
        setField(term32967, term32967.getClass(), "intsAllowedForFloatDoubleFormats", term33041);
        setField(term32967, term32967.getClass(), "globalProperties", term33043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OUeBWNTQDh";
        callMethod(klass, "withIgnoreFileOverride", argTypes, term32967, args);
    }

};


