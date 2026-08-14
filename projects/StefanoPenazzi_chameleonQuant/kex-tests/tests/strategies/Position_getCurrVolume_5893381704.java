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

public class Position_getCurrVolume_5893381704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4787;

    public Position_getCurrVolume_5893381704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4850 = new ArrayList();
        Class<? extends Object> term4909 = Class.forName((String) "strategies.Position$PositionType");
        Field term4908 = ((Class) term4909).getDeclaredField((String) "LONG");
        ((Field) term4908).setAccessible(true);
        Object enum17 = ((Field) term4908).get((Object) null);
        term4787 = newInstance(Class.forName("strategies.Position"));
        Object term4788 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term4789 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term4790 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term4791 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term4795 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term4797 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term4801 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term4803 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term4807 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term4809 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term4811 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term4813 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term4816 = newInstance(Class.forName("java.util.Locale"));
        Object term4817 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term4831 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term4836 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term4845 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term4877 = newInstance(Class.forName("java.time.Instant"));
        Object term4880 = newInstance(Class.forName("java.time.Instant"));
        setField(term4791, term4791.getClass(), "field", null);
        setIntField(term4791, term4791.getClass(), "minWidth", 4);
        setIntField(term4791, term4791.getClass(), "maxWidth", 19);
        setField(term4791, term4791.getClass(), "signStyle", null);
        setIntField(term4791, term4791.getClass(), "subsequentWidth", 0);
        setElement(term4790, 0, term4791);
        setCharField(term4795, term4795.getClass(), "literal", (char) 45);
        setElement(term4790, 1, term4795);
        setField(term4797, term4797.getClass(), "field", null);
        setIntField(term4797, term4797.getClass(), "minWidth", 2);
        setIntField(term4797, term4797.getClass(), "maxWidth", 2);
        setField(term4797, term4797.getClass(), "signStyle", null);
        setIntField(term4797, term4797.getClass(), "subsequentWidth", 0);
        setElement(term4790, 2, term4797);
        setCharField(term4801, term4801.getClass(), "literal", (char) 45);
        setElement(term4790, 3, term4801);
        setField(term4803, term4803.getClass(), "field", null);
        setIntField(term4803, term4803.getClass(), "minWidth", 2);
        setIntField(term4803, term4803.getClass(), "maxWidth", 2);
        setField(term4803, term4803.getClass(), "signStyle", null);
        setIntField(term4803, term4803.getClass(), "subsequentWidth", 0);
        setElement(term4790, 4, term4803);
        setField(term4807, term4807.getClass(), "printerParsers", null);
        setBooleanField(term4807, term4807.getClass(), "optional", true);
        setElement(term4790, 5, term4807);
        setField(term4809, term4809.getClass(), "field", null);
        setLongField(term4809, term4809.getClass(), "value", 0L);
        setElement(term4790, 6, term4809);
        setField(term4811, term4811.getClass(), "field", null);
        setLongField(term4811, term4811.getClass(), "value", 0L);
        setElement(term4790, 7, term4811);
        setField(term4813, term4813.getClass(), "field", null);
        setLongField(term4813, term4813.getClass(), "value", 0L);
        setElement(term4790, 8, term4813);
        setField(term4789, term4789.getClass(), "printerParsers", term4790);
        setBooleanField(term4789, term4789.getClass(), "optional", false);
        setField(term4788, term4788.getClass(), "printerParser", term4789);
        setField(term4817, term4817.getClass(), "language", "");
        setField(term4817, term4817.getClass(), "script", "");
        setField(term4817, term4817.getClass(), "region", "");
        setField(term4817, term4817.getClass(), "variant", "");
        setIntField(term4817, term4817.getClass(), "hash", 106956076);
        setField(term4816, term4816.getClass(), "baseLocale", term4817);
        setField(term4816, term4816.getClass(), "localeExtensions", null);
        setIntField(term4816, term4816.getClass(), "hashCodeValue", 106956076);
        setField(term4816, term4816.getClass(), "languageTag", "pt-BR");
        setField(term4788, term4788.getClass(), "locale", term4816);
        setCharField(term4831, term4831.getClass(), "zeroDigit", (char) 48);
        setCharField(term4831, term4831.getClass(), "positiveSign", (char) 43);
        setCharField(term4831, term4831.getClass(), "negativeSign", (char) 45);
        setCharField(term4831, term4831.getClass(), "decimalSeparator", (char) 46);
        setField(term4788, term4788.getClass(), "decimalStyle", term4831);
        setField(term4836, term4836.getClass(), "name", "SMART");
        setIntField(term4836, term4836.getClass(), "ordinal", 1);
        setField(term4788, term4788.getClass(), "resolverStyle", term4836);
        setField(term4788, term4788.getClass(), "resolverFields", null);
        setField(term4788, term4788.getClass(), "chrono", null);
        setIntField(term4845, term4845.getClass(), "totalSeconds", 0);
        setField(term4845, term4845.getClass(), "id", "Z");
        setField(term4788, term4788.getClass(), "zone", term4845);
        setField(term4787, term4787.getClass(), "formatter", term4788);
        setField(term4787, term4787.getClass(), "signals", term4850);
        setField(term4787, term4787.getClass(), "pt", enum17);
        setField(term4787, term4787.getClass(), "sId", "ffYhPOzlUs");
        setIntField(term4787, term4787.getClass(), "initVolume", -1968847291);
        setIntField(term4787, term4787.getClass(), "currVolume", 579005622);
        setDoubleField(term4787, term4787.getClass(), "pr", 0.8454723071922143);
        setLongField(term4877, term4877.getClass(), "seconds", 1442370534L);
        setIntField(term4877, term4877.getClass(), "nanos", 632000000);
        setField(term4787, term4787.getClass(), "openInst", term4877);
        setLongField(term4880, term4880.getClass(), "seconds", 1659994192L);
        setIntField(term4880, term4880.getClass(), "nanos", 918000000);
        setField(term4787, term4787.getClass(), "closeInst", term4880);
        setBooleanField(term4787, term4787.getClass(), "open", false);
        setDoubleField(term4787, term4787.getClass(), "currWinLoss", 0.8566567697571895);
        setField(term4787, term4787.getClass(), "uuid", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrVolume", argTypes, term4787, args);
    }

};


