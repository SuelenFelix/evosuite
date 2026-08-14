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

public class UserMappingTable_getRelatedIdColumn_16751377416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31168;

    public UserMappingTable_getRelatedIdColumn_16751377416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31170 = new ArrayList();
        HashMap term31174 = new HashMap();
        term31168 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserMappingTable"));
        Object term31169 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term31168, term31168.getClass(), "columns", null);
        setField(term31169, term31169.getClass(), "constraints", term31170);
        setField(term31169, term31169.getClass(), "typedContraints", term31174);
        setField(term31168, term31168.getClass(), "constraints", term31169);
        setField(term31168, term31168.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserMappingTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelatedIdColumn", argTypes, term31168, args);
    }

};


