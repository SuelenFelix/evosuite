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

public class TileMatrixVariableWidths_getTm_1431139843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1281;

    public TileMatrixVariableWidths_getTm_1431139843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1323 = new Double(0.6862221294683138);
        Double term1325 = new Double(0.15917839663695388);
        Double term1327 = new Double(0.9374115574082594);
        Double term1329 = new Double(0.8454723071922143);
        Long term1331 = new Long(-4365849114644724155L);
        Long term1333 = new Long(2486810210675247493L);
        Double term1344 = new Double(0.8566567697571895);
        term1281 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term1283 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term1285 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term1281, term1281.getClass(), "id", -1468719814009985452L);
        setLongField(term1283, term1283.getClass(), "id", -7738503207562305297L);
        setLongField(term1285, term1285.getClass(), "id", 3825396310311739952L);
        setField(term1285, term1285.getClass(), "tms", "tShwQLRGNe");
        setField(term1285, term1285.getClass(), "description", "LvtrsXUliU");
        setField(term1285, term1285.getClass(), "uri", "xLbjWUgOIL");
        setField(term1285, term1285.getClass(), "minX", term1323);
        setField(term1285, term1285.getClass(), "minY", term1325);
        setField(term1285, term1285.getClass(), "maxX", term1327);
        setField(term1285, term1285.getClass(), "maxY", term1329);
        setField(term1285, term1285.getClass(), "srs", null);
        setField(term1285, term1285.getClass(), "srsId", term1331);
        setField(term1283, term1283.getClass(), "tms", term1285);
        setField(term1283, term1283.getClass(), "tmsId", term1333);
        setLongField(term1283, term1283.getClass(), "zoomLevel", -3838084482494604218L);
        setLongField(term1283, term1283.getClass(), "matrixWidth", 3892018155439224435L);
        setLongField(term1283, term1283.getClass(), "matrixHeight", 5953383087795962419L);
        setLongField(term1283, term1283.getClass(), "tileWidth", 7994303628307559416L);
        setLongField(term1283, term1283.getClass(), "tileHeight", 2443640364875054177L);
        setDoubleField(term1283, term1283.getClass(), "pixelXSize", 0.6076495596892013);
        setDoubleField(term1283, term1283.getClass(), "pixelYSize", 0.37773193782763337);
        setDoubleField(term1283, term1283.getClass(), "top", 0.8474802076607362);
        setDoubleField(term1283, term1283.getClass(), "left", 0.5183269973490326);
        setField(term1283, term1283.getClass(), "scaleDenominator", term1344);
        setField(term1281, term1281.getClass(), "tm", term1283);
        setLongField(term1281, term1281.getClass(), "tmsId", -1610676979013636850L);
        setLongField(term1281, term1281.getClass(), "maxRow", 2062173786000223358L);
        setLongField(term1281, term1281.getClass(), "minRow", -8658027316505137504L);
        setLongField(term1281, term1281.getClass(), "coalesce", 414749984815662075L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTm", argTypes, term1281, args);
    }

};


