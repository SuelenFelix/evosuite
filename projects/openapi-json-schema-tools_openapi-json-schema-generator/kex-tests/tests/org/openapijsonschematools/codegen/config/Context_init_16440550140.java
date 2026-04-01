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

public class Context_init_16440550140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6978;
     Object term6979;
     Object term7182;

    public Context_init_16440550140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6978 = newInstance(Class.forName("java.lang.Object"));
        HashMap term7113 = new HashMap();
        term6979 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term7112 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term6979, term6979.getClass(), "generatorName", "xvkbvaEGYd");
        setField(term6979, term6979.getClass(), "apiPackage", "HBGNxdNURv");
        setField(term6979, term6979.getClass(), "modelPackage", "mfCpTPPQQm");
        setField(term6979, term6979.getClass(), "invokerPackage", "OcJCIDNIXA");
        setField(term6979, term6979.getClass(), "packageName", "XfRABIFVEp");
        setField(term6979, term6979.getClass(), "apiNameSuffix", "MHGKyEnwKc");
        setField(term6979, term6979.getClass(), "modelNamePrefix", "ShIELyuULw");
        setField(term6979, term6979.getClass(), "modelNameSuffix", "IpQuOGMgmj");
        setField(term6979, term6979.getClass(), "groupId", "pJbnHTYrxn");
        setField(term6979, term6979.getClass(), "artifactId", "iIRsCSYqXH");
        setField(term6979, term6979.getClass(), "artifactVersion", "nghfqDXyCG");
        setField(term7112, term7112.getClass(), "m", term7113);
        setField(term7112, term7112.getClass(), "keySet", null);
        setField(term7112, term7112.getClass(), "entrySet", null);
        setField(term7112, term7112.getClass(), "values", null);
        setField(term6979, term6979.getClass(), "additionalProperties", term7112);
        setField(term6979, term6979.getClass(), "gitHost", "github.com");
        setField(term6979, term6979.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term6979, term6979.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term6979, term6979.getClass(), "releaseNote", "Minor update");
        setField(term6979, term6979.getClass(), "httpUserAgent", "WBAOTqErtm");
        HashMap term7244 = new HashMap();
        Boolean term7250 = new Boolean(true);
        Boolean term7252 = new Boolean(false);
        term7182 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term7243 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term7182, term7182.getClass(), "inputSpec", "PqtVXXZMqK");
        setField(term7182, term7182.getClass(), "outputDir", ".");
        setBooleanField(term7182, term7182.getClass(), "verbose", true);
        setBooleanField(term7182, term7182.getClass(), "skipOverwrite", false);
        setBooleanField(term7182, term7182.getClass(), "removeOperationIdPrefix", true);
        setBooleanField(term7182, term7182.getClass(), "skipOperationExample", false);
        setBooleanField(term7182, term7182.getClass(), "logToStderr", true);
        setBooleanField(term7182, term7182.getClass(), "validateSpec", true);
        setBooleanField(term7182, term7182.getClass(), "enablePostProcessFile", false);
        setBooleanField(term7182, term7182.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term7182, term7182.getClass(), "strictSpecBehavior", true);
        setField(term7182, term7182.getClass(), "templateDir", "rYbtIDVdnd");
        setField(term7182, term7182.getClass(), "templatingEngineName", "handlebars");
        setField(term7182, term7182.getClass(), "ignoreFileOverride", "UKAReurpHG");
        setField(term7243, term7243.getClass(), "m", term7244);
        setField(term7243, term7243.getClass(), "keySet", null);
        setField(term7243, term7243.getClass(), "entrySet", null);
        setField(term7243, term7243.getClass(), "values", null);
        setField(term7182, term7182.getClass(), "globalProperties", term7243);
        setBooleanField(term7182, term7182.getClass(), "removeEnumValuePrefix", true);
        setField(term7182, term7182.getClass(), "hideGenerationTimestamp", term7250);
        setField(term7182, term7182.getClass(), "intsAllowedForFloatDoubleFormats", term7252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.Context");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        argTypes[2] = Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings");
        Object[] args = new Object[3];
        args[0] = term6978;
        args[1] = term6979;
        args[2] = term7182;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


