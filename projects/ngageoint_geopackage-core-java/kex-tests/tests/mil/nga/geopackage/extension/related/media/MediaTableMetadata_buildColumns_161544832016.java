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

public class MediaTableMetadata_buildColumns_161544832016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4139;

    public MediaTableMetadata_buildColumns_161544832016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4201 = new ArrayList();
        ArrayList term4205 = new ArrayList();
        term4139 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term4139, term4139.getClass(), "tableName", "qYzsiuXOgS");
        setField(term4139, term4139.getClass(), "dataType", "bxrCBbrrct");
        setField(term4139, term4139.getClass(), "identifier", "CKWpJaaaxX");
        setField(term4139, term4139.getClass(), "description", "UBRmXJmfrt");
        setField(term4139, term4139.getClass(), "idColumnName", "WZzvmIHhzZ");
        setBooleanField(term4139, term4139.getClass(), "autoincrement", true);
        setField(term4139, term4139.getClass(), "additionalColumns", term4201);
        setField(term4139, term4139.getClass(), "columns", term4205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildColumns", argTypes, term4139, args);
    }

};


