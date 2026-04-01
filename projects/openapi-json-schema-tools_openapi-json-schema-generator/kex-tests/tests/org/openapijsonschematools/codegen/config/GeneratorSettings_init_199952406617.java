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

public class GeneratorSettings_init_199952406617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46211;

    public GeneratorSettings_init_199952406617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46332 = new HashMap();
        term46211 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term46211, term46211.getClass(), "generatorName", "KpurAcrHYT");
        setField(term46211, term46211.getClass(), "apiPackage", "QjvDwgKJGz");
        setField(term46211, term46211.getClass(), "invokerPackage", "ngYxiXTZrk");
        setField(term46211, term46211.getClass(), "packageName", "YTxBqWRAlo");
        setField(term46211, term46211.getClass(), "apiNameSuffix", "ReruUQRXwl");
        setField(term46211, term46211.getClass(), "modelNamePrefix", "DWEsVQwuaE");
        setField(term46211, term46211.getClass(), "modelNameSuffix", "qGkNzZAeDN");
        setField(term46211, term46211.getClass(), "groupId", "wdtiuPgTVJ");
        setField(term46211, term46211.getClass(), "artifactId", "HUgzMgrpsK");
        setField(term46211, term46211.getClass(), "artifactVersion", "ubaBUfLolu");
        setField(term46211, term46211.getClass(), "additionalProperties", term46332);
        setField(term46211, term46211.getClass(), "gitHost", "github.com");
        setField(term46211, term46211.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term46211, term46211.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term46211, term46211.getClass(), "releaseNote", "Minor update");
        setField(term46211, term46211.getClass(), "httpUserAgent", "itAUCFhZhq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Object[] args = new Object[1];
        args[0] = term46211;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


