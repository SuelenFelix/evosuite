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
import java.lang.Integer;

public class ChangeNameRequest_setChgnameprice_104705252313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30096;
     Object term30383;

    public ChangeNameRequest_setChgnameprice_104705252313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30096 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term30221 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term30222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30227 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30232 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term30242 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term30259 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term30260 = (long[]) newLongArray(1);
        Object[] term30262 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term30263 = (long[]) newLongArray(39);
        Object[] term30303 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term30304 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term30305 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term30306 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term30096, term30096.getClass(), "a_code", "YfgYGgzYER");
        setIntField(term30096, term30096.getClass(), "aime_id", -2063457669);
        setField(term30096, term30096.getClass(), "aime_a_code", "IDClvDZuqE");
        setIntField(term30096, term30096.getClass(), "pd_id", -1222006000);
        setIntField(term30096, term30096.getClass(), "accept_idx", 2095798786);
        setField(term30096, term30096.getClass(), "player_name", "cMvKxpZOvg");
        setIntField(term30096, term30096.getClass(), "chg_name_price", -1565502840);
        setField(term30096, term30096.getClass(), "cmd", "WWBYemIuiK");
        setField(term30096, term30096.getClass(), "req_id", "nHYQYkycCR");
        setField(term30096, term30096.getClass(), "game_id", "yBiVacDcZX");
        setField(term30096, term30096.getClass(), "r_ver", "QrKfEgQeoy");
        setField(term30096, term30096.getClass(), "kc_serial", "oApgdbwnti");
        setField(term30096, term30096.getClass(), "b_serial", "YcgHACNgyo");
        setField(term30096, term30096.getClass(), "place_id", "MrUPJzBTEn");
        setIntField(term30223, term30223.getClass(), "year", 2012);
        setShortField(term30223, term30223.getClass(), "month", (short) 7);
        setShortField(term30223, term30223.getClass(), "day", (short) 21);
        setField(term30222, term30222.getClass(), "date", term30223);
        setByteField(term30227, term30227.getClass(), "hour", (byte) 13);
        setByteField(term30227, term30227.getClass(), "minute", (byte) 41);
        setByteField(term30227, term30227.getClass(), "second", (byte) 44);
        setIntField(term30227, term30227.getClass(), "nano", 394467282);
        setField(term30222, term30222.getClass(), "time", term30227);
        setField(term30221, term30221.getClass(), "dateTime", term30222);
        setIntField(term30232, term30232.getClass(), "totalSeconds", -10800);
        setField(term30232, term30232.getClass(), "id", "-03:00");
        setField(term30221, term30221.getClass(), "offset", term30232);
        setField(term30242, term30242.getClass(), "id", "America/Recife");
        setLongElement(term30260, 0, -1767217224L);
        setField(term30259, term30259.getClass(), "standardTransitions", term30260);
        setElement(term30262, 1, term30232);
        setField(term30259, term30259.getClass(), "standardOffsets", term30262);
        setLongElement(term30263, 0, -1767217224L);
        setLongElement(term30263, 1, -1206957600L);
        setLongElement(term30263, 2, -1191362400L);
        setLongElement(term30263, 3, -1175374800L);
        setLongElement(term30263, 4, -1159826400L);
        setLongElement(term30263, 5, -633819600L);
        setLongElement(term30263, 6, -622069200L);
        setLongElement(term30263, 7, -602283600L);
        setLongElement(term30263, 8, -591832800L);
        setLongElement(term30263, 9, -570747600L);
        setLongElement(term30263, 10, -560210400L);
        setLongElement(term30263, 11, -539125200L);
        setLongElement(term30263, 12, -531352800L);
        setLongElement(term30263, 13, -191365200L);
        setLongElement(term30263, 14, -184197600L);
        setLongElement(term30263, 15, -155163600L);
        setLongElement(term30263, 16, -150069600L);
        setLongElement(term30263, 17, -128898000L);
        setLongElement(term30263, 18, -121125600L);
        setLongElement(term30263, 19, -99954000L);
        setLongElement(term30263, 20, -89589600L);
        setLongElement(term30263, 21, -68418000L);
        setLongElement(term30263, 22, -57967200L);
        setLongElement(term30263, 23, 499748400L);
        setLongElement(term30263, 24, 511236000L);
        setLongElement(term30263, 25, 530593200L);
        setLongElement(term30263, 26, 540266400L);
        setLongElement(term30263, 27, 562129200L);
        setLongElement(term30263, 28, 571197600L);
        setLongElement(term30263, 29, 592974000L);
        setLongElement(term30263, 30, 602042400L);
        setLongElement(term30263, 31, 624423600L);
        setLongElement(term30263, 32, 634701600L);
        setLongElement(term30263, 33, 938919600L);
        setLongElement(term30263, 34, 951616800L);
        setLongElement(term30263, 35, 970974000L);
        setLongElement(term30263, 36, 971575200L);
        setLongElement(term30263, 37, 1003028400L);
        setLongElement(term30263, 38, 1013911200L);
        setField(term30259, term30259.getClass(), "savingsInstantTransitions", term30263);
        setField(term30259, term30259.getClass(), "savingsLocalTransitions", term30303);
        setElement(term30304, 1, term30232);
        setElement(term30304, 3, term30232);
        setElement(term30304, 5, term30232);
        setElement(term30304, 7, term30232);
        setElement(term30304, 9, term30232);
        setElement(term30304, 11, term30232);
        setElement(term30304, 13, term30232);
        setElement(term30304, 15, term30232);
        setElement(term30304, 17, term30232);
        setElement(term30304, 19, term30232);
        setElement(term30304, 21, term30232);
        setElement(term30304, 23, term30232);
        setElement(term30304, 25, term30232);
        setElement(term30304, 27, term30232);
        setElement(term30304, 29, term30232);
        setElement(term30304, 31, term30232);
        setElement(term30304, 33, term30232);
        setElement(term30304, 35, term30232);
        setElement(term30304, 37, term30232);
        setElement(term30304, 39, term30232);
        setField(term30259, term30259.getClass(), "wallOffsets", term30304);
        setField(term30259, term30259.getClass(), "lastRules", term30305);
        setField(term30306, term30306.getClass(), "table", null);
        setField(term30306, term30306.getClass(), "nextTable", null);
        setLongField(term30306, term30306.getClass(), "baseCount", 0L);
        setIntField(term30306, term30306.getClass(), "sizeCtl", 0);
        setIntField(term30306, term30306.getClass(), "transferIndex", 0);
        setIntField(term30306, term30306.getClass(), "cellsBusy", 0);
        setField(term30306, term30306.getClass(), "counterCells", null);
        setField(term30306, term30306.getClass(), "keySet", null);
        setField(term30306, term30306.getClass(), "values", null);
        setField(term30306, term30306.getClass(), "entrySet", null);
        setField(term30306, term30306.getClass(), "keySet", null);
        setField(term30306, term30306.getClass(), "values", null);
        setField(term30259, term30259.getClass(), "lastRulesCache", term30306);
        setField(term30242, term30242.getClass(), "rules", term30259);
        setField(term30221, term30221.getClass(), "zone", term30242);
        setField(term30096, term30096.getClass(), "time_stamp", term30221);
        setField(term30096, term30096.getClass(), "start_up_mode", "IaSymdfFGa");
        setField(term30096, term30096.getClass(), "cmm_dly_mod", "FxSvJCIpul");
        setField(term30096, term30096.getClass(), "cmm_dly_sec", "HCjKwpexJj");
        setField(term30096, term30096.getClass(), "cmm_err_mod", "sCpIHVPdfl");
        setField(term30096, term30096.getClass(), "country_code", "lMUBBGRjfY");
        setField(term30096, term30096.getClass(), "region_code", "olYpqbolWL");
        term30383 = new Integer(344323424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30383;
        callMethod(klass, "setChg_name_price", argTypes, term30096, args);
    }

};


