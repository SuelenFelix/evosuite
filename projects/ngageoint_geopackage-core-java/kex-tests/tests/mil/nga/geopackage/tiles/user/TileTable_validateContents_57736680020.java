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

public class TileTable_validateContents_57736680020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5049;

    public TileTable_validateContents_57736680020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5051 = new ArrayList();
        HashMap term5055 = new HashMap();
        term5049 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term5050 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term5049, term5049.getClass(), "columns", null);
        setField(term5050, term5050.getClass(), "constraints", term5051);
        setField(term5050, term5050.getClass(), "typedContraints", term5055);
        setField(term5049, term5049.getClass(), "constraints", term5050);
        setField(term5049, term5049.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.contents.Contents");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "validateContents", argTypes, term5049, args);
    }

};


