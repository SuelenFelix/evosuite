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

public class GeneratorSettings_Builder_build_88403124219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6591;

    public GeneratorSettings_Builder_build_88403124219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6712 = new HashMap();
        term6591 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term6591, term6591.getClass(), "generatorName", "SFqCrhEWLm");
        setField(term6591, term6591.getClass(), "apiPackage", "GZdcJyZntS");
        setField(term6591, term6591.getClass(), "invokerPackage", "OIHoJeysUi");
        setField(term6591, term6591.getClass(), "packageName", "WXMWFDGcLB");
        setField(term6591, term6591.getClass(), "apiNameSuffix", "wKWbJssZuG");
        setField(term6591, term6591.getClass(), "modelNamePrefix", "NzBMMhkhpT");
        setField(term6591, term6591.getClass(), "modelNameSuffix", "qCpEbQDHdF");
        setField(term6591, term6591.getClass(), "groupId", "AHbZyFOmlo");
        setField(term6591, term6591.getClass(), "artifactId", "TwfWVQGiIj");
        setField(term6591, term6591.getClass(), "artifactVersion", "gUvcueTURF");
        setField(term6591, term6591.getClass(), "additionalProperties", term6712);
        setField(term6591, term6591.getClass(), "gitHost", "github.com");
        setField(term6591, term6591.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term6591, term6591.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term6591, term6591.getClass(), "releaseNote", "Minor update");
        setField(term6591, term6591.getClass(), "httpUserAgent", "EwQBhZjCIT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term6591, args);
    }

};


