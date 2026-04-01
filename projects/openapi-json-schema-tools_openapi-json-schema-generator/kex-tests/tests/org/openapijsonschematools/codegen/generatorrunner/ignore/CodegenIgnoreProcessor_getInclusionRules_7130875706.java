package org.openapijsonschematools.codegen.generatorrunner.ignore;

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
import static org.openapijsonschematools.codegen.generatorrunner.ignore.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class CodegenIgnoreProcessor_getInclusionRules_7130875706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5747;

    public CodegenIgnoreProcessor_getInclusionRules_7130875706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5792 = Class.forName((String) "java.io.File$PathStatus");
        Field term5791 = ((Class) term5792).getDeclaredField((String) "CHECKED");
        ((Field) term5791).setAccessible(true);
        Object enum14 = ((Field) term5791).get((Object) null);
        ArrayList term5773 = new ArrayList();
        ArrayList term5777 = new ArrayList();
        ((ArrayList) term5777).add((Object)null);
        term5747 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor"));
        Object term5748 = newInstance(Class.forName("java.io.File"));
        setField(term5747, term5747.getClass(), "LOGGER", null);
        setField(term5748, term5748.getClass(), "path", "xOEqzGAmDU");
        setField(term5748, term5748.getClass(), "status", enum14);
        setIntField(term5748, term5748.getClass(), "prefixLength", -2038273078);
        setField(term5748, term5748.getClass(), "filePath", null);
        setField(term5747, term5747.getClass(), "ignoreFile", term5748);
        setField(term5747, term5747.getClass(), "exclusionRules", term5773);
        setField(term5747, term5747.getClass(), "inclusionRules", term5777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInclusionRules", argTypes, term5747, args);
    }

};


