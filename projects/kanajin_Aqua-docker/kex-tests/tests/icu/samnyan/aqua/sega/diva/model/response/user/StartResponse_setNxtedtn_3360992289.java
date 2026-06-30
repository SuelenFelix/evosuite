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

public class StartResponse_setNxtedtn_3360992289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187749;
     Object enum449;

    public StartResponse_setNxtedtn_3360992289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term188188 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term188187 = ((Class) term188188).getDeclaredField((String) "SUCCESS");
        ((Field) term188187).setAccessible(true);
        Object enum446 = ((Field) term188187).get((Object) null);
        Class<? extends Object> term188456 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term188455 = ((Class) term188456).getDeclaredField((String) "MY_LIST_A");
        ((Field) term188455).setAccessible(true);
        Object enum447 = ((Field) term188455).get((Object) null);
        Class<? extends Object> term188790 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term188789 = ((Class) term188790).getDeclaredField((String) "HARD");
        ((Field) term188789).setAccessible(true);
        Object enum448 = ((Field) term188789).get((Object) null);
        Class<? extends Object> term189059 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term189058 = ((Class) term189059).getDeclaredField((String) "EXTRA");
        ((Field) term189058).setAccessible(true);
        enum449 = ((Field) term189058).get((Object) null);
        Class<? extends Object> term189366 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term189365 = ((Class) term189366).getDeclaredField((String) "GOLD");
        ((Field) term189365).setAccessible(true);
        Object enum450 = ((Field) term189365).get((Object) null);
        term187749 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term187847 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187848 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187852 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term187749, term187749.getClass(), "pd_id", -1813266173);
        setField(term187749, term187749.getClass(), "start_result", enum446);
        setIntField(term187749, term187749.getClass(), "accept_idx", -1201819537);
        setIntField(term187749, term187749.getClass(), "start_idx", 2135922049);
        setField(term187749, term187749.getClass(), "player_name", "SRYeqWJJkR");
        setIntField(term187749, term187749.getClass(), "hp_vol", -263876378);
        setBooleanField(term187749, term187749.getClass(), "btn_se_vol", true);
        setIntField(term187749, term187749.getClass(), "btn_se_vol2", -755209283);
        setIntField(term187749, term187749.getClass(), "sldr_se_vol2", -616562794);
        setField(term187749, term187749.getClass(), "sort_kind", enum447);
        setIntField(term187749, term187749.getClass(), "lv_num", 750084083);
        setIntField(term187749, term187749.getClass(), "lv_pnt", -1603460382);
        setField(term187749, term187749.getClass(), "lv_str", "vUVScKcyFY");
        setIntField(term187749, term187749.getClass(), "lv_efct_id", -298939768);
        setIntField(term187749, term187749.getClass(), "lv_plt_id", -767031634);
        setField(term187749, term187749.getClass(), "mdl_eqp_ary", "DCSMbuGiaM");
        setField(term187749, term187749.getClass(), "c_itm_eqp_ary", "wtOVzMPrFU");
        setField(term187749, term187749.getClass(), "ms_itm_flg_ary", "CBnamgJrJS");
        setIntField(term187848, term187848.getClass(), "year", 2013);
        setShortField(term187848, term187848.getClass(), "month", (short) 5);
        setShortField(term187848, term187848.getClass(), "day", (short) 9);
        setField(term187847, term187847.getClass(), "date", term187848);
        setByteField(term187852, term187852.getClass(), "hour", (byte) 4);
        setByteField(term187852, term187852.getClass(), "minute", (byte) 18);
        setByteField(term187852, term187852.getClass(), "second", (byte) 35);
        setIntField(term187852, term187852.getClass(), "nano", 909079395);
        setField(term187847, term187847.getClass(), "time", term187852);
        setField(term187749, term187749.getClass(), "mdl_eqp_tm", term187847);
        setField(term187749, term187749.getClass(), "mdl_have", "uJhRRqAnDP");
        setField(term187749, term187749.getClass(), "cstmz_itm_have", "hJCqADrhuV");
        setBooleanField(term187749, term187749.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term187749, term187749.getClass(), "use_mdl_pri", true);
        setBooleanField(term187749, term187749.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term187749, term187749.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term187749, term187749.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term187749, term187749.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term187749, term187749.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term187749, term187749.getClass(), "vcld_pts", -2072469750);
        setIntField(term187749, term187749.getClass(), "nxt_pv_id", 2106616847);
        setField(term187749, term187749.getClass(), "nxt_dffclty", enum448);
        setField(term187749, term187749.getClass(), "nxt_edtn", enum449);
        setField(term187749, term187749.getClass(), "cv_cid", "RyPUBlRpNZ");
        setField(term187749, term187749.getClass(), "cv_sc", "ardfVpCueq");
        setField(term187749, term187749.getClass(), "cv_rr", "wEYAmGJIEF");
        setField(term187749, term187749.getClass(), "cv_bv", "iXEhfXJomO");
        setField(term187749, term187749.getClass(), "cv_bf", "KEoUMzNdMA");
        setIntField(term187749, term187749.getClass(), "cnp_cid", 403107947);
        setIntField(term187749, term187749.getClass(), "cnp_val", -1433815725);
        setField(term187749, term187749.getClass(), "cnp_rr", enum450);
        setField(term187749, term187749.getClass(), "cnp_sp", "SOsGYAgpgW");
        setField(term187749, term187749.getClass(), "my_lst_0", "ZBafuLDRDM");
        setField(term187749, term187749.getClass(), "my_lst_1", "VDnsNuhEvG");
        setField(term187749, term187749.getClass(), "my_lst_2", "DMrfMwXyYT");
        setField(term187749, term187749.getClass(), "my_lst_3", "GAzZvzjuXP");
        setField(term187749, term187749.getClass(), "my_lst_4", "WoFrMqAUlT");
        setField(term187749, term187749.getClass(), "dsp_clr_brdr", "RtHOddPkOW");
        setBooleanField(term187749, term187749.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term187749, term187749.getClass(), "dsp_clr_sts", false);
        setField(term187749, term187749.getClass(), "clr_sts", "LAaHVAeRPU");
        setBooleanField(term187749, term187749.getClass(), "rgo_sts", false);
        setField(term187749, term187749.getClass(), "my_qst_id", "BLPwYfxwnm");
        setField(term187749, term187749.getClass(), "my_qst_sts", "zItHVuBBzy");
        setField(term187749, term187749.getClass(), "my_qst_prgrs", "pQcdIREjlp");
        setField(term187749, term187749.getClass(), "my_qst_et", "WjUrdNMIOj");
        setField(term187749, term187749.getClass(), "p_std_ie_have", "aQUpwHjYvS");
        setField(term187749, term187749.getClass(), "p_std_se_have", "lvcTLkVhAN");
        setField(term187749, term187749.getClass(), "cmd", "BJJuVqxXjT");
        setField(term187749, term187749.getClass(), "req_id", "IvxbsFCczM");
        setField(term187749, term187749.getClass(), "stat", "GkAaLUoaoL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        Object[] args = new Object[1];
        args[0] = enum449;
        callMethod(klass, "setNxt_edtn", argTypes, term187749, args);
    }

};


