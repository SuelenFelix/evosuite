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

public class GeneratorSettings_Builder_withArtifactId_30995396910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3273;

    public GeneratorSettings_Builder_withArtifactId_30995396910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3394 = new HashMap();
        term3273 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term3273, term3273.getClass(), "generatorName", "sEnIVFtZuQ");
        setField(term3273, term3273.getClass(), "apiPackage", "ZVecLZMLHF");
        setField(term3273, term3273.getClass(), "invokerPackage", "fztQhjqwdP");
        setField(term3273, term3273.getClass(), "packageName", "eVpkWxjuki");
        setField(term3273, term3273.getClass(), "apiNameSuffix", "SJiQaLvSKv");
        setField(term3273, term3273.getClass(), "modelNamePrefix", "OEXDRUKcFl");
        setField(term3273, term3273.getClass(), "modelNameSuffix", "RYdKCNNMBR");
        setField(term3273, term3273.getClass(), "groupId", "yGtHPyvYiQ");
        setField(term3273, term3273.getClass(), "artifactId", "MvRIxilFMJ");
        setField(term3273, term3273.getClass(), "artifactVersion", "iNwOJRBEjp");
        setField(term3273, term3273.getClass(), "additionalProperties", term3394);
        setField(term3273, term3273.getClass(), "gitHost", "github.com");
        setField(term3273, term3273.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term3273, term3273.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term3273, term3273.getClass(), "releaseNote", "Minor update");
        setField(term3273, term3273.getClass(), "httpUserAgent", "XylxrMBraH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pORebkoRdD";
        callMethod(klass, "withArtifactId", argTypes, term3273, args);
    }

};


