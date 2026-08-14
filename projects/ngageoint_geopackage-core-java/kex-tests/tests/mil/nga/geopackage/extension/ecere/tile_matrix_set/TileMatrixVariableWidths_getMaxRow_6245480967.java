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

public class TileMatrixVariableWidths_getMaxRow_6245480967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1772;

    public TileMatrixVariableWidths_getMaxRow_6245480967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1814 = new Double(0.6047137830113202);
        Double term1816 = new Double(0.6767213143579776);
        Double term1818 = new Double(0.48862955528902696);
        Double term1820 = new Double(0.426231085465289);
        Long term1822 = new Long(-6823727938421990489L);
        Long term1824 = new Long(-484994522244390100L);
        Double term1835 = new Double(0.0027299293098262956);
        term1772 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term1774 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term1776 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term1772, term1772.getClass(), "id", -685023850445639859L);
        setLongField(term1774, term1774.getClass(), "id", -6950146046121430355L);
        setLongField(term1776, term1776.getClass(), "id", 1667122142089513324L);
        setField(term1776, term1776.getClass(), "tms", "dEnhdmILtU");
        setField(term1776, term1776.getClass(), "description", "hoicvmsovO");
        setField(term1776, term1776.getClass(), "uri", "eqJfYWRaEL");
        setField(term1776, term1776.getClass(), "minX", term1814);
        setField(term1776, term1776.getClass(), "minY", term1816);
        setField(term1776, term1776.getClass(), "maxX", term1818);
        setField(term1776, term1776.getClass(), "maxY", term1820);
        setField(term1776, term1776.getClass(), "srs", null);
        setField(term1776, term1776.getClass(), "srsId", term1822);
        setField(term1774, term1774.getClass(), "tms", term1776);
        setField(term1774, term1774.getClass(), "tmsId", term1824);
        setLongField(term1774, term1774.getClass(), "zoomLevel", -6342139649364011743L);
        setLongField(term1774, term1774.getClass(), "matrixWidth", -4924950707540628022L);
        setLongField(term1774, term1774.getClass(), "matrixHeight", -4393710401270724527L);
        setLongField(term1774, term1774.getClass(), "tileWidth", -4822736661741380518L);
        setLongField(term1774, term1774.getClass(), "tileHeight", -5386201758403679145L);
        setDoubleField(term1774, term1774.getClass(), "pixelXSize", 0.10667076642995188);
        setDoubleField(term1774, term1774.getClass(), "pixelYSize", 0.11493000848982304);
        setDoubleField(term1774, term1774.getClass(), "top", 0.37161417339133307);
        setDoubleField(term1774, term1774.getClass(), "left", 0.6805867182029153);
        setField(term1774, term1774.getClass(), "scaleDenominator", term1835);
        setField(term1772, term1772.getClass(), "tm", term1774);
        setLongField(term1772, term1772.getClass(), "tmsId", -7268507582722666254L);
        setLongField(term1772, term1772.getClass(), "maxRow", 5671808784468963649L);
        setLongField(term1772, term1772.getClass(), "minRow", 2297097306706899827L);
        setLongField(term1772, term1772.getClass(), "coalesce", -900457279156388404L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxRow", argTypes, term1772, args);
    }

};


