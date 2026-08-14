package mil.nga.geopackage.extension.related.media;

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
import static mil.nga.geopackage.extension.related.media.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class MediaTableMetadata_buildColumns_161544832019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34475;

    public MediaTableMetadata_buildColumns_161544832019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34537 = new ArrayList();
        ArrayList term34541 = new ArrayList();
        term34475 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term34475, term34475.getClass(), "tableName", "lkdvUiYwRq");
        setField(term34475, term34475.getClass(), "dataType", "XuxkPrpfND");
        setField(term34475, term34475.getClass(), "identifier", "OxNXeKMDje");
        setField(term34475, term34475.getClass(), "description", "hGTqHomrbc");
        setField(term34475, term34475.getClass(), "idColumnName", "NNMBrIWEBw");
        setBooleanField(term34475, term34475.getClass(), "autoincrement", true);
        setField(term34475, term34475.getClass(), "additionalColumns", term34537);
        setField(term34475, term34475.getClass(), "columns", term34541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildColumns", argTypes, term34475, args);
    }

};


