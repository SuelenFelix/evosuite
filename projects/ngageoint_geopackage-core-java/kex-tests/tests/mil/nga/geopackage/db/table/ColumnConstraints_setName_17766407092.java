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

public class ColumnConstraints_setName_17766407092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12550;

    public ColumnConstraints_setName_17766407092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12564 = new ArrayList();
        HashMap term12568 = new HashMap();
        term12550 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term12563 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12550, term12550.getClass(), "name", "RCOqfVsRHt");
        setField(term12563, term12563.getClass(), "constraints", term12564);
        setField(term12563, term12563.getClass(), "typedContraints", term12568);
        setField(term12550, term12550.getClass(), "constraints", term12563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TSyCeEZPaT";
        callMethod(klass, "setName", argTypes, term12550, args);
    }

};


