package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StageResultRequest_getCrtv_1726907640263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210941;

    public StageResultRequest_getCrtv_1726907640263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210941 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StageResultRequest"));
        setIntField(term210941, term210941.getClass(), "pd_id", 0);
        setIntField(term210941, term210941.getClass(), "accept_idx", 0);
        setIntField(term210941, term210941.getClass(), "start_idx", 0);
        setIntField(term210941, term210941.getClass(), "hp_vol", 0);
        setBooleanField(term210941, term210941.getClass(), "btn_se_vol", false);
        setIntField(term210941, term210941.getClass(), "btn_se_vol2", 0);
        setIntField(term210941, term210941.getClass(), "sldr_se_vol2", 0);
        setBooleanField(term210941, term210941.getClass(), "use_pv_mdl_eqp", false);
        setIntField(term210941, term210941.getClass(), "vcld_pts", 0);
        setIntField(term210941, term210941.getClass(), "nxt_pv_id", 0);
        setIntField(term210941, term210941.getClass(), "nxt_dffclty", 0);
        setIntField(term210941, term210941.getClass(), "nxt_edtn", 0);
        setIntField(term210941, term210941.getClass(), "sort_kind", 0);
        setIntField(term210941, term210941.getClass(), "nblss_ltt_stts", 0);
        setIntField(term210941, term210941.getClass(), "nblss_ltt_tckt", 0);
        setField(term210941, term210941.getClass(), "my_qst_id", null);
        setField(term210941, term210941.getClass(), "my_qst_sts", null);
        setBooleanField(term210941, term210941.getClass(), "free_play", false);
        setIntField(term210941, term210941.getClass(), "game_type", 0);
        setField(term210941, term210941.getClass(), "stg_difficulty", null);
        setField(term210941, term210941.getClass(), "stg_edtn", null);
        setField(term210941, term210941.getClass(), "stg_ply_pv_id", null);
        setField(term210941, term210941.getClass(), "stg_sel_pv_id", null);
        setField(term210941, term210941.getClass(), "stg_scrpt_ver", null);
        setField(term210941, term210941.getClass(), "stg_score", null);
        setField(term210941, term210941.getClass(), "stg_chllng_kind", null);
        setField(term210941, term210941.getClass(), "stg_chllng_result", null);
        setField(term210941, term210941.getClass(), "stg_clr_kind", null);
        setField(term210941, term210941.getClass(), "stg_vcld_pts", null);
        setField(term210941, term210941.getClass(), "stg_cool_cnt", null);
        setField(term210941, term210941.getClass(), "stg_cool_pct", null);
        setField(term210941, term210941.getClass(), "stg_fine_cnt", null);
        setField(term210941, term210941.getClass(), "stg_fine_pct", null);
        setField(term210941, term210941.getClass(), "stg_safe_cnt", null);
        setField(term210941, term210941.getClass(), "stg_safe_pct", null);
        setField(term210941, term210941.getClass(), "stg_sad_cnt", null);
        setField(term210941, term210941.getClass(), "stg_sad_pct", null);
        setField(term210941, term210941.getClass(), "stg_wt_wg_cnt", null);
        setField(term210941, term210941.getClass(), "stg_wt_wg_pct", null);
        setField(term210941, term210941.getClass(), "stg_max_cmb", null);
        setField(term210941, term210941.getClass(), "stg_chance_tm", null);
        setField(term210941, term210941.getClass(), "stg_sm_hl", null);
        setField(term210941, term210941.getClass(), "stg_atn_pnt", null);
        setField(term210941, term210941.getClass(), "stg_skin_id", null);
        setField(term210941, term210941.getClass(), "stg_btn_se", null);
        setField(term210941, term210941.getClass(), "stg_btn_se_vol", null);
        setField(term210941, term210941.getClass(), "stg_sld_se", null);
        setField(term210941, term210941.getClass(), "stg_chn_sld_se", null);
        setField(term210941, term210941.getClass(), "stg_sldr_tch_se", null);
        setField(term210941, term210941.getClass(), "stg_mdl_id", null);
        setField(term210941, term210941.getClass(), "stg_sel_mdl_id", null);
        setField(term210941, term210941.getClass(), "stg_rvl_pd_id", null);
        setField(term210941, term210941.getClass(), "stg_rvl_wl", null);
        setField(term210941, term210941.getClass(), "stg_cpt_rslt", null);
        setField(term210941, term210941.getClass(), "stg_sld_scr", null);
        setField(term210941, term210941.getClass(), "stg_is_sr_gm", null);
        setField(term210941, term210941.getClass(), "stg_pv_brnch_rslt", null);
        setField(term210941, term210941.getClass(), "stg_vcl_chg", null);
        setField(term210941, term210941.getClass(), "stg_c_itm_id", null);
        setField(term210941, term210941.getClass(), "stg_ms_itm_flg", null);
        setField(term210941, term210941.getClass(), "stg_rgo", null);
        setField(term210941, term210941.getClass(), "stg_ss_num", null);
        setField(term210941, term210941.getClass(), "stg_is_cs_scs", null);
        setField(term210941, term210941.getClass(), "stg_is_nppg_use", null);
        setField(term210941, term210941.getClass(), "stg_p_std_lo_id", null);
        setField(term210941, term210941.getClass(), "stg_p_std_is_to", null);
        setField(term210941, term210941.getClass(), "stg_p_std_is_ccu", null);
        setField(term210941, term210941.getClass(), "stg_p_std_is_tiu", null);
        setField(term210941, term210941.getClass(), "stg_p_std_is_iu", null);
        setField(term210941, term210941.getClass(), "stg_p_std_is_npu", null);
        setField(term210941, term210941.getClass(), "stg_p_std_is_du", null);
        setIntField(term210941, term210941.getClass(), "ply_pv_id", 0);
        setIntField(term210941, term210941.getClass(), "ttl_vp_add", 0);
        setIntField(term210941, term210941.getClass(), "ttl_vp_sub", 0);
        setIntField(term210941, term210941.getClass(), "continue_cnt", 0);
        setField(term210941, term210941.getClass(), "gu_cmd", null);
        setField(term210941, term210941.getClass(), "mdl_eqp_cmn_ary", null);
        setField(term210941, term210941.getClass(), "c_itm_eqp_cmn_ary", null);
        setField(term210941, term210941.getClass(), "ms_itm_flg_cmn_ary", null);
        setField(term210941, term210941.getClass(), "mdl_eqp_pv_ary", null);
        setField(term210941, term210941.getClass(), "c_itm_eqp_pv_ary", null);
        setField(term210941, term210941.getClass(), "ms_itm_flg_pv_ary", null);
        setField(term210941, term210941.getClass(), "stg_mdl_s_sts", null);
        setIntField(term210941, term210941.getClass(), "cr_cid", 0);
        setIntField(term210941, term210941.getClass(), "cr_sc", 0);
        setIntField(term210941, term210941.getClass(), "cr_tv", 0);
        setIntField(term210941, term210941.getClass(), "cr_if", 0);
        setField(term210941, term210941.getClass(), "cr_sp", null);
        setField(term210941, term210941.getClass(), "cmd", null);
        setField(term210941, term210941.getClass(), "req_id", null);
        setField(term210941, term210941.getClass(), "game_id", null);
        setField(term210941, term210941.getClass(), "r_ver", null);
        setField(term210941, term210941.getClass(), "kc_serial", null);
        setField(term210941, term210941.getClass(), "b_serial", null);
        setField(term210941, term210941.getClass(), "place_id", null);
        setField(term210941, term210941.getClass(), "time_stamp", null);
        setField(term210941, term210941.getClass(), "start_up_mode", null);
        setField(term210941, term210941.getClass(), "cmm_dly_mod", null);
        setField(term210941, term210941.getClass(), "cmm_dly_sec", null);
        setField(term210941, term210941.getClass(), "cmm_err_mod", null);
        setField(term210941, term210941.getClass(), "country_code", null);
        setField(term210941, term210941.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StageResultRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCr_tv", argTypes, term210941, args);
    }

};


