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

public class StyleTable_getFillOpacityColumn_161281316616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7557;

    public StyleTable_getFillOpacityColumn_161281316616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7645 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7645, term7645.getClass(), "index", 0);
        setField(term7645, term7645.getClass(), "name", null);
        setField(term7645, term7645.getClass(), "max", null);
        setBooleanField(term7645, term7645.getClass(), "notNull", true);
        setField(term7645, term7645.getClass(), "defaultValue", null);
        setBooleanField(term7645, term7645.getClass(), "primaryKey", true);
        setBooleanField(term7645, term7645.getClass(), "autoincrement", true);
        setBooleanField(term7645, term7645.getClass(), "unique", false);
        setField(term7645, term7645.getClass(), "type", null);
        setField(term7645, term7645.getClass(), "dataType", null);
        setField(term7645, term7645.getClass(), "constraints", null);
        setField(term7645, term7645.getClass(), "schema", null);
        Object term7651 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7651, term7651.getClass(), "index", 1);
        setField(term7651, term7651.getClass(), "name", null);
        setField(term7651, term7651.getClass(), "max", null);
        setBooleanField(term7651, term7651.getClass(), "notNull", false);
        setField(term7651, term7651.getClass(), "defaultValue", null);
        setBooleanField(term7651, term7651.getClass(), "primaryKey", false);
        setBooleanField(term7651, term7651.getClass(), "autoincrement", false);
        setBooleanField(term7651, term7651.getClass(), "unique", false);
        setField(term7651, term7651.getClass(), "type", null);
        setField(term7651, term7651.getClass(), "dataType", null);
        setField(term7651, term7651.getClass(), "constraints", null);
        setField(term7651, term7651.getClass(), "schema", null);
        Object term7657 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7657, term7657.getClass(), "index", 2);
        setField(term7657, term7657.getClass(), "name", null);
        setField(term7657, term7657.getClass(), "max", null);
        setBooleanField(term7657, term7657.getClass(), "notNull", false);
        setField(term7657, term7657.getClass(), "defaultValue", null);
        setBooleanField(term7657, term7657.getClass(), "primaryKey", false);
        setBooleanField(term7657, term7657.getClass(), "autoincrement", false);
        setBooleanField(term7657, term7657.getClass(), "unique", false);
        setField(term7657, term7657.getClass(), "type", null);
        setField(term7657, term7657.getClass(), "dataType", null);
        setField(term7657, term7657.getClass(), "constraints", null);
        setField(term7657, term7657.getClass(), "schema", null);
        Object term7663 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7663, term7663.getClass(), "index", 3);
        setField(term7663, term7663.getClass(), "name", null);
        setField(term7663, term7663.getClass(), "max", null);
        setBooleanField(term7663, term7663.getClass(), "notNull", false);
        setField(term7663, term7663.getClass(), "defaultValue", null);
        setBooleanField(term7663, term7663.getClass(), "primaryKey", false);
        setBooleanField(term7663, term7663.getClass(), "autoincrement", false);
        setBooleanField(term7663, term7663.getClass(), "unique", false);
        setField(term7663, term7663.getClass(), "type", null);
        setField(term7663, term7663.getClass(), "dataType", null);
        setField(term7663, term7663.getClass(), "constraints", null);
        setField(term7663, term7663.getClass(), "schema", null);
        Object term7669 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7669, term7669.getClass(), "index", 4);
        setField(term7669, term7669.getClass(), "name", null);
        setField(term7669, term7669.getClass(), "max", null);
        setBooleanField(term7669, term7669.getClass(), "notNull", false);
        setField(term7669, term7669.getClass(), "defaultValue", null);
        setBooleanField(term7669, term7669.getClass(), "primaryKey", false);
        setBooleanField(term7669, term7669.getClass(), "autoincrement", false);
        setBooleanField(term7669, term7669.getClass(), "unique", false);
        setField(term7669, term7669.getClass(), "type", null);
        setField(term7669, term7669.getClass(), "dataType", null);
        setField(term7669, term7669.getClass(), "constraints", null);
        setField(term7669, term7669.getClass(), "schema", null);
        Object term7675 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7675, term7675.getClass(), "index", 5);
        setField(term7675, term7675.getClass(), "name", null);
        setField(term7675, term7675.getClass(), "max", null);
        setBooleanField(term7675, term7675.getClass(), "notNull", false);
        setField(term7675, term7675.getClass(), "defaultValue", null);
        setBooleanField(term7675, term7675.getClass(), "primaryKey", false);
        setBooleanField(term7675, term7675.getClass(), "autoincrement", false);
        setBooleanField(term7675, term7675.getClass(), "unique", false);
        setField(term7675, term7675.getClass(), "type", null);
        setField(term7675, term7675.getClass(), "dataType", null);
        setField(term7675, term7675.getClass(), "constraints", null);
        setField(term7675, term7675.getClass(), "schema", null);
        Object term7681 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7681, term7681.getClass(), "index", 6);
        setField(term7681, term7681.getClass(), "name", null);
        setField(term7681, term7681.getClass(), "max", null);
        setBooleanField(term7681, term7681.getClass(), "notNull", false);
        setField(term7681, term7681.getClass(), "defaultValue", null);
        setBooleanField(term7681, term7681.getClass(), "primaryKey", false);
        setBooleanField(term7681, term7681.getClass(), "autoincrement", false);
        setBooleanField(term7681, term7681.getClass(), "unique", false);
        setField(term7681, term7681.getClass(), "type", null);
        setField(term7681, term7681.getClass(), "dataType", null);
        setField(term7681, term7681.getClass(), "constraints", null);
        setField(term7681, term7681.getClass(), "schema", null);
        Object term7687 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term7687, term7687.getClass(), "index", 7);
        setField(term7687, term7687.getClass(), "name", null);
        setField(term7687, term7687.getClass(), "max", null);
        setBooleanField(term7687, term7687.getClass(), "notNull", false);
        setField(term7687, term7687.getClass(), "defaultValue", null);
        setBooleanField(term7687, term7687.getClass(), "primaryKey", false);
        setBooleanField(term7687, term7687.getClass(), "autoincrement", false);
        setBooleanField(term7687, term7687.getClass(), "unique", false);
        setField(term7687, term7687.getClass(), "type", null);
        setField(term7687, term7687.getClass(), "dataType", null);
        setField(term7687, term7687.getClass(), "constraints", null);
        setField(term7687, term7687.getClass(), "schema", null);
        ArrayList term7643 = new ArrayList();
        ((ArrayList) term7643).add(term7645);
        ((ArrayList) term7643).add(term7651);
        ((ArrayList) term7643).add(term7657);
        ((ArrayList) term7643).add(term7663);
        ((ArrayList) term7643).add(term7669);
        ((ArrayList) term7643).add(term7675);
        ((ArrayList) term7643).add(term7681);
        ((ArrayList) term7643).add(term7687);
        HashMap term7696 = new HashMap();
        ArrayList term7730 = new ArrayList();
        HashMap term7734 = new HashMap();
        term7557 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term7558 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term7570 = (Object[]) newArray("java.lang.String", 8);
        Object term7729 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7558, term7558.getClass(), "tableName", "nga_style");
        setElement(term7570, 0, "id");
        setElement(term7570, 1, "name");
        setElement(term7570, 2, "description");
        setElement(term7570, 3, "color");
        setElement(term7570, 4, "opacity");
        setElement(term7570, 5, "width");
        setElement(term7570, 6, "fill_color");
        setElement(term7570, 7, "fill_opacity");
        setField(term7558, term7558.getClass(), "columnNames", term7570);
        setField(term7558, term7558.getClass(), "columns", term7643);
        setBooleanField(term7558, term7558.getClass(), "custom", false);
        setField(term7558, term7558.getClass(), "nameToIndex", term7696);
        setIntField(term7558, term7558.getClass(), "pkIndex", 0);
        setBooleanField(term7558, term7558.getClass(), "pkModifiable", false);
        setBooleanField(term7558, term7558.getClass(), "valueValidation", true);
        setField(term7557, term7557.getClass(), "columns", term7558);
        setField(term7729, term7729.getClass(), "constraints", term7730);
        setField(term7729, term7729.getClass(), "typedContraints", term7734);
        setField(term7557, term7557.getClass(), "constraints", term7729);
        setField(term7557, term7557.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFillOpacityColumn", argTypes, term7557, args);
    }

};


