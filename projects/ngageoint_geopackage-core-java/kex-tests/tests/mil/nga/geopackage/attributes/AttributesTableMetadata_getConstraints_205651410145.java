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

public class AttributesTableMetadata_getConstraints_205651410145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138337;

    public AttributesTableMetadata_getConstraints_205651410145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term138339 = new ArrayList();
        HashMap term138343 = new HashMap();
        ArrayList term138409 = new ArrayList();
        ArrayList term138413 = new ArrayList();
        term138337 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata"));
        Object term138338 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term138338, term138338.getClass(), "constraints", term138339);
        setField(term138338, term138338.getClass(), "typedContraints", term138343);
        setField(term138337, term138337.getClass(), "constraints", term138338);
        setField(term138337, term138337.getClass(), "tableName", "zAkmDkobmH");
        setField(term138337, term138337.getClass(), "dataType", "FASdrZqBfN");
        setField(term138337, term138337.getClass(), "identifier", "YNwqJgOcWq");
        setField(term138337, term138337.getClass(), "description", "tUcoJjDoJV");
        setField(term138337, term138337.getClass(), "idColumnName", "ICNsClDoAn");
        setBooleanField(term138337, term138337.getClass(), "autoincrement", true);
        setField(term138337, term138337.getClass(), "additionalColumns", term138409);
        setField(term138337, term138337.getClass(), "columns", term138413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConstraints", argTypes, term138337, args);
    }

};


