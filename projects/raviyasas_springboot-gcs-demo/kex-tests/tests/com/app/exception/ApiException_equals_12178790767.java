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

public class ApiException_equals_12178790767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086;
     Object term1191;

    public ApiException_equals_12178790767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1099 = new Integer(-2038273078);
        term1086 = newInstance(Class.forName("com.app.exception.ApiException"));
        Object term1101 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1102 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1103 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1107 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1112 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1122 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1139 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1140 = (long[]) newLongArray(1);
        Object[] term1142 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1143 = (long[]) newLongArray(39);
        Object[] term1183 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1184 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1185 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1186 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1086, term1086.getClass(), "errorMessage", "MjGYSRKTNF");
        setField(term1086, term1086.getClass(), "statusCode", term1099);
        setIntField(term1103, term1103.getClass(), "year", 2024);
        setShortField(term1103, term1103.getClass(), "month", (short) 1);
        setShortField(term1103, term1103.getClass(), "day", (short) 24);
        setField(term1102, term1102.getClass(), "date", term1103);
        setByteField(term1107, term1107.getClass(), "hour", (byte) 20);
        setByteField(term1107, term1107.getClass(), "minute", (byte) 28);
        setByteField(term1107, term1107.getClass(), "second", (byte) 39);
        setIntField(term1107, term1107.getClass(), "nano", 952728177);
        setField(term1102, term1102.getClass(), "time", term1107);
        setField(term1101, term1101.getClass(), "dateTime", term1102);
        setIntField(term1112, term1112.getClass(), "totalSeconds", -10800);
        setField(term1112, term1112.getClass(), "id", "-03:00");
        setField(term1101, term1101.getClass(), "offset", term1112);
        setField(term1122, term1122.getClass(), "id", "America/Recife");
        setLongElement(term1140, 0, -1767217224L);
        setField(term1139, term1139.getClass(), "standardTransitions", term1140);
        setElement(term1142, 1, term1112);
        setField(term1139, term1139.getClass(), "standardOffsets", term1142);
        setLongElement(term1143, 0, -1767217224L);
        setLongElement(term1143, 1, -1206957600L);
        setLongElement(term1143, 2, -1191362400L);
        setLongElement(term1143, 3, -1175374800L);
        setLongElement(term1143, 4, -1159826400L);
        setLongElement(term1143, 5, -633819600L);
        setLongElement(term1143, 6, -622069200L);
        setLongElement(term1143, 7, -602283600L);
        setLongElement(term1143, 8, -591832800L);
        setLongElement(term1143, 9, -570747600L);
        setLongElement(term1143, 10, -560210400L);
        setLongElement(term1143, 11, -539125200L);
        setLongElement(term1143, 12, -531352800L);
        setLongElement(term1143, 13, -191365200L);
        setLongElement(term1143, 14, -184197600L);
        setLongElement(term1143, 15, -155163600L);
        setLongElement(term1143, 16, -150069600L);
        setLongElement(term1143, 17, -128898000L);
        setLongElement(term1143, 18, -121125600L);
        setLongElement(term1143, 19, -99954000L);
        setLongElement(term1143, 20, -89589600L);
        setLongElement(term1143, 21, -68418000L);
        setLongElement(term1143, 22, -57967200L);
        setLongElement(term1143, 23, 499748400L);
        setLongElement(term1143, 24, 511236000L);
        setLongElement(term1143, 25, 530593200L);
        setLongElement(term1143, 26, 540266400L);
        setLongElement(term1143, 27, 562129200L);
        setLongElement(term1143, 28, 571197600L);
        setLongElement(term1143, 29, 592974000L);
        setLongElement(term1143, 30, 602042400L);
        setLongElement(term1143, 31, 624423600L);
        setLongElement(term1143, 32, 634701600L);
        setLongElement(term1143, 33, 938919600L);
        setLongElement(term1143, 34, 951616800L);
        setLongElement(term1143, 35, 970974000L);
        setLongElement(term1143, 36, 971575200L);
        setLongElement(term1143, 37, 1003028400L);
        setLongElement(term1143, 38, 1013911200L);
        setField(term1139, term1139.getClass(), "savingsInstantTransitions", term1143);
        setField(term1139, term1139.getClass(), "savingsLocalTransitions", term1183);
        setElement(term1184, 1, term1112);
        setElement(term1184, 3, term1112);
        setElement(term1184, 5, term1112);
        setElement(term1184, 7, term1112);
        setElement(term1184, 9, term1112);
        setElement(term1184, 11, term1112);
        setElement(term1184, 13, term1112);
        setElement(term1184, 15, term1112);
        setElement(term1184, 17, term1112);
        setElement(term1184, 19, term1112);
        setElement(term1184, 21, term1112);
        setElement(term1184, 23, term1112);
        setElement(term1184, 25, term1112);
        setElement(term1184, 27, term1112);
        setElement(term1184, 29, term1112);
        setElement(term1184, 31, term1112);
        setElement(term1184, 33, term1112);
        setElement(term1184, 35, term1112);
        setElement(term1184, 37, term1112);
        setElement(term1184, 39, term1112);
        setField(term1139, term1139.getClass(), "wallOffsets", term1184);
        setField(term1139, term1139.getClass(), "lastRules", term1185);
        setField(term1186, term1186.getClass(), "table", null);
        setField(term1186, term1186.getClass(), "nextTable", null);
        setLongField(term1186, term1186.getClass(), "baseCount", 0L);
        setIntField(term1186, term1186.getClass(), "sizeCtl", 0);
        setIntField(term1186, term1186.getClass(), "transferIndex", 0);
        setIntField(term1186, term1186.getClass(), "cellsBusy", 0);
        setField(term1186, term1186.getClass(), "counterCells", null);
        setField(term1186, term1186.getClass(), "keySet", null);
        setField(term1186, term1186.getClass(), "values", null);
        setField(term1186, term1186.getClass(), "entrySet", null);
        setField(term1186, term1186.getClass(), "keySet", null);
        setField(term1186, term1186.getClass(), "values", null);
        setField(term1139, term1139.getClass(), "lastRulesCache", term1186);
        setField(term1122, term1122.getClass(), "rules", term1139);
        setField(term1101, term1101.getClass(), "zone", term1122);
        setField(term1086, term1086.getClass(), "zonedDateTime", term1101);
        term1191 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1191;
        callMethod(klass, "equals", argTypes, term1086, args);
    }

};


