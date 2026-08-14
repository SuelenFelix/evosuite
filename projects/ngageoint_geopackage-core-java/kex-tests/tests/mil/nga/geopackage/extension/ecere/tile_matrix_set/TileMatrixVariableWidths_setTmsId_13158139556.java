package mil.nga.geopackage.extension.ecere.tile_matrix_set;

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
import static mil.nga.geopackage.extension.ecere.tile_matrix_set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.Long;

public class TileMatrixVariableWidths_setTmsId_13158139556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1671;
     Object term1740;

    public TileMatrixVariableWidths_setTmsId_13158139556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1713 = new Double(0.7154795600170818);
        Double term1715 = new Double(0.6355029654528058);
        Double term1717 = new Double(0.0022646783892913414);
        Double term1719 = new Double(0.36226058076369927);
        Long term1721 = new Long(-5892135042702373494L);
        Long term1723 = new Long(5262507301787091109L);
        Double term1734 = new Double(0.03699061125289671);
        term1671 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term1673 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term1675 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term1671, term1671.getClass(), "id", 1672578078364590450L);
        setLongField(term1673, term1673.getClass(), "id", 4949335493504695457L);
        setLongField(term1675, term1675.getClass(), "id", -5216789073301458893L);
        setField(term1675, term1675.getClass(), "tms", "ytSBIKXogI");
        setField(term1675, term1675.getClass(), "description", "nHXjMycHlU");
        setField(term1675, term1675.getClass(), "uri", "ieCtQFdkii");
        setField(term1675, term1675.getClass(), "minX", term1713);
        setField(term1675, term1675.getClass(), "minY", term1715);
        setField(term1675, term1675.getClass(), "maxX", term1717);
        setField(term1675, term1675.getClass(), "maxY", term1719);
        setField(term1675, term1675.getClass(), "srs", null);
        setField(term1675, term1675.getClass(), "srsId", term1721);
        setField(term1673, term1673.getClass(), "tms", term1675);
        setField(term1673, term1673.getClass(), "tmsId", term1723);
        setLongField(term1673, term1673.getClass(), "zoomLevel", -1832940336320585644L);
        setLongField(term1673, term1673.getClass(), "matrixWidth", -8033714905181142681L);
        setLongField(term1673, term1673.getClass(), "matrixHeight", -9040825890007374809L);
        setLongField(term1673, term1673.getClass(), "tileWidth", 1368340889161782793L);
        setLongField(term1673, term1673.getClass(), "tileHeight", -5786861555969446503L);
        setDoubleField(term1673, term1673.getClass(), "pixelXSize", 0.13481025392611334);
        setDoubleField(term1673, term1673.getClass(), "pixelYSize", 0.3800088629986428);
        setDoubleField(term1673, term1673.getClass(), "top", 0.5840714198152577);
        setDoubleField(term1673, term1673.getClass(), "left", 0.7559240768573477);
        setField(term1673, term1673.getClass(), "scaleDenominator", term1734);
        setField(term1671, term1671.getClass(), "tm", term1673);
        setLongField(term1671, term1671.getClass(), "tmsId", 2354625302846375590L);
        setLongField(term1671, term1671.getClass(), "maxRow", 7276637106827860087L);
        setLongField(term1671, term1671.getClass(), "minRow", -3936701866695933852L);
        setLongField(term1671, term1671.getClass(), "coalesce", 1215116475929634177L);
        term1740 = new Long(1597484336218508869L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1740;
        callMethod(klass, "setTmsId", argTypes, term1671, args);
    }

};


