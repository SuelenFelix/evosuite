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

public class TileMatrixTable_getMinLevel_850033658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term838;

    public TileMatrixTable_getMinLevel_850033658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term889 = new Double(0.2852810965221698);
        Double term891 = new Double(0.6300849762307866);
        Double term893 = new Double(0.9737083944266686);
        Double term895 = new Double(0.0668892744806211);
        Long term897 = new Long(-872011222785455006L);
        Long term899 = new Long(-316468845751588286L);
        term838 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable"));
        Object term851 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setField(term838, term838.getClass(), "tableName", "AijpHYOFuy");
        setLongField(term851, term851.getClass(), "id", -4365849114644724155L);
        setField(term851, term851.getClass(), "tms", "SbAoxhfrkn");
        setField(term851, term851.getClass(), "description", "kuTXqwMtDB");
        setField(term851, term851.getClass(), "uri", "Ghbwtircqb");
        setField(term851, term851.getClass(), "minX", term889);
        setField(term851, term851.getClass(), "minY", term891);
        setField(term851, term851.getClass(), "maxX", term893);
        setField(term851, term851.getClass(), "maxY", term895);
        setField(term851, term851.getClass(), "srs", null);
        setField(term851, term851.getClass(), "srsId", term897);
        setField(term838, term838.getClass(), "tms", term851);
        setField(term838, term838.getClass(), "tmsId", term899);
        setLongField(term838, term838.getClass(), "maxLevel", 2486810210675247493L);
        setLongField(term838, term838.getClass(), "minLevel", 7009926388951271268L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinLevel", argTypes, term838, args);
    }

};


