package mil.nga.geopackage.attributes;

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
import static mil.nga.geopackage.attributes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class AttributesTableMetadata_createTyped_13214792031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3383;

    public AttributesTableMetadata_createTyped_13214792031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3409 = new ArrayList();
        HashMap term3414 = new HashMap();
        term3383 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term3396 = (Object[]) newArray("java.lang.String", 1);
        setField(term3383, term3383.getClass(), "tableName", "BBXiTNHqGE");
        setElement(term3396, 0, "IEYhJmgCVd");
        setField(term3383, term3383.getClass(), "columnNames", term3396);
        setField(term3383, term3383.getClass(), "columns", term3409);
        setBooleanField(term3383, term3383.getClass(), "custom", false);
        setField(term3383, term3383.getClass(), "nameToIndex", term3414);
        setIntField(term3383, term3383.getClass(), "pkIndex", -1968847291);
        setBooleanField(term3383, term3383.getClass(), "pkModifiable", true);
        setBooleanField(term3383, term3383.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Object[] args = new Object[2];
        args[0] = "bdyhHbDAmJ";
        args[1] = term3383;
        callMethod(klass, "createTyped", argTypes, null, args);
    }

};


