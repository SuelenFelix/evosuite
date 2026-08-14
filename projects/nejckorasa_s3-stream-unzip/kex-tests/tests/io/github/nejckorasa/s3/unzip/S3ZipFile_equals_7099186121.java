package io.github.nejckorasa.s3.unzip;

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
import static io.github.nejckorasa.s3.unzip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class S3ZipFile_equals_7099186121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17011;

    public S3ZipFile_equals_7099186121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17011 = newInstance(Class.forName("io.github.nejckorasa.s3.unzip.S3ZipFile"));
        setField(term17011, term17011.getClass(), "bucketName", null);
        setField(term17011, term17011.getClass(), "outputPrefix", null);
        setField(term17011, term17011.getClass(), "inputStream", null);
        setField(term17011, term17011.getClass(), "zipEntry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.nejckorasa.s3.unzip.S3ZipFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term17011, args);
    }

};


