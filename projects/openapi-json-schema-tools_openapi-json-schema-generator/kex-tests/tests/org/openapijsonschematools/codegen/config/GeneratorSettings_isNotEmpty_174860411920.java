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

public class GeneratorSettings_isNotEmpty_174860411920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46922;

    public GeneratorSettings_isNotEmpty_174860411920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term47056 = new HashMap();
        term46922 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term47055 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term46922, term46922.getClass(), "generatorName", "YQwoogpPyi");
        setField(term46922, term46922.getClass(), "apiPackage", "rnPhHoorxj");
        setField(term46922, term46922.getClass(), "modelPackage", "GuwJLKquuI");
        setField(term46922, term46922.getClass(), "invokerPackage", "vYMCjgnztg");
        setField(term46922, term46922.getClass(), "packageName", "YupgKTSEiI");
        setField(term46922, term46922.getClass(), "apiNameSuffix", "HuOUlaFmvJ");
        setField(term46922, term46922.getClass(), "modelNamePrefix", "dWVwcwFGNo");
        setField(term46922, term46922.getClass(), "modelNameSuffix", "PNdLRrSAIY");
        setField(term46922, term46922.getClass(), "groupId", "nJnRIRiLZK");
        setField(term46922, term46922.getClass(), "artifactId", "eWnrMSbYbT");
        setField(term46922, term46922.getClass(), "artifactVersion", "AjoFvDFyCY");
        setField(term47055, term47055.getClass(), "m", term47056);
        setField(term47055, term47055.getClass(), "keySet", null);
        setField(term47055, term47055.getClass(), "entrySet", null);
        setField(term47055, term47055.getClass(), "values", null);
        setField(term46922, term46922.getClass(), "additionalProperties", term47055);
        setField(term46922, term46922.getClass(), "gitHost", "github.com");
        setField(term46922, term46922.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term46922, term46922.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term46922, term46922.getClass(), "releaseNote", "Minor update");
        setField(term46922, term46922.getClass(), "httpUserAgent", "OFTJwdPiTG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QiUprSEluR";
        callMethod(klass, "isNotEmpty", argTypes, term46922, args);
    }

};


