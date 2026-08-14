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

public class AttributesTableMetadata_buildColumns_195477541443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4328;

    public AttributesTableMetadata_buildColumns_195477541443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4330 = new ArrayList();
        HashMap term4334 = new HashMap();
        ArrayList term4400 = new ArrayList();
        ArrayList term4404 = new ArrayList();
        term4328 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        Object term4329 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4329, term4329.getClass(), "constraints", term4330);
        setField(term4329, term4329.getClass(), "typedContraints", term4334);
        setField(term4328, term4328.getClass(), "constraints", term4329);
        setField(term4328, term4328.getClass(), "tableName", "BWxJSgKHRT");
        setField(term4328, term4328.getClass(), "dataType", "AGXoIndFnm");
        setField(term4328, term4328.getClass(), "identifier", "mwmFMNEzkK");
        setField(term4328, term4328.getClass(), "description", "kVAmKknVln");
        setField(term4328, term4328.getClass(), "idColumnName", "MRFLbEGYKG");
        setBooleanField(term4328, term4328.getClass(), "autoincrement", true);
        setField(term4328, term4328.getClass(), "additionalColumns", term4400);
        setField(term4328, term4328.getClass(), "columns", term4404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildColumns", argTypes, term4328, args);
    }

};


