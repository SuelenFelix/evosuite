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

public class RegistrationRequest_getMmuid_10565432663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8185;

    public RegistrationRequest_getMmuid_10565432663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8185 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term8379 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term8380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8385 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8390 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term8400 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term8417 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term8418 = (long[]) newLongArray(1);
        Object[] term8420 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term8421 = (long[]) newLongArray(39);
        Object[] term8461 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term8462 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term8463 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term8464 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term8185, term8185.getClass(), "pmm", "uSUvKAyuvd");
        setField(term8185, term8185.getClass(), "idm", "onQLVONGuf");
        setField(term8185, term8185.getClass(), "mmgameid", "SOrEHbcbmn");
        setField(term8185, term8185.getClass(), "mmuid", "bnsyeQXFdu");
        setField(term8185, term8185.getClass(), "a_code", "BwtdjiefJn");
        setIntField(term8185, term8185.getClass(), "aime_id", -817164822);
        setField(term8185, term8185.getClass(), "aime_a_code", "jDmhBrIoDa");
        setField(term8185, term8185.getClass(), "key_obj_type", "SPtPatHeOm");
        setField(term8185, term8185.getClass(), "player_name", "ywmcuThdfL");
        setField(term8185, term8185.getClass(), "passwd", "GBOEuByOfr");
        setField(term8185, term8185.getClass(), "cmd", "NHbOFFjyVK");
        setField(term8185, term8185.getClass(), "req_id", "zaloBqlrSo");
        setField(term8185, term8185.getClass(), "game_id", "vvoLrMGCoN");
        setField(term8185, term8185.getClass(), "r_ver", "pXdglvyrQe");
        setField(term8185, term8185.getClass(), "kc_serial", "OcfNzHYdki");
        setField(term8185, term8185.getClass(), "b_serial", "uPuCVuZYOI");
        setField(term8185, term8185.getClass(), "place_id", "TweMFhxNdj");
        setIntField(term8381, term8381.getClass(), "year", 2017);
        setShortField(term8381, term8381.getClass(), "month", (short) 6);
        setShortField(term8381, term8381.getClass(), "day", (short) 8);
        setField(term8380, term8380.getClass(), "date", term8381);
        setByteField(term8385, term8385.getClass(), "hour", (byte) 0);
        setByteField(term8385, term8385.getClass(), "minute", (byte) 18);
        setByteField(term8385, term8385.getClass(), "second", (byte) 55);
        setIntField(term8385, term8385.getClass(), "nano", 680586717);
        setField(term8380, term8380.getClass(), "time", term8385);
        setField(term8379, term8379.getClass(), "dateTime", term8380);
        setIntField(term8390, term8390.getClass(), "totalSeconds", -10800);
        setField(term8390, term8390.getClass(), "id", "-03:00");
        setField(term8379, term8379.getClass(), "offset", term8390);
        setField(term8400, term8400.getClass(), "id", "America/Recife");
        setLongElement(term8418, 0, -1767217224L);
        setField(term8417, term8417.getClass(), "standardTransitions", term8418);
        setElement(term8420, 1, term8390);
        setField(term8417, term8417.getClass(), "standardOffsets", term8420);
        setLongElement(term8421, 0, -1767217224L);
        setLongElement(term8421, 1, -1206957600L);
        setLongElement(term8421, 2, -1191362400L);
        setLongElement(term8421, 3, -1175374800L);
        setLongElement(term8421, 4, -1159826400L);
        setLongElement(term8421, 5, -633819600L);
        setLongElement(term8421, 6, -622069200L);
        setLongElement(term8421, 7, -602283600L);
        setLongElement(term8421, 8, -591832800L);
        setLongElement(term8421, 9, -570747600L);
        setLongElement(term8421, 10, -560210400L);
        setLongElement(term8421, 11, -539125200L);
        setLongElement(term8421, 12, -531352800L);
        setLongElement(term8421, 13, -191365200L);
        setLongElement(term8421, 14, -184197600L);
        setLongElement(term8421, 15, -155163600L);
        setLongElement(term8421, 16, -150069600L);
        setLongElement(term8421, 17, -128898000L);
        setLongElement(term8421, 18, -121125600L);
        setLongElement(term8421, 19, -99954000L);
        setLongElement(term8421, 20, -89589600L);
        setLongElement(term8421, 21, -68418000L);
        setLongElement(term8421, 22, -57967200L);
        setLongElement(term8421, 23, 499748400L);
        setLongElement(term8421, 24, 511236000L);
        setLongElement(term8421, 25, 530593200L);
        setLongElement(term8421, 26, 540266400L);
        setLongElement(term8421, 27, 562129200L);
        setLongElement(term8421, 28, 571197600L);
        setLongElement(term8421, 29, 592974000L);
        setLongElement(term8421, 30, 602042400L);
        setLongElement(term8421, 31, 624423600L);
        setLongElement(term8421, 32, 634701600L);
        setLongElement(term8421, 33, 938919600L);
        setLongElement(term8421, 34, 951616800L);
        setLongElement(term8421, 35, 970974000L);
        setLongElement(term8421, 36, 971575200L);
        setLongElement(term8421, 37, 1003028400L);
        setLongElement(term8421, 38, 1013911200L);
        setField(term8417, term8417.getClass(), "savingsInstantTransitions", term8421);
        setField(term8417, term8417.getClass(), "savingsLocalTransitions", term8461);
        setElement(term8462, 1, term8390);
        setElement(term8462, 3, term8390);
        setElement(term8462, 5, term8390);
        setElement(term8462, 7, term8390);
        setElement(term8462, 9, term8390);
        setElement(term8462, 11, term8390);
        setElement(term8462, 13, term8390);
        setElement(term8462, 15, term8390);
        setElement(term8462, 17, term8390);
        setElement(term8462, 19, term8390);
        setElement(term8462, 21, term8390);
        setElement(term8462, 23, term8390);
        setElement(term8462, 25, term8390);
        setElement(term8462, 27, term8390);
        setElement(term8462, 29, term8390);
        setElement(term8462, 31, term8390);
        setElement(term8462, 33, term8390);
        setElement(term8462, 35, term8390);
        setElement(term8462, 37, term8390);
        setElement(term8462, 39, term8390);
        setField(term8417, term8417.getClass(), "wallOffsets", term8462);
        setField(term8417, term8417.getClass(), "lastRules", term8463);
        setField(term8464, term8464.getClass(), "table", null);
        setField(term8464, term8464.getClass(), "nextTable", null);
        setLongField(term8464, term8464.getClass(), "baseCount", 0L);
        setIntField(term8464, term8464.getClass(), "sizeCtl", 0);
        setIntField(term8464, term8464.getClass(), "transferIndex", 0);
        setIntField(term8464, term8464.getClass(), "cellsBusy", 0);
        setField(term8464, term8464.getClass(), "counterCells", null);
        setField(term8464, term8464.getClass(), "keySet", null);
        setField(term8464, term8464.getClass(), "values", null);
        setField(term8464, term8464.getClass(), "entrySet", null);
        setField(term8464, term8464.getClass(), "keySet", null);
        setField(term8464, term8464.getClass(), "values", null);
        setField(term8417, term8417.getClass(), "lastRulesCache", term8464);
        setField(term8400, term8400.getClass(), "rules", term8417);
        setField(term8379, term8379.getClass(), "zone", term8400);
        setField(term8185, term8185.getClass(), "time_stamp", term8379);
        setField(term8185, term8185.getClass(), "start_up_mode", "NBrvVzvQHe");
        setField(term8185, term8185.getClass(), "cmm_dly_mod", "FjOiNAfBOc");
        setField(term8185, term8185.getClass(), "cmm_dly_sec", "iCCsaLHohG");
        setField(term8185, term8185.getClass(), "cmm_err_mod", "NJhGgctbdj");
        setField(term8185, term8185.getClass(), "country_code", "MYWYUeLGOp");
        setField(term8185, term8185.getClass(), "region_code", "tsTGdgQYUL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMmuid", argTypes, term8185, args);
    }

};


