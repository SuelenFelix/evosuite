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

public class SupportingFile_setTemplateType_10928026323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762;
     Object enum2;

    public SupportingFile_setTemplateType_10928026323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term889 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term888 = ((Class) term889).getDeclaredField((String) "APITests");
        ((Field) term888).setAccessible(true);
        Object enum1 = ((Field) term888).get((Object) null);
        term762 = newInstance(Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile"));
        setBooleanField(term762, term762.getClass(), "canOverwrite", false);
        setField(term762, term762.getClass(), "templateFile", "uuaPigETmJ");
        setField(term762, term762.getClass(), "folder", "MxlszYVzRf");
        setField(term762, term762.getClass(), "destinationFilename", "LQFpaHEwXR");
        setField(term762, term762.getClass(), "templateType", enum1);
        Class<? extends Object> term1230 = Class.forName((String) "org.openapijsonschematools.codegen.templating.TemplateFileType");
        Field term1229 = ((Class) term1230).getDeclaredField((String) "SupportingFiles");
        ((Field) term1229).setAccessible(true);
        enum2 = ((Field) term1229).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.templating.SupportingFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.templating.TemplateFileType");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "setTemplateType", argTypes, term762, args);
    }

};


