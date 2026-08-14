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

public class StyleMappingTable_getGeometryTypeNameColumn_15411399304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7863;

    public StyleMappingTable_getGeometryTypeNameColumn_15411399304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7865 = new ArrayList();
        HashMap term7869 = new HashMap();
        term7863 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleMappingTable"));
        Object term7864 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7863, term7863.getClass(), "columns", null);
        setField(term7864, term7864.getClass(), "constraints", term7865);
        setField(term7864, term7864.getClass(), "typedContraints", term7869);
        setField(term7863, term7863.getClass(), "constraints", term7864);
        setField(term7863, term7863.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleMappingTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometryTypeNameColumn", argTypes, term7863, args);
    }

};


