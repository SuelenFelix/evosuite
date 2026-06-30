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

public class RegistrationRequest_getPlayername_17527524898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11365;

    public RegistrationRequest_getPlayername_17527524898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11365 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term11559 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term11560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11565 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11570 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term11580 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term11597 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term11598 = (long[]) newLongArray(1);
        Object[] term11600 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term11601 = (long[]) newLongArray(39);
        Object[] term11641 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term11642 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term11643 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term11644 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term11365, term11365.getClass(), "pmm", "lBOokzEPfe");
        setField(term11365, term11365.getClass(), "idm", "dtGZCsKXbW");
        setField(term11365, term11365.getClass(), "mmgameid", "bdyhHbDAmJ");
        setField(term11365, term11365.getClass(), "mmuid", "BBXiTNHqGE");
        setField(term11365, term11365.getClass(), "a_code", "IEYhJmgCVd");
        setIntField(term11365, term11365.getClass(), "aime_id", 1632125673);
        setField(term11365, term11365.getClass(), "aime_a_code", "KSJeYkkvpk");
        setField(term11365, term11365.getClass(), "key_obj_type", "qUtkFGMNUV");
        setField(term11365, term11365.getClass(), "player_name", "mGRiYhnMcR");
        setField(term11365, term11365.getClass(), "passwd", "NFlvfJCVPO");
        setField(term11365, term11365.getClass(), "cmd", "KarbTXFmUU");
        setField(term11365, term11365.getClass(), "req_id", "jiUSjqwSIQ");
        setField(term11365, term11365.getClass(), "game_id", "MgLCedQfoj");
        setField(term11365, term11365.getClass(), "r_ver", "zgKiINdgNu");
        setField(term11365, term11365.getClass(), "kc_serial", "zLMTXDQHYH");
        setField(term11365, term11365.getClass(), "b_serial", "PqywFWJlpE");
        setField(term11365, term11365.getClass(), "place_id", "OzXRsFGTIp");
        setIntField(term11561, term11561.getClass(), "year", 2014);
        setShortField(term11561, term11561.getClass(), "month", (short) 7);
        setShortField(term11561, term11561.getClass(), "day", (short) 13);
        setField(term11560, term11560.getClass(), "date", term11561);
        setByteField(term11565, term11565.getClass(), "hour", (byte) 21);
        setByteField(term11565, term11565.getClass(), "minute", (byte) 46);
        setByteField(term11565, term11565.getClass(), "second", (byte) 0);
        setIntField(term11565, term11565.getClass(), "nano", 887884128);
        setField(term11560, term11560.getClass(), "time", term11565);
        setField(term11559, term11559.getClass(), "dateTime", term11560);
        setIntField(term11570, term11570.getClass(), "totalSeconds", -10800);
        setField(term11570, term11570.getClass(), "id", "-03:00");
        setField(term11559, term11559.getClass(), "offset", term11570);
        setField(term11580, term11580.getClass(), "id", "America/Recife");
        setLongElement(term11598, 0, -1767217224L);
        setField(term11597, term11597.getClass(), "standardTransitions", term11598);
        setElement(term11600, 1, term11570);
        setField(term11597, term11597.getClass(), "standardOffsets", term11600);
        setLongElement(term11601, 0, -1767217224L);
        setLongElement(term11601, 1, -1206957600L);
        setLongElement(term11601, 2, -1191362400L);
        setLongElement(term11601, 3, -1175374800L);
        setLongElement(term11601, 4, -1159826400L);
        setLongElement(term11601, 5, -633819600L);
        setLongElement(term11601, 6, -622069200L);
        setLongElement(term11601, 7, -602283600L);
        setLongElement(term11601, 8, -591832800L);
        setLongElement(term11601, 9, -570747600L);
        setLongElement(term11601, 10, -560210400L);
        setLongElement(term11601, 11, -539125200L);
        setLongElement(term11601, 12, -531352800L);
        setLongElement(term11601, 13, -191365200L);
        setLongElement(term11601, 14, -184197600L);
        setLongElement(term11601, 15, -155163600L);
        setLongElement(term11601, 16, -150069600L);
        setLongElement(term11601, 17, -128898000L);
        setLongElement(term11601, 18, -121125600L);
        setLongElement(term11601, 19, -99954000L);
        setLongElement(term11601, 20, -89589600L);
        setLongElement(term11601, 21, -68418000L);
        setLongElement(term11601, 22, -57967200L);
        setLongElement(term11601, 23, 499748400L);
        setLongElement(term11601, 24, 511236000L);
        setLongElement(term11601, 25, 530593200L);
        setLongElement(term11601, 26, 540266400L);
        setLongElement(term11601, 27, 562129200L);
        setLongElement(term11601, 28, 571197600L);
        setLongElement(term11601, 29, 592974000L);
        setLongElement(term11601, 30, 602042400L);
        setLongElement(term11601, 31, 624423600L);
        setLongElement(term11601, 32, 634701600L);
        setLongElement(term11601, 33, 938919600L);
        setLongElement(term11601, 34, 951616800L);
        setLongElement(term11601, 35, 970974000L);
        setLongElement(term11601, 36, 971575200L);
        setLongElement(term11601, 37, 1003028400L);
        setLongElement(term11601, 38, 1013911200L);
        setField(term11597, term11597.getClass(), "savingsInstantTransitions", term11601);
        setField(term11597, term11597.getClass(), "savingsLocalTransitions", term11641);
        setElement(term11642, 1, term11570);
        setElement(term11642, 3, term11570);
        setElement(term11642, 5, term11570);
        setElement(term11642, 7, term11570);
        setElement(term11642, 9, term11570);
        setElement(term11642, 11, term11570);
        setElement(term11642, 13, term11570);
        setElement(term11642, 15, term11570);
        setElement(term11642, 17, term11570);
        setElement(term11642, 19, term11570);
        setElement(term11642, 21, term11570);
        setElement(term11642, 23, term11570);
        setElement(term11642, 25, term11570);
        setElement(term11642, 27, term11570);
        setElement(term11642, 29, term11570);
        setElement(term11642, 31, term11570);
        setElement(term11642, 33, term11570);
        setElement(term11642, 35, term11570);
        setElement(term11642, 37, term11570);
        setElement(term11642, 39, term11570);
        setField(term11597, term11597.getClass(), "wallOffsets", term11642);
        setField(term11597, term11597.getClass(), "lastRules", term11643);
        setField(term11644, term11644.getClass(), "table", null);
        setField(term11644, term11644.getClass(), "nextTable", null);
        setLongField(term11644, term11644.getClass(), "baseCount", 0L);
        setIntField(term11644, term11644.getClass(), "sizeCtl", 0);
        setIntField(term11644, term11644.getClass(), "transferIndex", 0);
        setIntField(term11644, term11644.getClass(), "cellsBusy", 0);
        setField(term11644, term11644.getClass(), "counterCells", null);
        setField(term11644, term11644.getClass(), "keySet", null);
        setField(term11644, term11644.getClass(), "values", null);
        setField(term11644, term11644.getClass(), "entrySet", null);
        setField(term11644, term11644.getClass(), "keySet", null);
        setField(term11644, term11644.getClass(), "values", null);
        setField(term11597, term11597.getClass(), "lastRulesCache", term11644);
        setField(term11580, term11580.getClass(), "rules", term11597);
        setField(term11559, term11559.getClass(), "zone", term11580);
        setField(term11365, term11365.getClass(), "time_stamp", term11559);
        setField(term11365, term11365.getClass(), "start_up_mode", "TjWpyghUWN");
        setField(term11365, term11365.getClass(), "cmm_dly_mod", "dkZFDZxcde");
        setField(term11365, term11365.getClass(), "cmm_dly_sec", "WXcZEtUKlI");
        setField(term11365, term11365.getClass(), "cmm_err_mod", "IkpjUOuWQU");
        setField(term11365, term11365.getClass(), "country_code", "boSSpezHeU");
        setField(term11365, term11365.getClass(), "region_code", "OUeBWNTQDh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer_name", argTypes, term11365, args);
    }

};


