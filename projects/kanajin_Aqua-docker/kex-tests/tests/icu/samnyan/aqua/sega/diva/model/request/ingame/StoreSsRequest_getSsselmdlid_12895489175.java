package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StoreSsRequest_getSsselmdlid_12895489175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248659;

    public StoreSsRequest_getSsselmdlid_12895489175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248659 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term248675 = (int[]) newIntArray(3);
        int[] term248679 = (int[]) newIntArray(6);
        int[] term248686 = (int[]) newIntArray(3);
        int[] term248690 = (int[]) newIntArray(5);
        Object term248780 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term248781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term248791 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term248801 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term248818 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term248819 = (long[]) newLongArray(1);
        Object[] term248821 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term248822 = (long[]) newLongArray(39);
        Object[] term248862 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term248863 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term248864 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term248865 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term248659, term248659.getClass(), "pd_id", -1583770960);
        setField(term248659, term248659.getClass(), "ss_dat_id", "eXHygaZKkI");
        setIntField(term248659, term248659.getClass(), "ss_pv_id", -1699198355);
        setIntField(term248659, term248659.getClass(), "ss_sel_pv_id", -799545342);
        setIntElement(term248675, 0, -1549436342);
        setIntElement(term248675, 1, 1003416248);
        setIntElement(term248675, 2, -400827819);
        setField(term248659, term248659.getClass(), "ss_mdl_id", term248675);
        setIntElement(term248679, 0, -1125062566);
        setIntElement(term248679, 1, -1431103825);
        setIntElement(term248679, 2, -388258705);
        setIntElement(term248679, 3, -2056712526);
        setIntElement(term248679, 4, 1566822021);
        setIntElement(term248679, 5, 1285048687);
        setField(term248659, term248659.getClass(), "ss_sel_mdl_id", term248679);
        setIntElement(term248686, 0, -1057975524);
        setIntElement(term248686, 1, -1682518245);
        setIntElement(term248686, 2, 740260308);
        setField(term248659, term248659.getClass(), "ss_c_itm_id", term248686);
        setIntElement(term248690, 0, -2070446070);
        setIntElement(term248690, 1, 24379465);
        setIntElement(term248690, 2, -1988585948);
        setIntElement(term248690, 3, 135725184);
        setIntElement(term248690, 4, 1245793274);
        setField(term248659, term248659.getClass(), "ss_pxl_sz", term248690);
        setField(term248659, term248659.getClass(), "cmd", "exVBhDpyTv");
        setField(term248659, term248659.getClass(), "req_id", "HIROkhxmYq");
        setField(term248659, term248659.getClass(), "game_id", "IOCISrBpxa");
        setField(term248659, term248659.getClass(), "r_ver", "xYPVdJYlie");
        setField(term248659, term248659.getClass(), "kc_serial", "ReKmMCwzEQ");
        setField(term248659, term248659.getClass(), "b_serial", "tNcYNTIZXy");
        setField(term248659, term248659.getClass(), "place_id", "XntyZLMPel");
        setIntField(term248782, term248782.getClass(), "year", 2011);
        setShortField(term248782, term248782.getClass(), "month", (short) 1);
        setShortField(term248782, term248782.getClass(), "day", (short) 20);
        setField(term248781, term248781.getClass(), "date", term248782);
        setByteField(term248786, term248786.getClass(), "hour", (byte) 5);
        setByteField(term248786, term248786.getClass(), "minute", (byte) 23);
        setByteField(term248786, term248786.getClass(), "second", (byte) 54);
        setIntField(term248786, term248786.getClass(), "nano", 4207750);
        setField(term248781, term248781.getClass(), "time", term248786);
        setField(term248780, term248780.getClass(), "dateTime", term248781);
        setIntField(term248791, term248791.getClass(), "totalSeconds", -10800);
        setField(term248791, term248791.getClass(), "id", "-03:00");
        setField(term248780, term248780.getClass(), "offset", term248791);
        setField(term248801, term248801.getClass(), "id", "America/Recife");
        setLongElement(term248819, 0, -1767217224L);
        setField(term248818, term248818.getClass(), "standardTransitions", term248819);
        setElement(term248821, 1, term248791);
        setField(term248818, term248818.getClass(), "standardOffsets", term248821);
        setLongElement(term248822, 0, -1767217224L);
        setLongElement(term248822, 1, -1206957600L);
        setLongElement(term248822, 2, -1191362400L);
        setLongElement(term248822, 3, -1175374800L);
        setLongElement(term248822, 4, -1159826400L);
        setLongElement(term248822, 5, -633819600L);
        setLongElement(term248822, 6, -622069200L);
        setLongElement(term248822, 7, -602283600L);
        setLongElement(term248822, 8, -591832800L);
        setLongElement(term248822, 9, -570747600L);
        setLongElement(term248822, 10, -560210400L);
        setLongElement(term248822, 11, -539125200L);
        setLongElement(term248822, 12, -531352800L);
        setLongElement(term248822, 13, -191365200L);
        setLongElement(term248822, 14, -184197600L);
        setLongElement(term248822, 15, -155163600L);
        setLongElement(term248822, 16, -150069600L);
        setLongElement(term248822, 17, -128898000L);
        setLongElement(term248822, 18, -121125600L);
        setLongElement(term248822, 19, -99954000L);
        setLongElement(term248822, 20, -89589600L);
        setLongElement(term248822, 21, -68418000L);
        setLongElement(term248822, 22, -57967200L);
        setLongElement(term248822, 23, 499748400L);
        setLongElement(term248822, 24, 511236000L);
        setLongElement(term248822, 25, 530593200L);
        setLongElement(term248822, 26, 540266400L);
        setLongElement(term248822, 27, 562129200L);
        setLongElement(term248822, 28, 571197600L);
        setLongElement(term248822, 29, 592974000L);
        setLongElement(term248822, 30, 602042400L);
        setLongElement(term248822, 31, 624423600L);
        setLongElement(term248822, 32, 634701600L);
        setLongElement(term248822, 33, 938919600L);
        setLongElement(term248822, 34, 951616800L);
        setLongElement(term248822, 35, 970974000L);
        setLongElement(term248822, 36, 971575200L);
        setLongElement(term248822, 37, 1003028400L);
        setLongElement(term248822, 38, 1013911200L);
        setField(term248818, term248818.getClass(), "savingsInstantTransitions", term248822);
        setField(term248818, term248818.getClass(), "savingsLocalTransitions", term248862);
        setElement(term248863, 1, term248791);
        setElement(term248863, 3, term248791);
        setElement(term248863, 5, term248791);
        setElement(term248863, 7, term248791);
        setElement(term248863, 9, term248791);
        setElement(term248863, 11, term248791);
        setElement(term248863, 13, term248791);
        setElement(term248863, 15, term248791);
        setElement(term248863, 17, term248791);
        setElement(term248863, 19, term248791);
        setElement(term248863, 21, term248791);
        setElement(term248863, 23, term248791);
        setElement(term248863, 25, term248791);
        setElement(term248863, 27, term248791);
        setElement(term248863, 29, term248791);
        setElement(term248863, 31, term248791);
        setElement(term248863, 33, term248791);
        setElement(term248863, 35, term248791);
        setElement(term248863, 37, term248791);
        setElement(term248863, 39, term248791);
        setField(term248818, term248818.getClass(), "wallOffsets", term248863);
        setField(term248818, term248818.getClass(), "lastRules", term248864);
        setField(term248865, term248865.getClass(), "table", null);
        setField(term248865, term248865.getClass(), "nextTable", null);
        setLongField(term248865, term248865.getClass(), "baseCount", 0L);
        setIntField(term248865, term248865.getClass(), "sizeCtl", 0);
        setIntField(term248865, term248865.getClass(), "transferIndex", 0);
        setIntField(term248865, term248865.getClass(), "cellsBusy", 0);
        setField(term248865, term248865.getClass(), "counterCells", null);
        setField(term248865, term248865.getClass(), "keySet", null);
        setField(term248865, term248865.getClass(), "values", null);
        setField(term248865, term248865.getClass(), "entrySet", null);
        setField(term248865, term248865.getClass(), "keySet", null);
        setField(term248865, term248865.getClass(), "values", null);
        setField(term248818, term248818.getClass(), "lastRulesCache", term248865);
        setField(term248801, term248801.getClass(), "rules", term248818);
        setField(term248780, term248780.getClass(), "zone", term248801);
        setField(term248659, term248659.getClass(), "time_stamp", term248780);
        setField(term248659, term248659.getClass(), "start_up_mode", "kRYwILGOiG");
        setField(term248659, term248659.getClass(), "cmm_dly_mod", "lGzUITCYwf");
        setField(term248659, term248659.getClass(), "cmm_dly_sec", "OOTylmfCYh");
        setField(term248659, term248659.getClass(), "cmm_err_mod", "tDqwvIixso");
        setField(term248659, term248659.getClass(), "country_code", "liEYQdFeWW");
        setField(term248659, term248659.getClass(), "region_code", "ADqXMyhBwX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSs_sel_mdl_id", argTypes, term248659, args);
    }

};


