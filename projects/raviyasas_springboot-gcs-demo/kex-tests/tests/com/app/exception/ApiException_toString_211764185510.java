package com.app.exception;

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
import static com.app.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class ApiException_toString_211764185510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1613;

    public ApiException_toString_211764185510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1626 = new Integer(1725571209);
        term1613 = newInstance(Class.forName("com.app.exception.ApiException"));
        Object term1628 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1634 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1639 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1649 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1666 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1667 = (long[]) newLongArray(1);
        Object[] term1669 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1670 = (long[]) newLongArray(39);
        Object[] term1710 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1711 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1712 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1713 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1613, term1613.getClass(), "errorMessage", "NRdvgJlhkX");
        setField(term1613, term1613.getClass(), "statusCode", term1626);
        setIntField(term1630, term1630.getClass(), "year", 2019);
        setShortField(term1630, term1630.getClass(), "month", (short) 2);
        setShortField(term1630, term1630.getClass(), "day", (short) 21);
        setField(term1629, term1629.getClass(), "date", term1630);
        setByteField(term1634, term1634.getClass(), "hour", (byte) 5);
        setByteField(term1634, term1634.getClass(), "minute", (byte) 41);
        setByteField(term1634, term1634.getClass(), "second", (byte) 11);
        setIntField(term1634, term1634.getClass(), "nano", 859829782);
        setField(term1629, term1629.getClass(), "time", term1634);
        setField(term1628, term1628.getClass(), "dateTime", term1629);
        setIntField(term1639, term1639.getClass(), "totalSeconds", -10800);
        setField(term1639, term1639.getClass(), "id", "-03:00");
        setField(term1628, term1628.getClass(), "offset", term1639);
        setField(term1649, term1649.getClass(), "id", "America/Recife");
        setLongElement(term1667, 0, -1767217224L);
        setField(term1666, term1666.getClass(), "standardTransitions", term1667);
        setElement(term1669, 1, term1639);
        setField(term1666, term1666.getClass(), "standardOffsets", term1669);
        setLongElement(term1670, 0, -1767217224L);
        setLongElement(term1670, 1, -1206957600L);
        setLongElement(term1670, 2, -1191362400L);
        setLongElement(term1670, 3, -1175374800L);
        setLongElement(term1670, 4, -1159826400L);
        setLongElement(term1670, 5, -633819600L);
        setLongElement(term1670, 6, -622069200L);
        setLongElement(term1670, 7, -602283600L);
        setLongElement(term1670, 8, -591832800L);
        setLongElement(term1670, 9, -570747600L);
        setLongElement(term1670, 10, -560210400L);
        setLongElement(term1670, 11, -539125200L);
        setLongElement(term1670, 12, -531352800L);
        setLongElement(term1670, 13, -191365200L);
        setLongElement(term1670, 14, -184197600L);
        setLongElement(term1670, 15, -155163600L);
        setLongElement(term1670, 16, -150069600L);
        setLongElement(term1670, 17, -128898000L);
        setLongElement(term1670, 18, -121125600L);
        setLongElement(term1670, 19, -99954000L);
        setLongElement(term1670, 20, -89589600L);
        setLongElement(term1670, 21, -68418000L);
        setLongElement(term1670, 22, -57967200L);
        setLongElement(term1670, 23, 499748400L);
        setLongElement(term1670, 24, 511236000L);
        setLongElement(term1670, 25, 530593200L);
        setLongElement(term1670, 26, 540266400L);
        setLongElement(term1670, 27, 562129200L);
        setLongElement(term1670, 28, 571197600L);
        setLongElement(term1670, 29, 592974000L);
        setLongElement(term1670, 30, 602042400L);
        setLongElement(term1670, 31, 624423600L);
        setLongElement(term1670, 32, 634701600L);
        setLongElement(term1670, 33, 938919600L);
        setLongElement(term1670, 34, 951616800L);
        setLongElement(term1670, 35, 970974000L);
        setLongElement(term1670, 36, 971575200L);
        setLongElement(term1670, 37, 1003028400L);
        setLongElement(term1670, 38, 1013911200L);
        setField(term1666, term1666.getClass(), "savingsInstantTransitions", term1670);
        setField(term1666, term1666.getClass(), "savingsLocalTransitions", term1710);
        setElement(term1711, 1, term1639);
        setElement(term1711, 3, term1639);
        setElement(term1711, 5, term1639);
        setElement(term1711, 7, term1639);
        setElement(term1711, 9, term1639);
        setElement(term1711, 11, term1639);
        setElement(term1711, 13, term1639);
        setElement(term1711, 15, term1639);
        setElement(term1711, 17, term1639);
        setElement(term1711, 19, term1639);
        setElement(term1711, 21, term1639);
        setElement(term1711, 23, term1639);
        setElement(term1711, 25, term1639);
        setElement(term1711, 27, term1639);
        setElement(term1711, 29, term1639);
        setElement(term1711, 31, term1639);
        setElement(term1711, 33, term1639);
        setElement(term1711, 35, term1639);
        setElement(term1711, 37, term1639);
        setElement(term1711, 39, term1639);
        setField(term1666, term1666.getClass(), "wallOffsets", term1711);
        setField(term1666, term1666.getClass(), "lastRules", term1712);
        setField(term1713, term1713.getClass(), "table", null);
        setField(term1713, term1713.getClass(), "nextTable", null);
        setLongField(term1713, term1713.getClass(), "baseCount", 0L);
        setIntField(term1713, term1713.getClass(), "sizeCtl", 0);
        setIntField(term1713, term1713.getClass(), "transferIndex", 0);
        setIntField(term1713, term1713.getClass(), "cellsBusy", 0);
        setField(term1713, term1713.getClass(), "counterCells", null);
        setField(term1713, term1713.getClass(), "keySet", null);
        setField(term1713, term1713.getClass(), "values", null);
        setField(term1713, term1713.getClass(), "entrySet", null);
        setField(term1713, term1713.getClass(), "keySet", null);
        setField(term1713, term1713.getClass(), "values", null);
        setField(term1666, term1666.getClass(), "lastRulesCache", term1713);
        setField(term1649, term1649.getClass(), "rules", term1666);
        setField(term1628, term1628.getClass(), "zone", term1649);
        setField(term1613, term1613.getClass(), "zonedDateTime", term1628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1613, args);
    }

};


