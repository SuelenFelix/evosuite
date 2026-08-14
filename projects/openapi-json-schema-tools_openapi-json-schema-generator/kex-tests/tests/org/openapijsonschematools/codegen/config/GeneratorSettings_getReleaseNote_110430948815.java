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

public class GeneratorSettings_getReleaseNote_110430948815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45477;

    public GeneratorSettings_getReleaseNote_110430948815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term45611 = new HashMap();
        term45477 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings"));
        Object term45610 = newInstance(Class.forName("java.util.Collections$UnmodifiableMap"));
        setField(term45477, term45477.getClass(), "generatorName", "FlxVmiMYKP");
        setField(term45477, term45477.getClass(), "apiPackage", "fgOpAWlGYN");
        setField(term45477, term45477.getClass(), "modelPackage", "PNzNzzjSXM");
        setField(term45477, term45477.getClass(), "invokerPackage", "ktKcSZiuGM");
        setField(term45477, term45477.getClass(), "packageName", "PSOttyUeqv");
        setField(term45477, term45477.getClass(), "apiNameSuffix", "HmEvTlmzXo");
        setField(term45477, term45477.getClass(), "modelNamePrefix", "BMMonTIZgJ");
        setField(term45477, term45477.getClass(), "modelNameSuffix", "QXyFXBjFde");
        setField(term45477, term45477.getClass(), "groupId", "xVFgeyYxZS");
        setField(term45477, term45477.getClass(), "artifactId", "iQiGTulJiH");
        setField(term45477, term45477.getClass(), "artifactVersion", "utCuuVCKqE");
        setField(term45610, term45610.getClass(), "m", term45611);
        setField(term45610, term45610.getClass(), "keySet", null);
        setField(term45610, term45610.getClass(), "entrySet", null);
        setField(term45610, term45610.getClass(), "values", null);
        setField(term45477, term45477.getClass(), "additionalProperties", term45610);
        setField(term45477, term45477.getClass(), "gitHost", "github.com");
        setField(term45477, term45477.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term45477, term45477.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term45477, term45477.getClass(), "releaseNote", "Minor update");
        setField(term45477, term45477.getClass(), "httpUserAgent", "zSfoqzJbPT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseNote", argTypes, term45477, args);
    }

};


