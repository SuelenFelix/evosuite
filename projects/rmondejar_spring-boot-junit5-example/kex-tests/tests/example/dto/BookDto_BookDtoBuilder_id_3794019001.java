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

public class BookDto_BookDtoBuilder_id_3794019001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4383;
     Object term4478;

    public BookDto_BookDtoBuilder_id_3794019001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4384 = new Long(3825396310311739952L);
        Long term4440 = new Long(-3838084482494604218L);
        term4383 = newInstance(Class.forName("example.dto.BookDto$BookDtoBuilder"));
        Object term4422 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4423 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4425 = (int[]) newIntArray(6);
        Object term4439 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term4383, term4383.getClass(), "id", term4384);
        setField(term4383, term4383.getClass(), "title", "rLHAoqXgPh");
        setField(term4383, term4383.getClass(), "description", "zUlRdimJtU");
        setField(term4383, term4383.getClass(), "genre", "vwbEQQNQrx");
        setIntField(term4423, term4423.getClass(), "signum", 1);
        setIntElement(term4425, 0, 4404);
        setIntElement(term4425, 1, 763521092);
        setIntElement(term4425, 2, 665076742);
        setIntElement(term4425, 3, 66292673);
        setIntElement(term4425, 4, 275037375);
        setIntElement(term4425, 5, 1545486489);
        setField(term4423, term4423.getClass(), "mag", term4425);
        setIntField(term4423, term4423.getClass(), "bitCountPlusOne", 0);
        setIntField(term4423, term4423.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4423, term4423.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4423, term4423.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4422, term4422.getClass(), "intVal", term4423);
        setIntField(term4422, term4422.getClass(), "scale", 52);
        setIntField(term4422, term4422.getClass(), "precision", 0);
        setField(term4422, term4422.getClass(), "stringCache", null);
        setLongField(term4422, term4422.getClass(), "intCompact", -9223372036854775808L);
        setField(term4383, term4383.getClass(), "price", term4422);
        setField(term4439, term4439.getClass(), "id", term4440);
        setField(term4439, term4439.getClass(), "firstName", "xtftXXMbem");
        setField(term4439, term4439.getClass(), "lastName", "cudZvLMQon");
        setField(term4439, term4439.getClass(), "email", "lihXWlGDxk");
        setField(term4383, term4383.getClass(), "author", term4439);
        term4478 = new Long(3892018155439224435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto$BookDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4478;
        callMethod(klass, "id", argTypes, term4383, args);
    }

};


