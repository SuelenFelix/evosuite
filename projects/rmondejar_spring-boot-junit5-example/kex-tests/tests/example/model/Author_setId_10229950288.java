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

public class Author_setId_10229950288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1681;
     Object term1795;

    public Author_setId_10229950288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1682 = new Long(-2955854401507097864L);
        Long term1723 = new Long(329213208496958131L);
        Long term1733 = new Long(8107921244631636572L);
        Object term1722 = newInstance(Class.forName("example.model.Book"));
        Object term1728 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1732 = newInstance(Class.forName("example.model.Author"));
        setField(term1722, term1722.getClass(), "id", term1723);
        setField(term1722, term1722.getClass(), "title", "");
        setField(term1722, term1722.getClass(), "description", "");
        setField(term1722, term1722.getClass(), "genre", "");
        setField(term1728, term1728.getClass(), "intVal", null);
        setIntField(term1728, term1728.getClass(), "scale", 53);
        setIntField(term1728, term1728.getClass(), "precision", 0);
        setField(term1728, term1728.getClass(), "stringCache", null);
        setLongField(term1728, term1728.getClass(), "intCompact", -9223372036854775808L);
        setField(term1722, term1722.getClass(), "price", term1728);
        setField(term1732, term1732.getClass(), "id", term1733);
        setField(term1732, term1732.getClass(), "firstName", null);
        setField(term1732, term1732.getClass(), "lastName", null);
        setField(term1732, term1732.getClass(), "email", null);
        setField(term1732, term1732.getClass(), "books", null);
        setField(term1722, term1722.getClass(), "author", term1732);
        Long term1736 = new Long(3108750145697087661L);
        Object term1735 = newInstance(Class.forName("example.model.Book"));
        Object term1741 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1745 = newInstance(Class.forName("example.model.Author"));
        setField(term1735, term1735.getClass(), "id", term1736);
        setField(term1735, term1735.getClass(), "title", "");
        setField(term1735, term1735.getClass(), "description", "");
        setField(term1735, term1735.getClass(), "genre", "");
        setField(term1741, term1741.getClass(), "intVal", null);
        setIntField(term1741, term1741.getClass(), "scale", 53);
        setIntField(term1741, term1741.getClass(), "precision", 0);
        setField(term1741, term1741.getClass(), "stringCache", null);
        setLongField(term1741, term1741.getClass(), "intCompact", -9223372036854775808L);
        setField(term1735, term1735.getClass(), "price", term1741);
        setField(term1745, term1745.getClass(), "id", null);
        setField(term1745, term1745.getClass(), "firstName", null);
        setField(term1745, term1745.getClass(), "lastName", null);
        setField(term1745, term1745.getClass(), "email", null);
        setField(term1745, term1745.getClass(), "books", null);
        setField(term1735, term1735.getClass(), "author", term1745);
        Long term1747 = new Long(-6394943900800506753L);
        Long term1757 = new Long(-4867941246533901410L);
        Object term1746 = newInstance(Class.forName("example.model.Book"));
        Object term1752 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1756 = newInstance(Class.forName("example.model.Author"));
        setField(term1746, term1746.getClass(), "id", term1747);
        setField(term1746, term1746.getClass(), "title", "");
        setField(term1746, term1746.getClass(), "description", "");
        setField(term1746, term1746.getClass(), "genre", "");
        setField(term1752, term1752.getClass(), "intVal", null);
        setIntField(term1752, term1752.getClass(), "scale", 53);
        setIntField(term1752, term1752.getClass(), "precision", 0);
        setField(term1752, term1752.getClass(), "stringCache", null);
        setLongField(term1752, term1752.getClass(), "intCompact", -9223372036854775808L);
        setField(term1746, term1746.getClass(), "price", term1752);
        setField(term1756, term1756.getClass(), "id", term1757);
        setField(term1756, term1756.getClass(), "firstName", null);
        setField(term1756, term1756.getClass(), "lastName", null);
        setField(term1756, term1756.getClass(), "email", null);
        setField(term1756, term1756.getClass(), "books", null);
        setField(term1746, term1746.getClass(), "author", term1756);
        Long term1760 = new Long(1044883697493326351L);
        Object term1759 = newInstance(Class.forName("example.model.Book"));
        Object term1765 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1769 = newInstance(Class.forName("example.model.Author"));
        setField(term1759, term1759.getClass(), "id", term1760);
        setField(term1759, term1759.getClass(), "title", "");
        setField(term1759, term1759.getClass(), "description", "");
        setField(term1759, term1759.getClass(), "genre", "");
        setField(term1765, term1765.getClass(), "intVal", null);
        setIntField(term1765, term1765.getClass(), "scale", 53);
        setIntField(term1765, term1765.getClass(), "precision", 0);
        setField(term1765, term1765.getClass(), "stringCache", null);
        setLongField(term1765, term1765.getClass(), "intCompact", -9223372036854775808L);
        setField(term1759, term1759.getClass(), "price", term1765);
        setField(term1769, term1769.getClass(), "id", null);
        setField(term1769, term1769.getClass(), "firstName", null);
        setField(term1769, term1769.getClass(), "lastName", null);
        setField(term1769, term1769.getClass(), "email", null);
        setField(term1769, term1769.getClass(), "books", null);
        setField(term1759, term1759.getClass(), "author", term1769);
        Long term1771 = new Long(-7904053112604879960L);
        Long term1781 = new Long(-6602460430714339690L);
        Object term1770 = newInstance(Class.forName("example.model.Book"));
        Object term1776 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1780 = newInstance(Class.forName("example.model.Author"));
        setField(term1770, term1770.getClass(), "id", term1771);
        setField(term1770, term1770.getClass(), "title", "");
        setField(term1770, term1770.getClass(), "description", "");
        setField(term1770, term1770.getClass(), "genre", "");
        setField(term1776, term1776.getClass(), "intVal", null);
        setIntField(term1776, term1776.getClass(), "scale", 51);
        setIntField(term1776, term1776.getClass(), "precision", 0);
        setField(term1776, term1776.getClass(), "stringCache", null);
        setLongField(term1776, term1776.getClass(), "intCompact", -9223372036854775808L);
        setField(term1770, term1770.getClass(), "price", term1776);
        setField(term1780, term1780.getClass(), "id", term1781);
        setField(term1780, term1780.getClass(), "firstName", null);
        setField(term1780, term1780.getClass(), "lastName", null);
        setField(term1780, term1780.getClass(), "email", null);
        setField(term1780, term1780.getClass(), "books", null);
        setField(term1770, term1770.getClass(), "author", term1780);
        Long term1784 = new Long(868503089567085985L);
        Object term1783 = newInstance(Class.forName("example.model.Book"));
        Object term1789 = newInstance(Class.forName("java.math.BigDecimal"));
        setField(term1783, term1783.getClass(), "id", term1784);
        setField(term1783, term1783.getClass(), "title", "");
        setField(term1783, term1783.getClass(), "description", "");
        setField(term1783, term1783.getClass(), "genre", "");
        setField(term1789, term1789.getClass(), "intVal", null);
        setIntField(term1789, term1789.getClass(), "scale", 53);
        setIntField(term1789, term1789.getClass(), "precision", 0);
        setField(term1789, term1789.getClass(), "stringCache", null);
        setLongField(term1789, term1789.getClass(), "intCompact", -9223372036854775808L);
        setField(term1783, term1783.getClass(), "price", term1789);
        setField(term1783, term1783.getClass(), "author", term1745);
        ArrayList term1720 = new ArrayList();
        ((ArrayList) term1720).add(term1722);
        ((ArrayList) term1720).add(term1735);
        ((ArrayList) term1720).add(term1746);
        ((ArrayList) term1720).add(term1759);
        ((ArrayList) term1720).add(term1759);
        ((ArrayList) term1720).add(term1770);
        ((ArrayList) term1720).add(term1783);
        term1681 = newInstance(Class.forName("example.model.Author"));
        setField(term1681, term1681.getClass(), "id", term1682);
        setField(term1681, term1681.getClass(), "firstName", "TVxGTjeDcu");
        setField(term1681, term1681.getClass(), "lastName", "ABPtcyCzkR");
        setField(term1681, term1681.getClass(), "email", "QgHhxMyKvr");
        setField(term1681, term1681.getClass(), "books", term1720);
        term1795 = new Long(3752337209837437327L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1795;
        callMethod(klass, "setId", argTypes, term1681, args);
    }

};


