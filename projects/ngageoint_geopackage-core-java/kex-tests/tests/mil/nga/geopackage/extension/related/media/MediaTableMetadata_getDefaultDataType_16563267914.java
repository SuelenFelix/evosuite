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

public class MediaTableMetadata_getDefaultDataType_16563267914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84345;

    public MediaTableMetadata_getDefaultDataType_16563267914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term84407 = new ArrayList();
        ArrayList term84411 = new ArrayList();
        term84345 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term84345, term84345.getClass(), "tableName", "cvbvwpPlNk");
        setField(term84345, term84345.getClass(), "dataType", "uCdLbhvYeG");
        setField(term84345, term84345.getClass(), "identifier", "ipoyEHBfoG");
        setField(term84345, term84345.getClass(), "description", "iSBTpbiteU");
        setField(term84345, term84345.getClass(), "idColumnName", "MTwFbEoMZj");
        setBooleanField(term84345, term84345.getClass(), "autoincrement", true);
        setField(term84345, term84345.getClass(), "additionalColumns", term84407);
        setField(term84345, term84345.getClass(), "columns", term84411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultDataType", argTypes, term84345, args);
    }

};


