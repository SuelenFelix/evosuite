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

public class ColumnConstraints_addConstraints_18715734885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12639;
     Object term12662;

    public ColumnConstraints_addConstraints_18715734885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12653 = new ArrayList();
        HashMap term12657 = new HashMap();
        term12639 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term12652 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12639, term12639.getClass(), "name", "fzeqPnzpnt");
        setField(term12652, term12652.getClass(), "constraints", term12653);
        setField(term12652, term12652.getClass(), "typedContraints", term12657);
        setField(term12639, term12639.getClass(), "constraints", term12652);
        ArrayList term12663 = new ArrayList();
        HashMap term12667 = new HashMap();
        term12662 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12662, term12662.getClass(), "constraints", term12663);
        setField(term12662, term12662.getClass(), "typedContraints", term12667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[1];
        args[0] = term12662;
        callMethod(klass, "addConstraints", argTypes, term12639, args);
    }

};


