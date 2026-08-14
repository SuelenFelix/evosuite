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

public class MediaTable_init_202119683824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2112;

    public MediaTable_init_202119683824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2114 = new ArrayList();
        HashMap term2118 = new HashMap();
        term2112 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term2113 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2112, term2112.getClass(), "columns", null);
        setField(term2113, term2113.getClass(), "constraints", term2114);
        setField(term2113, term2113.getClass(), "typedContraints", term2118);
        setField(term2112, term2112.getClass(), "constraints", term2113);
        setField(term2112, term2112.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Object[] args = new Object[1];
        args[0] = term2112;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


