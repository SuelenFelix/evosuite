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

public class SimpleAttributesTable_create_7225223020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SimpleAttributesTable_create_7225223020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term63 = new ArrayList();
        ArrayList term67 = new ArrayList();
        term1 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata"));
        setField(term1, term1.getClass(), "tableName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "dataType", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "identifier", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "description", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "idColumnName", "jJCZpVmanW");
        setBooleanField(term1, term1.getClass(), "autoincrement", true);
        setField(term1, term1.getClass(), "additionalColumns", term63);
        setField(term1, term1.getClass(), "columns", term67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTableMetadata");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "create", argTypes, null, args);
    }

};


