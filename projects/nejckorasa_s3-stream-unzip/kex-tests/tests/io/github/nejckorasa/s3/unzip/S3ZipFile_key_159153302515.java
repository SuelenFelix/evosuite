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

public class S3ZipFile_key_159153302515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17006;

    public S3ZipFile_key_159153302515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17006 = newInstance(Class.forName("io.github.nejckorasa.s3.unzip.S3ZipFile"));
        setField(term17006, term17006.getClass(), "bucketName", null);
        setField(term17006, term17006.getClass(), "outputPrefix", null);
        setField(term17006, term17006.getClass(), "inputStream", null);
        setField(term17006, term17006.getClass(), "zipEntry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.nejckorasa.s3.unzip.S3ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "key", argTypes, term17006, args);
    }

};


