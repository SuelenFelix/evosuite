package mil.nga.geopackage.extension.related.simple;

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
import static mil.nga.geopackage.extension.related.simple.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class SimpleAttributesTableMetadata_buildColumns_179802673313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1434;

    public SimpleAttributesTableMetadata_buildColumns_179802673313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1496 = new ArrayList();
        ArrayList term1500 = new ArrayList();
        term1434 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term1434, term1434.getClass(), "tableName", "PtirvZmsGt");
        setField(term1434, term1434.getClass(), "dataType", "HWkpTmtlrc");
        setField(term1434, term1434.getClass(), "identifier", "hMmaoREuCK");
        setField(term1434, term1434.getClass(), "description", "VeDtgDzGAN");
        setField(term1434, term1434.getClass(), "idColumnName", "aWYOWZFyaX");
        setBooleanField(term1434, term1434.getClass(), "autoincrement", true);
        setField(term1434, term1434.getClass(), "additionalColumns", term1496);
        setField(term1434, term1434.getClass(), "columns", term1500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildColumns", argTypes, term1434, args);
    }

};


