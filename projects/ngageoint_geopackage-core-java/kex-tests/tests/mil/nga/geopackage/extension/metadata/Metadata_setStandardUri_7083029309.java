package mil.nga.geopackage.extension.metadata;

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
import static mil.nga.geopackage.extension.metadata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Metadata_setStandardUri_7083029309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2896;

    public Metadata_setStandardUri_7083029309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2896 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setLongField(term2896, term2896.getClass(), "id", 6967924379644551255L);
        setField(term2896, term2896.getClass(), "scope", "SbAoxhfrkn");
        setField(term2896, term2896.getClass(), "standardUri", "kuTXqwMtDB");
        setField(term2896, term2896.getClass(), "mimeType", "Ghbwtircqb");
        setField(term2896, term2896.getClass(), "metadata", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.Metadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setStandardUri", argTypes, term2896, args);
    }

};


