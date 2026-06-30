package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FestaInfoHandler_handle_12563480350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3522;

    public FestaInfoHandler_handle_12563480350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3522 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term3607 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term3608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3613 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3618 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3628 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term3645 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term3646 = (long[]) newLongArray(1);
        Object[] term3648 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term3649 = (long[]) newLongArray(39);
        Object[] term3689 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term3690 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term3691 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term3692 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3522, term3522.getClass(), "cmd", "QXzGXbEXMu");
        setField(term3522, term3522.getClass(), "req_id", "qxSDVejjiY");
        setField(term3522, term3522.getClass(), "game_id", "xBsXSDjXYK");
        setField(term3522, term3522.getClass(), "r_ver", "sEnIVFtZuQ");
        setField(term3522, term3522.getClass(), "kc_serial", "ZVecLZMLHF");
        setField(term3522, term3522.getClass(), "b_serial", "fztQhjqwdP");
        setField(term3522, term3522.getClass(), "place_id", "eVpkWxjuki");
        setIntField(term3609, term3609.getClass(), "year", 2029);
        setShortField(term3609, term3609.getClass(), "month", (short) 8);
        setShortField(term3609, term3609.getClass(), "day", (short) 29);
        setField(term3608, term3608.getClass(), "date", term3609);
        setByteField(term3613, term3613.getClass(), "hour", (byte) 15);
        setByteField(term3613, term3613.getClass(), "minute", (byte) 50);
        setByteField(term3613, term3613.getClass(), "second", (byte) 1);
        setIntField(term3613, term3613.getClass(), "nano", 277971904);
        setField(term3608, term3608.getClass(), "time", term3613);
        setField(term3607, term3607.getClass(), "dateTime", term3608);
        setIntField(term3618, term3618.getClass(), "totalSeconds", -10800);
        setField(term3618, term3618.getClass(), "id", "-03:00");
        setField(term3607, term3607.getClass(), "offset", term3618);
        setField(term3628, term3628.getClass(), "id", "America/Recife");
        setLongElement(term3646, 0, -1767217224L);
        setField(term3645, term3645.getClass(), "standardTransitions", term3646);
        setElement(term3648, 1, term3618);
        setField(term3645, term3645.getClass(), "standardOffsets", term3648);
        setLongElement(term3649, 0, -1767217224L);
        setLongElement(term3649, 1, -1206957600L);
        setLongElement(term3649, 2, -1191362400L);
        setLongElement(term3649, 3, -1175374800L);
        setLongElement(term3649, 4, -1159826400L);
        setLongElement(term3649, 5, -633819600L);
        setLongElement(term3649, 6, -622069200L);
        setLongElement(term3649, 7, -602283600L);
        setLongElement(term3649, 8, -591832800L);
        setLongElement(term3649, 9, -570747600L);
        setLongElement(term3649, 10, -560210400L);
        setLongElement(term3649, 11, -539125200L);
        setLongElement(term3649, 12, -531352800L);
        setLongElement(term3649, 13, -191365200L);
        setLongElement(term3649, 14, -184197600L);
        setLongElement(term3649, 15, -155163600L);
        setLongElement(term3649, 16, -150069600L);
        setLongElement(term3649, 17, -128898000L);
        setLongElement(term3649, 18, -121125600L);
        setLongElement(term3649, 19, -99954000L);
        setLongElement(term3649, 20, -89589600L);
        setLongElement(term3649, 21, -68418000L);
        setLongElement(term3649, 22, -57967200L);
        setLongElement(term3649, 23, 499748400L);
        setLongElement(term3649, 24, 511236000L);
        setLongElement(term3649, 25, 530593200L);
        setLongElement(term3649, 26, 540266400L);
        setLongElement(term3649, 27, 562129200L);
        setLongElement(term3649, 28, 571197600L);
        setLongElement(term3649, 29, 592974000L);
        setLongElement(term3649, 30, 602042400L);
        setLongElement(term3649, 31, 624423600L);
        setLongElement(term3649, 32, 634701600L);
        setLongElement(term3649, 33, 938919600L);
        setLongElement(term3649, 34, 951616800L);
        setLongElement(term3649, 35, 970974000L);
        setLongElement(term3649, 36, 971575200L);
        setLongElement(term3649, 37, 1003028400L);
        setLongElement(term3649, 38, 1013911200L);
        setField(term3645, term3645.getClass(), "savingsInstantTransitions", term3649);
        setField(term3645, term3645.getClass(), "savingsLocalTransitions", term3689);
        setElement(term3690, 1, term3618);
        setElement(term3690, 3, term3618);
        setElement(term3690, 5, term3618);
        setElement(term3690, 7, term3618);
        setElement(term3690, 9, term3618);
        setElement(term3690, 11, term3618);
        setElement(term3690, 13, term3618);
        setElement(term3690, 15, term3618);
        setElement(term3690, 17, term3618);
        setElement(term3690, 19, term3618);
        setElement(term3690, 21, term3618);
        setElement(term3690, 23, term3618);
        setElement(term3690, 25, term3618);
        setElement(term3690, 27, term3618);
        setElement(term3690, 29, term3618);
        setElement(term3690, 31, term3618);
        setElement(term3690, 33, term3618);
        setElement(term3690, 35, term3618);
        setElement(term3690, 37, term3618);
        setElement(term3690, 39, term3618);
        setField(term3645, term3645.getClass(), "wallOffsets", term3690);
        setField(term3645, term3645.getClass(), "lastRules", term3691);
        setField(term3692, term3692.getClass(), "table", null);
        setField(term3692, term3692.getClass(), "nextTable", null);
        setLongField(term3692, term3692.getClass(), "baseCount", 0L);
        setIntField(term3692, term3692.getClass(), "sizeCtl", 0);
        setIntField(term3692, term3692.getClass(), "transferIndex", 0);
        setIntField(term3692, term3692.getClass(), "cellsBusy", 0);
        setField(term3692, term3692.getClass(), "counterCells", null);
        setField(term3692, term3692.getClass(), "keySet", null);
        setField(term3692, term3692.getClass(), "values", null);
        setField(term3692, term3692.getClass(), "entrySet", null);
        setField(term3692, term3692.getClass(), "keySet", null);
        setField(term3692, term3692.getClass(), "values", null);
        setField(term3645, term3645.getClass(), "lastRulesCache", term3692);
        setField(term3628, term3628.getClass(), "rules", term3645);
        setField(term3607, term3607.getClass(), "zone", term3628);
        setField(term3522, term3522.getClass(), "time_stamp", term3607);
        setField(term3522, term3522.getClass(), "start_up_mode", "SJiQaLvSKv");
        setField(term3522, term3522.getClass(), "cmm_dly_mod", "OEXDRUKcFl");
        setField(term3522, term3522.getClass(), "cmm_dly_sec", "RYdKCNNMBR");
        setField(term3522, term3522.getClass(), "cmm_err_mod", "yGtHPyvYiQ");
        setField(term3522, term3522.getClass(), "country_code", "MvRIxilFMJ");
        setField(term3522, term3522.getClass(), "region_code", "iNwOJRBEjp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.FestaInfoHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term3522;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


