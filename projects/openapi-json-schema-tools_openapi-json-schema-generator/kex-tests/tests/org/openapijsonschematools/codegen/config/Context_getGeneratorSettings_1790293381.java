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
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class Context_getGeneratorSettings_1790293381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7459;

    public Context_getGeneratorSettings_1790293381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7594 = new HashMap();
        HashMap term7689 = new HashMap();
        Boolean term7695 = new Boolean(true);
        Boolean term7697 = new Boolean(false);
        term7459 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.Context"));
        Object term7460 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term7593 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        Object term7663 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term7688 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term7459, term7459.getClass(), "specDocument", null);
        setField(term7460, term7460.getClass(), "generatorName", "WVRMUmrljA");
        setField(term7460, term7460.getClass(), "apiPackage", "NTlKJDDWlk");
        setField(term7460, term7460.getClass(), "modelPackage", "vOuMEpOQAg");
        setField(term7460, term7460.getClass(), "invokerPackage", "SIODFGaQhr");
        setField(term7460, term7460.getClass(), "packageName", "qYzsiuXOgS");
        setField(term7460, term7460.getClass(), "apiNameSuffix", "bxrCBbrrct");
        setField(term7460, term7460.getClass(), "modelNamePrefix", "CKWpJaaaxX");
        setField(term7460, term7460.getClass(), "modelNameSuffix", "UBRmXJmfrt");
        setField(term7460, term7460.getClass(), "groupId", "WZzvmIHhzZ");
        setField(term7460, term7460.getClass(), "artifactId", "doQLHkjpNm");
        setField(term7460, term7460.getClass(), "artifactVersion", "lCyLIcSuom");
        setField(term7593, term7593.getClass(), "m", term7594);
        setField(term7593, term7593.getClass(), "keySet", null);
        setField(term7593, term7593.getClass(), "entrySet", null);
        setField(term7593, term7593.getClass(), "values", null);
        setField(term7460, term7460.getClass(), "additionalProperties", term7593);
        setField(term7460, term7460.getClass(), "gitHost", "github.com");
        setField(term7460, term7460.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term7460, term7460.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term7460, term7460.getClass(), "releaseNote", "Minor update");
        setField(term7460, term7460.getClass(), "httpUserAgent", "CGOpQSZZwI");
        setField(term7459, term7459.getClass(), "generatorSettings", term7460);
        setField(term7663, term7663.getClass(), "inputSpec", null);
        setField(term7663, term7663.getClass(), "outputDir", ".");
        setBooleanField(term7663, term7663.getClass(), "verbose", false);
        setBooleanField(term7663, term7663.getClass(), "skipOverwrite", false);
        setBooleanField(term7663, term7663.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term7663, term7663.getClass(), "skipOperationExample", false);
        setBooleanField(term7663, term7663.getClass(), "logToStderr", false);
        setBooleanField(term7663, term7663.getClass(), "validateSpec", true);
        setBooleanField(term7663, term7663.getClass(), "enablePostProcessFile", false);
        setBooleanField(term7663, term7663.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term7663, term7663.getClass(), "strictSpecBehavior", true);
        setField(term7663, term7663.getClass(), "templateDir", null);
        setField(term7663, term7663.getClass(), "templatingEngineName", "handlebars");
        setField(term7663, term7663.getClass(), "ignoreFileOverride", null);
        setField(term7688, term7688.getClass(), "m", term7689);
        setField(term7688, term7688.getClass(), "keySet", null);
        setField(term7688, term7688.getClass(), "entrySet", null);
        setField(term7688, term7688.getClass(), "values", null);
        setField(term7663, term7663.getClass(), "globalProperties", term7688);
        setBooleanField(term7663, term7663.getClass(), "removeEnumValuePrefix", false);
        setField(term7663, term7663.getClass(), "hideGenerationTimestamp", term7695);
        setField(term7663, term7663.getClass(), "intsAllowedForFloatDoubleFormats", term7697);
        setField(term7459, term7459.getClass(), "workflowSettings", term7663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.Context");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneratorSettings", argTypes, term7459, args);
    }

};


