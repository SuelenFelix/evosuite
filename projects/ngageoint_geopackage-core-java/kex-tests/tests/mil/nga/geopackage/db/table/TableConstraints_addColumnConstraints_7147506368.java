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
import java.util.LinkedHashMap;

public class TableConstraints_addColumnConstraints_7147506368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8200;
     Object term8217;

    public TableConstraints_addColumnConstraints_7147506368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8202 = new ArrayList();
        HashMap term8206 = new HashMap();
        LinkedHashMap term8211 = new LinkedHashMap();
        term8200 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8201 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8201, term8201.getClass(), "constraints", term8202);
        setField(term8201, term8201.getClass(), "typedContraints", term8206);
        setField(term8200, term8200.getClass(), "constraints", term8201);
        setField(term8200, term8200.getClass(), "columnConstraints", term8211);
        ArrayList term8231 = new ArrayList();
        HashMap term8235 = new HashMap();
        term8217 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term8230 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8217, term8217.getClass(), "name", "ZKMLioamsY");
        setField(term8230, term8230.getClass(), "constraints", term8231);
        setField(term8230, term8230.getClass(), "typedContraints", term8235);
        setField(term8217, term8217.getClass(), "constraints", term8230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Object[] args = new Object[1];
        args[0] = term8217;
        callMethod(klass, "addColumnConstraints", argTypes, term8200, args);
    }

};


