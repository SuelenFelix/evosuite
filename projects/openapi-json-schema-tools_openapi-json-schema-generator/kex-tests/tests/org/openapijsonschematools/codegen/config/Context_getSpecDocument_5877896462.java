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

public class Context_getSpecDocument_5877896462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7874;

    public Context_getSpecDocument_5877896462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8009 = new HashMap();
        HashMap term8104 = new HashMap();
        Boolean term8110 = new Boolean(true);
        Boolean term8112 = new Boolean(false);
        term7874 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.Context"));
        Object term7875 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term8008 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        Object term8078 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.WorkflowSettings"));
        Object term8103 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term7874, term7874.getClass(), "specDocument", null);
        setField(term7875, term7875.getClass(), "generatorName", "ypEdrstygY");
        setField(term7875, term7875.getClass(), "apiPackage", "sNQFlATEeQ");
        setField(term7875, term7875.getClass(), "modelPackage", "ZKMLioamsY");
        setField(term7875, term7875.getClass(), "invokerPackage", "WVbxuoDBcn");
        setField(term7875, term7875.getClass(), "packageName", "pvDEABOxLt");
        setField(term7875, term7875.getClass(), "apiNameSuffix", "beAMpkroCQ");
        setField(term7875, term7875.getClass(), "modelNamePrefix", "uSUvKAyuvd");
        setField(term7875, term7875.getClass(), "modelNameSuffix", "onQLVONGuf");
        setField(term7875, term7875.getClass(), "groupId", "SOrEHbcbmn");
        setField(term7875, term7875.getClass(), "artifactId", "bnsyeQXFdu");
        setField(term7875, term7875.getClass(), "artifactVersion", "BwtdjiefJn");
        setField(term8008, term8008.getClass(), "m", term8009);
        setField(term8008, term8008.getClass(), "keySet", null);
        setField(term8008, term8008.getClass(), "entrySet", null);
        setField(term8008, term8008.getClass(), "values", null);
        setField(term7875, term7875.getClass(), "additionalProperties", term8008);
        setField(term7875, term7875.getClass(), "gitHost", "github.com");
        setField(term7875, term7875.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term7875, term7875.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term7875, term7875.getClass(), "releaseNote", "Minor update");
        setField(term7875, term7875.getClass(), "httpUserAgent", "jDmhBrIoDa");
        setField(term7874, term7874.getClass(), "generatorSettings", term7875);
        setField(term8078, term8078.getClass(), "inputSpec", null);
        setField(term8078, term8078.getClass(), "outputDir", ".");
        setBooleanField(term8078, term8078.getClass(), "verbose", false);
        setBooleanField(term8078, term8078.getClass(), "skipOverwrite", false);
        setBooleanField(term8078, term8078.getClass(), "removeOperationIdPrefix", false);
        setBooleanField(term8078, term8078.getClass(), "skipOperationExample", false);
        setBooleanField(term8078, term8078.getClass(), "logToStderr", false);
        setBooleanField(term8078, term8078.getClass(), "validateSpec", true);
        setBooleanField(term8078, term8078.getClass(), "enablePostProcessFile", false);
        setBooleanField(term8078, term8078.getClass(), "enableMinimalUpdate", false);
        setBooleanField(term8078, term8078.getClass(), "strictSpecBehavior", true);
        setField(term8078, term8078.getClass(), "templateDir", null);
        setField(term8078, term8078.getClass(), "templatingEngineName", "handlebars");
        setField(term8078, term8078.getClass(), "ignoreFileOverride", null);
        setField(term8103, term8103.getClass(), "m", term8104);
        setField(term8103, term8103.getClass(), "keySet", null);
        setField(term8103, term8103.getClass(), "entrySet", null);
        setField(term8103, term8103.getClass(), "values", null);
        setField(term8078, term8078.getClass(), "globalProperties", term8103);
        setBooleanField(term8078, term8078.getClass(), "removeEnumValuePrefix", false);
        setField(term8078, term8078.getClass(), "hideGenerationTimestamp", term8110);
        setField(term8078, term8078.getClass(), "intsAllowedForFloatDoubleFormats", term8112);
        setField(term7874, term7874.getClass(), "workflowSettings", term8078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.Context");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpecDocument", argTypes, term7874, args);
    }

};


