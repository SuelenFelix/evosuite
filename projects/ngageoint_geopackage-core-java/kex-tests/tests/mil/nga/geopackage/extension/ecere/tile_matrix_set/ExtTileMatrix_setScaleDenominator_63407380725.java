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

public class ExtTileMatrix_setScaleDenominator_63407380725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4784;
     Object term4847;

    public ExtTileMatrix_setScaleDenominator_63407380725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4824 = new Double(0.01784667720947175);
        Double term4826 = new Double(0.4395312828193261);
        Double term4828 = new Double(0.5715204226647931);
        Double term4830 = new Double(0.6420798930164424);
        Long term4832 = new Long(3133860696238261492L);
        Long term4834 = new Long(7247160664318067468L);
        Double term4845 = new Double(0.0011409626665044303);
        term4784 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term4786 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term4784, term4784.getClass(), "id", 3731931947533293029L);
        setLongField(term4786, term4786.getClass(), "id", 9214973322210954344L);
        setField(term4786, term4786.getClass(), "tms", "XkIoWJRNwN");
        setField(term4786, term4786.getClass(), "description", "aNWLJdrZMq");
        setField(term4786, term4786.getClass(), "uri", "HHmNoYxIGj");
        setField(term4786, term4786.getClass(), "minX", term4824);
        setField(term4786, term4786.getClass(), "minY", term4826);
        setField(term4786, term4786.getClass(), "maxX", term4828);
        setField(term4786, term4786.getClass(), "maxY", term4830);
        setField(term4786, term4786.getClass(), "srs", null);
        setField(term4786, term4786.getClass(), "srsId", term4832);
        setField(term4784, term4784.getClass(), "tms", term4786);
        setField(term4784, term4784.getClass(), "tmsId", term4834);
        setLongField(term4784, term4784.getClass(), "zoomLevel", 3662777917800385964L);
        setLongField(term4784, term4784.getClass(), "matrixWidth", -7005300544167632229L);
        setLongField(term4784, term4784.getClass(), "matrixHeight", -278716491237139968L);
        setLongField(term4784, term4784.getClass(), "tileWidth", -629491722907628764L);
        setLongField(term4784, term4784.getClass(), "tileHeight", -5552123402871285352L);
        setDoubleField(term4784, term4784.getClass(), "pixelXSize", 0.07901636960861558);
        setDoubleField(term4784, term4784.getClass(), "pixelYSize", 0.18717846301066243);
        setDoubleField(term4784, term4784.getClass(), "top", 0.5335953039331021);
        setDoubleField(term4784, term4784.getClass(), "left", 0.5725602309856443);
        setField(term4784, term4784.getClass(), "scaleDenominator", term4845);
        term4847 = new Double(0.5195852993308188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term4847;
        callMethod(klass, "setScaleDenominator", argTypes, term4784, args);
    }

};


