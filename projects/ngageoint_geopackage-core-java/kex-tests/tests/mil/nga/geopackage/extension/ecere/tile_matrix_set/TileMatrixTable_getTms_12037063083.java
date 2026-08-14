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

public class TileMatrixTable_getTms_12037063083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233;

    public TileMatrixTable_getTms_12037063083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term284 = new Double(0.6076495596892013);
        Double term286 = new Double(0.37773193782763337);
        Double term288 = new Double(0.8474802076607362);
        Double term290 = new Double(0.5183269973490326);
        Long term292 = new Long(5270370404989704783L);
        Long term294 = new Long(7411271909051562686L);
        term233 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable"));
        Object term246 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setField(term233, term233.getClass(), "tableName", "RMFIsYGgne");
        setLongField(term246, term246.getClass(), "id", 4872422362414183754L);
        setField(term246, term246.getClass(), "tms", "NRdvgJlhkX");
        setField(term246, term246.getClass(), "description", "uuaPigETmJ");
        setField(term246, term246.getClass(), "uri", "MxlszYVzRf");
        setField(term246, term246.getClass(), "minX", term284);
        setField(term246, term246.getClass(), "minY", term286);
        setField(term246, term246.getClass(), "maxX", term288);
        setField(term246, term246.getClass(), "maxY", term290);
        setField(term246, term246.getClass(), "srs", null);
        setField(term246, term246.getClass(), "srsId", term292);
        setField(term233, term233.getClass(), "tms", term246);
        setField(term233, term233.getClass(), "tmsId", term294);
        setLongField(term233, term233.getClass(), "maxLevel", 6811161968424632369L);
        setLongField(term233, term233.getClass(), "minLevel", -7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTms", argTypes, term233, args);
    }

};


