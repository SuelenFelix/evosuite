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

public class GeneratorSettings_Builder_withGroupId_2087202729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2907;

    public GeneratorSettings_Builder_withGroupId_2087202729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3028 = new HashMap();
        term2907 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term2907, term2907.getClass(), "generatorName", "DfISiziTgG");
        setField(term2907, term2907.getClass(), "apiPackage", "XqgfKFvPSD");
        setField(term2907, term2907.getClass(), "invokerPackage", "JiVRgTZvKc");
        setField(term2907, term2907.getClass(), "packageName", "XPKmummaqg");
        setField(term2907, term2907.getClass(), "apiNameSuffix", "BKLfkLiZTH");
        setField(term2907, term2907.getClass(), "modelNamePrefix", "SPpkrGcPRr");
        setField(term2907, term2907.getClass(), "modelNameSuffix", "sEccwbJKYE");
        setField(term2907, term2907.getClass(), "groupId", "AWRooQKkdW");
        setField(term2907, term2907.getClass(), "artifactId", "vjxIhXHxGR");
        setField(term2907, term2907.getClass(), "artifactVersion", "QXzGXbEXMu");
        setField(term2907, term2907.getClass(), "additionalProperties", term3028);
        setField(term2907, term2907.getClass(), "gitHost", "github.com");
        setField(term2907, term2907.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term2907, term2907.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term2907, term2907.getClass(), "releaseNote", "Minor update");
        setField(term2907, term2907.getClass(), "httpUserAgent", "qxSDVejjiY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        callMethod(klass, "withGroupId", argTypes, term2907, args);
    }

};


