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

public class UserMappingTable_getRelatedIdColumnIndex_89223223215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31157;

    public UserMappingTable_getRelatedIdColumnIndex_89223223215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31159 = new ArrayList();
        HashMap term31163 = new HashMap();
        term31157 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserMappingTable"));
        Object term31158 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term31157, term31157.getClass(), "columns", null);
        setField(term31158, term31158.getClass(), "constraints", term31159);
        setField(term31158, term31158.getClass(), "typedContraints", term31163);
        setField(term31157, term31157.getClass(), "constraints", term31158);
        setField(term31157, term31157.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserMappingTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelatedIdColumnIndex", argTypes, term31157, args);
    }

};


