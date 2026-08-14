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

public class TileTableMetadata_getContentsSrsId_104054929123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5726;

    public TileTableMetadata_getContentsSrsId_104054929123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5727 = new Long(-2585684163342970173L);
        ArrayList term5791 = new ArrayList();
        ArrayList term5795 = new ArrayList();
        term5726 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term5726, term5726.getClass(), "contentsBoundingBox", null);
        setField(term5726, term5726.getClass(), "contentsSrsId", term5727);
        setField(term5726, term5726.getClass(), "tileBoundingBox", null);
        setLongField(term5726, term5726.getClass(), "tileSrsId", -1L);
        setField(term5726, term5726.getClass(), "tableName", "nRvKihUSPj");
        setField(term5726, term5726.getClass(), "dataType", "BbNeQJpYPr");
        setField(term5726, term5726.getClass(), "identifier", "riMtzCoxNj");
        setField(term5726, term5726.getClass(), "description", "YAXkVjQZcV");
        setField(term5726, term5726.getClass(), "idColumnName", "pumvwBWvpy");
        setBooleanField(term5726, term5726.getClass(), "autoincrement", true);
        setField(term5726, term5726.getClass(), "additionalColumns", term5791);
        setField(term5726, term5726.getClass(), "columns", term5795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentsSrsId", argTypes, term5726, args);
    }

};


