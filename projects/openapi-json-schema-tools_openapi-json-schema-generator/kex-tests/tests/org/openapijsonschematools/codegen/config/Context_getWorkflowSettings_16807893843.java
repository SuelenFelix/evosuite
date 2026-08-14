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

public class Context_getWorkflowSettings_16807893843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8289;

    public Context_getWorkflowSettings_16807893843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8424 = new HashMap();
        HashMap term8519 = new HashMap();
        Boolean term8525 = new Boolean(true);
        Boolean term8527 = new Boolean(false);
        term8289 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.Context"));
        Object term8290 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term8423 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        Object term8493 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term8518 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term8289, term8289.getClass(), "specDocument", null);
        setField(term8290, term8290.getClass(), "generatorName", "SPtPatHeOm");
        setField(term8290, term8290.getClass(), "apiPackage", "ywmcuThdfL");
        setField(term8290, term8290.getClass(), "modelPackage", "GBOEuByOfr");
        setField(term8290, term8290.getClass(), "invokerPackage", "NHbOFFjyVK");
        setField(term8290, term8290.getClass(), "packageName", "zaloBqlrSo");
        setField(term8290, term8290.getClass(), "apiNameSuffix", "vvoLrMGCoN");
        setField(term8290, term8290.getClass(), "modelNamePrefix", "pXdglvyrQe");
        setField(term8290, term8290.getClass(), "modelNameSuffix", "OcfNzHYdki");
        setField(term8290, term8290.getClass(), "groupId", "uPuCVuZYOI");
        setField(term8290, term8290.getClass(), "artifactId", "TweMFhxNdj");
        setField(term8290, term8290.getClass(), "artifactVersion", "NBrvVzvQHe");
        setField(term8423, term8423.getClass(), "m", term8424);
        setField(term8423, term8423.getClass(), "keySet", null);
        setField(term8423, term8423.getClass(), "entrySet", null);
        setField(term8423, term8423.getClass(), "values", null);
        setField(term8290, term8290.getClass(), "additionalProperties", term8423);
        setField(term8290, term8290.getClass(), "gitHost", "github.com");
        setField(term8290, term8290.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term8290, term8290.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term8290, term8290.getClass(), "releaseNote", "Minor update");
        setField(term8290, term8290.getClass(), "httpUserAgent", "FjOiNAfBOc");
        setField(term8289, term8289.getClass(), "generatorSettings", term8290);
        setField(term8493, term8493.getClass(), "inputSpec", null);
        setField(term8493, term8493.getClass(), "outputDir", ".");
        setBooleanField(term8493, term8493.getClass(), "verbose", false);
        setBooleanField(term8493, term8493.getClass(), "skipOverwrite", false);
        setBooleanField(term8493, term8493.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term8493, term8493.getClass(), "skipOperationExample", false);
        setBooleanField(term8493, term8493.getClass(), "logToStderr", false);
        setBooleanField(term8493, term8493.getClass(), "validateSpec", true);
        setBooleanField(term8493, term8493.getClass(), "enablePostProcessFile", false);
        setBooleanField(term8493, term8493.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term8493, term8493.getClass(), "strictSpecBehavior", true);
        setField(term8493, term8493.getClass(), "templateDir", null);
        setField(term8493, term8493.getClass(), "templatingEngineName", "handlebars");
        setField(term8493, term8493.getClass(), "ignoreFileOverride", null);
        setField(term8518, term8518.getClass(), "m", term8519);
        setField(term8518, term8518.getClass(), "keySet", null);
        setField(term8518, term8518.getClass(), "entrySet", null);
        setField(term8518, term8518.getClass(), "values", null);
        setField(term8493, term8493.getClass(), "globalProperties", term8518);
        setBooleanField(term8493, term8493.getClass(), "removeEnumValuePrefix", false);
        setField(term8493, term8493.getClass(), "hideGenerationTimestamp", term8525);
        setField(term8493, term8493.getClass(), "intsAllowedForFloatDoubleFormats", term8527);
        setField(term8289, term8289.getClass(), "workflowSettings", term8493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.Context");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowSettings", argTypes, term8289, args);
    }

};


