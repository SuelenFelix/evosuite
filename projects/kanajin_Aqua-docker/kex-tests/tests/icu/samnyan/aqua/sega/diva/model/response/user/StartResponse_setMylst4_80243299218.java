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

public class StartResponse_setMylst4_80243299218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245472;

    public StartResponse_setMylst4_80243299218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245472 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        setIntField(term245472, term245472.getClass(), "pd_id", 0);
        setField(term245472, term245472.getClass(), "start_result", null);
        setIntField(term245472, term245472.getClass(), "accept_idx", 0);
        setIntField(term245472, term245472.getClass(), "start_idx", 0);
        setField(term245472, term245472.getClass(), "player_name", null);
        setIntField(term245472, term245472.getClass(), "hp_vol", 0);
        setBooleanField(term245472, term245472.getClass(), "btn_se_vol", false);
        setIntField(term245472, term245472.getClass(), "btn_se_vol2", 0);
        setIntField(term245472, term245472.getClass(), "sldr_se_vol2", 0);
        setField(term245472, term245472.getClass(), "sort_kind", null);
        setIntField(term245472, term245472.getClass(), "lv_num", 0);
        setIntField(term245472, term245472.getClass(), "lv_pnt", 0);
        setField(term245472, term245472.getClass(), "lv_str", null);
        setIntField(term245472, term245472.getClass(), "lv_efct_id", 0);
        setIntField(term245472, term245472.getClass(), "lv_plt_id", 0);
        setField(term245472, term245472.getClass(), "mdl_eqp_ary", null);
        setField(term245472, term245472.getClass(), "c_itm_eqp_ary", null);
        setField(term245472, term245472.getClass(), "ms_itm_flg_ary", null);
        setField(term245472, term245472.getClass(), "mdl_eqp_tm", null);
        setField(term245472, term245472.getClass(), "mdl_have", null);
        setField(term245472, term245472.getClass(), "cstmz_itm_have", null);
        setBooleanField(term245472, term245472.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term245472, term245472.getClass(), "use_mdl_pri", false);
        setBooleanField(term245472, term245472.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term245472, term245472.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term245472, term245472.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term245472, term245472.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term245472, term245472.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term245472, term245472.getClass(), "vcld_pts", 0);
        setIntField(term245472, term245472.getClass(), "nxt_pv_id", 0);
        setField(term245472, term245472.getClass(), "nxt_dffclty", null);
        setField(term245472, term245472.getClass(), "nxt_edtn", null);
        setField(term245472, term245472.getClass(), "cv_cid", null);
        setField(term245472, term245472.getClass(), "cv_sc", null);
        setField(term245472, term245472.getClass(), "cv_rr", null);
        setField(term245472, term245472.getClass(), "cv_bv", null);
        setField(term245472, term245472.getClass(), "cv_bf", null);
        setIntField(term245472, term245472.getClass(), "cnp_cid", 0);
        setIntField(term245472, term245472.getClass(), "cnp_val", 0);
        setField(term245472, term245472.getClass(), "cnp_rr", null);
        setField(term245472, term245472.getClass(), "cnp_sp", null);
        setField(term245472, term245472.getClass(), "my_lst_0", null);
        setField(term245472, term245472.getClass(), "my_lst_1", null);
        setField(term245472, term245472.getClass(), "my_lst_2", null);
        setField(term245472, term245472.getClass(), "my_lst_3", null);
        setField(term245472, term245472.getClass(), "my_lst_4", null);
        setField(term245472, term245472.getClass(), "dsp_clr_brdr", null);
        setBooleanField(term245472, term245472.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term245472, term245472.getClass(), "dsp_clr_sts", false);
        setField(term245472, term245472.getClass(), "clr_sts", null);
        setBooleanField(term245472, term245472.getClass(), "rgo_sts", false);
        setField(term245472, term245472.getClass(), "my_qst_id", null);
        setField(term245472, term245472.getClass(), "my_qst_sts", null);
        setField(term245472, term245472.getClass(), "my_qst_prgrs", null);
        setField(term245472, term245472.getClass(), "my_qst_et", null);
        setField(term245472, term245472.getClass(), "p_std_ie_have", null);
        setField(term245472, term245472.getClass(), "p_std_se_have", null);
        setField(term245472, term245472.getClass(), "cmd", null);
        setField(term245472, term245472.getClass(), "req_id", null);
        setField(term245472, term245472.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMy_lst_4", argTypes, term245472, args);
    }

};


