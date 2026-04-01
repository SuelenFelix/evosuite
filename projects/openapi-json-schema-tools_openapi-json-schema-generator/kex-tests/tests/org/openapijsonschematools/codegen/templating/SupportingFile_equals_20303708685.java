package org.openapijsonschematools.codegen.templating;

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
import static org.openapijsonschematools.codegen.templating.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class SupportingFile_equals_20303708685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2032;
     Object term2096;

    public SupportingFile_equals_20303708685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2128 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term2127 = ((Class) term2128).getDeclaredField((String) "ModelTests");
        ((Field) term2127).setAccessible(true);
        Object enum4 = ((Field) term2127).get((Object) null);
        term2032 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile"));
        setBooleanField(term2032, term2032.getClass(), "canOverwrite", false);
        setField(term2032, term2032.getClass(), "templateFile", "tbcdzjIfER");
        setField(term2032, term2032.getClass(), "folder", "HyxfbSQYBe");
        setField(term2032, term2032.getClass(), "destinationFilename", "pCTimMblYc");
        setField(term2032, term2032.getClass(), "templateType", enum4);
        term2096 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2096;
        callMethod(klass, "equals", argTypes, term2032, args);
    }

};


