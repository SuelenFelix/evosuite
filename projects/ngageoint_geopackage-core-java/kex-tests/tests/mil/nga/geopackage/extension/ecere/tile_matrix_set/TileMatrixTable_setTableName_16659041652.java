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

public class TileMatrixTable_setTableName_16659041652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;

    public TileMatrixTable_setTableName_16659041652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term157 = new Double(0.28570734989730284);
        Double term159 = new Double(0.40176586625454525);
        Double term161 = new Double(0.2641345529914265);
        Double term163 = new Double(0.36923381893433327);
        Long term165 = new Long(-8257434502486459194L);
        Long term167 = new Long(-8400487765614892086L);
        term106 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable"));
        Object term119 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setField(term106, term106.getClass(), "tableName", "jJCZpVmanW");
        setLongField(term119, term119.getClass(), "id", -8400487765614892086L);
        setField(term119, term119.getClass(), "tms", "EGtDIRbSSb");
        setField(term119, term119.getClass(), "description", "SzjVpOQTyS");
        setField(term119, term119.getClass(), "uri", "MjGYSRKTNF");
        setField(term119, term119.getClass(), "minX", term157);
        setField(term119, term119.getClass(), "minY", term159);
        setField(term119, term119.getClass(), "maxX", term161);
        setField(term119, term119.getClass(), "maxY", term163);
        setField(term119, term119.getClass(), "srs", null);
        setField(term119, term119.getClass(), "srsId", term165);
        setField(term106, term106.getClass(), "tms", term119);
        setField(term106, term106.getClass(), "tmsId", term167);
        setLongField(term106, term106.getClass(), "maxLevel", 5270370404989704783L);
        setLongField(term106, term106.getClass(), "minLevel", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "setTableName", argTypes, term106, args);
    }

};


