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

public class TileMatrixVariableWidths_getId_11211038771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1081;

    public TileMatrixVariableWidths_getId_11211038771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1123 = new Double(0.22651340641904605);
        Double term1125 = new Double(0.8878841294187743);
        Double term1127 = new Double(0.6588948704887806);
        Double term1129 = new Double(0.6397214730945112);
        Long term1131 = new Long(-4920224193275732920L);
        Long term1133 = new Long(8428634514691209827L);
        Double term1144 = new Double(0.25937345430928016);
        term1081 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term1083 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term1085 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term1081, term1081.getClass(), "id", 6855071767938501807L);
        setLongField(term1083, term1083.getClass(), "id", -5892135042702373494L);
        setLongField(term1085, term1085.getClass(), "id", 5262507301787091109L);
        setField(term1085, term1085.getClass(), "tms", "wSQxaModmm");
        setField(term1085, term1085.getClass(), "description", "UlajhuVLaP");
        setField(term1085, term1085.getClass(), "uri", "gGSMzuGICf");
        setField(term1085, term1085.getClass(), "minX", term1123);
        setField(term1085, term1085.getClass(), "minY", term1125);
        setField(term1085, term1085.getClass(), "maxX", term1127);
        setField(term1085, term1085.getClass(), "maxY", term1129);
        setField(term1085, term1085.getClass(), "srs", null);
        setField(term1085, term1085.getClass(), "srsId", term1131);
        setField(term1083, term1083.getClass(), "tms", term1085);
        setField(term1083, term1083.getClass(), "tmsId", term1133);
        setLongField(term1083, term1083.getClass(), "zoomLevel", -6823727938421990489L);
        setLongField(term1083, term1083.getClass(), "matrixWidth", -484994522244390100L);
        setLongField(term1083, term1083.getClass(), "matrixHeight", 1233889271256172047L);
        setLongField(term1083, term1083.getClass(), "tileWidth", 6617340557564669657L);
        setLongField(term1083, term1083.getClass(), "tileHeight", 1439298019805881866L);
        setDoubleField(term1083, term1083.getClass(), "pixelXSize", 0.13238746331190498);
        setDoubleField(term1083, term1083.getClass(), "pixelYSize", 0.3455959125047594);
        setDoubleField(term1083, term1083.getClass(), "top", 0.5523635872663106);
        setDoubleField(term1083, term1083.getClass(), "left", 0.544608645520025);
        setField(term1083, term1083.getClass(), "scaleDenominator", term1144);
        setField(term1081, term1081.getClass(), "tm", term1083);
        setLongField(term1081, term1081.getClass(), "tmsId", -8708192233349544946L);
        setLongField(term1081, term1081.getClass(), "maxRow", 5907001541142728739L);
        setLongField(term1081, term1081.getClass(), "minRow", 4178434741742309755L);
        setLongField(term1081, term1081.getClass(), "coalesce", -2068172595987555756L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1081, args);
    }

};


