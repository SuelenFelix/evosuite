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

public class Position_getInitVolume_7886952722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4143;

    public Position_getInitVolume_7886952722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4206 = new ArrayList();
        Class<? extends Object> term4265 = Class.forName((String) "strategies.Position$PositionType");
        Field term4264 = ((Class) term4265).getDeclaredField((String) "LONG");
        ((Field) term4264).setAccessible(true);
        Object enum15 = ((Field) term4264).get((Object) null);
        term4143 = newInstance(Class.forName("strategies.Position"));
        Object term4144 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term4145 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term4146 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term4147 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term4151 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term4153 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term4157 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term4159 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term4163 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term4165 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term4167 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term4169 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term4172 = newInstance(Class.forName("java.util.Locale"));
        Object term4173 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term4187 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term4192 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term4201 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term4233 = newInstance(Class.forName("java.time.Instant"));
        Object term4236 = newInstance(Class.forName("java.time.Instant"));
        setField(term4147, term4147.getClass(), "field", null);
        setIntField(term4147, term4147.getClass(), "minWidth", 4);
        setIntField(term4147, term4147.getClass(), "maxWidth", 19);
        setField(term4147, term4147.getClass(), "signStyle", null);
        setIntField(term4147, term4147.getClass(), "subsequentWidth", 0);
        setElement(term4146, 0, term4147);
        setCharField(term4151, term4151.getClass(), "literal", (char) 45);
        setElement(term4146, 1, term4151);
        setField(term4153, term4153.getClass(), "field", null);
        setIntField(term4153, term4153.getClass(), "minWidth", 2);
        setIntField(term4153, term4153.getClass(), "maxWidth", 2);
        setField(term4153, term4153.getClass(), "signStyle", null);
        setIntField(term4153, term4153.getClass(), "subsequentWidth", 0);
        setElement(term4146, 2, term4153);
        setCharField(term4157, term4157.getClass(), "literal", (char) 45);
        setElement(term4146, 3, term4157);
        setField(term4159, term4159.getClass(), "field", null);
        setIntField(term4159, term4159.getClass(), "minWidth", 2);
        setIntField(term4159, term4159.getClass(), "maxWidth", 2);
        setField(term4159, term4159.getClass(), "signStyle", null);
        setIntField(term4159, term4159.getClass(), "subsequentWidth", 0);
        setElement(term4146, 4, term4159);
        setField(term4163, term4163.getClass(), "printerParsers", null);
        setBooleanField(term4163, term4163.getClass(), "optional", true);
        setElement(term4146, 5, term4163);
        setField(term4165, term4165.getClass(), "field", null);
        setLongField(term4165, term4165.getClass(), "value", 0L);
        setElement(term4146, 6, term4165);
        setField(term4167, term4167.getClass(), "field", null);
        setLongField(term4167, term4167.getClass(), "value", 0L);
        setElement(term4146, 7, term4167);
        setField(term4169, term4169.getClass(), "field", null);
        setLongField(term4169, term4169.getClass(), "value", 0L);
        setElement(term4146, 8, term4169);
        setField(term4145, term4145.getClass(), "printerParsers", term4146);
        setBooleanField(term4145, term4145.getClass(), "optional", false);
        setField(term4144, term4144.getClass(), "printerParser", term4145);
        setField(term4173, term4173.getClass(), "language", "");
        setField(term4173, term4173.getClass(), "script", "");
        setField(term4173, term4173.getClass(), "region", "");
        setField(term4173, term4173.getClass(), "variant", "");
        setIntField(term4173, term4173.getClass(), "hash", 106956076);
        setField(term4172, term4172.getClass(), "baseLocale", term4173);
        setField(term4172, term4172.getClass(), "localeExtensions", null);
        setIntField(term4172, term4172.getClass(), "hashCodeValue", 106956076);
        setField(term4172, term4172.getClass(), "languageTag", "pt-BR");
        setField(term4144, term4144.getClass(), "locale", term4172);
        setCharField(term4187, term4187.getClass(), "zeroDigit", (char) 48);
        setCharField(term4187, term4187.getClass(), "positiveSign", (char) 43);
        setCharField(term4187, term4187.getClass(), "negativeSign", (char) 45);
        setCharField(term4187, term4187.getClass(), "decimalSeparator", (char) 46);
        setField(term4144, term4144.getClass(), "decimalStyle", term4187);
        setField(term4192, term4192.getClass(), "name", "SMART");
        setIntField(term4192, term4192.getClass(), "ordinal", 1);
        setField(term4144, term4144.getClass(), "resolverStyle", term4192);
        setField(term4144, term4144.getClass(), "resolverFields", null);
        setField(term4144, term4144.getClass(), "chrono", null);
        setIntField(term4201, term4201.getClass(), "totalSeconds", 0);
        setField(term4201, term4201.getClass(), "id", "Z");
        setField(term4144, term4144.getClass(), "zone", term4201);
        setField(term4143, term4143.getClass(), "formatter", term4144);
        setField(term4143, term4143.getClass(), "signals", term4206);
        setField(term4143, term4143.getClass(), "pt", enum15);
        setField(term4143, term4143.getClass(), "sId", "UoYtihxVaS");
        setIntField(term4143, term4143.getClass(), "initVolume", -157887805);
        setIntField(term4143, term4143.getClass(), "currVolume", 1876565163);
        setDoubleField(term4143, term4143.getClass(), "pr", 0.791695029600875);
        setLongField(term4233, term4233.getClass(), "seconds", 1329640267L);
        setIntField(term4233, term4233.getClass(), "nanos", 573000000);
        setField(term4143, term4143.getClass(), "openInst", term4233);
        setLongField(term4236, term4236.getClass(), "seconds", 1334853104L);
        setIntField(term4236, term4236.getClass(), "nanos", 718000000);
        setField(term4143, term4143.getClass(), "closeInst", term4236);
        setBooleanField(term4143, term4143.getClass(), "open", false);
        setDoubleField(term4143, term4143.getClass(), "currWinLoss", 0.6862221294683138);
        setField(term4143, term4143.getClass(), "uuid", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInitVolume", argTypes, term4143, args);
    }

};


