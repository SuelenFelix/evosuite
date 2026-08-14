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

public class MediaTable_getIdColumn_202894807325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7398;

    public MediaTable_getIdColumn_202894807325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7424 = new ArrayList();
        HashMap term7428 = new HashMap();
        term7398 = newInstance(Class.forName("mil.nga.geopackage.extension.related.media.MediaTable"));
        Object term7423 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7398, term7398.getClass(), "relationName", "IpmgwHTgnG");
        setField(term7398, term7398.getClass(), "dataType", "tIpkeYIezR");
        setField(term7398, term7398.getClass(), "columns", null);
        setField(term7423, term7423.getClass(), "constraints", term7424);
        setField(term7423, term7423.getClass(), "typedContraints", term7428);
        setField(term7398, term7398.getClass(), "constraints", term7423);
        setField(term7398, term7398.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.media.MediaTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdColumn", argTypes, term7398, args);
    }

};


