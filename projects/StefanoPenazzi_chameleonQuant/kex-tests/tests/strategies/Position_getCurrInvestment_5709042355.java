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
import java.lang.Double;

public class Position_getCurrInvestment_5709042355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5107;
     Object term5218;

    public Position_getCurrInvestment_5709042355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5170 = new ArrayList();
        Class<? extends Object> term5232 = Class.forName((String) "strategies.Position$PositionType");
        Field term5231 = ((Class) term5232).getDeclaredField((String) "SHORT");
        ((Field) term5231).setAccessible(true);
        Object enum18 = ((Field) term5231).get((Object) null);
        term5107 = newInstance(Class.forName("strategies.Position"));
        Object term5108 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term5109 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term5110 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term5111 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term5115 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term5117 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term5121 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term5123 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term5127 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term5129 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term5131 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term5133 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term5136 = newInstance(Class.forName("java.util.Locale"));
        Object term5137 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term5151 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term5156 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term5165 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term5198 = newInstance(Class.forName("java.time.Instant"));
        Object term5201 = newInstance(Class.forName("java.time.Instant"));
        setField(term5111, term5111.getClass(), "field", null);
        setIntField(term5111, term5111.getClass(), "minWidth", 4);
        setIntField(term5111, term5111.getClass(), "maxWidth", 19);
        setField(term5111, term5111.getClass(), "signStyle", null);
        setIntField(term5111, term5111.getClass(), "subsequentWidth", 0);
        setElement(term5110, 0, term5111);
        setCharField(term5115, term5115.getClass(), "literal", (char) 45);
        setElement(term5110, 1, term5115);
        setField(term5117, term5117.getClass(), "field", null);
        setIntField(term5117, term5117.getClass(), "minWidth", 2);
        setIntField(term5117, term5117.getClass(), "maxWidth", 2);
        setField(term5117, term5117.getClass(), "signStyle", null);
        setIntField(term5117, term5117.getClass(), "subsequentWidth", 0);
        setElement(term5110, 2, term5117);
        setCharField(term5121, term5121.getClass(), "literal", (char) 45);
        setElement(term5110, 3, term5121);
        setField(term5123, term5123.getClass(), "field", null);
        setIntField(term5123, term5123.getClass(), "minWidth", 2);
        setIntField(term5123, term5123.getClass(), "maxWidth", 2);
        setField(term5123, term5123.getClass(), "signStyle", null);
        setIntField(term5123, term5123.getClass(), "subsequentWidth", 0);
        setElement(term5110, 4, term5123);
        setField(term5127, term5127.getClass(), "printerParsers", null);
        setBooleanField(term5127, term5127.getClass(), "optional", true);
        setElement(term5110, 5, term5127);
        setField(term5129, term5129.getClass(), "field", null);
        setLongField(term5129, term5129.getClass(), "value", 0L);
        setElement(term5110, 6, term5129);
        setField(term5131, term5131.getClass(), "field", null);
        setLongField(term5131, term5131.getClass(), "value", 0L);
        setElement(term5110, 7, term5131);
        setField(term5133, term5133.getClass(), "field", null);
        setLongField(term5133, term5133.getClass(), "value", 0L);
        setElement(term5110, 8, term5133);
        setField(term5109, term5109.getClass(), "printerParsers", term5110);
        setBooleanField(term5109, term5109.getClass(), "optional", false);
        setField(term5108, term5108.getClass(), "printerParser", term5109);
        setField(term5137, term5137.getClass(), "language", "");
        setField(term5137, term5137.getClass(), "script", "");
        setField(term5137, term5137.getClass(), "region", "");
        setField(term5137, term5137.getClass(), "variant", "");
        setIntField(term5137, term5137.getClass(), "hash", 106956076);
        setField(term5136, term5136.getClass(), "baseLocale", term5137);
        setField(term5136, term5136.getClass(), "localeExtensions", null);
        setIntField(term5136, term5136.getClass(), "hashCodeValue", 106956076);
        setField(term5136, term5136.getClass(), "languageTag", "pt-BR");
        setField(term5108, term5108.getClass(), "locale", term5136);
        setCharField(term5151, term5151.getClass(), "zeroDigit", (char) 48);
        setCharField(term5151, term5151.getClass(), "positiveSign", (char) 43);
        setCharField(term5151, term5151.getClass(), "negativeSign", (char) 45);
        setCharField(term5151, term5151.getClass(), "decimalSeparator", (char) 46);
        setField(term5108, term5108.getClass(), "decimalStyle", term5151);
        setField(term5156, term5156.getClass(), "name", "SMART");
        setIntField(term5156, term5156.getClass(), "ordinal", 1);
        setField(term5108, term5108.getClass(), "resolverStyle", term5156);
        setField(term5108, term5108.getClass(), "resolverFields", null);
        setField(term5108, term5108.getClass(), "chrono", null);
        setIntField(term5165, term5165.getClass(), "totalSeconds", 0);
        setField(term5165, term5165.getClass(), "id", "Z");
        setField(term5108, term5108.getClass(), "zone", term5165);
        setField(term5107, term5107.getClass(), "formatter", term5108);
        setField(term5107, term5107.getClass(), "signals", term5170);
        setField(term5107, term5107.getClass(), "pt", enum18);
        setField(term5107, term5107.getClass(), "sId", "ytSBIKXogI");
        setIntField(term5107, term5107.getClass(), "initVolume", -14890619);
        setIntField(term5107, term5107.getClass(), "currVolume", 1632125673);
        setDoubleField(term5107, term5107.getClass(), "pr", 0.9203805380592256);
        setLongField(term5198, term5198.getClass(), "seconds", 1876872800L);
        setIntField(term5198, term5198.getClass(), "nanos", 559000000);
        setField(term5107, term5107.getClass(), "openInst", term5198);
        setLongField(term5201, term5201.getClass(), "seconds", 1304532099L);
        setIntField(term5201, term5201.getClass(), "nanos", 366000000);
        setField(term5107, term5107.getClass(), "closeInst", term5201);
        setBooleanField(term5107, term5107.getClass(), "open", true);
        setDoubleField(term5107, term5107.getClass(), "currWinLoss", 0.5804948995371725);
        setField(term5107, term5107.getClass(), "uuid", "nHXjMycHlU");
        term5218 = new Double(0.20737514139742264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term5218;
        callMethod(klass, "getCurrInvestment", argTypes, term5107, args);
    }

};


