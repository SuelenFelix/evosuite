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

public class TileMatrixVariableWidths_getTmsId_10387198915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1572;

    public TileMatrixVariableWidths_getTmsId_10387198915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1614 = new Double(0.5306473989087822);
        Double term1616 = new Double(0.022483645678509023);
        Double term1618 = new Double(0.025133051616627267);
        Double term1620 = new Double(0.016575281023182953);
        Long term1622 = new Long(2120084523938730454L);
        Long term1624 = new Long(6855071767938501807L);
        Double term1635 = new Double(0.5308350402051779);
        term1572 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term1574 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term1576 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term1572, term1572.getClass(), "id", 4474998035090263139L);
        setLongField(term1574, term1574.getClass(), "id", 2848819812340321742L);
        setLongField(term1576, term1576.getClass(), "id", -8876856890348836498L);
        setField(term1576, term1576.getClass(), "tms", "YRHGsAkhxb");
        setField(term1576, term1576.getClass(), "description", "ffYhPOzlUs");
        setField(term1576, term1576.getClass(), "uri", "MLqYREekMl");
        setField(term1576, term1576.getClass(), "minX", term1614);
        setField(term1576, term1576.getClass(), "minY", term1616);
        setField(term1576, term1576.getClass(), "maxX", term1618);
        setField(term1576, term1576.getClass(), "maxY", term1620);
        setField(term1576, term1576.getClass(), "srs", null);
        setField(term1576, term1576.getClass(), "srsId", term1622);
        setField(term1574, term1574.getClass(), "tms", term1576);
        setField(term1574, term1574.getClass(), "tmsId", term1624);
        setLongField(term1574, term1574.getClass(), "zoomLevel", 846579494941632714L);
        setLongField(term1574, term1574.getClass(), "matrixWidth", 6689117472719450333L);
        setLongField(term1574, term1574.getClass(), "matrixHeight", 5836128569274066678L);
        setLongField(term1574, term1574.getClass(), "tileWidth", -2177368829816872572L);
        setLongField(term1574, term1574.getClass(), "tileHeight", -8463029266761149071L);
        setDoubleField(term1574, term1574.getClass(), "pixelXSize", 0.4569171842750229);
        setDoubleField(term1574, term1574.getClass(), "pixelYSize", 0.8598297828918529);
        setDoubleField(term1574, term1574.getClass(), "top", 0.43692187681405226);
        setDoubleField(term1574, term1574.getClass(), "left", 0.7633268466829064);
        setField(term1574, term1574.getClass(), "scaleDenominator", term1635);
        setField(term1572, term1572.getClass(), "tm", term1574);
        setLongField(term1572, term1572.getClass(), "tmsId", 3133860696238261492L);
        setLongField(term1572, term1572.getClass(), "maxRow", 7247160664318067468L);
        setLongField(term1572, term1572.getClass(), "minRow", 2135754395358000892L);
        setLongField(term1572, term1572.getClass(), "coalesce", -8085190702504231560L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTmsId", argTypes, term1572, args);
    }

};


