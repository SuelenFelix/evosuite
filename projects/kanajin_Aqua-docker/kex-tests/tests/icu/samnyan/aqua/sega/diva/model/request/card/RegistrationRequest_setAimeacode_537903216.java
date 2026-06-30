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

public class RegistrationRequest_setAimeacode_537903216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16565;

    public RegistrationRequest_setAimeacode_537903216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16565 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term16759 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term16760 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16761 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16765 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16770 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term16780 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term16797 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term16798 = (long[]) newLongArray(1);
        Object[] term16800 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term16801 = (long[]) newLongArray(39);
        Object[] term16841 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term16842 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term16843 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term16844 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term16565, term16565.getClass(), "pmm", "QpYltHAdyY");
        setField(term16565, term16565.getClass(), "idm", "lbmSGBwIiV");
        setField(term16565, term16565.getClass(), "mmgameid", "DAxyHoTLzZ");
        setField(term16565, term16565.getClass(), "mmuid", "fhZgTouhCC");
        setField(term16565, term16565.getClass(), "a_code", "wrikqJwXvL");
        setIntField(term16565, term16565.getClass(), "aime_id", 1328271830);
        setField(term16565, term16565.getClass(), "aime_a_code", "UiWhvbypdr");
        setField(term16565, term16565.getClass(), "key_obj_type", "CgleElJNje");
        setField(term16565, term16565.getClass(), "player_name", "ZrchvNGMtd");
        setField(term16565, term16565.getClass(), "passwd", "WaEcyVlcIx");
        setField(term16565, term16565.getClass(), "cmd", "ONcbPCQnHd");
        setField(term16565, term16565.getClass(), "req_id", "AobDaplFLl");
        setField(term16565, term16565.getClass(), "game_id", "pDkMNnAGgv");
        setField(term16565, term16565.getClass(), "r_ver", "PaCpFXGzdX");
        setField(term16565, term16565.getClass(), "kc_serial", "FftYCNbnks");
        setField(term16565, term16565.getClass(), "b_serial", "lJoltmsadS");
        setField(term16565, term16565.getClass(), "place_id", "mvfDtZNEHr");
        setIntField(term16761, term16761.getClass(), "year", 2021);
        setShortField(term16761, term16761.getClass(), "month", (short) 8);
        setShortField(term16761, term16761.getClass(), "day", (short) 12);
        setField(term16760, term16760.getClass(), "date", term16761);
        setByteField(term16765, term16765.getClass(), "hour", (byte) 2);
        setByteField(term16765, term16765.getClass(), "minute", (byte) 17);
        setByteField(term16765, term16765.getClass(), "second", (byte) 51);
        setIntField(term16765, term16765.getClass(), "nano", 207375141);
        setField(term16760, term16760.getClass(), "time", term16765);
        setField(term16759, term16759.getClass(), "dateTime", term16760);
        setIntField(term16770, term16770.getClass(), "totalSeconds", -10800);
        setField(term16770, term16770.getClass(), "id", "-03:00");
        setField(term16759, term16759.getClass(), "offset", term16770);
        setField(term16780, term16780.getClass(), "id", "America/Recife");
        setLongElement(term16798, 0, -1767217224L);
        setField(term16797, term16797.getClass(), "standardTransitions", term16798);
        setElement(term16800, 1, term16770);
        setField(term16797, term16797.getClass(), "standardOffsets", term16800);
        setLongElement(term16801, 0, -1767217224L);
        setLongElement(term16801, 1, -1206957600L);
        setLongElement(term16801, 2, -1191362400L);
        setLongElement(term16801, 3, -1175374800L);
        setLongElement(term16801, 4, -1159826400L);
        setLongElement(term16801, 5, -633819600L);
        setLongElement(term16801, 6, -622069200L);
        setLongElement(term16801, 7, -602283600L);
        setLongElement(term16801, 8, -591832800L);
        setLongElement(term16801, 9, -570747600L);
        setLongElement(term16801, 10, -560210400L);
        setLongElement(term16801, 11, -539125200L);
        setLongElement(term16801, 12, -531352800L);
        setLongElement(term16801, 13, -191365200L);
        setLongElement(term16801, 14, -184197600L);
        setLongElement(term16801, 15, -155163600L);
        setLongElement(term16801, 16, -150069600L);
        setLongElement(term16801, 17, -128898000L);
        setLongElement(term16801, 18, -121125600L);
        setLongElement(term16801, 19, -99954000L);
        setLongElement(term16801, 20, -89589600L);
        setLongElement(term16801, 21, -68418000L);
        setLongElement(term16801, 22, -57967200L);
        setLongElement(term16801, 23, 499748400L);
        setLongElement(term16801, 24, 511236000L);
        setLongElement(term16801, 25, 530593200L);
        setLongElement(term16801, 26, 540266400L);
        setLongElement(term16801, 27, 562129200L);
        setLongElement(term16801, 28, 571197600L);
        setLongElement(term16801, 29, 592974000L);
        setLongElement(term16801, 30, 602042400L);
        setLongElement(term16801, 31, 624423600L);
        setLongElement(term16801, 32, 634701600L);
        setLongElement(term16801, 33, 938919600L);
        setLongElement(term16801, 34, 951616800L);
        setLongElement(term16801, 35, 970974000L);
        setLongElement(term16801, 36, 971575200L);
        setLongElement(term16801, 37, 1003028400L);
        setLongElement(term16801, 38, 1013911200L);
        setField(term16797, term16797.getClass(), "savingsInstantTransitions", term16801);
        setField(term16797, term16797.getClass(), "savingsLocalTransitions", term16841);
        setElement(term16842, 1, term16770);
        setElement(term16842, 3, term16770);
        setElement(term16842, 5, term16770);
        setElement(term16842, 7, term16770);
        setElement(term16842, 9, term16770);
        setElement(term16842, 11, term16770);
        setElement(term16842, 13, term16770);
        setElement(term16842, 15, term16770);
        setElement(term16842, 17, term16770);
        setElement(term16842, 19, term16770);
        setElement(term16842, 21, term16770);
        setElement(term16842, 23, term16770);
        setElement(term16842, 25, term16770);
        setElement(term16842, 27, term16770);
        setElement(term16842, 29, term16770);
        setElement(term16842, 31, term16770);
        setElement(term16842, 33, term16770);
        setElement(term16842, 35, term16770);
        setElement(term16842, 37, term16770);
        setElement(term16842, 39, term16770);
        setField(term16797, term16797.getClass(), "wallOffsets", term16842);
        setField(term16797, term16797.getClass(), "lastRules", term16843);
        setField(term16844, term16844.getClass(), "table", null);
        setField(term16844, term16844.getClass(), "nextTable", null);
        setLongField(term16844, term16844.getClass(), "baseCount", 0L);
        setIntField(term16844, term16844.getClass(), "sizeCtl", 0);
        setIntField(term16844, term16844.getClass(), "transferIndex", 0);
        setIntField(term16844, term16844.getClass(), "cellsBusy", 0);
        setField(term16844, term16844.getClass(), "counterCells", null);
        setField(term16844, term16844.getClass(), "keySet", null);
        setField(term16844, term16844.getClass(), "values", null);
        setField(term16844, term16844.getClass(), "entrySet", null);
        setField(term16844, term16844.getClass(), "keySet", null);
        setField(term16844, term16844.getClass(), "values", null);
        setField(term16797, term16797.getClass(), "lastRulesCache", term16844);
        setField(term16780, term16780.getClass(), "rules", term16797);
        setField(term16759, term16759.getClass(), "zone", term16780);
        setField(term16565, term16565.getClass(), "time_stamp", term16759);
        setField(term16565, term16565.getClass(), "start_up_mode", "bvSgmFUDOU");
        setField(term16565, term16565.getClass(), "cmm_dly_mod", "XMHwbfiHRl");
        setField(term16565, term16565.getClass(), "cmm_dly_sec", "bucTnYicnp");
        setField(term16565, term16565.getClass(), "cmm_err_mod", "EkgprvqZlM");
        setField(term16565, term16565.getClass(), "country_code", "fbnKvthhOz");
        setField(term16565, term16565.getClass(), "region_code", "PGfCDJTBek");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZwjARhAtHC";
        callMethod(klass, "setAime_a_code", argTypes, term16565, args);
    }

};


