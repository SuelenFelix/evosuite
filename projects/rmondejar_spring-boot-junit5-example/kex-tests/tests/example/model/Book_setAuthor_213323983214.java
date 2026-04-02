package example.model;

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
import static example.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Book_setAuthor_213323983214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6582;
     Object term6691;

    public Book_setAuthor_213323983214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6583 = new Long(-4029227951294167228L);
        Long term6639 = new Long(5160033404788124731L);
        Long term6680 = new Long(5071015720043054072L);
        Object term6679 = newInstance(Class.forName("example.model.Book"));
        setField(term6679, term6679.getClass(), "id", term6680);
        setField(term6679, term6679.getClass(), "title", null);
        setField(term6679, term6679.getClass(), "description", null);
        setField(term6679, term6679.getClass(), "genre", null);
        setField(term6679, term6679.getClass(), "price", null);
        setField(term6679, term6679.getClass(), "author", null);
        Object term6682 = newInstance(Class.forName("example.model.Book"));
        setField(term6682, term6682.getClass(), "id", null);
        setField(term6682, term6682.getClass(), "title", null);
        setField(term6682, term6682.getClass(), "description", null);
        setField(term6682, term6682.getClass(), "genre", null);
        setField(term6682, term6682.getClass(), "price", null);
        setField(term6682, term6682.getClass(), "author", null);
        Long term6684 = new Long(-8699693633047465617L);
        Object term6683 = newInstance(Class.forName("example.model.Book"));
        setField(term6683, term6683.getClass(), "id", term6684);
        setField(term6683, term6683.getClass(), "title", null);
        setField(term6683, term6683.getClass(), "description", null);
        setField(term6683, term6683.getClass(), "genre", null);
        setField(term6683, term6683.getClass(), "price", null);
        setField(term6683, term6683.getClass(), "author", null);
        Long term6687 = new Long(-5761087225966065493L);
        Object term6686 = newInstance(Class.forName("example.model.Book"));
        setField(term6686, term6686.getClass(), "id", term6687);
        setField(term6686, term6686.getClass(), "title", null);
        setField(term6686, term6686.getClass(), "description", null);
        setField(term6686, term6686.getClass(), "genre", null);
        setField(term6686, term6686.getClass(), "price", null);
        setField(term6686, term6686.getClass(), "author", null);
        ArrayList term6677 = new ArrayList();
        ((ArrayList) term6677).add(term6679);
        ((ArrayList) term6677).add(term6682);
        ((ArrayList) term6677).add(term6683);
        ((ArrayList) term6677).add(term6686);
        term6582 = newInstance(Class.forName("example.model.Book"));
        Object term6621 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6622 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6624 = (int[]) newIntArray(6);
        Object term6638 = newInstance(Class.forName("example.model.Author"));
        setField(term6582, term6582.getClass(), "id", term6583);
        setField(term6582, term6582.getClass(), "title", "mQsaqUltLU");
        setField(term6582, term6582.getClass(), "description", "jwENwZiGlR");
        setField(term6582, term6582.getClass(), "genre", "rfFHGPcfpz");
        setIntField(term6622, term6622.getClass(), "signum", 1);
        setIntElement(term6624, 0, 15352);
        setIntElement(term6624, 1, -2009185042);
        setIntElement(term6624, 2, 1356408712);
        setIntElement(term6624, 3, 1667645905);
        setIntElement(term6624, 4, 2067531061);
        setIntElement(term6624, 5, 1396786731);
        setField(term6622, term6622.getClass(), "mag", term6624);
        setIntField(term6622, term6622.getClass(), "bitCountPlusOne", 0);
        setIntField(term6622, term6622.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6622, term6622.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6622, term6622.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6621, term6621.getClass(), "intVal", term6622);
        setIntField(term6621, term6621.getClass(), "scale", 53);
        setIntField(term6621, term6621.getClass(), "precision", 0);
        setField(term6621, term6621.getClass(), "stringCache", null);
        setLongField(term6621, term6621.getClass(), "intCompact", -9223372036854775808L);
        setField(term6582, term6582.getClass(), "price", term6621);
        setField(term6638, term6638.getClass(), "id", term6639);
        setField(term6638, term6638.getClass(), "firstName", "fViQeyMrrL");
        setField(term6638, term6638.getClass(), "lastName", "zzeaToyLmI");
        setField(term6638, term6638.getClass(), "email", "sKYWhmRMLx");
        setField(term6638, term6638.getClass(), "books", term6677);
        setField(term6582, term6582.getClass(), "author", term6638);
        Long term6692 = new Long(8699742215739444902L);
        Long term6733 = new Long(8261619652909874476L);
        Long term6743 = new Long(-3692936312179064102L);
        Object term6732 = newInstance(Class.forName("example.model.Book"));
        Object term6738 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6742 = newInstance(Class.forName("example.model.Author"));
        setField(term6732, term6732.getClass(), "id", term6733);
        setField(term6732, term6732.getClass(), "title", "");
        setField(term6732, term6732.getClass(), "description", "");
        setField(term6732, term6732.getClass(), "genre", "");
        setField(term6738, term6738.getClass(), "intVal", null);
        setIntField(term6738, term6738.getClass(), "scale", 52);
        setIntField(term6738, term6738.getClass(), "precision", 0);
        setField(term6738, term6738.getClass(), "stringCache", null);
        setLongField(term6738, term6738.getClass(), "intCompact", -9223372036854775808L);
        setField(term6732, term6732.getClass(), "price", term6738);
        setField(term6742, term6742.getClass(), "id", term6743);
        setField(term6742, term6742.getClass(), "firstName", null);
        setField(term6742, term6742.getClass(), "lastName", null);
        setField(term6742, term6742.getClass(), "email", null);
        setField(term6742, term6742.getClass(), "books", null);
        setField(term6732, term6732.getClass(), "author", term6742);
        Long term6746 = new Long(5498944509671266637L);
        Long term6756 = new Long(-6838909359433858599L);
        Object term6745 = newInstance(Class.forName("example.model.Book"));
        Object term6751 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6755 = newInstance(Class.forName("example.model.Author"));
        setField(term6745, term6745.getClass(), "id", term6746);
        setField(term6745, term6745.getClass(), "title", "");
        setField(term6745, term6745.getClass(), "description", "");
        setField(term6745, term6745.getClass(), "genre", "");
        setField(term6751, term6751.getClass(), "intVal", null);
        setIntField(term6751, term6751.getClass(), "scale", 53);
        setIntField(term6751, term6751.getClass(), "precision", 0);
        setField(term6751, term6751.getClass(), "stringCache", null);
        setLongField(term6751, term6751.getClass(), "intCompact", -9223372036854775808L);
        setField(term6745, term6745.getClass(), "price", term6751);
        setField(term6755, term6755.getClass(), "id", term6756);
        setField(term6755, term6755.getClass(), "firstName", null);
        setField(term6755, term6755.getClass(), "lastName", null);
        setField(term6755, term6755.getClass(), "email", null);
        setField(term6755, term6755.getClass(), "books", null);
        setField(term6745, term6745.getClass(), "author", term6755);
        Long term6759 = new Long(6462632207326555041L);
        Long term6769 = new Long(-3188913050877092148L);
        Object term6758 = newInstance(Class.forName("example.model.Book"));
        Object term6764 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6768 = newInstance(Class.forName("example.model.Author"));
        setField(term6758, term6758.getClass(), "id", term6759);
        setField(term6758, term6758.getClass(), "title", "");
        setField(term6758, term6758.getClass(), "description", "");
        setField(term6758, term6758.getClass(), "genre", "");
        setField(term6764, term6764.getClass(), "intVal", null);
        setIntField(term6764, term6764.getClass(), "scale", 48);
        setIntField(term6764, term6764.getClass(), "precision", 0);
        setField(term6764, term6764.getClass(), "stringCache", null);
        setLongField(term6764, term6764.getClass(), "intCompact", -9223372036854775808L);
        setField(term6758, term6758.getClass(), "price", term6764);
        setField(term6768, term6768.getClass(), "id", term6769);
        setField(term6768, term6768.getClass(), "firstName", null);
        setField(term6768, term6768.getClass(), "lastName", null);
        setField(term6768, term6768.getClass(), "email", null);
        setField(term6768, term6768.getClass(), "books", null);
        setField(term6758, term6758.getClass(), "author", term6768);
        ArrayList term6730 = new ArrayList();
        ((ArrayList) term6730).add(term6732);
        ((ArrayList) term6730).add(term6745);
        ((ArrayList) term6730).add(term6758);
        term6691 = newInstance(Class.forName("example.model.Author"));
        setField(term6691, term6691.getClass(), "id", term6692);
        setField(term6691, term6691.getClass(), "firstName", "skwxdosvQV");
        setField(term6691, term6691.getClass(), "lastName", "DBYTggnCkD");
        setField(term6691, term6691.getClass(), "email", "RyXrJxJQiY");
        setField(term6691, term6691.getClass(), "books", term6730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("example.model.Author");
        Object[] args = new Object[1];
        args[0] = term6691;
        callMethod(klass, "setAuthor", argTypes, term6582, args);
    }

};


