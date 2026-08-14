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

public class TableConstraints_numTableConstraints_2484175755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8143;

    public TableConstraints_numTableConstraints_2484175755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8145 = new ArrayList();
        HashMap term8149 = new HashMap();
        LinkedHashMap term8154 = new LinkedHashMap();
        term8143 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8144 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8144, term8144.getClass(), "constraints", term8145);
        setField(term8144, term8144.getClass(), "typedContraints", term8149);
        setField(term8143, term8143.getClass(), "constraints", term8144);
        setField(term8143, term8143.getClass(), "columnConstraints", term8154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numTableConstraints", argTypes, term8143, args);
    }

};


