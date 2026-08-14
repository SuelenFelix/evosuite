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

public class StyleTable_getColorColumnIndex_1696816407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5334;

    public StyleTable_getColorColumnIndex_1696816407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5422 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5422, term5422.getClass(), "index", 0);
        setField(term5422, term5422.getClass(), "name", null);
        setField(term5422, term5422.getClass(), "max", null);
        setBooleanField(term5422, term5422.getClass(), "notNull", true);
        setField(term5422, term5422.getClass(), "defaultValue", null);
        setBooleanField(term5422, term5422.getClass(), "primaryKey", true);
        setBooleanField(term5422, term5422.getClass(), "autoincrement", true);
        setBooleanField(term5422, term5422.getClass(), "unique", false);
        setField(term5422, term5422.getClass(), "type", null);
        setField(term5422, term5422.getClass(), "dataType", null);
        setField(term5422, term5422.getClass(), "constraints", null);
        setField(term5422, term5422.getClass(), "schema", null);
        Object term5428 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5428, term5428.getClass(), "index", 1);
        setField(term5428, term5428.getClass(), "name", null);
        setField(term5428, term5428.getClass(), "max", null);
        setBooleanField(term5428, term5428.getClass(), "notNull", false);
        setField(term5428, term5428.getClass(), "defaultValue", null);
        setBooleanField(term5428, term5428.getClass(), "primaryKey", false);
        setBooleanField(term5428, term5428.getClass(), "autoincrement", false);
        setBooleanField(term5428, term5428.getClass(), "unique", false);
        setField(term5428, term5428.getClass(), "type", null);
        setField(term5428, term5428.getClass(), "dataType", null);
        setField(term5428, term5428.getClass(), "constraints", null);
        setField(term5428, term5428.getClass(), "schema", null);
        Object term5434 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5434, term5434.getClass(), "index", 2);
        setField(term5434, term5434.getClass(), "name", null);
        setField(term5434, term5434.getClass(), "max", null);
        setBooleanField(term5434, term5434.getClass(), "notNull", false);
        setField(term5434, term5434.getClass(), "defaultValue", null);
        setBooleanField(term5434, term5434.getClass(), "primaryKey", false);
        setBooleanField(term5434, term5434.getClass(), "autoincrement", false);
        setBooleanField(term5434, term5434.getClass(), "unique", false);
        setField(term5434, term5434.getClass(), "type", null);
        setField(term5434, term5434.getClass(), "dataType", null);
        setField(term5434, term5434.getClass(), "constraints", null);
        setField(term5434, term5434.getClass(), "schema", null);
        Object term5440 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5440, term5440.getClass(), "index", 3);
        setField(term5440, term5440.getClass(), "name", null);
        setField(term5440, term5440.getClass(), "max", null);
        setBooleanField(term5440, term5440.getClass(), "notNull", false);
        setField(term5440, term5440.getClass(), "defaultValue", null);
        setBooleanField(term5440, term5440.getClass(), "primaryKey", false);
        setBooleanField(term5440, term5440.getClass(), "autoincrement", false);
        setBooleanField(term5440, term5440.getClass(), "unique", false);
        setField(term5440, term5440.getClass(), "type", null);
        setField(term5440, term5440.getClass(), "dataType", null);
        setField(term5440, term5440.getClass(), "constraints", null);
        setField(term5440, term5440.getClass(), "schema", null);
        Object term5446 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5446, term5446.getClass(), "index", 4);
        setField(term5446, term5446.getClass(), "name", null);
        setField(term5446, term5446.getClass(), "max", null);
        setBooleanField(term5446, term5446.getClass(), "notNull", false);
        setField(term5446, term5446.getClass(), "defaultValue", null);
        setBooleanField(term5446, term5446.getClass(), "primaryKey", false);
        setBooleanField(term5446, term5446.getClass(), "autoincrement", false);
        setBooleanField(term5446, term5446.getClass(), "unique", false);
        setField(term5446, term5446.getClass(), "type", null);
        setField(term5446, term5446.getClass(), "dataType", null);
        setField(term5446, term5446.getClass(), "constraints", null);
        setField(term5446, term5446.getClass(), "schema", null);
        Object term5452 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5452, term5452.getClass(), "index", 5);
        setField(term5452, term5452.getClass(), "name", null);
        setField(term5452, term5452.getClass(), "max", null);
        setBooleanField(term5452, term5452.getClass(), "notNull", false);
        setField(term5452, term5452.getClass(), "defaultValue", null);
        setBooleanField(term5452, term5452.getClass(), "primaryKey", false);
        setBooleanField(term5452, term5452.getClass(), "autoincrement", false);
        setBooleanField(term5452, term5452.getClass(), "unique", false);
        setField(term5452, term5452.getClass(), "type", null);
        setField(term5452, term5452.getClass(), "dataType", null);
        setField(term5452, term5452.getClass(), "constraints", null);
        setField(term5452, term5452.getClass(), "schema", null);
        Object term5458 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5458, term5458.getClass(), "index", 6);
        setField(term5458, term5458.getClass(), "name", null);
        setField(term5458, term5458.getClass(), "max", null);
        setBooleanField(term5458, term5458.getClass(), "notNull", false);
        setField(term5458, term5458.getClass(), "defaultValue", null);
        setBooleanField(term5458, term5458.getClass(), "primaryKey", false);
        setBooleanField(term5458, term5458.getClass(), "autoincrement", false);
        setBooleanField(term5458, term5458.getClass(), "unique", false);
        setField(term5458, term5458.getClass(), "type", null);
        setField(term5458, term5458.getClass(), "dataType", null);
        setField(term5458, term5458.getClass(), "constraints", null);
        setField(term5458, term5458.getClass(), "schema", null);
        Object term5464 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5464, term5464.getClass(), "index", 7);
        setField(term5464, term5464.getClass(), "name", null);
        setField(term5464, term5464.getClass(), "max", null);
        setBooleanField(term5464, term5464.getClass(), "notNull", false);
        setField(term5464, term5464.getClass(), "defaultValue", null);
        setBooleanField(term5464, term5464.getClass(), "primaryKey", false);
        setBooleanField(term5464, term5464.getClass(), "autoincrement", false);
        setBooleanField(term5464, term5464.getClass(), "unique", false);
        setField(term5464, term5464.getClass(), "type", null);
        setField(term5464, term5464.getClass(), "dataType", null);
        setField(term5464, term5464.getClass(), "constraints", null);
        setField(term5464, term5464.getClass(), "schema", null);
        ArrayList term5420 = new ArrayList();
        ((ArrayList) term5420).add(term5422);
        ((ArrayList) term5420).add(term5428);
        ((ArrayList) term5420).add(term5434);
        ((ArrayList) term5420).add(term5440);
        ((ArrayList) term5420).add(term5446);
        ((ArrayList) term5420).add(term5452);
        ((ArrayList) term5420).add(term5458);
        ((ArrayList) term5420).add(term5464);
        HashMap term5473 = new HashMap();
        ArrayList term5507 = new ArrayList();
        HashMap term5511 = new HashMap();
        term5334 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term5335 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term5347 = (Object[]) newArray("java.lang.String", 8);
        Object term5506 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term5335, term5335.getClass(), "tableName", "nga_style");
        setElement(term5347, 0, "id");
        setElement(term5347, 1, "name");
        setElement(term5347, 2, "description");
        setElement(term5347, 3, "color");
        setElement(term5347, 4, "opacity");
        setElement(term5347, 5, "width");
        setElement(term5347, 6, "fill_color");
        setElement(term5347, 7, "fill_opacity");
        setField(term5335, term5335.getClass(), "columnNames", term5347);
        setField(term5335, term5335.getClass(), "columns", term5420);
        setBooleanField(term5335, term5335.getClass(), "custom", false);
        setField(term5335, term5335.getClass(), "nameToIndex", term5473);
        setIntField(term5335, term5335.getClass(), "pkIndex", 0);
        setBooleanField(term5335, term5335.getClass(), "pkModifiable", false);
        setBooleanField(term5335, term5335.getClass(), "valueValidation", true);
        setField(term5334, term5334.getClass(), "columns", term5335);
        setField(term5506, term5506.getClass(), "constraints", term5507);
        setField(term5506, term5506.getClass(), "typedContraints", term5511);
        setField(term5334, term5334.getClass(), "constraints", term5506);
        setField(term5334, term5334.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColorColumnIndex", argTypes, term5334, args);
    }

};


