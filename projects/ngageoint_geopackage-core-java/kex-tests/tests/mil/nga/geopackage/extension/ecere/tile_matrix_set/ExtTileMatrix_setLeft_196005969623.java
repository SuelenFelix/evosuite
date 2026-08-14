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

public class ExtTileMatrix_setLeft_196005969623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4596;
     Object term4659;

    public ExtTileMatrix_setLeft_196005969623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4636 = new Double(0.7808234535616719);
        Double term4638 = new Double(0.9772425797816359);
        Double term4640 = new Double(0.32009327814110977);
        Double term4642 = new Double(0.9013029318694921);
        Long term4644 = new Long(6689117472719450333L);
        Long term4646 = new Long(5836128569274066678L);
        Double term4657 = new Double(0.1755673139619638);
        term4596 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term4598 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term4596, term4596.getClass(), "id", -3279534582096707294L);
        setLongField(term4598, term4598.getClass(), "id", -6490254947459640565L);
        setField(term4598, term4598.getClass(), "tms", "WHcwFgsGFC");
        setField(term4598, term4598.getClass(), "description", "HzqpegHiRq");
        setField(term4598, term4598.getClass(), "uri", "jwsfVjMoJT");
        setField(term4598, term4598.getClass(), "minX", term4636);
        setField(term4598, term4598.getClass(), "minY", term4638);
        setField(term4598, term4598.getClass(), "maxX", term4640);
        setField(term4598, term4598.getClass(), "maxY", term4642);
        setField(term4598, term4598.getClass(), "srs", null);
        setField(term4598, term4598.getClass(), "srsId", term4644);
        setField(term4596, term4596.getClass(), "tms", term4598);
        setField(term4596, term4596.getClass(), "tmsId", term4646);
        setLongField(term4596, term4596.getClass(), "zoomLevel", -7001094993638840490L);
        setLongField(term4596, term4596.getClass(), "matrixWidth", 3077284143733577490L);
        setLongField(term4596, term4596.getClass(), "matrixHeight", 4458302820344896046L);
        setLongField(term4596, term4596.getClass(), "tileWidth", -432424084523104253L);
        setLongField(term4596, term4596.getClass(), "tileHeight", 6150186973473930616L);
        setDoubleField(term4596, term4596.getClass(), "pixelXSize", 0.7859316615744082);
        setDoubleField(term4596, term4596.getClass(), "pixelYSize", 0.6428742553484879);
        setDoubleField(term4596, term4596.getClass(), "top", 0.6584165706677267);
        setDoubleField(term4596, term4596.getClass(), "left", 0.44268490778872205);
        setField(term4596, term4596.getClass(), "scaleDenominator", term4657);
        term4659 = new Double(0.7507333108648018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4659;
        callMethod(klass, "setLeft", argTypes, term4596, args);
    }

};


