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

public class StyleTable_getNameColumn_16852891534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4593;

    public StyleTable_getNameColumn_16852891534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4681 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4681, term4681.getClass(), "index", 0);
        setField(term4681, term4681.getClass(), "name", null);
        setField(term4681, term4681.getClass(), "max", null);
        setBooleanField(term4681, term4681.getClass(), "notNull", true);
        setField(term4681, term4681.getClass(), "defaultValue", null);
        setBooleanField(term4681, term4681.getClass(), "primaryKey", true);
        setBooleanField(term4681, term4681.getClass(), "autoincrement", true);
        setBooleanField(term4681, term4681.getClass(), "unique", false);
        setField(term4681, term4681.getClass(), "type", null);
        setField(term4681, term4681.getClass(), "dataType", null);
        setField(term4681, term4681.getClass(), "constraints", null);
        setField(term4681, term4681.getClass(), "schema", null);
        Object term4687 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4687, term4687.getClass(), "index", 1);
        setField(term4687, term4687.getClass(), "name", null);
        setField(term4687, term4687.getClass(), "max", null);
        setBooleanField(term4687, term4687.getClass(), "notNull", false);
        setField(term4687, term4687.getClass(), "defaultValue", null);
        setBooleanField(term4687, term4687.getClass(), "primaryKey", false);
        setBooleanField(term4687, term4687.getClass(), "autoincrement", false);
        setBooleanField(term4687, term4687.getClass(), "unique", false);
        setField(term4687, term4687.getClass(), "type", null);
        setField(term4687, term4687.getClass(), "dataType", null);
        setField(term4687, term4687.getClass(), "constraints", null);
        setField(term4687, term4687.getClass(), "schema", null);
        Object term4693 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4693, term4693.getClass(), "index", 2);
        setField(term4693, term4693.getClass(), "name", null);
        setField(term4693, term4693.getClass(), "max", null);
        setBooleanField(term4693, term4693.getClass(), "notNull", false);
        setField(term4693, term4693.getClass(), "defaultValue", null);
        setBooleanField(term4693, term4693.getClass(), "primaryKey", false);
        setBooleanField(term4693, term4693.getClass(), "autoincrement", false);
        setBooleanField(term4693, term4693.getClass(), "unique", false);
        setField(term4693, term4693.getClass(), "type", null);
        setField(term4693, term4693.getClass(), "dataType", null);
        setField(term4693, term4693.getClass(), "constraints", null);
        setField(term4693, term4693.getClass(), "schema", null);
        Object term4699 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4699, term4699.getClass(), "index", 3);
        setField(term4699, term4699.getClass(), "name", null);
        setField(term4699, term4699.getClass(), "max", null);
        setBooleanField(term4699, term4699.getClass(), "notNull", false);
        setField(term4699, term4699.getClass(), "defaultValue", null);
        setBooleanField(term4699, term4699.getClass(), "primaryKey", false);
        setBooleanField(term4699, term4699.getClass(), "autoincrement", false);
        setBooleanField(term4699, term4699.getClass(), "unique", false);
        setField(term4699, term4699.getClass(), "type", null);
        setField(term4699, term4699.getClass(), "dataType", null);
        setField(term4699, term4699.getClass(), "constraints", null);
        setField(term4699, term4699.getClass(), "schema", null);
        Object term4705 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4705, term4705.getClass(), "index", 4);
        setField(term4705, term4705.getClass(), "name", null);
        setField(term4705, term4705.getClass(), "max", null);
        setBooleanField(term4705, term4705.getClass(), "notNull", false);
        setField(term4705, term4705.getClass(), "defaultValue", null);
        setBooleanField(term4705, term4705.getClass(), "primaryKey", false);
        setBooleanField(term4705, term4705.getClass(), "autoincrement", false);
        setBooleanField(term4705, term4705.getClass(), "unique", false);
        setField(term4705, term4705.getClass(), "type", null);
        setField(term4705, term4705.getClass(), "dataType", null);
        setField(term4705, term4705.getClass(), "constraints", null);
        setField(term4705, term4705.getClass(), "schema", null);
        Object term4711 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4711, term4711.getClass(), "index", 5);
        setField(term4711, term4711.getClass(), "name", null);
        setField(term4711, term4711.getClass(), "max", null);
        setBooleanField(term4711, term4711.getClass(), "notNull", false);
        setField(term4711, term4711.getClass(), "defaultValue", null);
        setBooleanField(term4711, term4711.getClass(), "primaryKey", false);
        setBooleanField(term4711, term4711.getClass(), "autoincrement", false);
        setBooleanField(term4711, term4711.getClass(), "unique", false);
        setField(term4711, term4711.getClass(), "type", null);
        setField(term4711, term4711.getClass(), "dataType", null);
        setField(term4711, term4711.getClass(), "constraints", null);
        setField(term4711, term4711.getClass(), "schema", null);
        Object term4717 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4717, term4717.getClass(), "index", 6);
        setField(term4717, term4717.getClass(), "name", null);
        setField(term4717, term4717.getClass(), "max", null);
        setBooleanField(term4717, term4717.getClass(), "notNull", false);
        setField(term4717, term4717.getClass(), "defaultValue", null);
        setBooleanField(term4717, term4717.getClass(), "primaryKey", false);
        setBooleanField(term4717, term4717.getClass(), "autoincrement", false);
        setBooleanField(term4717, term4717.getClass(), "unique", false);
        setField(term4717, term4717.getClass(), "type", null);
        setField(term4717, term4717.getClass(), "dataType", null);
        setField(term4717, term4717.getClass(), "constraints", null);
        setField(term4717, term4717.getClass(), "schema", null);
        Object term4723 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumn"));
        setIntField(term4723, term4723.getClass(), "index", 7);
        setField(term4723, term4723.getClass(), "name", null);
        setField(term4723, term4723.getClass(), "max", null);
        setBooleanField(term4723, term4723.getClass(), "notNull", false);
        setField(term4723, term4723.getClass(), "defaultValue", null);
        setBooleanField(term4723, term4723.getClass(), "primaryKey", false);
        setBooleanField(term4723, term4723.getClass(), "autoincrement", false);
        setBooleanField(term4723, term4723.getClass(), "unique", false);
        setField(term4723, term4723.getClass(), "type", null);
        setField(term4723, term4723.getClass(), "dataType", null);
        setField(term4723, term4723.getClass(), "constraints", null);
        setField(term4723, term4723.getClass(), "schema", null);
        ArrayList term4679 = new ArrayList();
        ((ArrayList) term4679).add(term4681);
        ((ArrayList) term4679).add(term4687);
        ((ArrayList) term4679).add(term4693);
        ((ArrayList) term4679).add(term4699);
        ((ArrayList) term4679).add(term4705);
        ((ArrayList) term4679).add(term4711);
        ((ArrayList) term4679).add(term4717);
        ((ArrayList) term4679).add(term4723);
        HashMap term4732 = new HashMap();
        ArrayList term4766 = new ArrayList();
        HashMap term4770 = new HashMap();
        term4593 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        Object term4594 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term4606 = (Object[]) newArray("java.lang.String", 8);
        Object term4765 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4594, term4594.getClass(), "tableName", "nga_style");
        setElement(term4606, 0, "id");
        setElement(term4606, 1, "name");
        setElement(term4606, 2, "description");
        setElement(term4606, 3, "color");
        setElement(term4606, 4, "opacity");
        setElement(term4606, 5, "width");
        setElement(term4606, 6, "fill_color");
        setElement(term4606, 7, "fill_opacity");
        setField(term4594, term4594.getClass(), "columnNames", term4606);
        setField(term4594, term4594.getClass(), "columns", term4679);
        setBooleanField(term4594, term4594.getClass(), "custom", false);
        setField(term4594, term4594.getClass(), "nameToIndex", term4732);
        setIntField(term4594, term4594.getClass(), "pkIndex", 0);
        setBooleanField(term4594, term4594.getClass(), "pkModifiable", false);
        setBooleanField(term4594, term4594.getClass(), "valueValidation", true);
        setField(term4593, term4593.getClass(), "columns", term4594);
        setField(term4765, term4765.getClass(), "constraints", term4766);
        setField(term4765, term4765.getClass(), "typedContraints", term4770);
        setField(term4593, term4593.getClass(), "constraints", term4765);
        setField(term4593, term4593.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameColumn", argTypes, term4593, args);
    }

};


