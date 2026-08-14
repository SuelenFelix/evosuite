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

public class Position_addNewSignal_8542835111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3812;
     Object term3923;
     Object term3925;
     Object term3927;

    public Position_addNewSignal_8542835111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3875 = new ArrayList();
        Class<? extends Object> term3942 = Class.forName((String) "strategies.Position$PositionType");
        Field term3941 = ((Class) term3942).getDeclaredField((String) "SHORT");
        ((Field) term3941).setAccessible(true);
        Object enum14 = ((Field) term3941).get((Object) null);
        term3812 = newInstance(Class.forName("strategies.Position"));
        Object term3813 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term3814 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object[] term3815 = (Object[]) newArray("java.time.format.DateTimeFormatterBuilder$DateTimePrinterParser", 9);
        Object term3816 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term3820 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term3822 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term3826 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CharLiteralPrinterParser"));
        Object term3828 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$NumberPrinterParser"));
        Object term3832 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$CompositePrinterParser"));
        Object term3834 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term3836 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term3838 = newInstance(Class.forName("java.time.format.DateTimeFormatterBuilder$DefaultValueParser"));
        Object term3841 = newInstance(Class.forName("java.util.Locale"));
        Object term3842 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term3856 = newInstance(Class.forName("java.time.format.DecimalStyle"));
        Object term3861 = newInstance(Class.forName("java.time.format.ResolverStyle"));
        Object term3870 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3903 = newInstance(Class.forName("java.time.Instant"));
        Object term3906 = newInstance(Class.forName("java.time.Instant"));
        setField(term3816, term3816.getClass(), "field", null);
        setIntField(term3816, term3816.getClass(), "minWidth", 4);
        setIntField(term3816, term3816.getClass(), "maxWidth", 19);
        setField(term3816, term3816.getClass(), "signStyle", null);
        setIntField(term3816, term3816.getClass(), "subsequentWidth", 0);
        setElement(term3815, 0, term3816);
        setCharField(term3820, term3820.getClass(), "literal", (char) 45);
        setElement(term3815, 1, term3820);
        setField(term3822, term3822.getClass(), "field", null);
        setIntField(term3822, term3822.getClass(), "minWidth", 2);
        setIntField(term3822, term3822.getClass(), "maxWidth", 2);
        setField(term3822, term3822.getClass(), "signStyle", null);
        setIntField(term3822, term3822.getClass(), "subsequentWidth", 0);
        setElement(term3815, 2, term3822);
        setCharField(term3826, term3826.getClass(), "literal", (char) 45);
        setElement(term3815, 3, term3826);
        setField(term3828, term3828.getClass(), "field", null);
        setIntField(term3828, term3828.getClass(), "minWidth", 2);
        setIntField(term3828, term3828.getClass(), "maxWidth", 2);
        setField(term3828, term3828.getClass(), "signStyle", null);
        setIntField(term3828, term3828.getClass(), "subsequentWidth", 0);
        setElement(term3815, 4, term3828);
        setField(term3832, term3832.getClass(), "printerParsers", null);
        setBooleanField(term3832, term3832.getClass(), "optional", true);
        setElement(term3815, 5, term3832);
        setField(term3834, term3834.getClass(), "field", null);
        setLongField(term3834, term3834.getClass(), "value", 0L);
        setElement(term3815, 6, term3834);
        setField(term3836, term3836.getClass(), "field", null);
        setLongField(term3836, term3836.getClass(), "value", 0L);
        setElement(term3815, 7, term3836);
        setField(term3838, term3838.getClass(), "field", null);
        setLongField(term3838, term3838.getClass(), "value", 0L);
        setElement(term3815, 8, term3838);
        setField(term3814, term3814.getClass(), "printerParsers", term3815);
        setBooleanField(term3814, term3814.getClass(), "optional", false);
        setField(term3813, term3813.getClass(), "printerParser", term3814);
        setField(term3842, term3842.getClass(), "language", "");
        setField(term3842, term3842.getClass(), "script", "");
        setField(term3842, term3842.getClass(), "region", "");
        setField(term3842, term3842.getClass(), "variant", "");
        setIntField(term3842, term3842.getClass(), "hash", 106956076);
        setField(term3841, term3841.getClass(), "baseLocale", term3842);
        setField(term3841, term3841.getClass(), "localeExtensions", null);
        setIntField(term3841, term3841.getClass(), "hashCodeValue", 106956076);
        setField(term3841, term3841.getClass(), "languageTag", "pt-BR");
        setField(term3813, term3813.getClass(), "locale", term3841);
        setCharField(term3856, term3856.getClass(), "zeroDigit", (char) 48);
        setCharField(term3856, term3856.getClass(), "positiveSign", (char) 43);
        setCharField(term3856, term3856.getClass(), "negativeSign", (char) 45);
        setCharField(term3856, term3856.getClass(), "decimalSeparator", (char) 46);
        setField(term3813, term3813.getClass(), "decimalStyle", term3856);
        setField(term3861, term3861.getClass(), "name", "SMART");
        setIntField(term3861, term3861.getClass(), "ordinal", 1);
        setField(term3813, term3813.getClass(), "resolverStyle", term3861);
        setField(term3813, term3813.getClass(), "resolverFields", null);
        setField(term3813, term3813.getClass(), "chrono", null);
        setIntField(term3870, term3870.getClass(), "totalSeconds", 0);
        setField(term3870, term3870.getClass(), "id", "Z");
        setField(term3813, term3813.getClass(), "zone", term3870);
        setField(term3812, term3812.getClass(), "formatter", term3813);
        setField(term3812, term3812.getClass(), "signals", term3875);
        setField(term3812, term3812.getClass(), "pt", enum14);
        setField(term3812, term3812.getClass(), "sId", "nGKItKLYNC");
        setIntField(term3812, term3812.getClass(), "initVolume", 767834723);
        setIntField(term3812, term3812.getClass(), "currVolume", -602026508);
        setDoubleField(term3812, term3812.getClass(), "pr", 0.5873228247510078);
        setLongField(term3903, term3903.getClass(), "seconds", 1502158153L);
        setIntField(term3903, term3903.getClass(), "nanos", 899000000);
        setField(term3812, term3812.getClass(), "openInst", term3903);
        setLongField(term3906, term3906.getClass(), "seconds", 1630952644L);
        setIntField(term3906, term3906.getClass(), "nanos", 759000000);
        setField(term3812, term3812.getClass(), "closeInst", term3906);
        setBooleanField(term3812, term3812.getClass(), "open", true);
        setDoubleField(term3812, term3812.getClass(), "currWinLoss", 0.8823181080774973);
        setField(term3812, term3812.getClass(), "uuid", "UiUYnPrcCi");
        term3923 = new Double(0.2192450926212024);
        term3925 = new Double(0.7591353014991907);
        term3927 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3927, term3927.getClass(), "seconds", 1739417792L);
        setIntField(term3927, term3927.getClass(), "nanos", 956000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.time.Instant");
        Object[] args = new Object[3];
        args[0] = term3923;
        args[1] = term3925;
        args[2] = term3927;
        callMethod(klass, "addNewSignal", argTypes, term3812, args);
    }

};


