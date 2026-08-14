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

public class Position_printCsv_48746813810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6723;

    public Position_printCsv_48746813810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6786 = new ArrayList();
        Class<? extends Object> term6845 = Class.forName((String) "strategies.Position$PositionType");
        Field term6844 = ((Class) term6845).getDeclaredField((String) "LONG");
        ((Field) term6844).setAccessible(true);
        Object enum23 = ((Field) term6844).get((Object) null);
        term6723 = newInstance(Class.forName("strategies.Position"));
        Object term6724 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term6725 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term6726 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term6727 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term6731 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term6733 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term6737 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term6739 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term6743 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term6745 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term6747 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term6749 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term6752 = newInstance(Class.forName("java.util.Locale"));
        Object term6753 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6767 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term6772 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term6781 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term6813 = newInstance(Class.forName("java.time.Instant"));
        Object term6816 = newInstance(Class.forName("java.time.Instant"));
        setField(term6727, term6727.getClass(), "field", null);
        setIntField(term6727, term6727.getClass(), "minWidth", 4);
        setIntField(term6727, term6727.getClass(), "maxWidth", 19);
        setField(term6727, term6727.getClass(), "signStyle", null);
        setIntField(term6727, term6727.getClass(), "subsequentWidth", 0);
        setElement(term6726, 0, term6727);
        setCharField(term6731, term6731.getClass(), "literal", (char) 45);
        setElement(term6726, 1, term6731);
        setField(term6733, term6733.getClass(), "field", null);
        setIntField(term6733, term6733.getClass(), "minWidth", 2);
        setIntField(term6733, term6733.getClass(), "maxWidth", 2);
        setField(term6733, term6733.getClass(), "signStyle", null);
        setIntField(term6733, term6733.getClass(), "subsequentWidth", 0);
        setElement(term6726, 2, term6733);
        setCharField(term6737, term6737.getClass(), "literal", (char) 45);
        setElement(term6726, 3, term6737);
        setField(term6739, term6739.getClass(), "field", null);
        setIntField(term6739, term6739.getClass(), "minWidth", 2);
        setIntField(term6739, term6739.getClass(), "maxWidth", 2);
        setField(term6739, term6739.getClass(), "signStyle", null);
        setIntField(term6739, term6739.getClass(), "subsequentWidth", 0);
        setElement(term6726, 4, term6739);
        setField(term6743, term6743.getClass(), "printerParsers", null);
        setBooleanField(term6743, term6743.getClass(), "optional", true);
        setElement(term6726, 5, term6743);
        setField(term6745, term6745.getClass(), "field", null);
        setLongField(term6745, term6745.getClass(), "value", 0L);
        setElement(term6726, 6, term6745);
        setField(term6747, term6747.getClass(), "field", null);
        setLongField(term6747, term6747.getClass(), "value", 0L);
        setElement(term6726, 7, term6747);
        setField(term6749, term6749.getClass(), "field", null);
        setLongField(term6749, term6749.getClass(), "value", 0L);
        setElement(term6726, 8, term6749);
        setField(term6725, term6725.getClass(), "printerParsers", term6726);
        setBooleanField(term6725, term6725.getClass(), "optional", false);
        setField(term6724, term6724.getClass(), "printerParser", term6725);
        setField(term6753, term6753.getClass(), "language", "");
        setField(term6753, term6753.getClass(), "script", "");
        setField(term6753, term6753.getClass(), "region", "");
        setField(term6753, term6753.getClass(), "variant", "");
        setIntField(term6753, term6753.getClass(), "hash", 106956076);
        setField(term6752, term6752.getClass(), "baseLocale", term6753);
        setField(term6752, term6752.getClass(), "localeExtensions", null);
        setIntField(term6752, term6752.getClass(), "hashCodeValue", 106956076);
        setField(term6752, term6752.getClass(), "languageTag", "pt-BR");
        setField(term6724, term6724.getClass(), "locale", term6752);
        setCharField(term6767, term6767.getClass(), "zeroDigit", (char) 48);
        setCharField(term6767, term6767.getClass(), "positiveSign", (char) 43);
        setCharField(term6767, term6767.getClass(), "negativeSign", (char) 45);
        setCharField(term6767, term6767.getClass(), "decimalSeparator", (char) 46);
        setField(term6724, term6724.getClass(), "decimalStyle", term6767);
        setField(term6772, term6772.getClass(), "name", "SMART");
        setIntField(term6772, term6772.getClass(), "ordinal", 1);
        setField(term6724, term6724.getClass(), "resolverStyle", term6772);
        setField(term6724, term6724.getClass(), "resolverFields", null);
        setField(term6724, term6724.getClass(), "chrono", null);
        setIntField(term6781, term6781.getClass(), "totalSeconds", 0);
        setField(term6781, term6781.getClass(), "id", "Z");
        setField(term6724, term6724.getClass(), "zone", term6781);
        setField(term6723, term6723.getClass(), "formatter", term6724);
        setField(term6723, term6723.getClass(), "signals", term6786);
        setField(term6723, term6723.getClass(), "pt", enum23);
        setField(term6723, term6723.getClass(), "sId", "tPlsykYBqO");
        setIntField(term6723, term6723.getClass(), "initVolume", 1328271830);
        setIntField(term6723, term6723.getClass(), "currVolume", 1596070772);
        setDoubleField(term6723, term6723.getClass(), "pr", 0.025133051616627267);
        setLongField(term6813, term6813.getClass(), "seconds", 1426018874L);
        setIntField(term6813, term6813.getClass(), "nanos", 434000000);
        setField(term6723, term6723.getClass(), "openInst", term6813);
        setLongField(term6816, term6816.getClass(), "seconds", 1633004775L);
        setIntField(term6816, term6816.getClass(), "nanos", 487000000);
        setField(term6723, term6723.getClass(), "closeInst", term6816);
        setBooleanField(term6723, term6723.getClass(), "open", false);
        setDoubleField(term6723, term6723.getClass(), "currWinLoss", 0.016575281023182953);
        setField(term6723, term6723.getClass(), "uuid", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "printCsv", argTypes, term6723, args);
    }

};


