package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PreStartRequest_getPmm_19398757990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9423;

    public PreStartRequest_getPmm_19398757990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9423 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term9594 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term9595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9600 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9605 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term9615 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term9632 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term9633 = (long[]) newLongArray(1);
        Object[] term9635 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term9636 = (long[]) newLongArray(39);
        Object[] term9676 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term9677 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term9678 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term9679 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term9423, term9423.getClass(), "pmm", "ZKMLioamsY");
        setField(term9423, term9423.getClass(), "idm", "WVbxuoDBcn");
        setField(term9423, term9423.getClass(), "mmgameid", "pvDEABOxLt");
        setField(term9423, term9423.getClass(), "mmuid", "beAMpkroCQ");
        setField(term9423, term9423.getClass(), "a_code", "uSUvKAyuvd");
        setIntField(term9423, term9423.getClass(), "aime_id", 413548937);
        setField(term9423, term9423.getClass(), "aime_a_code", "onQLVONGuf");
        setField(term9423, term9423.getClass(), "key_obj_type", "SOrEHbcbmn");
        setBooleanField(term9423, term9423.getClass(), "exec_vu", false);
        setField(term9423, term9423.getClass(), "cmd", "bnsyeQXFdu");
        setField(term9423, term9423.getClass(), "req_id", "BwtdjiefJn");
        setField(term9423, term9423.getClass(), "game_id", "jDmhBrIoDa");
        setField(term9423, term9423.getClass(), "r_ver", "SPtPatHeOm");
        setField(term9423, term9423.getClass(), "kc_serial", "ywmcuThdfL");
        setField(term9423, term9423.getClass(), "b_serial", "GBOEuByOfr");
        setField(term9423, term9423.getClass(), "place_id", "NHbOFFjyVK");
        setIntField(term9596, term9596.getClass(), "year", 2014);
        setShortField(term9596, term9596.getClass(), "month", (short) 7);
        setShortField(term9596, term9596.getClass(), "day", (short) 13);
        setField(term9595, term9595.getClass(), "date", term9596);
        setByteField(term9600, term9600.getClass(), "hour", (byte) 21);
        setByteField(term9600, term9600.getClass(), "minute", (byte) 46);
        setByteField(term9600, term9600.getClass(), "second", (byte) 0);
        setIntField(term9600, term9600.getClass(), "nano", 887884128);
        setField(term9595, term9595.getClass(), "time", term9600);
        setField(term9594, term9594.getClass(), "dateTime", term9595);
        setIntField(term9605, term9605.getClass(), "totalSeconds", -10800);
        setField(term9605, term9605.getClass(), "id", "-03:00");
        setField(term9594, term9594.getClass(), "offset", term9605);
        setField(term9615, term9615.getClass(), "id", "America/Recife");
        setLongElement(term9633, 0, -1767217224L);
        setField(term9632, term9632.getClass(), "standardTransitions", term9633);
        setElement(term9635, 1, term9605);
        setField(term9632, term9632.getClass(), "standardOffsets", term9635);
        setLongElement(term9636, 0, -1767217224L);
        setLongElement(term9636, 1, -1206957600L);
        setLongElement(term9636, 2, -1191362400L);
        setLongElement(term9636, 3, -1175374800L);
        setLongElement(term9636, 4, -1159826400L);
        setLongElement(term9636, 5, -633819600L);
        setLongElement(term9636, 6, -622069200L);
        setLongElement(term9636, 7, -602283600L);
        setLongElement(term9636, 8, -591832800L);
        setLongElement(term9636, 9, -570747600L);
        setLongElement(term9636, 10, -560210400L);
        setLongElement(term9636, 11, -539125200L);
        setLongElement(term9636, 12, -531352800L);
        setLongElement(term9636, 13, -191365200L);
        setLongElement(term9636, 14, -184197600L);
        setLongElement(term9636, 15, -155163600L);
        setLongElement(term9636, 16, -150069600L);
        setLongElement(term9636, 17, -128898000L);
        setLongElement(term9636, 18, -121125600L);
        setLongElement(term9636, 19, -99954000L);
        setLongElement(term9636, 20, -89589600L);
        setLongElement(term9636, 21, -68418000L);
        setLongElement(term9636, 22, -57967200L);
        setLongElement(term9636, 23, 499748400L);
        setLongElement(term9636, 24, 511236000L);
        setLongElement(term9636, 25, 530593200L);
        setLongElement(term9636, 26, 540266400L);
        setLongElement(term9636, 27, 562129200L);
        setLongElement(term9636, 28, 571197600L);
        setLongElement(term9636, 29, 592974000L);
        setLongElement(term9636, 30, 602042400L);
        setLongElement(term9636, 31, 624423600L);
        setLongElement(term9636, 32, 634701600L);
        setLongElement(term9636, 33, 938919600L);
        setLongElement(term9636, 34, 951616800L);
        setLongElement(term9636, 35, 970974000L);
        setLongElement(term9636, 36, 971575200L);
        setLongElement(term9636, 37, 1003028400L);
        setLongElement(term9636, 38, 1013911200L);
        setField(term9632, term9632.getClass(), "savingsInstantTransitions", term9636);
        setField(term9632, term9632.getClass(), "savingsLocalTransitions", term9676);
        setElement(term9677, 1, term9605);
        setElement(term9677, 3, term9605);
        setElement(term9677, 5, term9605);
        setElement(term9677, 7, term9605);
        setElement(term9677, 9, term9605);
        setElement(term9677, 11, term9605);
        setElement(term9677, 13, term9605);
        setElement(term9677, 15, term9605);
        setElement(term9677, 17, term9605);
        setElement(term9677, 19, term9605);
        setElement(term9677, 21, term9605);
        setElement(term9677, 23, term9605);
        setElement(term9677, 25, term9605);
        setElement(term9677, 27, term9605);
        setElement(term9677, 29, term9605);
        setElement(term9677, 31, term9605);
        setElement(term9677, 33, term9605);
        setElement(term9677, 35, term9605);
        setElement(term9677, 37, term9605);
        setElement(term9677, 39, term9605);
        setField(term9632, term9632.getClass(), "wallOffsets", term9677);
        setField(term9632, term9632.getClass(), "lastRules", term9678);
        setField(term9679, term9679.getClass(), "table", null);
        setField(term9679, term9679.getClass(), "nextTable", null);
        setLongField(term9679, term9679.getClass(), "baseCount", 0L);
        setIntField(term9679, term9679.getClass(), "sizeCtl", 0);
        setIntField(term9679, term9679.getClass(), "transferIndex", 0);
        setIntField(term9679, term9679.getClass(), "cellsBusy", 0);
        setField(term9679, term9679.getClass(), "counterCells", null);
        setField(term9679, term9679.getClass(), "keySet", null);
        setField(term9679, term9679.getClass(), "values", null);
        setField(term9679, term9679.getClass(), "entrySet", null);
        setField(term9679, term9679.getClass(), "keySet", null);
        setField(term9679, term9679.getClass(), "values", null);
        setField(term9632, term9632.getClass(), "lastRulesCache", term9679);
        setField(term9615, term9615.getClass(), "rules", term9632);
        setField(term9594, term9594.getClass(), "zone", term9615);
        setField(term9423, term9423.getClass(), "time_stamp", term9594);
        setField(term9423, term9423.getClass(), "start_up_mode", "zaloBqlrSo");
        setField(term9423, term9423.getClass(), "cmm_dly_mod", "vvoLrMGCoN");
        setField(term9423, term9423.getClass(), "cmm_dly_sec", "pXdglvyrQe");
        setField(term9423, term9423.getClass(), "cmm_err_mod", "OcfNzHYdki");
        setField(term9423, term9423.getClass(), "country_code", "uPuCVuZYOI");
        setField(term9423, term9423.getClass(), "region_code", "TweMFhxNdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPmm", argTypes, term9423, args);
    }

};


