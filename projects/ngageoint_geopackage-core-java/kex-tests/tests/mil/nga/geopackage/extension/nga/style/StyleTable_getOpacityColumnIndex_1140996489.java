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

public class StyleTable_getOpacityColumnIndex_1140996489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5828;

    public StyleTable_getOpacityColumnIndex_1140996489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5916 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5916, term5916.getClass(), "index", 0);
        setField(term5916, term5916.getClass(), "name", null);
        setField(term5916, term5916.getClass(), "max", null);
        setBooleanField(term5916, term5916.getClass(), "notNull", true);
        setField(term5916, term5916.getClass(), "defaultValue", null);
        setBooleanField(term5916, term5916.getClass(), "primaryKey", true);
        setBooleanField(term5916, term5916.getClass(), "autoincrement", true);
        setBooleanField(term5916, term5916.getClass(), "unique", false);
        setField(term5916, term5916.getClass(), "type", null);
        setField(term5916, term5916.getClass(), "dataType", null);
        setField(term5916, term5916.getClass(), "constraints", null);
        setField(term5916, term5916.getClass(), "schema", null);
        Object term5922 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5922, term5922.getClass(), "index", 1);
        setField(term5922, term5922.getClass(), "name", null);
        setField(term5922, term5922.getClass(), "max", null);
        setBooleanField(term5922, term5922.getClass(), "notNull", false);
        setField(term5922, term5922.getClass(), "defaultValue", null);
        setBooleanField(term5922, term5922.getClass(), "primaryKey", false);
        setBooleanField(term5922, term5922.getClass(), "autoincrement", false);
        setBooleanField(term5922, term5922.getClass(), "unique", false);
        setField(term5922, term5922.getClass(), "type", null);
        setField(term5922, term5922.getClass(), "dataType", null);
        setField(term5922, term5922.getClass(), "constraints", null);
        setField(term5922, term5922.getClass(), "schema", null);
        Object term5928 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5928, term5928.getClass(), "index", 2);
        setField(term5928, term5928.getClass(), "name", null);
        setField(term5928, term5928.getClass(), "max", null);
        setBooleanField(term5928, term5928.getClass(), "notNull", false);
        setField(term5928, term5928.getClass(), "defaultValue", null);
        setBooleanField(term5928, term5928.getClass(), "primaryKey", false);
        setBooleanField(term5928, term5928.getClass(), "autoincrement", false);
        setBooleanField(term5928, term5928.getClass(), "unique", false);
        setField(term5928, term5928.getClass(), "type", null);
        setField(term5928, term5928.getClass(), "dataType", null);
        setField(term5928, term5928.getClass(), "constraints", null);
        setField(term5928, term5928.getClass(), "schema", null);
        Object term5934 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5934, term5934.getClass(), "index", 3);
        setField(term5934, term5934.getClass(), "name", null);
        setField(term5934, term5934.getClass(), "max", null);
        setBooleanField(term5934, term5934.getClass(), "notNull", false);
        setField(term5934, term5934.getClass(), "defaultValue", null);
        setBooleanField(term5934, term5934.getClass(), "primaryKey", false);
        setBooleanField(term5934, term5934.getClass(), "autoincrement", false);
        setBooleanField(term5934, term5934.getClass(), "unique", false);
        setField(term5934, term5934.getClass(), "type", null);
        setField(term5934, term5934.getClass(), "dataType", null);
        setField(term5934, term5934.getClass(), "constraints", null);
        setField(term5934, term5934.getClass(), "schema", null);
        Object term5940 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5940, term5940.getClass(), "index", 4);
        setField(term5940, term5940.getClass(), "name", null);
        setField(term5940, term5940.getClass(), "max", null);
        setBooleanField(term5940, term5940.getClass(), "notNull", false);
        setField(term5940, term5940.getClass(), "defaultValue", null);
        setBooleanField(term5940, term5940.getClass(), "primaryKey", false);
        setBooleanField(term5940, term5940.getClass(), "autoincrement", false);
        setBooleanField(term5940, term5940.getClass(), "unique", false);
        setField(term5940, term5940.getClass(), "type", null);
        setField(term5940, term5940.getClass(), "dataType", null);
        setField(term5940, term5940.getClass(), "constraints", null);
        setField(term5940, term5940.getClass(), "schema", null);
        Object term5946 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5946, term5946.getClass(), "index", 5);
        setField(term5946, term5946.getClass(), "name", null);
        setField(term5946, term5946.getClass(), "max", null);
        setBooleanField(term5946, term5946.getClass(), "notNull", false);
        setField(term5946, term5946.getClass(), "defaultValue", null);
        setBooleanField(term5946, term5946.getClass(), "primaryKey", false);
        setBooleanField(term5946, term5946.getClass(), "autoincrement", false);
        setBooleanField(term5946, term5946.getClass(), "unique", false);
        setField(term5946, term5946.getClass(), "type", null);
        setField(term5946, term5946.getClass(), "dataType", null);
        setField(term5946, term5946.getClass(), "constraints", null);
        setField(term5946, term5946.getClass(), "schema", null);
        Object term5952 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5952, term5952.getClass(), "index", 6);
        setField(term5952, term5952.getClass(), "name", null);
        setField(term5952, term5952.getClass(), "max", null);
        setBooleanField(term5952, term5952.getClass(), "notNull", false);
        setField(term5952, term5952.getClass(), "defaultValue", null);
        setBooleanField(term5952, term5952.getClass(), "primaryKey", false);
        setBooleanField(term5952, term5952.getClass(), "autoincrement", false);
        setBooleanField(term5952, term5952.getClass(), "unique", false);
        setField(term5952, term5952.getClass(), "type", null);
        setField(term5952, term5952.getClass(), "dataType", null);
        setField(term5952, term5952.getClass(), "constraints", null);
        setField(term5952, term5952.getClass(), "schema", null);
        Object term5958 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5958, term5958.getClass(), "index", 7);
        setField(term5958, term5958.getClass(), "name", null);
        setField(term5958, term5958.getClass(), "max", null);
        setBooleanField(term5958, term5958.getClass(), "notNull", false);
        setField(term5958, term5958.getClass(), "defaultValue", null);
        setBooleanField(term5958, term5958.getClass(), "primaryKey", false);
        setBooleanField(term5958, term5958.getClass(), "autoincrement", false);
        setBooleanField(term5958, term5958.getClass(), "unique", false);
        setField(term5958, term5958.getClass(), "type", null);
        setField(term5958, term5958.getClass(), "dataType", null);
        setField(term5958, term5958.getClass(), "constraints", null);
        setField(term5958, term5958.getClass(), "schema", null);
        ArrayList term5914 = new ArrayList();
        ((ArrayList) term5914).add(term5916);
        ((ArrayList) term5914).add(term5922);
        ((ArrayList) term5914).add(term5928);
        ((ArrayList) term5914).add(term5934);
        ((ArrayList) term5914).add(term5940);
        ((ArrayList) term5914).add(term5946);
        ((ArrayList) term5914).add(term5952);
        ((ArrayList) term5914).add(term5958);
        HashMap term5967 = new HashMap();
        ArrayList term6001 = new ArrayList();
        HashMap term6005 = new HashMap();
        term5828 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term5829 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term5841 = (Object[]) newArray("java.lang.String", 8);
        Object term6000 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term5829, term5829.getClass(), "tableName", "nga_style");
        setElement(term5841, 0, "id");
        setElement(term5841, 1, "name");
        setElement(term5841, 2, "description");
        setElement(term5841, 3, "color");
        setElement(term5841, 4, "opacity");
        setElement(term5841, 5, "width");
        setElement(term5841, 6, "fill_color");
        setElement(term5841, 7, "fill_opacity");
        setField(term5829, term5829.getClass(), "columnNames", term5841);
        setField(term5829, term5829.getClass(), "columns", term5914);
        setBooleanField(term5829, term5829.getClass(), "custom", false);
        setField(term5829, term5829.getClass(), "nameToIndex", term5967);
        setIntField(term5829, term5829.getClass(), "pkIndex", 0);
        setBooleanField(term5829, term5829.getClass(), "pkModifiable", false);
        setBooleanField(term5829, term5829.getClass(), "valueValidation", true);
        setField(term5828, term5828.getClass(), "columns", term5829);
        setField(term6000, term6000.getClass(), "constraints", term6001);
        setField(term6000, term6000.getClass(), "typedContraints", term6005);
        setField(term5828, term5828.getClass(), "constraints", term6000);
        setField(term5828, term5828.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpacityColumnIndex", argTypes, term5828, args);
    }

};


