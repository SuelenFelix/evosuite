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

public class S3ZipFile_getInputStream_50525568819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17009;

    public S3ZipFile_getInputStream_50525568819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17009 = newInstance(Class.forName("io.github.nejckorasa.s3.unzip.S3ZipFile"));
        setField(term17009, term17009.getClass(), "bucketName", null);
        setField(term17009, term17009.getClass(), "outputPrefix", null);
        setField(term17009, term17009.getClass(), "inputStream", null);
        setField(term17009, term17009.getClass(), "zipEntry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.nejckorasa.s3.unzip.S3ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInputStream", argTypes, term17009, args);
    }

};


