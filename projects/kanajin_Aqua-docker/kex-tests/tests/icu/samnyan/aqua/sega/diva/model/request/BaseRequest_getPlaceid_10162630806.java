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

public class BaseRequest_getPlaceid_10162630806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250973;

    public BaseRequest_getPlaceid_10162630806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250973 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term251058 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term251059 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251060 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251064 = newInstance(Class.forName("java.time.LocalTime"));
        Object term251069 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term251079 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term251096 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term251097 = (long[]) newLongArray(1);
        Object[] term251099 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term251100 = (long[]) newLongArray(39);
        Object[] term251140 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term251141 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term251142 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term251143 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term250973, term250973.getClass(), "cmd", "ghNeQsQdJv");
        setField(term250973, term250973.getClass(), "req_id", "WdJpcVlXsy");
        setField(term250973, term250973.getClass(), "game_id", "uYQVtgtMJM");
        setField(term250973, term250973.getClass(), "r_ver", "AxhrYuHpMZ");
        setField(term250973, term250973.getClass(), "kc_serial", "ZLdlevjZxO");
        setField(term250973, term250973.getClass(), "b_serial", "xFTRWovmcb");
        setField(term250973, term250973.getClass(), "place_id", "fDNpBZJcEK");
        setIntField(term251060, term251060.getClass(), "year", 2019);
        setShortField(term251060, term251060.getClass(), "month", (short) 9);
        setShortField(term251060, term251060.getClass(), "day", (short) 3);
        setField(term251059, term251059.getClass(), "date", term251060);
        setByteField(term251064, term251064.getClass(), "hour", (byte) 2);
        setByteField(term251064, term251064.getClass(), "minute", (byte) 32);
        setByteField(term251064, term251064.getClass(), "second", (byte) 30);
        setIntField(term251064, term251064.getClass(), "nano", 339846128);
        setField(term251059, term251059.getClass(), "time", term251064);
        setField(term251058, term251058.getClass(), "dateTime", term251059);
        setIntField(term251069, term251069.getClass(), "totalSeconds", -10800);
        setField(term251069, term251069.getClass(), "id", "-03:00");
        setField(term251058, term251058.getClass(), "offset", term251069);
        setField(term251079, term251079.getClass(), "id", "America/Recife");
        setLongElement(term251097, 0, -1767217224L);
        setField(term251096, term251096.getClass(), "standardTransitions", term251097);
        setElement(term251099, 1, term251069);
        setField(term251096, term251096.getClass(), "standardOffsets", term251099);
        setLongElement(term251100, 0, -1767217224L);
        setLongElement(term251100, 1, -1206957600L);
        setLongElement(term251100, 2, -1191362400L);
        setLongElement(term251100, 3, -1175374800L);
        setLongElement(term251100, 4, -1159826400L);
        setLongElement(term251100, 5, -633819600L);
        setLongElement(term251100, 6, -622069200L);
        setLongElement(term251100, 7, -602283600L);
        setLongElement(term251100, 8, -591832800L);
        setLongElement(term251100, 9, -570747600L);
        setLongElement(term251100, 10, -560210400L);
        setLongElement(term251100, 11, -539125200L);
        setLongElement(term251100, 12, -531352800L);
        setLongElement(term251100, 13, -191365200L);
        setLongElement(term251100, 14, -184197600L);
        setLongElement(term251100, 15, -155163600L);
        setLongElement(term251100, 16, -150069600L);
        setLongElement(term251100, 17, -128898000L);
        setLongElement(term251100, 18, -121125600L);
        setLongElement(term251100, 19, -99954000L);
        setLongElement(term251100, 20, -89589600L);
        setLongElement(term251100, 21, -68418000L);
        setLongElement(term251100, 22, -57967200L);
        setLongElement(term251100, 23, 499748400L);
        setLongElement(term251100, 24, 511236000L);
        setLongElement(term251100, 25, 530593200L);
        setLongElement(term251100, 26, 540266400L);
        setLongElement(term251100, 27, 562129200L);
        setLongElement(term251100, 28, 571197600L);
        setLongElement(term251100, 29, 592974000L);
        setLongElement(term251100, 30, 602042400L);
        setLongElement(term251100, 31, 624423600L);
        setLongElement(term251100, 32, 634701600L);
        setLongElement(term251100, 33, 938919600L);
        setLongElement(term251100, 34, 951616800L);
        setLongElement(term251100, 35, 970974000L);
        setLongElement(term251100, 36, 971575200L);
        setLongElement(term251100, 37, 1003028400L);
        setLongElement(term251100, 38, 1013911200L);
        setField(term251096, term251096.getClass(), "savingsInstantTransitions", term251100);
        setField(term251096, term251096.getClass(), "savingsLocalTransitions", term251140);
        setElement(term251141, 1, term251069);
        setElement(term251141, 3, term251069);
        setElement(term251141, 5, term251069);
        setElement(term251141, 7, term251069);
        setElement(term251141, 9, term251069);
        setElement(term251141, 11, term251069);
        setElement(term251141, 13, term251069);
        setElement(term251141, 15, term251069);
        setElement(term251141, 17, term251069);
        setElement(term251141, 19, term251069);
        setElement(term251141, 21, term251069);
        setElement(term251141, 23, term251069);
        setElement(term251141, 25, term251069);
        setElement(term251141, 27, term251069);
        setElement(term251141, 29, term251069);
        setElement(term251141, 31, term251069);
        setElement(term251141, 33, term251069);
        setElement(term251141, 35, term251069);
        setElement(term251141, 37, term251069);
        setElement(term251141, 39, term251069);
        setField(term251096, term251096.getClass(), "wallOffsets", term251141);
        setField(term251096, term251096.getClass(), "lastRules", term251142);
        setField(term251143, term251143.getClass(), "table", null);
        setField(term251143, term251143.getClass(), "nextTable", null);
        setLongField(term251143, term251143.getClass(), "baseCount", 0L);
        setIntField(term251143, term251143.getClass(), "sizeCtl", 0);
        setIntField(term251143, term251143.getClass(), "transferIndex", 0);
        setIntField(term251143, term251143.getClass(), "cellsBusy", 0);
        setField(term251143, term251143.getClass(), "counterCells", null);
        setField(term251143, term251143.getClass(), "keySet", null);
        setField(term251143, term251143.getClass(), "values", null);
        setField(term251143, term251143.getClass(), "entrySet", null);
        setField(term251143, term251143.getClass(), "keySet", null);
        setField(term251143, term251143.getClass(), "values", null);
        setField(term251096, term251096.getClass(), "lastRulesCache", term251143);
        setField(term251079, term251079.getClass(), "rules", term251096);
        setField(term251058, term251058.getClass(), "zone", term251079);
        setField(term250973, term250973.getClass(), "time_stamp", term251058);
        setField(term250973, term250973.getClass(), "start_up_mode", "jURNSwGUrp");
        setField(term250973, term250973.getClass(), "cmm_dly_mod", "nIWnIRXTGB");
        setField(term250973, term250973.getClass(), "cmm_dly_sec", "cjGGcykErb");
        setField(term250973, term250973.getClass(), "cmm_err_mod", "ahJJxxxyVu");
        setField(term250973, term250973.getClass(), "country_code", "IABlyhoUtz");
        setField(term250973, term250973.getClass(), "region_code", "QDgkRKDgSY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlace_id", argTypes, term250973, args);
    }

};


