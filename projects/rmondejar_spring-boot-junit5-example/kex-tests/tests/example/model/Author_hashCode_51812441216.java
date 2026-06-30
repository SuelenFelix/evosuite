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

public class Author_hashCode_51812441216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2672;

    public Author_hashCode_51812441216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2673 = new Long(-3602825674339018793L);
        Long term2714 = new Long(3086974592680165932L);
        Long term2724 = new Long(-532956263280568707L);
        Object term2713 = newInstance(Class.forName("example.model.Book"));
        Object term2719 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2723 = newInstance(Class.forName("example.model.Author"));
        setField(term2713, term2713.getClass(), "id", term2714);
        setField(term2713, term2713.getClass(), "title", "");
        setField(term2713, term2713.getClass(), "description", "");
        setField(term2713, term2713.getClass(), "genre", "");
        setField(term2719, term2719.getClass(), "intVal", null);
        setIntField(term2719, term2719.getClass(), "scale", 53);
        setIntField(term2719, term2719.getClass(), "precision", 0);
        setField(term2719, term2719.getClass(), "stringCache", null);
        setLongField(term2719, term2719.getClass(), "intCompact", -9223372036854775808L);
        setField(term2713, term2713.getClass(), "price", term2719);
        setField(term2723, term2723.getClass(), "id", term2724);
        setField(term2723, term2723.getClass(), "firstName", null);
        setField(term2723, term2723.getClass(), "lastName", null);
        setField(term2723, term2723.getClass(), "email", null);
        setField(term2723, term2723.getClass(), "books", null);
        setField(term2713, term2713.getClass(), "author", term2723);
        Long term2727 = new Long(6073193746616629086L);
        Long term2737 = new Long(-2463629530824341661L);
        Object term2726 = newInstance(Class.forName("example.model.Book"));
        Object term2732 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2736 = newInstance(Class.forName("example.model.Author"));
        setField(term2726, term2726.getClass(), "id", term2727);
        setField(term2726, term2726.getClass(), "title", "");
        setField(term2726, term2726.getClass(), "description", "");
        setField(term2726, term2726.getClass(), "genre", "");
        setField(term2732, term2732.getClass(), "intVal", null);
        setIntField(term2732, term2732.getClass(), "scale", 53);
        setIntField(term2732, term2732.getClass(), "precision", 0);
        setField(term2732, term2732.getClass(), "stringCache", null);
        setLongField(term2732, term2732.getClass(), "intCompact", -9223372036854775808L);
        setField(term2726, term2726.getClass(), "price", term2732);
        setField(term2736, term2736.getClass(), "id", term2737);
        setField(term2736, term2736.getClass(), "firstName", null);
        setField(term2736, term2736.getClass(), "lastName", null);
        setField(term2736, term2736.getClass(), "email", null);
        setField(term2736, term2736.getClass(), "books", null);
        setField(term2726, term2726.getClass(), "author", term2736);
        Long term2740 = new Long(-5871746020807491998L);
        Object term2739 = newInstance(Class.forName("example.model.Book"));
        Object term2745 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2749 = newInstance(Class.forName("example.model.Author"));
        setField(term2739, term2739.getClass(), "id", term2740);
        setField(term2739, term2739.getClass(), "title", "");
        setField(term2739, term2739.getClass(), "description", "");
        setField(term2739, term2739.getClass(), "genre", "");
        setField(term2745, term2745.getClass(), "intVal", null);
        setIntField(term2745, term2745.getClass(), "scale", 53);
        setIntField(term2745, term2745.getClass(), "precision", 0);
        setField(term2745, term2745.getClass(), "stringCache", null);
        setLongField(term2745, term2745.getClass(), "intCompact", -9223372036854775808L);
        setField(term2739, term2739.getClass(), "price", term2745);
        setField(term2749, term2749.getClass(), "id", null);
        setField(term2749, term2749.getClass(), "firstName", null);
        setField(term2749, term2749.getClass(), "lastName", null);
        setField(term2749, term2749.getClass(), "email", null);
        setField(term2749, term2749.getClass(), "books", null);
        setField(term2739, term2739.getClass(), "author", term2749);
        Long term2751 = new Long(3746481521207337771L);
        Object term2750 = newInstance(Class.forName("example.model.Book"));
        Object term2756 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2760 = newInstance(Class.forName("example.model.Author"));
        setField(term2750, term2750.getClass(), "id", term2751);
        setField(term2750, term2750.getClass(), "title", "");
        setField(term2750, term2750.getClass(), "description", "");
        setField(term2750, term2750.getClass(), "genre", "");
        setField(term2756, term2756.getClass(), "intVal", null);
        setIntField(term2756, term2756.getClass(), "scale", 53);
        setIntField(term2756, term2756.getClass(), "precision", 0);
        setField(term2756, term2756.getClass(), "stringCache", null);
        setLongField(term2756, term2756.getClass(), "intCompact", -9223372036854775808L);
        setField(term2750, term2750.getClass(), "price", term2756);
        setField(term2760, term2760.getClass(), "id", null);
        setField(term2760, term2760.getClass(), "firstName", null);
        setField(term2760, term2760.getClass(), "lastName", null);
        setField(term2760, term2760.getClass(), "email", null);
        setField(term2760, term2760.getClass(), "books", null);
        setField(term2750, term2750.getClass(), "author", term2760);
        Long term2762 = new Long(5797412846146719084L);
        Long term2772 = new Long(5319740127125920367L);
        Object term2761 = newInstance(Class.forName("example.model.Book"));
        Object term2767 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2771 = newInstance(Class.forName("example.model.Author"));
        setField(term2761, term2761.getClass(), "id", term2762);
        setField(term2761, term2761.getClass(), "title", "");
        setField(term2761, term2761.getClass(), "description", "");
        setField(term2761, term2761.getClass(), "genre", "");
        setField(term2767, term2767.getClass(), "intVal", null);
        setIntField(term2767, term2767.getClass(), "scale", 53);
        setIntField(term2767, term2767.getClass(), "precision", 0);
        setField(term2767, term2767.getClass(), "stringCache", null);
        setLongField(term2767, term2767.getClass(), "intCompact", -9223372036854775808L);
        setField(term2761, term2761.getClass(), "price", term2767);
        setField(term2771, term2771.getClass(), "id", term2772);
        setField(term2771, term2771.getClass(), "firstName", null);
        setField(term2771, term2771.getClass(), "lastName", null);
        setField(term2771, term2771.getClass(), "email", null);
        setField(term2771, term2771.getClass(), "books", null);
        setField(term2761, term2761.getClass(), "author", term2771);
        ArrayList term2711 = new ArrayList();
        ((ArrayList) term2711).add(term2713);
        ((ArrayList) term2711).add(term2726);
        ((ArrayList) term2711).add(term2726);
        ((ArrayList) term2711).add(term2726);
        ((ArrayList) term2711).add(term2739);
        ((ArrayList) term2711).add(term2750);
        ((ArrayList) term2711).add(term2750);
        ((ArrayList) term2711).add(term2761);
        ((ArrayList) term2711).add(term2739);
        term2672 = newInstance(Class.forName("example.model.Author"));
        setField(term2672, term2672.getClass(), "id", term2673);
        setField(term2672, term2672.getClass(), "firstName", "TuLgwTZsPP");
        setField(term2672, term2672.getClass(), "lastName", "KoasxTJGpx");
        setField(term2672, term2672.getClass(), "email", "ceGeARYMoa");
        setField(term2672, term2672.getClass(), "books", term2711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2672, args);
    }

};


