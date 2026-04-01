package org.openapijsonschematools.codegen.generatorrunner;

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
import static org.openapijsonschematools.codegen.generatorrunner.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultGeneratorRunner_1OperationIdComparator_compare_11363462291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4696;
     Object term4697;
     Object term4759;

    public DefaultGeneratorRunner_1OperationIdComparator_compare_11363462291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4696 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.DefaultGeneratorRunner$1OperationIdComparator"));
        setField(term4696, term4696.getClass(), "this$0", null);
        term4697 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        setField(term4697, term4697.getClass(), "original", "MxlszYVzRf");
        setBooleanField(term4697, term4697.getClass(), "isValid", false);
        setField(term4697, term4697.getClass(), "snakeCase", "LQFpaHEwXR");
        setField(term4697, term4697.getClass(), "pascalCase", "oVcInYnLWB");
        setField(term4697, term4697.getClass(), "camelCase", "aJlieCFVtF");
        setField(term4697, term4697.getClass(), "kebabCase", "ZiaGIbnzTs");
        term4759 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        setField(term4759, term4759.getClass(), "original", "tbcdzjIfER");
        setBooleanField(term4759, term4759.getClass(), "isValid", false);
        setField(term4759, term4759.getClass(), "snakeCase", "HyxfbSQYBe");
        setField(term4759, term4759.getClass(), "pascalCase", "pCTimMblYc");
        setField(term4759, term4759.getClass(), "camelCase", "hNxWaHcfhY");
        setField(term4759, term4759.getClass(), "kebabCase", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.DefaultGeneratorRunner$1OperationIdComparator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey");
        Object[] args = new Object[2];
        args[0] = term4697;
        args[1] = term4759;
        callMethod(klass, "compare", argTypes, term4696, args);
    }

};


