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

public class Position_print_9151802469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6399;

    public Position_print_9151802469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6462 = new ArrayList();
        Class<? extends Object> term6522 = Class.forName((String) "strategies.Position$PositionType");
        Field term6521 = ((Class) term6522).getDeclaredField((String) "SHORT");
        ((Field) term6521).setAccessible(true);
        Object enum22 = ((Field) term6521).get((Object) null);
        term6399 = newInstance(Class.forName("strategies.Position"));
        Object term6400 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term6401 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term6402 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term6403 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term6407 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term6409 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term6413 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term6415 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term6419 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term6421 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term6423 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term6425 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term6428 = newInstance(Class.forName("java.util.Locale"));
        Object term6429 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6443 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term6448 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term6457 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term6490 = newInstance(Class.forName("java.time.Instant"));
        Object term6493 = newInstance(Class.forName("java.time.Instant"));
        setField(term6403, term6403.getClass(), "field", null);
        setIntField(term6403, term6403.getClass(), "minWidth", 4);
        setIntField(term6403, term6403.getClass(), "maxWidth", 19);
        setField(term6403, term6403.getClass(), "signStyle", null);
        setIntField(term6403, term6403.getClass(), "subsequentWidth", 0);
        setElement(term6402, 0, term6403);
        setCharField(term6407, term6407.getClass(), "literal", (char) 45);
        setElement(term6402, 1, term6407);
        setField(term6409, term6409.getClass(), "field", null);
        setIntField(term6409, term6409.getClass(), "minWidth", 2);
        setIntField(term6409, term6409.getClass(), "maxWidth", 2);
        setField(term6409, term6409.getClass(), "signStyle", null);
        setIntField(term6409, term6409.getClass(), "subsequentWidth", 0);
        setElement(term6402, 2, term6409);
        setCharField(term6413, term6413.getClass(), "literal", (char) 45);
        setElement(term6402, 3, term6413);
        setField(term6415, term6415.getClass(), "field", null);
        setIntField(term6415, term6415.getClass(), "minWidth", 2);
        setIntField(term6415, term6415.getClass(), "maxWidth", 2);
        setField(term6415, term6415.getClass(), "signStyle", null);
        setIntField(term6415, term6415.getClass(), "subsequentWidth", 0);
        setElement(term6402, 4, term6415);
        setField(term6419, term6419.getClass(), "printerParsers", null);
        setBooleanField(term6419, term6419.getClass(), "optional", true);
        setElement(term6402, 5, term6419);
        setField(term6421, term6421.getClass(), "field", null);
        setLongField(term6421, term6421.getClass(), "value", 0L);
        setElement(term6402, 6, term6421);
        setField(term6423, term6423.getClass(), "field", null);
        setLongField(term6423, term6423.getClass(), "value", 0L);
        setElement(term6402, 7, term6423);
        setField(term6425, term6425.getClass(), "field", null);
        setLongField(term6425, term6425.getClass(), "value", 0L);
        setElement(term6402, 8, term6425);
        setField(term6401, term6401.getClass(), "printerParsers", term6402);
        setBooleanField(term6401, term6401.getClass(), "optional", false);
        setField(term6400, term6400.getClass(), "printerParser", term6401);
        setField(term6429, term6429.getClass(), "language", "");
        setField(term6429, term6429.getClass(), "script", "");
        setField(term6429, term6429.getClass(), "region", "");
        setField(term6429, term6429.getClass(), "variant", "");
        setIntField(term6429, term6429.getClass(), "hash", 106956076);
        setField(term6428, term6428.getClass(), "baseLocale", term6429);
        setField(term6428, term6428.getClass(), "localeExtensions", null);
        setIntField(term6428, term6428.getClass(), "hashCodeValue", 106956076);
        setField(term6428, term6428.getClass(), "languageTag", "pt-BR");
        setField(term6400, term6400.getClass(), "locale", term6428);
        setCharField(term6443, term6443.getClass(), "zeroDigit", (char) 48);
        setCharField(term6443, term6443.getClass(), "positiveSign", (char) 43);
        setCharField(term6443, term6443.getClass(), "negativeSign", (char) 45);
        setCharField(term6443, term6443.getClass(), "decimalSeparator", (char) 46);
        setField(term6400, term6400.getClass(), "decimalStyle", term6443);
        setField(term6448, term6448.getClass(), "name", "SMART");
        setIntField(term6448, term6448.getClass(), "ordinal", 1);
        setField(term6400, term6400.getClass(), "resolverStyle", term6448);
        setField(term6400, term6400.getClass(), "resolverFields", null);
        setField(term6400, term6400.getClass(), "chrono", null);
        setIntField(term6457, term6457.getClass(), "totalSeconds", 0);
        setField(term6457, term6457.getClass(), "id", "Z");
        setField(term6400, term6400.getClass(), "zone", term6457);
        setField(term6399, term6399.getClass(), "formatter", term6400);
        setField(term6399, term6399.getClass(), "signals", term6462);
        setField(term6399, term6399.getClass(), "pt", enum22);
        setField(term6399, term6399.getClass(), "sId", "kBdSllIBVz");
        setIntField(term6399, term6399.getClass(), "initVolume", -184153539);
        setIntField(term6399, term6399.getClass(), "currVolume", 493620644);
        setDoubleField(term6399, term6399.getClass(), "pr", 0.5306473989087822);
        setLongField(term6490, term6490.getClass(), "seconds", 1678177615L);
        setIntField(term6490, term6490.getClass(), "nanos", 298000000);
        setField(term6399, term6399.getClass(), "openInst", term6490);
        setLongField(term6493, term6493.getClass(), "seconds", 1666076287L);
        setIntField(term6493, term6493.getClass(), "nanos", 186000000);
        setField(term6399, term6399.getClass(), "closeInst", term6493);
        setBooleanField(term6399, term6399.getClass(), "open", true);
        setDoubleField(term6399, term6399.getClass(), "currWinLoss", 0.022483645678509023);
        setField(term6399, term6399.getClass(), "uuid", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "print", argTypes, term6399, args);
    }

};


