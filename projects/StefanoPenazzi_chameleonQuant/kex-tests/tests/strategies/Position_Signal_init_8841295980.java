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

public class Position_Signal_init_8841295980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2006;
     Object enum7;
     Object term2147;
     Object term2149;
     Object term2151;

    public Position_Signal_init_8841295980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2069 = new ArrayList();
        Class<? extends Object> term2166 = Class.forName((String) "strategies.Position$PositionType");
        Field term2165 = ((Class) term2166).getDeclaredField((String) "LONG");
        ((Field) term2165).setAccessible(true);
        Object enum6 = ((Field) term2165).get((Object) null);
        term2006 = newInstance(Class.forName("strategies.Position"));
        Object term2007 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term2008 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term2009 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term2010 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term2014 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term2016 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term2020 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term2022 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term2026 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term2028 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term2030 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term2032 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term2035 = newInstance(Class.forName("java.util.Locale"));
        Object term2036 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2050 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term2055 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term2064 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2096 = newInstance(Class.forName("java.time.Instant"));
        Object term2099 = newInstance(Class.forName("java.time.Instant"));
        setField(term2010, term2010.getClass(), "field", null);
        setIntField(term2010, term2010.getClass(), "minWidth", 4);
        setIntField(term2010, term2010.getClass(), "maxWidth", 19);
        setField(term2010, term2010.getClass(), "signStyle", null);
        setIntField(term2010, term2010.getClass(), "subsequentWidth", 0);
        setElement(term2009, 0, term2010);
        setCharField(term2014, term2014.getClass(), "literal", (char) 45);
        setElement(term2009, 1, term2014);
        setField(term2016, term2016.getClass(), "field", null);
        setIntField(term2016, term2016.getClass(), "minWidth", 2);
        setIntField(term2016, term2016.getClass(), "maxWidth", 2);
        setField(term2016, term2016.getClass(), "signStyle", null);
        setIntField(term2016, term2016.getClass(), "subsequentWidth", 0);
        setElement(term2009, 2, term2016);
        setCharField(term2020, term2020.getClass(), "literal", (char) 45);
        setElement(term2009, 3, term2020);
        setField(term2022, term2022.getClass(), "field", null);
        setIntField(term2022, term2022.getClass(), "minWidth", 2);
        setIntField(term2022, term2022.getClass(), "maxWidth", 2);
        setField(term2022, term2022.getClass(), "signStyle", null);
        setIntField(term2022, term2022.getClass(), "subsequentWidth", 0);
        setElement(term2009, 4, term2022);
        setField(term2026, term2026.getClass(), "printerParsers", null);
        setBooleanField(term2026, term2026.getClass(), "optional", true);
        setElement(term2009, 5, term2026);
        setField(term2028, term2028.getClass(), "field", null);
        setLongField(term2028, term2028.getClass(), "value", 0L);
        setElement(term2009, 6, term2028);
        setField(term2030, term2030.getClass(), "field", null);
        setLongField(term2030, term2030.getClass(), "value", 0L);
        setElement(term2009, 7, term2030);
        setField(term2032, term2032.getClass(), "field", null);
        setLongField(term2032, term2032.getClass(), "value", 0L);
        setElement(term2009, 8, term2032);
        setField(term2008, term2008.getClass(), "printerParsers", term2009);
        setBooleanField(term2008, term2008.getClass(), "optional", false);
        setField(term2007, term2007.getClass(), "printerParser", term2008);
        setField(term2036, term2036.getClass(), "language", "");
        setField(term2036, term2036.getClass(), "script", "");
        setField(term2036, term2036.getClass(), "region", "");
        setField(term2036, term2036.getClass(), "variant", "");
        setIntField(term2036, term2036.getClass(), "hash", 106956076);
        setField(term2035, term2035.getClass(), "baseLocale", term2036);
        setField(term2035, term2035.getClass(), "localeExtensions", null);
        setIntField(term2035, term2035.getClass(), "hashCodeValue", 106956076);
        setField(term2035, term2035.getClass(), "languageTag", "pt-BR");
        setField(term2007, term2007.getClass(), "locale", term2035);
        setCharField(term2050, term2050.getClass(), "zeroDigit", (char) 48);
        setCharField(term2050, term2050.getClass(), "positiveSign", (char) 43);
        setCharField(term2050, term2050.getClass(), "negativeSign", (char) 45);
        setCharField(term2050, term2050.getClass(), "decimalSeparator", (char) 46);
        setField(term2007, term2007.getClass(), "decimalStyle", term2050);
        setField(term2055, term2055.getClass(), "name", "SMART");
        setIntField(term2055, term2055.getClass(), "ordinal", 1);
        setField(term2007, term2007.getClass(), "resolverStyle", term2055);
        setField(term2007, term2007.getClass(), "resolverFields", null);
        setField(term2007, term2007.getClass(), "chrono", null);
        setIntField(term2064, term2064.getClass(), "totalSeconds", 0);
        setField(term2064, term2064.getClass(), "id", "Z");
        setField(term2007, term2007.getClass(), "zone", term2064);
        setField(term2006, term2006.getClass(), "formatter", term2007);
        setField(term2006, term2006.getClass(), "signals", term2069);
        setField(term2006, term2006.getClass(), "pt", enum6);
        setField(term2006, term2006.getClass(), "sId", "SbAoxhfrkn");
        setIntField(term2006, term2006.getClass(), "initVolume", -469968304);
        setIntField(term2006, term2006.getClass(), "currVolume", -1145578966);
        setDoubleField(term2006, term2006.getClass(), "pr", 0.11493000848982304);
        setLongField(term2096, term2096.getClass(), "seconds", 1882638884L);
        setIntField(term2096, term2096.getClass(), "nanos", 364000000);
        setField(term2006, term2006.getClass(), "openInst", term2096);
        setLongField(term2099, term2099.getClass(), "seconds", 1437757323L);
        setIntField(term2099, term2099.getClass(), "nanos", 580000000);
        setField(term2006, term2006.getClass(), "closeInst", term2099);
        setBooleanField(term2006, term2006.getClass(), "open", false);
        setDoubleField(term2006, term2006.getClass(), "currWinLoss", 0.37161417339133307);
        setField(term2006, term2006.getClass(), "uuid", "kuTXqwMtDB");
        Class<? extends Object> term2385 = Class.forName((String) "strategies.Position$Action");
        Field term2384 = ((Class) term2385).getDeclaredField((String) "BUY");
        ((Field) term2384).setAccessible(true);
        enum7 = ((Field) term2384).get((Object) null);
        term2147 = new Double(0.6805867182029153);
        term2149 = new Double(0.2852810965221698);
        term2151 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term2151, term2151.getClass(), "seconds", 1668569229L);
        setIntField(term2151, term2151.getClass(), "nanos", 825000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Signal");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("strategies.Position");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("strategies.Position$Action");
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = Class.forName("java.time.Instant");
        Object[] args = new Object[7];
        args[0] = term2006;
        args[1] = "Ghbwtircqb";
        args[2] = "xrwlQZdwCp";
        args[3] = enum7;
        args[4] = term2147;
        args[5] = term2149;
        args[6] = term2151;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


