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

public class StyleTable_getWidthColumn_156356331212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6569;

    public StyleTable_getWidthColumn_156356331212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6657 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6657, term6657.getClass(), "index", 0);
        setField(term6657, term6657.getClass(), "name", null);
        setField(term6657, term6657.getClass(), "max", null);
        setBooleanField(term6657, term6657.getClass(), "notNull", true);
        setField(term6657, term6657.getClass(), "defaultValue", null);
        setBooleanField(term6657, term6657.getClass(), "primaryKey", true);
        setBooleanField(term6657, term6657.getClass(), "autoincrement", true);
        setBooleanField(term6657, term6657.getClass(), "unique", false);
        setField(term6657, term6657.getClass(), "type", null);
        setField(term6657, term6657.getClass(), "dataType", null);
        setField(term6657, term6657.getClass(), "constraints", null);
        setField(term6657, term6657.getClass(), "schema", null);
        Object term6663 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6663, term6663.getClass(), "index", 1);
        setField(term6663, term6663.getClass(), "name", null);
        setField(term6663, term6663.getClass(), "max", null);
        setBooleanField(term6663, term6663.getClass(), "notNull", false);
        setField(term6663, term6663.getClass(), "defaultValue", null);
        setBooleanField(term6663, term6663.getClass(), "primaryKey", false);
        setBooleanField(term6663, term6663.getClass(), "autoincrement", false);
        setBooleanField(term6663, term6663.getClass(), "unique", false);
        setField(term6663, term6663.getClass(), "type", null);
        setField(term6663, term6663.getClass(), "dataType", null);
        setField(term6663, term6663.getClass(), "constraints", null);
        setField(term6663, term6663.getClass(), "schema", null);
        Object term6669 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6669, term6669.getClass(), "index", 2);
        setField(term6669, term6669.getClass(), "name", null);
        setField(term6669, term6669.getClass(), "max", null);
        setBooleanField(term6669, term6669.getClass(), "notNull", false);
        setField(term6669, term6669.getClass(), "defaultValue", null);
        setBooleanField(term6669, term6669.getClass(), "primaryKey", false);
        setBooleanField(term6669, term6669.getClass(), "autoincrement", false);
        setBooleanField(term6669, term6669.getClass(), "unique", false);
        setField(term6669, term6669.getClass(), "type", null);
        setField(term6669, term6669.getClass(), "dataType", null);
        setField(term6669, term6669.getClass(), "constraints", null);
        setField(term6669, term6669.getClass(), "schema", null);
        Object term6675 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6675, term6675.getClass(), "index", 3);
        setField(term6675, term6675.getClass(), "name", null);
        setField(term6675, term6675.getClass(), "max", null);
        setBooleanField(term6675, term6675.getClass(), "notNull", false);
        setField(term6675, term6675.getClass(), "defaultValue", null);
        setBooleanField(term6675, term6675.getClass(), "primaryKey", false);
        setBooleanField(term6675, term6675.getClass(), "autoincrement", false);
        setBooleanField(term6675, term6675.getClass(), "unique", false);
        setField(term6675, term6675.getClass(), "type", null);
        setField(term6675, term6675.getClass(), "dataType", null);
        setField(term6675, term6675.getClass(), "constraints", null);
        setField(term6675, term6675.getClass(), "schema", null);
        Object term6681 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6681, term6681.getClass(), "index", 4);
        setField(term6681, term6681.getClass(), "name", null);
        setField(term6681, term6681.getClass(), "max", null);
        setBooleanField(term6681, term6681.getClass(), "notNull", false);
        setField(term6681, term6681.getClass(), "defaultValue", null);
        setBooleanField(term6681, term6681.getClass(), "primaryKey", false);
        setBooleanField(term6681, term6681.getClass(), "autoincrement", false);
        setBooleanField(term6681, term6681.getClass(), "unique", false);
        setField(term6681, term6681.getClass(), "type", null);
        setField(term6681, term6681.getClass(), "dataType", null);
        setField(term6681, term6681.getClass(), "constraints", null);
        setField(term6681, term6681.getClass(), "schema", null);
        Object term6687 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6687, term6687.getClass(), "index", 5);
        setField(term6687, term6687.getClass(), "name", null);
        setField(term6687, term6687.getClass(), "max", null);
        setBooleanField(term6687, term6687.getClass(), "notNull", false);
        setField(term6687, term6687.getClass(), "defaultValue", null);
        setBooleanField(term6687, term6687.getClass(), "primaryKey", false);
        setBooleanField(term6687, term6687.getClass(), "autoincrement", false);
        setBooleanField(term6687, term6687.getClass(), "unique", false);
        setField(term6687, term6687.getClass(), "type", null);
        setField(term6687, term6687.getClass(), "dataType", null);
        setField(term6687, term6687.getClass(), "constraints", null);
        setField(term6687, term6687.getClass(), "schema", null);
        Object term6693 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6693, term6693.getClass(), "index", 6);
        setField(term6693, term6693.getClass(), "name", null);
        setField(term6693, term6693.getClass(), "max", null);
        setBooleanField(term6693, term6693.getClass(), "notNull", false);
        setField(term6693, term6693.getClass(), "defaultValue", null);
        setBooleanField(term6693, term6693.getClass(), "primaryKey", false);
        setBooleanField(term6693, term6693.getClass(), "autoincrement", false);
        setBooleanField(term6693, term6693.getClass(), "unique", false);
        setField(term6693, term6693.getClass(), "type", null);
        setField(term6693, term6693.getClass(), "dataType", null);
        setField(term6693, term6693.getClass(), "constraints", null);
        setField(term6693, term6693.getClass(), "schema", null);
        Object term6699 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term6699, term6699.getClass(), "index", 7);
        setField(term6699, term6699.getClass(), "name", null);
        setField(term6699, term6699.getClass(), "max", null);
        setBooleanField(term6699, term6699.getClass(), "notNull", false);
        setField(term6699, term6699.getClass(), "defaultValue", null);
        setBooleanField(term6699, term6699.getClass(), "primaryKey", false);
        setBooleanField(term6699, term6699.getClass(), "autoincrement", false);
        setBooleanField(term6699, term6699.getClass(), "unique", false);
        setField(term6699, term6699.getClass(), "type", null);
        setField(term6699, term6699.getClass(), "dataType", null);
        setField(term6699, term6699.getClass(), "constraints", null);
        setField(term6699, term6699.getClass(), "schema", null);
        ArrayList term6655 = new ArrayList();
        ((ArrayList) term6655).add(term6657);
        ((ArrayList) term6655).add(term6663);
        ((ArrayList) term6655).add(term6669);
        ((ArrayList) term6655).add(term6675);
        ((ArrayList) term6655).add(term6681);
        ((ArrayList) term6655).add(term6687);
        ((ArrayList) term6655).add(term6693);
        ((ArrayList) term6655).add(term6699);
        HashMap term6708 = new HashMap();
        ArrayList term6742 = new ArrayList();
        HashMap term6746 = new HashMap();
        term6569 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term6570 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term6582 = (Object[]) newArray("java.lang.String", 8);
        Object term6741 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term6570, term6570.getClass(), "tableName", "nga_style");
        setElement(term6582, 0, "id");
        setElement(term6582, 1, "name");
        setElement(term6582, 2, "description");
        setElement(term6582, 3, "color");
        setElement(term6582, 4, "opacity");
        setElement(term6582, 5, "width");
        setElement(term6582, 6, "fill_color");
        setElement(term6582, 7, "fill_opacity");
        setField(term6570, term6570.getClass(), "columnNames", term6582);
        setField(term6570, term6570.getClass(), "columns", term6655);
        setBooleanField(term6570, term6570.getClass(), "custom", false);
        setField(term6570, term6570.getClass(), "nameToIndex", term6708);
        setIntField(term6570, term6570.getClass(), "pkIndex", 0);
        setBooleanField(term6570, term6570.getClass(), "pkModifiable", false);
        setBooleanField(term6570, term6570.getClass(), "valueValidation", true);
        setField(term6569, term6569.getClass(), "columns", term6570);
        setField(term6741, term6741.getClass(), "constraints", term6742);
        setField(term6741, term6741.getClass(), "typedContraints", term6746);
        setField(term6569, term6569.getClass(), "constraints", term6741);
        setField(term6569, term6569.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWidthColumn", argTypes, term6569, args);
    }

};


