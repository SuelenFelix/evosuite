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

public class PreStartResponse_getPasswdstat_34611167923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269661;

    public PreStartResponse_getPasswdstat_34611167923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term269820 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term269819 = ((Class) term269820).getDeclaredField((String) "NEW_REGISTRATION");
        ((Field) term269819).setAccessible(true);
        Object enum644 = ((Field) term269819).get((Object) null);
        Integer term269683 = new Integer(1295839803);
        Integer term269685 = new Integer(-1891015523);
        Integer term269687 = new Integer(-1560631747);
        Integer term269689 = new Integer(1215150180);
        Integer term269691 = new Integer(-1422859977);
        Class<? extends Object> term270155 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term270154 = ((Class) term270155).getDeclaredField((String) "MY_LIST_C");
        ((Field) term270154).setAccessible(true);
        Object enum645 = ((Field) term270154).get((Object) null);
        Integer term269719 = new Integer(-1972436591);
        Integer term269721 = new Integer(68922753);
        Integer term269735 = new Integer(-220791533);
        Integer term269737 = new Integer(1741500243);
        Integer term269761 = new Integer(-2070466617);
        Integer term269763 = new Integer(-1127721881);
        Integer term269765 = new Integer(1074848808);
        Integer term269767 = new Integer(-146054762);
        Integer term269769 = new Integer(798043553);
        Integer term269771 = new Integer(533197381);
        Class<? extends Object> term270449 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term270448 = ((Class) term270449).getDeclaredField((String) "RESET");
        ((Field) term270448).setAccessible(true);
        Object enum646 = ((Field) term270448).get((Object) null);
        term269661 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term269751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term269752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term269756 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term269661, term269661.getClass(), "ps_result", enum644);
        setField(term269661, term269661.getClass(), "accept_idx", term269683);
        setField(term269661, term269661.getClass(), "nblss_ltt_stts", term269685);
        setField(term269661, term269661.getClass(), "nblss_ltt_tckt", term269687);
        setField(term269661, term269661.getClass(), "nblss_ltt_is_opn", term269689);
        setField(term269661, term269661.getClass(), "pd_id", term269691);
        setField(term269661, term269661.getClass(), "player_name", "EkgwvUqGYF");
        setField(term269661, term269661.getClass(), "sort_kind", enum645);
        setField(term269661, term269661.getClass(), "lv_num", term269719);
        setField(term269661, term269661.getClass(), "lv_pnt", term269721);
        setField(term269661, term269661.getClass(), "lv_str", "sbtPNrurvf");
        setField(term269661, term269661.getClass(), "lv_efct_id", term269735);
        setField(term269661, term269661.getClass(), "lv_plt_id", term269737);
        setField(term269661, term269661.getClass(), "mdl_eqp_ary", "zomtOAIouP");
        setIntField(term269752, term269752.getClass(), "year", 2010);
        setShortField(term269752, term269752.getClass(), "month", (short) 3);
        setShortField(term269752, term269752.getClass(), "day", (short) 11);
        setField(term269751, term269751.getClass(), "date", term269752);
        setByteField(term269756, term269756.getClass(), "hour", (byte) 0);
        setByteField(term269756, term269756.getClass(), "minute", (byte) 21);
        setByteField(term269756, term269756.getClass(), "second", (byte) 25);
        setIntField(term269756, term269756.getClass(), "nano", 201315999);
        setField(term269751, term269751.getClass(), "time", term269756);
        setField(term269661, term269661.getClass(), "mdl_eqp_tm", term269751);
        setField(term269661, term269661.getClass(), "skn_eqp", term269761);
        setField(term269661, term269661.getClass(), "btn_se_eqp", term269763);
        setField(term269661, term269661.getClass(), "sld_se_eqp", term269765);
        setField(term269661, term269661.getClass(), "chn_sld_se_eqp", term269767);
        setField(term269661, term269661.getClass(), "sldr_tch_se_eqp", term269769);
        setField(term269661, term269661.getClass(), "vcld_pts", term269771);
        setField(term269661, term269661.getClass(), "passwd_stat", enum646);
        setField(term269661, term269661.getClass(), "cmd", "pwHkUmkBGN");
        setField(term269661, term269661.getClass(), "req_id", "TZJzEpeSDz");
        setField(term269661, term269661.getClass(), "stat", "CEVnfPOBDk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswd_stat", argTypes, term269661, args);
    }

};


