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

public class ExtTileMatrix_getScaleDenominator_67554435924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4691;

    public ExtTileMatrix_getScaleDenominator_67554435924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4731 = new Double(0.9136597256674437);
        Double term4733 = new Double(0.3741779691002205);
        Double term4735 = new Double(0.5652495059647745);
        Double term4737 = new Double(0.021410850431387685);
        Long term4739 = new Long(-2177368829816872572L);
        Long term4741 = new Long(-8463029266761149071L);
        Double term4752 = new Double(0.8397628091272534);
        term4691 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term4693 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term4691, term4691.getClass(), "id", -3850323135468805420L);
        setLongField(term4693, term4693.getClass(), "id", -5207216109884759743L);
        setField(term4693, term4693.getClass(), "tms", "ZfdXfCCFDf");
        setField(term4693, term4693.getClass(), "description", "MwwjNtdOFT");
        setField(term4693, term4693.getClass(), "uri", "VYkqXKVlAJ");
        setField(term4693, term4693.getClass(), "minX", term4731);
        setField(term4693, term4693.getClass(), "minY", term4733);
        setField(term4693, term4693.getClass(), "maxX", term4735);
        setField(term4693, term4693.getClass(), "maxY", term4737);
        setField(term4693, term4693.getClass(), "srs", null);
        setField(term4693, term4693.getClass(), "srsId", term4739);
        setField(term4691, term4691.getClass(), "tms", term4693);
        setField(term4691, term4691.getClass(), "tmsId", term4741);
        setLongField(term4691, term4691.getClass(), "zoomLevel", 8765880103547975810L);
        setLongField(term4691, term4691.getClass(), "matrixWidth", 4552367707739103094L);
        setLongField(term4691, term4691.getClass(), "matrixHeight", -6001151456088965547L);
        setLongField(term4691, term4691.getClass(), "tileWidth", 1740732617708040141L);
        setLongField(term4691, term4691.getClass(), "tileHeight", 3472971833455746664L);
        setDoubleField(term4691, term4691.getClass(), "pixelXSize", 0.007493740494434409);
        setDoubleField(term4691, term4691.getClass(), "pixelYSize", 0.29172553321356776);
        setDoubleField(term4691, term4691.getClass(), "top", 0.9276995636844321);
        setDoubleField(term4691, term4691.getClass(), "left", 0.7636130748477434);
        setField(term4691, term4691.getClass(), "scaleDenominator", term4752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScaleDenominator", argTypes, term4691, args);
    }

};


