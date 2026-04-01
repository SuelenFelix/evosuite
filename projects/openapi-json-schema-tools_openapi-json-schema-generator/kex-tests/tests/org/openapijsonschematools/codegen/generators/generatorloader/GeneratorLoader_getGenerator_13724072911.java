package org.openapijsonschematools.codegen.generators.generatorloader;

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
import static org.openapijsonschematools.codegen.generators.generatorloader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class GeneratorLoader_getGenerator_13724072911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8052;
     Object term8255;

    public GeneratorLoader_getGenerator_13724072911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8186 = new HashMap();
        term8052 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term8185 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term8052, term8052.getClass(), "generatorName", "MjGYSRKTNF");
        setField(term8052, term8052.getClass(), "apiPackage", "hRNSzYYIrc");
        setField(term8052, term8052.getClass(), "modelPackage", "RMFIsYGgne");
        setField(term8052, term8052.getClass(), "invokerPackage", "NRdvgJlhkX");
        setField(term8052, term8052.getClass(), "packageName", "uuaPigETmJ");
        setField(term8052, term8052.getClass(), "apiNameSuffix", "MxlszYVzRf");
        setField(term8052, term8052.getClass(), "modelNamePrefix", "LQFpaHEwXR");
        setField(term8052, term8052.getClass(), "modelNameSuffix", "oVcInYnLWB");
        setField(term8052, term8052.getClass(), "groupId", "aJlieCFVtF");
        setField(term8052, term8052.getClass(), "artifactId", "ZiaGIbnzTs");
        setField(term8052, term8052.getClass(), "artifactVersion", "tbcdzjIfER");
        setField(term8185, term8185.getClass(), "m", term8186);
        setField(term8185, term8185.getClass(), "keySet", null);
        setField(term8185, term8185.getClass(), "entrySet", null);
        setField(term8185, term8185.getClass(), "values", null);
        setField(term8052, term8052.getClass(), "additionalProperties", term8185);
        setField(term8052, term8052.getClass(), "gitHost", "github.com");
        setField(term8052, term8052.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term8052, term8052.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term8052, term8052.getClass(), "releaseNote", "Minor update");
        setField(term8052, term8052.getClass(), "httpUserAgent", "HyxfbSQYBe");
        HashMap term8317 = new HashMap();
        Boolean term8323 = new Boolean(true);
        Boolean term8325 = new Boolean(false);
        term8255 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term8316 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term8255, term8255.getClass(), "inputSpec", "pCTimMblYc");
        setField(term8255, term8255.getClass(), "outputDir", ".");
        setBooleanField(term8255, term8255.getClass(), "verbose", true);
        setBooleanField(term8255, term8255.getClass(), "skipOverwrite", false);
        setBooleanField(term8255, term8255.getClass(), "removeOperationIdPrefix", true);
        setBooleanField(term8255, term8255.getClass(), "skipOperationExample", false);
        setBooleanField(term8255, term8255.getClass(), "logToStderr", false);
        setBooleanField(term8255, term8255.getClass(), "validateSpec", true);
        setBooleanField(term8255, term8255.getClass(), "enablePostProcessFile", true);
        setBooleanField(term8255, term8255.getClass(), "enableMinimalUpdate", true);
        setBooleanField(term8255, term8255.getClass(), "strictSpecBehavior", true);
        setField(term8255, term8255.getClass(), "templateDir", "hNxWaHcfhY");
        setField(term8255, term8255.getClass(), "templatingEngineName", "handlebars");
        setField(term8255, term8255.getClass(), "ignoreFileOverride", "RkybSrpybU");
        setField(term8316, term8316.getClass(), "m", term8317);
        setField(term8316, term8316.getClass(), "keySet", null);
        setField(term8316, term8316.getClass(), "entrySet", null);
        setField(term8316, term8316.getClass(), "values", null);
        setField(term8255, term8255.getClass(), "globalProperties", term8316);
        setBooleanField(term8255, term8255.getClass(), "removeEnumValuePrefix", false);
        setField(term8255, term8255.getClass(), "hideGenerationTimestamp", term8323);
        setField(term8255, term8255.getClass(), "intsAllowedForFloatDoubleFormats", term8325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatorloader.GeneratorLoader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        argTypes[2] = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Object[] args = new Object[3];
        args[0] = "SzjVpOQTyS";
        args[1] = term8052;
        args[2] = term8255;
        callMethod(klass, "getGenerator", argTypes, null, args);
    }

};


