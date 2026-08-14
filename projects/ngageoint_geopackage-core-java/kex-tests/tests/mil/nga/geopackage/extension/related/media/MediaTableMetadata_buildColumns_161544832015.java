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

public class MediaTableMetadata_buildColumns_161544832015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84465;

    public MediaTableMetadata_buildColumns_161544832015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term84527 = new ArrayList();
        ArrayList term84531 = new ArrayList();
        term84465 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term84465, term84465.getClass(), "tableName", "uEQbnHbyAn");
        setField(term84465, term84465.getClass(), "dataType", "JpFIuyNEKW");
        setField(term84465, term84465.getClass(), "identifier", "NksHsgcqDx");
        setField(term84465, term84465.getClass(), "description", "RjSNvOEvcT");
        setField(term84465, term84465.getClass(), "idColumnName", "HLzuMxigqS");
        setBooleanField(term84465, term84465.getClass(), "autoincrement", true);
        setField(term84465, term84465.getClass(), "additionalColumns", term84527);
        setField(term84465, term84465.getClass(), "columns", term84531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildColumns", argTypes, term84465, args);
    }

};


