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

public class TileMatrixTable_getMaxLevel_17379646176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626;

    public TileMatrixTable_getMaxLevel_17379646176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term677 = new Double(0.13481025392611334);
        Double term679 = new Double(0.3800088629986428);
        Double term681 = new Double(0.5840714198152577);
        Double term683 = new Double(0.7559240768573477);
        Long term685 = new Long(-8885298608300233488L);
        Long term687 = new Long(-4325723315152823407L);
        term626 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable"));
        Object term639 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setField(term626, term626.getClass(), "tableName", "BYqFIqCKAV");
        setLongField(term639, term639.getClass(), "id", -316468845751588286L);
        setField(term639, term639.getClass(), "tms", "vrQLuWIDJX");
        setField(term639, term639.getClass(), "description", "flxyYxBRtu");
        setField(term639, term639.getClass(), "uri", "OclPbYPkcH");
        setField(term639, term639.getClass(), "minX", term677);
        setField(term639, term639.getClass(), "minY", term679);
        setField(term639, term639.getClass(), "maxX", term681);
        setField(term639, term639.getClass(), "maxY", term683);
        setField(term639, term639.getClass(), "srs", null);
        setField(term639, term639.getClass(), "srsId", term685);
        setField(term626, term626.getClass(), "tms", term639);
        setField(term626, term626.getClass(), "tmsId", term687);
        setLongField(term626, term626.getClass(), "maxLevel", 5127676408959197577L);
        setLongField(term626, term626.getClass(), "minLevel", -6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLevel", argTypes, term626, args);
    }

};


