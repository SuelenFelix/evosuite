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

public class UserMappingTable_getBaseIdColumn_31214537214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31146;

    public UserMappingTable_getBaseIdColumn_31214537214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31148 = new ArrayList();
        HashMap term31152 = new HashMap();
        term31146 = newInstance(Class.forName("mil.nga.geopackage.extension.related.UserMappingTable"));
        Object term31147 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term31146, term31146.getClass(), "columns", null);
        setField(term31147, term31147.getClass(), "constraints", term31148);
        setField(term31147, term31147.getClass(), "typedContraints", term31152);
        setField(term31146, term31146.getClass(), "constraints", term31147);
        setField(term31146, term31146.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserMappingTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseIdColumn", argTypes, term31146, args);
    }

};


