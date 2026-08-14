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

public class GeneratorSettings_Builder_withGitUserId_143114679815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5127;

    public GeneratorSettings_Builder_withGitUserId_143114679815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5248 = new HashMap();
        term5127 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term5127, term5127.getClass(), "generatorName", "rLHAoqXgPh");
        setField(term5127, term5127.getClass(), "apiPackage", "zUlRdimJtU");
        setField(term5127, term5127.getClass(), "invokerPackage", "vwbEQQNQrx");
        setField(term5127, term5127.getClass(), "packageName", "xtftXXMbem");
        setField(term5127, term5127.getClass(), "apiNameSuffix", "cudZvLMQon");
        setField(term5127, term5127.getClass(), "modelNamePrefix", "lihXWlGDxk");
        setField(term5127, term5127.getClass(), "modelNameSuffix", "JmcmxoGhIK");
        setField(term5127, term5127.getClass(), "groupId", "jXzmYyrnnT");
        setField(term5127, term5127.getClass(), "artifactId", "igCAtimmYB");
        setField(term5127, term5127.getClass(), "artifactVersion", "DyiXbeYIaN");
        setField(term5127, term5127.getClass(), "additionalProperties", term5248);
        setField(term5127, term5127.getClass(), "gitHost", "github.com");
        setField(term5127, term5127.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term5127, term5127.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term5127, term5127.getClass(), "releaseNote", "Minor update");
        setField(term5127, term5127.getClass(), "httpUserAgent", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kVEZMHmRtR";
        callMethod(klass, "withGitUserId", argTypes, term5127, args);
    }

};


