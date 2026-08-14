package mil.nga.geopackage.tiles.user;

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
import static mil.nga.geopackage.tiles.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class TileTable_getTileColumnColumn_202863420711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4986;

    public TileTable_getTileColumnColumn_202863420711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4988 = new ArrayList();
        HashMap term4992 = new HashMap();
        term4986 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term4987 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4986, term4986.getClass(), "columns", null);
        setField(term4987, term4987.getClass(), "constraints", term4988);
        setField(term4987, term4987.getClass(), "typedContraints", term4992);
        setField(term4986, term4986.getClass(), "constraints", term4987);
        setField(term4986, term4986.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileColumnColumn", argTypes, term4986, args);
    }

};


