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

public class StyleTable_getFillColorColumnIndex_24324884313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6816;

    public StyleTable_getFillColorColumnIndex_24324884313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6904 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6904, term6904.getClass(), "index", 0);
        setField(term6904, term6904.getClass(), "name", null);
        setField(term6904, term6904.getClass(), "max", null);
        setBooleanField(term6904, term6904.getClass(), "notNull", true);
        setField(term6904, term6904.getClass(), "defaultValue", null);
        setBooleanField(term6904, term6904.getClass(), "primaryKey", true);
        setBooleanField(term6904, term6904.getClass(), "autoincrement", true);
        setBooleanField(term6904, term6904.getClass(), "unique", false);
        setField(term6904, term6904.getClass(), "type", null);
        setField(term6904, term6904.getClass(), "dataType", null);
        setField(term6904, term6904.getClass(), "constraints", null);
        setField(term6904, term6904.getClass(), "schema", null);
        Object term6910 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6910, term6910.getClass(), "index", 1);
        setField(term6910, term6910.getClass(), "name", null);
        setField(term6910, term6910.getClass(), "max", null);
        setBooleanField(term6910, term6910.getClass(), "notNull", false);
        setField(term6910, term6910.getClass(), "defaultValue", null);
        setBooleanField(term6910, term6910.getClass(), "primaryKey", false);
        setBooleanField(term6910, term6910.getClass(), "autoincrement", false);
        setBooleanField(term6910, term6910.getClass(), "unique", false);
        setField(term6910, term6910.getClass(), "type", null);
        setField(term6910, term6910.getClass(), "dataType", null);
        setField(term6910, term6910.getClass(), "constraints", null);
        setField(term6910, term6910.getClass(), "schema", null);
        Object term6916 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6916, term6916.getClass(), "index", 2);
        setField(term6916, term6916.getClass(), "name", null);
        setField(term6916, term6916.getClass(), "max", null);
        setBooleanField(term6916, term6916.getClass(), "notNull", false);
        setField(term6916, term6916.getClass(), "defaultValue", null);
        setBooleanField(term6916, term6916.getClass(), "primaryKey", false);
        setBooleanField(term6916, term6916.getClass(), "autoincrement", false);
        setBooleanField(term6916, term6916.getClass(), "unique", false);
        setField(term6916, term6916.getClass(), "type", null);
        setField(term6916, term6916.getClass(), "dataType", null);
        setField(term6916, term6916.getClass(), "constraints", null);
        setField(term6916, term6916.getClass(), "schema", null);
        Object term6922 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6922, term6922.getClass(), "index", 3);
        setField(term6922, term6922.getClass(), "name", null);
        setField(term6922, term6922.getClass(), "max", null);
        setBooleanField(term6922, term6922.getClass(), "notNull", false);
        setField(term6922, term6922.getClass(), "defaultValue", null);
        setBooleanField(term6922, term6922.getClass(), "primaryKey", false);
        setBooleanField(term6922, term6922.getClass(), "autoincrement", false);
        setBooleanField(term6922, term6922.getClass(), "unique", false);
        setField(term6922, term6922.getClass(), "type", null);
        setField(term6922, term6922.getClass(), "dataType", null);
        setField(term6922, term6922.getClass(), "constraints", null);
        setField(term6922, term6922.getClass(), "schema", null);
        Object term6928 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6928, term6928.getClass(), "index", 4);
        setField(term6928, term6928.getClass(), "name", null);
        setField(term6928, term6928.getClass(), "max", null);
        setBooleanField(term6928, term6928.getClass(), "notNull", false);
        setField(term6928, term6928.getClass(), "defaultValue", null);
        setBooleanField(term6928, term6928.getClass(), "primaryKey", false);
        setBooleanField(term6928, term6928.getClass(), "autoincrement", false);
        setBooleanField(term6928, term6928.getClass(), "unique", false);
        setField(term6928, term6928.getClass(), "type", null);
        setField(term6928, term6928.getClass(), "dataType", null);
        setField(term6928, term6928.getClass(), "constraints", null);
        setField(term6928, term6928.getClass(), "schema", null);
        Object term6934 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6934, term6934.getClass(), "index", 5);
        setField(term6934, term6934.getClass(), "name", null);
        setField(term6934, term6934.getClass(), "max", null);
        setBooleanField(term6934, term6934.getClass(), "notNull", false);
        setField(term6934, term6934.getClass(), "defaultValue", null);
        setBooleanField(term6934, term6934.getClass(), "primaryKey", false);
        setBooleanField(term6934, term6934.getClass(), "autoincrement", false);
        setBooleanField(term6934, term6934.getClass(), "unique", false);
        setField(term6934, term6934.getClass(), "type", null);
        setField(term6934, term6934.getClass(), "dataType", null);
        setField(term6934, term6934.getClass(), "constraints", null);
        setField(term6934, term6934.getClass(), "schema", null);
        Object term6940 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6940, term6940.getClass(), "index", 6);
        setField(term6940, term6940.getClass(), "name", null);
        setField(term6940, term6940.getClass(), "max", null);
        setBooleanField(term6940, term6940.getClass(), "notNull", false);
        setField(term6940, term6940.getClass(), "defaultValue", null);
        setBooleanField(term6940, term6940.getClass(), "primaryKey", false);
        setBooleanField(term6940, term6940.getClass(), "autoincrement", false);
        setBooleanField(term6940, term6940.getClass(), "unique", false);
        setField(term6940, term6940.getClass(), "type", null);
        setField(term6940, term6940.getClass(), "dataType", null);
        setField(term6940, term6940.getClass(), "constraints", null);
        setField(term6940, term6940.getClass(), "schema", null);
        Object term6946 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6946, term6946.getClass(), "index", 7);
        setField(term6946, term6946.getClass(), "name", null);
        setField(term6946, term6946.getClass(), "max", null);
        setBooleanField(term6946, term6946.getClass(), "notNull", false);
        setField(term6946, term6946.getClass(), "defaultValue", null);
        setBooleanField(term6946, term6946.getClass(), "primaryKey", false);
        setBooleanField(term6946, term6946.getClass(), "autoincrement", false);
        setBooleanField(term6946, term6946.getClass(), "unique", false);
        setField(term6946, term6946.getClass(), "type", null);
        setField(term6946, term6946.getClass(), "dataType", null);
        setField(term6946, term6946.getClass(), "constraints", null);
        setField(term6946, term6946.getClass(), "schema", null);
        ArrayList term6902 = new ArrayList();
        ((ArrayList) term6902).add(term6904);
        ((ArrayList) term6902).add(term6910);
        ((ArrayList) term6902).add(term6916);
        ((ArrayList) term6902).add(term6922);
        ((ArrayList) term6902).add(term6928);
        ((ArrayList) term6902).add(term6934);
        ((ArrayList) term6902).add(term6940);
        ((ArrayList) term6902).add(term6946);
        HashMap term6955 = new HashMap();
        ArrayList term6989 = new ArrayList();
        HashMap term6993 = new HashMap();
        term6816 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term6817 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term6829 = (Object[]) newArray("java.lang.String", 8);
        Object term6988 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term6817, term6817.getClass(), "tableName", "nga_style");
        setElement(term6829, 0, "id");
        setElement(term6829, 1, "name");
        setElement(term6829, 2, "description");
        setElement(term6829, 3, "color");
        setElement(term6829, 4, "opacity");
        setElement(term6829, 5, "width");
        setElement(term6829, 6, "fill_color");
        setElement(term6829, 7, "fill_opacity");
        setField(term6817, term6817.getClass(), "columnNames", term6829);
        setField(term6817, term6817.getClass(), "columns", term6902);
        setBooleanField(term6817, term6817.getClass(), "custom", false);
        setField(term6817, term6817.getClass(), "nameToIndex", term6955);
        setIntField(term6817, term6817.getClass(), "pkIndex", 0);
        setBooleanField(term6817, term6817.getClass(), "pkModifiable", false);
        setBooleanField(term6817, term6817.getClass(), "valueValidation", true);
        setField(term6816, term6816.getClass(), "columns", term6817);
        setField(term6988, term6988.getClass(), "constraints", term6989);
        setField(term6988, term6988.getClass(), "typedContraints", term6993);
        setField(term6816, term6816.getClass(), "constraints", term6988);
        setField(term6816, term6816.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFillColorColumnIndex", argTypes, term6816, args);
    }

};


