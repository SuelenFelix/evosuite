package mil.nga.geopackage.tiles.user;

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
import static mil.nga.geopackage.tiles.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class TileTableMetadata_getTileSrsId_128961503927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6220;

    public TileTableMetadata_getTileSrsId_128961503927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6221 = new Long(-7672528020740371001L);
        ArrayList term6285 = new ArrayList();
        ArrayList term6289 = new ArrayList();
        term6220 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6220, term6220.getClass(), "contentsBoundingBox", null);
        setField(term6220, term6220.getClass(), "contentsSrsId", term6221);
        setField(term6220, term6220.getClass(), "tileBoundingBox", null);
        setLongField(term6220, term6220.getClass(), "tileSrsId", -1L);
        setField(term6220, term6220.getClass(), "tableName", "fzeqPnzpnt");
        setField(term6220, term6220.getClass(), "dataType", "RxbhrFBjkO");
        setField(term6220, term6220.getClass(), "identifier", "aanyiAOJCl");
        setField(term6220, term6220.getClass(), "description", "VDokbsCuqq");
        setField(term6220, term6220.getClass(), "idColumnName", "xClUIcPECX");
        setBooleanField(term6220, term6220.getClass(), "autoincrement", true);
        setField(term6220, term6220.getClass(), "additionalColumns", term6285);
        setField(term6220, term6220.getClass(), "columns", term6289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileSrsId", argTypes, term6220, args);
    }

};


