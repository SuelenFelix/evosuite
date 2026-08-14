package io.polivakha.mojo.properties.models;

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
import static io.polivakha.mojo.properties.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FileResource_canBeOpened_493580435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term738;

    public FileResource_canBeOpened_493580435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term738 = newInstance(Class.forName("io.polivakha.mojo.properties.models.FileResource"));
        setField(term738, term738.getClass(), "file", null);
        setField(term738, term738.getClass(), "stream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.models.FileResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBeOpened", argTypes, term738, args);
    }

};


