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

public class Position_getPositionType_125704644711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7043;

    public Position_getPositionType_125704644711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7106 = new ArrayList();
        Class<? extends Object> term7165 = Class.forName((String) "strategies.Position$PositionType");
        Field term7164 = ((Class) term7165).getDeclaredField((String) "LONG");
        ((Field) term7164).setAccessible(true);
        Object enum24 = ((Field) term7164).get((Object) null);
        term7043 = newInstance(Class.forName("strategies.Position"));
        Object term7044 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term7045 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term7046 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term7047 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term7051 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term7053 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term7057 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term7059 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term7063 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term7065 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term7067 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term7069 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term7072 = newInstance(Class.forName("java.util.Locale"));
        Object term7073 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term7087 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term7092 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term7101 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term7133 = newInstance(Class.forName("java.time.Instant"));
        Object term7136 = newInstance(Class.forName("java.time.Instant"));
        setField(term7047, term7047.getClass(), "field", null);
        setIntField(term7047, term7047.getClass(), "minWidth", 4);
        setIntField(term7047, term7047.getClass(), "maxWidth", 19);
        setField(term7047, term7047.getClass(), "signStyle", null);
        setIntField(term7047, term7047.getClass(), "subsequentWidth", 0);
        setElement(term7046, 0, term7047);
        setCharField(term7051, term7051.getClass(), "literal", (char) 45);
        setElement(term7046, 1, term7051);
        setField(term7053, term7053.getClass(), "field", null);
        setIntField(term7053, term7053.getClass(), "minWidth", 2);
        setIntField(term7053, term7053.getClass(), "maxWidth", 2);
        setField(term7053, term7053.getClass(), "signStyle", null);
        setIntField(term7053, term7053.getClass(), "subsequentWidth", 0);
        setElement(term7046, 2, term7053);
        setCharField(term7057, term7057.getClass(), "literal", (char) 45);
        setElement(term7046, 3, term7057);
        setField(term7059, term7059.getClass(), "field", null);
        setIntField(term7059, term7059.getClass(), "minWidth", 2);
        setIntField(term7059, term7059.getClass(), "maxWidth", 2);
        setField(term7059, term7059.getClass(), "signStyle", null);
        setIntField(term7059, term7059.getClass(), "subsequentWidth", 0);
        setElement(term7046, 4, term7059);
        setField(term7063, term7063.getClass(), "printerParsers", null);
        setBooleanField(term7063, term7063.getClass(), "optional", true);
        setElement(term7046, 5, term7063);
        setField(term7065, term7065.getClass(), "field", null);
        setLongField(term7065, term7065.getClass(), "value", 0L);
        setElement(term7046, 6, term7065);
        setField(term7067, term7067.getClass(), "field", null);
        setLongField(term7067, term7067.getClass(), "value", 0L);
        setElement(term7046, 7, term7067);
        setField(term7069, term7069.getClass(), "field", null);
        setLongField(term7069, term7069.getClass(), "value", 0L);
        setElement(term7046, 8, term7069);
        setField(term7045, term7045.getClass(), "printerParsers", term7046);
        setBooleanField(term7045, term7045.getClass(), "optional", false);
        setField(term7044, term7044.getClass(), "printerParser", term7045);
        setField(term7073, term7073.getClass(), "language", "");
        setField(term7073, term7073.getClass(), "script", "");
        setField(term7073, term7073.getClass(), "region", "");
        setField(term7073, term7073.getClass(), "variant", "");
        setIntField(term7073, term7073.getClass(), "hash", 106956076);
        setField(term7072, term7072.getClass(), "baseLocale", term7073);
        setField(term7072, term7072.getClass(), "localeExtensions", null);
        setIntField(term7072, term7072.getClass(), "hashCodeValue", 106956076);
        setField(term7072, term7072.getClass(), "languageTag", "pt-BR");
        setField(term7044, term7044.getClass(), "locale", term7072);
        setCharField(term7087, term7087.getClass(), "zeroDigit", (char) 48);
        setCharField(term7087, term7087.getClass(), "positiveSign", (char) 43);
        setCharField(term7087, term7087.getClass(), "negativeSign", (char) 45);
        setCharField(term7087, term7087.getClass(), "decimalSeparator", (char) 46);
        setField(term7044, term7044.getClass(), "decimalStyle", term7087);
        setField(term7092, term7092.getClass(), "name", "SMART");
        setIntField(term7092, term7092.getClass(), "ordinal", 1);
        setField(term7044, term7044.getClass(), "resolverStyle", term7092);
        setField(term7044, term7044.getClass(), "resolverFields", null);
        setField(term7044, term7044.getClass(), "chrono", null);
        setIntField(term7101, term7101.getClass(), "totalSeconds", 0);
        setField(term7101, term7101.getClass(), "id", "Z");
        setField(term7044, term7044.getClass(), "zone", term7101);
        setField(term7043, term7043.getClass(), "formatter", term7044);
        setField(term7043, term7043.getClass(), "signals", term7106);
        setField(term7043, term7043.getClass(), "pt", enum24);
        setField(term7043, term7043.getClass(), "sId", "whBvTVIIlC");
        setIntField(term7043, term7043.getClass(), "initVolume", 97029295);
        setIntField(term7043, term7043.getClass(), "currVolume", -1371869594);
        setDoubleField(term7043, term7043.getClass(), "pr", 0.5308350402051779);
        setLongField(term7133, term7133.getClass(), "seconds", 1819191638L);
        setIntField(term7133, term7133.getClass(), "nanos", 549000000);
        setField(term7043, term7043.getClass(), "openInst", term7133);
        setLongField(term7136, term7136.getClass(), "seconds", 1400691778L);
        setIntField(term7136, term7136.getClass(), "nanos", 698000000);
        setField(term7043, term7043.getClass(), "closeInst", term7136);
        setBooleanField(term7043, term7043.getClass(), "open", false);
        setDoubleField(term7043, term7043.getClass(), "currWinLoss", 0.7154795600170818);
        setField(term7043, term7043.getClass(), "uuid", "IgRJUzaCwW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPositionType", argTypes, term7043, args);
    }

};


