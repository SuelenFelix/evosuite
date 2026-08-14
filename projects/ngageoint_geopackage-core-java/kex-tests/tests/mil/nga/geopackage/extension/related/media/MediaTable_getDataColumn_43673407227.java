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

public class MediaTable_getDataColumn_43673407227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7508;

    public MediaTable_getDataColumn_43673407227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7534 = new ArrayList();
        HashMap term7538 = new HashMap();
        term7508 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term7533 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7508, term7508.getClass(), "relationName", "lKrEAkypza");
        setField(term7508, term7508.getClass(), "dataType", "KtuuNAqGCQ");
        setField(term7508, term7508.getClass(), "columns", null);
        setField(term7533, term7533.getClass(), "constraints", term7534);
        setField(term7533, term7533.getClass(), "typedContraints", term7538);
        setField(term7508, term7508.getClass(), "constraints", term7533);
        setField(term7508, term7508.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataColumn", argTypes, term7508, args);
    }

};


