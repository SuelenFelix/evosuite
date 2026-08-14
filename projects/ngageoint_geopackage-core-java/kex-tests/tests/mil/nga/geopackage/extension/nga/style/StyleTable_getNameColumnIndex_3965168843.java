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

public class StyleTable_getNameColumnIndex_3965168843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4346;

    public StyleTable_getNameColumnIndex_3965168843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4434 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4434, term4434.getClass(), "index", 0);
        setField(term4434, term4434.getClass(), "name", null);
        setField(term4434, term4434.getClass(), "max", null);
        setBooleanField(term4434, term4434.getClass(), "notNull", true);
        setField(term4434, term4434.getClass(), "defaultValue", null);
        setBooleanField(term4434, term4434.getClass(), "primaryKey", true);
        setBooleanField(term4434, term4434.getClass(), "autoincrement", true);
        setBooleanField(term4434, term4434.getClass(), "unique", false);
        setField(term4434, term4434.getClass(), "type", null);
        setField(term4434, term4434.getClass(), "dataType", null);
        setField(term4434, term4434.getClass(), "constraints", null);
        setField(term4434, term4434.getClass(), "schema", null);
        Object term4440 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4440, term4440.getClass(), "index", 1);
        setField(term4440, term4440.getClass(), "name", null);
        setField(term4440, term4440.getClass(), "max", null);
        setBooleanField(term4440, term4440.getClass(), "notNull", false);
        setField(term4440, term4440.getClass(), "defaultValue", null);
        setBooleanField(term4440, term4440.getClass(), "primaryKey", false);
        setBooleanField(term4440, term4440.getClass(), "autoincrement", false);
        setBooleanField(term4440, term4440.getClass(), "unique", false);
        setField(term4440, term4440.getClass(), "type", null);
        setField(term4440, term4440.getClass(), "dataType", null);
        setField(term4440, term4440.getClass(), "constraints", null);
        setField(term4440, term4440.getClass(), "schema", null);
        Object term4446 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4446, term4446.getClass(), "index", 2);
        setField(term4446, term4446.getClass(), "name", null);
        setField(term4446, term4446.getClass(), "max", null);
        setBooleanField(term4446, term4446.getClass(), "notNull", false);
        setField(term4446, term4446.getClass(), "defaultValue", null);
        setBooleanField(term4446, term4446.getClass(), "primaryKey", false);
        setBooleanField(term4446, term4446.getClass(), "autoincrement", false);
        setBooleanField(term4446, term4446.getClass(), "unique", false);
        setField(term4446, term4446.getClass(), "type", null);
        setField(term4446, term4446.getClass(), "dataType", null);
        setField(term4446, term4446.getClass(), "constraints", null);
        setField(term4446, term4446.getClass(), "schema", null);
        Object term4452 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4452, term4452.getClass(), "index", 3);
        setField(term4452, term4452.getClass(), "name", null);
        setField(term4452, term4452.getClass(), "max", null);
        setBooleanField(term4452, term4452.getClass(), "notNull", false);
        setField(term4452, term4452.getClass(), "defaultValue", null);
        setBooleanField(term4452, term4452.getClass(), "primaryKey", false);
        setBooleanField(term4452, term4452.getClass(), "autoincrement", false);
        setBooleanField(term4452, term4452.getClass(), "unique", false);
        setField(term4452, term4452.getClass(), "type", null);
        setField(term4452, term4452.getClass(), "dataType", null);
        setField(term4452, term4452.getClass(), "constraints", null);
        setField(term4452, term4452.getClass(), "schema", null);
        Object term4458 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4458, term4458.getClass(), "index", 4);
        setField(term4458, term4458.getClass(), "name", null);
        setField(term4458, term4458.getClass(), "max", null);
        setBooleanField(term4458, term4458.getClass(), "notNull", false);
        setField(term4458, term4458.getClass(), "defaultValue", null);
        setBooleanField(term4458, term4458.getClass(), "primaryKey", false);
        setBooleanField(term4458, term4458.getClass(), "autoincrement", false);
        setBooleanField(term4458, term4458.getClass(), "unique", false);
        setField(term4458, term4458.getClass(), "type", null);
        setField(term4458, term4458.getClass(), "dataType", null);
        setField(term4458, term4458.getClass(), "constraints", null);
        setField(term4458, term4458.getClass(), "schema", null);
        Object term4464 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4464, term4464.getClass(), "index", 5);
        setField(term4464, term4464.getClass(), "name", null);
        setField(term4464, term4464.getClass(), "max", null);
        setBooleanField(term4464, term4464.getClass(), "notNull", false);
        setField(term4464, term4464.getClass(), "defaultValue", null);
        setBooleanField(term4464, term4464.getClass(), "primaryKey", false);
        setBooleanField(term4464, term4464.getClass(), "autoincrement", false);
        setBooleanField(term4464, term4464.getClass(), "unique", false);
        setField(term4464, term4464.getClass(), "type", null);
        setField(term4464, term4464.getClass(), "dataType", null);
        setField(term4464, term4464.getClass(), "constraints", null);
        setField(term4464, term4464.getClass(), "schema", null);
        Object term4470 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4470, term4470.getClass(), "index", 6);
        setField(term4470, term4470.getClass(), "name", null);
        setField(term4470, term4470.getClass(), "max", null);
        setBooleanField(term4470, term4470.getClass(), "notNull", false);
        setField(term4470, term4470.getClass(), "defaultValue", null);
        setBooleanField(term4470, term4470.getClass(), "primaryKey", false);
        setBooleanField(term4470, term4470.getClass(), "autoincrement", false);
        setBooleanField(term4470, term4470.getClass(), "unique", false);
        setField(term4470, term4470.getClass(), "type", null);
        setField(term4470, term4470.getClass(), "dataType", null);
        setField(term4470, term4470.getClass(), "constraints", null);
        setField(term4470, term4470.getClass(), "schema", null);
        Object term4476 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4476, term4476.getClass(), "index", 7);
        setField(term4476, term4476.getClass(), "name", null);
        setField(term4476, term4476.getClass(), "max", null);
        setBooleanField(term4476, term4476.getClass(), "notNull", false);
        setField(term4476, term4476.getClass(), "defaultValue", null);
        setBooleanField(term4476, term4476.getClass(), "primaryKey", false);
        setBooleanField(term4476, term4476.getClass(), "autoincrement", false);
        setBooleanField(term4476, term4476.getClass(), "unique", false);
        setField(term4476, term4476.getClass(), "type", null);
        setField(term4476, term4476.getClass(), "dataType", null);
        setField(term4476, term4476.getClass(), "constraints", null);
        setField(term4476, term4476.getClass(), "schema", null);
        ArrayList term4432 = new ArrayList();
        ((ArrayList) term4432).add(term4434);
        ((ArrayList) term4432).add(term4440);
        ((ArrayList) term4432).add(term4446);
        ((ArrayList) term4432).add(term4452);
        ((ArrayList) term4432).add(term4458);
        ((ArrayList) term4432).add(term4464);
        ((ArrayList) term4432).add(term4470);
        ((ArrayList) term4432).add(term4476);
        HashMap term4485 = new HashMap();
        ArrayList term4519 = new ArrayList();
        HashMap term4523 = new HashMap();
        term4346 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term4347 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term4359 = (Object[]) newArray("java.lang.String", 8);
        Object term4518 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4347, term4347.getClass(), "tableName", "nga_style");
        setElement(term4359, 0, "id");
        setElement(term4359, 1, "name");
        setElement(term4359, 2, "description");
        setElement(term4359, 3, "color");
        setElement(term4359, 4, "opacity");
        setElement(term4359, 5, "width");
        setElement(term4359, 6, "fill_color");
        setElement(term4359, 7, "fill_opacity");
        setField(term4347, term4347.getClass(), "columnNames", term4359);
        setField(term4347, term4347.getClass(), "columns", term4432);
        setBooleanField(term4347, term4347.getClass(), "custom", false);
        setField(term4347, term4347.getClass(), "nameToIndex", term4485);
        setIntField(term4347, term4347.getClass(), "pkIndex", 0);
        setBooleanField(term4347, term4347.getClass(), "pkModifiable", false);
        setBooleanField(term4347, term4347.getClass(), "valueValidation", true);
        setField(term4346, term4346.getClass(), "columns", term4347);
        setField(term4518, term4518.getClass(), "constraints", term4519);
        setField(term4518, term4518.getClass(), "typedContraints", term4523);
        setField(term4346, term4346.getClass(), "constraints", term4518);
        setField(term4346, term4346.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameColumnIndex", argTypes, term4346, args);
    }

};


