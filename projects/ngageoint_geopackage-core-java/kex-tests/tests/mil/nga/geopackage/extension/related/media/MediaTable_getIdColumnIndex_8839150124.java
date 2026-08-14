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

public class MediaTable_getIdColumnIndex_8839150124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7343;

    public MediaTable_getIdColumnIndex_8839150124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7369 = new ArrayList();
        HashMap term7373 = new HashMap();
        term7343 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term7368 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7343, term7343.getClass(), "relationName", "TKlccZUpjz");
        setField(term7343, term7343.getClass(), "dataType", "GGzwMoHZXC");
        setField(term7343, term7343.getClass(), "columns", null);
        setField(term7368, term7368.getClass(), "constraints", term7369);
        setField(term7368, term7368.getClass(), "typedContraints", term7373);
        setField(term7343, term7343.getClass(), "constraints", term7368);
        setField(term7343, term7343.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdColumnIndex", argTypes, term7343, args);
    }

};


