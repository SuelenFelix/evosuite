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

public class RegistrationRequest_setMmgameid_202575152112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13953;

    public RegistrationRequest_setMmgameid_202575152112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13953 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term14147 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term14148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14158 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term14168 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term14185 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term14186 = (long[]) newLongArray(1);
        Object[] term14188 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term14189 = (long[]) newLongArray(39);
        Object[] term14229 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term14230 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term14231 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term14232 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term13953, term13953.getClass(), "pmm", "bxyfeicqrK");
        setField(term13953, term13953.getClass(), "idm", "vBnWPlsZMk");
        setField(term13953, term13953.getClass(), "mmgameid", "fIZsWucfXz");
        setField(term13953, term13953.getClass(), "mmuid", "IApvtmfhnq");
        setField(term13953, term13953.getClass(), "a_code", "VSaNnhMpRc");
        setIntField(term13953, term13953.getClass(), "aime_id", -1048298087);
        setField(term13953, term13953.getClass(), "aime_a_code", "QNjNTLlUaV");
        setField(term13953, term13953.getClass(), "key_obj_type", "hIYsRyOZxk");
        setField(term13953, term13953.getClass(), "player_name", "RjNoEywJbC");
        setField(term13953, term13953.getClass(), "passwd", "RTTvrwwhou");
        setField(term13953, term13953.getClass(), "cmd", "lRORwXipuk");
        setField(term13953, term13953.getClass(), "req_id", "fVdTcjgHdw");
        setField(term13953, term13953.getClass(), "game_id", "wwAwLLcLPp");
        setField(term13953, term13953.getClass(), "r_ver", "nHpMKOmlpQ");
        setField(term13953, term13953.getClass(), "kc_serial", "fKhrQsJToZ");
        setField(term13953, term13953.getClass(), "b_serial", "wsysQLGFnl");
        setField(term13953, term13953.getClass(), "place_id", "ckQLZGFjMX");
        setIntField(term14149, term14149.getClass(), "year", 2025);
        setShortField(term14149, term14149.getClass(), "month", (short) 3);
        setShortField(term14149, term14149.getClass(), "day", (short) 9);
        setField(term14148, term14148.getClass(), "date", term14149);
        setByteField(term14153, term14153.getClass(), "hour", (byte) 5);
        setByteField(term14153, term14153.getClass(), "minute", (byte) 49);
        setByteField(term14153, term14153.getClass(), "second", (byte) 12);
        setIntField(term14153, term14153.getClass(), "nano", 791695028);
        setField(term14148, term14148.getClass(), "time", term14153);
        setField(term14147, term14147.getClass(), "dateTime", term14148);
        setIntField(term14158, term14158.getClass(), "totalSeconds", -10800);
        setField(term14158, term14158.getClass(), "id", "-03:00");
        setField(term14147, term14147.getClass(), "offset", term14158);
        setField(term14168, term14168.getClass(), "id", "America/Recife");
        setLongElement(term14186, 0, -1767217224L);
        setField(term14185, term14185.getClass(), "standardTransitions", term14186);
        setElement(term14188, 1, term14158);
        setField(term14185, term14185.getClass(), "standardOffsets", term14188);
        setLongElement(term14189, 0, -1767217224L);
        setLongElement(term14189, 1, -1206957600L);
        setLongElement(term14189, 2, -1191362400L);
        setLongElement(term14189, 3, -1175374800L);
        setLongElement(term14189, 4, -1159826400L);
        setLongElement(term14189, 5, -633819600L);
        setLongElement(term14189, 6, -622069200L);
        setLongElement(term14189, 7, -602283600L);
        setLongElement(term14189, 8, -591832800L);
        setLongElement(term14189, 9, -570747600L);
        setLongElement(term14189, 10, -560210400L);
        setLongElement(term14189, 11, -539125200L);
        setLongElement(term14189, 12, -531352800L);
        setLongElement(term14189, 13, -191365200L);
        setLongElement(term14189, 14, -184197600L);
        setLongElement(term14189, 15, -155163600L);
        setLongElement(term14189, 16, -150069600L);
        setLongElement(term14189, 17, -128898000L);
        setLongElement(term14189, 18, -121125600L);
        setLongElement(term14189, 19, -99954000L);
        setLongElement(term14189, 20, -89589600L);
        setLongElement(term14189, 21, -68418000L);
        setLongElement(term14189, 22, -57967200L);
        setLongElement(term14189, 23, 499748400L);
        setLongElement(term14189, 24, 511236000L);
        setLongElement(term14189, 25, 530593200L);
        setLongElement(term14189, 26, 540266400L);
        setLongElement(term14189, 27, 562129200L);
        setLongElement(term14189, 28, 571197600L);
        setLongElement(term14189, 29, 592974000L);
        setLongElement(term14189, 30, 602042400L);
        setLongElement(term14189, 31, 624423600L);
        setLongElement(term14189, 32, 634701600L);
        setLongElement(term14189, 33, 938919600L);
        setLongElement(term14189, 34, 951616800L);
        setLongElement(term14189, 35, 970974000L);
        setLongElement(term14189, 36, 971575200L);
        setLongElement(term14189, 37, 1003028400L);
        setLongElement(term14189, 38, 1013911200L);
        setField(term14185, term14185.getClass(), "savingsInstantTransitions", term14189);
        setField(term14185, term14185.getClass(), "savingsLocalTransitions", term14229);
        setElement(term14230, 1, term14158);
        setElement(term14230, 3, term14158);
        setElement(term14230, 5, term14158);
        setElement(term14230, 7, term14158);
        setElement(term14230, 9, term14158);
        setElement(term14230, 11, term14158);
        setElement(term14230, 13, term14158);
        setElement(term14230, 15, term14158);
        setElement(term14230, 17, term14158);
        setElement(term14230, 19, term14158);
        setElement(term14230, 21, term14158);
        setElement(term14230, 23, term14158);
        setElement(term14230, 25, term14158);
        setElement(term14230, 27, term14158);
        setElement(term14230, 29, term14158);
        setElement(term14230, 31, term14158);
        setElement(term14230, 33, term14158);
        setElement(term14230, 35, term14158);
        setElement(term14230, 37, term14158);
        setElement(term14230, 39, term14158);
        setField(term14185, term14185.getClass(), "wallOffsets", term14230);
        setField(term14185, term14185.getClass(), "lastRules", term14231);
        setField(term14232, term14232.getClass(), "table", null);
        setField(term14232, term14232.getClass(), "nextTable", null);
        setLongField(term14232, term14232.getClass(), "baseCount", 0L);
        setIntField(term14232, term14232.getClass(), "sizeCtl", 0);
        setIntField(term14232, term14232.getClass(), "transferIndex", 0);
        setIntField(term14232, term14232.getClass(), "cellsBusy", 0);
        setField(term14232, term14232.getClass(), "counterCells", null);
        setField(term14232, term14232.getClass(), "keySet", null);
        setField(term14232, term14232.getClass(), "values", null);
        setField(term14232, term14232.getClass(), "entrySet", null);
        setField(term14232, term14232.getClass(), "keySet", null);
        setField(term14232, term14232.getClass(), "values", null);
        setField(term14185, term14185.getClass(), "lastRulesCache", term14232);
        setField(term14168, term14168.getClass(), "rules", term14185);
        setField(term14147, term14147.getClass(), "zone", term14168);
        setField(term13953, term13953.getClass(), "time_stamp", term14147);
        setField(term13953, term13953.getClass(), "start_up_mode", "qphdrqUtNx");
        setField(term13953, term13953.getClass(), "cmm_dly_mod", "bwlLFAfNWx");
        setField(term13953, term13953.getClass(), "cmm_dly_sec", "JWodNQzjjV");
        setField(term13953, term13953.getClass(), "cmm_err_mod", "CAgxWjhxNf");
        setField(term13953, term13953.getClass(), "country_code", "goAoCMhKBu");
        setField(term13953, term13953.getClass(), "region_code", "BWxJSgKHRT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AGXoIndFnm";
        callMethod(klass, "setMmgameid", argTypes, term13953, args);
    }

};


