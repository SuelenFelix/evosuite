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

public class RegistrationRequest_getAimeid_11871699815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9457;

    public RegistrationRequest_getAimeid_11871699815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9457 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term9651 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term9652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9662 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term9672 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term9689 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term9690 = (long[]) newLongArray(1);
        Object[] term9692 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term9693 = (long[]) newLongArray(39);
        Object[] term9733 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term9734 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term9735 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term9736 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term9457, term9457.getClass(), "pmm", "NTWMiBEaDF");
        setField(term9457, term9457.getClass(), "idm", "SPBstwKFVr");
        setField(term9457, term9457.getClass(), "mmgameid", "WxYUTuqmIq");
        setField(term9457, term9457.getClass(), "mmuid", "OeQLvhVERT");
        setField(term9457, term9457.getClass(), "a_code", "IlvgFINwIa");
        setIntField(term9457, term9457.getClass(), "aime_id", -1968847291);
        setField(term9457, term9457.getClass(), "aime_a_code", "GEJABPlHSI");
        setField(term9457, term9457.getClass(), "key_obj_type", "aQFUvuaYxd");
        setField(term9457, term9457.getClass(), "player_name", "zNFLXMifnS");
        setField(term9457, term9457.getClass(), "passwd", "HHQcYMSBVc");
        setField(term9457, term9457.getClass(), "cmd", "wdoqITnaAP");
        setField(term9457, term9457.getClass(), "req_id", "rIPMBcrNqB");
        setField(term9457, term9457.getClass(), "game_id", "UDaboHZHhz");
        setField(term9457, term9457.getClass(), "r_ver", "nRvKihUSPj");
        setField(term9457, term9457.getClass(), "kc_serial", "BbNeQJpYPr");
        setField(term9457, term9457.getClass(), "b_serial", "riMtzCoxNj");
        setField(term9457, term9457.getClass(), "place_id", "YAXkVjQZcV");
        setIntField(term9653, term9653.getClass(), "year", 2029);
        setShortField(term9653, term9653.getClass(), "month", (short) 6);
        setShortField(term9653, term9653.getClass(), "day", (short) 23);
        setField(term9652, term9652.getClass(), "date", term9653);
        setByteField(term9657, term9657.getClass(), "hour", (byte) 21);
        setByteField(term9657, term9657.getClass(), "minute", (byte) 55);
        setByteField(term9657, term9657.getClass(), "second", (byte) 27);
        setIntField(term9657, term9657.getClass(), "nano", 66889274);
        setField(term9652, term9652.getClass(), "time", term9657);
        setField(term9651, term9651.getClass(), "dateTime", term9652);
        setIntField(term9662, term9662.getClass(), "totalSeconds", -10800);
        setField(term9662, term9662.getClass(), "id", "-03:00");
        setField(term9651, term9651.getClass(), "offset", term9662);
        setField(term9672, term9672.getClass(), "id", "America/Recife");
        setLongElement(term9690, 0, -1767217224L);
        setField(term9689, term9689.getClass(), "standardTransitions", term9690);
        setElement(term9692, 1, term9662);
        setField(term9689, term9689.getClass(), "standardOffsets", term9692);
        setLongElement(term9693, 0, -1767217224L);
        setLongElement(term9693, 1, -1206957600L);
        setLongElement(term9693, 2, -1191362400L);
        setLongElement(term9693, 3, -1175374800L);
        setLongElement(term9693, 4, -1159826400L);
        setLongElement(term9693, 5, -633819600L);
        setLongElement(term9693, 6, -622069200L);
        setLongElement(term9693, 7, -602283600L);
        setLongElement(term9693, 8, -591832800L);
        setLongElement(term9693, 9, -570747600L);
        setLongElement(term9693, 10, -560210400L);
        setLongElement(term9693, 11, -539125200L);
        setLongElement(term9693, 12, -531352800L);
        setLongElement(term9693, 13, -191365200L);
        setLongElement(term9693, 14, -184197600L);
        setLongElement(term9693, 15, -155163600L);
        setLongElement(term9693, 16, -150069600L);
        setLongElement(term9693, 17, -128898000L);
        setLongElement(term9693, 18, -121125600L);
        setLongElement(term9693, 19, -99954000L);
        setLongElement(term9693, 20, -89589600L);
        setLongElement(term9693, 21, -68418000L);
        setLongElement(term9693, 22, -57967200L);
        setLongElement(term9693, 23, 499748400L);
        setLongElement(term9693, 24, 511236000L);
        setLongElement(term9693, 25, 530593200L);
        setLongElement(term9693, 26, 540266400L);
        setLongElement(term9693, 27, 562129200L);
        setLongElement(term9693, 28, 571197600L);
        setLongElement(term9693, 29, 592974000L);
        setLongElement(term9693, 30, 602042400L);
        setLongElement(term9693, 31, 624423600L);
        setLongElement(term9693, 32, 634701600L);
        setLongElement(term9693, 33, 938919600L);
        setLongElement(term9693, 34, 951616800L);
        setLongElement(term9693, 35, 970974000L);
        setLongElement(term9693, 36, 971575200L);
        setLongElement(term9693, 37, 1003028400L);
        setLongElement(term9693, 38, 1013911200L);
        setField(term9689, term9689.getClass(), "savingsInstantTransitions", term9693);
        setField(term9689, term9689.getClass(), "savingsLocalTransitions", term9733);
        setElement(term9734, 1, term9662);
        setElement(term9734, 3, term9662);
        setElement(term9734, 5, term9662);
        setElement(term9734, 7, term9662);
        setElement(term9734, 9, term9662);
        setElement(term9734, 11, term9662);
        setElement(term9734, 13, term9662);
        setElement(term9734, 15, term9662);
        setElement(term9734, 17, term9662);
        setElement(term9734, 19, term9662);
        setElement(term9734, 21, term9662);
        setElement(term9734, 23, term9662);
        setElement(term9734, 25, term9662);
        setElement(term9734, 27, term9662);
        setElement(term9734, 29, term9662);
        setElement(term9734, 31, term9662);
        setElement(term9734, 33, term9662);
        setElement(term9734, 35, term9662);
        setElement(term9734, 37, term9662);
        setElement(term9734, 39, term9662);
        setField(term9689, term9689.getClass(), "wallOffsets", term9734);
        setField(term9689, term9689.getClass(), "lastRules", term9735);
        setField(term9736, term9736.getClass(), "table", null);
        setField(term9736, term9736.getClass(), "nextTable", null);
        setLongField(term9736, term9736.getClass(), "baseCount", 0L);
        setIntField(term9736, term9736.getClass(), "sizeCtl", 0);
        setIntField(term9736, term9736.getClass(), "transferIndex", 0);
        setIntField(term9736, term9736.getClass(), "cellsBusy", 0);
        setField(term9736, term9736.getClass(), "counterCells", null);
        setField(term9736, term9736.getClass(), "keySet", null);
        setField(term9736, term9736.getClass(), "values", null);
        setField(term9736, term9736.getClass(), "entrySet", null);
        setField(term9736, term9736.getClass(), "keySet", null);
        setField(term9736, term9736.getClass(), "values", null);
        setField(term9689, term9689.getClass(), "lastRulesCache", term9736);
        setField(term9672, term9672.getClass(), "rules", term9689);
        setField(term9651, term9651.getClass(), "zone", term9672);
        setField(term9457, term9457.getClass(), "time_stamp", term9651);
        setField(term9457, term9457.getClass(), "start_up_mode", "pumvwBWvpy");
        setField(term9457, term9457.getClass(), "cmm_dly_mod", "HwLHeGLyhe");
        setField(term9457, term9457.getClass(), "cmm_dly_sec", "RDnkgWkcbz");
        setField(term9457, term9457.getClass(), "cmm_err_mod", "IBpaxltauX");
        setField(term9457, term9457.getClass(), "country_code", "hePqROaplw");
        setField(term9457, term9457.getClass(), "region_code", "PJcSNDruWd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_id", argTypes, term9457, args);
    }

};


