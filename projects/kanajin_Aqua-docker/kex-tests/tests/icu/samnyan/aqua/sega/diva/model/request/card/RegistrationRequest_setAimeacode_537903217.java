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

public class RegistrationRequest_setAimeacode_537903217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239701;

    public RegistrationRequest_setAimeacode_537903217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239701 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term239895 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term239896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term239897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term239901 = newInstance(Class.forName("java.time.LocalTime"));
        Object term239906 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term239916 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term239933 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term239934 = (long[]) newLongArray(1);
        Object[] term239936 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term239937 = (long[]) newLongArray(39);
        Object[] term239977 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term239978 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term239979 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term239980 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term239701, term239701.getClass(), "pmm", "uRfXEtHgIt");
        setField(term239701, term239701.getClass(), "idm", "lzrbwfKykX");
        setField(term239701, term239701.getClass(), "mmgameid", "eZWnfePnkp");
        setField(term239701, term239701.getClass(), "mmuid", "BSdXqptUKz");
        setField(term239701, term239701.getClass(), "a_code", "UtzMtwAaid");
        setIntField(term239701, term239701.getClass(), "aime_id", -858662232);
        setField(term239701, term239701.getClass(), "aime_a_code", "bchxgKxuUf");
        setField(term239701, term239701.getClass(), "key_obj_type", "mjXKuwKUyR");
        setField(term239701, term239701.getClass(), "player_name", "UfdjcAQclb");
        setField(term239701, term239701.getClass(), "passwd", "skKLlFIRTI");
        setField(term239701, term239701.getClass(), "cmd", "SfjOvqPCwx");
        setField(term239701, term239701.getClass(), "req_id", "rinBVtrpcr");
        setField(term239701, term239701.getClass(), "game_id", "KjCvQWfqew");
        setField(term239701, term239701.getClass(), "r_ver", "WewLrXvLmC");
        setField(term239701, term239701.getClass(), "kc_serial", "vbEYtFntxd");
        setField(term239701, term239701.getClass(), "b_serial", "ZiYiKyRQTQ");
        setField(term239701, term239701.getClass(), "place_id", "aaACqoZRFl");
        setIntField(term239897, term239897.getClass(), "year", 2011);
        setShortField(term239897, term239897.getClass(), "month", (short) 10);
        setShortField(term239897, term239897.getClass(), "day", (short) 10);
        setField(term239896, term239896.getClass(), "date", term239897);
        setByteField(term239901, term239901.getClass(), "hour", (byte) 5);
        setByteField(term239901, term239901.getClass(), "minute", (byte) 26);
        setByteField(term239901, term239901.getClass(), "second", (byte) 16);
        setIntField(term239901, term239901.getClass(), "nano", 858245653);
        setField(term239896, term239896.getClass(), "time", term239901);
        setField(term239895, term239895.getClass(), "dateTime", term239896);
        setIntField(term239906, term239906.getClass(), "totalSeconds", -10800);
        setField(term239906, term239906.getClass(), "id", "-03:00");
        setField(term239895, term239895.getClass(), "offset", term239906);
        setField(term239916, term239916.getClass(), "id", "America/Recife");
        setLongElement(term239934, 0, -1767217224L);
        setField(term239933, term239933.getClass(), "standardTransitions", term239934);
        setElement(term239936, 1, term239906);
        setField(term239933, term239933.getClass(), "standardOffsets", term239936);
        setLongElement(term239937, 0, -1767217224L);
        setLongElement(term239937, 1, -1206957600L);
        setLongElement(term239937, 2, -1191362400L);
        setLongElement(term239937, 3, -1175374800L);
        setLongElement(term239937, 4, -1159826400L);
        setLongElement(term239937, 5, -633819600L);
        setLongElement(term239937, 6, -622069200L);
        setLongElement(term239937, 7, -602283600L);
        setLongElement(term239937, 8, -591832800L);
        setLongElement(term239937, 9, -570747600L);
        setLongElement(term239937, 10, -560210400L);
        setLongElement(term239937, 11, -539125200L);
        setLongElement(term239937, 12, -531352800L);
        setLongElement(term239937, 13, -191365200L);
        setLongElement(term239937, 14, -184197600L);
        setLongElement(term239937, 15, -155163600L);
        setLongElement(term239937, 16, -150069600L);
        setLongElement(term239937, 17, -128898000L);
        setLongElement(term239937, 18, -121125600L);
        setLongElement(term239937, 19, -99954000L);
        setLongElement(term239937, 20, -89589600L);
        setLongElement(term239937, 21, -68418000L);
        setLongElement(term239937, 22, -57967200L);
        setLongElement(term239937, 23, 499748400L);
        setLongElement(term239937, 24, 511236000L);
        setLongElement(term239937, 25, 530593200L);
        setLongElement(term239937, 26, 540266400L);
        setLongElement(term239937, 27, 562129200L);
        setLongElement(term239937, 28, 571197600L);
        setLongElement(term239937, 29, 592974000L);
        setLongElement(term239937, 30, 602042400L);
        setLongElement(term239937, 31, 624423600L);
        setLongElement(term239937, 32, 634701600L);
        setLongElement(term239937, 33, 938919600L);
        setLongElement(term239937, 34, 951616800L);
        setLongElement(term239937, 35, 970974000L);
        setLongElement(term239937, 36, 971575200L);
        setLongElement(term239937, 37, 1003028400L);
        setLongElement(term239937, 38, 1013911200L);
        setField(term239933, term239933.getClass(), "savingsInstantTransitions", term239937);
        setField(term239933, term239933.getClass(), "savingsLocalTransitions", term239977);
        setElement(term239978, 1, term239906);
        setElement(term239978, 3, term239906);
        setElement(term239978, 5, term239906);
        setElement(term239978, 7, term239906);
        setElement(term239978, 9, term239906);
        setElement(term239978, 11, term239906);
        setElement(term239978, 13, term239906);
        setElement(term239978, 15, term239906);
        setElement(term239978, 17, term239906);
        setElement(term239978, 19, term239906);
        setElement(term239978, 21, term239906);
        setElement(term239978, 23, term239906);
        setElement(term239978, 25, term239906);
        setElement(term239978, 27, term239906);
        setElement(term239978, 29, term239906);
        setElement(term239978, 31, term239906);
        setElement(term239978, 33, term239906);
        setElement(term239978, 35, term239906);
        setElement(term239978, 37, term239906);
        setElement(term239978, 39, term239906);
        setField(term239933, term239933.getClass(), "wallOffsets", term239978);
        setField(term239933, term239933.getClass(), "lastRules", term239979);
        setField(term239980, term239980.getClass(), "table", null);
        setField(term239980, term239980.getClass(), "nextTable", null);
        setLongField(term239980, term239980.getClass(), "baseCount", 0L);
        setIntField(term239980, term239980.getClass(), "sizeCtl", 0);
        setIntField(term239980, term239980.getClass(), "transferIndex", 0);
        setIntField(term239980, term239980.getClass(), "cellsBusy", 0);
        setField(term239980, term239980.getClass(), "counterCells", null);
        setField(term239980, term239980.getClass(), "keySet", null);
        setField(term239980, term239980.getClass(), "values", null);
        setField(term239980, term239980.getClass(), "entrySet", null);
        setField(term239980, term239980.getClass(), "keySet", null);
        setField(term239980, term239980.getClass(), "values", null);
        setField(term239933, term239933.getClass(), "lastRulesCache", term239980);
        setField(term239916, term239916.getClass(), "rules", term239933);
        setField(term239895, term239895.getClass(), "zone", term239916);
        setField(term239701, term239701.getClass(), "time_stamp", term239895);
        setField(term239701, term239701.getClass(), "start_up_mode", "CtIecpnHzx");
        setField(term239701, term239701.getClass(), "cmm_dly_mod", "lgGoogCJeG");
        setField(term239701, term239701.getClass(), "cmm_dly_sec", "EyskfGpFOR");
        setField(term239701, term239701.getClass(), "cmm_err_mod", "eEKpyfnNFi");
        setField(term239701, term239701.getClass(), "country_code", "WjMAISAxtn");
        setField(term239701, term239701.getClass(), "region_code", "GiDsfCiYsm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RuvnkQFdLv";
        callMethod(klass, "setAime_a_code", argTypes, term239701, args);
    }

};


