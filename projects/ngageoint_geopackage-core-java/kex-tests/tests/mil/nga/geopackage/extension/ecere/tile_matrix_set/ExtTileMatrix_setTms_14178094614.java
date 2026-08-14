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

public class ExtTileMatrix_setTms_14178094614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2735;
     Object term2798;

    public ExtTileMatrix_setTms_14178094614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2775 = new Double(0.3074693824288357);
        Double term2777 = new Double(0.1245258965512791);
        Double term2779 = new Double(0.9511861072660375);
        Double term2781 = new Double(0.05880719443135807);
        Long term2783 = new Long(2936323121573284007L);
        Long term2785 = new Long(-1154553077993834885L);
        Double term2796 = new Double(0.34010089048558567);
        term2735 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term2737 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term2735, term2735.getClass(), "id", 3288941170644426558L);
        setLongField(term2737, term2737.getClass(), "id", -8338004844694486146L);
        setField(term2737, term2737.getClass(), "tms", "PkWMRdJcBb");
        setField(term2737, term2737.getClass(), "description", "jSpAteRute");
        setField(term2737, term2737.getClass(), "uri", "swZVeJAxjt");
        setField(term2737, term2737.getClass(), "minX", term2775);
        setField(term2737, term2737.getClass(), "minY", term2777);
        setField(term2737, term2737.getClass(), "maxX", term2779);
        setField(term2737, term2737.getClass(), "maxY", term2781);
        setField(term2737, term2737.getClass(), "srs", null);
        setField(term2737, term2737.getClass(), "srsId", term2783);
        setField(term2735, term2735.getClass(), "tms", term2737);
        setField(term2735, term2735.getClass(), "tmsId", term2785);
        setLongField(term2735, term2735.getClass(), "zoomLevel", 6426732259596412988L);
        setLongField(term2735, term2735.getClass(), "matrixWidth", 185793058502220865L);
        setLongField(term2735, term2735.getClass(), "matrixHeight", -7698746988132548371L);
        setLongField(term2735, term2735.getClass(), "tileWidth", 2145420811068634601L);
        setLongField(term2735, term2735.getClass(), "tileHeight", 2191130532479601175L);
        setDoubleField(term2735, term2735.getClass(), "pixelXSize", 0.11179067076100713);
        setDoubleField(term2735, term2735.getClass(), "pixelYSize", 0.5306473989087822);
        setDoubleField(term2735, term2735.getClass(), "top", 0.022483645678509023);
        setDoubleField(term2735, term2735.getClass(), "left", 0.025133051616627267);
        setField(term2735, term2735.getClass(), "scaleDenominator", term2796);
        Double term2836 = new Double(0.19625398866403143);
        Double term2838 = new Double(0.45069204793711093);
        Double term2840 = new Double(0.9341364461850963);
        Double term2842 = new Double(0.9022041121474429);
        Long term2844 = new Long(-2850532706972744550L);
        term2798 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term2798, term2798.getClass(), "id", 860079646007397083L);
        setField(term2798, term2798.getClass(), "tms", "xOcJIiQQDu");
        setField(term2798, term2798.getClass(), "description", "GVizqqzXpy");
        setField(term2798, term2798.getClass(), "uri", "JqXGgAhZPl");
        setField(term2798, term2798.getClass(), "minX", term2836);
        setField(term2798, term2798.getClass(), "minY", term2838);
        setField(term2798, term2798.getClass(), "maxX", term2840);
        setField(term2798, term2798.getClass(), "maxY", term2842);
        setField(term2798, term2798.getClass(), "srs", null);
        setField(term2798, term2798.getClass(), "srsId", term2844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Object[] args = new Object[1];
        args[0] = term2798;
        callMethod(klass, "setTms", argTypes, term2735, args);
    }

};


