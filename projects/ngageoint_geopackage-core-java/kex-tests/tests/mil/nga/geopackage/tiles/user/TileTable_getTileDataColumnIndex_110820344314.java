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

public class TileTable_getTileDataColumnIndex_110820344314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5019;

    public TileTable_getTileDataColumnIndex_110820344314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5021 = new ArrayList();
        HashMap term5025 = new HashMap();
        term5019 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term5020 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term5019, term5019.getClass(), "columns", null);
        setField(term5020, term5020.getClass(), "constraints", term5021);
        setField(term5020, term5020.getClass(), "typedContraints", term5025);
        setField(term5019, term5019.getClass(), "constraints", term5020);
        setField(term5019, term5019.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileDataColumnIndex", argTypes, term5019, args);
    }

};


