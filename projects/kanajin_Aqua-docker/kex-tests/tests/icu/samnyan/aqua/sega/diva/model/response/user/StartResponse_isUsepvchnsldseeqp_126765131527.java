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

public class StartResponse_isUsepvchnsldseeqp_126765131527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58137;

    public StartResponse_isUsepvchnsldseeqp_126765131527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58581 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term58580 = ((Class) term58581).getDeclaredField((String) "FAILED");
        ((Field) term58580).setAccessible(true);
        Object enum135 = ((Field) term58580).get((Object) null);
        Class<? extends Object> term58846 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term58845 = ((Class) term58846).getDeclaredField((String) "COMPLEXITY");
        ((Field) term58845).setAccessible(true);
        Object enum136 = ((Field) term58845).get((Object) null);
        Class<? extends Object> term59183 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term59182 = ((Class) term59183).getDeclaredField((String) "NORMAL");
        ((Field) term59182).setAccessible(true);
        Object enum137 = ((Field) term59182).get((Object) null);
        Class<? extends Object> term59458 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term59457 = ((Class) term59458).getDeclaredField((String) "ORIGINAL");
        ((Field) term59457).setAccessible(true);
        Object enum138 = ((Field) term59457).get((Object) null);
        Class<? extends Object> term59774 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term59773 = ((Class) term59774).getDeclaredField((String) "NONE");
        ((Field) term59773).setAccessible(true);
        Object enum139 = ((Field) term59773).get((Object) null);
        term58137 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term58235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58240 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term58137, term58137.getClass(), "pd_id", -266625190);
        setField(term58137, term58137.getClass(), "start_result", enum135);
        setIntField(term58137, term58137.getClass(), "accept_idx", 489201218);
        setIntField(term58137, term58137.getClass(), "start_idx", 464181937);
        setField(term58137, term58137.getClass(), "player_name", "stVcZLTNpu");
        setIntField(term58137, term58137.getClass(), "hp_vol", -1455526612);
        setBooleanField(term58137, term58137.getClass(), "btn_se_vol", false);
        setIntField(term58137, term58137.getClass(), "btn_se_vol2", -941356098);
        setIntField(term58137, term58137.getClass(), "sldr_se_vol2", -201517446);
        setField(term58137, term58137.getClass(), "sort_kind", enum136);
        setIntField(term58137, term58137.getClass(), "lv_num", -97742366);
        setIntField(term58137, term58137.getClass(), "lv_pnt", 1638851942);
        setField(term58137, term58137.getClass(), "lv_str", "LgXdqWrsLL");
        setIntField(term58137, term58137.getClass(), "lv_efct_id", 1374790203);
        setIntField(term58137, term58137.getClass(), "lv_plt_id", 1160010161);
        setField(term58137, term58137.getClass(), "mdl_eqp_ary", "bbHWyibNmy");
        setField(term58137, term58137.getClass(), "c_itm_eqp_ary", "vYYOYhWMWZ");
        setField(term58137, term58137.getClass(), "ms_itm_flg_ary", "FLQJOzEXff");
        setIntField(term58236, term58236.getClass(), "year", 2027);
        setShortField(term58236, term58236.getClass(), "month", (short) 2);
        setShortField(term58236, term58236.getClass(), "day", (short) 19);
        setField(term58235, term58235.getClass(), "date", term58236);
        setByteField(term58240, term58240.getClass(), "hour", (byte) 17);
        setByteField(term58240, term58240.getClass(), "minute", (byte) 37);
        setByteField(term58240, term58240.getClass(), "second", (byte) 27);
        setIntField(term58240, term58240.getClass(), "nano", 920380537);
        setField(term58235, term58235.getClass(), "time", term58240);
        setField(term58137, term58137.getClass(), "mdl_eqp_tm", term58235);
        setField(term58137, term58137.getClass(), "mdl_have", "qlaIVJBSfQ");
        setField(term58137, term58137.getClass(), "cstmz_itm_have", "lYvIWBFFsq");
        setBooleanField(term58137, term58137.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term58137, term58137.getClass(), "use_mdl_pri", false);
        setBooleanField(term58137, term58137.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term58137, term58137.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term58137, term58137.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term58137, term58137.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term58137, term58137.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term58137, term58137.getClass(), "vcld_pts", -423900705);
        setIntField(term58137, term58137.getClass(), "nxt_pv_id", -525570815);
        setField(term58137, term58137.getClass(), "nxt_dffclty", enum137);
        setField(term58137, term58137.getClass(), "nxt_edtn", enum138);
        setField(term58137, term58137.getClass(), "cv_cid", "tThwsqWKcE");
        setField(term58137, term58137.getClass(), "cv_sc", "bkSgsDrkCN");
        setField(term58137, term58137.getClass(), "cv_rr", "hwjlcimgJH");
        setField(term58137, term58137.getClass(), "cv_bv", "TLxQzxvizR");
        setField(term58137, term58137.getClass(), "cv_bf", "uUgJfKAzDM");
        setIntField(term58137, term58137.getClass(), "cnp_cid", 754055848);
        setIntField(term58137, term58137.getClass(), "cnp_val", -19246901);
        setField(term58137, term58137.getClass(), "cnp_rr", enum139);
        setField(term58137, term58137.getClass(), "cnp_sp", "gZPZNkweEp");
        setField(term58137, term58137.getClass(), "my_lst_0", "vfennwtmqe");
        setField(term58137, term58137.getClass(), "my_lst_1", "zZxoNkohbw");
        setField(term58137, term58137.getClass(), "my_lst_2", "DQrjPcLysX");
        setField(term58137, term58137.getClass(), "my_lst_3", "VWPFyrpmmb");
        setField(term58137, term58137.getClass(), "my_lst_4", "gYYKrIeThw");
        setField(term58137, term58137.getClass(), "dsp_clr_brdr", "UsxeLMVkAK");
        setBooleanField(term58137, term58137.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term58137, term58137.getClass(), "dsp_clr_sts", false);
        setField(term58137, term58137.getClass(), "clr_sts", "ITrhiKKzcb");
        setBooleanField(term58137, term58137.getClass(), "rgo_sts", false);
        setField(term58137, term58137.getClass(), "my_qst_id", "qMKmSzOQXg");
        setField(term58137, term58137.getClass(), "my_qst_sts", "CURQCMkqbZ");
        setField(term58137, term58137.getClass(), "my_qst_prgrs", "VZwkkQktrm");
        setField(term58137, term58137.getClass(), "my_qst_et", "wIuJvIvEMb");
        setField(term58137, term58137.getClass(), "p_std_ie_have", "EyojsbSjWT");
        setField(term58137, term58137.getClass(), "p_std_se_have", "szGicGyWDL");
        setField(term58137, term58137.getClass(), "cmd", "lkdvUiYwRq");
        setField(term58137, term58137.getClass(), "req_id", "XuxkPrpfND");
        setField(term58137, term58137.getClass(), "stat", "OxNXeKMDje");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUse_pv_chn_sld_se_eqp", argTypes, term58137, args);
    }

};


