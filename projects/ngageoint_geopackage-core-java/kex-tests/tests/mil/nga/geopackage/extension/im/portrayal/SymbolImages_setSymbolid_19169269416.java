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

public class SymbolImages_setSymbolid_19169269416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term64;

    public SymbolImages_setSymbolid_19169269416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term55, term55.getClass(), "id", -2068172595987555756L);
        setLongField(term55, term55.getClass(), "symbol_id", -6292278961887936280L);
        setLongField(term55, term55.getClass(), "content_id", -6645965768855543712L);
        setLongField(term55, term55.getClass(), "width", 4784595517102746672L);
        setLongField(term55, term55.getClass(), "height", -7612550318181586304L);
        setLongField(term55, term55.getClass(), "offsetX", -2170847986967241072L);
        setLongField(term55, term55.getClass(), "offsetY", 4044358158040652353L);
        setLongField(term55, term55.getClass(), "pixelRatio", -4443169559037975007L);
        term64 = new Long(-3842548265506930260L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term64;
        callMethod(klass, "setSymbol_id", argTypes, term55, args);
    }

};


