package mil.nga.geopackage.db;

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
import static mil.nga.geopackage.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class DateConverter_setExpected_1109551107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811;
     Object term887;

    public DateConverter_setExpected_1109551107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term814 = newInstance(Class.forName("java.text.SimpleDateFormat"));
        char[] term821 = (char[]) newCharArray(9);
        Object term832 = newInstance(Class.forName("java.text.DateFormatSymbols"));
        Object term836 = newInstance(Class.forName("java.util.Date"));
        Object term839 = newInstance(Class.forName("java.util.Locale"));
        Object term842 = newInstance(Class.forName("java.util.GregorianCalendar"));
        Object term858 = newInstance(Class.forName("java.text.DecimalFormat"));
        setIntField(term814, term814.getClass(), "serialVersionOnStream", 1);
        setField(term814, term814.getClass(), "pattern", "");
        setField(term814, term814.getClass(), "originalNumberFormat", null);
        setField(term814, term814.getClass(), "originalNumberPattern", "");
        setCharField(term814, term814.getClass(), "minusSign", (char) 45);
        setBooleanField(term814, term814.getClass(), "hasFollowingMinusSign", true);
        setBooleanField(term814, term814.getClass(), "forceStandaloneForm", true);
        setCharElement(term821, 0, (char) 770);
        setCharElement(term821, 1, (char) 25647);
        setCharElement(term821, 2, (char) 514);
        setCharElement(term821, 3, (char) 25647);
        setCharElement(term821, 4, (char) 257);
        setCharElement(term821, 5, (char) 25632);
        setCharElement(term821, 6, (char) 1282);
        setCharElement(term821, 7, (char) 25658);
        setCharElement(term821, 8, (char) 1538);
        setField(term814, term814.getClass(), "compiledPattern", term821);
        setCharField(term814, term814.getClass(), "zeroDigit", 'Z');
        setField(term832, term832.getClass(), "eras", null);
        setField(term832, term832.getClass(), "months", null);
        setField(term832, term832.getClass(), "shortMonths", null);
        setField(term832, term832.getClass(), "weekdays", null);
        setField(term832, term832.getClass(), "shortWeekdays", null);
        setField(term832, term832.getClass(), "ampms", null);
        setField(term832, term832.getClass(), "zoneStrings", null);
        setBooleanField(term832, term832.getClass(), "isZoneStringsSet", false);
        setField(term832, term832.getClass(), "localPatternChars", null);
        setField(term832, term832.getClass(), "locale", null);
        setIntField(term832, term832.getClass(), "lastZoneIndex", 0);
        setIntField(term832, term832.getClass(), "cachedHashCode", 0);
        setField(term814, term814.getClass(), "formatData", term832);
        setLongField(term836, term836.getClass(), "fastTime", -738068120883L);
        setField(term836, term836.getClass(), "cdate", null);
        setField(term814, term814.getClass(), "defaultCenturyStart", term836);
        setIntField(term814, term814.getClass(), "defaultCenturyStartYear", 1946);
        setField(term839, term839.getClass(), "baseLocale", null);
        setField(term839, term839.getClass(), "localeExtensions", null);
        setIntField(term839, term839.getClass(), "hashCodeValue", 106956076);
        setField(term839, term839.getClass(), "languageTag", null);
        setField(term814, term814.getClass(), "locale", term839);
        setBooleanField(term814, term814.getClass(), "useDateFormatSymbols", true);
        setLongField(term842, term842.getClass(), "gregorianCutover", -12219292800000L);
        setLongField(term842, term842.getClass(), "gregorianCutoverDate", 577736L);
        setIntField(term842, term842.getClass(), "gregorianCutoverYear", 1582);
        setIntField(term842, term842.getClass(), "gregorianCutoverYearJulian", 1582);
        setField(term842, term842.getClass(), "gdate", null);
        setField(term842, term842.getClass(), "cdate", null);
        setField(term842, term842.getClass(), "calsys", null);
        setField(term842, term842.getClass(), "zoneOffsets", null);
        setField(term842, term842.getClass(), "originalFields", null);
        setLongField(term842, term842.getClass(), "cachedFixedDate", 710620L);
        setField(term842, term842.getClass(), "fields", null);
        setField(term842, term842.getClass(), "isSet", null);
        setField(term842, term842.getClass(), "stamp", null);
        setLongField(term842, term842.getClass(), "time", -738068120883L);
        setBooleanField(term842, term842.getClass(), "isTimeSet", true);
        setBooleanField(term842, term842.getClass(), "areFieldsSet", true);
        setBooleanField(term842, term842.getClass(), "areAllFieldsSet", true);
        setBooleanField(term842, term842.getClass(), "lenient", true);
        setField(term842, term842.getClass(), "zone", null);
        setBooleanField(term842, term842.getClass(), "sharedZone", false);
        setIntField(term842, term842.getClass(), "firstDayOfWeek", 1);
        setIntField(term842, term842.getClass(), "minimalDaysInFirstWeek", 1);
        setIntField(term842, term842.getClass(), "nextStamp", 3);
        setIntField(term842, term842.getClass(), "serialVersionOnStream", 1);
        setField(term814, term814.getClass(), "calendar", term842);
        setField(term858, term858.getClass(), "bigIntegerMultiplier", null);
        setField(term858, term858.getClass(), "bigDecimalMultiplier", null);
        setField(term858, term858.getClass(), "digitList", null);
        setField(term858, term858.getClass(), "positivePrefix", null);
        setField(term858, term858.getClass(), "positiveSuffix", null);
        setField(term858, term858.getClass(), "negativePrefix", null);
        setField(term858, term858.getClass(), "negativeSuffix", null);
        setField(term858, term858.getClass(), "posPrefixPattern", null);
        setField(term858, term858.getClass(), "posSuffixPattern", null);
        setField(term858, term858.getClass(), "negPrefixPattern", null);
        setField(term858, term858.getClass(), "negSuffixPattern", null);
        setIntField(term858, term858.getClass(), "multiplier", 1);
        setByteField(term858, term858.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term858, term858.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term858, term858.getClass(), "parseBigDecimal", false);
        setBooleanField(term858, term858.getClass(), "isCurrencyFormat", false);
        setField(term858, term858.getClass(), "symbols", null);
        setBooleanField(term858, term858.getClass(), "useExponentialNotation", false);
        setField(term858, term858.getClass(), "positivePrefixFieldPositions", null);
        setField(term858, term858.getClass(), "positiveSuffixFieldPositions", null);
        setField(term858, term858.getClass(), "negativePrefixFieldPositions", null);
        setField(term858, term858.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term858, term858.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term858, term858.getClass(), "maximumIntegerDigits", 309);
        setIntField(term858, term858.getClass(), "minimumIntegerDigits", 1);
        setIntField(term858, term858.getClass(), "maximumFractionDigits", 0);
        setIntField(term858, term858.getClass(), "minimumFractionDigits", 0);
        setField(term858, term858.getClass(), "roundingMode", null);
        setBooleanField(term858, term858.getClass(), "isFastPath", false);
        setBooleanField(term858, term858.getClass(), "fastPathCheckNeeded", true);
        setField(term858, term858.getClass(), "fastPathData", null);
        setIntField(term858, term858.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term858, term858.getClass(), "groupingUsed", false);
        setByteField(term858, term858.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term858, term858.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term858, term858.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term858, term858.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term858, term858.getClass(), "parseIntegerOnly", true);
        setField(term814, term814.getClass(), "numberFormat", term858);
        ArrayList term812 = new ArrayList();
        ((ArrayList) term812).add(term814);
        term811 = newInstance(Class.forName("mil.nga.geopackage.db.DateConverter"));
        setField(term811, term811.getClass(), "formatters", term812);
        setBooleanField(term811, term811.getClass(), "expected", true);
        term887 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.DateConverter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term887;
        callMethod(klass, "setExpected", argTypes, term811, args);
    }

};


