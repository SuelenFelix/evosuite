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

public class PreStartResponse_setSldrtchseeqp_142701062543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291641;
     Object term291791;

    public PreStartResponse_setSldrtchseeqp_142701062543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term291794 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term291793 = ((Class) term291794).getDeclaredField((String) "FAILED");
        ((Field) term291793).setAccessible(true);
        Object enum706 = ((Field) term291793).get((Object) null);
        Integer term291653 = new Integer(-573608449);
        Integer term291655 = new Integer(-1660057757);
        Integer term291657 = new Integer(1816273440);
        Integer term291659 = new Integer(-96541009);
        Integer term291661 = new Integer(-43719302);
        Class<? extends Object> term292099 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term292098 = ((Class) term292099).getDeclaredField((String) "MY_LIST_A");
        ((Field) term292098).setAccessible(true);
        Object enum707 = ((Field) term292098).get((Object) null);
        Integer term291689 = new Integer(1024134939);
        Integer term291691 = new Integer(109078154);
        Integer term291705 = new Integer(-314165467);
        Integer term291707 = new Integer(963694071);
        Integer term291731 = new Integer(-995785731);
        Integer term291733 = new Integer(1349815364);
        Integer term291735 = new Integer(2128383340);
        Integer term291737 = new Integer(1238598518);
        Integer term291739 = new Integer(-558146961);
        Integer term291741 = new Integer(1505480070);
        Class<? extends Object> term292393 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term292392 = ((Class) term292393).getDeclaredField((String) "REISSUE");
        ((Field) term292392).setAccessible(true);
        Object enum708 = ((Field) term292392).get((Object) null);
        term291641 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term291721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291726 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term291641, term291641.getClass(), "ps_result", enum706);
        setField(term291641, term291641.getClass(), "accept_idx", term291653);
        setField(term291641, term291641.getClass(), "nblss_ltt_stts", term291655);
        setField(term291641, term291641.getClass(), "nblss_ltt_tckt", term291657);
        setField(term291641, term291641.getClass(), "nblss_ltt_is_opn", term291659);
        setField(term291641, term291641.getClass(), "pd_id", term291661);
        setField(term291641, term291641.getClass(), "player_name", "ZPnUGVLyiF");
        setField(term291641, term291641.getClass(), "sort_kind", enum707);
        setField(term291641, term291641.getClass(), "lv_num", term291689);
        setField(term291641, term291641.getClass(), "lv_pnt", term291691);
        setField(term291641, term291641.getClass(), "lv_str", "iGWKoojIzf");
        setField(term291641, term291641.getClass(), "lv_efct_id", term291705);
        setField(term291641, term291641.getClass(), "lv_plt_id", term291707);
        setField(term291641, term291641.getClass(), "mdl_eqp_ary", "hBwCfmunWp");
        setIntField(term291722, term291722.getClass(), "year", 2029);
        setShortField(term291722, term291722.getClass(), "month", (short) 6);
        setShortField(term291722, term291722.getClass(), "day", (short) 4);
        setField(term291721, term291721.getClass(), "date", term291722);
        setByteField(term291726, term291726.getClass(), "hour", (byte) 22);
        setByteField(term291726, term291726.getClass(), "minute", (byte) 1);
        setByteField(term291726, term291726.getClass(), "second", (byte) 38);
        setIntField(term291726, term291726.getClass(), "nano", 329228491);
        setField(term291721, term291721.getClass(), "time", term291726);
        setField(term291641, term291641.getClass(), "mdl_eqp_tm", term291721);
        setField(term291641, term291641.getClass(), "skn_eqp", term291731);
        setField(term291641, term291641.getClass(), "btn_se_eqp", term291733);
        setField(term291641, term291641.getClass(), "sld_se_eqp", term291735);
        setField(term291641, term291641.getClass(), "chn_sld_se_eqp", term291737);
        setField(term291641, term291641.getClass(), "sldr_tch_se_eqp", term291739);
        setField(term291641, term291641.getClass(), "vcld_pts", term291741);
        setField(term291641, term291641.getClass(), "passwd_stat", enum708);
        setField(term291641, term291641.getClass(), "cmd", "dEmUNxEaGp");
        setField(term291641, term291641.getClass(), "req_id", "FiihXkdDjE");
        setField(term291641, term291641.getClass(), "stat", "ttkSFEAzwY");
        term291791 = new Integer(-829088844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term291791;
        callMethod(klass, "setSldr_tch_se_eqp", argTypes, term291641, args);
    }

};


