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
import java.lang.Integer;

public class CoverageDataResults_getValue_16343570265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10054;
     Object term10100;
     Object term10102;

    public CoverageDataResults_getValue_16343570265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term10057 = new Double(0.6054109236809134);
        Double term10060 = new Double(0.9165240441138934);
        Double term10062 = new Double(0.22227423914231126);
        Double term10064 = new Double(0.06480976831423468);
        Double term10066 = new Double(0.8490790645379176);
        Double term10068 = new Double(0.23129126164078717);
        Double term10070 = new Double(0.6047138318674447);
        Double term10072 = new Double(0.5597136413549945);
        Double term10074 = new Double(0.28292420012823627);
        Double term10076 = new Double(0.5407563152320285);
        term10054 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults"));
        Object[] term10055 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Double"), 0).getClass(), 2);
        Object[] term10056 = (Object[]) newArray("java.lang.Double", 1);
        Object[] term10059 = (Object[]) newArray("java.lang.Double", 9);
        Object term10078 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setElement(term10056, 0, term10057);
        setElement(term10055, 0, term10056);
        setElement(term10059, 0, term10060);
        setElement(term10059, 1, term10062);
        setElement(term10059, 2, term10064);
        setElement(term10059, 3, term10066);
        setElement(term10059, 4, term10068);
        setElement(term10059, 5, term10070);
        setElement(term10059, 6, term10072);
        setElement(term10059, 7, term10074);
        setElement(term10059, 8, term10076);
        setElement(term10055, 1, term10059);
        setField(term10054, term10054.getClass(), "values", term10055);
        setField(term10078, term10078.getClass(), "contents", null);
        setField(term10078, term10078.getClass(), "tableName", "hOncybyCAH");
        setLongField(term10078, term10078.getClass(), "zoomLevel", -4924950707540628022L);
        setLongField(term10078, term10078.getClass(), "matrixWidth", -4393710401270724527L);
        setLongField(term10078, term10078.getClass(), "matrixHeight", -4822736661741380518L);
        setLongField(term10078, term10078.getClass(), "tileWidth", -5386201758403679145L);
        setLongField(term10078, term10078.getClass(), "tileHeight", -7268507582722666254L);
        setDoubleField(term10078, term10078.getClass(), "pixelXSize", 0.5597136413549945);
        setDoubleField(term10078, term10078.getClass(), "pixelYSize", 0.28292420012823627);
        setField(term10054, term10054.getClass(), "tileMatrix", term10078);
        setIntField(term10054, term10054.getClass(), "height", -1275173084);
        setIntField(term10054, term10054.getClass(), "width", -244121226);
        term10100 = new Integer(-203030934);
        term10102 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10100;
        args[1] = term10102;
        callMethod(klass, "getValue", argTypes, term10054, args);
    }

};


