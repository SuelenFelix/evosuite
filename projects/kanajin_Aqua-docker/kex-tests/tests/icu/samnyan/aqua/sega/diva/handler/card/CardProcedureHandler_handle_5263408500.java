package icu.samnyan.aqua.sega.diva.handler.card;

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
import static icu.samnyan.aqua.sega.diva.handler.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CardProcedureHandler_handle_5263408500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639;

    public CardProcedureHandler_handle_5263408500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term639 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        Object term750 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term756 = newInstance(Class.forName("java.time.LocalTime"));
        Object term761 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term771 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term788 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term789 = (long[]) newLongArray(1);
        Object[] term791 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term792 = (long[]) newLongArray(39);
        Object[] term832 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term833 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term834 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term835 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term639, term639.getClass(), "cd_adm_cmd", 1162663216);
        setField(term639, term639.getClass(), "a_code", "xOEqzGAmDU");
        setIntField(term639, term639.getClass(), "aime_id", 1484323161);
        setField(term639, term639.getClass(), "aime_a_code", "eZFUvlxvGV");
        setField(term639, term639.getClass(), "cmd", "BYqFIqCKAV");
        setField(term639, term639.getClass(), "req_id", "vrQLuWIDJX");
        setField(term639, term639.getClass(), "game_id", "flxyYxBRtu");
        setField(term639, term639.getClass(), "r_ver", "OclPbYPkcH");
        setField(term639, term639.getClass(), "kc_serial", "IoAlmYsBwc");
        setField(term639, term639.getClass(), "b_serial", "TEParAifyi");
        setField(term639, term639.getClass(), "place_id", "OWDIEULEFu");
        setIntField(term752, term752.getClass(), "year", 2021);
        setShortField(term752, term752.getClass(), "month", (short) 1);
        setShortField(term752, term752.getClass(), "day", (short) 18);
        setField(term751, term751.getClass(), "date", term752);
        setByteField(term756, term756.getClass(), "hour", (byte) 13);
        setByteField(term756, term756.getClass(), "minute", (byte) 38);
        setByteField(term756, term756.getClass(), "second", (byte) 26);
        setIntField(term756, term756.getClass(), "nano", 544608644);
        setField(term751, term751.getClass(), "time", term756);
        setField(term750, term750.getClass(), "dateTime", term751);
        setIntField(term761, term761.getClass(), "totalSeconds", -10800);
        setField(term761, term761.getClass(), "id", "-03:00");
        setField(term750, term750.getClass(), "offset", term761);
        setField(term771, term771.getClass(), "id", "America/Recife");
        setLongElement(term789, 0, -1767217224L);
        setField(term788, term788.getClass(), "standardTransitions", term789);
        setElement(term791, 1, term761);
        setField(term788, term788.getClass(), "standardOffsets", term791);
        setLongElement(term792, 0, -1767217224L);
        setLongElement(term792, 1, -1206957600L);
        setLongElement(term792, 2, -1191362400L);
        setLongElement(term792, 3, -1175374800L);
        setLongElement(term792, 4, -1159826400L);
        setLongElement(term792, 5, -633819600L);
        setLongElement(term792, 6, -622069200L);
        setLongElement(term792, 7, -602283600L);
        setLongElement(term792, 8, -591832800L);
        setLongElement(term792, 9, -570747600L);
        setLongElement(term792, 10, -560210400L);
        setLongElement(term792, 11, -539125200L);
        setLongElement(term792, 12, -531352800L);
        setLongElement(term792, 13, -191365200L);
        setLongElement(term792, 14, -184197600L);
        setLongElement(term792, 15, -155163600L);
        setLongElement(term792, 16, -150069600L);
        setLongElement(term792, 17, -128898000L);
        setLongElement(term792, 18, -121125600L);
        setLongElement(term792, 19, -99954000L);
        setLongElement(term792, 20, -89589600L);
        setLongElement(term792, 21, -68418000L);
        setLongElement(term792, 22, -57967200L);
        setLongElement(term792, 23, 499748400L);
        setLongElement(term792, 24, 511236000L);
        setLongElement(term792, 25, 530593200L);
        setLongElement(term792, 26, 540266400L);
        setLongElement(term792, 27, 562129200L);
        setLongElement(term792, 28, 571197600L);
        setLongElement(term792, 29, 592974000L);
        setLongElement(term792, 30, 602042400L);
        setLongElement(term792, 31, 624423600L);
        setLongElement(term792, 32, 634701600L);
        setLongElement(term792, 33, 938919600L);
        setLongElement(term792, 34, 951616800L);
        setLongElement(term792, 35, 970974000L);
        setLongElement(term792, 36, 971575200L);
        setLongElement(term792, 37, 1003028400L);
        setLongElement(term792, 38, 1013911200L);
        setField(term788, term788.getClass(), "savingsInstantTransitions", term792);
        setField(term788, term788.getClass(), "savingsLocalTransitions", term832);
        setElement(term833, 1, term761);
        setElement(term833, 3, term761);
        setElement(term833, 5, term761);
        setElement(term833, 7, term761);
        setElement(term833, 9, term761);
        setElement(term833, 11, term761);
        setElement(term833, 13, term761);
        setElement(term833, 15, term761);
        setElement(term833, 17, term761);
        setElement(term833, 19, term761);
        setElement(term833, 21, term761);
        setElement(term833, 23, term761);
        setElement(term833, 25, term761);
        setElement(term833, 27, term761);
        setElement(term833, 29, term761);
        setElement(term833, 31, term761);
        setElement(term833, 33, term761);
        setElement(term833, 35, term761);
        setElement(term833, 37, term761);
        setElement(term833, 39, term761);
        setField(term788, term788.getClass(), "wallOffsets", term833);
        setField(term788, term788.getClass(), "lastRules", term834);
        setField(term835, term835.getClass(), "table", null);
        setField(term835, term835.getClass(), "nextTable", null);
        setLongField(term835, term835.getClass(), "baseCount", 0L);
        setIntField(term835, term835.getClass(), "sizeCtl", 0);
        setIntField(term835, term835.getClass(), "transferIndex", 0);
        setIntField(term835, term835.getClass(), "cellsBusy", 0);
        setField(term835, term835.getClass(), "counterCells", null);
        setField(term835, term835.getClass(), "keySet", null);
        setField(term835, term835.getClass(), "values", null);
        setField(term835, term835.getClass(), "entrySet", null);
        setField(term835, term835.getClass(), "keySet", null);
        setField(term835, term835.getClass(), "values", null);
        setField(term788, term788.getClass(), "lastRulesCache", term835);
        setField(term771, term771.getClass(), "rules", term788);
        setField(term750, term750.getClass(), "zone", term771);
        setField(term639, term639.getClass(), "time_stamp", term750);
        setField(term639, term639.getClass(), "start_up_mode", "dWRymuLBtr");
        setField(term639, term639.getClass(), "cmm_dly_mod", "AijpHYOFuy");
        setField(term639, term639.getClass(), "cmm_dly_sec", "SbAoxhfrkn");
        setField(term639, term639.getClass(), "cmm_err_mod", "kuTXqwMtDB");
        setField(term639, term639.getClass(), "country_code", "Ghbwtircqb");
        setField(term639, term639.getClass(), "region_code", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.CardProcedureHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Object[] args = new Object[1];
        args[0] = term639;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


