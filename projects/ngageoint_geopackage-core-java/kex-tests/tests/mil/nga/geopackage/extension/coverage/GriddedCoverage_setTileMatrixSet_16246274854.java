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

public class GriddedCoverage_setTileMatrixSet_16246274854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420;
     Object term1518;

    public GriddedCoverage_setTileMatrixSet_16246274854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1466 = new Double(1.0);
        Double term1468 = new Double(0.32237559209193944);
        term1420 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term1422 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term1420, term1420.getClass(), "id", -7612550318181586304L);
        setField(term1422, term1422.getClass(), "contents", null);
        setField(term1422, term1422.getClass(), "tableName", "wSQxaModmm");
        setField(term1422, term1422.getClass(), "srs", null);
        setLongField(term1422, term1422.getClass(), "srsId", -2170847986967241072L);
        setDoubleField(term1422, term1422.getClass(), "minX", 0.5279279537140873);
        setDoubleField(term1422, term1422.getClass(), "minY", 0.3202192021706908);
        setDoubleField(term1422, term1422.getClass(), "maxX", 0.22651340641904605);
        setDoubleField(term1422, term1422.getClass(), "maxY", 0.8878841294187743);
        setField(term1420, term1420.getClass(), "tileMatrixSet", term1422);
        setField(term1420, term1420.getClass(), "tileMatrixSetName", "UlajhuVLaP");
        setField(term1420, term1420.getClass(), "datatype", "gGSMzuGICf");
        setDoubleField(term1420, term1420.getClass(), "scale", 1.0);
        setDoubleField(term1420, term1420.getClass(), "offset", 0.6588948704887806);
        setField(term1420, term1420.getClass(), "precision", term1466);
        setField(term1420, term1420.getClass(), "dataNull", term1468);
        setField(term1420, term1420.getClass(), "gridCellEncoding", "hxCBltsObl");
        setField(term1420, term1420.getClass(), "uom", "BndsHwAFMv");
        setField(term1420, term1420.getClass(), "fieldName", "GzFkzHGYFt");
        setField(term1420, term1420.getClass(), "quantityDefinition", "tShwQLRGNe");
        term1518 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setField(term1518, term1518.getClass(), "contents", null);
        setField(term1518, term1518.getClass(), "tableName", "LvtrsXUliU");
        setField(term1518, term1518.getClass(), "srs", null);
        setLongField(term1518, term1518.getClass(), "srsId", 4044358158040652353L);
        setDoubleField(term1518, term1518.getClass(), "minX", 0.6397214730945112);
        setDoubleField(term1518, term1518.getClass(), "minY", 0.25937345430928016);
        setDoubleField(term1518, term1518.getClass(), "maxX", 0.5873228247510078);
        setDoubleField(term1518, term1518.getClass(), "maxY", 0.8823181080774973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        Object[] args = new Object[1];
        args[0] = term1518;
        callMethod(klass, "setTileMatrixSet", argTypes, term1420, args);
    }

};


