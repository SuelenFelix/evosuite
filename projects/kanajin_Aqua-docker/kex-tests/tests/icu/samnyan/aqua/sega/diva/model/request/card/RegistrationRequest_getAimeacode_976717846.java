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

public class RegistrationRequest_getAimeacode_976717846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10093;

    public RegistrationRequest_getAimeacode_976717846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10093 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term10287 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term10288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10293 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10298 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term10308 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term10325 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term10326 = (long[]) newLongArray(1);
        Object[] term10328 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term10329 = (long[]) newLongArray(39);
        Object[] term10369 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term10370 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term10371 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term10372 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term10093, term10093.getClass(), "pmm", "VVNNlAePXF");
        setField(term10093, term10093.getClass(), "idm", "jnwVnmKAFv");
        setField(term10093, term10093.getClass(), "mmgameid", "TXyHhqeCjR");
        setField(term10093, term10093.getClass(), "mmuid", "lZIgPZPgTu");
        setField(term10093, term10093.getClass(), "a_code", "iuCxnHGMoW");
        setIntField(term10093, term10093.getClass(), "aime_id", 579005622);
        setField(term10093, term10093.getClass(), "aime_a_code", "GPSEWEDSTo");
        setField(term10093, term10093.getClass(), "key_obj_type", "RCOqfVsRHt");
        setField(term10093, term10093.getClass(), "player_name", "TSyCeEZPaT");
        setField(term10093, term10093.getClass(), "passwd", "JeZFtaqkzW");
        setField(term10093, term10093.getClass(), "cmd", "vOVuNSCCLe");
        setField(term10093, term10093.getClass(), "req_id", "fzeqPnzpnt");
        setField(term10093, term10093.getClass(), "game_id", "RxbhrFBjkO");
        setField(term10093, term10093.getClass(), "r_ver", "aanyiAOJCl");
        setField(term10093, term10093.getClass(), "kc_serial", "VDokbsCuqq");
        setField(term10093, term10093.getClass(), "b_serial", "xClUIcPECX");
        setField(term10093, term10093.getClass(), "place_id", "avhRaGZaBF");
        setIntField(term10289, term10289.getClass(), "year", 2017);
        setShortField(term10289, term10289.getClass(), "month", (short) 3);
        setShortField(term10289, term10289.getClass(), "day", (short) 5);
        setField(term10288, term10288.getClass(), "date", term10289);
        setByteField(term10293, term10293.getClass(), "hour", (byte) 20);
        setByteField(term10293, term10293.getClass(), "minute", (byte) 34);
        setByteField(term10293, term10293.getClass(), "second", (byte) 55);
        setIntField(term10293, term10293.getClass(), "nano", 78024496);
        setField(term10288, term10288.getClass(), "time", term10293);
        setField(term10287, term10287.getClass(), "dateTime", term10288);
        setIntField(term10298, term10298.getClass(), "totalSeconds", -10800);
        setField(term10298, term10298.getClass(), "id", "-03:00");
        setField(term10287, term10287.getClass(), "offset", term10298);
        setField(term10308, term10308.getClass(), "id", "America/Recife");
        setLongElement(term10326, 0, -1767217224L);
        setField(term10325, term10325.getClass(), "standardTransitions", term10326);
        setElement(term10328, 1, term10298);
        setField(term10325, term10325.getClass(), "standardOffsets", term10328);
        setLongElement(term10329, 0, -1767217224L);
        setLongElement(term10329, 1, -1206957600L);
        setLongElement(term10329, 2, -1191362400L);
        setLongElement(term10329, 3, -1175374800L);
        setLongElement(term10329, 4, -1159826400L);
        setLongElement(term10329, 5, -633819600L);
        setLongElement(term10329, 6, -622069200L);
        setLongElement(term10329, 7, -602283600L);
        setLongElement(term10329, 8, -591832800L);
        setLongElement(term10329, 9, -570747600L);
        setLongElement(term10329, 10, -560210400L);
        setLongElement(term10329, 11, -539125200L);
        setLongElement(term10329, 12, -531352800L);
        setLongElement(term10329, 13, -191365200L);
        setLongElement(term10329, 14, -184197600L);
        setLongElement(term10329, 15, -155163600L);
        setLongElement(term10329, 16, -150069600L);
        setLongElement(term10329, 17, -128898000L);
        setLongElement(term10329, 18, -121125600L);
        setLongElement(term10329, 19, -99954000L);
        setLongElement(term10329, 20, -89589600L);
        setLongElement(term10329, 21, -68418000L);
        setLongElement(term10329, 22, -57967200L);
        setLongElement(term10329, 23, 499748400L);
        setLongElement(term10329, 24, 511236000L);
        setLongElement(term10329, 25, 530593200L);
        setLongElement(term10329, 26, 540266400L);
        setLongElement(term10329, 27, 562129200L);
        setLongElement(term10329, 28, 571197600L);
        setLongElement(term10329, 29, 592974000L);
        setLongElement(term10329, 30, 602042400L);
        setLongElement(term10329, 31, 624423600L);
        setLongElement(term10329, 32, 634701600L);
        setLongElement(term10329, 33, 938919600L);
        setLongElement(term10329, 34, 951616800L);
        setLongElement(term10329, 35, 970974000L);
        setLongElement(term10329, 36, 971575200L);
        setLongElement(term10329, 37, 1003028400L);
        setLongElement(term10329, 38, 1013911200L);
        setField(term10325, term10325.getClass(), "savingsInstantTransitions", term10329);
        setField(term10325, term10325.getClass(), "savingsLocalTransitions", term10369);
        setElement(term10370, 1, term10298);
        setElement(term10370, 3, term10298);
        setElement(term10370, 5, term10298);
        setElement(term10370, 7, term10298);
        setElement(term10370, 9, term10298);
        setElement(term10370, 11, term10298);
        setElement(term10370, 13, term10298);
        setElement(term10370, 15, term10298);
        setElement(term10370, 17, term10298);
        setElement(term10370, 19, term10298);
        setElement(term10370, 21, term10298);
        setElement(term10370, 23, term10298);
        setElement(term10370, 25, term10298);
        setElement(term10370, 27, term10298);
        setElement(term10370, 29, term10298);
        setElement(term10370, 31, term10298);
        setElement(term10370, 33, term10298);
        setElement(term10370, 35, term10298);
        setElement(term10370, 37, term10298);
        setElement(term10370, 39, term10298);
        setField(term10325, term10325.getClass(), "wallOffsets", term10370);
        setField(term10325, term10325.getClass(), "lastRules", term10371);
        setField(term10372, term10372.getClass(), "table", null);
        setField(term10372, term10372.getClass(), "nextTable", null);
        setLongField(term10372, term10372.getClass(), "baseCount", 0L);
        setIntField(term10372, term10372.getClass(), "sizeCtl", 0);
        setIntField(term10372, term10372.getClass(), "transferIndex", 0);
        setIntField(term10372, term10372.getClass(), "cellsBusy", 0);
        setField(term10372, term10372.getClass(), "counterCells", null);
        setField(term10372, term10372.getClass(), "keySet", null);
        setField(term10372, term10372.getClass(), "values", null);
        setField(term10372, term10372.getClass(), "entrySet", null);
        setField(term10372, term10372.getClass(), "keySet", null);
        setField(term10372, term10372.getClass(), "values", null);
        setField(term10325, term10325.getClass(), "lastRulesCache", term10372);
        setField(term10308, term10308.getClass(), "rules", term10325);
        setField(term10287, term10287.getClass(), "zone", term10308);
        setField(term10093, term10093.getClass(), "time_stamp", term10287);
        setField(term10093, term10093.getClass(), "start_up_mode", "JkgoRtImdE");
        setField(term10093, term10093.getClass(), "cmm_dly_mod", "qFGKIJjlmV");
        setField(term10093, term10093.getClass(), "cmm_dly_sec", "IHqvyhMtuM");
        setField(term10093, term10093.getClass(), "cmm_err_mod", "dAldIGYAXV");
        setField(term10093, term10093.getClass(), "country_code", "mLwibAPEsa");
        setField(term10093, term10093.getClass(), "region_code", "zsWKWiTFuo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_a_code", argTypes, term10093, args);
    }

};


