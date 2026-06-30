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

public class StartResponse_isDspintrmrnk_1003366291163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243998;

    public StartResponse_isDspintrmrnk_1003366291163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243998 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        setIntField(term243998, term243998.getClass(), "pd_id", 0);
        setField(term243998, term243998.getClass(), "start_result", null);
        setIntField(term243998, term243998.getClass(), "accept_idx", 0);
        setIntField(term243998, term243998.getClass(), "start_idx", 0);
        setField(term243998, term243998.getClass(), "player_name", null);
        setIntField(term243998, term243998.getClass(), "hp_vol", 0);
        setBooleanField(term243998, term243998.getClass(), "btn_se_vol", false);
        setIntField(term243998, term243998.getClass(), "btn_se_vol2", 0);
        setIntField(term243998, term243998.getClass(), "sldr_se_vol2", 0);
        setField(term243998, term243998.getClass(), "sort_kind", null);
        setIntField(term243998, term243998.getClass(), "lv_num", 0);
        setIntField(term243998, term243998.getClass(), "lv_pnt", 0);
        setField(term243998, term243998.getClass(), "lv_str", null);
        setIntField(term243998, term243998.getClass(), "lv_efct_id", 0);
        setIntField(term243998, term243998.getClass(), "lv_plt_id", 0);
        setField(term243998, term243998.getClass(), "mdl_eqp_ary", null);
        setField(term243998, term243998.getClass(), "c_itm_eqp_ary", null);
        setField(term243998, term243998.getClass(), "ms_itm_flg_ary", null);
        setField(term243998, term243998.getClass(), "mdl_eqp_tm", null);
        setField(term243998, term243998.getClass(), "mdl_have", null);
        setField(term243998, term243998.getClass(), "cstmz_itm_have", null);
        setBooleanField(term243998, term243998.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term243998, term243998.getClass(), "use_mdl_pri", false);
        setBooleanField(term243998, term243998.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term243998, term243998.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term243998, term243998.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term243998, term243998.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term243998, term243998.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term243998, term243998.getClass(), "vcld_pts", 0);
        setIntField(term243998, term243998.getClass(), "nxt_pv_id", 0);
        setField(term243998, term243998.getClass(), "nxt_dffclty", null);
        setField(term243998, term243998.getClass(), "nxt_edtn", null);
        setField(term243998, term243998.getClass(), "cv_cid", null);
        setField(term243998, term243998.getClass(), "cv_sc", null);
        setField(term243998, term243998.getClass(), "cv_rr", null);
        setField(term243998, term243998.getClass(), "cv_bv", null);
        setField(term243998, term243998.getClass(), "cv_bf", null);
        setIntField(term243998, term243998.getClass(), "cnp_cid", 0);
        setIntField(term243998, term243998.getClass(), "cnp_val", 0);
        setField(term243998, term243998.getClass(), "cnp_rr", null);
        setField(term243998, term243998.getClass(), "cnp_sp", null);
        setField(term243998, term243998.getClass(), "my_lst_0", null);
        setField(term243998, term243998.getClass(), "my_lst_1", null);
        setField(term243998, term243998.getClass(), "my_lst_2", null);
        setField(term243998, term243998.getClass(), "my_lst_3", null);
        setField(term243998, term243998.getClass(), "my_lst_4", null);
        setField(term243998, term243998.getClass(), "dsp_clr_brdr", null);
        setBooleanField(term243998, term243998.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term243998, term243998.getClass(), "dsp_clr_sts", false);
        setField(term243998, term243998.getClass(), "clr_sts", null);
        setBooleanField(term243998, term243998.getClass(), "rgo_sts", false);
        setField(term243998, term243998.getClass(), "my_qst_id", null);
        setField(term243998, term243998.getClass(), "my_qst_sts", null);
        setField(term243998, term243998.getClass(), "my_qst_prgrs", null);
        setField(term243998, term243998.getClass(), "my_qst_et", null);
        setField(term243998, term243998.getClass(), "p_std_ie_have", null);
        setField(term243998, term243998.getClass(), "p_std_se_have", null);
        setField(term243998, term243998.getClass(), "cmd", null);
        setField(term243998, term243998.getClass(), "req_id", null);
        setField(term243998, term243998.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDsp_intrm_rnk", argTypes, term243998, args);
    }

};


