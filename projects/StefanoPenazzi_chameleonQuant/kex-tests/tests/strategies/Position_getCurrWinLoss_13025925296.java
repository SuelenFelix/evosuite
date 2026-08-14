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

public class Position_getCurrWinLoss_13025925296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5433;
     Object term5543;

    public Position_getCurrWinLoss_13025925296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5496 = new ArrayList();
        Class<? extends Object> term5557 = Class.forName((String) "strategies.Position$PositionType");
        Field term5556 = ((Class) term5557).getDeclaredField((String) "LONG");
        ((Field) term5556).setAccessible(true);
        Object enum19 = ((Field) term5556).get((Object) null);
        term5433 = newInstance(Class.forName("strategies.Position"));
        Object term5434 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term5435 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term5436 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term5437 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term5441 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term5443 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term5447 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term5449 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term5453 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term5455 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term5457 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term5459 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term5462 = newInstance(Class.forName("java.util.Locale"));
        Object term5463 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term5477 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term5482 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term5491 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term5523 = newInstance(Class.forName("java.time.Instant"));
        Object term5526 = newInstance(Class.forName("java.time.Instant"));
        setField(term5437, term5437.getClass(), "field", null);
        setIntField(term5437, term5437.getClass(), "minWidth", 4);
        setIntField(term5437, term5437.getClass(), "maxWidth", 19);
        setField(term5437, term5437.getClass(), "signStyle", null);
        setIntField(term5437, term5437.getClass(), "subsequentWidth", 0);
        setElement(term5436, 0, term5437);
        setCharField(term5441, term5441.getClass(), "literal", (char) 45);
        setElement(term5436, 1, term5441);
        setField(term5443, term5443.getClass(), "field", null);
        setIntField(term5443, term5443.getClass(), "minWidth", 2);
        setIntField(term5443, term5443.getClass(), "maxWidth", 2);
        setField(term5443, term5443.getClass(), "signStyle", null);
        setIntField(term5443, term5443.getClass(), "subsequentWidth", 0);
        setElement(term5436, 2, term5443);
        setCharField(term5447, term5447.getClass(), "literal", (char) 45);
        setElement(term5436, 3, term5447);
        setField(term5449, term5449.getClass(), "field", null);
        setIntField(term5449, term5449.getClass(), "minWidth", 2);
        setIntField(term5449, term5449.getClass(), "maxWidth", 2);
        setField(term5449, term5449.getClass(), "signStyle", null);
        setIntField(term5449, term5449.getClass(), "subsequentWidth", 0);
        setElement(term5436, 4, term5449);
        setField(term5453, term5453.getClass(), "printerParsers", null);
        setBooleanField(term5453, term5453.getClass(), "optional", true);
        setElement(term5436, 5, term5453);
        setField(term5455, term5455.getClass(), "field", null);
        setLongField(term5455, term5455.getClass(), "value", 0L);
        setElement(term5436, 6, term5455);
        setField(term5457, term5457.getClass(), "field", null);
        setLongField(term5457, term5457.getClass(), "value", 0L);
        setElement(term5436, 7, term5457);
        setField(term5459, term5459.getClass(), "field", null);
        setLongField(term5459, term5459.getClass(), "value", 0L);
        setElement(term5436, 8, term5459);
        setField(term5435, term5435.getClass(), "printerParsers", term5436);
        setBooleanField(term5435, term5435.getClass(), "optional", false);
        setField(term5434, term5434.getClass(), "printerParser", term5435);
        setField(term5463, term5463.getClass(), "language", "");
        setField(term5463, term5463.getClass(), "script", "");
        setField(term5463, term5463.getClass(), "region", "");
        setField(term5463, term5463.getClass(), "variant", "");
        setIntField(term5463, term5463.getClass(), "hash", 106956076);
        setField(term5462, term5462.getClass(), "baseLocale", term5463);
        setField(term5462, term5462.getClass(), "localeExtensions", null);
        setIntField(term5462, term5462.getClass(), "hashCodeValue", 106956076);
        setField(term5462, term5462.getClass(), "languageTag", "pt-BR");
        setField(term5434, term5434.getClass(), "locale", term5462);
        setCharField(term5477, term5477.getClass(), "zeroDigit", (char) 48);
        setCharField(term5477, term5477.getClass(), "positiveSign", (char) 43);
        setCharField(term5477, term5477.getClass(), "negativeSign", (char) 45);
        setCharField(term5477, term5477.getClass(), "decimalSeparator", (char) 46);
        setField(term5434, term5434.getClass(), "decimalStyle", term5477);
        setField(term5482, term5482.getClass(), "name", "SMART");
        setIntField(term5482, term5482.getClass(), "ordinal", 1);
        setField(term5434, term5434.getClass(), "resolverStyle", term5482);
        setField(term5434, term5434.getClass(), "resolverFields", null);
        setField(term5434, term5434.getClass(), "chrono", null);
        setIntField(term5491, term5491.getClass(), "totalSeconds", 0);
        setField(term5491, term5491.getClass(), "id", "Z");
        setField(term5434, term5434.getClass(), "zone", term5491);
        setField(term5433, term5433.getClass(), "formatter", term5434);
        setField(term5433, term5433.getClass(), "signals", term5496);
        setField(term5433, term5433.getClass(), "pt", enum19);
        setField(term5433, term5433.getClass(), "sId", "ieCtQFdkii");
        setIntField(term5433, term5433.getClass(), "initVolume", 454281060);
        setIntField(term5433, term5433.getClass(), "currVolume", -1786399638);
        setDoubleField(term5433, term5433.getClass(), "pr", 0.7919370314903882);
        setLongField(term5523, term5523.getClass(), "seconds", 1488725902L);
        setIntField(term5523, term5523.getClass(), "nanos", 101000000);
        setField(term5433, term5433.getClass(), "openInst", term5523);
        setLongField(term5526, term5526.getClass(), "seconds", 1311560117L);
        setIntField(term5526, term5526.getClass(), "nanos", 361000000);
        setField(term5433, term5433.getClass(), "closeInst", term5526);
        setBooleanField(term5433, term5433.getClass(), "open", false);
        setDoubleField(term5433, term5433.getClass(), "currWinLoss", 0.2109867221632754);
        setField(term5433, term5433.getClass(), "uuid", "dEnhdmILtU");
        term5543 = new Double(0.3227335400819148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term5543;
        callMethod(klass, "getCurrWinLoss", argTypes, term5433, args);
    }

};


