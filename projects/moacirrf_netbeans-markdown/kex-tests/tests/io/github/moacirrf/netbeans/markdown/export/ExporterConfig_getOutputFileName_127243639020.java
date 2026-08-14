package io.github.moacirrf.netbeans.markdown.export;

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
import static io.github.moacirrf.netbeans.markdown.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExporterConfig_getOutputFileName_127243639020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3480;

    public ExporterConfig_getOutputFileName_127243639020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3480 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig"));
        setField(term3480, term3480.getClass(), "destinyFolder", null);
        setField(term3480, term3480.getClass(), "mdfiles", null);
        setBooleanField(term3480, term3480.getClass(), "uniqueFile", false);
        setField(term3480, term3480.getClass(), "outputFileName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOutputFileName", argTypes, term3480, args);
    }

};


