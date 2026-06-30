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

public class PreStartRequest_setAimeacode_61819794915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18430;

    public PreStartRequest_setAimeacode_61819794915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18430 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term18601 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term18602 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18603 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18607 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18612 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term18622 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term18639 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term18640 = (long[]) newLongArray(1);
        Object[] term18642 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term18643 = (long[]) newLongArray(39);
        Object[] term18683 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term18684 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term18685 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term18686 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term18430, term18430.getClass(), "pmm", "AobDaplFLl");
        setField(term18430, term18430.getClass(), "idm", "pDkMNnAGgv");
        setField(term18430, term18430.getClass(), "mmgameid", "PaCpFXGzdX");
        setField(term18430, term18430.getClass(), "mmuid", "FftYCNbnks");
        setField(term18430, term18430.getClass(), "a_code", "lJoltmsadS");
        setIntField(term18430, term18430.getClass(), "aime_id", 76929641);
        setField(term18430, term18430.getClass(), "aime_a_code", "mvfDtZNEHr");
        setField(term18430, term18430.getClass(), "key_obj_type", "bvSgmFUDOU");
        setBooleanField(term18430, term18430.getClass(), "exec_vu", false);
        setField(term18430, term18430.getClass(), "cmd", "XMHwbfiHRl");
        setField(term18430, term18430.getClass(), "req_id", "bucTnYicnp");
        setField(term18430, term18430.getClass(), "game_id", "EkgprvqZlM");
        setField(term18430, term18430.getClass(), "r_ver", "fbnKvthhOz");
        setField(term18430, term18430.getClass(), "kc_serial", "PGfCDJTBek");
        setField(term18430, term18430.getClass(), "b_serial", "ZwjARhAtHC");
        setField(term18430, term18430.getClass(), "place_id", "XXvscsYBWv");
        setIntField(term18603, term18603.getClass(), "year", 2024);
        setShortField(term18603, term18603.getClass(), "month", (short) 4);
        setShortField(term18603, term18603.getClass(), "day", (short) 24);
        setField(term18602, term18602.getClass(), "date", term18603);
        setByteField(term18607, term18607.getClass(), "hour", (byte) 7);
        setByteField(term18607, term18607.getClass(), "minute", (byte) 2);
        setByteField(term18607, term18607.getClass(), "second", (byte) 51);
        setIntField(term18607, term18607.getClass(), "nano", 635502964);
        setField(term18602, term18602.getClass(), "time", term18607);
        setField(term18601, term18601.getClass(), "dateTime", term18602);
        setIntField(term18612, term18612.getClass(), "totalSeconds", -10800);
        setField(term18612, term18612.getClass(), "id", "-03:00");
        setField(term18601, term18601.getClass(), "offset", term18612);
        setField(term18622, term18622.getClass(), "id", "America/Recife");
        setLongElement(term18640, 0, -1767217224L);
        setField(term18639, term18639.getClass(), "standardTransitions", term18640);
        setElement(term18642, 1, term18612);
        setField(term18639, term18639.getClass(), "standardOffsets", term18642);
        setLongElement(term18643, 0, -1767217224L);
        setLongElement(term18643, 1, -1206957600L);
        setLongElement(term18643, 2, -1191362400L);
        setLongElement(term18643, 3, -1175374800L);
        setLongElement(term18643, 4, -1159826400L);
        setLongElement(term18643, 5, -633819600L);
        setLongElement(term18643, 6, -622069200L);
        setLongElement(term18643, 7, -602283600L);
        setLongElement(term18643, 8, -591832800L);
        setLongElement(term18643, 9, -570747600L);
        setLongElement(term18643, 10, -560210400L);
        setLongElement(term18643, 11, -539125200L);
        setLongElement(term18643, 12, -531352800L);
        setLongElement(term18643, 13, -191365200L);
        setLongElement(term18643, 14, -184197600L);
        setLongElement(term18643, 15, -155163600L);
        setLongElement(term18643, 16, -150069600L);
        setLongElement(term18643, 17, -128898000L);
        setLongElement(term18643, 18, -121125600L);
        setLongElement(term18643, 19, -99954000L);
        setLongElement(term18643, 20, -89589600L);
        setLongElement(term18643, 21, -68418000L);
        setLongElement(term18643, 22, -57967200L);
        setLongElement(term18643, 23, 499748400L);
        setLongElement(term18643, 24, 511236000L);
        setLongElement(term18643, 25, 530593200L);
        setLongElement(term18643, 26, 540266400L);
        setLongElement(term18643, 27, 562129200L);
        setLongElement(term18643, 28, 571197600L);
        setLongElement(term18643, 29, 592974000L);
        setLongElement(term18643, 30, 602042400L);
        setLongElement(term18643, 31, 624423600L);
        setLongElement(term18643, 32, 634701600L);
        setLongElement(term18643, 33, 938919600L);
        setLongElement(term18643, 34, 951616800L);
        setLongElement(term18643, 35, 970974000L);
        setLongElement(term18643, 36, 971575200L);
        setLongElement(term18643, 37, 1003028400L);
        setLongElement(term18643, 38, 1013911200L);
        setField(term18639, term18639.getClass(), "savingsInstantTransitions", term18643);
        setField(term18639, term18639.getClass(), "savingsLocalTransitions", term18683);
        setElement(term18684, 1, term18612);
        setElement(term18684, 3, term18612);
        setElement(term18684, 5, term18612);
        setElement(term18684, 7, term18612);
        setElement(term18684, 9, term18612);
        setElement(term18684, 11, term18612);
        setElement(term18684, 13, term18612);
        setElement(term18684, 15, term18612);
        setElement(term18684, 17, term18612);
        setElement(term18684, 19, term18612);
        setElement(term18684, 21, term18612);
        setElement(term18684, 23, term18612);
        setElement(term18684, 25, term18612);
        setElement(term18684, 27, term18612);
        setElement(term18684, 29, term18612);
        setElement(term18684, 31, term18612);
        setElement(term18684, 33, term18612);
        setElement(term18684, 35, term18612);
        setElement(term18684, 37, term18612);
        setElement(term18684, 39, term18612);
        setField(term18639, term18639.getClass(), "wallOffsets", term18684);
        setField(term18639, term18639.getClass(), "lastRules", term18685);
        setField(term18686, term18686.getClass(), "table", null);
        setField(term18686, term18686.getClass(), "nextTable", null);
        setLongField(term18686, term18686.getClass(), "baseCount", 0L);
        setIntField(term18686, term18686.getClass(), "sizeCtl", 0);
        setIntField(term18686, term18686.getClass(), "transferIndex", 0);
        setIntField(term18686, term18686.getClass(), "cellsBusy", 0);
        setField(term18686, term18686.getClass(), "counterCells", null);
        setField(term18686, term18686.getClass(), "keySet", null);
        setField(term18686, term18686.getClass(), "values", null);
        setField(term18686, term18686.getClass(), "entrySet", null);
        setField(term18686, term18686.getClass(), "keySet", null);
        setField(term18686, term18686.getClass(), "values", null);
        setField(term18639, term18639.getClass(), "lastRulesCache", term18686);
        setField(term18622, term18622.getClass(), "rules", term18639);
        setField(term18601, term18601.getClass(), "zone", term18622);
        setField(term18430, term18430.getClass(), "time_stamp", term18601);
        setField(term18430, term18430.getClass(), "start_up_mode", "uePedtiAfL");
        setField(term18430, term18430.getClass(), "cmm_dly_mod", "AdSHvysxQB");
        setField(term18430, term18430.getClass(), "cmm_dly_sec", "jlraKkBWFA");
        setField(term18430, term18430.getClass(), "cmm_err_mod", "mRBtFTxVdE");
        setField(term18430, term18430.getClass(), "country_code", "IVacFDAZcj");
        setField(term18430, term18430.getClass(), "region_code", "EEYmuwyVDP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EWFbEDAVrE";
        callMethod(klass, "setAime_a_code", argTypes, term18430, args);
    }

};


