package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BuyCstmzItmRequest_setAcceptidx_18651695466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275771;
     Object term276023;

    public BuyCstmzItmRequest_setAcceptidx_18651695466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275771 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term275861 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term275862 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275863 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275867 = newInstance(Class.forName("java.time.LocalTime"));
        Object term275872 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term275882 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term275899 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term275900 = (long[]) newLongArray(1);
        Object[] term275902 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term275903 = (long[]) newLongArray(39);
        Object[] term275943 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term275944 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term275945 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term275946 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term275771, term275771.getClass(), "pd_id", -1897116384);
        setIntField(term275771, term275771.getClass(), "accept_idx", -13046459);
        setIntField(term275771, term275771.getClass(), "start_idx", 24241729);
        setIntField(term275771, term275771.getClass(), "cstmz_itm_id", 1111901997);
        setIntField(term275771, term275771.getClass(), "cstmz_itm_price", 503163075);
        setField(term275771, term275771.getClass(), "cmd", "oxoYdAYVkI");
        setField(term275771, term275771.getClass(), "req_id", "jUYVgbuaNi");
        setField(term275771, term275771.getClass(), "game_id", "IVqaVowLVl");
        setField(term275771, term275771.getClass(), "r_ver", "wsWWrTxdcC");
        setField(term275771, term275771.getClass(), "kc_serial", "UPDwVukZbZ");
        setField(term275771, term275771.getClass(), "b_serial", "nFQQbKAYNp");
        setField(term275771, term275771.getClass(), "place_id", "VQkWATPAEW");
        setIntField(term275863, term275863.getClass(), "year", 2023);
        setShortField(term275863, term275863.getClass(), "month", (short) 11);
        setShortField(term275863, term275863.getClass(), "day", (short) 8);
        setField(term275862, term275862.getClass(), "date", term275863);
        setByteField(term275867, term275867.getClass(), "hour", (byte) 21);
        setByteField(term275867, term275867.getClass(), "minute", (byte) 57);
        setByteField(term275867, term275867.getClass(), "second", (byte) 28);
        setIntField(term275867, term275867.getClass(), "nano", 426944685);
        setField(term275862, term275862.getClass(), "time", term275867);
        setField(term275861, term275861.getClass(), "dateTime", term275862);
        setIntField(term275872, term275872.getClass(), "totalSeconds", -10800);
        setField(term275872, term275872.getClass(), "id", "-03:00");
        setField(term275861, term275861.getClass(), "offset", term275872);
        setField(term275882, term275882.getClass(), "id", "America/Recife");
        setLongElement(term275900, 0, -1767217224L);
        setField(term275899, term275899.getClass(), "standardTransitions", term275900);
        setElement(term275902, 1, term275872);
        setField(term275899, term275899.getClass(), "standardOffsets", term275902);
        setLongElement(term275903, 0, -1767217224L);
        setLongElement(term275903, 1, -1206957600L);
        setLongElement(term275903, 2, -1191362400L);
        setLongElement(term275903, 3, -1175374800L);
        setLongElement(term275903, 4, -1159826400L);
        setLongElement(term275903, 5, -633819600L);
        setLongElement(term275903, 6, -622069200L);
        setLongElement(term275903, 7, -602283600L);
        setLongElement(term275903, 8, -591832800L);
        setLongElement(term275903, 9, -570747600L);
        setLongElement(term275903, 10, -560210400L);
        setLongElement(term275903, 11, -539125200L);
        setLongElement(term275903, 12, -531352800L);
        setLongElement(term275903, 13, -191365200L);
        setLongElement(term275903, 14, -184197600L);
        setLongElement(term275903, 15, -155163600L);
        setLongElement(term275903, 16, -150069600L);
        setLongElement(term275903, 17, -128898000L);
        setLongElement(term275903, 18, -121125600L);
        setLongElement(term275903, 19, -99954000L);
        setLongElement(term275903, 20, -89589600L);
        setLongElement(term275903, 21, -68418000L);
        setLongElement(term275903, 22, -57967200L);
        setLongElement(term275903, 23, 499748400L);
        setLongElement(term275903, 24, 511236000L);
        setLongElement(term275903, 25, 530593200L);
        setLongElement(term275903, 26, 540266400L);
        setLongElement(term275903, 27, 562129200L);
        setLongElement(term275903, 28, 571197600L);
        setLongElement(term275903, 29, 592974000L);
        setLongElement(term275903, 30, 602042400L);
        setLongElement(term275903, 31, 624423600L);
        setLongElement(term275903, 32, 634701600L);
        setLongElement(term275903, 33, 938919600L);
        setLongElement(term275903, 34, 951616800L);
        setLongElement(term275903, 35, 970974000L);
        setLongElement(term275903, 36, 971575200L);
        setLongElement(term275903, 37, 1003028400L);
        setLongElement(term275903, 38, 1013911200L);
        setField(term275899, term275899.getClass(), "savingsInstantTransitions", term275903);
        setField(term275899, term275899.getClass(), "savingsLocalTransitions", term275943);
        setElement(term275944, 1, term275872);
        setElement(term275944, 3, term275872);
        setElement(term275944, 5, term275872);
        setElement(term275944, 7, term275872);
        setElement(term275944, 9, term275872);
        setElement(term275944, 11, term275872);
        setElement(term275944, 13, term275872);
        setElement(term275944, 15, term275872);
        setElement(term275944, 17, term275872);
        setElement(term275944, 19, term275872);
        setElement(term275944, 21, term275872);
        setElement(term275944, 23, term275872);
        setElement(term275944, 25, term275872);
        setElement(term275944, 27, term275872);
        setElement(term275944, 29, term275872);
        setElement(term275944, 31, term275872);
        setElement(term275944, 33, term275872);
        setElement(term275944, 35, term275872);
        setElement(term275944, 37, term275872);
        setElement(term275944, 39, term275872);
        setField(term275899, term275899.getClass(), "wallOffsets", term275944);
        setField(term275899, term275899.getClass(), "lastRules", term275945);
        setField(term275946, term275946.getClass(), "table", null);
        setField(term275946, term275946.getClass(), "nextTable", null);
        setLongField(term275946, term275946.getClass(), "baseCount", 0L);
        setIntField(term275946, term275946.getClass(), "sizeCtl", 0);
        setIntField(term275946, term275946.getClass(), "transferIndex", 0);
        setIntField(term275946, term275946.getClass(), "cellsBusy", 0);
        setField(term275946, term275946.getClass(), "counterCells", null);
        setField(term275946, term275946.getClass(), "keySet", null);
        setField(term275946, term275946.getClass(), "values", null);
        setField(term275946, term275946.getClass(), "entrySet", null);
        setField(term275946, term275946.getClass(), "keySet", null);
        setField(term275946, term275946.getClass(), "values", null);
        setField(term275899, term275899.getClass(), "lastRulesCache", term275946);
        setField(term275882, term275882.getClass(), "rules", term275899);
        setField(term275861, term275861.getClass(), "zone", term275882);
        setField(term275771, term275771.getClass(), "time_stamp", term275861);
        setField(term275771, term275771.getClass(), "start_up_mode", "giGfkdhPAE");
        setField(term275771, term275771.getClass(), "cmm_dly_mod", "wNfBmUuDuP");
        setField(term275771, term275771.getClass(), "cmm_dly_sec", "lNTNKavUNL");
        setField(term275771, term275771.getClass(), "cmm_err_mod", "BXfmFjgpOy");
        setField(term275771, term275771.getClass(), "country_code", "JCeHaSFOWK");
        setField(term275771, term275771.getClass(), "region_code", "PNtiQWTZzA");
        term276023 = new Integer(1805356197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276023;
        callMethod(klass, "setAccept_idx", argTypes, term275771, args);
    }

};


