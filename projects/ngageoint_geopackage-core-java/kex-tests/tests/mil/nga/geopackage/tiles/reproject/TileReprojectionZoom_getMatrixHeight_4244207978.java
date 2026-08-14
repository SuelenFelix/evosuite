package mil.nga.geopackage.tiles.reproject;

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
import static mil.nga.geopackage.tiles.reproject.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class TileReprojectionZoom_getMatrixHeight_4244207978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;

    public TileReprojectionZoom_getMatrixHeight_4244207978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term249 = new Long(-3842548265506930260L);
        Long term251 = new Long(-5788180182343976541L);
        Long term253 = new Long(2936323121573284007L);
        Long term255 = new Long(-1154553077993834885L);
        Long term257 = new Long(-2850532706972744550L);
        term247 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term247, term247.getClass(), "zoom", 1233889271256172047L);
        setField(term247, term247.getClass(), "toZoom", term249);
        setField(term247, term247.getClass(), "matrixWidth", term251);
        setField(term247, term247.getClass(), "matrixHeight", term253);
        setField(term247, term247.getClass(), "tileWidth", term255);
        setField(term247, term247.getClass(), "tileHeight", term257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatrixHeight", argTypes, term247, args);
    }

};


