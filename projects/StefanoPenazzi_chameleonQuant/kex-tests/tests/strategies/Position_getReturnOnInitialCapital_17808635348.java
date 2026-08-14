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

public class Position_getReturnOnInitialCapital_17808635348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6075;

    public Position_getReturnOnInitialCapital_17808635348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6138 = new ArrayList();
        Class<? extends Object> term6198 = Class.forName((String) "strategies.Position$PositionType");
        Field term6197 = ((Class) term6198).getDeclaredField((String) "SHORT");
        ((Field) term6197).setAccessible(true);
        Object enum21 = ((Field) term6197).get((Object) null);
        term6075 = newInstance(Class.forName("strategies.Position"));
        Object term6076 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term6077 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term6078 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term6079 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term6083 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term6085 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term6089 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term6091 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term6095 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term6097 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term6099 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term6101 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term6104 = newInstance(Class.forName("java.util.Locale"));
        Object term6105 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6119 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term6124 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term6133 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term6166 = newInstance(Class.forName("java.time.Instant"));
        Object term6169 = newInstance(Class.forName("java.time.Instant"));
        setField(term6079, term6079.getClass(), "field", null);
        setIntField(term6079, term6079.getClass(), "minWidth", 4);
        setIntField(term6079, term6079.getClass(), "maxWidth", 19);
        setField(term6079, term6079.getClass(), "signStyle", null);
        setIntField(term6079, term6079.getClass(), "subsequentWidth", 0);
        setElement(term6078, 0, term6079);
        setCharField(term6083, term6083.getClass(), "literal", (char) 45);
        setElement(term6078, 1, term6083);
        setField(term6085, term6085.getClass(), "field", null);
        setIntField(term6085, term6085.getClass(), "minWidth", 2);
        setIntField(term6085, term6085.getClass(), "maxWidth", 2);
        setField(term6085, term6085.getClass(), "signStyle", null);
        setIntField(term6085, term6085.getClass(), "subsequentWidth", 0);
        setElement(term6078, 2, term6085);
        setCharField(term6089, term6089.getClass(), "literal", (char) 45);
        setElement(term6078, 3, term6089);
        setField(term6091, term6091.getClass(), "field", null);
        setIntField(term6091, term6091.getClass(), "minWidth", 2);
        setIntField(term6091, term6091.getClass(), "maxWidth", 2);
        setField(term6091, term6091.getClass(), "signStyle", null);
        setIntField(term6091, term6091.getClass(), "subsequentWidth", 0);
        setElement(term6078, 4, term6091);
        setField(term6095, term6095.getClass(), "printerParsers", null);
        setBooleanField(term6095, term6095.getClass(), "optional", true);
        setElement(term6078, 5, term6095);
        setField(term6097, term6097.getClass(), "field", null);
        setLongField(term6097, term6097.getClass(), "value", 0L);
        setElement(term6078, 6, term6097);
        setField(term6099, term6099.getClass(), "field", null);
        setLongField(term6099, term6099.getClass(), "value", 0L);
        setElement(term6078, 7, term6099);
        setField(term6101, term6101.getClass(), "field", null);
        setLongField(term6101, term6101.getClass(), "value", 0L);
        setElement(term6078, 8, term6101);
        setField(term6077, term6077.getClass(), "printerParsers", term6078);
        setBooleanField(term6077, term6077.getClass(), "optional", false);
        setField(term6076, term6076.getClass(), "printerParser", term6077);
        setField(term6105, term6105.getClass(), "language", "");
        setField(term6105, term6105.getClass(), "script", "");
        setField(term6105, term6105.getClass(), "region", "");
        setField(term6105, term6105.getClass(), "variant", "");
        setIntField(term6105, term6105.getClass(), "hash", 106956076);
        setField(term6104, term6104.getClass(), "baseLocale", term6105);
        setField(term6104, term6104.getClass(), "localeExtensions", null);
        setIntField(term6104, term6104.getClass(), "hashCodeValue", 106956076);
        setField(term6104, term6104.getClass(), "languageTag", "pt-BR");
        setField(term6076, term6076.getClass(), "locale", term6104);
        setCharField(term6119, term6119.getClass(), "zeroDigit", (char) 48);
        setCharField(term6119, term6119.getClass(), "positiveSign", (char) 43);
        setCharField(term6119, term6119.getClass(), "negativeSign", (char) 45);
        setCharField(term6119, term6119.getClass(), "decimalSeparator", (char) 46);
        setField(term6076, term6076.getClass(), "decimalStyle", term6119);
        setField(term6124, term6124.getClass(), "name", "SMART");
        setIntField(term6124, term6124.getClass(), "ordinal", 1);
        setField(term6076, term6076.getClass(), "resolverStyle", term6124);
        setField(term6076, term6076.getClass(), "resolverFields", null);
        setField(term6076, term6076.getClass(), "chrono", null);
        setIntField(term6133, term6133.getClass(), "totalSeconds", 0);
        setField(term6133, term6133.getClass(), "id", "Z");
        setField(term6076, term6076.getClass(), "zone", term6133);
        setField(term6075, term6075.getClass(), "formatter", term6076);
        setField(term6075, term6075.getClass(), "signals", term6138);
        setField(term6075, term6075.getClass(), "pt", enum21);
        setField(term6075, term6075.getClass(), "sId", "fhkbdRViHi");
        setIntField(term6075, term6075.getClass(), "initVolume", 292681826);
        setIntField(term6075, term6075.getClass(), "currVolume", 458147407);
        setDoubleField(term6075, term6075.getClass(), "pr", 0.9126850255993704);
        setLongField(term6166, term6166.getClass(), "seconds", 1405279189L);
        setIntField(term6166, term6166.getClass(), "nanos", 488000000);
        setField(term6075, term6075.getClass(), "openInst", term6166);
        setLongField(term6169, term6169.getClass(), "seconds", 1822704644L);
        setIntField(term6169, term6169.getClass(), "nanos", 50000000);
        setField(term6075, term6075.getClass(), "closeInst", term6169);
        setBooleanField(term6075, term6075.getClass(), "open", true);
        setDoubleField(term6075, term6075.getClass(), "currWinLoss", 0.11179067076100713);
        setField(term6075, term6075.getClass(), "uuid", "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReturnOnInitialCapital", argTypes, term6075, args);
    }

};


