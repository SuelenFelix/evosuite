package mil.nga.geopackage.db.table;

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
import static mil.nga.geopackage.db.table.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class ColumnConstraints_hasConstraints_152647983310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12849;

    public ColumnConstraints_hasConstraints_152647983310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12863 = new ArrayList();
        HashMap term12867 = new HashMap();
        term12849 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term12862 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12849, term12849.getClass(), "name", "JkgoRtImdE");
        setField(term12862, term12862.getClass(), "constraints", term12863);
        setField(term12862, term12862.getClass(), "typedContraints", term12867);
        setField(term12849, term12849.getClass(), "constraints", term12862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasConstraints", argTypes, term12849, args);
    }

};


