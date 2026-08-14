package mil.nga.geopackage.extension.coverage;

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
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class CoverageDataResults_getZoomLevel_18857013516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10114;

    public CoverageDataResults_getZoomLevel_18857013516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term10117 = new Double(0.9485929668765458);
        Double term10119 = new Double(0.5179319342588155);
        Double term10121 = new Double(0.25025774487844066);
        Double term10123 = new Double(0.1858089882752998);
        Double term10125 = new Double(0.2440697646709713);
        Double term10128 = new Double(0.7977455176064363);
        Double term10130 = new Double(0.5329919447422633);
        Double term10132 = new Double(0.7046974927834232);
        Double term10134 = new Double(0.6896952303224777);
        Double term10136 = new Double(0.6693176553622628);
        Double term10138 = new Double(0.2962868255626906);
        Double term10141 = new Double(0.25474180574060834);
        Double term10143 = new Double(0.9957585718901875);
        Double term10145 = new Double(0.16755811343784477);
        Double term10147 = new Double(0.9090793968999221);
        Double term10149 = new Double(0.25997329921466494);
        term10114 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults"));
        Object[] term10115 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Double"), 0).getClass(), 3);
        Object[] term10116 = (Object[]) newArray("java.lang.Double", 5);
        Object[] term10127 = (Object[]) newArray("java.lang.Double", 6);
        Object[] term10140 = (Object[]) newArray("java.lang.Double", 5);
        Object term10151 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setElement(term10116, 0, term10117);
        setElement(term10116, 1, term10119);
        setElement(term10116, 2, term10121);
        setElement(term10116, 3, term10123);
        setElement(term10116, 4, term10125);
        setElement(term10115, 0, term10116);
        setElement(term10127, 0, term10128);
        setElement(term10127, 1, term10130);
        setElement(term10127, 2, term10132);
        setElement(term10127, 3, term10134);
        setElement(term10127, 4, term10136);
        setElement(term10127, 5, term10138);
        setElement(term10115, 1, term10127);
        setElement(term10140, 0, term10141);
        setElement(term10140, 1, term10143);
        setElement(term10140, 2, term10145);
        setElement(term10140, 3, term10147);
        setElement(term10140, 4, term10149);
        setElement(term10115, 2, term10140);
        setField(term10114, term10114.getClass(), "values", term10115);
        setField(term10151, term10151.getClass(), "contents", null);
        setField(term10151, term10151.getClass(), "tableName", "QduALnDSVo");
        setLongField(term10151, term10151.getClass(), "zoomLevel", 5671808784468963649L);
        setLongField(term10151, term10151.getClass(), "matrixWidth", 2297097306706899827L);
        setLongField(term10151, term10151.getClass(), "matrixHeight", -900457279156388404L);
        setLongField(term10151, term10151.getClass(), "tileWidth", 1084801489398441516L);
        setLongField(term10151, term10151.getClass(), "tileHeight", 6273754186658578034L);
        setDoubleField(term10151, term10151.getClass(), "pixelXSize", 0.5407563152320285);
        setDoubleField(term10151, term10151.getClass(), "pixelYSize", 0.9485929668765458);
        setField(term10114, term10114.getClass(), "tileMatrix", term10151);
        setIntField(term10114, term10114.getClass(), "height", -73683645);
        setIntField(term10114, term10114.getClass(), "width", -226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevel", argTypes, term10114, args);
    }

};


