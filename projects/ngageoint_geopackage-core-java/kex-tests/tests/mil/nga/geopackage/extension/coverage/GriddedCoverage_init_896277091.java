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

public class GriddedCoverage_init_896277091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916;

    public GriddedCoverage_init_896277091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term962 = new Double(1.0);
        Double term964 = new Double(0.29874017652881824);
        term916 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term918 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term916, term916.getClass(), "id", 5907001541142728739L);
        setField(term918, term918.getClass(), "contents", null);
        setField(term918, term918.getClass(), "tableName", "pCTimMblYc");
        setField(term918, term918.getClass(), "srs", null);
        setLongField(term918, term918.getClass(), "srsId", 4178434741742309755L);
        setDoubleField(term918, term918.getClass(), "minX", 0.7633268466829064);
        setDoubleField(term918, term918.getClass(), "minY", 0.13481025392611334);
        setDoubleField(term918, term918.getClass(), "maxX", 0.3800088629986428);
        setDoubleField(term918, term918.getClass(), "maxY", 0.5840714198152577);
        setField(term916, term916.getClass(), "tileMatrixSet", term918);
        setField(term916, term916.getClass(), "tileMatrixSetName", "hNxWaHcfhY");
        setField(term916, term916.getClass(), "datatype", "RkybSrpybU");
        setDoubleField(term916, term916.getClass(), "scale", 1.0);
        setDoubleField(term916, term916.getClass(), "offset", 0.7559240768573477);
        setField(term916, term916.getClass(), "precision", term962);
        setField(term916, term916.getClass(), "dataNull", term964);
        setField(term916, term916.getClass(), "gridCellEncoding", "xOEqzGAmDU");
        setField(term916, term916.getClass(), "uom", "eZFUvlxvGV");
        setField(term916, term916.getClass(), "fieldName", "BYqFIqCKAV");
        setField(term916, term916.getClass(), "quantityDefinition", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Object[] args = new Object[1];
        args[0] = term916;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


