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

public class BookDto_BookDtoBuilder_toString_14828665208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5670;

    public BookDto_BookDtoBuilder_toString_14828665208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5671 = new Long(6682528376118987775L);
        Long term5727 = new Long(682356318767179819L);
        term5670 = newInstance(Class.forName("example.dto.BookDto$BookDtoBuilder"));
        Object term5709 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5710 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5712 = (int[]) newIntArray(6);
        Object term5726 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term5670, term5670.getClass(), "id", term5671);
        setField(term5670, term5670.getClass(), "title", "SFqCrhEWLm");
        setField(term5670, term5670.getClass(), "description", "GZdcJyZntS");
        setField(term5670, term5670.getClass(), "genre", "OIHoJeysUi");
        setIntField(term5710, term5710.getClass(), "signum", 1);
        setIntElement(term5712, 0, 3996);
        setIntElement(term5712, 1, 1627046923);
        setIntElement(term5712, 2, -1280614629);
        setIntElement(term5712, 3, 917260100);
        setIntElement(term5712, 4, -74841886);
        setIntElement(term5712, 5, 597293319);
        setField(term5710, term5710.getClass(), "mag", term5712);
        setIntField(term5710, term5710.getClass(), "bitCountPlusOne", 0);
        setIntField(term5710, term5710.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5710, term5710.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5710, term5710.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5709, term5709.getClass(), "intVal", term5710);
        setIntField(term5709, term5709.getClass(), "scale", 52);
        setIntField(term5709, term5709.getClass(), "precision", 0);
        setField(term5709, term5709.getClass(), "stringCache", null);
        setLongField(term5709, term5709.getClass(), "intCompact", -9223372036854775808L);
        setField(term5670, term5670.getClass(), "price", term5709);
        setField(term5726, term5726.getClass(), "id", term5727);
        setField(term5726, term5726.getClass(), "firstName", "WXMWFDGcLB");
        setField(term5726, term5726.getClass(), "lastName", "wKWbJssZuG");
        setField(term5726, term5726.getClass(), "email", "NzBMMhkhpT");
        setField(term5670, term5670.getClass(), "author", term5726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto$BookDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5670, args);
    }

};


