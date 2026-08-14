package codeplays.trainee.cleanarch.infra.adapter.gateway;

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
import static codeplays.trainee.cleanarch.infra.adapter.gateway.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DataBaseGateway_getEntity_1238709421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public DataBaseGateway_getEntity_1238709421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("codeplays.trainee.cleanarch.infra.adapter.gateway.DataBaseGateway"));
        setField(term1, term1.getClass(), "adapter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeplays.trainee.cleanarch.infra.adapter.gateway.DataBaseGateway");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "getEntity", argTypes, term1, args);
    }

};


