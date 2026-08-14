package mil.nga.geopackage.extension.nga.style;

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
import static mil.nga.geopackage.extension.nga.style.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class StyleTable_getDescriptionColumnIndex_2299654235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4840;

    public StyleTable_getDescriptionColumnIndex_2299654235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4928 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4928, term4928.getClass(), "index", 0);
        setField(term4928, term4928.getClass(), "name", null);
        setField(term4928, term4928.getClass(), "max", null);
        setBooleanField(term4928, term4928.getClass(), "notNull", true);
        setField(term4928, term4928.getClass(), "defaultValue", null);
        setBooleanField(term4928, term4928.getClass(), "primaryKey", true);
        setBooleanField(term4928, term4928.getClass(), "autoincrement", true);
        setBooleanField(term4928, term4928.getClass(), "unique", false);
        setField(term4928, term4928.getClass(), "type", null);
        setField(term4928, term4928.getClass(), "dataType", null);
        setField(term4928, term4928.getClass(), "constraints", null);
        setField(term4928, term4928.getClass(), "schema", null);
        Object term4934 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4934, term4934.getClass(), "index", 1);
        setField(term4934, term4934.getClass(), "name", null);
        setField(term4934, term4934.getClass(), "max", null);
        setBooleanField(term4934, term4934.getClass(), "notNull", false);
        setField(term4934, term4934.getClass(), "defaultValue", null);
        setBooleanField(term4934, term4934.getClass(), "primaryKey", false);
        setBooleanField(term4934, term4934.getClass(), "autoincrement", false);
        setBooleanField(term4934, term4934.getClass(), "unique", false);
        setField(term4934, term4934.getClass(), "type", null);
        setField(term4934, term4934.getClass(), "dataType", null);
        setField(term4934, term4934.getClass(), "constraints", null);
        setField(term4934, term4934.getClass(), "schema", null);
        Object term4940 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4940, term4940.getClass(), "index", 2);
        setField(term4940, term4940.getClass(), "name", null);
        setField(term4940, term4940.getClass(), "max", null);
        setBooleanField(term4940, term4940.getClass(), "notNull", false);
        setField(term4940, term4940.getClass(), "defaultValue", null);
        setBooleanField(term4940, term4940.getClass(), "primaryKey", false);
        setBooleanField(term4940, term4940.getClass(), "autoincrement", false);
        setBooleanField(term4940, term4940.getClass(), "unique", false);
        setField(term4940, term4940.getClass(), "type", null);
        setField(term4940, term4940.getClass(), "dataType", null);
        setField(term4940, term4940.getClass(), "constraints", null);
        setField(term4940, term4940.getClass(), "schema", null);
        Object term4946 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4946, term4946.getClass(), "index", 3);
        setField(term4946, term4946.getClass(), "name", null);
        setField(term4946, term4946.getClass(), "max", null);
        setBooleanField(term4946, term4946.getClass(), "notNull", false);
        setField(term4946, term4946.getClass(), "defaultValue", null);
        setBooleanField(term4946, term4946.getClass(), "primaryKey", false);
        setBooleanField(term4946, term4946.getClass(), "autoincrement", false);
        setBooleanField(term4946, term4946.getClass(), "unique", false);
        setField(term4946, term4946.getClass(), "type", null);
        setField(term4946, term4946.getClass(), "dataType", null);
        setField(term4946, term4946.getClass(), "constraints", null);
        setField(term4946, term4946.getClass(), "schema", null);
        Object term4952 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4952, term4952.getClass(), "index", 4);
        setField(term4952, term4952.getClass(), "name", null);
        setField(term4952, term4952.getClass(), "max", null);
        setBooleanField(term4952, term4952.getClass(), "notNull", false);
        setField(term4952, term4952.getClass(), "defaultValue", null);
        setBooleanField(term4952, term4952.getClass(), "primaryKey", false);
        setBooleanField(term4952, term4952.getClass(), "autoincrement", false);
        setBooleanField(term4952, term4952.getClass(), "unique", false);
        setField(term4952, term4952.getClass(), "type", null);
        setField(term4952, term4952.getClass(), "dataType", null);
        setField(term4952, term4952.getClass(), "constraints", null);
        setField(term4952, term4952.getClass(), "schema", null);
        Object term4958 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4958, term4958.getClass(), "index", 5);
        setField(term4958, term4958.getClass(), "name", null);
        setField(term4958, term4958.getClass(), "max", null);
        setBooleanField(term4958, term4958.getClass(), "notNull", false);
        setField(term4958, term4958.getClass(), "defaultValue", null);
        setBooleanField(term4958, term4958.getClass(), "primaryKey", false);
        setBooleanField(term4958, term4958.getClass(), "autoincrement", false);
        setBooleanField(term4958, term4958.getClass(), "unique", false);
        setField(term4958, term4958.getClass(), "type", null);
        setField(term4958, term4958.getClass(), "dataType", null);
        setField(term4958, term4958.getClass(), "constraints", null);
        setField(term4958, term4958.getClass(), "schema", null);
        Object term4964 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4964, term4964.getClass(), "index", 6);
        setField(term4964, term4964.getClass(), "name", null);
        setField(term4964, term4964.getClass(), "max", null);
        setBooleanField(term4964, term4964.getClass(), "notNull", false);
        setField(term4964, term4964.getClass(), "defaultValue", null);
        setBooleanField(term4964, term4964.getClass(), "primaryKey", false);
        setBooleanField(term4964, term4964.getClass(), "autoincrement", false);
        setBooleanField(term4964, term4964.getClass(), "unique", false);
        setField(term4964, term4964.getClass(), "type", null);
        setField(term4964, term4964.getClass(), "dataType", null);
        setField(term4964, term4964.getClass(), "constraints", null);
        setField(term4964, term4964.getClass(), "schema", null);
        Object term4970 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4970, term4970.getClass(), "index", 7);
        setField(term4970, term4970.getClass(), "name", null);
        setField(term4970, term4970.getClass(), "max", null);
        setBooleanField(term4970, term4970.getClass(), "notNull", false);
        setField(term4970, term4970.getClass(), "defaultValue", null);
        setBooleanField(term4970, term4970.getClass(), "primaryKey", false);
        setBooleanField(term4970, term4970.getClass(), "autoincrement", false);
        setBooleanField(term4970, term4970.getClass(), "unique", false);
        setField(term4970, term4970.getClass(), "type", null);
        setField(term4970, term4970.getClass(), "dataType", null);
        setField(term4970, term4970.getClass(), "constraints", null);
        setField(term4970, term4970.getClass(), "schema", null);
        ArrayList term4926 = new ArrayList();
        ((ArrayList) term4926).add(term4928);
        ((ArrayList) term4926).add(term4934);
        ((ArrayList) term4926).add(term4940);
        ((ArrayList) term4926).add(term4946);
        ((ArrayList) term4926).add(term4952);
        ((ArrayList) term4926).add(term4958);
        ((ArrayList) term4926).add(term4964);
        ((ArrayList) term4926).add(term4970);
        HashMap term4979 = new HashMap();
        ArrayList term5013 = new ArrayList();
        HashMap term5017 = new HashMap();
        term4840 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term4841 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term4853 = (Object[]) newArray("java.lang.String", 8);
        Object term5012 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4841, term4841.getClass(), "tableName", "nga_style");
        setElement(term4853, 0, "id");
        setElement(term4853, 1, "name");
        setElement(term4853, 2, "description");
        setElement(term4853, 3, "color");
        setElement(term4853, 4, "opacity");
        setElement(term4853, 5, "width");
        setElement(term4853, 6, "fill_color");
        setElement(term4853, 7, "fill_opacity");
        setField(term4841, term4841.getClass(), "columnNames", term4853);
        setField(term4841, term4841.getClass(), "columns", term4926);
        setBooleanField(term4841, term4841.getClass(), "custom", false);
        setField(term4841, term4841.getClass(), "nameToIndex", term4979);
        setIntField(term4841, term4841.getClass(), "pkIndex", 0);
        setBooleanField(term4841, term4841.getClass(), "pkModifiable", false);
        setBooleanField(term4841, term4841.getClass(), "valueValidation", true);
        setField(term4840, term4840.getClass(), "columns", term4841);
        setField(term5012, term5012.getClass(), "constraints", term5013);
        setField(term5012, term5012.getClass(), "typedContraints", term5017);
        setField(term4840, term4840.getClass(), "constraints", term5012);
        setField(term4840, term4840.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescriptionColumnIndex", argTypes, term4840, args);
    }

};


