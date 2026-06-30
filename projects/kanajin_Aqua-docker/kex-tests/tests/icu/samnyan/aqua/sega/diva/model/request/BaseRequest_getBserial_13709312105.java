package icu.samnyan.aqua.sega.diva.model.request;

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
import static icu.samnyan.aqua.sega.diva.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseRequest_getBserial_13709312105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250536;

    public BaseRequest_getBserial_13709312105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250536 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term250621 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term250622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250627 = newInstance(Class.forName("java.time.LocalTime"));
        Object term250632 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term250642 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term250659 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term250660 = (long[]) newLongArray(1);
        Object[] term250662 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term250663 = (long[]) newLongArray(39);
        Object[] term250703 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term250704 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term250705 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term250706 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term250536, term250536.getClass(), "cmd", "WmLDnzSUcH");
        setField(term250536, term250536.getClass(), "req_id", "jzYgniVftZ");
        setField(term250536, term250536.getClass(), "game_id", "hCbXOXOOYP");
        setField(term250536, term250536.getClass(), "r_ver", "QDpqtNZTXP");
        setField(term250536, term250536.getClass(), "kc_serial", "ERsxGrzfGd");
        setField(term250536, term250536.getClass(), "b_serial", "CRKkCjukkS");
        setField(term250536, term250536.getClass(), "place_id", "PqRZMgCthN");
        setIntField(term250623, term250623.getClass(), "year", 2014);
        setShortField(term250623, term250623.getClass(), "month", (short) 2);
        setShortField(term250623, term250623.getClass(), "day", (short) 26);
        setField(term250622, term250622.getClass(), "date", term250623);
        setByteField(term250627, term250627.getClass(), "hour", (byte) 16);
        setByteField(term250627, term250627.getClass(), "minute", (byte) 42);
        setByteField(term250627, term250627.getClass(), "second", (byte) 39);
        setIntField(term250627, term250627.getClass(), "nano", 690212071);
        setField(term250622, term250622.getClass(), "time", term250627);
        setField(term250621, term250621.getClass(), "dateTime", term250622);
        setIntField(term250632, term250632.getClass(), "totalSeconds", -10800);
        setField(term250632, term250632.getClass(), "id", "-03:00");
        setField(term250621, term250621.getClass(), "offset", term250632);
        setField(term250642, term250642.getClass(), "id", "America/Recife");
        setLongElement(term250660, 0, -1767217224L);
        setField(term250659, term250659.getClass(), "standardTransitions", term250660);
        setElement(term250662, 1, term250632);
        setField(term250659, term250659.getClass(), "standardOffsets", term250662);
        setLongElement(term250663, 0, -1767217224L);
        setLongElement(term250663, 1, -1206957600L);
        setLongElement(term250663, 2, -1191362400L);
        setLongElement(term250663, 3, -1175374800L);
        setLongElement(term250663, 4, -1159826400L);
        setLongElement(term250663, 5, -633819600L);
        setLongElement(term250663, 6, -622069200L);
        setLongElement(term250663, 7, -602283600L);
        setLongElement(term250663, 8, -591832800L);
        setLongElement(term250663, 9, -570747600L);
        setLongElement(term250663, 10, -560210400L);
        setLongElement(term250663, 11, -539125200L);
        setLongElement(term250663, 12, -531352800L);
        setLongElement(term250663, 13, -191365200L);
        setLongElement(term250663, 14, -184197600L);
        setLongElement(term250663, 15, -155163600L);
        setLongElement(term250663, 16, -150069600L);
        setLongElement(term250663, 17, -128898000L);
        setLongElement(term250663, 18, -121125600L);
        setLongElement(term250663, 19, -99954000L);
        setLongElement(term250663, 20, -89589600L);
        setLongElement(term250663, 21, -68418000L);
        setLongElement(term250663, 22, -57967200L);
        setLongElement(term250663, 23, 499748400L);
        setLongElement(term250663, 24, 511236000L);
        setLongElement(term250663, 25, 530593200L);
        setLongElement(term250663, 26, 540266400L);
        setLongElement(term250663, 27, 562129200L);
        setLongElement(term250663, 28, 571197600L);
        setLongElement(term250663, 29, 592974000L);
        setLongElement(term250663, 30, 602042400L);
        setLongElement(term250663, 31, 624423600L);
        setLongElement(term250663, 32, 634701600L);
        setLongElement(term250663, 33, 938919600L);
        setLongElement(term250663, 34, 951616800L);
        setLongElement(term250663, 35, 970974000L);
        setLongElement(term250663, 36, 971575200L);
        setLongElement(term250663, 37, 1003028400L);
        setLongElement(term250663, 38, 1013911200L);
        setField(term250659, term250659.getClass(), "savingsInstantTransitions", term250663);
        setField(term250659, term250659.getClass(), "savingsLocalTransitions", term250703);
        setElement(term250704, 1, term250632);
        setElement(term250704, 3, term250632);
        setElement(term250704, 5, term250632);
        setElement(term250704, 7, term250632);
        setElement(term250704, 9, term250632);
        setElement(term250704, 11, term250632);
        setElement(term250704, 13, term250632);
        setElement(term250704, 15, term250632);
        setElement(term250704, 17, term250632);
        setElement(term250704, 19, term250632);
        setElement(term250704, 21, term250632);
        setElement(term250704, 23, term250632);
        setElement(term250704, 25, term250632);
        setElement(term250704, 27, term250632);
        setElement(term250704, 29, term250632);
        setElement(term250704, 31, term250632);
        setElement(term250704, 33, term250632);
        setElement(term250704, 35, term250632);
        setElement(term250704, 37, term250632);
        setElement(term250704, 39, term250632);
        setField(term250659, term250659.getClass(), "wallOffsets", term250704);
        setField(term250659, term250659.getClass(), "lastRules", term250705);
        setField(term250706, term250706.getClass(), "table", null);
        setField(term250706, term250706.getClass(), "nextTable", null);
        setLongField(term250706, term250706.getClass(), "baseCount", 0L);
        setIntField(term250706, term250706.getClass(), "sizeCtl", 0);
        setIntField(term250706, term250706.getClass(), "transferIndex", 0);
        setIntField(term250706, term250706.getClass(), "cellsBusy", 0);
        setField(term250706, term250706.getClass(), "counterCells", null);
        setField(term250706, term250706.getClass(), "keySet", null);
        setField(term250706, term250706.getClass(), "values", null);
        setField(term250706, term250706.getClass(), "entrySet", null);
        setField(term250706, term250706.getClass(), "keySet", null);
        setField(term250706, term250706.getClass(), "values", null);
        setField(term250659, term250659.getClass(), "lastRulesCache", term250706);
        setField(term250642, term250642.getClass(), "rules", term250659);
        setField(term250621, term250621.getClass(), "zone", term250642);
        setField(term250536, term250536.getClass(), "time_stamp", term250621);
        setField(term250536, term250536.getClass(), "start_up_mode", "GrJVQEmmlP");
        setField(term250536, term250536.getClass(), "cmm_dly_mod", "znnUCOtZMp");
        setField(term250536, term250536.getClass(), "cmm_dly_sec", "QhqWOzlnRY");
        setField(term250536, term250536.getClass(), "cmm_err_mod", "PgDJdYVklE");
        setField(term250536, term250536.getClass(), "country_code", "mdNIWipYwz");
        setField(term250536, term250536.getClass(), "region_code", "LPiRxaDRZj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getB_serial", argTypes, term250536, args);
    }

};


