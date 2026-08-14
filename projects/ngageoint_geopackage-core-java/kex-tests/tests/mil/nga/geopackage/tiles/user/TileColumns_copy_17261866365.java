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

public class TileColumns_copy_17261866365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590;

    public TileColumns_copy_17261866365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term656 = new ArrayList();
        HashMap term661 = new HashMap();
        term590 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term607 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term590, term590.getClass(), "zoomLevelIndex", -1685132342);
        setIntField(term590, term590.getClass(), "tileColumnIndex", -1456670397);
        setIntField(term590, term590.getClass(), "tileRowIndex", 1622346318);
        setIntField(term590, term590.getClass(), "tileDataIndex", 1048535127);
        setField(term590, term590.getClass(), "tableName", "sEnIVFtZuQ");
        setElement(term607, 0, "ZVecLZMLHF");
        setElement(term607, 1, "fztQhjqwdP");
        setElement(term607, 2, "eVpkWxjuki");
        setElement(term607, 3, "SJiQaLvSKv");
        setField(term590, term590.getClass(), "columnNames", term607);
        setField(term590, term590.getClass(), "columns", term656);
        setBooleanField(term590, term590.getClass(), "custom", false);
        setField(term590, term590.getClass(), "nameToIndex", term661);
        setIntField(term590, term590.getClass(), "pkIndex", -655067527);
        setBooleanField(term590, term590.getClass(), "pkModifiable", true);
        setBooleanField(term590, term590.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term590, args);
    }

};


