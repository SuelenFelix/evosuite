package mil.nga.geopackage.extension.coverage;

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
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class GriddedCoverage_getQuantityDefinition_159974619824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5735;

    public GriddedCoverage_getQuantityDefinition_159974619824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5781 = new Double(1.0);
        Double term5783 = new Double(0.686293604788188);
        term5735 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term5737 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term5735, term5735.getClass(), "id", 4474998035090263139L);
        setField(term5737, term5737.getClass(), "contents", null);
        setField(term5737, term5737.getClass(), "tableName", "RbVQXSpxXy");
        setField(term5737, term5737.getClass(), "srs", null);
        setLongField(term5737, term5737.getClass(), "srsId", 2848819812340321742L);
        setDoubleField(term5737, term5737.getClass(), "minX", 0.6428742553484879);
        setDoubleField(term5737, term5737.getClass(), "minY", 0.6584165706677267);
        setDoubleField(term5737, term5737.getClass(), "maxX", 0.44268490778872205);
        setDoubleField(term5737, term5737.getClass(), "maxY", 0.7507333108648018);
        setField(term5735, term5735.getClass(), "tileMatrixSet", term5737);
        setField(term5735, term5735.getClass(), "tileMatrixSetName", "YpJbIgJWWv");
        setField(term5735, term5735.getClass(), "datatype", "JppkknKVOw");
        setDoubleField(term5735, term5735.getClass(), "scale", 1.0);
        setDoubleField(term5735, term5735.getClass(), "offset", 0.007493740494434409);
        setField(term5735, term5735.getClass(), "precision", term5781);
        setField(term5735, term5735.getClass(), "dataNull", term5783);
        setField(term5735, term5735.getClass(), "gridCellEncoding", "iljANwuEjk");
        setField(term5735, term5735.getClass(), "uom", "kNqaJKIATy");
        setField(term5735, term5735.getClass(), "fieldName", "vKQukfbJUd");
        setField(term5735, term5735.getClass(), "quantityDefinition", "lFRJFUMVbx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuantityDefinition", argTypes, term5735, args);
    }

};


