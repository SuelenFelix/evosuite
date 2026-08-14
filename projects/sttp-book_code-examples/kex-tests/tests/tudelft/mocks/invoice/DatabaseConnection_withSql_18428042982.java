package tudelft.mocks.invoice;

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
import static tudelft.mocks.invoice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DatabaseConnection_withSql_18428042982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2950;

    public DatabaseConnection_withSql_18428042982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2950 = newInstance(Class.forName("tudelft.mocks.invoice.DatabaseConnection"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.mocks.invoice.DatabaseConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tudelft.mocks.invoice.DatabaseConnection$SqlSupplier");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withSql", argTypes, term2950, args);
    }

};


