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

public class UserMappingTable_init_181517444811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2660;

    public UserMappingTable_init_181517444811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2662 = new ArrayList();
        HashMap term2666 = new HashMap();
        term2660 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term2661 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2660, term2660.getClass(), "columns", null);
        setField(term2661, term2661.getClass(), "constraints", term2662);
        setField(term2661, term2661.getClass(), "typedContraints", term2666);
        setField(term2660, term2660.getClass(), "constraints", term2661);
        setField(term2660, term2660.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.UserMappingTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Object[] args = new Object[1];
        args[0] = term2660;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


