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

public class PingResponse_setBdlollut_1606207041117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50847;

    public PingResponse_setBdlollut_1606207041117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50847 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term50847, term50847.getClass(), "ping_b_msg", null);
        setField(term50847, term50847.getClass(), "ping_m_msg", null);
        setField(term50847, term50847.getClass(), "atnd_lut", null);
        setField(term50847, term50847.getClass(), "fi_lut", null);
        setField(term50847, term50847.getClass(), "ci_lut", null);
        setField(term50847, term50847.getClass(), "qi_lut", null);
        setField(term50847, term50847.getClass(), "pvl_lut", null);
        setField(term50847, term50847.getClass(), "pdcl_lut", null);
        setField(term50847, term50847.getClass(), "pnml_lut", null);
        setField(term50847, term50847.getClass(), "cinml_lut", null);
        setField(term50847, term50847.getClass(), "rwl_lut", null);
        setField(term50847, term50847.getClass(), "bdlol_lut", null);
        setField(term50847, term50847.getClass(), "shp_ctlg_lut", null);
        setField(term50847, term50847.getClass(), "cstmz_itm_ctlg_lut", null);
        setField(term50847, term50847.getClass(), "ngwl_lut", null);
        setField(term50847, term50847.getClass(), "rnk_nv_lut", null);
        setField(term50847, term50847.getClass(), "rnk_ps_lut", null);
        setField(term50847, term50847.getClass(), "bi_lut", null);
        setField(term50847, term50847.getClass(), "cpi_lut", null);
        setField(term50847, term50847.getClass(), "p_std_hc_lut", null);
        setField(term50847, term50847.getClass(), "p_std_i_n_lut", null);
        setField(term50847, term50847.getClass(), "req_inv_cmd_num", null);
        setField(term50847, term50847.getClass(), "req_inv_cmd_prm1", null);
        setField(term50847, term50847.getClass(), "req_inv_cmd_prm2", null);
        setField(term50847, term50847.getClass(), "req_inv_cmd_prm3", null);
        setField(term50847, term50847.getClass(), "req_inv_cmd_prm4", null);
        setBooleanField(term50847, term50847.getClass(), "pow_save_flg", false);
        setField(term50847, term50847.getClass(), "nblss_dnt_p", null);
        setField(term50847, term50847.getClass(), "nblss_ltt_rl_vp", null);
        setField(term50847, term50847.getClass(), "nblss_ex_ltt_flg", null);
        setField(term50847, term50847.getClass(), "nblss_dnt_st_tm", null);
        setField(term50847, term50847.getClass(), "nblss_dnt_ed_tm", null);
        setField(term50847, term50847.getClass(), "nblss_ltt_st_tm", null);
        setField(term50847, term50847.getClass(), "nblss_ltt_ed_tm", null);
        setField(term50847, term50847.getClass(), "cmd", null);
        setField(term50847, term50847.getClass(), "req_id", null);
        setField(term50847, term50847.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBdlol_lut", argTypes, term50847, args);
    }

};


