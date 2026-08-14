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

public class StyleTable_getWidthColumnIndex_167089699711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6322;

    public StyleTable_getWidthColumnIndex_167089699711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6410 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6410, term6410.getClass(), "index", 0);
        setField(term6410, term6410.getClass(), "name", null);
        setField(term6410, term6410.getClass(), "max", null);
        setBooleanField(term6410, term6410.getClass(), "notNull", true);
        setField(term6410, term6410.getClass(), "defaultValue", null);
        setBooleanField(term6410, term6410.getClass(), "primaryKey", true);
        setBooleanField(term6410, term6410.getClass(), "autoincrement", true);
        setBooleanField(term6410, term6410.getClass(), "unique", false);
        setField(term6410, term6410.getClass(), "type", null);
        setField(term6410, term6410.getClass(), "dataType", null);
        setField(term6410, term6410.getClass(), "constraints", null);
        setField(term6410, term6410.getClass(), "schema", null);
        Object term6416 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6416, term6416.getClass(), "index", 1);
        setField(term6416, term6416.getClass(), "name", null);
        setField(term6416, term6416.getClass(), "max", null);
        setBooleanField(term6416, term6416.getClass(), "notNull", false);
        setField(term6416, term6416.getClass(), "defaultValue", null);
        setBooleanField(term6416, term6416.getClass(), "primaryKey", false);
        setBooleanField(term6416, term6416.getClass(), "autoincrement", false);
        setBooleanField(term6416, term6416.getClass(), "unique", false);
        setField(term6416, term6416.getClass(), "type", null);
        setField(term6416, term6416.getClass(), "dataType", null);
        setField(term6416, term6416.getClass(), "constraints", null);
        setField(term6416, term6416.getClass(), "schema", null);
        Object term6422 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6422, term6422.getClass(), "index", 2);
        setField(term6422, term6422.getClass(), "name", null);
        setField(term6422, term6422.getClass(), "max", null);
        setBooleanField(term6422, term6422.getClass(), "notNull", false);
        setField(term6422, term6422.getClass(), "defaultValue", null);
        setBooleanField(term6422, term6422.getClass(), "primaryKey", false);
        setBooleanField(term6422, term6422.getClass(), "autoincrement", false);
        setBooleanField(term6422, term6422.getClass(), "unique", false);
        setField(term6422, term6422.getClass(), "type", null);
        setField(term6422, term6422.getClass(), "dataType", null);
        setField(term6422, term6422.getClass(), "constraints", null);
        setField(term6422, term6422.getClass(), "schema", null);
        Object term6428 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6428, term6428.getClass(), "index", 3);
        setField(term6428, term6428.getClass(), "name", null);
        setField(term6428, term6428.getClass(), "max", null);
        setBooleanField(term6428, term6428.getClass(), "notNull", false);
        setField(term6428, term6428.getClass(), "defaultValue", null);
        setBooleanField(term6428, term6428.getClass(), "primaryKey", false);
        setBooleanField(term6428, term6428.getClass(), "autoincrement", false);
        setBooleanField(term6428, term6428.getClass(), "unique", false);
        setField(term6428, term6428.getClass(), "type", null);
        setField(term6428, term6428.getClass(), "dataType", null);
        setField(term6428, term6428.getClass(), "constraints", null);
        setField(term6428, term6428.getClass(), "schema", null);
        Object term6434 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6434, term6434.getClass(), "index", 4);
        setField(term6434, term6434.getClass(), "name", null);
        setField(term6434, term6434.getClass(), "max", null);
        setBooleanField(term6434, term6434.getClass(), "notNull", false);
        setField(term6434, term6434.getClass(), "defaultValue", null);
        setBooleanField(term6434, term6434.getClass(), "primaryKey", false);
        setBooleanField(term6434, term6434.getClass(), "autoincrement", false);
        setBooleanField(term6434, term6434.getClass(), "unique", false);
        setField(term6434, term6434.getClass(), "type", null);
        setField(term6434, term6434.getClass(), "dataType", null);
        setField(term6434, term6434.getClass(), "constraints", null);
        setField(term6434, term6434.getClass(), "schema", null);
        Object term6440 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6440, term6440.getClass(), "index", 5);
        setField(term6440, term6440.getClass(), "name", null);
        setField(term6440, term6440.getClass(), "max", null);
        setBooleanField(term6440, term6440.getClass(), "notNull", false);
        setField(term6440, term6440.getClass(), "defaultValue", null);
        setBooleanField(term6440, term6440.getClass(), "primaryKey", false);
        setBooleanField(term6440, term6440.getClass(), "autoincrement", false);
        setBooleanField(term6440, term6440.getClass(), "unique", false);
        setField(term6440, term6440.getClass(), "type", null);
        setField(term6440, term6440.getClass(), "dataType", null);
        setField(term6440, term6440.getClass(), "constraints", null);
        setField(term6440, term6440.getClass(), "schema", null);
        Object term6446 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6446, term6446.getClass(), "index", 6);
        setField(term6446, term6446.getClass(), "name", null);
        setField(term6446, term6446.getClass(), "max", null);
        setBooleanField(term6446, term6446.getClass(), "notNull", false);
        setField(term6446, term6446.getClass(), "defaultValue", null);
        setBooleanField(term6446, term6446.getClass(), "primaryKey", false);
        setBooleanField(term6446, term6446.getClass(), "autoincrement", false);
        setBooleanField(term6446, term6446.getClass(), "unique", false);
        setField(term6446, term6446.getClass(), "type", null);
        setField(term6446, term6446.getClass(), "dataType", null);
        setField(term6446, term6446.getClass(), "constraints", null);
        setField(term6446, term6446.getClass(), "schema", null);
        Object term6452 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6452, term6452.getClass(), "index", 7);
        setField(term6452, term6452.getClass(), "name", null);
        setField(term6452, term6452.getClass(), "max", null);
        setBooleanField(term6452, term6452.getClass(), "notNull", false);
        setField(term6452, term6452.getClass(), "defaultValue", null);
        setBooleanField(term6452, term6452.getClass(), "primaryKey", false);
        setBooleanField(term6452, term6452.getClass(), "autoincrement", false);
        setBooleanField(term6452, term6452.getClass(), "unique", false);
        setField(term6452, term6452.getClass(), "type", null);
        setField(term6452, term6452.getClass(), "dataType", null);
        setField(term6452, term6452.getClass(), "constraints", null);
        setField(term6452, term6452.getClass(), "schema", null);
        ArrayList term6408 = new ArrayList();
        ((ArrayList) term6408).add(term6410);
        ((ArrayList) term6408).add(term6416);
        ((ArrayList) term6408).add(term6422);
        ((ArrayList) term6408).add(term6428);
        ((ArrayList) term6408).add(term6434);
        ((ArrayList) term6408).add(term6440);
        ((ArrayList) term6408).add(term6446);
        ((ArrayList) term6408).add(term6452);
        HashMap term6461 = new HashMap();
        ArrayList term6495 = new ArrayList();
        HashMap term6499 = new HashMap();
        term6322 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term6323 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term6335 = (Object[]) newArray("java.lang.String", 8);
        Object term6494 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term6323, term6323.getClass(), "tableName", "nga_style");
        setElement(term6335, 0, "id");
        setElement(term6335, 1, "name");
        setElement(term6335, 2, "description");
        setElement(term6335, 3, "color");
        setElement(term6335, 4, "opacity");
        setElement(term6335, 5, "width");
        setElement(term6335, 6, "fill_color");
        setElement(term6335, 7, "fill_opacity");
        setField(term6323, term6323.getClass(), "columnNames", term6335);
        setField(term6323, term6323.getClass(), "columns", term6408);
        setBooleanField(term6323, term6323.getClass(), "custom", false);
        setField(term6323, term6323.getClass(), "nameToIndex", term6461);
        setIntField(term6323, term6323.getClass(), "pkIndex", 0);
        setBooleanField(term6323, term6323.getClass(), "pkModifiable", false);
        setBooleanField(term6323, term6323.getClass(), "valueValidation", true);
        setField(term6322, term6322.getClass(), "columns", term6323);
        setField(term6494, term6494.getClass(), "constraints", term6495);
        setField(term6494, term6494.getClass(), "typedContraints", term6499);
        setField(term6322, term6322.getClass(), "constraints", term6494);
        setField(term6322, term6322.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWidthColumnIndex", argTypes, term6322, args);
    }

};


