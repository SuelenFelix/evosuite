package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class Position_getWinLoss_7571053587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5755;

    public Position_getWinLoss_7571053587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5818 = new ArrayList();
        Class<? extends Object> term5877 = Class.forName((String) "strategies.Position$PositionType");
        Field term5876 = ((Class) term5877).getDeclaredField((String) "LONG");
        ((Field) term5876).setAccessible(true);
        Object enum20 = ((Field) term5876).get((Object) null);
        term5755 = newInstance(Class.forName("strategies.Position"));
        Object term5756 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term5757 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term5758 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term5759 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term5763 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term5765 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term5769 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term5771 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term5775 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term5777 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term5779 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term5781 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term5784 = newInstance(Class.forName("java.util.Locale"));
        Object term5785 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term5799 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term5804 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term5813 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term5845 = newInstance(Class.forName("java.time.Instant"));
        Object term5848 = newInstance(Class.forName("java.time.Instant"));
        setField(term5759, term5759.getClass(), "field", null);
        setIntField(term5759, term5759.getClass(), "minWidth", 4);
        setIntField(term5759, term5759.getClass(), "maxWidth", 19);
        setField(term5759, term5759.getClass(), "signStyle", null);
        setIntField(term5759, term5759.getClass(), "subsequentWidth", 0);
        setElement(term5758, 0, term5759);
        setCharField(term5763, term5763.getClass(), "literal", (char) 45);
        setElement(term5758, 1, term5763);
        setField(term5765, term5765.getClass(), "field", null);
        setIntField(term5765, term5765.getClass(), "minWidth", 2);
        setIntField(term5765, term5765.getClass(), "maxWidth", 2);
        setField(term5765, term5765.getClass(), "signStyle", null);
        setIntField(term5765, term5765.getClass(), "subsequentWidth", 0);
        setElement(term5758, 2, term5765);
        setCharField(term5769, term5769.getClass(), "literal", (char) 45);
        setElement(term5758, 3, term5769);
        setField(term5771, term5771.getClass(), "field", null);
        setIntField(term5771, term5771.getClass(), "minWidth", 2);
        setIntField(term5771, term5771.getClass(), "maxWidth", 2);
        setField(term5771, term5771.getClass(), "signStyle", null);
        setIntField(term5771, term5771.getClass(), "subsequentWidth", 0);
        setElement(term5758, 4, term5771);
        setField(term5775, term5775.getClass(), "printerParsers", null);
        setBooleanField(term5775, term5775.getClass(), "optional", true);
        setElement(term5758, 5, term5775);
        setField(term5777, term5777.getClass(), "field", null);
        setLongField(term5777, term5777.getClass(), "value", 0L);
        setElement(term5758, 6, term5777);
        setField(term5779, term5779.getClass(), "field", null);
        setLongField(term5779, term5779.getClass(), "value", 0L);
        setElement(term5758, 7, term5779);
        setField(term5781, term5781.getClass(), "field", null);
        setLongField(term5781, term5781.getClass(), "value", 0L);
        setElement(term5758, 8, term5781);
        setField(term5757, term5757.getClass(), "printerParsers", term5758);
        setBooleanField(term5757, term5757.getClass(), "optional", false);
        setField(term5756, term5756.getClass(), "printerParser", term5757);
        setField(term5785, term5785.getClass(), "language", "");
        setField(term5785, term5785.getClass(), "script", "");
        setField(term5785, term5785.getClass(), "region", "");
        setField(term5785, term5785.getClass(), "variant", "");
        setIntField(term5785, term5785.getClass(), "hash", 106956076);
        setField(term5784, term5784.getClass(), "baseLocale", term5785);
        setField(term5784, term5784.getClass(), "localeExtensions", null);
        setIntField(term5784, term5784.getClass(), "hashCodeValue", 106956076);
        setField(term5784, term5784.getClass(), "languageTag", "pt-BR");
        setField(term5756, term5756.getClass(), "locale", term5784);
        setCharField(term5799, term5799.getClass(), "zeroDigit", (char) 48);
        setCharField(term5799, term5799.getClass(), "positiveSign", (char) 43);
        setCharField(term5799, term5799.getClass(), "negativeSign", (char) 45);
        setCharField(term5799, term5799.getClass(), "decimalSeparator", (char) 46);
        setField(term5756, term5756.getClass(), "decimalStyle", term5799);
        setField(term5804, term5804.getClass(), "name", "SMART");
        setIntField(term5804, term5804.getClass(), "ordinal", 1);
        setField(term5756, term5756.getClass(), "resolverStyle", term5804);
        setField(term5756, term5756.getClass(), "resolverFields", null);
        setField(term5756, term5756.getClass(), "chrono", null);
        setIntField(term5813, term5813.getClass(), "totalSeconds", 0);
        setField(term5813, term5813.getClass(), "id", "Z");
        setField(term5756, term5756.getClass(), "zone", term5813);
        setField(term5755, term5755.getClass(), "formatter", term5756);
        setField(term5755, term5755.getClass(), "signals", term5818);
        setField(term5755, term5755.getClass(), "pt", enum20);
        setField(term5755, term5755.getClass(), "sId", "hoicvmsovO");
        setIntField(term5755, term5755.getClass(), "initVolume", 2055867847);
        setIntField(term5755, term5755.getClass(), "currVolume", -1048298087);
        setDoubleField(term5755, term5755.getClass(), "pr", 0.43337207054070237);
        setLongField(term5845, term5845.getClass(), "seconds", 1595517583L);
        setIntField(term5845, term5845.getClass(), "nanos", 842000000);
        setField(term5755, term5755.getClass(), "openInst", term5845);
        setLongField(term5848, term5848.getClass(), "seconds", 1464421789L);
        setIntField(term5848, term5848.getClass(), "nanos", 888000000);
        setField(term5755, term5755.getClass(), "closeInst", term5848);
        setBooleanField(term5755, term5755.getClass(), "open", false);
        setDoubleField(term5755, term5755.getClass(), "currWinLoss", 0.13246999699526574);
        setField(term5755, term5755.getClass(), "uuid", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinLoss", argTypes, term5755, args);
    }

};


