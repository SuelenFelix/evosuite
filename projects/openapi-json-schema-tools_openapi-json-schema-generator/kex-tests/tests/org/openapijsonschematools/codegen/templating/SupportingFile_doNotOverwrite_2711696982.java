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

public class SupportingFile_doNotOverwrite_2711696982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;

    public SupportingFile_doNotOverwrite_2711696982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term425 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term424 = ((Class) term425).getDeclaredField((String) "APIDocs");
        ((Field) term424).setAccessible(true);
        Object enum0 = ((Field) term424).get((Object) null);
        term178 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile"));
        setBooleanField(term178, term178.getClass(), "canOverwrite", false);
        setField(term178, term178.getClass(), "templateFile", "hRNSzYYIrc");
        setField(term178, term178.getClass(), "folder", "RMFIsYGgne");
        setField(term178, term178.getClass(), "destinationFilename", "NRdvgJlhkX");
        setField(term178, term178.getClass(), "templateType", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doNotOverwrite", argTypes, term178, args);
    }

};


