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

public class TileMatrixVariableWidths_setCoalesce_204152170912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2271;
     Object term2340;

    public TileMatrixVariableWidths_setCoalesce_204152170912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2313 = new Double(0.7171972879282721);
        Double term2315 = new Double(0.9006361024877096);
        Double term2317 = new Double(0.5644914462415626);
        Double term2319 = new Double(0.509895859167191);
        Long term2321 = new Long(-6645965768855543712L);
        Long term2323 = new Long(4784595517102746672L);
        Double term2334 = new Double(0.07417792024383196);
        term2271 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term2273 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term2275 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term2271, term2271.getClass(), "id", -8614778293741404325L);
        setLongField(term2273, term2273.getClass(), "id", -5447369594017685765L);
        setLongField(term2275, term2275.getClass(), "id", -5724112525188606013L);
        setField(term2275, term2275.getClass(), "tms", "oVgzLbrsFr");
        setField(term2275, term2275.getClass(), "description", "vQVyKLdtaz");
        setField(term2275, term2275.getClass(), "uri", "OWKQODBLzb");
        setField(term2275, term2275.getClass(), "minX", term2313);
        setField(term2275, term2275.getClass(), "minY", term2315);
        setField(term2275, term2275.getClass(), "maxX", term2317);
        setField(term2275, term2275.getClass(), "maxY", term2319);
        setField(term2275, term2275.getClass(), "srs", null);
        setField(term2275, term2275.getClass(), "srsId", term2321);
        setField(term2273, term2273.getClass(), "tms", term2275);
        setField(term2273, term2273.getClass(), "tmsId", term2323);
        setLongField(term2273, term2273.getClass(), "zoomLevel", -6100012593724108983L);
        setLongField(term2273, term2273.getClass(), "matrixWidth", 5465527210299101732L);
        setLongField(term2273, term2273.getClass(), "matrixHeight", 4699157009689333952L);
        setLongField(term2273, term2273.getClass(), "tileWidth", -78240609295693193L);
        setLongField(term2273, term2273.getClass(), "tileHeight", 3090901538358721367L);
        setDoubleField(term2273, term2273.getClass(), "pixelXSize", 0.7591353014991907);
        setDoubleField(term2273, term2273.getClass(), "pixelYSize", 0.791695029600875);
        setDoubleField(term2273, term2273.getClass(), "top", 0.6862221294683138);
        setDoubleField(term2273, term2273.getClass(), "left", 0.15917839663695388);
        setField(term2273, term2273.getClass(), "scaleDenominator", term2334);
        setField(term2271, term2271.getClass(), "tm", term2273);
        setLongField(term2271, term2271.getClass(), "tmsId", -1677189124507026637L);
        setLongField(term2271, term2271.getClass(), "maxRow", 4795660804170399986L);
        setLongField(term2271, term2271.getClass(), "minRow", -4030863184426321096L);
        setLongField(term2271, term2271.getClass(), "coalesce", -8010214112439224349L);
        term2340 = new Long(-6673920710396545553L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2340;
        callMethod(klass, "setCoalesce", argTypes, term2271, args);
    }

};


