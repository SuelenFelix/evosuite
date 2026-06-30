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

public class RegistrationRequest_getPmm_13162988180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6277;

    public RegistrationRequest_getPmm_13162988180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6277 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term6471 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term6472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6477 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6482 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term6492 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term6509 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term6510 = (long[]) newLongArray(1);
        Object[] term6512 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term6513 = (long[]) newLongArray(39);
        Object[] term6553 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term6554 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term6555 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term6556 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term6277, term6277.getClass(), "pmm", "XJJNClzHRf");
        setField(term6277, term6277.getClass(), "idm", "HDaezxQfQR");
        setField(term6277, term6277.getClass(), "mmgameid", "iikZEapDlu");
        setField(term6277, term6277.getClass(), "mmuid", "nhoHrZfnIN");
        setField(term6277, term6277.getClass(), "a_code", "ZkMALXpEAZ");
        setIntField(term6277, term6277.getClass(), "aime_id", -602026508);
        setField(term6277, term6277.getClass(), "aime_a_code", "tXfQjSqDzN");
        setField(term6277, term6277.getClass(), "key_obj_type", "BjugTaMcxJ");
        setField(term6277, term6277.getClass(), "player_name", "vGiuZVPJNH");
        setField(term6277, term6277.getClass(), "passwd", "tlzpzIjMib");
        setField(term6277, term6277.getClass(), "cmd", "AZdLeSugwv");
        setField(term6277, term6277.getClass(), "req_id", "RMsXuyzKJV");
        setField(term6277, term6277.getClass(), "game_id", "FwPbDZcHmB");
        setField(term6277, term6277.getClass(), "r_ver", "hOncybyCAH");
        setField(term6277, term6277.getClass(), "kc_serial", "QduALnDSVo");
        setField(term6277, term6277.getClass(), "b_serial", "izPpKDErnQ");
        setField(term6277, term6277.getClass(), "place_id", "NnpwZBUTvx");
        setIntField(term6473, term6473.getClass(), "year", 2012);
        setShortField(term6473, term6473.getClass(), "month", (short) 9);
        setShortField(term6473, term6473.getClass(), "day", (short) 11);
        setField(term6472, term6472.getClass(), "date", term6473);
        setByteField(term6477, term6477.getClass(), "hour", (byte) 22);
        setByteField(term6477, term6477.getClass(), "minute", (byte) 10);
        setByteField(term6477, term6477.getClass(), "second", (byte) 8);
        setIntField(term6477, term6477.getClass(), "nano", 380008862);
        setField(term6472, term6472.getClass(), "time", term6477);
        setField(term6471, term6471.getClass(), "dateTime", term6472);
        setIntField(term6482, term6482.getClass(), "totalSeconds", -10800);
        setField(term6482, term6482.getClass(), "id", "-03:00");
        setField(term6471, term6471.getClass(), "offset", term6482);
        setField(term6492, term6492.getClass(), "id", "America/Recife");
        setLongElement(term6510, 0, -1767217224L);
        setField(term6509, term6509.getClass(), "standardTransitions", term6510);
        setElement(term6512, 1, term6482);
        setField(term6509, term6509.getClass(), "standardOffsets", term6512);
        setLongElement(term6513, 0, -1767217224L);
        setLongElement(term6513, 1, -1206957600L);
        setLongElement(term6513, 2, -1191362400L);
        setLongElement(term6513, 3, -1175374800L);
        setLongElement(term6513, 4, -1159826400L);
        setLongElement(term6513, 5, -633819600L);
        setLongElement(term6513, 6, -622069200L);
        setLongElement(term6513, 7, -602283600L);
        setLongElement(term6513, 8, -591832800L);
        setLongElement(term6513, 9, -570747600L);
        setLongElement(term6513, 10, -560210400L);
        setLongElement(term6513, 11, -539125200L);
        setLongElement(term6513, 12, -531352800L);
        setLongElement(term6513, 13, -191365200L);
        setLongElement(term6513, 14, -184197600L);
        setLongElement(term6513, 15, -155163600L);
        setLongElement(term6513, 16, -150069600L);
        setLongElement(term6513, 17, -128898000L);
        setLongElement(term6513, 18, -121125600L);
        setLongElement(term6513, 19, -99954000L);
        setLongElement(term6513, 20, -89589600L);
        setLongElement(term6513, 21, -68418000L);
        setLongElement(term6513, 22, -57967200L);
        setLongElement(term6513, 23, 499748400L);
        setLongElement(term6513, 24, 511236000L);
        setLongElement(term6513, 25, 530593200L);
        setLongElement(term6513, 26, 540266400L);
        setLongElement(term6513, 27, 562129200L);
        setLongElement(term6513, 28, 571197600L);
        setLongElement(term6513, 29, 592974000L);
        setLongElement(term6513, 30, 602042400L);
        setLongElement(term6513, 31, 624423600L);
        setLongElement(term6513, 32, 634701600L);
        setLongElement(term6513, 33, 938919600L);
        setLongElement(term6513, 34, 951616800L);
        setLongElement(term6513, 35, 970974000L);
        setLongElement(term6513, 36, 971575200L);
        setLongElement(term6513, 37, 1003028400L);
        setLongElement(term6513, 38, 1013911200L);
        setField(term6509, term6509.getClass(), "savingsInstantTransitions", term6513);
        setField(term6509, term6509.getClass(), "savingsLocalTransitions", term6553);
        setElement(term6554, 1, term6482);
        setElement(term6554, 3, term6482);
        setElement(term6554, 5, term6482);
        setElement(term6554, 7, term6482);
        setElement(term6554, 9, term6482);
        setElement(term6554, 11, term6482);
        setElement(term6554, 13, term6482);
        setElement(term6554, 15, term6482);
        setElement(term6554, 17, term6482);
        setElement(term6554, 19, term6482);
        setElement(term6554, 21, term6482);
        setElement(term6554, 23, term6482);
        setElement(term6554, 25, term6482);
        setElement(term6554, 27, term6482);
        setElement(term6554, 29, term6482);
        setElement(term6554, 31, term6482);
        setElement(term6554, 33, term6482);
        setElement(term6554, 35, term6482);
        setElement(term6554, 37, term6482);
        setElement(term6554, 39, term6482);
        setField(term6509, term6509.getClass(), "wallOffsets", term6554);
        setField(term6509, term6509.getClass(), "lastRules", term6555);
        setField(term6556, term6556.getClass(), "table", null);
        setField(term6556, term6556.getClass(), "nextTable", null);
        setLongField(term6556, term6556.getClass(), "baseCount", 0L);
        setIntField(term6556, term6556.getClass(), "sizeCtl", 0);
        setIntField(term6556, term6556.getClass(), "transferIndex", 0);
        setIntField(term6556, term6556.getClass(), "cellsBusy", 0);
        setField(term6556, term6556.getClass(), "counterCells", null);
        setField(term6556, term6556.getClass(), "keySet", null);
        setField(term6556, term6556.getClass(), "values", null);
        setField(term6556, term6556.getClass(), "entrySet", null);
        setField(term6556, term6556.getClass(), "keySet", null);
        setField(term6556, term6556.getClass(), "values", null);
        setField(term6509, term6509.getClass(), "lastRulesCache", term6556);
        setField(term6492, term6492.getClass(), "rules", term6509);
        setField(term6471, term6471.getClass(), "zone", term6492);
        setField(term6277, term6277.getClass(), "time_stamp", term6471);
        setField(term6277, term6277.getClass(), "start_up_mode", "tlQSNgTkQX");
        setField(term6277, term6277.getClass(), "cmm_dly_mod", "PCipZnmBOF");
        setField(term6277, term6277.getClass(), "cmm_dly_sec", "zcorEihhLK");
        setField(term6277, term6277.getClass(), "cmm_err_mod", "GrqozDKFOk");
        setField(term6277, term6277.getClass(), "country_code", "CFyoseFGLF");
        setField(term6277, term6277.getClass(), "region_code", "SFqCrhEWLm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPmm", argTypes, term6277, args);
    }

};


