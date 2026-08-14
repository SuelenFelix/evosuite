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

public class GeneratorSettings_Builder_withHttpUserAgent_154287736818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6225;

    public GeneratorSettings_Builder_withHttpUserAgent_154287736818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6346 = new HashMap();
        term6225 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term6225, term6225.getClass(), "generatorName", "AZdLeSugwv");
        setField(term6225, term6225.getClass(), "apiPackage", "RMsXuyzKJV");
        setField(term6225, term6225.getClass(), "invokerPackage", "FwPbDZcHmB");
        setField(term6225, term6225.getClass(), "packageName", "hOncybyCAH");
        setField(term6225, term6225.getClass(), "apiNameSuffix", "QduALnDSVo");
        setField(term6225, term6225.getClass(), "modelNamePrefix", "izPpKDErnQ");
        setField(term6225, term6225.getClass(), "modelNameSuffix", "NnpwZBUTvx");
        setField(term6225, term6225.getClass(), "groupId", "tlQSNgTkQX");
        setField(term6225, term6225.getClass(), "artifactId", "PCipZnmBOF");
        setField(term6225, term6225.getClass(), "artifactVersion", "zcorEihhLK");
        setField(term6225, term6225.getClass(), "additionalProperties", term6346);
        setField(term6225, term6225.getClass(), "gitHost", "github.com");
        setField(term6225, term6225.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term6225, term6225.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term6225, term6225.getClass(), "releaseNote", "Minor update");
        setField(term6225, term6225.getClass(), "httpUserAgent", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CFyoseFGLF";
        callMethod(klass, "withHttpUserAgent", argTypes, term6225, args);
    }

};


