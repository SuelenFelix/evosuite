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

public class AttributesTableMetadata_createTyped_26201393232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3470;
     Object term3527;

    public AttributesTableMetadata_createTyped_26201393232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3508 = new ArrayList();
        HashMap term3513 = new HashMap();
        term3470 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term3483 = (Object[]) newArray("java.lang.String", 2);
        setField(term3470, term3470.getClass(), "tableName", "mGRiYhnMcR");
        setElement(term3483, 0, "NFlvfJCVPO");
        setElement(term3483, 1, "KarbTXFmUU");
        setField(term3470, term3470.getClass(), "columnNames", term3483);
        setField(term3470, term3470.getClass(), "columns", term3508);
        setBooleanField(term3470, term3470.getClass(), "custom", true);
        setField(term3470, term3470.getClass(), "nameToIndex", term3513);
        setIntField(term3470, term3470.getClass(), "pkIndex", 579005622);
        setBooleanField(term3470, term3470.getClass(), "pkModifiable", false);
        setBooleanField(term3470, term3470.getClass(), "valueValidation", true);
        ArrayList term3528 = new ArrayList();
        HashMap term3532 = new HashMap();
        term3527 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3527, term3527.getClass(), "constraints", term3528);
        setField(term3527, term3527.getClass(), "typedContraints", term3532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[3];
        args[0] = "qUtkFGMNUV";
        args[1] = term3470;
        args[2] = term3527;
        callMethod(klass, "createTyped", argTypes, null, args);
    }

};


