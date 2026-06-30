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

public class StageStartRequest_getStgrvlpdid_74239538970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245901;

    public StageStartRequest_getStgrvlpdid_74239538970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245901 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StageStartRequest"));
        setIntField(term245901, term245901.getClass(), "pd_id", 0);
        setIntField(term245901, term245901.getClass(), "accept_idx", 0);
        setIntField(term245901, term245901.getClass(), "start_idx", 0);
        setBooleanField(term245901, term245901.getClass(), "free_play", false);
        setIntField(term245901, term245901.getClass(), "game_type", 0);
        setField(term245901, term245901.getClass(), "stg_difficulty", null);
        setField(term245901, term245901.getClass(), "stg_edtn", null);
        setField(term245901, term245901.getClass(), "stg_ply_pv_id", null);
        setField(term245901, term245901.getClass(), "stg_sel_pv_id", null);
        setField(term245901, term245901.getClass(), "stg_scrpt_ver", null);
        setField(term245901, term245901.getClass(), "stg_skin_id", null);
        setField(term245901, term245901.getClass(), "stg_btn_se", null);
        setField(term245901, term245901.getClass(), "stg_btn_se_vol", null);
        setField(term245901, term245901.getClass(), "stg_sld_se", null);
        setField(term245901, term245901.getClass(), "stg_chn_sld_se", null);
        setField(term245901, term245901.getClass(), "stg_sldr_tch_se", null);
        setField(term245901, term245901.getClass(), "stg_mdl_id", null);
        setField(term245901, term245901.getClass(), "stg_sel_mdl_id", null);
        setField(term245901, term245901.getClass(), "stg_rvl_pd_id", null);
        setField(term245901, term245901.getClass(), "stg_c_itm_id", null);
        setField(term245901, term245901.getClass(), "stg_ms_itm_flg", null);
        setField(term245901, term245901.getClass(), "stg_rgo", null);
        setField(term245901, term245901.getClass(), "stg_ss_num", null);
        setField(term245901, term245901.getClass(), "stg_is_cs_scs", null);
        setIntField(term245901, term245901.getClass(), "continue_cnt", 0);
        setField(term245901, term245901.getClass(), "cmd", null);
        setField(term245901, term245901.getClass(), "req_id", null);
        setField(term245901, term245901.getClass(), "game_id", null);
        setField(term245901, term245901.getClass(), "r_ver", null);
        setField(term245901, term245901.getClass(), "kc_serial", null);
        setField(term245901, term245901.getClass(), "b_serial", null);
        setField(term245901, term245901.getClass(), "place_id", null);
        setField(term245901, term245901.getClass(), "time_stamp", null);
        setField(term245901, term245901.getClass(), "start_up_mode", null);
        setField(term245901, term245901.getClass(), "cmm_dly_mod", null);
        setField(term245901, term245901.getClass(), "cmm_dly_sec", null);
        setField(term245901, term245901.getClass(), "cmm_err_mod", null);
        setField(term245901, term245901.getClass(), "country_code", null);
        setField(term245901, term245901.getClass(), "region_code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StageStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStg_rvl_pd_id", argTypes, term245901, args);
    }

};


