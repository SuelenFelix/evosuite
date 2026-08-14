package org.openapijsonschematools.codegen.generators.models;

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
import static org.openapijsonschematools.codegen.generators.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class CodeGeneratorSettings_of_1003289801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3313;
     Object term3516;

    public CodeGeneratorSettings_of_1003289801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3447 = new HashMap();
        term3313 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term3446 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term3313, term3313.getClass(), "generatorName", "xIeFjkHkOe");
        setField(term3313, term3313.getClass(), "apiPackage", "SdCKLMIYnX");
        setField(term3313, term3313.getClass(), "modelPackage", "OJJtVNPyKZ");
        setField(term3313, term3313.getClass(), "invokerPackage", "AKNapTAfmD");
        setField(term3313, term3313.getClass(), "packageName", "xJgPlLxpgC");
        setField(term3313, term3313.getClass(), "apiNameSuffix", "EYtfuJaxiM");
        setField(term3313, term3313.getClass(), "modelNamePrefix", "gCWtLVKVVe");
        setField(term3313, term3313.getClass(), "modelNameSuffix", "fWKJoSoCwE");
        setField(term3313, term3313.getClass(), "groupId", "wfaXBpWAUH");
        setField(term3313, term3313.getClass(), "artifactId", "VMeAzAHwZj");
        setField(term3313, term3313.getClass(), "artifactVersion", "PznxWXsZME");
        setField(term3446, term3446.getClass(), "m", term3447);
        setField(term3446, term3446.getClass(), "keySet", null);
        setField(term3446, term3446.getClass(), "entrySet", null);
        setField(term3446, term3446.getClass(), "values", null);
        setField(term3313, term3313.getClass(), "additionalProperties", term3446);
        setField(term3313, term3313.getClass(), "gitHost", "github.com");
        setField(term3313, term3313.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term3313, term3313.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term3313, term3313.getClass(), "releaseNote", "Minor update");
        setField(term3313, term3313.getClass(), "httpUserAgent", "ZzIujlwVsw");
        HashMap term3578 = new HashMap();
        Boolean term3584 = new Boolean(true);
        Boolean term3586 = new Boolean(false);
        term3516 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term3577 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term3516, term3516.getClass(), "inputSpec", "LWyEaeIyAo");
        setField(term3516, term3516.getClass(), "outputDir", ".");
        setBooleanField(term3516, term3516.getClass(), "verbose", false);
        setBooleanField(term3516, term3516.getClass(), "skipOverwrite", true);
        setBooleanField(term3516, term3516.getClass(), "removeOperationIdPrefix", true);
        setBooleanField(term3516, term3516.getClass(), "skipOperationExample", true);
        setBooleanField(term3516, term3516.getClass(), "logToStderr", true);
        setBooleanField(term3516, term3516.getClass(), "validateSpec", true);
        setBooleanField(term3516, term3516.getClass(), "enablePostProcessFile", true);
        setBooleanField(term3516, term3516.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term3516, term3516.getClass(), "strictSpecBehavior", true);
        setField(term3516, term3516.getClass(), "templateDir", "yVMkkQhvmN");
        setField(term3516, term3516.getClass(), "templatingEngineName", "handlebars");
        setField(term3516, term3516.getClass(), "ignoreFileOverride", "mvrkADEgpp");
        setField(term3577, term3577.getClass(), "m", term3578);
        setField(term3577, term3577.getClass(), "keySet", null);
        setField(term3577, term3577.getClass(), "entrySet", null);
        setField(term3577, term3577.getClass(), "values", null);
        setField(term3516, term3516.getClass(), "globalProperties", term3577);
        setBooleanField(term3516, term3516.getClass(), "removeEnumValuePrefix", false);
        setField(term3516, term3516.getClass(), "hideGenerationTimestamp", term3584);
        setField(term3516, term3516.getClass(), "intsAllowedForFloatDoubleFormats", term3586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CodeGeneratorSettings");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term3313;
        args[1] = term3516;
        args[2] = "pXOkjyeIRb";
        args[3] = "GgZWSjxjyE";
        args[4] = "EeBVbzjcCI";
        args[5] = "UfQtPRyWRC";
        callMethod(klass, "of", argTypes, null, args);
    }

};


