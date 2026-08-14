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

public class ExtTileMatrix_setZoomLevel_7636051917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3092;
     Object term3155;

    public ExtTileMatrix_setZoomLevel_7636051917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3132 = new Double(0.2446504549754045);
        Double term3134 = new Double(0.6142723998707854);
        Double term3136 = new Double(0.4355627280318103);
        Double term3138 = new Double(0.841460835734741);
        Long term3140 = new Long(-3838084482494604218L);
        Long term3142 = new Long(3892018155439224435L);
        Double term3153 = new Double(0.7859316615744082);
        term3092 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3094 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term3092, term3092.getClass(), "id", 8107921244631636572L);
        setLongField(term3094, term3094.getClass(), "id", -7904053112604879960L);
        setField(term3094, term3094.getClass(), "tms", "SPpkrGcPRr");
        setField(term3094, term3094.getClass(), "description", "sEccwbJKYE");
        setField(term3094, term3094.getClass(), "uri", "AWRooQKkdW");
        setField(term3094, term3094.getClass(), "minX", term3132);
        setField(term3094, term3094.getClass(), "minY", term3134);
        setField(term3094, term3094.getClass(), "maxX", term3136);
        setField(term3094, term3094.getClass(), "maxY", term3138);
        setField(term3094, term3094.getClass(), "srs", null);
        setField(term3094, term3094.getClass(), "srsId", term3140);
        setField(term3092, term3092.getClass(), "tms", term3094);
        setField(term3092, term3092.getClass(), "tmsId", term3142);
        setLongField(term3092, term3092.getClass(), "zoomLevel", -6602460430714339690L);
        setLongField(term3092, term3092.getClass(), "matrixWidth", 21047099434645581L);
        setLongField(term3092, term3092.getClass(), "matrixHeight", -8862087040734407227L);
        setLongField(term3092, term3092.getClass(), "tileWidth", -6394943900800506753L);
        setLongField(term3092, term3092.getClass(), "tileHeight", -4867941246533901410L);
        setDoubleField(term3092, term3092.getClass(), "pixelXSize", 0.6767213143579776);
        setDoubleField(term3092, term3092.getClass(), "pixelYSize", 0.48862955528902696);
        setDoubleField(term3092, term3092.getClass(), "top", 0.426231085465289);
        setDoubleField(term3092, term3092.getClass(), "left", 0.0027299293098262956);
        setField(term3092, term3092.getClass(), "scaleDenominator", term3153);
        term3155 = new Long(1044883697493326351L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3155;
        callMethod(klass, "setZoomLevel", argTypes, term3092, args);
    }

};


