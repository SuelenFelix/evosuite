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

public class TileMatrixVariableWidths_setMinRow_180927093210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2071;
     Object term2140;

    public TileMatrixVariableWidths_setMinRow_180927093210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2113 = new Double(0.3626177854778667);
        Double term2115 = new Double(0.3163771663728089);
        Double term2117 = new Double(0.8819646072665548);
        Double term2119 = new Double(0.5412182593116958);
        Long term2121 = new Long(5907001541142728739L);
        Long term2123 = new Long(4178434741742309755L);
        Double term2134 = new Double(0.16988691727397487);
        term2071 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term2073 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term2075 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term2071, term2071.getClass(), "id", 138235087558060686L);
        setLongField(term2073, term2073.getClass(), "id", 5381386339318883012L);
        setLongField(term2075, term2075.getClass(), "id", -1333707622307134180L);
        setField(term2075, term2075.getClass(), "tms", "whBvTVIIlC");
        setField(term2075, term2075.getClass(), "description", "IgRJUzaCwW");
        setField(term2075, term2075.getClass(), "uri", "JUmudUmaaV");
        setField(term2075, term2075.getClass(), "minX", term2113);
        setField(term2075, term2075.getClass(), "minY", term2115);
        setField(term2075, term2075.getClass(), "maxX", term2117);
        setField(term2075, term2075.getClass(), "maxY", term2119);
        setField(term2075, term2075.getClass(), "srs", null);
        setField(term2075, term2075.getClass(), "srsId", term2121);
        setField(term2073, term2073.getClass(), "tms", term2075);
        setField(term2073, term2073.getClass(), "tmsId", term2123);
        setLongField(term2073, term2073.getClass(), "zoomLevel", -4360569253593381888L);
        setLongField(term2073, term2073.getClass(), "matrixWidth", 1457594663983990440L);
        setLongField(term2073, term2073.getClass(), "matrixHeight", 3452833434644634217L);
        setLongField(term2073, term2073.getClass(), "tileWidth", -8603648071751666348L);
        setLongField(term2073, term2073.getClass(), "tileHeight", -7884871963229073324L);
        setDoubleField(term2073, term2073.getClass(), "pixelXSize", 0.22651340641904605);
        setDoubleField(term2073, term2073.getClass(), "pixelYSize", 0.8878841294187743);
        setDoubleField(term2073, term2073.getClass(), "top", 0.6588948704887806);
        setDoubleField(term2073, term2073.getClass(), "left", 0.6397214730945112);
        setField(term2073, term2073.getClass(), "scaleDenominator", term2134);
        setField(term2071, term2071.getClass(), "tm", term2073);
        setLongField(term2071, term2071.getClass(), "tmsId", -8649738738252714180L);
        setLongField(term2071, term2071.getClass(), "maxRow", -7278883608542636188L);
        setLongField(term2071, term2071.getClass(), "minRow", -1539859611880912454L);
        setLongField(term2071, term2071.getClass(), "coalesce", 4100236067313034103L);
        term2140 = new Long(1195529027276497124L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2140;
        callMethod(klass, "setMinRow", argTypes, term2071, args);
    }

};


