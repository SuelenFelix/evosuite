package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PreStartResponse_setNblsslttisopn_146349875228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275352;
     Object term275504;

    public PreStartResponse_setNblsslttisopn_146349875228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term275507 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term275506 = ((Class) term275507).getDeclaredField((String) "CARD_BANNED");
        ((Field) term275506).setAccessible(true);
        Object enum660 = ((Field) term275506).get((Object) null);
        Integer term275369 = new Integer(917513193);
        Integer term275371 = new Integer(787278105);
        Integer term275373 = new Integer(-2063843486);
        Integer term275375 = new Integer(833762980);
        Integer term275377 = new Integer(320711637);
        Class<? extends Object> term275827 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term275826 = ((Class) term275827).getDeclaredField((String) "MY_LIST_B");
        ((Field) term275826).setAccessible(true);
        Object enum661 = ((Field) term275826).get((Object) null);
        Integer term275405 = new Integer(1241164745);
        Integer term275407 = new Integer(1723148410);
        Integer term275421 = new Integer(-920797484);
        Integer term275423 = new Integer(-1631697577);
        Integer term275447 = new Integer(765731371);
        Integer term275449 = new Integer(-1703035419);
        Integer term275451 = new Integer(765766290);
        Integer term275453 = new Integer(-1284825282);
        Integer term275455 = new Integer(-1941343035);
        Integer term275457 = new Integer(947897214);
        Class<? extends Object> term276121 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term276120 = ((Class) term276121).getDeclaredField((String) "MISS");
        ((Field) term276120).setAccessible(true);
        Object enum662 = ((Field) term276120).get((Object) null);
        term275352 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term275437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275442 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term275352, term275352.getClass(), "ps_result", enum660);
        setField(term275352, term275352.getClass(), "accept_idx", term275369);
        setField(term275352, term275352.getClass(), "nblss_ltt_stts", term275371);
        setField(term275352, term275352.getClass(), "nblss_ltt_tckt", term275373);
        setField(term275352, term275352.getClass(), "nblss_ltt_is_opn", term275375);
        setField(term275352, term275352.getClass(), "pd_id", term275377);
        setField(term275352, term275352.getClass(), "player_name", "iNnWLGJCBN");
        setField(term275352, term275352.getClass(), "sort_kind", enum661);
        setField(term275352, term275352.getClass(), "lv_num", term275405);
        setField(term275352, term275352.getClass(), "lv_pnt", term275407);
        setField(term275352, term275352.getClass(), "lv_str", "jYJrGEVHCD");
        setField(term275352, term275352.getClass(), "lv_efct_id", term275421);
        setField(term275352, term275352.getClass(), "lv_plt_id", term275423);
        setField(term275352, term275352.getClass(), "mdl_eqp_ary", "wlBPkhpzWH");
        setIntField(term275438, term275438.getClass(), "year", 2028);
        setShortField(term275438, term275438.getClass(), "month", (short) 5);
        setShortField(term275438, term275438.getClass(), "day", (short) 7);
        setField(term275437, term275437.getClass(), "date", term275438);
        setByteField(term275442, term275442.getClass(), "hour", (byte) 7);
        setByteField(term275442, term275442.getClass(), "minute", (byte) 48);
        setByteField(term275442, term275442.getClass(), "second", (byte) 4);
        setIntField(term275442, term275442.getClass(), "nano", 380425174);
        setField(term275437, term275437.getClass(), "time", term275442);
        setField(term275352, term275352.getClass(), "mdl_eqp_tm", term275437);
        setField(term275352, term275352.getClass(), "skn_eqp", term275447);
        setField(term275352, term275352.getClass(), "btn_se_eqp", term275449);
        setField(term275352, term275352.getClass(), "sld_se_eqp", term275451);
        setField(term275352, term275352.getClass(), "chn_sld_se_eqp", term275453);
        setField(term275352, term275352.getClass(), "sldr_tch_se_eqp", term275455);
        setField(term275352, term275352.getClass(), "vcld_pts", term275457);
        setField(term275352, term275352.getClass(), "passwd_stat", enum662);
        setField(term275352, term275352.getClass(), "cmd", "aBZsgezjug");
        setField(term275352, term275352.getClass(), "req_id", "hvlXhuKNfP");
        setField(term275352, term275352.getClass(), "stat", "csdpRGUrjJ");
        term275504 = new Integer(1496340209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term275504;
        callMethod(klass, "setNblss_ltt_is_opn", argTypes, term275352, args);
    }

};


