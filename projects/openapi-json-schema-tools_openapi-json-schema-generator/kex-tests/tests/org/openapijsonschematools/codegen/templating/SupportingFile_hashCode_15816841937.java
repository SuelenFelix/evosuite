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

public class SupportingFile_hashCode_15816841937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2910;

    public SupportingFile_hashCode_15816841937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2996 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term2995 = ((Class) term2996).getDeclaredField((String) "Model");
        ((Field) term2995).setAccessible(true);
        Object enum6 = ((Field) term2995).get((Object) null);
        term2910 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile"));
        setBooleanField(term2910, term2910.getClass(), "canOverwrite", true);
        setField(term2910, term2910.getClass(), "templateFile", "eZFUvlxvGV");
        setField(term2910, term2910.getClass(), "folder", "BYqFIqCKAV");
        setField(term2910, term2910.getClass(), "destinationFilename", "vrQLuWIDJX");
        setField(term2910, term2910.getClass(), "templateType", enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2910, args);
    }

};


