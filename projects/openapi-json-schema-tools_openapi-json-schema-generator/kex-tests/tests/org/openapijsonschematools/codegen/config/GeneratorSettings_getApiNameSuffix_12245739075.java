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

public class GeneratorSettings_getApiNameSuffix_12245739075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41807;

    public GeneratorSettings_getApiNameSuffix_12245739075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term41941 = new HashMap();
        term41807 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term41940 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term41807, term41807.getClass(), "generatorName", "YfkhviKZwl");
        setField(term41807, term41807.getClass(), "apiPackage", "DcOhhAfJTI");
        setField(term41807, term41807.getClass(), "modelPackage", "gYTIkBFOoS");
        setField(term41807, term41807.getClass(), "invokerPackage", "xmzSoVgiED");
        setField(term41807, term41807.getClass(), "packageName", "pdSvedKgPq");
        setField(term41807, term41807.getClass(), "apiNameSuffix", "epPTwvcoyb");
        setField(term41807, term41807.getClass(), "modelNamePrefix", "UBPHmOICBs");
        setField(term41807, term41807.getClass(), "modelNameSuffix", "IDJUVPgUJf");
        setField(term41807, term41807.getClass(), "groupId", "JmnWRJUxGr");
        setField(term41807, term41807.getClass(), "artifactId", "wgRGBNrTGP");
        setField(term41807, term41807.getClass(), "artifactVersion", "FIdNVptZpW");
        setField(term41940, term41940.getClass(), "m", term41941);
        setField(term41940, term41940.getClass(), "keySet", null);
        setField(term41940, term41940.getClass(), "entrySet", null);
        setField(term41940, term41940.getClass(), "values", null);
        setField(term41807, term41807.getClass(), "additionalProperties", term41940);
        setField(term41807, term41807.getClass(), "gitHost", "github.com");
        setField(term41807, term41807.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term41807, term41807.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term41807, term41807.getClass(), "releaseNote", "Minor update");
        setField(term41807, term41807.getClass(), "httpUserAgent", "rQjxAhisjm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getApiNameSuffix", argTypes, term41807, args);
    }

};


