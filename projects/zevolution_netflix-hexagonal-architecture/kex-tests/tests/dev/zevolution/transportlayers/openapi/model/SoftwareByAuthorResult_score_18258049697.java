package dev.zevolution.transportlayers.openapi.model;

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
import static dev.zevolution.transportlayers.openapi.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SoftwareByAuthorResult_score_18258049697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503;
     Object term542;

    public SoftwareByAuthorResult_score_18258049697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term528 = new Integer(-1955890973);
        term503 = newInstance(Class.forName("dev.zevolution.transportlayers.openapi.model.SoftwareByAuthorResult"));
        setField(term503, term503.getClass(), "name", "xOEqzGAmDU");
        setField(term503, term503.getClass(), "description", "eZFUvlxvGV");
        setField(term503, term503.getClass(), "score", term528);
        setField(term503, term503.getClass(), "author", "BYqFIqCKAV");
        term542 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.transportlayers.openapi.model.SoftwareByAuthorResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term542;
        callMethod(klass, "score", argTypes, term503, args);
    }

};


