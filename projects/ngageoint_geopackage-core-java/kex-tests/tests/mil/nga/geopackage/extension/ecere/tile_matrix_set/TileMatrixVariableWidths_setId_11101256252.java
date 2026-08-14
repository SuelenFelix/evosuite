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

public class TileMatrixVariableWidths_setId_11101256252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1180;
     Object term1249;

    public TileMatrixVariableWidths_setId_11101256252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1222 = new Double(0.5873228247510078);
        Double term1224 = new Double(0.8823181080774973);
        Double term1226 = new Double(0.2192450926212024);
        Double term1228 = new Double(0.7591353014991907);
        Long term1230 = new Long(-2585684163342970173L);
        Long term1232 = new Long(8059786003080744426L);
        Double term1243 = new Double(0.791695029600875);
        term1180 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term1182 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term1184 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term1180, term1180.getClass(), "id", -6292278961887936280L);
        setLongField(term1182, term1182.getClass(), "id", -6645965768855543712L);
        setLongField(term1184, term1184.getClass(), "id", 4784595517102746672L);
        setField(term1184, term1184.getClass(), "tms", "hxCBltsObl");
        setField(term1184, term1184.getClass(), "description", "BndsHwAFMv");
        setField(term1184, term1184.getClass(), "uri", "GzFkzHGYFt");
        setField(term1184, term1184.getClass(), "minX", term1222);
        setField(term1184, term1184.getClass(), "minY", term1224);
        setField(term1184, term1184.getClass(), "maxX", term1226);
        setField(term1184, term1184.getClass(), "maxY", term1228);
        setField(term1184, term1184.getClass(), "srs", null);
        setField(term1184, term1184.getClass(), "srsId", term1230);
        setField(term1182, term1182.getClass(), "tms", term1184);
        setField(term1182, term1182.getClass(), "tmsId", term1232);
        setLongField(term1182, term1182.getClass(), "zoomLevel", -7612550318181586304L);
        setLongField(term1182, term1182.getClass(), "matrixWidth", -2170847986967241072L);
        setLongField(term1182, term1182.getClass(), "matrixHeight", 4044358158040652353L);
        setLongField(term1182, term1182.getClass(), "tileWidth", -4443169559037975007L);
        setLongField(term1182, term1182.getClass(), "tileHeight", -3842548265506930260L);
        setDoubleField(term1182, term1182.getClass(), "pixelXSize", 0.28570734989730284);
        setDoubleField(term1182, term1182.getClass(), "pixelYSize", 0.40176586625454525);
        setDoubleField(term1182, term1182.getClass(), "top", 0.2641345529914265);
        setDoubleField(term1182, term1182.getClass(), "left", 0.36923381893433327);
        setField(term1182, term1182.getClass(), "scaleDenominator", term1243);
        setField(term1180, term1180.getClass(), "tm", term1182);
        setLongField(term1180, term1180.getClass(), "tmsId", -5788180182343976541L);
        setLongField(term1180, term1180.getClass(), "maxRow", 2936323121573284007L);
        setLongField(term1180, term1180.getClass(), "minRow", -1154553077993834885L);
        setLongField(term1180, term1180.getClass(), "coalesce", -2850532706972744550L);
        term1249 = new Long(-2644215923136513282L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1249;
        callMethod(klass, "setId", argTypes, term1180, args);
    }

};


