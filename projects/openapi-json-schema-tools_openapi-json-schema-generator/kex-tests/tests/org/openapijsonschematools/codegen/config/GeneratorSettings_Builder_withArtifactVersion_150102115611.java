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
import java.util.HashMap;

public class GeneratorSettings_Builder_withArtifactVersion_150102115611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3639;

    public GeneratorSettings_Builder_withArtifactVersion_150102115611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3760 = new HashMap();
        term3639 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term3639, term3639.getClass(), "generatorName", "mXGCWJDOqA");
        setField(term3639, term3639.getClass(), "apiPackage", "dpNsDgfPso");
        setField(term3639, term3639.getClass(), "invokerPackage", "hCWPJQKpdc");
        setField(term3639, term3639.getClass(), "packageName", "WzMEhMXkKx");
        setField(term3639, term3639.getClass(), "apiNameSuffix", "XOiDvlDhdc");
        setField(term3639, term3639.getClass(), "modelNamePrefix", "AdxvLJhNLe");
        setField(term3639, term3639.getClass(), "modelNameSuffix", "lHfTrWKMPk");
        setField(term3639, term3639.getClass(), "groupId", "JDaAnsVTGV");
        setField(term3639, term3639.getClass(), "artifactId", "mLUZFTfjle");
        setField(term3639, term3639.getClass(), "artifactVersion", "xIeFjkHkOe");
        setField(term3639, term3639.getClass(), "additionalProperties", term3760);
        setField(term3639, term3639.getClass(), "gitHost", "github.com");
        setField(term3639, term3639.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term3639, term3639.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term3639, term3639.getClass(), "releaseNote", "Minor update");
        setField(term3639, term3639.getClass(), "httpUserAgent", "SdCKLMIYnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OJJtVNPyKZ";
        callMethod(klass, "withArtifactVersion", argTypes, term3639, args);
    }

};


