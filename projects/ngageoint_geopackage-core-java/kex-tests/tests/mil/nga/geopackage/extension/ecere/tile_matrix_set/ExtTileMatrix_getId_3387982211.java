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

public class ExtTileMatrix_getId_3387982211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2454;

    public ExtTileMatrix_getId_3387982211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2494 = new Double(0.686293604788188);
        Double term2496 = new Double(0.12764449157430724);
        Double term2498 = new Double(0.39446728256884744);
        Double term2500 = new Double(0.7865909711092062);
        Long term2502 = new Long(-7612550318181586304L);
        Long term2504 = new Long(-2170847986967241072L);
        Double term2515 = new Double(0.06587158449170749);
        term2454 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term2456 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term2454, term2454.getClass(), "id", 3412644969878030772L);
        setLongField(term2456, term2456.getClass(), "id", 6698455537431331246L);
        setField(term2456, term2456.getClass(), "tms", "wGmYcqUkgE");
        setField(term2456, term2456.getClass(), "description", "idgaQsnJpQ");
        setField(term2456, term2456.getClass(), "uri", "VgZnGoIFwQ");
        setField(term2456, term2456.getClass(), "minX", term2494);
        setField(term2456, term2456.getClass(), "minY", term2496);
        setField(term2456, term2456.getClass(), "maxX", term2498);
        setField(term2456, term2456.getClass(), "maxY", term2500);
        setField(term2456, term2456.getClass(), "srs", null);
        setField(term2456, term2456.getClass(), "srsId", term2502);
        setField(term2454, term2454.getClass(), "tms", term2456);
        setField(term2454, term2454.getClass(), "tmsId", term2504);
        setLongField(term2454, term2454.getClass(), "zoomLevel", -8327432141027603933L);
        setLongField(term2454, term2454.getClass(), "matrixWidth", -433040798405298080L);
        setLongField(term2454, term2454.getClass(), "matrixHeight", -1505191021111100819L);
        setLongField(term2454, term2454.getClass(), "tileWidth", -1000830646340880796L);
        setLongField(term2454, term2454.getClass(), "tileHeight", 5973526439563541711L);
        setDoubleField(term2454, term2454.getClass(), "pixelXSize", 0.9374115574082594);
        setDoubleField(term2454, term2454.getClass(), "pixelYSize", 0.8454723071922143);
        setDoubleField(term2454, term2454.getClass(), "top", 0.8566567697571895);
        setDoubleField(term2454, term2454.getClass(), "left", 0.9203805380592256);
        setField(term2454, term2454.getClass(), "scaleDenominator", term2515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2454, args);
    }

};


