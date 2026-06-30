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

public class ChangePasswdRequest_setNewpasswd_92517164411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5617;

    public ChangePasswdRequest_setNewpasswd_92517164411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5617 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term5741 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term5742 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5743 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5747 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5752 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term5762 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term5779 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term5780 = (long[]) newLongArray(1);
        Object[] term5782 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term5783 = (long[]) newLongArray(39);
        Object[] term5823 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term5824 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term5825 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term5826 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term5617, term5617.getClass(), "a_code", "jXzmYyrnnT");
        setIntField(term5617, term5617.getClass(), "aime_id", -1530420153);
        setField(term5617, term5617.getClass(), "aime_a_code", "igCAtimmYB");
        setIntField(term5617, term5617.getClass(), "pd_id", -469968304);
        setIntField(term5617, term5617.getClass(), "accept_idx", -1145578966);
        setField(term5617, term5617.getClass(), "new_passwd", "DyiXbeYIaN");
        setField(term5617, term5617.getClass(), "cmd", "VGizxZnyHX");
        setField(term5617, term5617.getClass(), "req_id", "kVEZMHmRtR");
        setField(term5617, term5617.getClass(), "game_id", "ekxGuOYIwi");
        setField(term5617, term5617.getClass(), "r_ver", "RbVQXSpxXy");
        setField(term5617, term5617.getClass(), "kc_serial", "YpJbIgJWWv");
        setField(term5617, term5617.getClass(), "b_serial", "JppkknKVOw");
        setField(term5617, term5617.getClass(), "place_id", "iljANwuEjk");
        setIntField(term5743, term5743.getClass(), "year", 2018);
        setShortField(term5743, term5743.getClass(), "month", (short) 9);
        setShortField(term5743, term5743.getClass(), "day", (short) 28);
        setField(term5742, term5742.getClass(), "date", term5743);
        setByteField(term5747, term5747.getClass(), "hour", (byte) 3);
        setByteField(term5747, term5747.getClass(), "minute", (byte) 37);
        setByteField(term5747, term5747.getClass(), "second", (byte) 46);
        setIntField(term5747, term5747.getClass(), "nano", 763326845);
        setField(term5742, term5742.getClass(), "time", term5747);
        setField(term5741, term5741.getClass(), "dateTime", term5742);
        setIntField(term5752, term5752.getClass(), "totalSeconds", -10800);
        setField(term5752, term5752.getClass(), "id", "-03:00");
        setField(term5741, term5741.getClass(), "offset", term5752);
        setField(term5762, term5762.getClass(), "id", "America/Recife");
        setLongElement(term5780, 0, -1767217224L);
        setField(term5779, term5779.getClass(), "standardTransitions", term5780);
        setElement(term5782, 1, term5752);
        setField(term5779, term5779.getClass(), "standardOffsets", term5782);
        setLongElement(term5783, 0, -1767217224L);
        setLongElement(term5783, 1, -1206957600L);
        setLongElement(term5783, 2, -1191362400L);
        setLongElement(term5783, 3, -1175374800L);
        setLongElement(term5783, 4, -1159826400L);
        setLongElement(term5783, 5, -633819600L);
        setLongElement(term5783, 6, -622069200L);
        setLongElement(term5783, 7, -602283600L);
        setLongElement(term5783, 8, -591832800L);
        setLongElement(term5783, 9, -570747600L);
        setLongElement(term5783, 10, -560210400L);
        setLongElement(term5783, 11, -539125200L);
        setLongElement(term5783, 12, -531352800L);
        setLongElement(term5783, 13, -191365200L);
        setLongElement(term5783, 14, -184197600L);
        setLongElement(term5783, 15, -155163600L);
        setLongElement(term5783, 16, -150069600L);
        setLongElement(term5783, 17, -128898000L);
        setLongElement(term5783, 18, -121125600L);
        setLongElement(term5783, 19, -99954000L);
        setLongElement(term5783, 20, -89589600L);
        setLongElement(term5783, 21, -68418000L);
        setLongElement(term5783, 22, -57967200L);
        setLongElement(term5783, 23, 499748400L);
        setLongElement(term5783, 24, 511236000L);
        setLongElement(term5783, 25, 530593200L);
        setLongElement(term5783, 26, 540266400L);
        setLongElement(term5783, 27, 562129200L);
        setLongElement(term5783, 28, 571197600L);
        setLongElement(term5783, 29, 592974000L);
        setLongElement(term5783, 30, 602042400L);
        setLongElement(term5783, 31, 624423600L);
        setLongElement(term5783, 32, 634701600L);
        setLongElement(term5783, 33, 938919600L);
        setLongElement(term5783, 34, 951616800L);
        setLongElement(term5783, 35, 970974000L);
        setLongElement(term5783, 36, 971575200L);
        setLongElement(term5783, 37, 1003028400L);
        setLongElement(term5783, 38, 1013911200L);
        setField(term5779, term5779.getClass(), "savingsInstantTransitions", term5783);
        setField(term5779, term5779.getClass(), "savingsLocalTransitions", term5823);
        setElement(term5824, 1, term5752);
        setElement(term5824, 3, term5752);
        setElement(term5824, 5, term5752);
        setElement(term5824, 7, term5752);
        setElement(term5824, 9, term5752);
        setElement(term5824, 11, term5752);
        setElement(term5824, 13, term5752);
        setElement(term5824, 15, term5752);
        setElement(term5824, 17, term5752);
        setElement(term5824, 19, term5752);
        setElement(term5824, 21, term5752);
        setElement(term5824, 23, term5752);
        setElement(term5824, 25, term5752);
        setElement(term5824, 27, term5752);
        setElement(term5824, 29, term5752);
        setElement(term5824, 31, term5752);
        setElement(term5824, 33, term5752);
        setElement(term5824, 35, term5752);
        setElement(term5824, 37, term5752);
        setElement(term5824, 39, term5752);
        setField(term5779, term5779.getClass(), "wallOffsets", term5824);
        setField(term5779, term5779.getClass(), "lastRules", term5825);
        setField(term5826, term5826.getClass(), "table", null);
        setField(term5826, term5826.getClass(), "nextTable", null);
        setLongField(term5826, term5826.getClass(), "baseCount", 0L);
        setIntField(term5826, term5826.getClass(), "sizeCtl", 0);
        setIntField(term5826, term5826.getClass(), "transferIndex", 0);
        setIntField(term5826, term5826.getClass(), "cellsBusy", 0);
        setField(term5826, term5826.getClass(), "counterCells", null);
        setField(term5826, term5826.getClass(), "keySet", null);
        setField(term5826, term5826.getClass(), "values", null);
        setField(term5826, term5826.getClass(), "entrySet", null);
        setField(term5826, term5826.getClass(), "keySet", null);
        setField(term5826, term5826.getClass(), "values", null);
        setField(term5779, term5779.getClass(), "lastRulesCache", term5826);
        setField(term5762, term5762.getClass(), "rules", term5779);
        setField(term5741, term5741.getClass(), "zone", term5762);
        setField(term5617, term5617.getClass(), "time_stamp", term5741);
        setField(term5617, term5617.getClass(), "start_up_mode", "kNqaJKIATy");
        setField(term5617, term5617.getClass(), "cmm_dly_mod", "vKQukfbJUd");
        setField(term5617, term5617.getClass(), "cmm_dly_sec", "lFRJFUMVbx");
        setField(term5617, term5617.getClass(), "cmm_err_mod", "sZdUNdggUW");
        setField(term5617, term5617.getClass(), "country_code", "OqbwYQfvAe");
        setField(term5617, term5617.getClass(), "region_code", "tRxZafjqIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DhjNLmRMCu";
        callMethod(klass, "setNew_passwd", argTypes, term5617, args);
    }

};


