package ix.ibm.sonar.java.utils;

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
import static ix.ibm.sonar.java.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LiteralConstants_isLiteralConstantAvailable_9719023651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public LiteralConstants_isLiteralConstantAvailable_9719023651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ix.ibm.sonar.java.utils.LiteralConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "isLiteralConstantAvailable", argTypes, null, args);
    }

};


