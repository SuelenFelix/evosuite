package mil.nga.geopackage.extension.related.media;

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
import static mil.nga.geopackage.extension.related.media.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class MediaTable_init_202119683823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7332;

    public MediaTable_init_202119683823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7334 = new ArrayList();
        HashMap term7338 = new HashMap();
        term7332 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term7333 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7332, term7332.getClass(), "columns", null);
        setField(term7333, term7333.getClass(), "constraints", term7334);
        setField(term7333, term7333.getClass(), "typedContraints", term7338);
        setField(term7332, term7332.getClass(), "constraints", term7333);
        setField(term7332, term7332.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Object[] args = new Object[1];
        args[0] = term7332;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


