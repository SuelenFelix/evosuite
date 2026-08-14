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

public class TileColumns_init_21102304754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455;

    public TileColumns_init_21102304754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term521 = new ArrayList();
        HashMap term526 = new HashMap();
        term455 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term472 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term455, term455.getClass(), "zoomLevelIndex", -522618178);
        setIntField(term455, term455.getClass(), "tileColumnIndex", 1134449235);
        setIntField(term455, term455.getClass(), "tileRowIndex", -883034806);
        setIntField(term455, term455.getClass(), "tileDataIndex", 1585847225);
        setField(term455, term455.getClass(), "tableName", "sEccwbJKYE");
        setElement(term472, 0, "AWRooQKkdW");
        setElement(term472, 1, "vjxIhXHxGR");
        setElement(term472, 2, "QXzGXbEXMu");
        setElement(term472, 3, "qxSDVejjiY");
        setField(term455, term455.getClass(), "columnNames", term472);
        setField(term455, term455.getClass(), "columns", term521);
        setBooleanField(term455, term455.getClass(), "custom", true);
        setField(term455, term455.getClass(), "nameToIndex", term526);
        setIntField(term455, term455.getClass(), "pkIndex", 597278769);
        setBooleanField(term455, term455.getClass(), "pkModifiable", true);
        setBooleanField(term455, term455.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Object[] args = new Object[1];
        args[0] = term455;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


