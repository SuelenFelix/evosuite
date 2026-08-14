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
import java.lang.Long;

public class ExtTileMatrixSet_getId_16562150511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5188;

    public ExtTileMatrixSet_getId_16562150511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5226 = new Double(0.6533293939565151);
        Double term5228 = new Double(0.7361083671494018);
        Double term5230 = new Double(0.056643259984349825);
        Double term5232 = new Double(0.5984863932443171);
        Long term5234 = new Long(2135754395358000892L);
        term5188 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term5188, term5188.getClass(), "id", -5587528177305224828L);
        setField(term5188, term5188.getClass(), "tms", "PtirvZmsGt");
        setField(term5188, term5188.getClass(), "description", "HWkpTmtlrc");
        setField(term5188, term5188.getClass(), "uri", "hMmaoREuCK");
        setField(term5188, term5188.getClass(), "minX", term5226);
        setField(term5188, term5188.getClass(), "minY", term5228);
        setField(term5188, term5188.getClass(), "maxX", term5230);
        setField(term5188, term5188.getClass(), "maxY", term5232);
        setField(term5188, term5188.getClass(), "srs", null);
        setField(term5188, term5188.getClass(), "srsId", term5234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5188, args);
    }

};


