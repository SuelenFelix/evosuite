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

public class StartResponse_setLvpltid_176548882672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152111;
     Object term152559;

    public StartResponse_setLvpltid_176548882672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term152562 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term152561 = ((Class) term152562).getDeclaredField((String) "FAILED");
        ((Field) term152561).setAccessible(true);
        Object enum361 = ((Field) term152561).get((Object) null);
        Class<? extends Object> term152827 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term152826 = ((Class) term152827).getDeclaredField((String) "COMPLEXITY");
        ((Field) term152826).setAccessible(true);
        Object enum362 = ((Field) term152826).get((Object) null);
        Class<? extends Object> term153164 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term153163 = ((Class) term153164).getDeclaredField((String) "UNDEFINED");
        ((Field) term153163).setAccessible(true);
        Object enum363 = ((Field) term153163).get((Object) null);
        Class<? extends Object> term153448 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term153447 = ((Class) term153448).getDeclaredField((String) "ORIGINAL");
        ((Field) term153447).setAccessible(true);
        Object enum364 = ((Field) term153447).get((Object) null);
        Class<? extends Object> term153764 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term153763 = ((Class) term153764).getDeclaredField((String) "BRONZE");
        ((Field) term153763).setAccessible(true);
        Object enum365 = ((Field) term153763).get((Object) null);
        term152111 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term152209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152214 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term152111, term152111.getClass(), "pd_id", -994742871);
        setField(term152111, term152111.getClass(), "start_result", enum361);
        setIntField(term152111, term152111.getClass(), "accept_idx", -222412326);
        setIntField(term152111, term152111.getClass(), "start_idx", -299497261);
        setField(term152111, term152111.getClass(), "player_name", "MamzBtwhiz");
        setIntField(term152111, term152111.getClass(), "hp_vol", -23054366);
        setBooleanField(term152111, term152111.getClass(), "btn_se_vol", true);
        setIntField(term152111, term152111.getClass(), "btn_se_vol2", 153009426);
        setIntField(term152111, term152111.getClass(), "sldr_se_vol2", 185751892);
        setField(term152111, term152111.getClass(), "sort_kind", enum362);
        setIntField(term152111, term152111.getClass(), "lv_num", 1068256001);
        setIntField(term152111, term152111.getClass(), "lv_pnt", 1139078354);
        setField(term152111, term152111.getClass(), "lv_str", "wVOypfVLsP");
        setIntField(term152111, term152111.getClass(), "lv_efct_id", -691164974);
        setIntField(term152111, term152111.getClass(), "lv_plt_id", -761675396);
        setField(term152111, term152111.getClass(), "mdl_eqp_ary", "pEazBcUUWX");
        setField(term152111, term152111.getClass(), "c_itm_eqp_ary", "nlvRWrTxvz");
        setField(term152111, term152111.getClass(), "ms_itm_flg_ary", "isMKwgUmka");
        setIntField(term152210, term152210.getClass(), "year", 2022);
        setShortField(term152210, term152210.getClass(), "month", (short) 11);
        setShortField(term152210, term152210.getClass(), "day", (short) 10);
        setField(term152209, term152209.getClass(), "date", term152210);
        setByteField(term152214, term152214.getClass(), "hour", (byte) 20);
        setByteField(term152214, term152214.getClass(), "minute", (byte) 8);
        setByteField(term152214, term152214.getClass(), "second", (byte) 35);
        setIntField(term152214, term152214.getClass(), "nano", 658416570);
        setField(term152209, term152209.getClass(), "time", term152214);
        setField(term152111, term152111.getClass(), "mdl_eqp_tm", term152209);
        setField(term152111, term152111.getClass(), "mdl_have", "pDIyzhDtTy");
        setField(term152111, term152111.getClass(), "cstmz_itm_have", "wXiUlhXQoC");
        setBooleanField(term152111, term152111.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term152111, term152111.getClass(), "use_mdl_pri", true);
        setBooleanField(term152111, term152111.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term152111, term152111.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term152111, term152111.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term152111, term152111.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term152111, term152111.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term152111, term152111.getClass(), "vcld_pts", -1954860951);
        setIntField(term152111, term152111.getClass(), "nxt_pv_id", -2078879114);
        setField(term152111, term152111.getClass(), "nxt_dffclty", enum363);
        setField(term152111, term152111.getClass(), "nxt_edtn", enum364);
        setField(term152111, term152111.getClass(), "cv_cid", "gKhmgJzimH");
        setField(term152111, term152111.getClass(), "cv_sc", "OzRiWLVXNx");
        setField(term152111, term152111.getClass(), "cv_rr", "pktmgYsknu");
        setField(term152111, term152111.getClass(), "cv_bv", "SsMHzYNeji");
        setField(term152111, term152111.getClass(), "cv_bf", "wzAFLFdaEQ");
        setIntField(term152111, term152111.getClass(), "cnp_cid", -1186882318);
        setIntField(term152111, term152111.getClass(), "cnp_val", 1077647088);
        setField(term152111, term152111.getClass(), "cnp_rr", enum365);
        setField(term152111, term152111.getClass(), "cnp_sp", "IcbBNUXJqX");
        setField(term152111, term152111.getClass(), "my_lst_0", "LONFjqAsUp");
        setField(term152111, term152111.getClass(), "my_lst_1", "tAhydlbSMf");
        setField(term152111, term152111.getClass(), "my_lst_2", "wNYtcPFyIe");
        setField(term152111, term152111.getClass(), "my_lst_3", "tlIqgTUSQw");
        setField(term152111, term152111.getClass(), "my_lst_4", "UvweyXjDhG");
        setField(term152111, term152111.getClass(), "dsp_clr_brdr", "wnoVhNwdJy");
        setBooleanField(term152111, term152111.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term152111, term152111.getClass(), "dsp_clr_sts", true);
        setField(term152111, term152111.getClass(), "clr_sts", "uQGMBLrmAj");
        setBooleanField(term152111, term152111.getClass(), "rgo_sts", false);
        setField(term152111, term152111.getClass(), "my_qst_id", "vNFaheDeBv");
        setField(term152111, term152111.getClass(), "my_qst_sts", "CiPMRxGoHO");
        setField(term152111, term152111.getClass(), "my_qst_prgrs", "LauKpKmenw");
        setField(term152111, term152111.getClass(), "my_qst_et", "TydzbTXvbY");
        setField(term152111, term152111.getClass(), "p_std_ie_have", "yNogNNecFu");
        setField(term152111, term152111.getClass(), "p_std_se_have", "tcaaotqgDF");
        setField(term152111, term152111.getClass(), "cmd", "bXInWdOeyi");
        setField(term152111, term152111.getClass(), "req_id", "HdwopulXkf");
        setField(term152111, term152111.getClass(), "stat", "FuCKfgAhpC");
        term152559 = new Integer(-705176810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term152559;
        callMethod(klass, "setLv_plt_id", argTypes, term152111, args);
    }

};


