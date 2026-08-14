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

public class StyleTable_getColorColumn_6187910598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5581;

    public StyleTable_getColorColumn_6187910598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5669 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5669, term5669.getClass(), "index", 0);
        setField(term5669, term5669.getClass(), "name", null);
        setField(term5669, term5669.getClass(), "max", null);
        setBooleanField(term5669, term5669.getClass(), "notNull", true);
        setField(term5669, term5669.getClass(), "defaultValue", null);
        setBooleanField(term5669, term5669.getClass(), "primaryKey", true);
        setBooleanField(term5669, term5669.getClass(), "autoincrement", true);
        setBooleanField(term5669, term5669.getClass(), "unique", false);
        setField(term5669, term5669.getClass(), "type", null);
        setField(term5669, term5669.getClass(), "dataType", null);
        setField(term5669, term5669.getClass(), "constraints", null);
        setField(term5669, term5669.getClass(), "schema", null);
        Object term5675 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5675, term5675.getClass(), "index", 1);
        setField(term5675, term5675.getClass(), "name", null);
        setField(term5675, term5675.getClass(), "max", null);
        setBooleanField(term5675, term5675.getClass(), "notNull", false);
        setField(term5675, term5675.getClass(), "defaultValue", null);
        setBooleanField(term5675, term5675.getClass(), "primaryKey", false);
        setBooleanField(term5675, term5675.getClass(), "autoincrement", false);
        setBooleanField(term5675, term5675.getClass(), "unique", false);
        setField(term5675, term5675.getClass(), "type", null);
        setField(term5675, term5675.getClass(), "dataType", null);
        setField(term5675, term5675.getClass(), "constraints", null);
        setField(term5675, term5675.getClass(), "schema", null);
        Object term5681 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5681, term5681.getClass(), "index", 2);
        setField(term5681, term5681.getClass(), "name", null);
        setField(term5681, term5681.getClass(), "max", null);
        setBooleanField(term5681, term5681.getClass(), "notNull", false);
        setField(term5681, term5681.getClass(), "defaultValue", null);
        setBooleanField(term5681, term5681.getClass(), "primaryKey", false);
        setBooleanField(term5681, term5681.getClass(), "autoincrement", false);
        setBooleanField(term5681, term5681.getClass(), "unique", false);
        setField(term5681, term5681.getClass(), "type", null);
        setField(term5681, term5681.getClass(), "dataType", null);
        setField(term5681, term5681.getClass(), "constraints", null);
        setField(term5681, term5681.getClass(), "schema", null);
        Object term5687 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5687, term5687.getClass(), "index", 3);
        setField(term5687, term5687.getClass(), "name", null);
        setField(term5687, term5687.getClass(), "max", null);
        setBooleanField(term5687, term5687.getClass(), "notNull", false);
        setField(term5687, term5687.getClass(), "defaultValue", null);
        setBooleanField(term5687, term5687.getClass(), "primaryKey", false);
        setBooleanField(term5687, term5687.getClass(), "autoincrement", false);
        setBooleanField(term5687, term5687.getClass(), "unique", false);
        setField(term5687, term5687.getClass(), "type", null);
        setField(term5687, term5687.getClass(), "dataType", null);
        setField(term5687, term5687.getClass(), "constraints", null);
        setField(term5687, term5687.getClass(), "schema", null);
        Object term5693 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5693, term5693.getClass(), "index", 4);
        setField(term5693, term5693.getClass(), "name", null);
        setField(term5693, term5693.getClass(), "max", null);
        setBooleanField(term5693, term5693.getClass(), "notNull", false);
        setField(term5693, term5693.getClass(), "defaultValue", null);
        setBooleanField(term5693, term5693.getClass(), "primaryKey", false);
        setBooleanField(term5693, term5693.getClass(), "autoincrement", false);
        setBooleanField(term5693, term5693.getClass(), "unique", false);
        setField(term5693, term5693.getClass(), "type", null);
        setField(term5693, term5693.getClass(), "dataType", null);
        setField(term5693, term5693.getClass(), "constraints", null);
        setField(term5693, term5693.getClass(), "schema", null);
        Object term5699 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5699, term5699.getClass(), "index", 5);
        setField(term5699, term5699.getClass(), "name", null);
        setField(term5699, term5699.getClass(), "max", null);
        setBooleanField(term5699, term5699.getClass(), "notNull", false);
        setField(term5699, term5699.getClass(), "defaultValue", null);
        setBooleanField(term5699, term5699.getClass(), "primaryKey", false);
        setBooleanField(term5699, term5699.getClass(), "autoincrement", false);
        setBooleanField(term5699, term5699.getClass(), "unique", false);
        setField(term5699, term5699.getClass(), "type", null);
        setField(term5699, term5699.getClass(), "dataType", null);
        setField(term5699, term5699.getClass(), "constraints", null);
        setField(term5699, term5699.getClass(), "schema", null);
        Object term5705 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5705, term5705.getClass(), "index", 6);
        setField(term5705, term5705.getClass(), "name", null);
        setField(term5705, term5705.getClass(), "max", null);
        setBooleanField(term5705, term5705.getClass(), "notNull", false);
        setField(term5705, term5705.getClass(), "defaultValue", null);
        setBooleanField(term5705, term5705.getClass(), "primaryKey", false);
        setBooleanField(term5705, term5705.getClass(), "autoincrement", false);
        setBooleanField(term5705, term5705.getClass(), "unique", false);
        setField(term5705, term5705.getClass(), "type", null);
        setField(term5705, term5705.getClass(), "dataType", null);
        setField(term5705, term5705.getClass(), "constraints", null);
        setField(term5705, term5705.getClass(), "schema", null);
        Object term5711 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5711, term5711.getClass(), "index", 7);
        setField(term5711, term5711.getClass(), "name", null);
        setField(term5711, term5711.getClass(), "max", null);
        setBooleanField(term5711, term5711.getClass(), "notNull", false);
        setField(term5711, term5711.getClass(), "defaultValue", null);
        setBooleanField(term5711, term5711.getClass(), "primaryKey", false);
        setBooleanField(term5711, term5711.getClass(), "autoincrement", false);
        setBooleanField(term5711, term5711.getClass(), "unique", false);
        setField(term5711, term5711.getClass(), "type", null);
        setField(term5711, term5711.getClass(), "dataType", null);
        setField(term5711, term5711.getClass(), "constraints", null);
        setField(term5711, term5711.getClass(), "schema", null);
        ArrayList term5667 = new ArrayList();
        ((ArrayList) term5667).add(term5669);
        ((ArrayList) term5667).add(term5675);
        ((ArrayList) term5667).add(term5681);
        ((ArrayList) term5667).add(term5687);
        ((ArrayList) term5667).add(term5693);
        ((ArrayList) term5667).add(term5699);
        ((ArrayList) term5667).add(term5705);
        ((ArrayList) term5667).add(term5711);
        HashMap term5720 = new HashMap();
        ArrayList term5754 = new ArrayList();
        HashMap term5758 = new HashMap();
        term5581 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term5582 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term5594 = (Object[]) newArray("java.lang.String", 8);
        Object term5753 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term5582, term5582.getClass(), "tableName", "nga_style");
        setElement(term5594, 0, "id");
        setElement(term5594, 1, "name");
        setElement(term5594, 2, "description");
        setElement(term5594, 3, "color");
        setElement(term5594, 4, "opacity");
        setElement(term5594, 5, "width");
        setElement(term5594, 6, "fill_color");
        setElement(term5594, 7, "fill_opacity");
        setField(term5582, term5582.getClass(), "columnNames", term5594);
        setField(term5582, term5582.getClass(), "columns", term5667);
        setBooleanField(term5582, term5582.getClass(), "custom", false);
        setField(term5582, term5582.getClass(), "nameToIndex", term5720);
        setIntField(term5582, term5582.getClass(), "pkIndex", 0);
        setBooleanField(term5582, term5582.getClass(), "pkModifiable", false);
        setBooleanField(term5582, term5582.getClass(), "valueValidation", true);
        setField(term5581, term5581.getClass(), "columns", term5582);
        setField(term5753, term5753.getClass(), "constraints", term5754);
        setField(term5753, term5753.getClass(), "typedContraints", term5758);
        setField(term5581, term5581.getClass(), "constraints", term5753);
        setField(term5581, term5581.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColorColumn", argTypes, term5581, args);
    }

};


