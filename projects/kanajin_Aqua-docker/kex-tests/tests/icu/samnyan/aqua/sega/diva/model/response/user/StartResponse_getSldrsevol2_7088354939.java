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

public class StartResponse_getSldrsevol2_7088354939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20633;

    public StartResponse_getSldrsevol2_7088354939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21076 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term21075 = ((Class) term21076).getDeclaredField((String) "SUCCESS");
        ((Field) term21075).setAccessible(true);
        Object enum45 = ((Field) term21075).get((Object) null);
        Class<? extends Object> term21344 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term21343 = ((Class) term21344).getDeclaredField((String) "MY_LIST_A");
        ((Field) term21343).setAccessible(true);
        Object enum46 = ((Field) term21343).get((Object) null);
        Class<? extends Object> term21678 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term21677 = ((Class) term21678).getDeclaredField((String) "NORMAL");
        ((Field) term21677).setAccessible(true);
        Object enum47 = ((Field) term21677).get((Object) null);
        Class<? extends Object> term21953 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term21952 = ((Class) term21953).getDeclaredField((String) "EXTRA");
        ((Field) term21952).setAccessible(true);
        Object enum48 = ((Field) term21952).get((Object) null);
        Class<? extends Object> term22260 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term22259 = ((Class) term22260).getDeclaredField((String) "SILVER");
        ((Field) term22259).setAccessible(true);
        Object enum49 = ((Field) term22259).get((Object) null);
        term20633 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term20731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20736 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20633, term20633.getClass(), "pd_id", 1358829571);
        setField(term20633, term20633.getClass(), "start_result", enum45);
        setIntField(term20633, term20633.getClass(), "accept_idx", 991356662);
        setIntField(term20633, term20633.getClass(), "start_idx", -506958186);
        setField(term20633, term20633.getClass(), "player_name", "hePqROaplw");
        setIntField(term20633, term20633.getClass(), "hp_vol", -507387516);
        setBooleanField(term20633, term20633.getClass(), "btn_se_vol", false);
        setIntField(term20633, term20633.getClass(), "btn_se_vol2", -1970452551);
        setIntField(term20633, term20633.getClass(), "sldr_se_vol2", -1896376975);
        setField(term20633, term20633.getClass(), "sort_kind", enum46);
        setIntField(term20633, term20633.getClass(), "lv_num", 729658803);
        setIntField(term20633, term20633.getClass(), "lv_pnt", 114754804);
        setField(term20633, term20633.getClass(), "lv_str", "PJcSNDruWd");
        setIntField(term20633, term20633.getClass(), "lv_efct_id", 1687361082);
        setIntField(term20633, term20633.getClass(), "lv_plt_id", 584893196);
        setField(term20633, term20633.getClass(), "mdl_eqp_ary", "VVNNlAePXF");
        setField(term20633, term20633.getClass(), "c_itm_eqp_ary", "jnwVnmKAFv");
        setField(term20633, term20633.getClass(), "ms_itm_flg_ary", "TXyHhqeCjR");
        setIntField(term20732, term20732.getClass(), "year", 2022);
        setShortField(term20732, term20732.getClass(), "month", (short) 11);
        setShortField(term20732, term20732.getClass(), "day", (short) 16);
        setField(term20731, term20731.getClass(), "date", term20732);
        setByteField(term20736, term20736.getClass(), "hour", (byte) 15);
        setByteField(term20736, term20736.getClass(), "minute", (byte) 54);
        setByteField(term20736, term20736.getClass(), "second", (byte) 2);
        setIntField(term20736, term20736.getClass(), "nano", 733274103);
        setField(term20731, term20731.getClass(), "time", term20736);
        setField(term20633, term20633.getClass(), "mdl_eqp_tm", term20731);
        setField(term20633, term20633.getClass(), "mdl_have", "lZIgPZPgTu");
        setField(term20633, term20633.getClass(), "cstmz_itm_have", "iuCxnHGMoW");
        setBooleanField(term20633, term20633.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term20633, term20633.getClass(), "use_mdl_pri", true);
        setBooleanField(term20633, term20633.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term20633, term20633.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term20633, term20633.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term20633, term20633.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term20633, term20633.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term20633, term20633.getClass(), "vcld_pts", 497269071);
        setIntField(term20633, term20633.getClass(), "nxt_pv_id", -1899301124);
        setField(term20633, term20633.getClass(), "nxt_dffclty", enum47);
        setField(term20633, term20633.getClass(), "nxt_edtn", enum48);
        setField(term20633, term20633.getClass(), "cv_cid", "GPSEWEDSTo");
        setField(term20633, term20633.getClass(), "cv_sc", "RCOqfVsRHt");
        setField(term20633, term20633.getClass(), "cv_rr", "TSyCeEZPaT");
        setField(term20633, term20633.getClass(), "cv_bv", "JeZFtaqkzW");
        setField(term20633, term20633.getClass(), "cv_bf", "vOVuNSCCLe");
        setIntField(term20633, term20633.getClass(), "cnp_cid", -1882480155);
        setIntField(term20633, term20633.getClass(), "cnp_val", -1410220680);
        setField(term20633, term20633.getClass(), "cnp_rr", enum49);
        setField(term20633, term20633.getClass(), "cnp_sp", "fzeqPnzpnt");
        setField(term20633, term20633.getClass(), "my_lst_0", "RxbhrFBjkO");
        setField(term20633, term20633.getClass(), "my_lst_1", "aanyiAOJCl");
        setField(term20633, term20633.getClass(), "my_lst_2", "VDokbsCuqq");
        setField(term20633, term20633.getClass(), "my_lst_3", "xClUIcPECX");
        setField(term20633, term20633.getClass(), "my_lst_4", "avhRaGZaBF");
        setField(term20633, term20633.getClass(), "dsp_clr_brdr", "JkgoRtImdE");
        setBooleanField(term20633, term20633.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term20633, term20633.getClass(), "dsp_clr_sts", true);
        setField(term20633, term20633.getClass(), "clr_sts", "qFGKIJjlmV");
        setBooleanField(term20633, term20633.getClass(), "rgo_sts", true);
        setField(term20633, term20633.getClass(), "my_qst_id", "IHqvyhMtuM");
        setField(term20633, term20633.getClass(), "my_qst_sts", "dAldIGYAXV");
        setField(term20633, term20633.getClass(), "my_qst_prgrs", "mLwibAPEsa");
        setField(term20633, term20633.getClass(), "my_qst_et", "zsWKWiTFuo");
        setField(term20633, term20633.getClass(), "p_std_ie_have", "UPUbwyHQKN");
        setField(term20633, term20633.getClass(), "p_std_se_have", "lgQkrXANyI");
        setField(term20633, term20633.getClass(), "cmd", "MeTmRZXErV");
        setField(term20633, term20633.getClass(), "req_id", "jNxbVmoZgq");
        setField(term20633, term20633.getClass(), "stat", "PvmBHIXaMY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSldr_se_vol2", argTypes, term20633, args);
    }

};


