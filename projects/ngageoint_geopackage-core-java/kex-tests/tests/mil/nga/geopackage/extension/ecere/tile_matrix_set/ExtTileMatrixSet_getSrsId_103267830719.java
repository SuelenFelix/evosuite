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
import java.lang.Double;
import java.lang.Long;

public class ExtTileMatrixSet_getSrsId_103267830719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6668;

    public ExtTileMatrixSet_getSrsId_103267830719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6706 = new Double(0.604465128384297);
        Double term6708 = new Double(0.5180566811475131);
        Double term6710 = new Double(0.6773553630262286);
        Double term6712 = new Double(0.0416412064984476);
        Long term6714 = new Long(-6342139649364011743L);
        term6668 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6668, term6668.getClass(), "id", 9062006526792682783L);
        setField(term6668, term6668.getClass(), "tms", "tlQSNgTkQX");
        setField(term6668, term6668.getClass(), "description", "PCipZnmBOF");
        setField(term6668, term6668.getClass(), "uri", "zcorEihhLK");
        setField(term6668, term6668.getClass(), "minX", term6706);
        setField(term6668, term6668.getClass(), "minY", term6708);
        setField(term6668, term6668.getClass(), "maxX", term6710);
        setField(term6668, term6668.getClass(), "maxY", term6712);
        setField(term6668, term6668.getClass(), "srs", null);
        setField(term6668, term6668.getClass(), "srsId", term6714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSrsId", argTypes, term6668, args);
    }

};


