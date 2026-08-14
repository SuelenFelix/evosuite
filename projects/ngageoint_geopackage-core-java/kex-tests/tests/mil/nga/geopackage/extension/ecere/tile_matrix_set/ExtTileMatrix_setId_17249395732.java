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

public class ExtTileMatrix_setId_17249395732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2547;
     Object term2610;

    public ExtTileMatrix_setId_17249395732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2587 = new Double(0.0865998004187658);
        Double term2589 = new Double(0.9628647861255637);
        Double term2591 = new Double(0.623231822150205);
        Double term2593 = new Double(0.09037487793444521);
        Long term2595 = new Long(4044358158040652353L);
        Long term2597 = new Long(-4443169559037975007L);
        Double term2608 = new Double(0.6561919196821765);
        term2547 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term2549 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term2547, term2547.getClass(), "id", 5246058710498845622L);
        setLongField(term2549, term2549.getClass(), "id", 4394651392080968777L);
        setField(term2549, term2549.getClass(), "tms", "jUbSRrkrYZ");
        setField(term2549, term2549.getClass(), "description", "bWWfajKbEX");
        setField(term2549, term2549.getClass(), "uri", "cAPeiZHKGJ");
        setField(term2549, term2549.getClass(), "minX", term2587);
        setField(term2549, term2549.getClass(), "minY", term2589);
        setField(term2549, term2549.getClass(), "maxX", term2591);
        setField(term2549, term2549.getClass(), "maxY", term2593);
        setField(term2549, term2549.getClass(), "srs", null);
        setField(term2549, term2549.getClass(), "srsId", term2595);
        setField(term2547, term2547.getClass(), "tms", term2549);
        setField(term2547, term2547.getClass(), "tmsId", term2597);
        setLongField(term2547, term2547.getClass(), "zoomLevel", -7310273014364148916L);
        setLongField(term2547, term2547.getClass(), "matrixWidth", 8863790908271299748L);
        setLongField(term2547, term2547.getClass(), "matrixHeight", 9205327385733285058L);
        setLongField(term2547, term2547.getClass(), "tileWidth", 4199886998224701110L);
        setLongField(term2547, term2547.getClass(), "tileHeight", 8540994973773607992L);
        setDoubleField(term2547, term2547.getClass(), "pixelXSize", 0.5804948995371725);
        setDoubleField(term2547, term2547.getClass(), "pixelYSize", 0.20737514139742264);
        setDoubleField(term2547, term2547.getClass(), "top", 0.7919370314903882);
        setDoubleField(term2547, term2547.getClass(), "left", 0.2109867221632754);
        setField(term2547, term2547.getClass(), "scaleDenominator", term2608);
        term2610 = new Long(-2338103433822116635L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2610;
        callMethod(klass, "setId", argTypes, term2547, args);
    }

};


