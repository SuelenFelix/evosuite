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

public class RegistrationRequest_setMmuid_148021168214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237747;

    public RegistrationRequest_setMmuid_148021168214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237747 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term237941 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term237942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term237943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term237947 = newInstance(Class.forName("java.time.LocalTime"));
        Object term237952 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term237962 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term237979 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term237980 = (long[]) newLongArray(1);
        Object[] term237982 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term237983 = (long[]) newLongArray(39);
        Object[] term238023 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term238024 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term238025 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term238026 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term237747, term237747.getClass(), "pmm", "ApYkVuFRIL");
        setField(term237747, term237747.getClass(), "idm", "diuhMpMKFr");
        setField(term237747, term237747.getClass(), "mmgameid", "jYgdYPEnbw");
        setField(term237747, term237747.getClass(), "mmuid", "MaWPQSNeis");
        setField(term237747, term237747.getClass(), "a_code", "SiShLTAOSK");
        setIntField(term237747, term237747.getClass(), "aime_id", 1506287622);
        setField(term237747, term237747.getClass(), "aime_a_code", "FAPbpaVZzb");
        setField(term237747, term237747.getClass(), "key_obj_type", "jMmGJiFUkL");
        setField(term237747, term237747.getClass(), "player_name", "fHyUJhfoxR");
        setField(term237747, term237747.getClass(), "passwd", "CgnkREXVNP");
        setField(term237747, term237747.getClass(), "cmd", "mBAKehIGeW");
        setField(term237747, term237747.getClass(), "req_id", "tmiPUgRXrn");
        setField(term237747, term237747.getClass(), "game_id", "VuZmwqnade");
        setField(term237747, term237747.getClass(), "r_ver", "ohZrjboUnX");
        setField(term237747, term237747.getClass(), "kc_serial", "rwlrpQuNrG");
        setField(term237747, term237747.getClass(), "b_serial", "fctYGLXetS");
        setField(term237747, term237747.getClass(), "place_id", "UPbgrEUWQD");
        setIntField(term237943, term237943.getClass(), "year", 2011);
        setShortField(term237943, term237943.getClass(), "month", (short) 4);
        setShortField(term237943, term237943.getClass(), "day", (short) 18);
        setField(term237942, term237942.getClass(), "date", term237943);
        setByteField(term237947, term237947.getClass(), "hour", (byte) 15);
        setByteField(term237947, term237947.getClass(), "minute", (byte) 35);
        setByteField(term237947, term237947.getClass(), "second", (byte) 7);
        setIntField(term237947, term237947.getClass(), "nano", 925983040);
        setField(term237942, term237942.getClass(), "time", term237947);
        setField(term237941, term237941.getClass(), "dateTime", term237942);
        setIntField(term237952, term237952.getClass(), "totalSeconds", -10800);
        setField(term237952, term237952.getClass(), "id", "-03:00");
        setField(term237941, term237941.getClass(), "offset", term237952);
        setField(term237962, term237962.getClass(), "id", "America/Recife");
        setLongElement(term237980, 0, -1767217224L);
        setField(term237979, term237979.getClass(), "standardTransitions", term237980);
        setElement(term237982, 1, term237952);
        setField(term237979, term237979.getClass(), "standardOffsets", term237982);
        setLongElement(term237983, 0, -1767217224L);
        setLongElement(term237983, 1, -1206957600L);
        setLongElement(term237983, 2, -1191362400L);
        setLongElement(term237983, 3, -1175374800L);
        setLongElement(term237983, 4, -1159826400L);
        setLongElement(term237983, 5, -633819600L);
        setLongElement(term237983, 6, -622069200L);
        setLongElement(term237983, 7, -602283600L);
        setLongElement(term237983, 8, -591832800L);
        setLongElement(term237983, 9, -570747600L);
        setLongElement(term237983, 10, -560210400L);
        setLongElement(term237983, 11, -539125200L);
        setLongElement(term237983, 12, -531352800L);
        setLongElement(term237983, 13, -191365200L);
        setLongElement(term237983, 14, -184197600L);
        setLongElement(term237983, 15, -155163600L);
        setLongElement(term237983, 16, -150069600L);
        setLongElement(term237983, 17, -128898000L);
        setLongElement(term237983, 18, -121125600L);
        setLongElement(term237983, 19, -99954000L);
        setLongElement(term237983, 20, -89589600L);
        setLongElement(term237983, 21, -68418000L);
        setLongElement(term237983, 22, -57967200L);
        setLongElement(term237983, 23, 499748400L);
        setLongElement(term237983, 24, 511236000L);
        setLongElement(term237983, 25, 530593200L);
        setLongElement(term237983, 26, 540266400L);
        setLongElement(term237983, 27, 562129200L);
        setLongElement(term237983, 28, 571197600L);
        setLongElement(term237983, 29, 592974000L);
        setLongElement(term237983, 30, 602042400L);
        setLongElement(term237983, 31, 624423600L);
        setLongElement(term237983, 32, 634701600L);
        setLongElement(term237983, 33, 938919600L);
        setLongElement(term237983, 34, 951616800L);
        setLongElement(term237983, 35, 970974000L);
        setLongElement(term237983, 36, 971575200L);
        setLongElement(term237983, 37, 1003028400L);
        setLongElement(term237983, 38, 1013911200L);
        setField(term237979, term237979.getClass(), "savingsInstantTransitions", term237983);
        setField(term237979, term237979.getClass(), "savingsLocalTransitions", term238023);
        setElement(term238024, 1, term237952);
        setElement(term238024, 3, term237952);
        setElement(term238024, 5, term237952);
        setElement(term238024, 7, term237952);
        setElement(term238024, 9, term237952);
        setElement(term238024, 11, term237952);
        setElement(term238024, 13, term237952);
        setElement(term238024, 15, term237952);
        setElement(term238024, 17, term237952);
        setElement(term238024, 19, term237952);
        setElement(term238024, 21, term237952);
        setElement(term238024, 23, term237952);
        setElement(term238024, 25, term237952);
        setElement(term238024, 27, term237952);
        setElement(term238024, 29, term237952);
        setElement(term238024, 31, term237952);
        setElement(term238024, 33, term237952);
        setElement(term238024, 35, term237952);
        setElement(term238024, 37, term237952);
        setElement(term238024, 39, term237952);
        setField(term237979, term237979.getClass(), "wallOffsets", term238024);
        setField(term237979, term237979.getClass(), "lastRules", term238025);
        setField(term238026, term238026.getClass(), "table", null);
        setField(term238026, term238026.getClass(), "nextTable", null);
        setLongField(term238026, term238026.getClass(), "baseCount", 0L);
        setIntField(term238026, term238026.getClass(), "sizeCtl", 0);
        setIntField(term238026, term238026.getClass(), "transferIndex", 0);
        setIntField(term238026, term238026.getClass(), "cellsBusy", 0);
        setField(term238026, term238026.getClass(), "counterCells", null);
        setField(term238026, term238026.getClass(), "keySet", null);
        setField(term238026, term238026.getClass(), "values", null);
        setField(term238026, term238026.getClass(), "entrySet", null);
        setField(term238026, term238026.getClass(), "keySet", null);
        setField(term238026, term238026.getClass(), "values", null);
        setField(term237979, term237979.getClass(), "lastRulesCache", term238026);
        setField(term237962, term237962.getClass(), "rules", term237979);
        setField(term237941, term237941.getClass(), "zone", term237962);
        setField(term237747, term237747.getClass(), "time_stamp", term237941);
        setField(term237747, term237747.getClass(), "start_up_mode", "HABnTZidNp");
        setField(term237747, term237747.getClass(), "cmm_dly_mod", "qXysRdBrsg");
        setField(term237747, term237747.getClass(), "cmm_dly_sec", "hbtKoWkZLU");
        setField(term237747, term237747.getClass(), "cmm_err_mod", "VCWjXeMQGX");
        setField(term237747, term237747.getClass(), "country_code", "KzrkBfSzqK");
        setField(term237747, term237747.getClass(), "region_code", "cFNqeNRwhB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TQJASDuFUN";
        callMethod(klass, "setMmuid", argTypes, term237747, args);
    }

};


