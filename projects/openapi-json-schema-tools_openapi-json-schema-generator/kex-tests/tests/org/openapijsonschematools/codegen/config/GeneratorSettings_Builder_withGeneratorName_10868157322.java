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

public class GeneratorSettings_Builder_withGeneratorName_10868157322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;

    public GeneratorSettings_Builder_withGeneratorName_10868157322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term466 = new HashMap();
        term345 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder"));
        setField(term345, term345.getClass(), "generatorName", "uuaPigETmJ");
        setField(term345, term345.getClass(), "apiPackage", "MxlszYVzRf");
        setField(term345, term345.getClass(), "invokerPackage", "LQFpaHEwXR");
        setField(term345, term345.getClass(), "packageName", "oVcInYnLWB");
        setField(term345, term345.getClass(), "apiNameSuffix", "aJlieCFVtF");
        setField(term345, term345.getClass(), "modelNamePrefix", "ZiaGIbnzTs");
        setField(term345, term345.getClass(), "modelNameSuffix", "tbcdzjIfER");
        setField(term345, term345.getClass(), "groupId", "HyxfbSQYBe");
        setField(term345, term345.getClass(), "artifactId", "pCTimMblYc");
        setField(term345, term345.getClass(), "artifactVersion", "hNxWaHcfhY");
        setField(term345, term345.getClass(), "additionalProperties", term466);
        setField(term345, term345.getClass(), "gitHost", "github.com");
        setField(term345, term345.getClass(), "gitUserId", "GIT_USER_ID");
        setField(term345, term345.getClass(), "gitRepoId", "GIT_REPO_ID");
        setField(term345, term345.getClass(), "releaseNote", "Minor update");
        setField(term345, term345.getClass(), "httpUserAgent", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.GeneratorSettings$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "withGeneratorName", argTypes, term345, args);
    }

};


