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

public class RegistrationRequest_getAcode_17012441974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8821;

    public RegistrationRequest_getAcode_17012441974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8821 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term9015 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term9016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9021 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9026 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term9036 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term9053 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term9054 = (long[]) newLongArray(1);
        Object[] term9056 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term9057 = (long[]) newLongArray(39);
        Object[] term9097 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term9098 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term9099 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term9100 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term8821, term8821.getClass(), "pmm", "TtGbVmKcnX");
        setField(term8821, term8821.getClass(), "idm", "GJVkUrCVdD");
        setField(term8821, term8821.getClass(), "mmgameid", "zNdorvdUgu");
        setField(term8821, term8821.getClass(), "mmuid", "oPxuZbkYio");
        setField(term8821, term8821.getClass(), "a_code", "vKitydDVnM");
        setIntField(term8821, term8821.getClass(), "aime_id", -1016503459);
        setField(term8821, term8821.getClass(), "aime_a_code", "urCiQnUFBM");
        setField(term8821, term8821.getClass(), "key_obj_type", "EKjQdtKxAM");
        setField(term8821, term8821.getClass(), "player_name", "TXZAIPQJHt");
        setField(term8821, term8821.getClass(), "passwd", "DIbeDHICho");
        setField(term8821, term8821.getClass(), "cmd", "dJGPlmSRnz");
        setField(term8821, term8821.getClass(), "req_id", "DPskuFUobI");
        setField(term8821, term8821.getClass(), "game_id", "wBGfLpNNiZ");
        setField(term8821, term8821.getClass(), "r_ver", "yUGCjlqgJE");
        setField(term8821, term8821.getClass(), "kc_serial", "PXdVZyoJyC");
        setField(term8821, term8821.getClass(), "b_serial", "vLerpqavFM");
        setField(term8821, term8821.getClass(), "place_id", "qnvxzwuGKX");
        setIntField(term9017, term9017.getClass(), "year", 2015);
        setShortField(term9017, term9017.getClass(), "month", (short) 9);
        setShortField(term9017, term9017.getClass(), "day", (short) 16);
        setField(term9016, term9016.getClass(), "date", term9017);
        setByteField(term9021, term9021.getClass(), "hour", (byte) 6);
        setByteField(term9021, term9021.getClass(), "minute", (byte) 19);
        setByteField(term9021, term9021.getClass(), "second", (byte) 42);
        setIntField(term9021, term9021.getClass(), "nano", 630084975);
        setField(term9016, term9016.getClass(), "time", term9021);
        setField(term9015, term9015.getClass(), "dateTime", term9016);
        setIntField(term9026, term9026.getClass(), "totalSeconds", -10800);
        setField(term9026, term9026.getClass(), "id", "-03:00");
        setField(term9015, term9015.getClass(), "offset", term9026);
        setField(term9036, term9036.getClass(), "id", "America/Recife");
        setLongElement(term9054, 0, -1767217224L);
        setField(term9053, term9053.getClass(), "standardTransitions", term9054);
        setElement(term9056, 1, term9026);
        setField(term9053, term9053.getClass(), "standardOffsets", term9056);
        setLongElement(term9057, 0, -1767217224L);
        setLongElement(term9057, 1, -1206957600L);
        setLongElement(term9057, 2, -1191362400L);
        setLongElement(term9057, 3, -1175374800L);
        setLongElement(term9057, 4, -1159826400L);
        setLongElement(term9057, 5, -633819600L);
        setLongElement(term9057, 6, -622069200L);
        setLongElement(term9057, 7, -602283600L);
        setLongElement(term9057, 8, -591832800L);
        setLongElement(term9057, 9, -570747600L);
        setLongElement(term9057, 10, -560210400L);
        setLongElement(term9057, 11, -539125200L);
        setLongElement(term9057, 12, -531352800L);
        setLongElement(term9057, 13, -191365200L);
        setLongElement(term9057, 14, -184197600L);
        setLongElement(term9057, 15, -155163600L);
        setLongElement(term9057, 16, -150069600L);
        setLongElement(term9057, 17, -128898000L);
        setLongElement(term9057, 18, -121125600L);
        setLongElement(term9057, 19, -99954000L);
        setLongElement(term9057, 20, -89589600L);
        setLongElement(term9057, 21, -68418000L);
        setLongElement(term9057, 22, -57967200L);
        setLongElement(term9057, 23, 499748400L);
        setLongElement(term9057, 24, 511236000L);
        setLongElement(term9057, 25, 530593200L);
        setLongElement(term9057, 26, 540266400L);
        setLongElement(term9057, 27, 562129200L);
        setLongElement(term9057, 28, 571197600L);
        setLongElement(term9057, 29, 592974000L);
        setLongElement(term9057, 30, 602042400L);
        setLongElement(term9057, 31, 624423600L);
        setLongElement(term9057, 32, 634701600L);
        setLongElement(term9057, 33, 938919600L);
        setLongElement(term9057, 34, 951616800L);
        setLongElement(term9057, 35, 970974000L);
        setLongElement(term9057, 36, 971575200L);
        setLongElement(term9057, 37, 1003028400L);
        setLongElement(term9057, 38, 1013911200L);
        setField(term9053, term9053.getClass(), "savingsInstantTransitions", term9057);
        setField(term9053, term9053.getClass(), "savingsLocalTransitions", term9097);
        setElement(term9098, 1, term9026);
        setElement(term9098, 3, term9026);
        setElement(term9098, 5, term9026);
        setElement(term9098, 7, term9026);
        setElement(term9098, 9, term9026);
        setElement(term9098, 11, term9026);
        setElement(term9098, 13, term9026);
        setElement(term9098, 15, term9026);
        setElement(term9098, 17, term9026);
        setElement(term9098, 19, term9026);
        setElement(term9098, 21, term9026);
        setElement(term9098, 23, term9026);
        setElement(term9098, 25, term9026);
        setElement(term9098, 27, term9026);
        setElement(term9098, 29, term9026);
        setElement(term9098, 31, term9026);
        setElement(term9098, 33, term9026);
        setElement(term9098, 35, term9026);
        setElement(term9098, 37, term9026);
        setElement(term9098, 39, term9026);
        setField(term9053, term9053.getClass(), "wallOffsets", term9098);
        setField(term9053, term9053.getClass(), "lastRules", term9099);
        setField(term9100, term9100.getClass(), "table", null);
        setField(term9100, term9100.getClass(), "nextTable", null);
        setLongField(term9100, term9100.getClass(), "baseCount", 0L);
        setIntField(term9100, term9100.getClass(), "sizeCtl", 0);
        setIntField(term9100, term9100.getClass(), "transferIndex", 0);
        setIntField(term9100, term9100.getClass(), "cellsBusy", 0);
        setField(term9100, term9100.getClass(), "counterCells", null);
        setField(term9100, term9100.getClass(), "keySet", null);
        setField(term9100, term9100.getClass(), "values", null);
        setField(term9100, term9100.getClass(), "entrySet", null);
        setField(term9100, term9100.getClass(), "keySet", null);
        setField(term9100, term9100.getClass(), "values", null);
        setField(term9053, term9053.getClass(), "lastRulesCache", term9100);
        setField(term9036, term9036.getClass(), "rules", term9053);
        setField(term9015, term9015.getClass(), "zone", term9036);
        setField(term8821, term8821.getClass(), "time_stamp", term9015);
        setField(term8821, term8821.getClass(), "start_up_mode", "EdPAvpluZg");
        setField(term8821, term8821.getClass(), "cmm_dly_mod", "DzHVBMqWtE");
        setField(term8821, term8821.getClass(), "cmm_dly_sec", "THZSpzBRYP");
        setField(term8821, term8821.getClass(), "cmm_err_mod", "ZfBIVGBQOE");
        setField(term8821, term8821.getClass(), "country_code", "QSrDQfEsTR");
        setField(term8821, term8821.getClass(), "region_code", "PsqusYmejD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getA_code", argTypes, term8821, args);
    }

};


