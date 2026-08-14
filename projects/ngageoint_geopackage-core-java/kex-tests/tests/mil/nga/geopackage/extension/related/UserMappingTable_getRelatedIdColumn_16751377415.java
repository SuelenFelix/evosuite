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

public class UserMappingTable_getRelatedIdColumn_16751377415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2704;

    public UserMappingTable_getRelatedIdColumn_16751377415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2706 = new ArrayList();
        HashMap term2710 = new HashMap();
        term2704 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserMappingTable"));
        Object term2705 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2704, term2704.getClass(), "columns", null);
        setField(term2705, term2705.getClass(), "constraints", term2706);
        setField(term2705, term2705.getClass(), "typedContraints", term2710);
        setField(term2704, term2704.getClass(), "constraints", term2705);
        setField(term2704, term2704.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserMappingTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelatedIdColumn", argTypes, term2704, args);
    }

};


