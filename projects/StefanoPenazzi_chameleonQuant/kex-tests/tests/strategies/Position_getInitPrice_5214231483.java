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

public class Position_getInitPrice_5214231483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4463;

    public Position_getInitPrice_5214231483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4526 = new ArrayList();
        Class<? extends Object> term4586 = Class.forName((String) "strategies.Position$PositionType");
        Field term4585 = ((Class) term4586).getDeclaredField((String) "SHORT");
        ((Field) term4585).setAccessible(true);
        Object enum16 = ((Field) term4585).get((Object) null);
        term4463 = newInstance(Class.forName("strategies.Position"));
        Object term4464 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term4465 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term4466 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term4467 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term4471 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term4473 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term4477 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term4479 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term4483 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term4485 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term4487 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term4489 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term4492 = newInstance(Class.forName("java.util.Locale"));
        Object term4493 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term4507 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term4512 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term4521 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term4554 = newInstance(Class.forName("java.time.Instant"));
        Object term4557 = newInstance(Class.forName("java.time.Instant"));
        setField(term4467, term4467.getClass(), "field", null);
        setIntField(term4467, term4467.getClass(), "minWidth", 4);
        setIntField(term4467, term4467.getClass(), "maxWidth", 19);
        setField(term4467, term4467.getClass(), "signStyle", null);
        setIntField(term4467, term4467.getClass(), "subsequentWidth", 0);
        setElement(term4466, 0, term4467);
        setCharField(term4471, term4471.getClass(), "literal", (char) 45);
        setElement(term4466, 1, term4471);
        setField(term4473, term4473.getClass(), "field", null);
        setIntField(term4473, term4473.getClass(), "minWidth", 2);
        setIntField(term4473, term4473.getClass(), "maxWidth", 2);
        setField(term4473, term4473.getClass(), "signStyle", null);
        setIntField(term4473, term4473.getClass(), "subsequentWidth", 0);
        setElement(term4466, 2, term4473);
        setCharField(term4477, term4477.getClass(), "literal", (char) 45);
        setElement(term4466, 3, term4477);
        setField(term4479, term4479.getClass(), "field", null);
        setIntField(term4479, term4479.getClass(), "minWidth", 2);
        setIntField(term4479, term4479.getClass(), "maxWidth", 2);
        setField(term4479, term4479.getClass(), "signStyle", null);
        setIntField(term4479, term4479.getClass(), "subsequentWidth", 0);
        setElement(term4466, 4, term4479);
        setField(term4483, term4483.getClass(), "printerParsers", null);
        setBooleanField(term4483, term4483.getClass(), "optional", true);
        setElement(term4466, 5, term4483);
        setField(term4485, term4485.getClass(), "field", null);
        setLongField(term4485, term4485.getClass(), "value", 0L);
        setElement(term4466, 6, term4485);
        setField(term4487, term4487.getClass(), "field", null);
        setLongField(term4487, term4487.getClass(), "value", 0L);
        setElement(term4466, 7, term4487);
        setField(term4489, term4489.getClass(), "field", null);
        setLongField(term4489, term4489.getClass(), "value", 0L);
        setElement(term4466, 8, term4489);
        setField(term4465, term4465.getClass(), "printerParsers", term4466);
        setBooleanField(term4465, term4465.getClass(), "optional", false);
        setField(term4464, term4464.getClass(), "printerParser", term4465);
        setField(term4493, term4493.getClass(), "language", "");
        setField(term4493, term4493.getClass(), "script", "");
        setField(term4493, term4493.getClass(), "region", "");
        setField(term4493, term4493.getClass(), "variant", "");
        setIntField(term4493, term4493.getClass(), "hash", 106956076);
        setField(term4492, term4492.getClass(), "baseLocale", term4493);
        setField(term4492, term4492.getClass(), "localeExtensions", null);
        setIntField(term4492, term4492.getClass(), "hashCodeValue", 106956076);
        setField(term4492, term4492.getClass(), "languageTag", "pt-BR");
        setField(term4464, term4464.getClass(), "locale", term4492);
        setCharField(term4507, term4507.getClass(), "zeroDigit", (char) 48);
        setCharField(term4507, term4507.getClass(), "positiveSign", (char) 43);
        setCharField(term4507, term4507.getClass(), "negativeSign", (char) 45);
        setCharField(term4507, term4507.getClass(), "decimalSeparator", (char) 46);
        setField(term4464, term4464.getClass(), "decimalStyle", term4507);
        setField(term4512, term4512.getClass(), "name", "SMART");
        setIntField(term4512, term4512.getClass(), "ordinal", 1);
        setField(term4464, term4464.getClass(), "resolverStyle", term4512);
        setField(term4464, term4464.getClass(), "resolverFields", null);
        setField(term4464, term4464.getClass(), "chrono", null);
        setIntField(term4521, term4521.getClass(), "totalSeconds", 0);
        setField(term4521, term4521.getClass(), "id", "Z");
        setField(term4464, term4464.getClass(), "zone", term4521);
        setField(term4463, term4463.getClass(), "formatter", term4464);
        setField(term4463, term4463.getClass(), "signals", term4526);
        setField(term4463, term4463.getClass(), "pt", enum16);
        setField(term4463, term4463.getClass(), "sId", "onpbIeEKoi");
        setIntField(term4463, term4463.getClass(), "initVolume", -817164822);
        setIntField(term4463, term4463.getClass(), "currVolume", -1016503459);
        setDoubleField(term4463, term4463.getClass(), "pr", 0.15917839663695388);
        setLongField(term4554, term4554.getClass(), "seconds", 1496859828L);
        setIntField(term4554, term4554.getClass(), "nanos", 764000000);
        setField(term4463, term4463.getClass(), "openInst", term4554);
        setLongField(term4557, term4557.getClass(), "seconds", 1691868468L);
        setIntField(term4557, term4557.getClass(), "nanos", 367000000);
        setField(term4463, term4463.getClass(), "closeInst", term4557);
        setBooleanField(term4463, term4463.getClass(), "open", true);
        setDoubleField(term4463, term4463.getClass(), "currWinLoss", 0.9374115574082594);
        setField(term4463, term4463.getClass(), "uuid", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInitPrice", argTypes, term4463, args);
    }

};


