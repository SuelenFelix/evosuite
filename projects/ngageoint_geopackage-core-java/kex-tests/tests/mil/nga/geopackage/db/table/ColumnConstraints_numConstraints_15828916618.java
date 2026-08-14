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

public class ColumnConstraints_numConstraints_15828916618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12750;

    public ColumnConstraints_numConstraints_15828916618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12764 = new ArrayList();
        HashMap term12768 = new HashMap();
        term12750 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term12763 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12750, term12750.getClass(), "name", "VDokbsCuqq");
        setField(term12763, term12763.getClass(), "constraints", term12764);
        setField(term12763, term12763.getClass(), "typedContraints", term12768);
        setField(term12750, term12750.getClass(), "constraints", term12763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numConstraints", argTypes, term12750, args);
    }

};


