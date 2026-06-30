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

public class BookDto_BookDtoBuilder_build_17178823427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5509;

    public BookDto_BookDtoBuilder_build_17178823427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5510 = new Long(-6723783499250797216L);
        Long term5566 = new Long(41775768178052008L);
        term5509 = newInstance(Class.forName("example.dto.BookDto$BookDtoBuilder"));
        Object term5548 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5549 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5551 = (int[]) newIntArray(6);
        Object term5565 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term5509, term5509.getClass(), "id", term5510);
        setField(term5509, term5509.getClass(), "title", "NnpwZBUTvx");
        setField(term5509, term5509.getClass(), "description", "tlQSNgTkQX");
        setField(term5509, term5509.getClass(), "genre", "PCipZnmBOF");
        setIntField(term5549, term5549.getClass(), "signum", 1);
        setIntElement(term5551, 0, 26001);
        setIntElement(term5551, 1, 1123266030);
        setIntElement(term5551, 2, 1277036849);
        setIntElement(term5551, 3, 2128028609);
        setIntElement(term5551, 4, -171954480);
        setIntElement(term5551, 5, -1359520521);
        setField(term5549, term5549.getClass(), "mag", term5551);
        setIntField(term5549, term5549.getClass(), "bitCountPlusOne", 0);
        setIntField(term5549, term5549.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5549, term5549.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5549, term5549.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5548, term5548.getClass(), "intVal", term5549);
        setIntField(term5548, term5548.getClass(), "scale", 53);
        setIntField(term5548, term5548.getClass(), "precision", 0);
        setField(term5548, term5548.getClass(), "stringCache", null);
        setLongField(term5548, term5548.getClass(), "intCompact", -9223372036854775808L);
        setField(term5509, term5509.getClass(), "price", term5548);
        setField(term5565, term5565.getClass(), "id", term5566);
        setField(term5565, term5565.getClass(), "firstName", "zcorEihhLK");
        setField(term5565, term5565.getClass(), "lastName", "GrqozDKFOk");
        setField(term5565, term5565.getClass(), "email", "CFyoseFGLF");
        setField(term5509, term5509.getClass(), "author", term5565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto$BookDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term5509, args);
    }

};


