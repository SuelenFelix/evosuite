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

public class MediaTable_getDataColumnIndex_151758781026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7453;

    public MediaTable_getDataColumnIndex_151758781026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7479 = new ArrayList();
        HashMap term7483 = new HashMap();
        term7453 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term7478 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7453, term7453.getClass(), "relationName", "YkZtEtthvz");
        setField(term7453, term7453.getClass(), "dataType", "dwlZSxlXOo");
        setField(term7453, term7453.getClass(), "columns", null);
        setField(term7478, term7478.getClass(), "constraints", term7479);
        setField(term7478, term7478.getClass(), "typedContraints", term7483);
        setField(term7453, term7453.getClass(), "constraints", term7478);
        setField(term7453, term7453.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataColumnIndex", argTypes, term7453, args);
    }

};


