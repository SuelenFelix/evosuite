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

public class TileMatrixTable_getTableName_18286616051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TileMatrixTable_getTableName_18286616051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term52 = new Double(0.13238746331190498);
        Double term54 = new Double(0.3455959125047594);
        Double term56 = new Double(0.5523635872663106);
        Double term58 = new Double(0.544608645520025);
        Long term60 = new Long(2442117782898005296L);
        Long term62 = new Long(6375119433582206027L);
        term1 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable"));
        Object term14 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setField(term1, term1.getClass(), "tableName", "PAEBtnZtTD");
        setLongField(term14, term14.getClass(), "id", 2442117782898005296L);
        setField(term14, term14.getClass(), "tms", "sjlJAEtRrb");
        setField(term14, term14.getClass(), "description", "MuLcgQHgqz");
        setField(term14, term14.getClass(), "uri", "xxtlPwDYFs");
        setField(term14, term14.getClass(), "minX", term52);
        setField(term14, term14.getClass(), "minY", term54);
        setField(term14, term14.getClass(), "maxX", term56);
        setField(term14, term14.getClass(), "maxY", term58);
        setField(term14, term14.getClass(), "srs", null);
        setField(term14, term14.getClass(), "srsId", term60);
        setField(term1, term1.getClass(), "tms", term14);
        setField(term1, term1.getClass(), "tmsId", term62);
        setLongField(term1, term1.getClass(), "maxLevel", 6375119433582206027L);
        setLongField(term1, term1.getClass(), "minLevel", -8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableName", argTypes, term1, args);
    }

};


