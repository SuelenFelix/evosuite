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

public class SymbolImages_getSymbolid_1488189515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;

    public SymbolImages_getSymbolid_1488189515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term46, term46.getClass(), "id", -6823727938421990489L);
        setLongField(term46, term46.getClass(), "symbol_id", -484994522244390100L);
        setLongField(term46, term46.getClass(), "content_id", 1233889271256172047L);
        setLongField(term46, term46.getClass(), "width", 6617340557564669657L);
        setLongField(term46, term46.getClass(), "height", 1439298019805881866L);
        setLongField(term46, term46.getClass(), "offsetX", -8708192233349544946L);
        setLongField(term46, term46.getClass(), "offsetY", 5907001541142728739L);
        setLongField(term46, term46.getClass(), "pixelRatio", 4178434741742309755L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbol_id", argTypes, term46, args);
    }

};


