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

public class DatasetImpl_merge_7660272411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;

    public DatasetImpl_merge_7660272411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("data.source.internal.dataset.DatasetImpl"));
        setField(term35, term35.getClass(), "datasetMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.dataset.DatasetImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.internal.dataset.DatasetI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "merge", argTypes, term35, args);
    }

};


