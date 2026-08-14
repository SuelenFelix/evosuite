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

public class StyleTable_getFillColorColumn_206715741814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7063;

    public StyleTable_getFillColorColumn_206715741814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7151 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7151, term7151.getClass(), "index", 0);
        setField(term7151, term7151.getClass(), "name", null);
        setField(term7151, term7151.getClass(), "max", null);
        setBooleanField(term7151, term7151.getClass(), "notNull", true);
        setField(term7151, term7151.getClass(), "defaultValue", null);
        setBooleanField(term7151, term7151.getClass(), "primaryKey", true);
        setBooleanField(term7151, term7151.getClass(), "autoincrement", true);
        setBooleanField(term7151, term7151.getClass(), "unique", false);
        setField(term7151, term7151.getClass(), "type", null);
        setField(term7151, term7151.getClass(), "dataType", null);
        setField(term7151, term7151.getClass(), "constraints", null);
        setField(term7151, term7151.getClass(), "schema", null);
        Object term7157 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7157, term7157.getClass(), "index", 1);
        setField(term7157, term7157.getClass(), "name", null);
        setField(term7157, term7157.getClass(), "max", null);
        setBooleanField(term7157, term7157.getClass(), "notNull", false);
        setField(term7157, term7157.getClass(), "defaultValue", null);
        setBooleanField(term7157, term7157.getClass(), "primaryKey", false);
        setBooleanField(term7157, term7157.getClass(), "autoincrement", false);
        setBooleanField(term7157, term7157.getClass(), "unique", false);
        setField(term7157, term7157.getClass(), "type", null);
        setField(term7157, term7157.getClass(), "dataType", null);
        setField(term7157, term7157.getClass(), "constraints", null);
        setField(term7157, term7157.getClass(), "schema", null);
        Object term7163 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7163, term7163.getClass(), "index", 2);
        setField(term7163, term7163.getClass(), "name", null);
        setField(term7163, term7163.getClass(), "max", null);
        setBooleanField(term7163, term7163.getClass(), "notNull", false);
        setField(term7163, term7163.getClass(), "defaultValue", null);
        setBooleanField(term7163, term7163.getClass(), "primaryKey", false);
        setBooleanField(term7163, term7163.getClass(), "autoincrement", false);
        setBooleanField(term7163, term7163.getClass(), "unique", false);
        setField(term7163, term7163.getClass(), "type", null);
        setField(term7163, term7163.getClass(), "dataType", null);
        setField(term7163, term7163.getClass(), "constraints", null);
        setField(term7163, term7163.getClass(), "schema", null);
        Object term7169 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7169, term7169.getClass(), "index", 3);
        setField(term7169, term7169.getClass(), "name", null);
        setField(term7169, term7169.getClass(), "max", null);
        setBooleanField(term7169, term7169.getClass(), "notNull", false);
        setField(term7169, term7169.getClass(), "defaultValue", null);
        setBooleanField(term7169, term7169.getClass(), "primaryKey", false);
        setBooleanField(term7169, term7169.getClass(), "autoincrement", false);
        setBooleanField(term7169, term7169.getClass(), "unique", false);
        setField(term7169, term7169.getClass(), "type", null);
        setField(term7169, term7169.getClass(), "dataType", null);
        setField(term7169, term7169.getClass(), "constraints", null);
        setField(term7169, term7169.getClass(), "schema", null);
        Object term7175 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7175, term7175.getClass(), "index", 4);
        setField(term7175, term7175.getClass(), "name", null);
        setField(term7175, term7175.getClass(), "max", null);
        setBooleanField(term7175, term7175.getClass(), "notNull", false);
        setField(term7175, term7175.getClass(), "defaultValue", null);
        setBooleanField(term7175, term7175.getClass(), "primaryKey", false);
        setBooleanField(term7175, term7175.getClass(), "autoincrement", false);
        setBooleanField(term7175, term7175.getClass(), "unique", false);
        setField(term7175, term7175.getClass(), "type", null);
        setField(term7175, term7175.getClass(), "dataType", null);
        setField(term7175, term7175.getClass(), "constraints", null);
        setField(term7175, term7175.getClass(), "schema", null);
        Object term7181 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7181, term7181.getClass(), "index", 5);
        setField(term7181, term7181.getClass(), "name", null);
        setField(term7181, term7181.getClass(), "max", null);
        setBooleanField(term7181, term7181.getClass(), "notNull", false);
        setField(term7181, term7181.getClass(), "defaultValue", null);
        setBooleanField(term7181, term7181.getClass(), "primaryKey", false);
        setBooleanField(term7181, term7181.getClass(), "autoincrement", false);
        setBooleanField(term7181, term7181.getClass(), "unique", false);
        setField(term7181, term7181.getClass(), "type", null);
        setField(term7181, term7181.getClass(), "dataType", null);
        setField(term7181, term7181.getClass(), "constraints", null);
        setField(term7181, term7181.getClass(), "schema", null);
        Object term7187 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7187, term7187.getClass(), "index", 6);
        setField(term7187, term7187.getClass(), "name", null);
        setField(term7187, term7187.getClass(), "max", null);
        setBooleanField(term7187, term7187.getClass(), "notNull", false);
        setField(term7187, term7187.getClass(), "defaultValue", null);
        setBooleanField(term7187, term7187.getClass(), "primaryKey", false);
        setBooleanField(term7187, term7187.getClass(), "autoincrement", false);
        setBooleanField(term7187, term7187.getClass(), "unique", false);
        setField(term7187, term7187.getClass(), "type", null);
        setField(term7187, term7187.getClass(), "dataType", null);
        setField(term7187, term7187.getClass(), "constraints", null);
        setField(term7187, term7187.getClass(), "schema", null);
        Object term7193 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7193, term7193.getClass(), "index", 7);
        setField(term7193, term7193.getClass(), "name", null);
        setField(term7193, term7193.getClass(), "max", null);
        setBooleanField(term7193, term7193.getClass(), "notNull", false);
        setField(term7193, term7193.getClass(), "defaultValue", null);
        setBooleanField(term7193, term7193.getClass(), "primaryKey", false);
        setBooleanField(term7193, term7193.getClass(), "autoincrement", false);
        setBooleanField(term7193, term7193.getClass(), "unique", false);
        setField(term7193, term7193.getClass(), "type", null);
        setField(term7193, term7193.getClass(), "dataType", null);
        setField(term7193, term7193.getClass(), "constraints", null);
        setField(term7193, term7193.getClass(), "schema", null);
        ArrayList term7149 = new ArrayList();
        ((ArrayList) term7149).add(term7151);
        ((ArrayList) term7149).add(term7157);
        ((ArrayList) term7149).add(term7163);
        ((ArrayList) term7149).add(term7169);
        ((ArrayList) term7149).add(term7175);
        ((ArrayList) term7149).add(term7181);
        ((ArrayList) term7149).add(term7187);
        ((ArrayList) term7149).add(term7193);
        HashMap term7202 = new HashMap();
        ArrayList term7236 = new ArrayList();
        HashMap term7240 = new HashMap();
        term7063 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term7064 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term7076 = (Object[]) newArray("java.lang.String", 8);
        Object term7235 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7064, term7064.getClass(), "tableName", "nga_style");
        setElement(term7076, 0, "id");
        setElement(term7076, 1, "name");
        setElement(term7076, 2, "description");
        setElement(term7076, 3, "color");
        setElement(term7076, 4, "opacity");
        setElement(term7076, 5, "width");
        setElement(term7076, 6, "fill_color");
        setElement(term7076, 7, "fill_opacity");
        setField(term7064, term7064.getClass(), "columnNames", term7076);
        setField(term7064, term7064.getClass(), "columns", term7149);
        setBooleanField(term7064, term7064.getClass(), "custom", false);
        setField(term7064, term7064.getClass(), "nameToIndex", term7202);
        setIntField(term7064, term7064.getClass(), "pkIndex", 0);
        setBooleanField(term7064, term7064.getClass(), "pkModifiable", false);
        setBooleanField(term7064, term7064.getClass(), "valueValidation", true);
        setField(term7063, term7063.getClass(), "columns", term7064);
        setField(term7235, term7235.getClass(), "constraints", term7236);
        setField(term7235, term7235.getClass(), "typedContraints", term7240);
        setField(term7063, term7063.getClass(), "constraints", term7235);
        setField(term7063, term7063.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFillColorColumn", argTypes, term7063, args);
    }

};


