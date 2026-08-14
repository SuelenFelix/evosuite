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

public class TileMatrixTable_setMinLevel_6927560619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943;
     Object term1008;

    public TileMatrixTable_setMinLevel_6927560619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term994 = new Double(0.3587267442738795);
        Double term996 = new Double(0.07802449704920456);
        Double term998 = new Double(0.5279279537140873);
        Double term1000 = new Double(0.3202192021706908);
        Long term1002 = new Long(5127676408959197577L);
        Long term1004 = new Long(-6573104506744284592L);
        term943 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable"));
        Object term956 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setField(term943, term943.getClass(), "tableName", "xrwlQZdwCp");
        setLongField(term956, term956.getClass(), "id", -7672528020740371001L);
        setField(term956, term956.getClass(), "tms", "IDCWpPLRkE");
        setField(term956, term956.getClass(), "description", "nyiiPDVjAc");
        setField(term956, term956.getClass(), "uri", "aKnKipADSo");
        setField(term956, term956.getClass(), "minX", term994);
        setField(term956, term956.getClass(), "minY", term996);
        setField(term956, term956.getClass(), "maxX", term998);
        setField(term956, term956.getClass(), "maxY", term1000);
        setField(term956, term956.getClass(), "srs", null);
        setField(term956, term956.getClass(), "srsId", term1002);
        setField(term943, term943.getClass(), "tms", term956);
        setField(term943, term943.getClass(), "tmsId", term1004);
        setLongField(term943, term943.getClass(), "maxLevel", -4502405999831680926L);
        setLongField(term943, term943.getClass(), "minLevel", 1967728129628047933L);
        term1008 = new Long(2120084523938730454L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1008;
        callMethod(klass, "setMinLevel", argTypes, term943, args);
    }

};


