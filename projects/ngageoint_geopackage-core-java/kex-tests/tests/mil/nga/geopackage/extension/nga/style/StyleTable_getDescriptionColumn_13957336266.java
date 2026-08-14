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

public class StyleTable_getDescriptionColumn_13957336266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5087;

    public StyleTable_getDescriptionColumn_13957336266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5175 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5175, term5175.getClass(), "index", 0);
        setField(term5175, term5175.getClass(), "name", null);
        setField(term5175, term5175.getClass(), "max", null);
        setBooleanField(term5175, term5175.getClass(), "notNull", true);
        setField(term5175, term5175.getClass(), "defaultValue", null);
        setBooleanField(term5175, term5175.getClass(), "primaryKey", true);
        setBooleanField(term5175, term5175.getClass(), "autoincrement", true);
        setBooleanField(term5175, term5175.getClass(), "unique", false);
        setField(term5175, term5175.getClass(), "type", null);
        setField(term5175, term5175.getClass(), "dataType", null);
        setField(term5175, term5175.getClass(), "constraints", null);
        setField(term5175, term5175.getClass(), "schema", null);
        Object term5181 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5181, term5181.getClass(), "index", 1);
        setField(term5181, term5181.getClass(), "name", null);
        setField(term5181, term5181.getClass(), "max", null);
        setBooleanField(term5181, term5181.getClass(), "notNull", false);
        setField(term5181, term5181.getClass(), "defaultValue", null);
        setBooleanField(term5181, term5181.getClass(), "primaryKey", false);
        setBooleanField(term5181, term5181.getClass(), "autoincrement", false);
        setBooleanField(term5181, term5181.getClass(), "unique", false);
        setField(term5181, term5181.getClass(), "type", null);
        setField(term5181, term5181.getClass(), "dataType", null);
        setField(term5181, term5181.getClass(), "constraints", null);
        setField(term5181, term5181.getClass(), "schema", null);
        Object term5187 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5187, term5187.getClass(), "index", 2);
        setField(term5187, term5187.getClass(), "name", null);
        setField(term5187, term5187.getClass(), "max", null);
        setBooleanField(term5187, term5187.getClass(), "notNull", false);
        setField(term5187, term5187.getClass(), "defaultValue", null);
        setBooleanField(term5187, term5187.getClass(), "primaryKey", false);
        setBooleanField(term5187, term5187.getClass(), "autoincrement", false);
        setBooleanField(term5187, term5187.getClass(), "unique", false);
        setField(term5187, term5187.getClass(), "type", null);
        setField(term5187, term5187.getClass(), "dataType", null);
        setField(term5187, term5187.getClass(), "constraints", null);
        setField(term5187, term5187.getClass(), "schema", null);
        Object term5193 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5193, term5193.getClass(), "index", 3);
        setField(term5193, term5193.getClass(), "name", null);
        setField(term5193, term5193.getClass(), "max", null);
        setBooleanField(term5193, term5193.getClass(), "notNull", false);
        setField(term5193, term5193.getClass(), "defaultValue", null);
        setBooleanField(term5193, term5193.getClass(), "primaryKey", false);
        setBooleanField(term5193, term5193.getClass(), "autoincrement", false);
        setBooleanField(term5193, term5193.getClass(), "unique", false);
        setField(term5193, term5193.getClass(), "type", null);
        setField(term5193, term5193.getClass(), "dataType", null);
        setField(term5193, term5193.getClass(), "constraints", null);
        setField(term5193, term5193.getClass(), "schema", null);
        Object term5199 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5199, term5199.getClass(), "index", 4);
        setField(term5199, term5199.getClass(), "name", null);
        setField(term5199, term5199.getClass(), "max", null);
        setBooleanField(term5199, term5199.getClass(), "notNull", false);
        setField(term5199, term5199.getClass(), "defaultValue", null);
        setBooleanField(term5199, term5199.getClass(), "primaryKey", false);
        setBooleanField(term5199, term5199.getClass(), "autoincrement", false);
        setBooleanField(term5199, term5199.getClass(), "unique", false);
        setField(term5199, term5199.getClass(), "type", null);
        setField(term5199, term5199.getClass(), "dataType", null);
        setField(term5199, term5199.getClass(), "constraints", null);
        setField(term5199, term5199.getClass(), "schema", null);
        Object term5205 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5205, term5205.getClass(), "index", 5);
        setField(term5205, term5205.getClass(), "name", null);
        setField(term5205, term5205.getClass(), "max", null);
        setBooleanField(term5205, term5205.getClass(), "notNull", false);
        setField(term5205, term5205.getClass(), "defaultValue", null);
        setBooleanField(term5205, term5205.getClass(), "primaryKey", false);
        setBooleanField(term5205, term5205.getClass(), "autoincrement", false);
        setBooleanField(term5205, term5205.getClass(), "unique", false);
        setField(term5205, term5205.getClass(), "type", null);
        setField(term5205, term5205.getClass(), "dataType", null);
        setField(term5205, term5205.getClass(), "constraints", null);
        setField(term5205, term5205.getClass(), "schema", null);
        Object term5211 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5211, term5211.getClass(), "index", 6);
        setField(term5211, term5211.getClass(), "name", null);
        setField(term5211, term5211.getClass(), "max", null);
        setBooleanField(term5211, term5211.getClass(), "notNull", false);
        setField(term5211, term5211.getClass(), "defaultValue", null);
        setBooleanField(term5211, term5211.getClass(), "primaryKey", false);
        setBooleanField(term5211, term5211.getClass(), "autoincrement", false);
        setBooleanField(term5211, term5211.getClass(), "unique", false);
        setField(term5211, term5211.getClass(), "type", null);
        setField(term5211, term5211.getClass(), "dataType", null);
        setField(term5211, term5211.getClass(), "constraints", null);
        setField(term5211, term5211.getClass(), "schema", null);
        Object term5217 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term5217, term5217.getClass(), "index", 7);
        setField(term5217, term5217.getClass(), "name", null);
        setField(term5217, term5217.getClass(), "max", null);
        setBooleanField(term5217, term5217.getClass(), "notNull", false);
        setField(term5217, term5217.getClass(), "defaultValue", null);
        setBooleanField(term5217, term5217.getClass(), "primaryKey", false);
        setBooleanField(term5217, term5217.getClass(), "autoincrement", false);
        setBooleanField(term5217, term5217.getClass(), "unique", false);
        setField(term5217, term5217.getClass(), "type", null);
        setField(term5217, term5217.getClass(), "dataType", null);
        setField(term5217, term5217.getClass(), "constraints", null);
        setField(term5217, term5217.getClass(), "schema", null);
        ArrayList term5173 = new ArrayList();
        ((ArrayList) term5173).add(term5175);
        ((ArrayList) term5173).add(term5181);
        ((ArrayList) term5173).add(term5187);
        ((ArrayList) term5173).add(term5193);
        ((ArrayList) term5173).add(term5199);
        ((ArrayList) term5173).add(term5205);
        ((ArrayList) term5173).add(term5211);
        ((ArrayList) term5173).add(term5217);
        HashMap term5226 = new HashMap();
        ArrayList term5260 = new ArrayList();
        HashMap term5264 = new HashMap();
        term5087 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term5088 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term5100 = (Object[]) newArray("java.lang.String", 8);
        Object term5259 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term5088, term5088.getClass(), "tableName", "nga_style");
        setElement(term5100, 0, "id");
        setElement(term5100, 1, "name");
        setElement(term5100, 2, "description");
        setElement(term5100, 3, "color");
        setElement(term5100, 4, "opacity");
        setElement(term5100, 5, "width");
        setElement(term5100, 6, "fill_color");
        setElement(term5100, 7, "fill_opacity");
        setField(term5088, term5088.getClass(), "columnNames", term5100);
        setField(term5088, term5088.getClass(), "columns", term5173);
        setBooleanField(term5088, term5088.getClass(), "custom", false);
        setField(term5088, term5088.getClass(), "nameToIndex", term5226);
        setIntField(term5088, term5088.getClass(), "pkIndex", 0);
        setBooleanField(term5088, term5088.getClass(), "pkModifiable", false);
        setBooleanField(term5088, term5088.getClass(), "valueValidation", true);
        setField(term5087, term5087.getClass(), "columns", term5088);
        setField(term5259, term5259.getClass(), "constraints", term5260);
        setField(term5259, term5259.getClass(), "typedContraints", term5264);
        setField(term5087, term5087.getClass(), "constraints", term5259);
        setField(term5087, term5087.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescriptionColumn", argTypes, term5087, args);
    }

};


