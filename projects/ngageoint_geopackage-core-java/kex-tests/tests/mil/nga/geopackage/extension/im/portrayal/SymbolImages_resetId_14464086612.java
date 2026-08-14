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

public class SymbolImages_resetId_14464086612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;

    public SymbolImages_resetId_14464086612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term17, term17.getClass(), "id", -7237588299778557629L);
        setLongField(term17, term17.getClass(), "symbol_id", 6967924379644551255L);
        setLongField(term17, term17.getClass(), "content_id", -2813493605142626659L);
        setLongField(term17, term17.getClass(), "width", -8885298608300233488L);
        setLongField(term17, term17.getClass(), "height", -4325723315152823407L);
        setLongField(term17, term17.getClass(), "offsetX", 2535595959091595249L);
        setLongField(term17, term17.getClass(), "offsetY", -5476826692763582090L);
        setLongField(term17, term17.getClass(), "pixelRatio", -872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetId", argTypes, term17, args);
    }

};


