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
import java.lang.Double;

public class ExtTileMatrix_setLeft_196005969649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5139;
     Object term5150;

    public ExtTileMatrix_setLeft_196005969649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5139 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        setLongField(term5139, term5139.getClass(), "id", 0L);
        setField(term5139, term5139.getClass(), "tms", null);
        setField(term5139, term5139.getClass(), "tmsId", null);
        setLongField(term5139, term5139.getClass(), "zoomLevel", 0L);
        setLongField(term5139, term5139.getClass(), "matrixWidth", 0L);
        setLongField(term5139, term5139.getClass(), "matrixHeight", 0L);
        setLongField(term5139, term5139.getClass(), "tileWidth", 0L);
        setLongField(term5139, term5139.getClass(), "tileHeight", 0L);
        setDoubleField(term5139, term5139.getClass(), "pixelXSize", 0.0);
        setDoubleField(term5139, term5139.getClass(), "pixelYSize", 0.0);
        setDoubleField(term5139, term5139.getClass(), "top", 0.0);
        setDoubleField(term5139, term5139.getClass(), "left", 0.0);
        setField(term5139, term5139.getClass(), "scaleDenominator", null);
        term5150 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term5150;
        callMethod(klass, "setLeft", argTypes, term5139, args);
    }

};


