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

public class BookDto_BookDtoBuilder_title_12072444682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4546;

    public BookDto_BookDtoBuilder_title_12072444682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4547 = new Long(5953383087795962419L);
        Long term4603 = new Long(7994303628307559416L);
        term4546 = newInstance(Class.forName("example.dto.BookDto$BookDtoBuilder"));
        Object term4585 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4586 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4588 = (int[]) newIntArray(6);
        Object term4602 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term4546, term4546.getClass(), "id", term4547);
        setField(term4546, term4546.getClass(), "title", "JmcmxoGhIK");
        setField(term4546, term4546.getClass(), "description", "jXzmYyrnnT");
        setField(term4546, term4546.getClass(), "genre", "igCAtimmYB");
        setIntField(term4586, term4586.getClass(), "signum", 1);
        setIntElement(term4588, 0, 5017);
        setIntElement(term4588, 1, 1138264108);
        setIntElement(term4588, 2, 138609451);
        setIntElement(term4588, 3, -559929925);
        setIntElement(term4588, 4, -1000035065);
        setIntElement(term4588, 5, 1199074337);
        setField(term4586, term4586.getClass(), "mag", term4588);
        setIntField(term4586, term4586.getClass(), "bitCountPlusOne", 0);
        setIntField(term4586, term4586.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4586, term4586.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4586, term4586.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4585, term4585.getClass(), "intVal", term4586);
        setIntField(term4585, term4585.getClass(), "scale", 52);
        setIntField(term4585, term4585.getClass(), "precision", 0);
        setField(term4585, term4585.getClass(), "stringCache", null);
        setLongField(term4585, term4585.getClass(), "intCompact", -9223372036854775808L);
        setField(term4546, term4546.getClass(), "price", term4585);
        setField(term4602, term4602.getClass(), "id", term4603);
        setField(term4602, term4602.getClass(), "firstName", "DyiXbeYIaN");
        setField(term4602, term4602.getClass(), "lastName", "VGizxZnyHX");
        setField(term4602, term4602.getClass(), "email", "kVEZMHmRtR");
        setField(term4546, term4546.getClass(), "author", term4602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto$BookDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ekxGuOYIwi";
        callMethod(klass, "title", argTypes, term4546, args);
    }

};


