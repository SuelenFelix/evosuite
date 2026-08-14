package data.source.external.database.influxdb.utils.update;

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
import static data.source.external.database.influxdb.utils.update.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UpdateFromAlphaVantageAbstract_afterUpdate_19591176021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term984;

    public UpdateFromAlphaVantageAbstract_afterUpdate_19591176021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term984 = (Object[]) newArray("java.lang.Object", 4);
        Object term985 = newInstance(Class.forName("java.lang.Object"));
        Object term986 = newInstance(Class.forName("java.lang.Object"));
        Object term987 = newInstance(Class.forName("java.lang.Object"));
        Object term988 = newInstance(Class.forName("java.lang.Object"));
        setElement(term984, 0, term985);
        setElement(term984, 1, term986);
        setElement(term984, 2, term987);
        setElement(term984, 3, term988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.utils.update.UpdateFromAlphaVantageAbstract");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term984;
        callMethod(klass, "afterUpdate", argTypes, null, args);
    }

};


