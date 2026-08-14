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

public class SymbolImages_getOffsetX_114882080413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;

    public SymbolImages_getOffsetX_114882080413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term126, term126.getClass(), "id", -1832940336320585644L);
        setLongField(term126, term126.getClass(), "symbol_id", -8033714905181142681L);
        setLongField(term126, term126.getClass(), "content_id", -9040825890007374809L);
        setLongField(term126, term126.getClass(), "width", 1368340889161782793L);
        setLongField(term126, term126.getClass(), "height", -5786861555969446503L);
        setLongField(term126, term126.getClass(), "offsetX", 2354625302846375590L);
        setLongField(term126, term126.getClass(), "offsetY", 7276637106827860087L);
        setLongField(term126, term126.getClass(), "pixelRatio", -3936701866695933852L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOffsetX", argTypes, term126, args);
    }

};


