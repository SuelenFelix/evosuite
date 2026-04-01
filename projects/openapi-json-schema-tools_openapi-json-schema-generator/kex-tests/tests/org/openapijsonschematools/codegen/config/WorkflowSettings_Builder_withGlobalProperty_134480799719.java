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

public class WorkflowSettings_Builder_withGlobalProperty_134480799719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33416;

    public WorkflowSettings_Builder_withGlobalProperty_134480799719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term33432 = new Boolean(false);
        Boolean term33434 = new Boolean(false);
        Boolean term33436 = new Boolean(false);
        Boolean term33438 = new Boolean(false);
        Boolean term33440 = new Boolean(false);
        Boolean term33442 = new Boolean(false);
        Boolean term33444 = new Boolean(true);
        Boolean term33446 = new Boolean(false);
        Boolean term33448 = new Boolean(false);
        Boolean term33450 = new Boolean(true);
        Boolean term33488 = new Boolean(true);
        Boolean term33490 = new Boolean(false);
        HashMap term33492 = new HashMap();
        term33416 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder"));
        setField(term33416, term33416.getClass(), "inputSpec", "UkKvaeJfEC");
        setField(term33416, term33416.getClass(), "outputDir", ".");
        setField(term33416, term33416.getClass(), "verbose", term33432);
        setField(term33416, term33416.getClass(), "skipOverwrite", term33434);
        setField(term33416, term33416.getClass(), "removeOperationIdPrefix", term33436);
        setField(term33416, term33416.getClass(), "removeEnumValuePrefix", term33438);
        setField(term33416, term33416.getClass(), "skipOperationExample", term33440);
        setField(term33416, term33416.getClass(), "logToStderr", term33442);
        setField(term33416, term33416.getClass(), "validateSpec", term33444);
        setField(term33416, term33416.getClass(), "enablePostProcessFile", term33446);
        setField(term33416, term33416.getClass(), "enableMinimalUpdate", term33448);
        setField(term33416, term33416.getClass(), "strictSpecBehavior", term33450);
        setField(term33416, term33416.getClass(), "templateDir", "WPxXsahPRq");
        setField(term33416, term33416.getClass(), "templatingEngineName", "handlebars");
        setField(term33416, term33416.getClass(), "ignoreFileOverride", "IENRuqmwUU");
        setField(term33416, term33416.getClass(), "hideGenerationTimestamp", term33488);
        setField(term33416, term33416.getClass(), "intsAllowedForFloatDoubleFormats", term33490);
        setField(term33416, term33416.getClass(), "globalProperties", term33492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings$Builder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "GsWxOwXvSu";
        args[1] = "bKBSncrMEZ";
        callMethod(klass, "withGlobalProperty", argTypes, term33416, args);
    }

};


