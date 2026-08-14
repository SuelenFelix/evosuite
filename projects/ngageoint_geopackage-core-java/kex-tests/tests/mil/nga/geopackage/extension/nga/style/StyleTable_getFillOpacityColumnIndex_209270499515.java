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

public class StyleTable_getFillOpacityColumnIndex_209270499515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7310;

    public StyleTable_getFillOpacityColumnIndex_209270499515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7398 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7398, term7398.getClass(), "index", 0);
        setField(term7398, term7398.getClass(), "name", null);
        setField(term7398, term7398.getClass(), "max", null);
        setBooleanField(term7398, term7398.getClass(), "notNull", true);
        setField(term7398, term7398.getClass(), "defaultValue", null);
        setBooleanField(term7398, term7398.getClass(), "primaryKey", true);
        setBooleanField(term7398, term7398.getClass(), "autoincrement", true);
        setBooleanField(term7398, term7398.getClass(), "unique", false);
        setField(term7398, term7398.getClass(), "type", null);
        setField(term7398, term7398.getClass(), "dataType", null);
        setField(term7398, term7398.getClass(), "constraints", null);
        setField(term7398, term7398.getClass(), "schema", null);
        Object term7404 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7404, term7404.getClass(), "index", 1);
        setField(term7404, term7404.getClass(), "name", null);
        setField(term7404, term7404.getClass(), "max", null);
        setBooleanField(term7404, term7404.getClass(), "notNull", false);
        setField(term7404, term7404.getClass(), "defaultValue", null);
        setBooleanField(term7404, term7404.getClass(), "primaryKey", false);
        setBooleanField(term7404, term7404.getClass(), "autoincrement", false);
        setBooleanField(term7404, term7404.getClass(), "unique", false);
        setField(term7404, term7404.getClass(), "type", null);
        setField(term7404, term7404.getClass(), "dataType", null);
        setField(term7404, term7404.getClass(), "constraints", null);
        setField(term7404, term7404.getClass(), "schema", null);
        Object term7410 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7410, term7410.getClass(), "index", 2);
        setField(term7410, term7410.getClass(), "name", null);
        setField(term7410, term7410.getClass(), "max", null);
        setBooleanField(term7410, term7410.getClass(), "notNull", false);
        setField(term7410, term7410.getClass(), "defaultValue", null);
        setBooleanField(term7410, term7410.getClass(), "primaryKey", false);
        setBooleanField(term7410, term7410.getClass(), "autoincrement", false);
        setBooleanField(term7410, term7410.getClass(), "unique", false);
        setField(term7410, term7410.getClass(), "type", null);
        setField(term7410, term7410.getClass(), "dataType", null);
        setField(term7410, term7410.getClass(), "constraints", null);
        setField(term7410, term7410.getClass(), "schema", null);
        Object term7416 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7416, term7416.getClass(), "index", 3);
        setField(term7416, term7416.getClass(), "name", null);
        setField(term7416, term7416.getClass(), "max", null);
        setBooleanField(term7416, term7416.getClass(), "notNull", false);
        setField(term7416, term7416.getClass(), "defaultValue", null);
        setBooleanField(term7416, term7416.getClass(), "primaryKey", false);
        setBooleanField(term7416, term7416.getClass(), "autoincrement", false);
        setBooleanField(term7416, term7416.getClass(), "unique", false);
        setField(term7416, term7416.getClass(), "type", null);
        setField(term7416, term7416.getClass(), "dataType", null);
        setField(term7416, term7416.getClass(), "constraints", null);
        setField(term7416, term7416.getClass(), "schema", null);
        Object term7422 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7422, term7422.getClass(), "index", 4);
        setField(term7422, term7422.getClass(), "name", null);
        setField(term7422, term7422.getClass(), "max", null);
        setBooleanField(term7422, term7422.getClass(), "notNull", false);
        setField(term7422, term7422.getClass(), "defaultValue", null);
        setBooleanField(term7422, term7422.getClass(), "primaryKey", false);
        setBooleanField(term7422, term7422.getClass(), "autoincrement", false);
        setBooleanField(term7422, term7422.getClass(), "unique", false);
        setField(term7422, term7422.getClass(), "type", null);
        setField(term7422, term7422.getClass(), "dataType", null);
        setField(term7422, term7422.getClass(), "constraints", null);
        setField(term7422, term7422.getClass(), "schema", null);
        Object term7428 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7428, term7428.getClass(), "index", 5);
        setField(term7428, term7428.getClass(), "name", null);
        setField(term7428, term7428.getClass(), "max", null);
        setBooleanField(term7428, term7428.getClass(), "notNull", false);
        setField(term7428, term7428.getClass(), "defaultValue", null);
        setBooleanField(term7428, term7428.getClass(), "primaryKey", false);
        setBooleanField(term7428, term7428.getClass(), "autoincrement", false);
        setBooleanField(term7428, term7428.getClass(), "unique", false);
        setField(term7428, term7428.getClass(), "type", null);
        setField(term7428, term7428.getClass(), "dataType", null);
        setField(term7428, term7428.getClass(), "constraints", null);
        setField(term7428, term7428.getClass(), "schema", null);
        Object term7434 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7434, term7434.getClass(), "index", 6);
        setField(term7434, term7434.getClass(), "name", null);
        setField(term7434, term7434.getClass(), "max", null);
        setBooleanField(term7434, term7434.getClass(), "notNull", false);
        setField(term7434, term7434.getClass(), "defaultValue", null);
        setBooleanField(term7434, term7434.getClass(), "primaryKey", false);
        setBooleanField(term7434, term7434.getClass(), "autoincrement", false);
        setBooleanField(term7434, term7434.getClass(), "unique", false);
        setField(term7434, term7434.getClass(), "type", null);
        setField(term7434, term7434.getClass(), "dataType", null);
        setField(term7434, term7434.getClass(), "constraints", null);
        setField(term7434, term7434.getClass(), "schema", null);
        Object term7440 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7440, term7440.getClass(), "index", 7);
        setField(term7440, term7440.getClass(), "name", null);
        setField(term7440, term7440.getClass(), "max", null);
        setBooleanField(term7440, term7440.getClass(), "notNull", false);
        setField(term7440, term7440.getClass(), "defaultValue", null);
        setBooleanField(term7440, term7440.getClass(), "primaryKey", false);
        setBooleanField(term7440, term7440.getClass(), "autoincrement", false);
        setBooleanField(term7440, term7440.getClass(), "unique", false);
        setField(term7440, term7440.getClass(), "type", null);
        setField(term7440, term7440.getClass(), "dataType", null);
        setField(term7440, term7440.getClass(), "constraints", null);
        setField(term7440, term7440.getClass(), "schema", null);
        ArrayList term7396 = new ArrayList();
        ((ArrayList) term7396).add(term7398);
        ((ArrayList) term7396).add(term7404);
        ((ArrayList) term7396).add(term7410);
        ((ArrayList) term7396).add(term7416);
        ((ArrayList) term7396).add(term7422);
        ((ArrayList) term7396).add(term7428);
        ((ArrayList) term7396).add(term7434);
        ((ArrayList) term7396).add(term7440);
        HashMap term7449 = new HashMap();
        ArrayList term7483 = new ArrayList();
        HashMap term7487 = new HashMap();
        term7310 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term7311 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term7323 = (Object[]) newArray("java.lang.String", 8);
        Object term7482 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7311, term7311.getClass(), "tableName", "nga_style");
        setElement(term7323, 0, "id");
        setElement(term7323, 1, "name");
        setElement(term7323, 2, "description");
        setElement(term7323, 3, "color");
        setElement(term7323, 4, "opacity");
        setElement(term7323, 5, "width");
        setElement(term7323, 6, "fill_color");
        setElement(term7323, 7, "fill_opacity");
        setField(term7311, term7311.getClass(), "columnNames", term7323);
        setField(term7311, term7311.getClass(), "columns", term7396);
        setBooleanField(term7311, term7311.getClass(), "custom", false);
        setField(term7311, term7311.getClass(), "nameToIndex", term7449);
        setIntField(term7311, term7311.getClass(), "pkIndex", 0);
        setBooleanField(term7311, term7311.getClass(), "pkModifiable", false);
        setBooleanField(term7311, term7311.getClass(), "valueValidation", true);
        setField(term7310, term7310.getClass(), "columns", term7311);
        setField(term7482, term7482.getClass(), "constraints", term7483);
        setField(term7482, term7482.getClass(), "typedContraints", term7487);
        setField(term7310, term7310.getClass(), "constraints", term7482);
        setField(term7310, term7310.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFillOpacityColumnIndex", argTypes, term7310, args);
    }

};


