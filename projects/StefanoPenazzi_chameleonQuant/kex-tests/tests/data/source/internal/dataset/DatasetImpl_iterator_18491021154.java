package data.source.internal.dataset;

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
import static data.source.internal.dataset.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class DatasetImpl_iterator_18491021154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;

    public DatasetImpl_iterator_18491021154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20 = new HashMap();
        term19 = newInstance(Class.forName("data.source.internal.dataset.DatasetImpl"));
        setField(term19, term19.getClass(), "datasetMap", term20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.dataset.DatasetImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term19, args);
    }

};


