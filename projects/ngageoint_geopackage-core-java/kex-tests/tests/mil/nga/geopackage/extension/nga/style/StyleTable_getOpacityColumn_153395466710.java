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

public class StyleTable_getOpacityColumn_153395466710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6075;

    public StyleTable_getOpacityColumn_153395466710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6163 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6163, term6163.getClass(), "index", 0);
        setField(term6163, term6163.getClass(), "name", null);
        setField(term6163, term6163.getClass(), "max", null);
        setBooleanField(term6163, term6163.getClass(), "notNull", true);
        setField(term6163, term6163.getClass(), "defaultValue", null);
        setBooleanField(term6163, term6163.getClass(), "primaryKey", true);
        setBooleanField(term6163, term6163.getClass(), "autoincrement", true);
        setBooleanField(term6163, term6163.getClass(), "unique", false);
        setField(term6163, term6163.getClass(), "type", null);
        setField(term6163, term6163.getClass(), "dataType", null);
        setField(term6163, term6163.getClass(), "constraints", null);
        setField(term6163, term6163.getClass(), "schema", null);
        Object term6169 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6169, term6169.getClass(), "index", 1);
        setField(term6169, term6169.getClass(), "name", null);
        setField(term6169, term6169.getClass(), "max", null);
        setBooleanField(term6169, term6169.getClass(), "notNull", false);
        setField(term6169, term6169.getClass(), "defaultValue", null);
        setBooleanField(term6169, term6169.getClass(), "primaryKey", false);
        setBooleanField(term6169, term6169.getClass(), "autoincrement", false);
        setBooleanField(term6169, term6169.getClass(), "unique", false);
        setField(term6169, term6169.getClass(), "type", null);
        setField(term6169, term6169.getClass(), "dataType", null);
        setField(term6169, term6169.getClass(), "constraints", null);
        setField(term6169, term6169.getClass(), "schema", null);
        Object term6175 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6175, term6175.getClass(), "index", 2);
        setField(term6175, term6175.getClass(), "name", null);
        setField(term6175, term6175.getClass(), "max", null);
        setBooleanField(term6175, term6175.getClass(), "notNull", false);
        setField(term6175, term6175.getClass(), "defaultValue", null);
        setBooleanField(term6175, term6175.getClass(), "primaryKey", false);
        setBooleanField(term6175, term6175.getClass(), "autoincrement", false);
        setBooleanField(term6175, term6175.getClass(), "unique", false);
        setField(term6175, term6175.getClass(), "type", null);
        setField(term6175, term6175.getClass(), "dataType", null);
        setField(term6175, term6175.getClass(), "constraints", null);
        setField(term6175, term6175.getClass(), "schema", null);
        Object term6181 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6181, term6181.getClass(), "index", 3);
        setField(term6181, term6181.getClass(), "name", null);
        setField(term6181, term6181.getClass(), "max", null);
        setBooleanField(term6181, term6181.getClass(), "notNull", false);
        setField(term6181, term6181.getClass(), "defaultValue", null);
        setBooleanField(term6181, term6181.getClass(), "primaryKey", false);
        setBooleanField(term6181, term6181.getClass(), "autoincrement", false);
        setBooleanField(term6181, term6181.getClass(), "unique", false);
        setField(term6181, term6181.getClass(), "type", null);
        setField(term6181, term6181.getClass(), "dataType", null);
        setField(term6181, term6181.getClass(), "constraints", null);
        setField(term6181, term6181.getClass(), "schema", null);
        Object term6187 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6187, term6187.getClass(), "index", 4);
        setField(term6187, term6187.getClass(), "name", null);
        setField(term6187, term6187.getClass(), "max", null);
        setBooleanField(term6187, term6187.getClass(), "notNull", false);
        setField(term6187, term6187.getClass(), "defaultValue", null);
        setBooleanField(term6187, term6187.getClass(), "primaryKey", false);
        setBooleanField(term6187, term6187.getClass(), "autoincrement", false);
        setBooleanField(term6187, term6187.getClass(), "unique", false);
        setField(term6187, term6187.getClass(), "type", null);
        setField(term6187, term6187.getClass(), "dataType", null);
        setField(term6187, term6187.getClass(), "constraints", null);
        setField(term6187, term6187.getClass(), "schema", null);
        Object term6193 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6193, term6193.getClass(), "index", 5);
        setField(term6193, term6193.getClass(), "name", null);
        setField(term6193, term6193.getClass(), "max", null);
        setBooleanField(term6193, term6193.getClass(), "notNull", false);
        setField(term6193, term6193.getClass(), "defaultValue", null);
        setBooleanField(term6193, term6193.getClass(), "primaryKey", false);
        setBooleanField(term6193, term6193.getClass(), "autoincrement", false);
        setBooleanField(term6193, term6193.getClass(), "unique", false);
        setField(term6193, term6193.getClass(), "type", null);
        setField(term6193, term6193.getClass(), "dataType", null);
        setField(term6193, term6193.getClass(), "constraints", null);
        setField(term6193, term6193.getClass(), "schema", null);
        Object term6199 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6199, term6199.getClass(), "index", 6);
        setField(term6199, term6199.getClass(), "name", null);
        setField(term6199, term6199.getClass(), "max", null);
        setBooleanField(term6199, term6199.getClass(), "notNull", false);
        setField(term6199, term6199.getClass(), "defaultValue", null);
        setBooleanField(term6199, term6199.getClass(), "primaryKey", false);
        setBooleanField(term6199, term6199.getClass(), "autoincrement", false);
        setBooleanField(term6199, term6199.getClass(), "unique", false);
        setField(term6199, term6199.getClass(), "type", null);
        setField(term6199, term6199.getClass(), "dataType", null);
        setField(term6199, term6199.getClass(), "constraints", null);
        setField(term6199, term6199.getClass(), "schema", null);
        Object term6205 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6205, term6205.getClass(), "index", 7);
        setField(term6205, term6205.getClass(), "name", null);
        setField(term6205, term6205.getClass(), "max", null);
        setBooleanField(term6205, term6205.getClass(), "notNull", false);
        setField(term6205, term6205.getClass(), "defaultValue", null);
        setBooleanField(term6205, term6205.getClass(), "primaryKey", false);
        setBooleanField(term6205, term6205.getClass(), "autoincrement", false);
        setBooleanField(term6205, term6205.getClass(), "unique", false);
        setField(term6205, term6205.getClass(), "type", null);
        setField(term6205, term6205.getClass(), "dataType", null);
        setField(term6205, term6205.getClass(), "constraints", null);
        setField(term6205, term6205.getClass(), "schema", null);
        ArrayList term6161 = new ArrayList();
        ((ArrayList) term6161).add(term6163);
        ((ArrayList) term6161).add(term6169);
        ((ArrayList) term6161).add(term6175);
        ((ArrayList) term6161).add(term6181);
        ((ArrayList) term6161).add(term6187);
        ((ArrayList) term6161).add(term6193);
        ((ArrayList) term6161).add(term6199);
        ((ArrayList) term6161).add(term6205);
        HashMap term6214 = new HashMap();
        ArrayList term6248 = new ArrayList();
        HashMap term6252 = new HashMap();
        term6075 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term6076 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term6088 = (Object[]) newArray("java.lang.String", 8);
        Object term6247 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term6076, term6076.getClass(), "tableName", "nga_style");
        setElement(term6088, 0, "id");
        setElement(term6088, 1, "name");
        setElement(term6088, 2, "description");
        setElement(term6088, 3, "color");
        setElement(term6088, 4, "opacity");
        setElement(term6088, 5, "width");
        setElement(term6088, 6, "fill_color");
        setElement(term6088, 7, "fill_opacity");
        setField(term6076, term6076.getClass(), "columnNames", term6088);
        setField(term6076, term6076.getClass(), "columns", term6161);
        setBooleanField(term6076, term6076.getClass(), "custom", false);
        setField(term6076, term6076.getClass(), "nameToIndex", term6214);
        setIntField(term6076, term6076.getClass(), "pkIndex", 0);
        setBooleanField(term6076, term6076.getClass(), "pkModifiable", false);
        setBooleanField(term6076, term6076.getClass(), "valueValidation", true);
        setField(term6075, term6075.getClass(), "columns", term6076);
        setField(term6247, term6247.getClass(), "constraints", term6248);
        setField(term6247, term6247.getClass(), "typedContraints", term6252);
        setField(term6075, term6075.getClass(), "constraints", term6247);
        setField(term6075, term6075.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpacityColumn", argTypes, term6075, args);
    }

};


