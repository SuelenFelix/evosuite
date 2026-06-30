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

public class CardProcedureRequest_setCdadmcmd_9503587804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21373;
     Object term21646;

    public CardProcedureRequest_setCdadmcmd_9503587804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21373 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        Object term21484 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term21485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21490 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21495 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term21505 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term21522 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term21523 = (long[]) newLongArray(1);
        Object[] term21525 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term21526 = (long[]) newLongArray(39);
        Object[] term21566 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term21567 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term21568 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term21569 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term21373, term21373.getClass(), "cd_adm_cmd", 1540719661);
        setField(term21373, term21373.getClass(), "a_code", "XiNoscmYhd");
        setIntField(term21373, term21373.getClass(), "aime_id", 1265463001);
        setField(term21373, term21373.getClass(), "aime_a_code", "asMqnMNrZp");
        setField(term21373, term21373.getClass(), "cmd", "pqFUMTCKJd");
        setField(term21373, term21373.getClass(), "req_id", "PTEndmPMzk");
        setField(term21373, term21373.getClass(), "game_id", "aJQuCOCvZs");
        setField(term21373, term21373.getClass(), "r_ver", "lHYNCJRiOv");
        setField(term21373, term21373.getClass(), "kc_serial", "QVLresHoaP");
        setField(term21373, term21373.getClass(), "b_serial", "IbxeAMwLVt");
        setField(term21373, term21373.getClass(), "place_id", "bShlAqoTmZ");
        setIntField(term21486, term21486.getClass(), "year", 2010);
        setShortField(term21486, term21486.getClass(), "month", (short) 1);
        setShortField(term21486, term21486.getClass(), "day", (short) 17);
        setField(term21485, term21485.getClass(), "date", term21486);
        setByteField(term21490, term21490.getClass(), "hour", (byte) 13);
        setByteField(term21490, term21490.getClass(), "minute", (byte) 5);
        setByteField(term21490, term21490.getClass(), "second", (byte) 51);
        setIntField(term21490, term21490.getClass(), "nano", 362260580);
        setField(term21485, term21485.getClass(), "time", term21490);
        setField(term21484, term21484.getClass(), "dateTime", term21485);
        setIntField(term21495, term21495.getClass(), "totalSeconds", -10800);
        setField(term21495, term21495.getClass(), "id", "-03:00");
        setField(term21484, term21484.getClass(), "offset", term21495);
        setField(term21505, term21505.getClass(), "id", "America/Recife");
        setLongElement(term21523, 0, -1767217224L);
        setField(term21522, term21522.getClass(), "standardTransitions", term21523);
        setElement(term21525, 1, term21495);
        setField(term21522, term21522.getClass(), "standardOffsets", term21525);
        setLongElement(term21526, 0, -1767217224L);
        setLongElement(term21526, 1, -1206957600L);
        setLongElement(term21526, 2, -1191362400L);
        setLongElement(term21526, 3, -1175374800L);
        setLongElement(term21526, 4, -1159826400L);
        setLongElement(term21526, 5, -633819600L);
        setLongElement(term21526, 6, -622069200L);
        setLongElement(term21526, 7, -602283600L);
        setLongElement(term21526, 8, -591832800L);
        setLongElement(term21526, 9, -570747600L);
        setLongElement(term21526, 10, -560210400L);
        setLongElement(term21526, 11, -539125200L);
        setLongElement(term21526, 12, -531352800L);
        setLongElement(term21526, 13, -191365200L);
        setLongElement(term21526, 14, -184197600L);
        setLongElement(term21526, 15, -155163600L);
        setLongElement(term21526, 16, -150069600L);
        setLongElement(term21526, 17, -128898000L);
        setLongElement(term21526, 18, -121125600L);
        setLongElement(term21526, 19, -99954000L);
        setLongElement(term21526, 20, -89589600L);
        setLongElement(term21526, 21, -68418000L);
        setLongElement(term21526, 22, -57967200L);
        setLongElement(term21526, 23, 499748400L);
        setLongElement(term21526, 24, 511236000L);
        setLongElement(term21526, 25, 530593200L);
        setLongElement(term21526, 26, 540266400L);
        setLongElement(term21526, 27, 562129200L);
        setLongElement(term21526, 28, 571197600L);
        setLongElement(term21526, 29, 592974000L);
        setLongElement(term21526, 30, 602042400L);
        setLongElement(term21526, 31, 624423600L);
        setLongElement(term21526, 32, 634701600L);
        setLongElement(term21526, 33, 938919600L);
        setLongElement(term21526, 34, 951616800L);
        setLongElement(term21526, 35, 970974000L);
        setLongElement(term21526, 36, 971575200L);
        setLongElement(term21526, 37, 1003028400L);
        setLongElement(term21526, 38, 1013911200L);
        setField(term21522, term21522.getClass(), "savingsInstantTransitions", term21526);
        setField(term21522, term21522.getClass(), "savingsLocalTransitions", term21566);
        setElement(term21567, 1, term21495);
        setElement(term21567, 3, term21495);
        setElement(term21567, 5, term21495);
        setElement(term21567, 7, term21495);
        setElement(term21567, 9, term21495);
        setElement(term21567, 11, term21495);
        setElement(term21567, 13, term21495);
        setElement(term21567, 15, term21495);
        setElement(term21567, 17, term21495);
        setElement(term21567, 19, term21495);
        setElement(term21567, 21, term21495);
        setElement(term21567, 23, term21495);
        setElement(term21567, 25, term21495);
        setElement(term21567, 27, term21495);
        setElement(term21567, 29, term21495);
        setElement(term21567, 31, term21495);
        setElement(term21567, 33, term21495);
        setElement(term21567, 35, term21495);
        setElement(term21567, 37, term21495);
        setElement(term21567, 39, term21495);
        setField(term21522, term21522.getClass(), "wallOffsets", term21567);
        setField(term21522, term21522.getClass(), "lastRules", term21568);
        setField(term21569, term21569.getClass(), "table", null);
        setField(term21569, term21569.getClass(), "nextTable", null);
        setLongField(term21569, term21569.getClass(), "baseCount", 0L);
        setIntField(term21569, term21569.getClass(), "sizeCtl", 0);
        setIntField(term21569, term21569.getClass(), "transferIndex", 0);
        setIntField(term21569, term21569.getClass(), "cellsBusy", 0);
        setField(term21569, term21569.getClass(), "counterCells", null);
        setField(term21569, term21569.getClass(), "keySet", null);
        setField(term21569, term21569.getClass(), "values", null);
        setField(term21569, term21569.getClass(), "entrySet", null);
        setField(term21569, term21569.getClass(), "keySet", null);
        setField(term21569, term21569.getClass(), "values", null);
        setField(term21522, term21522.getClass(), "lastRulesCache", term21569);
        setField(term21505, term21505.getClass(), "rules", term21522);
        setField(term21484, term21484.getClass(), "zone", term21505);
        setField(term21373, term21373.getClass(), "time_stamp", term21484);
        setField(term21373, term21373.getClass(), "start_up_mode", "nOKlKlNhtU");
        setField(term21373, term21373.getClass(), "cmm_dly_mod", "gXFNBHJSey");
        setField(term21373, term21373.getClass(), "cmm_dly_sec", "wUcSfItZgv");
        setField(term21373, term21373.getClass(), "cmm_err_mod", "rOfPCPHmtJ");
        setField(term21373, term21373.getClass(), "country_code", "EnmiAvfpJv");
        setField(term21373, term21373.getClass(), "region_code", "AdYzLPMcwe");
        term21646 = new Integer(335112684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21646;
        callMethod(klass, "setCd_adm_cmd", argTypes, term21373, args);
    }

};


