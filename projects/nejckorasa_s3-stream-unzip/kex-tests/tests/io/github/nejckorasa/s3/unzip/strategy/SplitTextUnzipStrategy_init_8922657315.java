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

public class SplitTextUnzipStrategy_init_8922657315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term9;
     Object term11;

    public SplitTextUnzipStrategy_init_8922657315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = new Integer(0);
        term9 = new Boolean(false);
        term11 = new Long(0L);
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
        args[0] = term7;
        args[1] = term9;
        args[2] = term11;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


