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

public class GeneratorSettings_getGitRepoId_152475496614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45110;

    public GeneratorSettings_getGitRepoId_152475496614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term45244 = new HashMap();
        term45110 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term45243 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term45110, term45110.getClass(), "generatorName", "aJQuCOCvZs");
        setField(term45110, term45110.getClass(), "apiPackage", "lHYNCJRiOv");
        setField(term45110, term45110.getClass(), "modelPackage", "QVLresHoaP");
        setField(term45110, term45110.getClass(), "invokerPackage", "IbxeAMwLVt");
        setField(term45110, term45110.getClass(), "packageName", "bShlAqoTmZ");
        setField(term45110, term45110.getClass(), "apiNameSuffix", "nOKlKlNhtU");
        setField(term45110, term45110.getClass(), "modelNamePrefix", "gXFNBHJSey");
        setField(term45110, term45110.getClass(), "modelNameSuffix", "wUcSfItZgv");
        setField(term45110, term45110.getClass(), "groupId", "rOfPCPHmtJ");
        setField(term45110, term45110.getClass(), "artifactId", "EnmiAvfpJv");
        setField(term45110, term45110.getClass(), "artifactVersion", "AdYzLPMcwe");
        setField(term45243, term45243.getClass(), "m", term45244);
        setField(term45243, term45243.getClass(), "keySet", null);
        setField(term45243, term45243.getClass(), "entrySet", null);
        setField(term45243, term45243.getClass(), "values", null);
        setField(term45110, term45110.getClass(), "additionalProperties", term45243);
        setField(term45110, term45110.getClass(), "gitHost", "github.com");
        setField(term45110, term45110.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term45110, term45110.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term45110, term45110.getClass(), "releaseNote", "Minor update");
        setField(term45110, term45110.getClass(), "httpUserAgent", "FrTZLybkKk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGitRepoId", argTypes, term45110, args);
    }

};


