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

public class ExtTileMatrix_getPixelYSize_103747606118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4127;

    public ExtTileMatrix_getPixelYSize_103747606118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4167 = new Double(0.2382345237223229);
        Double term4169 = new Double(0.6037093070161561);
        Double term4171 = new Double(0.48050706663913145);
        Double term4173 = new Double(0.4990217874180345);
        Long term4175 = new Long(5510783420697225605L);
        Long term4177 = new Long(6005241913654469005L);
        Double term4188 = new Double(0.22767631814145395);
        term4127 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term4129 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term4127, term4127.getClass(), "id", -8890284990655172580L);
        setLongField(term4129, term4129.getClass(), "id", -5951743062322506095L);
        setField(term4129, term4129.getClass(), "tms", "EYtfuJaxiM");
        setField(term4129, term4129.getClass(), "description", "gCWtLVKVVe");
        setField(term4129, term4129.getClass(), "uri", "fWKJoSoCwE");
        setField(term4129, term4129.getClass(), "minX", term4167);
        setField(term4129, term4129.getClass(), "minY", term4169);
        setField(term4129, term4129.getClass(), "maxX", term4171);
        setField(term4129, term4129.getClass(), "maxY", term4173);
        setField(term4129, term4129.getClass(), "srs", null);
        setField(term4129, term4129.getClass(), "srsId", term4175);
        setField(term4127, term4127.getClass(), "tms", term4129);
        setField(term4127, term4127.getClass(), "tmsId", term4177);
        setLongField(term4127, term4127.getClass(), "zoomLevel", 768144790810175653L);
        setLongField(term4127, term4127.getClass(), "matrixWidth", -1497280900081695731L);
        setLongField(term4127, term4127.getClass(), "matrixHeight", -3602825674339018793L);
        setLongField(term4127, term4127.getClass(), "tileWidth", 3086974592680165932L);
        setLongField(term4127, term4127.getClass(), "tileHeight", -532956263280568707L);
        setDoubleField(term4127, term4127.getClass(), "pixelXSize", 0.1245258965512791);
        setDoubleField(term4127, term4127.getClass(), "pixelYSize", 0.9511861072660375);
        setDoubleField(term4127, term4127.getClass(), "top", 0.05880719443135807);
        setDoubleField(term4127, term4127.getClass(), "left", 0.34010089048558567);
        setField(term4127, term4127.getClass(), "scaleDenominator", term4188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPixelYSize", argTypes, term4127, args);
    }

};


