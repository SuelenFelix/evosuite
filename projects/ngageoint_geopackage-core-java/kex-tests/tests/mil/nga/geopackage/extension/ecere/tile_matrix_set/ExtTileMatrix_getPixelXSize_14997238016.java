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

public class ExtTileMatrix_getPixelXSize_14997238016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3939;

    public ExtTileMatrix_getPixelXSize_14997238016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3979 = new Double(0.5657654165545906);
        Double term3981 = new Double(0.6382060245198228);
        Double term3983 = new Double(0.1849998667663698);
        Double term3985 = new Double(0.36312400202399575);
        Long term3987 = new Long(-5963439350418910964L);
        Long term3989 = new Long(9013624480170062917L);
        Double term4000 = new Double(0.5485690030548175);
        term3939 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3941 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term3939, term3939.getClass(), "id", -7709317346333670618L);
        setLongField(term3941, term3941.getClass(), "id", -1964501434345816975L);
        setField(term3941, term3941.getClass(), "tms", "mLUZFTfjle");
        setField(term3941, term3941.getClass(), "description", "xIeFjkHkOe");
        setField(term3941, term3941.getClass(), "uri", "SdCKLMIYnX");
        setField(term3941, term3941.getClass(), "minX", term3979);
        setField(term3941, term3941.getClass(), "minY", term3981);
        setField(term3941, term3941.getClass(), "maxX", term3983);
        setField(term3941, term3941.getClass(), "maxY", term3985);
        setField(term3941, term3941.getClass(), "srs", null);
        setField(term3941, term3941.getClass(), "srsId", term3987);
        setField(term3939, term3939.getClass(), "tms", term3941);
        setField(term3939, term3939.getClass(), "tmsId", term3989);
        setLongField(term3939, term3939.getClass(), "zoomLevel", 4689907154423223972L);
        setLongField(term3939, term3939.getClass(), "matrixWidth", 8512025621149521819L);
        setLongField(term3939, term3939.getClass(), "matrixHeight", 2022482096970820459L);
        setLongField(term3939, term3939.getClass(), "tileWidth", 6315101499811179240L);
        setLongField(term3939, term3939.getClass(), "tileHeight", -3033337370154155851L);
        setDoubleField(term3939, term3939.getClass(), "pixelXSize", 0.623231822150205);
        setDoubleField(term3939, term3939.getClass(), "pixelYSize", 0.09037487793444521);
        setDoubleField(term3939, term3939.getClass(), "top", 0.6561919196821765);
        setDoubleField(term3939, term3939.getClass(), "left", 0.7330178886612495);
        setField(term3939, term3939.getClass(), "scaleDenominator", term4000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPixelXSize", argTypes, term3939, args);
    }

};


