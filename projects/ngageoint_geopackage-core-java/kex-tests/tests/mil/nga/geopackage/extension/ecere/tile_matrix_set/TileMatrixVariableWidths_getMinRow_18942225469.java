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

public class TileMatrixVariableWidths_getMinRow_18942225469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1972;

    public TileMatrixVariableWidths_getMinRow_18942225469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2014 = new Double(0.146431486357265);
        Double term2016 = new Double(0.24259014218848696);
        Double term2018 = new Double(0.1544348383112728);
        Double term2020 = new Double(0.5187846213101265);
        Long term2022 = new Long(1439298019805881866L);
        Long term2024 = new Long(-8708192233349544946L);
        Double term2035 = new Double(0.045893173090043815);
        term1972 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term1974 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term1976 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term1972, term1972.getClass(), "id", -1616722610139554082L);
        setLongField(term1974, term1974.getClass(), "id", 7495904023107549024L);
        setLongField(term1976, term1976.getClass(), "id", 8802866251294305945L);
        setField(term1976, term1976.getClass(), "tms", "TJmVBGfTML");
        setField(term1976, term1976.getClass(), "description", "tPlsykYBqO");
        setField(term1976, term1976.getClass(), "uri", "bLPjGVBhlX");
        setField(term1976, term1976.getClass(), "minX", term2014);
        setField(term1976, term1976.getClass(), "minY", term2016);
        setField(term1976, term1976.getClass(), "maxX", term2018);
        setField(term1976, term1976.getClass(), "maxY", term2020);
        setField(term1976, term1976.getClass(), "srs", null);
        setField(term1976, term1976.getClass(), "srsId", term2022);
        setField(term1974, term1974.getClass(), "tms", term1976);
        setField(term1974, term1974.getClass(), "tmsId", term2024);
        setLongField(term1974, term1974.getClass(), "zoomLevel", 4513004407927379358L);
        setLongField(term1974, term1974.getClass(), "matrixWidth", -7115418542247301000L);
        setLongField(term1974, term1974.getClass(), "matrixHeight", 8034714140377562739L);
        setLongField(term1974, term1974.getClass(), "tileWidth", -2924531382671518368L);
        setLongField(term1974, term1974.getClass(), "tileHeight", -3948863953565024517L);
        setDoubleField(term1974, term1974.getClass(), "pixelXSize", 0.3587267442738795);
        setDoubleField(term1974, term1974.getClass(), "pixelYSize", 0.07802449704920456);
        setDoubleField(term1974, term1974.getClass(), "top", 0.5279279537140873);
        setDoubleField(term1974, term1974.getClass(), "left", 0.3202192021706908);
        setField(term1974, term1974.getClass(), "scaleDenominator", term2035);
        setField(term1972, term1972.getClass(), "tm", term1974);
        setLongField(term1972, term1972.getClass(), "tmsId", -6587807377747738663L);
        setLongField(term1972, term1972.getClass(), "maxRow", -6301101997917060727L);
        setLongField(term1972, term1972.getClass(), "minRow", 8166095254618543564L);
        setLongField(term1972, term1972.getClass(), "coalesce", -4598158870068953328L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinRow", argTypes, term1972, args);
    }

};


