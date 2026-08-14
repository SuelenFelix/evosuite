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

public class ExtTileMatrix_setPixelYSize_82781481319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220;
     Object term4283;

    public ExtTileMatrix_setPixelYSize_82781481319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4260 = new Double(0.4630082575704827);
        Double term4262 = new Double(0.8732511635701926);
        Double term4264 = new Double(0.8977760608415547);
        Double term4266 = new Double(0.3107086749915061);
        Long term4268 = new Long(-1983291584002806658L);
        Long term4270 = new Long(5946780097489996391L);
        Double term4281 = new Double(0.18330246984174836);
        term4220 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term4222 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term4220, term4220.getClass(), "id", 6073193746616629086L);
        setLongField(term4222, term4222.getClass(), "id", -2463629530824341661L);
        setField(term4222, term4222.getClass(), "tms", "wfaXBpWAUH");
        setField(term4222, term4222.getClass(), "description", "VMeAzAHwZj");
        setField(term4222, term4222.getClass(), "uri", "PznxWXsZME");
        setField(term4222, term4222.getClass(), "minX", term4260);
        setField(term4222, term4222.getClass(), "minY", term4262);
        setField(term4222, term4222.getClass(), "maxX", term4264);
        setField(term4222, term4222.getClass(), "maxY", term4266);
        setField(term4222, term4222.getClass(), "srs", null);
        setField(term4222, term4222.getClass(), "srsId", term4268);
        setField(term4220, term4220.getClass(), "tms", term4222);
        setField(term4220, term4220.getClass(), "tmsId", term4270);
        setLongField(term4220, term4220.getClass(), "zoomLevel", 7800835025296877231L);
        setLongField(term4220, term4220.getClass(), "matrixWidth", -187772971269812453L);
        setLongField(term4220, term4220.getClass(), "matrixHeight", 468487103823886117L);
        setLongField(term4220, term4220.getClass(), "tileWidth", 4139034517298316285L);
        setLongField(term4220, term4220.getClass(), "tileHeight", 5797412846146719084L);
        setDoubleField(term4220, term4220.getClass(), "pixelXSize", 0.19625398866403143);
        setDoubleField(term4220, term4220.getClass(), "pixelYSize", 0.45069204793711093);
        setDoubleField(term4220, term4220.getClass(), "top", 0.9341364461850963);
        setDoubleField(term4220, term4220.getClass(), "left", 0.9022041121474429);
        setField(term4220, term4220.getClass(), "scaleDenominator", term4281);
        term4283 = new Double(0.6512870939318848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4283;
        callMethod(klass, "setPixelYSize", argTypes, term4220, args);
    }

};


