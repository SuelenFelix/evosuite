package example.dto;

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
import static example.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BookDto_getGenre_2200721766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644;

    public BookDto_getGenre_2200721766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term645 = new Long(-7237588299778557629L);
        Long term701 = new Long(6967924379644551255L);
        term644 = newInstance(Class.forName("example.dto.BookDto"));
        Object term683 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term684 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term686 = (int[]) newIntArray(6);
        Object term700 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term644, term644.getClass(), "id", term645);
        setField(term644, term644.getClass(), "title", "BYqFIqCKAV");
        setField(term644, term644.getClass(), "description", "vrQLuWIDJX");
        setField(term644, term644.getClass(), "genre", "flxyYxBRtu");
        setIntField(term684, term684.getClass(), "signum", 1);
        setIntElement(term686, 0, 1954);
        setIntElement(term686, 1, -476668863);
        setIntElement(term686, 2, 661030673);
        setIntElement(term686, 3, 328061253);
        setIntElement(term686, 4, -431156338);
        setIntElement(term686, 5, 791621529);
        setField(term684, term684.getClass(), "mag", term686);
        setIntField(term684, term684.getClass(), "bitCountPlusOne", 0);
        setIntField(term684, term684.getClass(), "bitLengthPlusOne", 0);
        setIntField(term684, term684.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term684, term684.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term683, term683.getClass(), "intVal", term684);
        setIntField(term683, term683.getClass(), "scale", 52);
        setIntField(term683, term683.getClass(), "precision", 0);
        setField(term683, term683.getClass(), "stringCache", null);
        setLongField(term683, term683.getClass(), "intCompact", -9223372036854775808L);
        setField(term644, term644.getClass(), "price", term683);
        setField(term700, term700.getClass(), "id", term701);
        setField(term700, term700.getClass(), "firstName", "OclPbYPkcH");
        setField(term700, term700.getClass(), "lastName", "IoAlmYsBwc");
        setField(term700, term700.getClass(), "email", "TEParAifyi");
        setField(term644, term644.getClass(), "author", term700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenre", argTypes, term644, args);
    }

};


