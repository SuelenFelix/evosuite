package icu.samnyan.aqua.sega.diva.model.request.card;

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
import static icu.samnyan.aqua.sega.diva.model.request.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CardProcedureRequest_getAimeacode_6825771743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20890;

    public CardProcedureRequest_getAimeacode_6825771743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20890 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        Object term21001 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term21002 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21007 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21012 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term21022 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term21039 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term21040 = (long[]) newLongArray(1);
        Object[] term21042 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term21043 = (long[]) newLongArray(39);
        Object[] term21083 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term21084 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term21085 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term21086 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term20890, term20890.getClass(), "cd_adm_cmd", 287287233);
        setField(term20890, term20890.getClass(), "a_code", "VfmNFpEuax");
        setIntField(term20890, term20890.getClass(), "aime_id", 962840079);
        setField(term20890, term20890.getClass(), "aime_a_code", "ANHjlWPmZG");
        setField(term20890, term20890.getClass(), "cmd", "SibzENsyyy");
        setField(term20890, term20890.getClass(), "req_id", "mrqGHotaef");
        setField(term20890, term20890.getClass(), "game_id", "UbZGBpQZQW");
        setField(term20890, term20890.getClass(), "r_ver", "SvGTualQPa");
        setField(term20890, term20890.getClass(), "kc_serial", "mdxcgZwsaP");
        setField(term20890, term20890.getClass(), "b_serial", "XildIRoZHG");
        setField(term20890, term20890.getClass(), "place_id", "lEcrFlxJXH");
        setIntField(term21003, term21003.getClass(), "year", 2024);
        setShortField(term21003, term21003.getClass(), "month", (short) 4);
        setShortField(term21003, term21003.getClass(), "day", (short) 24);
        setField(term21002, term21002.getClass(), "date", term21003);
        setByteField(term21007, term21007.getClass(), "hour", (byte) 7);
        setByteField(term21007, term21007.getClass(), "minute", (byte) 2);
        setByteField(term21007, term21007.getClass(), "second", (byte) 51);
        setIntField(term21007, term21007.getClass(), "nano", 635502964);
        setField(term21002, term21002.getClass(), "time", term21007);
        setField(term21001, term21001.getClass(), "dateTime", term21002);
        setIntField(term21012, term21012.getClass(), "totalSeconds", -10800);
        setField(term21012, term21012.getClass(), "id", "-03:00");
        setField(term21001, term21001.getClass(), "offset", term21012);
        setField(term21022, term21022.getClass(), "id", "America/Recife");
        setLongElement(term21040, 0, -1767217224L);
        setField(term21039, term21039.getClass(), "standardTransitions", term21040);
        setElement(term21042, 1, term21012);
        setField(term21039, term21039.getClass(), "standardOffsets", term21042);
        setLongElement(term21043, 0, -1767217224L);
        setLongElement(term21043, 1, -1206957600L);
        setLongElement(term21043, 2, -1191362400L);
        setLongElement(term21043, 3, -1175374800L);
        setLongElement(term21043, 4, -1159826400L);
        setLongElement(term21043, 5, -633819600L);
        setLongElement(term21043, 6, -622069200L);
        setLongElement(term21043, 7, -602283600L);
        setLongElement(term21043, 8, -591832800L);
        setLongElement(term21043, 9, -570747600L);
        setLongElement(term21043, 10, -560210400L);
        setLongElement(term21043, 11, -539125200L);
        setLongElement(term21043, 12, -531352800L);
        setLongElement(term21043, 13, -191365200L);
        setLongElement(term21043, 14, -184197600L);
        setLongElement(term21043, 15, -155163600L);
        setLongElement(term21043, 16, -150069600L);
        setLongElement(term21043, 17, -128898000L);
        setLongElement(term21043, 18, -121125600L);
        setLongElement(term21043, 19, -99954000L);
        setLongElement(term21043, 20, -89589600L);
        setLongElement(term21043, 21, -68418000L);
        setLongElement(term21043, 22, -57967200L);
        setLongElement(term21043, 23, 499748400L);
        setLongElement(term21043, 24, 511236000L);
        setLongElement(term21043, 25, 530593200L);
        setLongElement(term21043, 26, 540266400L);
        setLongElement(term21043, 27, 562129200L);
        setLongElement(term21043, 28, 571197600L);
        setLongElement(term21043, 29, 592974000L);
        setLongElement(term21043, 30, 602042400L);
        setLongElement(term21043, 31, 624423600L);
        setLongElement(term21043, 32, 634701600L);
        setLongElement(term21043, 33, 938919600L);
        setLongElement(term21043, 34, 951616800L);
        setLongElement(term21043, 35, 970974000L);
        setLongElement(term21043, 36, 971575200L);
        setLongElement(term21043, 37, 1003028400L);
        setLongElement(term21043, 38, 1013911200L);
        setField(term21039, term21039.getClass(), "savingsInstantTransitions", term21043);
        setField(term21039, term21039.getClass(), "savingsLocalTransitions", term21083);
        setElement(term21084, 1, term21012);
        setElement(term21084, 3, term21012);
        setElement(term21084, 5, term21012);
        setElement(term21084, 7, term21012);
        setElement(term21084, 9, term21012);
        setElement(term21084, 11, term21012);
        setElement(term21084, 13, term21012);
        setElement(term21084, 15, term21012);
        setElement(term21084, 17, term21012);
        setElement(term21084, 19, term21012);
        setElement(term21084, 21, term21012);
        setElement(term21084, 23, term21012);
        setElement(term21084, 25, term21012);
        setElement(term21084, 27, term21012);
        setElement(term21084, 29, term21012);
        setElement(term21084, 31, term21012);
        setElement(term21084, 33, term21012);
        setElement(term21084, 35, term21012);
        setElement(term21084, 37, term21012);
        setElement(term21084, 39, term21012);
        setField(term21039, term21039.getClass(), "wallOffsets", term21084);
        setField(term21039, term21039.getClass(), "lastRules", term21085);
        setField(term21086, term21086.getClass(), "table", null);
        setField(term21086, term21086.getClass(), "nextTable", null);
        setLongField(term21086, term21086.getClass(), "baseCount", 0L);
        setIntField(term21086, term21086.getClass(), "sizeCtl", 0);
        setIntField(term21086, term21086.getClass(), "transferIndex", 0);
        setIntField(term21086, term21086.getClass(), "cellsBusy", 0);
        setField(term21086, term21086.getClass(), "counterCells", null);
        setField(term21086, term21086.getClass(), "keySet", null);
        setField(term21086, term21086.getClass(), "values", null);
        setField(term21086, term21086.getClass(), "entrySet", null);
        setField(term21086, term21086.getClass(), "keySet", null);
        setField(term21086, term21086.getClass(), "values", null);
        setField(term21039, term21039.getClass(), "lastRulesCache", term21086);
        setField(term21022, term21022.getClass(), "rules", term21039);
        setField(term21001, term21001.getClass(), "zone", term21022);
        setField(term20890, term20890.getClass(), "time_stamp", term21001);
        setField(term20890, term20890.getClass(), "start_up_mode", "VNdDwXMYxR");
        setField(term20890, term20890.getClass(), "cmm_dly_mod", "bVbexZPmwW");
        setField(term20890, term20890.getClass(), "cmm_dly_sec", "tvxYdqiyGc");
        setField(term20890, term20890.getClass(), "cmm_err_mod", "ZEXFoMSKeG");
        setField(term20890, term20890.getClass(), "country_code", "HvxahUfZcJ");
        setField(term20890, term20890.getClass(), "region_code", "WkLpmqoQxy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_a_code", argTypes, term20890, args);
    }

};


