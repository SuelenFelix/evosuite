package mil.nga.geopackage.extension.related;

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
import static mil.nga.geopackage.extension.related.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class UserMappingTable_getBaseIdColumn_31214537213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2682;

    public UserMappingTable_getBaseIdColumn_31214537213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2684 = new ArrayList();
        HashMap term2688 = new HashMap();
        term2682 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserMappingTable"));
        Object term2683 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2682, term2682.getClass(), "columns", null);
        setField(term2683, term2683.getClass(), "constraints", term2684);
        setField(term2683, term2683.getClass(), "typedContraints", term2688);
        setField(term2682, term2682.getClass(), "constraints", term2683);
        setField(term2682, term2682.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserMappingTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseIdColumn", argTypes, term2682, args);
    }

};


