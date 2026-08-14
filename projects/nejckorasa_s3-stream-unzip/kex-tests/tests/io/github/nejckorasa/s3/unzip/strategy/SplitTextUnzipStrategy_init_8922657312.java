package io.github.nejckorasa.s3.unzip.strategy;

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
import static io.github.nejckorasa.s3.unzip.strategy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;

public class SplitTextUnzipStrategy_init_8922657312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term5;

    public SplitTextUnzipStrategy_init_8922657312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term3 = new Boolean(false);
        term5 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.nejckorasa.s3.unzip.strategy.SplitTextUnzipStrategy");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("io.github.nejckorasa.s3.upload.S3MultipartUpload$Config");
        Object[] args = new Object[4];
        args[0] = term1;
        args[1] = term3;
        args[2] = term5;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


