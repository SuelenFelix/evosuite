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

public class ExtTileMatrix_setMatrixHeight_211215120211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3468;
     Object term3531;

    public ExtTileMatrix_setMatrixHeight_211215120211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3508 = new Double(0.22227423914231126);
        Double term3510 = new Double(0.06480976831423468);
        Double term3512 = new Double(0.8490790645379176);
        Double term3514 = new Double(0.23129126164078717);
        Long term3516 = new Long(414749984815662075L);
        Long term3518 = new Long(463622836963501975L);
        Double term3529 = new Double(0.6047138318674447);
        term3468 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3470 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term3468, term3468.getClass(), "id", 8708846223293804408L);
        setLongField(term3470, term3470.getClass(), "id", -2986201902216133814L);
        setField(term3470, term3470.getClass(), "tms", "OEXDRUKcFl");
        setField(term3470, term3470.getClass(), "description", "RYdKCNNMBR");
        setField(term3470, term3470.getClass(), "uri", "yGtHPyvYiQ");
        setField(term3470, term3470.getClass(), "minX", term3508);
        setField(term3470, term3470.getClass(), "minY", term3510);
        setField(term3470, term3470.getClass(), "maxX", term3512);
        setField(term3470, term3470.getClass(), "maxY", term3514);
        setField(term3470, term3470.getClass(), "srs", null);
        setField(term3470, term3470.getClass(), "srsId", term3516);
        setField(term3468, term3468.getClass(), "tms", term3470);
        setField(term3468, term3468.getClass(), "tmsId", term3518);
        setLongField(term3468, term3468.getClass(), "zoomLevel", 4255811647459029682L);
        setLongField(term3468, term3468.getClass(), "matrixWidth", 8000844860910174690L);
        setLongField(term3468, term3468.getClass(), "matrixHeight", 2209808079059619773L);
        setLongField(term3468, term3468.getClass(), "tileWidth", 8403492202041709902L);
        setLongField(term3468, term3468.getClass(), "tileHeight", -113028659747841511L);
        setDoubleField(term3468, term3468.getClass(), "pixelXSize", 0.8819646072665548);
        setDoubleField(term3468, term3468.getClass(), "pixelYSize", 0.5412182593116958);
        setDoubleField(term3468, term3468.getClass(), "top", 0.16988691727397487);
        setDoubleField(term3468, term3468.getClass(), "left", 0.39286935532362843);
        setField(term3468, term3468.getClass(), "scaleDenominator", term3529);
        term3531 = new Long(7271112616766426991L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3531;
        callMethod(klass, "setMatrixHeight", argTypes, term3468, args);
    }

};


