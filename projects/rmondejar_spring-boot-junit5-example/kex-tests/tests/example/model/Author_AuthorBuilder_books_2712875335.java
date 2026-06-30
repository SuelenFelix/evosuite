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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Author_AuthorBuilder_books_2712875335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564;
     Object term666;

    public Author_AuthorBuilder_books_2712875335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term565 = new Long(414749984815662075L);
        Long term606 = new Long(463622836963501975L);
        Long term616 = new Long(305759998609888272L);
        Object term605 = newInstance(Class.forName("example.model.Book"));
        Object term611 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term615 = newInstance(Class.forName("example.model.Author"));
        setField(term605, term605.getClass(), "id", term606);
        setField(term605, term605.getClass(), "title", "");
        setField(term605, term605.getClass(), "description", "");
        setField(term605, term605.getClass(), "genre", "");
        setField(term611, term611.getClass(), "intVal", null);
        setIntField(term611, term611.getClass(), "scale", 53);
        setIntField(term611, term611.getClass(), "precision", 0);
        setField(term611, term611.getClass(), "stringCache", null);
        setLongField(term611, term611.getClass(), "intCompact", -9223372036854775808L);
        setField(term605, term605.getClass(), "price", term611);
        setField(term615, term615.getClass(), "id", term616);
        setField(term615, term615.getClass(), "firstName", null);
        setField(term615, term615.getClass(), "lastName", null);
        setField(term615, term615.getClass(), "email", null);
        setField(term615, term615.getClass(), "books", null);
        setField(term605, term605.getClass(), "author", term615);
        Long term619 = new Long(-6723783499250797216L);
        Long term629 = new Long(41775768178052008L);
        Object term618 = newInstance(Class.forName("example.model.Book"));
        Object term624 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term628 = newInstance(Class.forName("example.model.Author"));
        setField(term618, term618.getClass(), "id", term619);
        setField(term618, term618.getClass(), "title", "");
        setField(term618, term618.getClass(), "description", "");
        setField(term618, term618.getClass(), "genre", "");
        setField(term624, term624.getClass(), "intVal", null);
        setIntField(term624, term624.getClass(), "scale", 53);
        setIntField(term624, term624.getClass(), "precision", 0);
        setField(term624, term624.getClass(), "stringCache", null);
        setLongField(term624, term624.getClass(), "intCompact", -9223372036854775808L);
        setField(term618, term618.getClass(), "price", term624);
        setField(term628, term628.getClass(), "id", term629);
        setField(term628, term628.getClass(), "firstName", null);
        setField(term628, term628.getClass(), "lastName", null);
        setField(term628, term628.getClass(), "email", null);
        setField(term628, term628.getClass(), "books", null);
        setField(term618, term618.getClass(), "author", term628);
        Long term632 = new Long(-7291743527973326814L);
        Object term631 = newInstance(Class.forName("example.model.Book"));
        Object term637 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term641 = newInstance(Class.forName("example.model.Author"));
        setField(term631, term631.getClass(), "id", term632);
        setField(term631, term631.getClass(), "title", "");
        setField(term631, term631.getClass(), "description", "");
        setField(term631, term631.getClass(), "genre", "");
        setField(term637, term637.getClass(), "intVal", null);
        setIntField(term637, term637.getClass(), "scale", 53);
        setIntField(term637, term637.getClass(), "precision", 0);
        setField(term637, term637.getClass(), "stringCache", null);
        setLongField(term637, term637.getClass(), "intCompact", -9223372036854775808L);
        setField(term631, term631.getClass(), "price", term637);
        setField(term641, term641.getClass(), "id", null);
        setField(term641, term641.getClass(), "firstName", null);
        setField(term641, term641.getClass(), "lastName", null);
        setField(term641, term641.getClass(), "email", null);
        setField(term641, term641.getClass(), "books", null);
        setField(term631, term631.getClass(), "author", term641);
        Long term643 = new Long(50358265865610362L);
        Object term642 = newInstance(Class.forName("example.model.Book"));
        Object term648 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term652 = newInstance(Class.forName("example.model.Author"));
        setField(term642, term642.getClass(), "id", term643);
        setField(term642, term642.getClass(), "title", "");
        setField(term642, term642.getClass(), "description", "");
        setField(term642, term642.getClass(), "genre", "");
        setField(term648, term648.getClass(), "intVal", null);
        setIntField(term648, term648.getClass(), "scale", 52);
        setIntField(term648, term648.getClass(), "precision", 0);
        setField(term648, term648.getClass(), "stringCache", null);
        setLongField(term648, term648.getClass(), "intCompact", -9223372036854775808L);
        setField(term642, term642.getClass(), "price", term648);
        setField(term652, term652.getClass(), "id", null);
        setField(term652, term652.getClass(), "firstName", null);
        setField(term652, term652.getClass(), "lastName", null);
        setField(term652, term652.getClass(), "email", null);
        setField(term652, term652.getClass(), "books", null);
        setField(term642, term642.getClass(), "author", term652);
        Long term654 = new Long(6005241913654469005L);
        Object term653 = newInstance(Class.forName("example.model.Book"));
        Object term659 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term663 = newInstance(Class.forName("example.model.Author"));
        setField(term653, term653.getClass(), "id", term654);
        setField(term653, term653.getClass(), "title", "");
        setField(term653, term653.getClass(), "description", "");
        setField(term653, term653.getClass(), "genre", "");
        setField(term659, term659.getClass(), "intVal", null);
        setIntField(term659, term659.getClass(), "scale", 53);
        setIntField(term659, term659.getClass(), "precision", 0);
        setField(term659, term659.getClass(), "stringCache", null);
        setLongField(term659, term659.getClass(), "intCompact", -9223372036854775808L);
        setField(term653, term653.getClass(), "price", term659);
        setField(term663, term663.getClass(), "id", null);
        setField(term663, term663.getClass(), "firstName", null);
        setField(term663, term663.getClass(), "lastName", null);
        setField(term663, term663.getClass(), "email", null);
        setField(term663, term663.getClass(), "books", null);
        setField(term653, term653.getClass(), "author", term663);
        ArrayList term603 = new ArrayList();
        ((ArrayList) term603).add(term605);
        ((ArrayList) term603).add(term618);
        ((ArrayList) term603).add(term631);
        ((ArrayList) term603).add(term642);
        ((ArrayList) term603).add(term653);
        ((ArrayList) term603).add(term653);
        term564 = newInstance(Class.forName("example.model.Author$AuthorBuilder"));
        setField(term564, term564.getClass(), "id", term565);
        setField(term564, term564.getClass(), "firstName", "XJJNClzHRf");
        setField(term564, term564.getClass(), "lastName", "HDaezxQfQR");
        setField(term564, term564.getClass(), "email", "iikZEapDlu");
        setField(term564, term564.getClass(), "books", term603);
        term666 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author$AuthorBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term666;
        callMethod(klass, "books", argTypes, term564, args);
    }

};


