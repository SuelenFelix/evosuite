package mil.nga.geopackage.attributes;

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
import static mil.nga.geopackage.attributes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class AttributesTableMetadata_createTyped_26201393231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137089;
     Object term137146;

    public AttributesTableMetadata_createTyped_26201393231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term137127 = new ArrayList();
        HashMap term137132 = new HashMap();
        term137089 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term137102 = (Object[]) newArray("java.lang.String", 2);
        setField(term137089, term137089.getClass(), "tableName", "IqzRlGAXKQ");
        setElement(term137102, 0, "XiytdmxGYa");
        setElement(term137102, 1, "xuWbTDWaJN");
        setField(term137089, term137089.getClass(), "columnNames", term137102);
        setField(term137089, term137089.getClass(), "columns", term137127);
        setBooleanField(term137089, term137089.getClass(), "custom", true);
        setField(term137089, term137089.getClass(), "nameToIndex", term137132);
        setIntField(term137089, term137089.getClass(), "pkIndex", -97742366);
        setBooleanField(term137089, term137089.getClass(), "pkModifiable", true);
        setBooleanField(term137089, term137089.getClass(), "valueValidation", false);
        ArrayList term137147 = new ArrayList();
        HashMap term137151 = new HashMap();
        term137146 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term137146, term137146.getClass(), "constraints", term137147);
        setField(term137146, term137146.getClass(), "typedContraints", term137151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[3];
        args[0] = "yNQuuhZyAX";
        args[1] = term137089;
        args[2] = term137146;
        callMethod(klass, "createTyped", argTypes, null, args);
    }

};


