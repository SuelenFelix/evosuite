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

public class StartResponse_setCitmeqpary_130428470274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156355;

    public StartResponse_setCitmeqpary_130428470274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term156810 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term156809 = ((Class) term156810).getDeclaredField((String) "FAILED");
        ((Field) term156809).setAccessible(true);
        Object enum371 = ((Field) term156809).get((Object) null);
        Class<? extends Object> term157075 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term157074 = ((Class) term157075).getDeclaredField((String) "MY_LIST_A");
        ((Field) term157074).setAccessible(true);
        Object enum372 = ((Field) term157074).get((Object) null);
        Class<? extends Object> term157409 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term157408 = ((Class) term157409).getDeclaredField((String) "NORMAL");
        ((Field) term157408).setAccessible(true);
        Object enum373 = ((Field) term157408).get((Object) null);
        Class<? extends Object> term157684 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term157683 = ((Class) term157684).getDeclaredField((String) "ORIGINAL");
        ((Field) term157683).setAccessible(true);
        Object enum374 = ((Field) term157683).get((Object) null);
        Class<? extends Object> term158000 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term157999 = ((Class) term158000).getDeclaredField((String) "NONE");
        ((Field) term157999).setAccessible(true);
        Object enum375 = ((Field) term157999).get((Object) null);
        term156355 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term156452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156457 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term156355, term156355.getClass(), "pd_id", -2092117838);
        setField(term156355, term156355.getClass(), "start_result", enum371);
        setIntField(term156355, term156355.getClass(), "accept_idx", 1524590776);
        setIntField(term156355, term156355.getClass(), "start_idx", 1523896653);
        setField(term156355, term156355.getClass(), "player_name", "daaMmTkwOR");
        setIntField(term156355, term156355.getClass(), "hp_vol", -1731921726);
        setBooleanField(term156355, term156355.getClass(), "btn_se_vol", true);
        setIntField(term156355, term156355.getClass(), "btn_se_vol2", 919994471);
        setIntField(term156355, term156355.getClass(), "sldr_se_vol2", 183531701);
        setField(term156355, term156355.getClass(), "sort_kind", enum372);
        setIntField(term156355, term156355.getClass(), "lv_num", -974923743);
        setIntField(term156355, term156355.getClass(), "lv_pnt", 1876738932);
        setField(term156355, term156355.getClass(), "lv_str", "WfJKDOFrUv");
        setIntField(term156355, term156355.getClass(), "lv_efct_id", -1870339027);
        setIntField(term156355, term156355.getClass(), "lv_plt_id", -1549603566);
        setField(term156355, term156355.getClass(), "mdl_eqp_ary", "CbwfWaINrF");
        setField(term156355, term156355.getClass(), "c_itm_eqp_ary", "AVCzSfXhGU");
        setField(term156355, term156355.getClass(), "ms_itm_flg_ary", "nTUCmQGFDE");
        setIntField(term156453, term156453.getClass(), "year", 2010);
        setShortField(term156453, term156453.getClass(), "month", (short) 2);
        setShortField(term156453, term156453.getClass(), "day", (short) 24);
        setField(term156452, term156452.getClass(), "date", term156453);
        setByteField(term156457, term156457.getClass(), "hour", (byte) 17);
        setByteField(term156457, term156457.getClass(), "minute", (byte) 58);
        setByteField(term156457, term156457.getClass(), "second", (byte) 56);
        setIntField(term156457, term156457.getClass(), "nano", 291725532);
        setField(term156452, term156452.getClass(), "time", term156457);
        setField(term156355, term156355.getClass(), "mdl_eqp_tm", term156452);
        setField(term156355, term156355.getClass(), "mdl_have", "rfFTBanxEx");
        setField(term156355, term156355.getClass(), "cstmz_itm_have", "MQJTCGewxT");
        setBooleanField(term156355, term156355.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term156355, term156355.getClass(), "use_mdl_pri", false);
        setBooleanField(term156355, term156355.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term156355, term156355.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term156355, term156355.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term156355, term156355.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term156355, term156355.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term156355, term156355.getClass(), "vcld_pts", 1077223540);
        setIntField(term156355, term156355.getClass(), "nxt_pv_id", -1823813592);
        setField(term156355, term156355.getClass(), "nxt_dffclty", enum373);
        setField(term156355, term156355.getClass(), "nxt_edtn", enum374);
        setField(term156355, term156355.getClass(), "cv_cid", "DRdgywxCcP");
        setField(term156355, term156355.getClass(), "cv_sc", "uelmUHzwnS");
        setField(term156355, term156355.getClass(), "cv_rr", "iKuSKqVzvy");
        setField(term156355, term156355.getClass(), "cv_bv", "SgyGAlytLF");
        setField(term156355, term156355.getClass(), "cv_bf", "OoXopVvpwr");
        setIntField(term156355, term156355.getClass(), "cnp_cid", -1644358555);
        setIntField(term156355, term156355.getClass(), "cnp_val", -388591034);
        setField(term156355, term156355.getClass(), "cnp_rr", enum375);
        setField(term156355, term156355.getClass(), "cnp_sp", "lwwreKJCFL");
        setField(term156355, term156355.getClass(), "my_lst_0", "PWBggYjpOQ");
        setField(term156355, term156355.getClass(), "my_lst_1", "FDzNpfjYDI");
        setField(term156355, term156355.getClass(), "my_lst_2", "vSbbcByIuA");
        setField(term156355, term156355.getClass(), "my_lst_3", "QSvdWzkkPx");
        setField(term156355, term156355.getClass(), "my_lst_4", "vStdEtWvae");
        setField(term156355, term156355.getClass(), "dsp_clr_brdr", "iApJWgnQkP");
        setBooleanField(term156355, term156355.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term156355, term156355.getClass(), "dsp_clr_sts", true);
        setField(term156355, term156355.getClass(), "clr_sts", "kHKzzYJxiP");
        setBooleanField(term156355, term156355.getClass(), "rgo_sts", false);
        setField(term156355, term156355.getClass(), "my_qst_id", "INFnBrMIka");
        setField(term156355, term156355.getClass(), "my_qst_sts", "EwmpEgdvZs");
        setField(term156355, term156355.getClass(), "my_qst_prgrs", "vRjHouXWLC");
        setField(term156355, term156355.getClass(), "my_qst_et", "XghDInkWEe");
        setField(term156355, term156355.getClass(), "p_std_ie_have", "zPDuGbsYGT");
        setField(term156355, term156355.getClass(), "p_std_se_have", "apnNoBOovC");
        setField(term156355, term156355.getClass(), "cmd", "SyGIHWAumE");
        setField(term156355, term156355.getClass(), "req_id", "bMQUwQqyMc");
        setField(term156355, term156355.getClass(), "stat", "CVaGhXmAUN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KnclcuNYRb";
        callMethod(klass, "setC_itm_eqp_ary", argTypes, term156355, args);
    }

};


