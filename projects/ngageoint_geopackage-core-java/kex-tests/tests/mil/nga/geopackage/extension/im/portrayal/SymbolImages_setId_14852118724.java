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
import java.lang.Long;

public class SymbolImages_setId_14852118724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term44;

    public SymbolImages_setId_14852118724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term35, term35.getClass(), "id", 2486810210675247493L);
        setLongField(term35, term35.getClass(), "symbol_id", 7009926388951271268L);
        setLongField(term35, term35.getClass(), "content_id", -7672528020740371001L);
        setLongField(term35, term35.getClass(), "width", -4502405999831680926L);
        setLongField(term35, term35.getClass(), "height", 1967728129628047933L);
        setLongField(term35, term35.getClass(), "offsetX", 2120084523938730454L);
        setLongField(term35, term35.getClass(), "offsetY", 6855071767938501807L);
        setLongField(term35, term35.getClass(), "pixelRatio", -5892135042702373494L);
        term44 = new Long(5262507301787091109L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term44;
        callMethod(klass, "setId", argTypes, term35, args);
    }

};


