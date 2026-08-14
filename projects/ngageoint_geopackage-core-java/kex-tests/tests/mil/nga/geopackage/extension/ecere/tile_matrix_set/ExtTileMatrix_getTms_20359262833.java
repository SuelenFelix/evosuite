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

public class ExtTileMatrix_getTms_20359262833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2642;

    public ExtTileMatrix_getTms_20359262833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2682 = new Double(0.7330178886612495);
        Double term2684 = new Double(0.7618164754425794);
        Double term2686 = new Double(0.7385589312559342);
        Double term2688 = new Double(0.7080134263823477);
        Long term2690 = new Long(-3842548265506930260L);
        Long term2692 = new Long(-5788180182343976541L);
        Double term2703 = new Double(0.6059734092898602);
        term2642 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term2644 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term2642, term2642.getClass(), "id", -1885698929232124806L);
        setLongField(term2644, term2644.getClass(), "id", 5731563613239387113L);
        setField(term2644, term2644.getClass(), "tms", "LvJFtLBaxj");
        setField(term2644, term2644.getClass(), "description", "PHvxnGHptP");
        setField(term2644, term2644.getClass(), "uri", "TimdotUuNC");
        setField(term2644, term2644.getClass(), "minX", term2682);
        setField(term2644, term2644.getClass(), "minY", term2684);
        setField(term2644, term2644.getClass(), "maxX", term2686);
        setField(term2644, term2644.getClass(), "maxY", term2688);
        setField(term2644, term2644.getClass(), "srs", null);
        setField(term2644, term2644.getClass(), "srsId", term2690);
        setField(term2642, term2642.getClass(), "tms", term2644);
        setField(term2642, term2642.getClass(), "tmsId", term2692);
        setLongField(term2642, term2642.getClass(), "zoomLevel", 3381333711768010594L);
        setLongField(term2642, term2642.getClass(), "matrixWidth", 3580984732036213717L);
        setLongField(term2642, term2642.getClass(), "matrixHeight", 5330761990446327930L);
        setLongField(term2642, term2642.getClass(), "tileWidth", -3954795081650780841L);
        setLongField(term2642, term2642.getClass(), "tileHeight", 3288791194263207397L);
        setDoubleField(term2642, term2642.getClass(), "pixelXSize", 0.3227335400819148);
        setDoubleField(term2642, term2642.getClass(), "pixelYSize", 0.43337207054070237);
        setDoubleField(term2642, term2642.getClass(), "top", 0.13246999699526574);
        setDoubleField(term2642, term2642.getClass(), "left", 0.9126850255993704);
        setField(term2642, term2642.getClass(), "scaleDenominator", term2703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTms", argTypes, term2642, args);
    }

};


