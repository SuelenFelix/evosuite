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

public class ChangeNameRequest_setAcode_9499205437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26982;

    public ChangeNameRequest_setAcode_9499205437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26982 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term27107 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term27108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27113 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27118 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term27128 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term27145 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term27146 = (long[]) newLongArray(1);
        Object[] term27148 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term27149 = (long[]) newLongArray(39);
        Object[] term27189 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term27190 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term27191 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term27192 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term26982, term26982.getClass(), "a_code", "XmLHcnVsch");
        setIntField(term26982, term26982.getClass(), "aime_id", -1801760683);
        setField(term26982, term26982.getClass(), "aime_a_code", "Yrvtdcltri");
        setIntField(term26982, term26982.getClass(), "pd_id", 1141317871);
        setIntField(term26982, term26982.getClass(), "accept_idx", 890669485);
        setField(term26982, term26982.getClass(), "player_name", "RxrsjXRVcT");
        setIntField(term26982, term26982.getClass(), "chg_name_price", 691577392);
        setField(term26982, term26982.getClass(), "cmd", "cfRimmJxqA");
        setField(term26982, term26982.getClass(), "req_id", "oOnRVGqFmy");
        setField(term26982, term26982.getClass(), "game_id", "LaXzFIlWMk");
        setField(term26982, term26982.getClass(), "r_ver", "GuVQjhBxma");
        setField(term26982, term26982.getClass(), "kc_serial", "WAVMPPbIfL");
        setField(term26982, term26982.getClass(), "b_serial", "GISHLsgALf");
        setField(term26982, term26982.getClass(), "place_id", "PVykkUSgBq");
        setIntField(term27109, term27109.getClass(), "year", 2013);
        setShortField(term27109, term27109.getClass(), "month", (short) 5);
        setShortField(term27109, term27109.getClass(), "day", (short) 26);
        setField(term27108, term27108.getClass(), "date", term27109);
        setByteField(term27113, term27113.getClass(), "hour", (byte) 4);
        setByteField(term27113, term27113.getClass(), "minute", (byte) 39);
        setByteField(term27113, term27113.getClass(), "second", (byte) 5);
        setIntField(term27113, term27113.getClass(), "nano", 392869354);
        setField(term27108, term27108.getClass(), "time", term27113);
        setField(term27107, term27107.getClass(), "dateTime", term27108);
        setIntField(term27118, term27118.getClass(), "totalSeconds", -10800);
        setField(term27118, term27118.getClass(), "id", "-03:00");
        setField(term27107, term27107.getClass(), "offset", term27118);
        setField(term27128, term27128.getClass(), "id", "America/Recife");
        setLongElement(term27146, 0, -1767217224L);
        setField(term27145, term27145.getClass(), "standardTransitions", term27146);
        setElement(term27148, 1, term27118);
        setField(term27145, term27145.getClass(), "standardOffsets", term27148);
        setLongElement(term27149, 0, -1767217224L);
        setLongElement(term27149, 1, -1206957600L);
        setLongElement(term27149, 2, -1191362400L);
        setLongElement(term27149, 3, -1175374800L);
        setLongElement(term27149, 4, -1159826400L);
        setLongElement(term27149, 5, -633819600L);
        setLongElement(term27149, 6, -622069200L);
        setLongElement(term27149, 7, -602283600L);
        setLongElement(term27149, 8, -591832800L);
        setLongElement(term27149, 9, -570747600L);
        setLongElement(term27149, 10, -560210400L);
        setLongElement(term27149, 11, -539125200L);
        setLongElement(term27149, 12, -531352800L);
        setLongElement(term27149, 13, -191365200L);
        setLongElement(term27149, 14, -184197600L);
        setLongElement(term27149, 15, -155163600L);
        setLongElement(term27149, 16, -150069600L);
        setLongElement(term27149, 17, -128898000L);
        setLongElement(term27149, 18, -121125600L);
        setLongElement(term27149, 19, -99954000L);
        setLongElement(term27149, 20, -89589600L);
        setLongElement(term27149, 21, -68418000L);
        setLongElement(term27149, 22, -57967200L);
        setLongElement(term27149, 23, 499748400L);
        setLongElement(term27149, 24, 511236000L);
        setLongElement(term27149, 25, 530593200L);
        setLongElement(term27149, 26, 540266400L);
        setLongElement(term27149, 27, 562129200L);
        setLongElement(term27149, 28, 571197600L);
        setLongElement(term27149, 29, 592974000L);
        setLongElement(term27149, 30, 602042400L);
        setLongElement(term27149, 31, 624423600L);
        setLongElement(term27149, 32, 634701600L);
        setLongElement(term27149, 33, 938919600L);
        setLongElement(term27149, 34, 951616800L);
        setLongElement(term27149, 35, 970974000L);
        setLongElement(term27149, 36, 971575200L);
        setLongElement(term27149, 37, 1003028400L);
        setLongElement(term27149, 38, 1013911200L);
        setField(term27145, term27145.getClass(), "savingsInstantTransitions", term27149);
        setField(term27145, term27145.getClass(), "savingsLocalTransitions", term27189);
        setElement(term27190, 1, term27118);
        setElement(term27190, 3, term27118);
        setElement(term27190, 5, term27118);
        setElement(term27190, 7, term27118);
        setElement(term27190, 9, term27118);
        setElement(term27190, 11, term27118);
        setElement(term27190, 13, term27118);
        setElement(term27190, 15, term27118);
        setElement(term27190, 17, term27118);
        setElement(term27190, 19, term27118);
        setElement(term27190, 21, term27118);
        setElement(term27190, 23, term27118);
        setElement(term27190, 25, term27118);
        setElement(term27190, 27, term27118);
        setElement(term27190, 29, term27118);
        setElement(term27190, 31, term27118);
        setElement(term27190, 33, term27118);
        setElement(term27190, 35, term27118);
        setElement(term27190, 37, term27118);
        setElement(term27190, 39, term27118);
        setField(term27145, term27145.getClass(), "wallOffsets", term27190);
        setField(term27145, term27145.getClass(), "lastRules", term27191);
        setField(term27192, term27192.getClass(), "table", null);
        setField(term27192, term27192.getClass(), "nextTable", null);
        setLongField(term27192, term27192.getClass(), "baseCount", 0L);
        setIntField(term27192, term27192.getClass(), "sizeCtl", 0);
        setIntField(term27192, term27192.getClass(), "transferIndex", 0);
        setIntField(term27192, term27192.getClass(), "cellsBusy", 0);
        setField(term27192, term27192.getClass(), "counterCells", null);
        setField(term27192, term27192.getClass(), "keySet", null);
        setField(term27192, term27192.getClass(), "values", null);
        setField(term27192, term27192.getClass(), "entrySet", null);
        setField(term27192, term27192.getClass(), "keySet", null);
        setField(term27192, term27192.getClass(), "values", null);
        setField(term27145, term27145.getClass(), "lastRulesCache", term27192);
        setField(term27128, term27128.getClass(), "rules", term27145);
        setField(term27107, term27107.getClass(), "zone", term27128);
        setField(term26982, term26982.getClass(), "time_stamp", term27107);
        setField(term26982, term26982.getClass(), "start_up_mode", "tnKbZaCsuj");
        setField(term26982, term26982.getClass(), "cmm_dly_mod", "ZFpcYBgLNC");
        setField(term26982, term26982.getClass(), "cmm_dly_sec", "VAGkRppBem");
        setField(term26982, term26982.getClass(), "cmm_err_mod", "eKcEJRxNSu");
        setField(term26982, term26982.getClass(), "country_code", "NTXQPWFYSA");
        setField(term26982, term26982.getClass(), "region_code", "fOuOhBpldm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qQQRKGPyIM";
        callMethod(klass, "setA_code", argTypes, term26982, args);
    }

};


