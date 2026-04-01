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

public class GeneratorSettings_getArtifactId_20395668009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43275;

    public GeneratorSettings_getArtifactId_20395668009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43409 = new HashMap();
        term43275 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term43408 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term43275, term43275.getClass(), "generatorName", "zyZTzHNjQr");
        setField(term43275, term43275.getClass(), "apiPackage", "YSrFKQQwXE");
        setField(term43275, term43275.getClass(), "modelPackage", "qxhOsmyyjm");
        setField(term43275, term43275.getClass(), "invokerPackage", "DuKcNfVVYR");
        setField(term43275, term43275.getClass(), "packageName", "fRujHWvXjJ");
        setField(term43275, term43275.getClass(), "apiNameSuffix", "EAIAAStlTz");
        setField(term43275, term43275.getClass(), "modelNamePrefix", "yIWXcOQTgy");
        setField(term43275, term43275.getClass(), "modelNameSuffix", "xAWekqanqc");
        setField(term43275, term43275.getClass(), "groupId", "GSOWFHMlbF");
        setField(term43275, term43275.getClass(), "artifactId", "vpZIqpFbKM");
        setField(term43275, term43275.getClass(), "artifactVersion", "dAbwpJCDif");
        setField(term43408, term43408.getClass(), "m", term43409);
        setField(term43408, term43408.getClass(), "keySet", null);
        setField(term43408, term43408.getClass(), "entrySet", null);
        setField(term43408, term43408.getClass(), "values", null);
        setField(term43275, term43275.getClass(), "additionalProperties", term43408);
        setField(term43275, term43275.getClass(), "gitHost", "github.com");
        setField(term43275, term43275.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term43275, term43275.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term43275, term43275.getClass(), "releaseNote", "Minor update");
        setField(term43275, term43275.getClass(), "httpUserAgent", "ATSXJPySio");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtifactId", argTypes, term43275, args);
    }

};


