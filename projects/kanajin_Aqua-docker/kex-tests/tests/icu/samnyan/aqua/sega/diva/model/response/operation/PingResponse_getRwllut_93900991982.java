package icu.samnyan.aqua.sega.diva.model.response.operation;

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
import static icu.samnyan.aqua.sega.diva.model.response.operation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PingResponse_getRwllut_93900991982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50777;

    public PingResponse_getRwllut_93900991982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50777 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term50777, term50777.getClass(), "ping_b_msg", null);
        setField(term50777, term50777.getClass(), "ping_m_msg", null);
        setField(term50777, term50777.getClass(), "atnd_lut", null);
        setField(term50777, term50777.getClass(), "fi_lut", null);
        setField(term50777, term50777.getClass(), "ci_lut", null);
        setField(term50777, term50777.getClass(), "qi_lut", null);
        setField(term50777, term50777.getClass(), "pvl_lut", null);
        setField(term50777, term50777.getClass(), "pdcl_lut", null);
        setField(term50777, term50777.getClass(), "pnml_lut", null);
        setField(term50777, term50777.getClass(), "cinml_lut", null);
        setField(term50777, term50777.getClass(), "rwl_lut", null);
        setField(term50777, term50777.getClass(), "bdlol_lut", null);
        setField(term50777, term50777.getClass(), "shp_ctlg_lut", null);
        setField(term50777, term50777.getClass(), "cstmz_itm_ctlg_lut", null);
        setField(term50777, term50777.getClass(), "ngwl_lut", null);
        setField(term50777, term50777.getClass(), "rnk_nv_lut", null);
        setField(term50777, term50777.getClass(), "rnk_ps_lut", null);
        setField(term50777, term50777.getClass(), "bi_lut", null);
        setField(term50777, term50777.getClass(), "cpi_lut", null);
        setField(term50777, term50777.getClass(), "p_std_hc_lut", null);
        setField(term50777, term50777.getClass(), "p_std_i_n_lut", null);
        setField(term50777, term50777.getClass(), "req_inv_cmd_num", null);
        setField(term50777, term50777.getClass(), "req_inv_cmd_prm1", null);
        setField(term50777, term50777.getClass(), "req_inv_cmd_prm2", null);
        setField(term50777, term50777.getClass(), "req_inv_cmd_prm3", null);
        setField(term50777, term50777.getClass(), "req_inv_cmd_prm4", null);
        setBooleanField(term50777, term50777.getClass(), "pow_save_flg", false);
        setField(term50777, term50777.getClass(), "nblss_dnt_p", null);
        setField(term50777, term50777.getClass(), "nblss_ltt_rl_vp", null);
        setField(term50777, term50777.getClass(), "nblss_ex_ltt_flg", null);
        setField(term50777, term50777.getClass(), "nblss_dnt_st_tm", null);
        setField(term50777, term50777.getClass(), "nblss_dnt_ed_tm", null);
        setField(term50777, term50777.getClass(), "nblss_ltt_st_tm", null);
        setField(term50777, term50777.getClass(), "nblss_ltt_ed_tm", null);
        setField(term50777, term50777.getClass(), "cmd", null);
        setField(term50777, term50777.getClass(), "req_id", null);
        setField(term50777, term50777.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRwl_lut", argTypes, term50777, args);
    }

};


