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

public class RegistrationRequest_getIdm_13230315841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6913;

    public RegistrationRequest_getIdm_13230315841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6913 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term7107 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term7108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7113 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7118 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term7128 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term7145 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term7146 = (long[]) newLongArray(1);
        Object[] term7148 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term7149 = (long[]) newLongArray(39);
        Object[] term7189 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term7190 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term7191 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term7192 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term6913, term6913.getClass(), "pmm", "GZdcJyZntS");
        setField(term6913, term6913.getClass(), "idm", "OIHoJeysUi");
        setField(term6913, term6913.getClass(), "mmgameid", "WXMWFDGcLB");
        setField(term6913, term6913.getClass(), "mmuid", "wKWbJssZuG");
        setField(term6913, term6913.getClass(), "a_code", "NzBMMhkhpT");
        setIntField(term6913, term6913.getClass(), "aime_id", -157887805);
        setField(term6913, term6913.getClass(), "aime_a_code", "qCpEbQDHdF");
        setField(term6913, term6913.getClass(), "key_obj_type", "AHbZyFOmlo");
        setField(term6913, term6913.getClass(), "player_name", "TwfWVQGiIj");
        setField(term6913, term6913.getClass(), "passwd", "gUvcueTURF");
        setField(term6913, term6913.getClass(), "cmd", "EwQBhZjCIT");
        setField(term6913, term6913.getClass(), "req_id", "aSkmSwTnEw");
        setField(term6913, term6913.getClass(), "game_id", "xvkbvaEGYd");
        setField(term6913, term6913.getClass(), "r_ver", "HBGNxdNURv");
        setField(term6913, term6913.getClass(), "kc_serial", "mfCpTPPQQm");
        setField(term6913, term6913.getClass(), "b_serial", "OcJCIDNIXA");
        setField(term6913, term6913.getClass(), "place_id", "XfRABIFVEp");
        setIntField(term7109, term7109.getClass(), "year", 2021);
        setShortField(term7109, term7109.getClass(), "month", (short) 9);
        setShortField(term7109, term7109.getClass(), "day", (short) 7);
        setField(term7108, term7108.getClass(), "date", term7109);
        setByteField(term7113, term7113.getClass(), "hour", (byte) 5);
        setByteField(term7113, term7113.getClass(), "minute", (byte) 25);
        setByteField(term7113, term7113.getClass(), "second", (byte) 7);
        setIntField(term7113, term7113.getClass(), "nano", 755924076);
        setField(term7108, term7108.getClass(), "time", term7113);
        setField(term7107, term7107.getClass(), "dateTime", term7108);
        setIntField(term7118, term7118.getClass(), "totalSeconds", -10800);
        setField(term7118, term7118.getClass(), "id", "-03:00");
        setField(term7107, term7107.getClass(), "offset", term7118);
        setField(term7128, term7128.getClass(), "id", "America/Recife");
        setLongElement(term7146, 0, -1767217224L);
        setField(term7145, term7145.getClass(), "standardTransitions", term7146);
        setElement(term7148, 1, term7118);
        setField(term7145, term7145.getClass(), "standardOffsets", term7148);
        setLongElement(term7149, 0, -1767217224L);
        setLongElement(term7149, 1, -1206957600L);
        setLongElement(term7149, 2, -1191362400L);
        setLongElement(term7149, 3, -1175374800L);
        setLongElement(term7149, 4, -1159826400L);
        setLongElement(term7149, 5, -633819600L);
        setLongElement(term7149, 6, -622069200L);
        setLongElement(term7149, 7, -602283600L);
        setLongElement(term7149, 8, -591832800L);
        setLongElement(term7149, 9, -570747600L);
        setLongElement(term7149, 10, -560210400L);
        setLongElement(term7149, 11, -539125200L);
        setLongElement(term7149, 12, -531352800L);
        setLongElement(term7149, 13, -191365200L);
        setLongElement(term7149, 14, -184197600L);
        setLongElement(term7149, 15, -155163600L);
        setLongElement(term7149, 16, -150069600L);
        setLongElement(term7149, 17, -128898000L);
        setLongElement(term7149, 18, -121125600L);
        setLongElement(term7149, 19, -99954000L);
        setLongElement(term7149, 20, -89589600L);
        setLongElement(term7149, 21, -68418000L);
        setLongElement(term7149, 22, -57967200L);
        setLongElement(term7149, 23, 499748400L);
        setLongElement(term7149, 24, 511236000L);
        setLongElement(term7149, 25, 530593200L);
        setLongElement(term7149, 26, 540266400L);
        setLongElement(term7149, 27, 562129200L);
        setLongElement(term7149, 28, 571197600L);
        setLongElement(term7149, 29, 592974000L);
        setLongElement(term7149, 30, 602042400L);
        setLongElement(term7149, 31, 624423600L);
        setLongElement(term7149, 32, 634701600L);
        setLongElement(term7149, 33, 938919600L);
        setLongElement(term7149, 34, 951616800L);
        setLongElement(term7149, 35, 970974000L);
        setLongElement(term7149, 36, 971575200L);
        setLongElement(term7149, 37, 1003028400L);
        setLongElement(term7149, 38, 1013911200L);
        setField(term7145, term7145.getClass(), "savingsInstantTransitions", term7149);
        setField(term7145, term7145.getClass(), "savingsLocalTransitions", term7189);
        setElement(term7190, 1, term7118);
        setElement(term7190, 3, term7118);
        setElement(term7190, 5, term7118);
        setElement(term7190, 7, term7118);
        setElement(term7190, 9, term7118);
        setElement(term7190, 11, term7118);
        setElement(term7190, 13, term7118);
        setElement(term7190, 15, term7118);
        setElement(term7190, 17, term7118);
        setElement(term7190, 19, term7118);
        setElement(term7190, 21, term7118);
        setElement(term7190, 23, term7118);
        setElement(term7190, 25, term7118);
        setElement(term7190, 27, term7118);
        setElement(term7190, 29, term7118);
        setElement(term7190, 31, term7118);
        setElement(term7190, 33, term7118);
        setElement(term7190, 35, term7118);
        setElement(term7190, 37, term7118);
        setElement(term7190, 39, term7118);
        setField(term7145, term7145.getClass(), "wallOffsets", term7190);
        setField(term7145, term7145.getClass(), "lastRules", term7191);
        setField(term7192, term7192.getClass(), "table", null);
        setField(term7192, term7192.getClass(), "nextTable", null);
        setLongField(term7192, term7192.getClass(), "baseCount", 0L);
        setIntField(term7192, term7192.getClass(), "sizeCtl", 0);
        setIntField(term7192, term7192.getClass(), "transferIndex", 0);
        setIntField(term7192, term7192.getClass(), "cellsBusy", 0);
        setField(term7192, term7192.getClass(), "counterCells", null);
        setField(term7192, term7192.getClass(), "keySet", null);
        setField(term7192, term7192.getClass(), "values", null);
        setField(term7192, term7192.getClass(), "entrySet", null);
        setField(term7192, term7192.getClass(), "keySet", null);
        setField(term7192, term7192.getClass(), "values", null);
        setField(term7145, term7145.getClass(), "lastRulesCache", term7192);
        setField(term7128, term7128.getClass(), "rules", term7145);
        setField(term7107, term7107.getClass(), "zone", term7128);
        setField(term6913, term6913.getClass(), "time_stamp", term7107);
        setField(term6913, term6913.getClass(), "start_up_mode", "MHGKyEnwKc");
        setField(term6913, term6913.getClass(), "cmm_dly_mod", "ShIELyuULw");
        setField(term6913, term6913.getClass(), "cmm_dly_sec", "IpQuOGMgmj");
        setField(term6913, term6913.getClass(), "cmm_err_mod", "pJbnHTYrxn");
        setField(term6913, term6913.getClass(), "country_code", "iIRsCSYqXH");
        setField(term6913, term6913.getClass(), "region_code", "nghfqDXyCG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdm", argTypes, term6913, args);
    }

};


