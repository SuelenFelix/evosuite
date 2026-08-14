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

public class CoverageDataResults_getValues_20598389071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9820;

    public CoverageDataResults_getValues_20598389071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term9823 = new Double(0.09037487793444521);
        Double term9825 = new Double(0.6561919196821765);
        Double term9827 = new Double(0.7330178886612495);
        Double term9829 = new Double(0.7618164754425794);
        Double term9831 = new Double(0.7385589312559342);
        Double term9833 = new Double(0.7080134263823477);
        Double term9836 = new Double(0.6059734092898602);
        Double term9838 = new Double(0.3074693824288357);
        Double term9840 = new Double(0.1245258965512791);
        Double term9842 = new Double(0.9511861072660375);
        Double term9844 = new Double(0.05880719443135807);
        Double term9846 = new Double(0.34010089048558567);
        Double term9848 = new Double(0.19625398866403143);
        term9820 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults"));
        Object[] term9821 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Double"), 0).getClass(), 2);
        Object[] term9822 = (Object[]) newArray("java.lang.Double", 6);
        Object[] term9835 = (Object[]) newArray("java.lang.Double", 7);
        Object term9850 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setElement(term9822, 0, term9823);
        setElement(term9822, 1, term9825);
        setElement(term9822, 2, term9827);
        setElement(term9822, 3, term9829);
        setElement(term9822, 4, term9831);
        setElement(term9822, 5, term9833);
        setElement(term9821, 0, term9822);
        setElement(term9835, 0, term9836);
        setElement(term9835, 1, term9838);
        setElement(term9835, 2, term9840);
        setElement(term9835, 3, term9842);
        setElement(term9835, 4, term9844);
        setElement(term9835, 5, term9846);
        setElement(term9835, 6, term9848);
        setElement(term9821, 1, term9835);
        setField(term9820, term9820.getClass(), "values", term9821);
        setField(term9850, term9850.getClass(), "contents", null);
        setField(term9850, term9850.getClass(), "tableName", "tlzpzIjMib");
        setLongField(term9850, term9850.getClass(), "zoomLevel", 7247160664318067468L);
        setLongField(term9850, term9850.getClass(), "matrixWidth", 2135754395358000892L);
        setLongField(term9850, term9850.getClass(), "matrixHeight", -8085190702504231560L);
        setLongField(term9850, term9850.getClass(), "tileWidth", 1672578078364590450L);
        setLongField(term9850, term9850.getClass(), "tileHeight", 4949335493504695457L);
        setDoubleField(term9850, term9850.getClass(), "pixelXSize", 0.5310967137636303);
        setDoubleField(term9850, term9850.getClass(), "pixelYSize", 0.6054109236809134);
        setField(term9820, term9820.getClass(), "tileMatrix", term9850);
        setIntField(term9820, term9820.getClass(), "height", -655067527);
        setIntField(term9820, term9820.getClass(), "width", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValues", argTypes, term9820, args);
    }

};


