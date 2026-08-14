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

public class TileColumns_hasTileColumnColumn_103830333813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1564;

    public TileColumns_hasTileColumnColumn_103830333813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1654 = new ArrayList();
        HashMap term1659 = new HashMap();
        term1564 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term1581 = (Object[]) newArray("java.lang.String", 6);
        setIntField(term1564, term1564.getClass(), "zoomLevelIndex", 493620644);
        setIntField(term1564, term1564.getClass(), "tileColumnIndex", 1328271830);
        setIntField(term1564, term1564.getClass(), "tileRowIndex", 1596070772);
        setIntField(term1564, term1564.getClass(), "tileDataIndex", 97029295);
        setField(term1564, term1564.getClass(), "tableName", "jwsfVjMoJT");
        setElement(term1581, 0, "ZfdXfCCFDf");
        setElement(term1581, 1, "MwwjNtdOFT");
        setElement(term1581, 2, "VYkqXKVlAJ");
        setElement(term1581, 3, "XkIoWJRNwN");
        setElement(term1581, 4, "aNWLJdrZMq");
        setElement(term1581, 5, "HHmNoYxIGj");
        setField(term1564, term1564.getClass(), "columnNames", term1581);
        setField(term1564, term1564.getClass(), "columns", term1654);
        setBooleanField(term1564, term1564.getClass(), "custom", false);
        setField(term1564, term1564.getClass(), "nameToIndex", term1659);
        setIntField(term1564, term1564.getClass(), "pkIndex", -1371869594);
        setBooleanField(term1564, term1564.getClass(), "pkModifiable", false);
        setBooleanField(term1564, term1564.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTileColumnColumn", argTypes, term1564, args);
    }

};


