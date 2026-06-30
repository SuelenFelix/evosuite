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

public class StartResponse_setDspclrbrdr_1778909920104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219554;

    public StartResponse_setDspclrbrdr_1778909920104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220007 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term220006 = ((Class) term220007).getDeclaredField((String) "SUCCESS");
        ((Field) term220006).setAccessible(true);
        Object enum522 = ((Field) term220006).get((Object) null);
        Class<? extends Object> term220275 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term220274 = ((Class) term220275).getDeclaredField((String) "MY_LIST_C");
        ((Field) term220274).setAccessible(true);
        Object enum523 = ((Field) term220274).get((Object) null);
        Class<? extends Object> term220609 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term220608 = ((Class) term220609).getDeclaredField((String) "HARD");
        ((Field) term220608).setAccessible(true);
        Object enum524 = ((Field) term220608).get((Object) null);
        Class<? extends Object> term220878 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term220877 = ((Class) term220878).getDeclaredField((String) "EXTRA");
        ((Field) term220877).setAccessible(true);
        Object enum525 = ((Field) term220877).get((Object) null);
        Class<? extends Object> term221185 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term221184 = ((Class) term221185).getDeclaredField((String) "SILVER");
        ((Field) term221184).setAccessible(true);
        Object enum526 = ((Field) term221184).get((Object) null);
        term219554 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term219652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219657 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term219554, term219554.getClass(), "pd_id", -1122596893);
        setField(term219554, term219554.getClass(), "start_result", enum522);
        setIntField(term219554, term219554.getClass(), "accept_idx", -2147297900);
        setIntField(term219554, term219554.getClass(), "start_idx", 539095138);
        setField(term219554, term219554.getClass(), "player_name", "TGjqGBrVob");
        setIntField(term219554, term219554.getClass(), "hp_vol", 1462297654);
        setBooleanField(term219554, term219554.getClass(), "btn_se_vol", false);
        setIntField(term219554, term219554.getClass(), "btn_se_vol2", 1009915858);
        setIntField(term219554, term219554.getClass(), "sldr_se_vol2", 500127209);
        setField(term219554, term219554.getClass(), "sort_kind", enum523);
        setIntField(term219554, term219554.getClass(), "lv_num", -1482530168);
        setIntField(term219554, term219554.getClass(), "lv_pnt", -432987116);
        setField(term219554, term219554.getClass(), "lv_str", "oOHlrJrFIp");
        setIntField(term219554, term219554.getClass(), "lv_efct_id", 1483499310);
        setIntField(term219554, term219554.getClass(), "lv_plt_id", -1516568587);
        setField(term219554, term219554.getClass(), "mdl_eqp_ary", "vqZvnioIVM");
        setField(term219554, term219554.getClass(), "c_itm_eqp_ary", "CXNFlzEpBC");
        setField(term219554, term219554.getClass(), "ms_itm_flg_ary", "qnsCYAsHRu");
        setIntField(term219653, term219653.getClass(), "year", 2016);
        setShortField(term219653, term219653.getClass(), "month", (short) 12);
        setShortField(term219653, term219653.getClass(), "day", (short) 20);
        setField(term219652, term219652.getClass(), "date", term219653);
        setByteField(term219657, term219657.getClass(), "hour", (byte) 8);
        setByteField(term219657, term219657.getClass(), "minute", (byte) 46);
        setByteField(term219657, term219657.getClass(), "second", (byte) 16);
        setIntField(term219657, term219657.getClass(), "nano", 10071864);
        setField(term219652, term219652.getClass(), "time", term219657);
        setField(term219554, term219554.getClass(), "mdl_eqp_tm", term219652);
        setField(term219554, term219554.getClass(), "mdl_have", "qMoCYznUOe");
        setField(term219554, term219554.getClass(), "cstmz_itm_have", "fjOTVskUVh");
        setBooleanField(term219554, term219554.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term219554, term219554.getClass(), "use_mdl_pri", false);
        setBooleanField(term219554, term219554.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term219554, term219554.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term219554, term219554.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term219554, term219554.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term219554, term219554.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term219554, term219554.getClass(), "vcld_pts", 1537690170);
        setIntField(term219554, term219554.getClass(), "nxt_pv_id", 1133116994);
        setField(term219554, term219554.getClass(), "nxt_dffclty", enum524);
        setField(term219554, term219554.getClass(), "nxt_edtn", enum525);
        setField(term219554, term219554.getClass(), "cv_cid", "OhiftESVwX");
        setField(term219554, term219554.getClass(), "cv_sc", "UkppLrLyZM");
        setField(term219554, term219554.getClass(), "cv_rr", "MxFKwAHuar");
        setField(term219554, term219554.getClass(), "cv_bv", "DhSWasYJlP");
        setField(term219554, term219554.getClass(), "cv_bf", "JOSsHVpnAd");
        setIntField(term219554, term219554.getClass(), "cnp_cid", -1195191239);
        setIntField(term219554, term219554.getClass(), "cnp_val", -470798982);
        setField(term219554, term219554.getClass(), "cnp_rr", enum526);
        setField(term219554, term219554.getClass(), "cnp_sp", "PbEsDEkNLx");
        setField(term219554, term219554.getClass(), "my_lst_0", "pWmmwQMysX");
        setField(term219554, term219554.getClass(), "my_lst_1", "BuJzsOARZG");
        setField(term219554, term219554.getClass(), "my_lst_2", "lIqJQDMmVL");
        setField(term219554, term219554.getClass(), "my_lst_3", "cXTrsrxYFN");
        setField(term219554, term219554.getClass(), "my_lst_4", "pEUndHGBiE");
        setField(term219554, term219554.getClass(), "dsp_clr_brdr", "PCzKLiLqoO");
        setBooleanField(term219554, term219554.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term219554, term219554.getClass(), "dsp_clr_sts", true);
        setField(term219554, term219554.getClass(), "clr_sts", "JuYhKUgElF");
        setBooleanField(term219554, term219554.getClass(), "rgo_sts", true);
        setField(term219554, term219554.getClass(), "my_qst_id", "NInWPlYtwe");
        setField(term219554, term219554.getClass(), "my_qst_sts", "qVYRtrgZJt");
        setField(term219554, term219554.getClass(), "my_qst_prgrs", "PCttFvFDzJ");
        setField(term219554, term219554.getClass(), "my_qst_et", "fwAMmjMsDq");
        setField(term219554, term219554.getClass(), "p_std_ie_have", "aqdKzesECj");
        setField(term219554, term219554.getClass(), "p_std_se_have", "voSygcVEYO");
        setField(term219554, term219554.getClass(), "cmd", "LfcceVKtWg");
        setField(term219554, term219554.getClass(), "req_id", "CNkueZBdYF");
        setField(term219554, term219554.getClass(), "stat", "ZAjjJEUomV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cHwZbezfEu";
        callMethod(klass, "setDsp_clr_brdr", argTypes, term219554, args);
    }

};


