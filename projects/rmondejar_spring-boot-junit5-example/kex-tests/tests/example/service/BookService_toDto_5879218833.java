package example.service;

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
import static example.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class BookService_toDto_5879218833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public BookService_toDto_5879218833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238 = new Long(7411271909051562686L);
        Long term294 = new Long(4872422362414183754L);
        Long term335 = new Long(6811161968424632369L);
        Object term334 = newInstance(Class.forName("example.model.Book"));
        setField(term334, term334.getClass(), "id", term335);
        setField(term334, term334.getClass(), "title", null);
        setField(term334, term334.getClass(), "description", null);
        setField(term334, term334.getClass(), "genre", null);
        setField(term334, term334.getClass(), "price", null);
        setField(term334, term334.getClass(), "author", null);
        Long term338 = new Long(2535595959091595249L);
        Object term337 = newInstance(Class.forName("example.model.Book"));
        setField(term337, term337.getClass(), "id", term338);
        setField(term337, term337.getClass(), "title", null);
        setField(term337, term337.getClass(), "description", null);
        setField(term337, term337.getClass(), "genre", null);
        setField(term337, term337.getClass(), "price", null);
        setField(term337, term337.getClass(), "author", null);
        Object term340 = newInstance(Class.forName("example.model.Book"));
        setField(term340, term340.getClass(), "id", null);
        setField(term340, term340.getClass(), "title", null);
        setField(term340, term340.getClass(), "description", null);
        setField(term340, term340.getClass(), "genre", null);
        setField(term340, term340.getClass(), "price", null);
        setField(term340, term340.getClass(), "author", null);
        Object term341 = newInstance(Class.forName("example.model.Book"));
        setField(term341, term341.getClass(), "id", null);
        setField(term341, term341.getClass(), "title", null);
        setField(term341, term341.getClass(), "description", null);
        setField(term341, term341.getClass(), "genre", null);
        setField(term341, term341.getClass(), "price", null);
        setField(term341, term341.getClass(), "author", null);
        Object term342 = newInstance(Class.forName("example.model.Book"));
        setField(term342, term342.getClass(), "id", null);
        setField(term342, term342.getClass(), "title", null);
        setField(term342, term342.getClass(), "description", null);
        setField(term342, term342.getClass(), "genre", null);
        setField(term342, term342.getClass(), "price", null);
        setField(term342, term342.getClass(), "author", null);
        ArrayList term332 = new ArrayList();
        ((ArrayList) term332).add(term334);
        ((ArrayList) term332).add(term337);
        ((ArrayList) term332).add(term340);
        ((ArrayList) term332).add(term341);
        ((ArrayList) term332).add(term342);
        term237 = newInstance(Class.forName("example.model.Book"));
        Object term276 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term277 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term279 = (int[]) newIntArray(6);
        Object term293 = newInstance(Class.forName("example.model.Author"));
        setField(term237, term237.getClass(), "id", term238);
        setField(term237, term237.getClass(), "title", "RMFIsYGgne");
        setField(term237, term237.getClass(), "description", "NRdvgJlhkX");
        setField(term237, term237.getClass(), "genre", "uuaPigETmJ");
        setIntField(term277, term277.getClass(), "signum", 1);
        setIntElement(term279, 0, 2364);
        setIntElement(term279, 1, -1446584625);
        setIntElement(term279, 2, 1957600567);
        setIntElement(term279, 3, -336418707);
        setIntElement(term279, 4, -1905211145);
        setIntElement(term279, 5, 86968353);
        setField(term277, term277.getClass(), "mag", term279);
        setIntField(term277, term277.getClass(), "bitCountPlusOne", 0);
        setIntField(term277, term277.getClass(), "bitLengthPlusOne", 0);
        setIntField(term277, term277.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term277, term277.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term276, term276.getClass(), "intVal", term277);
        setIntField(term276, term276.getClass(), "scale", 52);
        setIntField(term276, term276.getClass(), "precision", 0);
        setField(term276, term276.getClass(), "stringCache", null);
        setLongField(term276, term276.getClass(), "intCompact", -9223372036854775808L);
        setField(term237, term237.getClass(), "price", term276);
        setField(term293, term293.getClass(), "id", term294);
        setField(term293, term293.getClass(), "firstName", "MxlszYVzRf");
        setField(term293, term293.getClass(), "lastName", "LQFpaHEwXR");
        setField(term293, term293.getClass(), "email", "oVcInYnLWB");
        setField(term293, term293.getClass(), "books", term332);
        setField(term237, term237.getClass(), "author", term293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.service.BookService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("example.model.Book");
        Object[] args = new Object[1];
        args[0] = term237;
        callMethod(klass, "toDto", argTypes, null, args);
    }

};


