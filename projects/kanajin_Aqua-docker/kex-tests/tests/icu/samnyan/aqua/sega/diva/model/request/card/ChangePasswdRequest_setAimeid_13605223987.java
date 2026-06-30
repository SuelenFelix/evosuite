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

public class ChangePasswdRequest_setAimeid_13605223987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3565;
     Object term3851;

    public ChangePasswdRequest_setAimeid_13605223987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3565 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term3689 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term3690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3695 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3700 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3710 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term3727 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term3728 = (long[]) newLongArray(1);
        Object[] term3730 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term3731 = (long[]) newLongArray(39);
        Object[] term3771 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term3772 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term3773 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term3774 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3565, term3565.getClass(), "a_code", "RYdKCNNMBR");
        setIntField(term3565, term3565.getClass(), "aime_id", -6029667);
        setField(term3565, term3565.getClass(), "aime_a_code", "yGtHPyvYiQ");
        setIntField(term3565, term3565.getClass(), "pd_id", -2068769794);
        setIntField(term3565, term3565.getClass(), "accept_idx", -117576464);
        setField(term3565, term3565.getClass(), "new_passwd", "MvRIxilFMJ");
        setField(term3565, term3565.getClass(), "cmd", "iNwOJRBEjp");
        setField(term3565, term3565.getClass(), "req_id", "XylxrMBraH");
        setField(term3565, term3565.getClass(), "game_id", "pORebkoRdD");
        setField(term3565, term3565.getClass(), "r_ver", "mXGCWJDOqA");
        setField(term3565, term3565.getClass(), "kc_serial", "dpNsDgfPso");
        setField(term3565, term3565.getClass(), "b_serial", "hCWPJQKpdc");
        setField(term3565, term3565.getClass(), "place_id", "WzMEhMXkKx");
        setIntField(term3691, term3691.getClass(), "year", 2024);
        setShortField(term3691, term3691.getClass(), "month", (short) 1);
        setShortField(term3691, term3691.getClass(), "day", (short) 24);
        setField(term3690, term3690.getClass(), "date", term3691);
        setByteField(term3695, term3695.getClass(), "hour", (byte) 20);
        setByteField(term3695, term3695.getClass(), "minute", (byte) 28);
        setByteField(term3695, term3695.getClass(), "second", (byte) 39);
        setIntField(term3695, term3695.getClass(), "nano", 952728177);
        setField(term3690, term3690.getClass(), "time", term3695);
        setField(term3689, term3689.getClass(), "dateTime", term3690);
        setIntField(term3700, term3700.getClass(), "totalSeconds", -10800);
        setField(term3700, term3700.getClass(), "id", "-03:00");
        setField(term3689, term3689.getClass(), "offset", term3700);
        setField(term3710, term3710.getClass(), "id", "America/Recife");
        setLongElement(term3728, 0, -1767217224L);
        setField(term3727, term3727.getClass(), "standardTransitions", term3728);
        setElement(term3730, 1, term3700);
        setField(term3727, term3727.getClass(), "standardOffsets", term3730);
        setLongElement(term3731, 0, -1767217224L);
        setLongElement(term3731, 1, -1206957600L);
        setLongElement(term3731, 2, -1191362400L);
        setLongElement(term3731, 3, -1175374800L);
        setLongElement(term3731, 4, -1159826400L);
        setLongElement(term3731, 5, -633819600L);
        setLongElement(term3731, 6, -622069200L);
        setLongElement(term3731, 7, -602283600L);
        setLongElement(term3731, 8, -591832800L);
        setLongElement(term3731, 9, -570747600L);
        setLongElement(term3731, 10, -560210400L);
        setLongElement(term3731, 11, -539125200L);
        setLongElement(term3731, 12, -531352800L);
        setLongElement(term3731, 13, -191365200L);
        setLongElement(term3731, 14, -184197600L);
        setLongElement(term3731, 15, -155163600L);
        setLongElement(term3731, 16, -150069600L);
        setLongElement(term3731, 17, -128898000L);
        setLongElement(term3731, 18, -121125600L);
        setLongElement(term3731, 19, -99954000L);
        setLongElement(term3731, 20, -89589600L);
        setLongElement(term3731, 21, -68418000L);
        setLongElement(term3731, 22, -57967200L);
        setLongElement(term3731, 23, 499748400L);
        setLongElement(term3731, 24, 511236000L);
        setLongElement(term3731, 25, 530593200L);
        setLongElement(term3731, 26, 540266400L);
        setLongElement(term3731, 27, 562129200L);
        setLongElement(term3731, 28, 571197600L);
        setLongElement(term3731, 29, 592974000L);
        setLongElement(term3731, 30, 602042400L);
        setLongElement(term3731, 31, 624423600L);
        setLongElement(term3731, 32, 634701600L);
        setLongElement(term3731, 33, 938919600L);
        setLongElement(term3731, 34, 951616800L);
        setLongElement(term3731, 35, 970974000L);
        setLongElement(term3731, 36, 971575200L);
        setLongElement(term3731, 37, 1003028400L);
        setLongElement(term3731, 38, 1013911200L);
        setField(term3727, term3727.getClass(), "savingsInstantTransitions", term3731);
        setField(term3727, term3727.getClass(), "savingsLocalTransitions", term3771);
        setElement(term3772, 1, term3700);
        setElement(term3772, 3, term3700);
        setElement(term3772, 5, term3700);
        setElement(term3772, 7, term3700);
        setElement(term3772, 9, term3700);
        setElement(term3772, 11, term3700);
        setElement(term3772, 13, term3700);
        setElement(term3772, 15, term3700);
        setElement(term3772, 17, term3700);
        setElement(term3772, 19, term3700);
        setElement(term3772, 21, term3700);
        setElement(term3772, 23, term3700);
        setElement(term3772, 25, term3700);
        setElement(term3772, 27, term3700);
        setElement(term3772, 29, term3700);
        setElement(term3772, 31, term3700);
        setElement(term3772, 33, term3700);
        setElement(term3772, 35, term3700);
        setElement(term3772, 37, term3700);
        setElement(term3772, 39, term3700);
        setField(term3727, term3727.getClass(), "wallOffsets", term3772);
        setField(term3727, term3727.getClass(), "lastRules", term3773);
        setField(term3774, term3774.getClass(), "table", null);
        setField(term3774, term3774.getClass(), "nextTable", null);
        setLongField(term3774, term3774.getClass(), "baseCount", 0L);
        setIntField(term3774, term3774.getClass(), "sizeCtl", 0);
        setIntField(term3774, term3774.getClass(), "transferIndex", 0);
        setIntField(term3774, term3774.getClass(), "cellsBusy", 0);
        setField(term3774, term3774.getClass(), "counterCells", null);
        setField(term3774, term3774.getClass(), "keySet", null);
        setField(term3774, term3774.getClass(), "values", null);
        setField(term3774, term3774.getClass(), "entrySet", null);
        setField(term3774, term3774.getClass(), "keySet", null);
        setField(term3774, term3774.getClass(), "values", null);
        setField(term3727, term3727.getClass(), "lastRulesCache", term3774);
        setField(term3710, term3710.getClass(), "rules", term3727);
        setField(term3689, term3689.getClass(), "zone", term3710);
        setField(term3565, term3565.getClass(), "time_stamp", term3689);
        setField(term3565, term3565.getClass(), "start_up_mode", "XOiDvlDhdc");
        setField(term3565, term3565.getClass(), "cmm_dly_mod", "AdxvLJhNLe");
        setField(term3565, term3565.getClass(), "cmm_dly_sec", "lHfTrWKMPk");
        setField(term3565, term3565.getClass(), "cmm_err_mod", "JDaAnsVTGV");
        setField(term3565, term3565.getClass(), "country_code", "mLUZFTfjle");
        setField(term3565, term3565.getClass(), "region_code", "xIeFjkHkOe");
        term3851 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3851;
        callMethod(klass, "setAime_id", argTypes, term3565, args);
    }

};


