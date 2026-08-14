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

public class ExtTileMatrix_getTileWidth_134660937212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3563;

    public ExtTileMatrix_getTileWidth_134660937212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3603 = new Double(0.5597136413549945);
        Double term3605 = new Double(0.28292420012823627);
        Double term3607 = new Double(0.5407563152320285);
        Double term3609 = new Double(0.9485929668765458);
        Long term3611 = new Long(305759998609888272L);
        Long term3613 = new Long(-8654565919063661957L);
        Double term3624 = new Double(0.5179319342588155);
        term3563 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3565 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term3563, term3563.getClass(), "id", -8514728180792822493L);
        setLongField(term3565, term3565.getClass(), "id", 5315236285592892506L);
        setField(term3565, term3565.getClass(), "tms", "MvRIxilFMJ");
        setField(term3565, term3565.getClass(), "description", "iNwOJRBEjp");
        setField(term3565, term3565.getClass(), "uri", "XylxrMBraH");
        setField(term3565, term3565.getClass(), "minX", term3603);
        setField(term3565, term3565.getClass(), "minY", term3605);
        setField(term3565, term3565.getClass(), "maxX", term3607);
        setField(term3565, term3565.getClass(), "maxY", term3609);
        setField(term3565, term3565.getClass(), "srs", null);
        setField(term3565, term3565.getClass(), "srsId", term3611);
        setField(term3563, term3563.getClass(), "tms", term3565);
        setField(term3563, term3563.getClass(), "tmsId", term3613);
        setLongField(term3563, term3563.getClass(), "zoomLevel", -6969704322644192945L);
        setLongField(term3563, term3563.getClass(), "matrixWidth", -6685235643232255177L);
        setLongField(term3563, term3563.getClass(), "matrixHeight", -5656664340499957324L);
        setLongField(term3563, term3563.getClass(), "tileWidth", -5460517064177800852L);
        setLongField(term3563, term3563.getClass(), "tileHeight", -5242567610844514867L);
        setDoubleField(term3563, term3563.getClass(), "pixelXSize", 0.11577948268926874);
        setDoubleField(term3563, term3563.getClass(), "pixelYSize", 0.5617009352394552);
        setDoubleField(term3563, term3563.getClass(), "top", 0.09067063848644474);
        setDoubleField(term3563, term3563.getClass(), "left", 0.268304014379393);
        setField(term3563, term3563.getClass(), "scaleDenominator", term3624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileWidth", argTypes, term3563, args);
    }

};


