package mil.nga.geopackage.extension.im.portrayal;

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
import static mil.nga.geopackage.extension.im.portrayal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SymbolImages_getPixelRatio_61520344917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;

    public SymbolImages_getPixelRatio_61520344917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term166, term166.getClass(), "id", 855932984568615096L);
        setLongField(term166, term166.getClass(), "symbol_id", -1616722610139554082L);
        setLongField(term166, term166.getClass(), "content_id", 7495904023107549024L);
        setLongField(term166, term166.getClass(), "width", 8802866251294305945L);
        setLongField(term166, term166.getClass(), "height", 4513004407927379358L);
        setLongField(term166, term166.getClass(), "offsetX", -7115418542247301000L);
        setLongField(term166, term166.getClass(), "offsetY", 8034714140377562739L);
        setLongField(term166, term166.getClass(), "pixelRatio", -2924531382671518368L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPixelRatio", argTypes, term166, args);
    }

};


