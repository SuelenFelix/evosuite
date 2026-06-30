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

public class RegistrationRequest_setMmuid_148021168213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14611;

    public RegistrationRequest_setMmuid_148021168213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14611 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term14805 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term14806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14811 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14816 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term14826 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term14843 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term14844 = (long[]) newLongArray(1);
        Object[] term14846 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term14847 = (long[]) newLongArray(39);
        Object[] term14887 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term14888 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term14889 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term14890 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term14611, term14611.getClass(), "pmm", "mwmFMNEzkK");
        setField(term14611, term14611.getClass(), "idm", "kVAmKknVln");
        setField(term14611, term14611.getClass(), "mmgameid", "MRFLbEGYKG");
        setField(term14611, term14611.getClass(), "mmuid", "BYrGukTyof");
        setField(term14611, term14611.getClass(), "a_code", "jiCGTTzKGB");
        setIntField(term14611, term14611.getClass(), "aime_id", 292681826);
        setField(term14611, term14611.getClass(), "aime_a_code", "MqICFYzDJj");
        setField(term14611, term14611.getClass(), "key_obj_type", "YgQvdcBQKw");
        setField(term14611, term14611.getClass(), "player_name", "FiYYLuailz");
        setField(term14611, term14611.getClass(), "passwd", "XebAeSnCKZ");
        setField(term14611, term14611.getClass(), "cmd", "GeddnXjHGy");
        setField(term14611, term14611.getClass(), "req_id", "vLTbaoAxBm");
        setField(term14611, term14611.getClass(), "game_id", "BXTjEyEZxD");
        setField(term14611, term14611.getClass(), "r_ver", "oKhVzOKUFW");
        setField(term14611, term14611.getClass(), "kc_serial", "mNHyqmOAFy");
        setField(term14611, term14611.getClass(), "b_serial", "UxgSdhxPCH");
        setField(term14611, term14611.getClass(), "place_id", "DAujxZPHJC");
        setIntField(term14807, term14807.getClass(), "year", 2023);
        setShortField(term14807, term14807.getClass(), "month", (short) 9);
        setShortField(term14807, term14807.getClass(), "day", (short) 23);
        setField(term14806, term14806.getClass(), "date", term14807);
        setByteField(term14811, term14811.getClass(), "hour", (byte) 12);
        setByteField(term14811, term14811.getClass(), "minute", (byte) 55);
        setByteField(term14811, term14811.getClass(), "second", (byte) 58);
        setIntField(term14811, term14811.getClass(), "nano", 159178396);
        setField(term14806, term14806.getClass(), "time", term14811);
        setField(term14805, term14805.getClass(), "dateTime", term14806);
        setIntField(term14816, term14816.getClass(), "totalSeconds", -10800);
        setField(term14816, term14816.getClass(), "id", "-03:00");
        setField(term14805, term14805.getClass(), "offset", term14816);
        setField(term14826, term14826.getClass(), "id", "America/Recife");
        setLongElement(term14844, 0, -1767217224L);
        setField(term14843, term14843.getClass(), "standardTransitions", term14844);
        setElement(term14846, 1, term14816);
        setField(term14843, term14843.getClass(), "standardOffsets", term14846);
        setLongElement(term14847, 0, -1767217224L);
        setLongElement(term14847, 1, -1206957600L);
        setLongElement(term14847, 2, -1191362400L);
        setLongElement(term14847, 3, -1175374800L);
        setLongElement(term14847, 4, -1159826400L);
        setLongElement(term14847, 5, -633819600L);
        setLongElement(term14847, 6, -622069200L);
        setLongElement(term14847, 7, -602283600L);
        setLongElement(term14847, 8, -591832800L);
        setLongElement(term14847, 9, -570747600L);
        setLongElement(term14847, 10, -560210400L);
        setLongElement(term14847, 11, -539125200L);
        setLongElement(term14847, 12, -531352800L);
        setLongElement(term14847, 13, -191365200L);
        setLongElement(term14847, 14, -184197600L);
        setLongElement(term14847, 15, -155163600L);
        setLongElement(term14847, 16, -150069600L);
        setLongElement(term14847, 17, -128898000L);
        setLongElement(term14847, 18, -121125600L);
        setLongElement(term14847, 19, -99954000L);
        setLongElement(term14847, 20, -89589600L);
        setLongElement(term14847, 21, -68418000L);
        setLongElement(term14847, 22, -57967200L);
        setLongElement(term14847, 23, 499748400L);
        setLongElement(term14847, 24, 511236000L);
        setLongElement(term14847, 25, 530593200L);
        setLongElement(term14847, 26, 540266400L);
        setLongElement(term14847, 27, 562129200L);
        setLongElement(term14847, 28, 571197600L);
        setLongElement(term14847, 29, 592974000L);
        setLongElement(term14847, 30, 602042400L);
        setLongElement(term14847, 31, 624423600L);
        setLongElement(term14847, 32, 634701600L);
        setLongElement(term14847, 33, 938919600L);
        setLongElement(term14847, 34, 951616800L);
        setLongElement(term14847, 35, 970974000L);
        setLongElement(term14847, 36, 971575200L);
        setLongElement(term14847, 37, 1003028400L);
        setLongElement(term14847, 38, 1013911200L);
        setField(term14843, term14843.getClass(), "savingsInstantTransitions", term14847);
        setField(term14843, term14843.getClass(), "savingsLocalTransitions", term14887);
        setElement(term14888, 1, term14816);
        setElement(term14888, 3, term14816);
        setElement(term14888, 5, term14816);
        setElement(term14888, 7, term14816);
        setElement(term14888, 9, term14816);
        setElement(term14888, 11, term14816);
        setElement(term14888, 13, term14816);
        setElement(term14888, 15, term14816);
        setElement(term14888, 17, term14816);
        setElement(term14888, 19, term14816);
        setElement(term14888, 21, term14816);
        setElement(term14888, 23, term14816);
        setElement(term14888, 25, term14816);
        setElement(term14888, 27, term14816);
        setElement(term14888, 29, term14816);
        setElement(term14888, 31, term14816);
        setElement(term14888, 33, term14816);
        setElement(term14888, 35, term14816);
        setElement(term14888, 37, term14816);
        setElement(term14888, 39, term14816);
        setField(term14843, term14843.getClass(), "wallOffsets", term14888);
        setField(term14843, term14843.getClass(), "lastRules", term14889);
        setField(term14890, term14890.getClass(), "table", null);
        setField(term14890, term14890.getClass(), "nextTable", null);
        setLongField(term14890, term14890.getClass(), "baseCount", 0L);
        setIntField(term14890, term14890.getClass(), "sizeCtl", 0);
        setIntField(term14890, term14890.getClass(), "transferIndex", 0);
        setIntField(term14890, term14890.getClass(), "cellsBusy", 0);
        setField(term14890, term14890.getClass(), "counterCells", null);
        setField(term14890, term14890.getClass(), "keySet", null);
        setField(term14890, term14890.getClass(), "values", null);
        setField(term14890, term14890.getClass(), "entrySet", null);
        setField(term14890, term14890.getClass(), "keySet", null);
        setField(term14890, term14890.getClass(), "values", null);
        setField(term14843, term14843.getClass(), "lastRulesCache", term14890);
        setField(term14826, term14826.getClass(), "rules", term14843);
        setField(term14805, term14805.getClass(), "zone", term14826);
        setField(term14611, term14611.getClass(), "time_stamp", term14805);
        setField(term14611, term14611.getClass(), "start_up_mode", "IlBhdrCvHq");
        setField(term14611, term14611.getClass(), "cmm_dly_mod", "OirVUQhauU");
        setField(term14611, term14611.getClass(), "cmm_dly_sec", "GLbyDfbNZI");
        setField(term14611, term14611.getClass(), "cmm_err_mod", "oNLcCYDAsO");
        setField(term14611, term14611.getClass(), "country_code", "CNqMxLvtcJ");
        setField(term14611, term14611.getClass(), "region_code", "ktbqerIaKW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VoghngXfsK";
        callMethod(klass, "setMmuid", argTypes, term14611, args);
    }

};


