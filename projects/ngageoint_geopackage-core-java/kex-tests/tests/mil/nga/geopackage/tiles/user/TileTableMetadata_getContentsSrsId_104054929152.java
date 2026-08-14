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

public class TileTableMetadata_getContentsSrsId_104054929152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6580;

    public TileTableMetadata_getContentsSrsId_104054929152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6580 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6580, term6580.getClass(), "contentsBoundingBox", null);
        setField(term6580, term6580.getClass(), "contentsSrsId", null);
        setField(term6580, term6580.getClass(), "tileBoundingBox", null);
        setLongField(term6580, term6580.getClass(), "tileSrsId", 0L);
        setField(term6580, term6580.getClass(), "tableName", null);
        setField(term6580, term6580.getClass(), "dataType", null);
        setField(term6580, term6580.getClass(), "identifier", null);
        setField(term6580, term6580.getClass(), "description", null);
        setField(term6580, term6580.getClass(), "idColumnName", null);
        setBooleanField(term6580, term6580.getClass(), "autoincrement", false);
        setField(term6580, term6580.getClass(), "additionalColumns", null);
        setField(term6580, term6580.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentsSrsId", argTypes, term6580, args);
    }

};


