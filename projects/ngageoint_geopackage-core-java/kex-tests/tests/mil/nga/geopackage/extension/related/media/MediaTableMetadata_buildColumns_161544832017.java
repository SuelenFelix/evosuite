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

public class MediaTableMetadata_buildColumns_161544832017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1133;

    public MediaTableMetadata_buildColumns_161544832017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1195 = new ArrayList();
        ArrayList term1199 = new ArrayList();
        term1133 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata"));
        setField(term1133, term1133.getClass(), "tableName", "PznxWXsZME");
        setField(term1133, term1133.getClass(), "dataType", "ZzIujlwVsw");
        setField(term1133, term1133.getClass(), "identifier", "LWyEaeIyAo");
        setField(term1133, term1133.getClass(), "description", "yVMkkQhvmN");
        setField(term1133, term1133.getClass(), "idColumnName", "mvrkADEgpp");
        setBooleanField(term1133, term1133.getClass(), "autoincrement", true);
        setField(term1133, term1133.getClass(), "additionalColumns", term1195);
        setField(term1133, term1133.getClass(), "columns", term1199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildColumns", argTypes, term1133, args);
    }

};


