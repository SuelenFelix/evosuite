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

public class AttributesTableMetadata_create_45133485317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2266;
     Object term2299;

    public AttributesTableMetadata_create_45133485317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2280 = new ArrayList();
        HashMap term2285 = new HashMap();
        term2266 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term2279 = (Object[]) newArray("java.lang.String", 0);
        setField(term2266, term2266.getClass(), "tableName", "PCipZnmBOF");
        setField(term2266, term2266.getClass(), "columnNames", term2279);
        setField(term2266, term2266.getClass(), "columns", term2280);
        setBooleanField(term2266, term2266.getClass(), "custom", false);
        setField(term2266, term2266.getClass(), "nameToIndex", term2285);
        setIntField(term2266, term2266.getClass(), "pkIndex", -1179120542);
        setBooleanField(term2266, term2266.getClass(), "pkModifiable", false);
        setBooleanField(term2266, term2266.getClass(), "valueValidation", true);
        ArrayList term2300 = new ArrayList();
        HashMap term2304 = new HashMap();
        term2299 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2299, term2299.getClass(), "constraints", term2300);
        setField(term2299, term2299.getClass(), "typedContraints", term2304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[2];
        args[0] = term2266;
        args[1] = term2299;
        callMethod(klass, "create", argTypes, null, args);
    }

};


