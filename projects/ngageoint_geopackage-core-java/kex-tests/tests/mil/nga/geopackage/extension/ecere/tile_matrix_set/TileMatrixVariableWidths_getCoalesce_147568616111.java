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

public class TileMatrixVariableWidths_getCoalesce_147568616111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2172;

    public TileMatrixVariableWidths_getCoalesce_147568616111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2214 = new Double(0.39286935532362843);
        Double term2216 = new Double(0.11577948268926874);
        Double term2218 = new Double(0.5617009352394552);
        Double term2220 = new Double(0.09067063848644474);
        Long term2222 = new Long(-2068172595987555756L);
        Long term2224 = new Long(-6292278961887936280L);
        Double term2235 = new Double(0.268304014379393);
        term2172 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term2174 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term2176 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term2172, term2172.getClass(), "id", -2783999800714825789L);
        setLongField(term2174, term2174.getClass(), "id", 4266570509071948633L);
        setLongField(term2176, term2176.getClass(), "id", -7291742736502427077L);
        setField(term2176, term2176.getClass(), "tms", "KoyGrUJeJW");
        setField(term2176, term2176.getClass(), "description", "HqBOwkVqjD");
        setField(term2176, term2176.getClass(), "uri", "MAcUBcBckh");
        setField(term2176, term2176.getClass(), "minX", term2214);
        setField(term2176, term2176.getClass(), "minY", term2216);
        setField(term2176, term2176.getClass(), "maxX", term2218);
        setField(term2176, term2176.getClass(), "maxY", term2220);
        setField(term2176, term2176.getClass(), "srs", null);
        setField(term2176, term2176.getClass(), "srsId", term2222);
        setField(term2174, term2174.getClass(), "tms", term2176);
        setField(term2174, term2174.getClass(), "tmsId", term2224);
        setLongField(term2174, term2174.getClass(), "zoomLevel", -8121849829073967555L);
        setLongField(term2174, term2174.getClass(), "matrixWidth", 5219030281405653303L);
        setLongField(term2174, term2174.getClass(), "matrixHeight", -8471550651709805183L);
        setLongField(term2174, term2174.getClass(), "tileWidth", -948292411727204525L);
        setLongField(term2174, term2174.getClass(), "tileHeight", -8892586408602479513L);
        setDoubleField(term2174, term2174.getClass(), "pixelXSize", 0.25937345430928016);
        setDoubleField(term2174, term2174.getClass(), "pixelYSize", 0.5873228247510078);
        setDoubleField(term2174, term2174.getClass(), "top", 0.8823181080774973);
        setDoubleField(term2174, term2174.getClass(), "left", 0.2192450926212024);
        setField(term2174, term2174.getClass(), "scaleDenominator", term2235);
        setField(term2172, term2172.getClass(), "tm", term2174);
        setLongField(term2172, term2172.getClass(), "tmsId", 4616440478358528406L);
        setLongField(term2172, term2172.getClass(), "maxRow", 3427570961451840069L);
        setLongField(term2172, term2172.getClass(), "minRow", 4502292577098212311L);
        setLongField(term2172, term2172.getClass(), "coalesce", -3730936709704460408L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoalesce", argTypes, term2172, args);
    }

};


