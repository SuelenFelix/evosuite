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

public class SymbolImages_setHeight_193105694012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;
     Object term124;

    public SymbolImages_setHeight_193105694012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term115, term115.getClass(), "id", -2177368829816872572L);
        setLongField(term115, term115.getClass(), "symbol_id", -8463029266761149071L);
        setLongField(term115, term115.getClass(), "content_id", 3133860696238261492L);
        setLongField(term115, term115.getClass(), "width", 7247160664318067468L);
        setLongField(term115, term115.getClass(), "height", 2135754395358000892L);
        setLongField(term115, term115.getClass(), "offsetX", -8085190702504231560L);
        setLongField(term115, term115.getClass(), "offsetY", 1672578078364590450L);
        setLongField(term115, term115.getClass(), "pixelRatio", 4949335493504695457L);
        term124 = new Long(-5216789073301458893L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term124;
        callMethod(klass, "setHeight", argTypes, term115, args);
    }

};


