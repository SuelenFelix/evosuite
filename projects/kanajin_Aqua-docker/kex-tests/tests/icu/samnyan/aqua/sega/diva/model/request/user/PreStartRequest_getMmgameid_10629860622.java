package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PreStartRequest_getMmgameid_10629860622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10609;

    public PreStartRequest_getMmgameid_10629860622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10609 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term10780 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term10781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10791 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term10801 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term10818 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term10819 = (long[]) newLongArray(1);
        Object[] term10821 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term10822 = (long[]) newLongArray(39);
        Object[] term10862 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term10863 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term10864 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term10865 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term10609, term10609.getClass(), "pmm", "vLerpqavFM");
        setField(term10609, term10609.getClass(), "idm", "qnvxzwuGKX");
        setField(term10609, term10609.getClass(), "mmgameid", "EdPAvpluZg");
        setField(term10609, term10609.getClass(), "mmuid", "DzHVBMqWtE");
        setField(term10609, term10609.getClass(), "a_code", "THZSpzBRYP");
        setIntField(term10609, term10609.getClass(), "aime_id", 1166710220);
        setField(term10609, term10609.getClass(), "aime_a_code", "ZfBIVGBQOE");
        setField(term10609, term10609.getClass(), "key_obj_type", "QSrDQfEsTR");
        setBooleanField(term10609, term10609.getClass(), "exec_vu", false);
        setField(term10609, term10609.getClass(), "cmd", "PsqusYmejD");
        setField(term10609, term10609.getClass(), "req_id", "NTWMiBEaDF");
        setField(term10609, term10609.getClass(), "game_id", "SPBstwKFVr");
        setField(term10609, term10609.getClass(), "r_ver", "WxYUTuqmIq");
        setField(term10609, term10609.getClass(), "kc_serial", "OeQLvhVERT");
        setField(term10609, term10609.getClass(), "b_serial", "IlvgFINwIa");
        setField(term10609, term10609.getClass(), "place_id", "GEJABPlHSI");
        setIntField(term10782, term10782.getClass(), "year", 2015);
        setShortField(term10782, term10782.getClass(), "month", (short) 3);
        setShortField(term10782, term10782.getClass(), "day", (short) 10);
        setField(term10781, term10781.getClass(), "date", term10782);
        setByteField(term10786, term10786.getClass(), "hour", (byte) 23);
        setByteField(term10786, term10786.getClass(), "minute", (byte) 34);
        setByteField(term10786, term10786.getClass(), "second", (byte) 44);
        setIntField(term10786, term10786.getClass(), "nano", 587322824);
        setField(term10781, term10781.getClass(), "time", term10786);
        setField(term10780, term10780.getClass(), "dateTime", term10781);
        setIntField(term10791, term10791.getClass(), "totalSeconds", -10800);
        setField(term10791, term10791.getClass(), "id", "-03:00");
        setField(term10780, term10780.getClass(), "offset", term10791);
        setField(term10801, term10801.getClass(), "id", "America/Recife");
        setLongElement(term10819, 0, -1767217224L);
        setField(term10818, term10818.getClass(), "standardTransitions", term10819);
        setElement(term10821, 1, term10791);
        setField(term10818, term10818.getClass(), "standardOffsets", term10821);
        setLongElement(term10822, 0, -1767217224L);
        setLongElement(term10822, 1, -1206957600L);
        setLongElement(term10822, 2, -1191362400L);
        setLongElement(term10822, 3, -1175374800L);
        setLongElement(term10822, 4, -1159826400L);
        setLongElement(term10822, 5, -633819600L);
        setLongElement(term10822, 6, -622069200L);
        setLongElement(term10822, 7, -602283600L);
        setLongElement(term10822, 8, -591832800L);
        setLongElement(term10822, 9, -570747600L);
        setLongElement(term10822, 10, -560210400L);
        setLongElement(term10822, 11, -539125200L);
        setLongElement(term10822, 12, -531352800L);
        setLongElement(term10822, 13, -191365200L);
        setLongElement(term10822, 14, -184197600L);
        setLongElement(term10822, 15, -155163600L);
        setLongElement(term10822, 16, -150069600L);
        setLongElement(term10822, 17, -128898000L);
        setLongElement(term10822, 18, -121125600L);
        setLongElement(term10822, 19, -99954000L);
        setLongElement(term10822, 20, -89589600L);
        setLongElement(term10822, 21, -68418000L);
        setLongElement(term10822, 22, -57967200L);
        setLongElement(term10822, 23, 499748400L);
        setLongElement(term10822, 24, 511236000L);
        setLongElement(term10822, 25, 530593200L);
        setLongElement(term10822, 26, 540266400L);
        setLongElement(term10822, 27, 562129200L);
        setLongElement(term10822, 28, 571197600L);
        setLongElement(term10822, 29, 592974000L);
        setLongElement(term10822, 30, 602042400L);
        setLongElement(term10822, 31, 624423600L);
        setLongElement(term10822, 32, 634701600L);
        setLongElement(term10822, 33, 938919600L);
        setLongElement(term10822, 34, 951616800L);
        setLongElement(term10822, 35, 970974000L);
        setLongElement(term10822, 36, 971575200L);
        setLongElement(term10822, 37, 1003028400L);
        setLongElement(term10822, 38, 1013911200L);
        setField(term10818, term10818.getClass(), "savingsInstantTransitions", term10822);
        setField(term10818, term10818.getClass(), "savingsLocalTransitions", term10862);
        setElement(term10863, 1, term10791);
        setElement(term10863, 3, term10791);
        setElement(term10863, 5, term10791);
        setElement(term10863, 7, term10791);
        setElement(term10863, 9, term10791);
        setElement(term10863, 11, term10791);
        setElement(term10863, 13, term10791);
        setElement(term10863, 15, term10791);
        setElement(term10863, 17, term10791);
        setElement(term10863, 19, term10791);
        setElement(term10863, 21, term10791);
        setElement(term10863, 23, term10791);
        setElement(term10863, 25, term10791);
        setElement(term10863, 27, term10791);
        setElement(term10863, 29, term10791);
        setElement(term10863, 31, term10791);
        setElement(term10863, 33, term10791);
        setElement(term10863, 35, term10791);
        setElement(term10863, 37, term10791);
        setElement(term10863, 39, term10791);
        setField(term10818, term10818.getClass(), "wallOffsets", term10863);
        setField(term10818, term10818.getClass(), "lastRules", term10864);
        setField(term10865, term10865.getClass(), "table", null);
        setField(term10865, term10865.getClass(), "nextTable", null);
        setLongField(term10865, term10865.getClass(), "baseCount", 0L);
        setIntField(term10865, term10865.getClass(), "sizeCtl", 0);
        setIntField(term10865, term10865.getClass(), "transferIndex", 0);
        setIntField(term10865, term10865.getClass(), "cellsBusy", 0);
        setField(term10865, term10865.getClass(), "counterCells", null);
        setField(term10865, term10865.getClass(), "keySet", null);
        setField(term10865, term10865.getClass(), "values", null);
        setField(term10865, term10865.getClass(), "entrySet", null);
        setField(term10865, term10865.getClass(), "keySet", null);
        setField(term10865, term10865.getClass(), "values", null);
        setField(term10818, term10818.getClass(), "lastRulesCache", term10865);
        setField(term10801, term10801.getClass(), "rules", term10818);
        setField(term10780, term10780.getClass(), "zone", term10801);
        setField(term10609, term10609.getClass(), "time_stamp", term10780);
        setField(term10609, term10609.getClass(), "start_up_mode", "aQFUvuaYxd");
        setField(term10609, term10609.getClass(), "cmm_dly_mod", "zNFLXMifnS");
        setField(term10609, term10609.getClass(), "cmm_dly_sec", "HHQcYMSBVc");
        setField(term10609, term10609.getClass(), "cmm_err_mod", "wdoqITnaAP");
        setField(term10609, term10609.getClass(), "country_code", "rIPMBcrNqB");
        setField(term10609, term10609.getClass(), "region_code", "UDaboHZHhz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMmgameid", argTypes, term10609, args);
    }

};


