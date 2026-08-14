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

public class GeneratorSettings_getHttpUserAgent_189815704716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45844;

    public GeneratorSettings_getHttpUserAgent_189815704716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term45978 = new HashMap();
        term45844 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term45977 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term45844, term45844.getClass(), "generatorName", "QUymMnsCIj");
        setField(term45844, term45844.getClass(), "apiPackage", "ikTtOgdVYS");
        setField(term45844, term45844.getClass(), "modelPackage", "JptuwlirlS");
        setField(term45844, term45844.getClass(), "invokerPackage", "TKOMaGswbU");
        setField(term45844, term45844.getClass(), "packageName", "YcTbglHiUq");
        setField(term45844, term45844.getClass(), "apiNameSuffix", "TiUqHrjoEU");
        setField(term45844, term45844.getClass(), "modelNamePrefix", "eoEvZbdLjL");
        setField(term45844, term45844.getClass(), "modelNameSuffix", "BkIxsyPkGy");
        setField(term45844, term45844.getClass(), "groupId", "mrMGwoRgVY");
        setField(term45844, term45844.getClass(), "artifactId", "mxVLTgCwki");
        setField(term45844, term45844.getClass(), "artifactVersion", "wCurppnDSA");
        setField(term45977, term45977.getClass(), "m", term45978);
        setField(term45977, term45977.getClass(), "keySet", null);
        setField(term45977, term45977.getClass(), "entrySet", null);
        setField(term45977, term45977.getClass(), "values", null);
        setField(term45844, term45844.getClass(), "additionalProperties", term45977);
        setField(term45844, term45844.getClass(), "gitHost", "github.com");
        setField(term45844, term45844.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term45844, term45844.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term45844, term45844.getClass(), "releaseNote", "Minor update");
        setField(term45844, term45844.getClass(), "httpUserAgent", "JydxSNTMYt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpUserAgent", argTypes, term45844, args);
    }

};


