package codeplays.trainee.cleanarch.domain.usecase;

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
import static codeplays.trainee.cleanarch.domain.usecase.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UseCase_execute_20176660091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term48;

    public UseCase_execute_20176660091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("codeplays.trainee.cleanarch.domain.usecase.UseCase"));
        setField(term47, term47.getClass(), "gateway", null);
        setField(term47, term47.getClass(), "outputPort", null);
        term48 = newInstance(Class.forName("codeplays.trainee.cleanarch.domain.usecase.RequestModel"));
        setField(term48, term48.getClass(), "data", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeplays.trainee.cleanarch.domain.usecase.UseCase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeplays.trainee.cleanarch.domain.usecase.RequestModel");
        Object[] args = new Object[1];
        args[0] = term48;
        callMethod(klass, "execute", argTypes, term47, args);
    }

};


