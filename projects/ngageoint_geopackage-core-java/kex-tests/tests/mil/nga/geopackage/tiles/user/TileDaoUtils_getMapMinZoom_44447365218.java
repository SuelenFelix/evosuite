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
import java.util.LinkedList;
import java.lang.Object;

public class TileDaoUtils_getMapMinZoom_44447365218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4369;
     Object term4387;

    public TileDaoUtils_getMapMinZoom_44447365218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4369 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setField(term4369, term4369.getClass(), "contents", null);
        setField(term4369, term4369.getClass(), "tableName", "SOrEHbcbmn");
        setField(term4369, term4369.getClass(), "srs", null);
        setLongField(term4369, term4369.getClass(), "srsId", 5973526439563541711L);
        setDoubleField(term4369, term4369.getClass(), "minX", 0.547995853732519);
        setDoubleField(term4369, term4369.getClass(), "minY", 0.3483938514131425);
        setDoubleField(term4369, term4369.getClass(), "maxX", 0.0100718646868041);
        setDoubleField(term4369, term4369.getClass(), "maxY", 0.58265008665336);
        Object term4390 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4390, term4390.getClass(), "contents", null);
        setField(term4390, term4390.getClass(), "tableName", "bnsyeQXFdu");
        setLongField(term4390, term4390.getClass(), "zoomLevel", 5246058710498845622L);
        setLongField(term4390, term4390.getClass(), "matrixWidth", 4394651392080968777L);
        setLongField(term4390, term4390.getClass(), "matrixHeight", -7310273014364148916L);
        setLongField(term4390, term4390.getClass(), "tileWidth", 8863790908271299748L);
        setLongField(term4390, term4390.getClass(), "tileHeight", 9205327385733285058L);
        setDoubleField(term4390, term4390.getClass(), "pixelXSize", 0.1163034938203874);
        setDoubleField(term4390, term4390.getClass(), "pixelYSize", 0.1187814206908886);
        Object term4411 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4411, term4411.getClass(), "contents", null);
        setField(term4411, term4411.getClass(), "tableName", "");
        setLongField(term4411, term4411.getClass(), "zoomLevel", 4199886998224701110L);
        setLongField(term4411, term4411.getClass(), "matrixWidth", 8540994973773607992L);
        setLongField(term4411, term4411.getClass(), "matrixHeight", -2338103433822116635L);
        setLongField(term4411, term4411.getClass(), "tileWidth", -1885698929232124806L);
        setLongField(term4411, term4411.getClass(), "tileHeight", 5731563613239387113L);
        setDoubleField(term4411, term4411.getClass(), "pixelXSize", 0.04662501176438627);
        setDoubleField(term4411, term4411.getClass(), "pixelYSize", 0.17512426723256447);
        Object term4421 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4421, term4421.getClass(), "contents", null);
        setField(term4421, term4421.getClass(), "tableName", null);
        setLongField(term4421, term4421.getClass(), "zoomLevel", 3381333711768010594L);
        setLongField(term4421, term4421.getClass(), "matrixWidth", 3580984732036213717L);
        setLongField(term4421, term4421.getClass(), "matrixHeight", 5330761990446327930L);
        setLongField(term4421, term4421.getClass(), "tileWidth", -3954795081650780841L);
        setLongField(term4421, term4421.getClass(), "tileHeight", 3288791194263207397L);
        setDoubleField(term4421, term4421.getClass(), "pixelXSize", 0.9379214810416256);
        setDoubleField(term4421, term4421.getClass(), "pixelYSize", 0.10807577760679721);
        term4387 = new LinkedList();
        ((LinkedList) term4387).add(term4390);
        ((LinkedList) term4387).add(term4411);
        ((LinkedList) term4387).add(term4421);
        ((LinkedList) term4387).add((Object)null);
        ((LinkedList) term4387).add((Object)null);
        ((LinkedList) term4387).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term4369;
        args[1] = term4387;
        callMethod(klass, "getMapMinZoom", argTypes, null, args);
    }

};


