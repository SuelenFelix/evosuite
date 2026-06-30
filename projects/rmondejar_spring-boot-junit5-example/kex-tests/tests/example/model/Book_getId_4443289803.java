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

public class Book_getId_4443289803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4596;

    public Book_getId_4443289803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4597 = new Long(970120292495348028L);
        Long term4653 = new Long(77619432202128806L);
        Long term4694 = new Long(-1647156882669215876L);
        Object term4693 = newInstance(Class.forName("example.model.Book"));
        setField(term4693, term4693.getClass(), "id", term4694);
        setField(term4693, term4693.getClass(), "title", null);
        setField(term4693, term4693.getClass(), "description", null);
        setField(term4693, term4693.getClass(), "genre", null);
        setField(term4693, term4693.getClass(), "price", null);
        setField(term4693, term4693.getClass(), "author", null);
        Long term4697 = new Long(-6399462725251497844L);
        Object term4696 = newInstance(Class.forName("example.model.Book"));
        setField(term4696, term4696.getClass(), "id", term4697);
        setField(term4696, term4696.getClass(), "title", null);
        setField(term4696, term4696.getClass(), "description", null);
        setField(term4696, term4696.getClass(), "genre", null);
        setField(term4696, term4696.getClass(), "price", null);
        setField(term4696, term4696.getClass(), "author", null);
        ArrayList term4691 = new ArrayList();
        ((ArrayList) term4691).add(term4693);
        ((ArrayList) term4691).add(term4696);
        term4596 = newInstance(Class.forName("example.model.Book"));
        Object term4635 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4636 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4638 = (int[]) newIntArray(6);
        Object term4652 = newInstance(Class.forName("example.model.Author"));
        setField(term4596, term4596.getClass(), "id", term4597);
        setField(term4596, term4596.getClass(), "title", "fWMsLtuOEV");
        setField(term4596, term4596.getClass(), "description", "fvgZQBalnd");
        setField(term4596, term4596.getClass(), "genre", "tViQSKUCLE");
        setIntField(term4636, term4636.getClass(), "signum", 1);
        setIntElement(term4638, 0, 15785);
        setIntElement(term4638, 1, -1364521687);
        setIntElement(term4638, 2, -1049632157);
        setIntElement(term4638, 3, 1068180156);
        setIntElement(term4638, 4, 208883539);
        setIntElement(term4638, 5, 1774363417);
        setField(term4636, term4636.getClass(), "mag", term4638);
        setIntField(term4636, term4636.getClass(), "bitCountPlusOne", 0);
        setIntField(term4636, term4636.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4636, term4636.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4636, term4636.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4635, term4635.getClass(), "intVal", term4636);
        setIntField(term4635, term4635.getClass(), "scale", 53);
        setIntField(term4635, term4635.getClass(), "precision", 0);
        setField(term4635, term4635.getClass(), "stringCache", null);
        setLongField(term4635, term4635.getClass(), "intCompact", -9223372036854775808L);
        setField(term4596, term4596.getClass(), "price", term4635);
        setField(term4652, term4652.getClass(), "id", term4653);
        setField(term4652, term4652.getClass(), "firstName", "QbaeHheqiP");
        setField(term4652, term4652.getClass(), "lastName", "gASHxChKwn");
        setField(term4652, term4652.getClass(), "email", "iasolXlEEn");
        setField(term4652, term4652.getClass(), "books", term4691);
        setField(term4596, term4596.getClass(), "author", term4652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4596, args);
    }

};


