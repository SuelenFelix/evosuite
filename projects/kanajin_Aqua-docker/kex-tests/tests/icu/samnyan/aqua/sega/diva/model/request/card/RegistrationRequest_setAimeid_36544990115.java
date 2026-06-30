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

public class RegistrationRequest_setAimeid_36544990115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15927;
     Object term16283;

    public RegistrationRequest_setAimeid_36544990115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15927 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term16121 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term16122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16127 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16132 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term16142 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term16159 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term16160 = (long[]) newLongArray(1);
        Object[] term16162 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term16163 = (long[]) newLongArray(39);
        Object[] term16203 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term16204 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term16205 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term16206 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term15927, term15927.getClass(), "pmm", "bHHjfDCntT");
        setField(term15927, term15927.getClass(), "idm", "sEphiduvkv");
        setField(term15927, term15927.getClass(), "mmgameid", "PbLgCSAHce");
        setField(term15927, term15927.getClass(), "mmuid", "NWldOLAbqk");
        setField(term15927, term15927.getClass(), "a_code", "qnYaYSpDwO");
        setIntField(term15927, term15927.getClass(), "aime_id", -184153539);
        setField(term15927, term15927.getClass(), "aime_a_code", "dgbFDCdHtj");
        setField(term15927, term15927.getClass(), "key_obj_type", "EKpdCBubDE");
        setField(term15927, term15927.getClass(), "player_name", "zMsSLTfGhl");
        setField(term15927, term15927.getClass(), "passwd", "bEmHScVZaQ");
        setField(term15927, term15927.getClass(), "cmd", "TcuXODkzBV");
        setField(term15927, term15927.getClass(), "req_id", "coJPjrBZNe");
        setField(term15927, term15927.getClass(), "game_id", "vMsWjuPTnO");
        setField(term15927, term15927.getClass(), "r_ver", "zHvfKaOstO");
        setField(term15927, term15927.getClass(), "kc_serial", "tOszriqETr");
        setField(term15927, term15927.getClass(), "b_serial", "ncSPTkhKjO");
        setField(term15927, term15927.getClass(), "place_id", "jcWKHRWhyj");
        setIntField(term16123, term16123.getClass(), "year", 2027);
        setShortField(term16123, term16123.getClass(), "month", (short) 2);
        setShortField(term16123, term16123.getClass(), "day", (short) 19);
        setField(term16122, term16122.getClass(), "date", term16123);
        setByteField(term16127, term16127.getClass(), "hour", (byte) 17);
        setByteField(term16127, term16127.getClass(), "minute", (byte) 37);
        setByteField(term16127, term16127.getClass(), "second", (byte) 27);
        setIntField(term16127, term16127.getClass(), "nano", 920380537);
        setField(term16122, term16122.getClass(), "time", term16127);
        setField(term16121, term16121.getClass(), "dateTime", term16122);
        setIntField(term16132, term16132.getClass(), "totalSeconds", -10800);
        setField(term16132, term16132.getClass(), "id", "-03:00");
        setField(term16121, term16121.getClass(), "offset", term16132);
        setField(term16142, term16142.getClass(), "id", "America/Recife");
        setLongElement(term16160, 0, -1767217224L);
        setField(term16159, term16159.getClass(), "standardTransitions", term16160);
        setElement(term16162, 1, term16132);
        setField(term16159, term16159.getClass(), "standardOffsets", term16162);
        setLongElement(term16163, 0, -1767217224L);
        setLongElement(term16163, 1, -1206957600L);
        setLongElement(term16163, 2, -1191362400L);
        setLongElement(term16163, 3, -1175374800L);
        setLongElement(term16163, 4, -1159826400L);
        setLongElement(term16163, 5, -633819600L);
        setLongElement(term16163, 6, -622069200L);
        setLongElement(term16163, 7, -602283600L);
        setLongElement(term16163, 8, -591832800L);
        setLongElement(term16163, 9, -570747600L);
        setLongElement(term16163, 10, -560210400L);
        setLongElement(term16163, 11, -539125200L);
        setLongElement(term16163, 12, -531352800L);
        setLongElement(term16163, 13, -191365200L);
        setLongElement(term16163, 14, -184197600L);
        setLongElement(term16163, 15, -155163600L);
        setLongElement(term16163, 16, -150069600L);
        setLongElement(term16163, 17, -128898000L);
        setLongElement(term16163, 18, -121125600L);
        setLongElement(term16163, 19, -99954000L);
        setLongElement(term16163, 20, -89589600L);
        setLongElement(term16163, 21, -68418000L);
        setLongElement(term16163, 22, -57967200L);
        setLongElement(term16163, 23, 499748400L);
        setLongElement(term16163, 24, 511236000L);
        setLongElement(term16163, 25, 530593200L);
        setLongElement(term16163, 26, 540266400L);
        setLongElement(term16163, 27, 562129200L);
        setLongElement(term16163, 28, 571197600L);
        setLongElement(term16163, 29, 592974000L);
        setLongElement(term16163, 30, 602042400L);
        setLongElement(term16163, 31, 624423600L);
        setLongElement(term16163, 32, 634701600L);
        setLongElement(term16163, 33, 938919600L);
        setLongElement(term16163, 34, 951616800L);
        setLongElement(term16163, 35, 970974000L);
        setLongElement(term16163, 36, 971575200L);
        setLongElement(term16163, 37, 1003028400L);
        setLongElement(term16163, 38, 1013911200L);
        setField(term16159, term16159.getClass(), "savingsInstantTransitions", term16163);
        setField(term16159, term16159.getClass(), "savingsLocalTransitions", term16203);
        setElement(term16204, 1, term16132);
        setElement(term16204, 3, term16132);
        setElement(term16204, 5, term16132);
        setElement(term16204, 7, term16132);
        setElement(term16204, 9, term16132);
        setElement(term16204, 11, term16132);
        setElement(term16204, 13, term16132);
        setElement(term16204, 15, term16132);
        setElement(term16204, 17, term16132);
        setElement(term16204, 19, term16132);
        setElement(term16204, 21, term16132);
        setElement(term16204, 23, term16132);
        setElement(term16204, 25, term16132);
        setElement(term16204, 27, term16132);
        setElement(term16204, 29, term16132);
        setElement(term16204, 31, term16132);
        setElement(term16204, 33, term16132);
        setElement(term16204, 35, term16132);
        setElement(term16204, 37, term16132);
        setElement(term16204, 39, term16132);
        setField(term16159, term16159.getClass(), "wallOffsets", term16204);
        setField(term16159, term16159.getClass(), "lastRules", term16205);
        setField(term16206, term16206.getClass(), "table", null);
        setField(term16206, term16206.getClass(), "nextTable", null);
        setLongField(term16206, term16206.getClass(), "baseCount", 0L);
        setIntField(term16206, term16206.getClass(), "sizeCtl", 0);
        setIntField(term16206, term16206.getClass(), "transferIndex", 0);
        setIntField(term16206, term16206.getClass(), "cellsBusy", 0);
        setField(term16206, term16206.getClass(), "counterCells", null);
        setField(term16206, term16206.getClass(), "keySet", null);
        setField(term16206, term16206.getClass(), "values", null);
        setField(term16206, term16206.getClass(), "entrySet", null);
        setField(term16206, term16206.getClass(), "keySet", null);
        setField(term16206, term16206.getClass(), "values", null);
        setField(term16159, term16159.getClass(), "lastRulesCache", term16206);
        setField(term16142, term16142.getClass(), "rules", term16159);
        setField(term16121, term16121.getClass(), "zone", term16142);
        setField(term15927, term15927.getClass(), "time_stamp", term16121);
        setField(term15927, term15927.getClass(), "start_up_mode", "nrQjODRMLD");
        setField(term15927, term15927.getClass(), "cmm_dly_mod", "PNoWXrsFic");
        setField(term15927, term15927.getClass(), "cmm_dly_sec", "QZBHZqZope");
        setField(term15927, term15927.getClass(), "cmm_err_mod", "VBUahCvyxC");
        setField(term15927, term15927.getClass(), "country_code", "MlzTkzKMCX");
        setField(term15927, term15927.getClass(), "region_code", "UqKUbMyPMJ");
        term16283 = new Integer(493620644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16283;
        callMethod(klass, "setAime_id", argTypes, term15927, args);
    }

};


