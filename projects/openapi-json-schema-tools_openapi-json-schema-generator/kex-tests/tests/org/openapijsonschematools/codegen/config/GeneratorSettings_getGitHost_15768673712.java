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

public class GeneratorSettings_getGitHost_15768673712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44376;

    public GeneratorSettings_getGitHost_15768673712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term44510 = new HashMap();
        term44376 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term44509 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term44376, term44376.getClass(), "generatorName", "ujxmmZZcbT");
        setField(term44376, term44376.getClass(), "apiPackage", "BOvgwHfoHQ");
        setField(term44376, term44376.getClass(), "modelPackage", "hPpFNeDBIb");
        setField(term44376, term44376.getClass(), "invokerPackage", "DNOtiLPAIY");
        setField(term44376, term44376.getClass(), "packageName", "FnEkAHBfyV");
        setField(term44376, term44376.getClass(), "apiNameSuffix", "VfmNFpEuax");
        setField(term44376, term44376.getClass(), "modelNamePrefix", "ANHjlWPmZG");
        setField(term44376, term44376.getClass(), "modelNameSuffix", "SibzENsyyy");
        setField(term44376, term44376.getClass(), "groupId", "mrqGHotaef");
        setField(term44376, term44376.getClass(), "artifactId", "UbZGBpQZQW");
        setField(term44376, term44376.getClass(), "artifactVersion", "SvGTualQPa");
        setField(term44509, term44509.getClass(), "m", term44510);
        setField(term44509, term44509.getClass(), "keySet", null);
        setField(term44509, term44509.getClass(), "entrySet", null);
        setField(term44509, term44509.getClass(), "values", null);
        setField(term44376, term44376.getClass(), "additionalProperties", term44509);
        setField(term44376, term44376.getClass(), "gitHost", "github.com");
        setField(term44376, term44376.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term44376, term44376.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term44376, term44376.getClass(), "releaseNote", "Minor update");
        setField(term44376, term44376.getClass(), "httpUserAgent", "mdxcgZwsaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGitHost", argTypes, term44376, args);
    }

};


