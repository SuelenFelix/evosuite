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
import java.lang.Integer;

public class PingResponse_setQilut_164365105041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28913;

    public PingResponse_setQilut_164365105041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29227 = new Integer(-1963434938);
        Integer term29229 = new Integer(906181092);
        Integer term29231 = new Integer(1045657203);
        term28913 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term28913, term28913.getClass(), "ping_b_msg", "iVIrSxTsaM");
        setField(term28913, term28913.getClass(), "ping_m_msg", "FmJNEfmYgq");
        setField(term28913, term28913.getClass(), "atnd_lut", "NqQofgWsJd");
        setField(term28913, term28913.getClass(), "fi_lut", "ZlVRdHsBMO");
        setField(term28913, term28913.getClass(), "ci_lut", "UMMXkhuqzw");
        setField(term28913, term28913.getClass(), "qi_lut", "KyGXZcXJwq");
        setField(term28913, term28913.getClass(), "pvl_lut", "TqiCjeuoWE");
        setField(term28913, term28913.getClass(), "pdcl_lut", "GWWfkXOYLP");
        setField(term28913, term28913.getClass(), "pnml_lut", "qvykDllgpT");
        setField(term28913, term28913.getClass(), "cinml_lut", "hzdUbcLZhZ");
        setField(term28913, term28913.getClass(), "rwl_lut", "GlxnEJvYeC");
        setField(term28913, term28913.getClass(), "bdlol_lut", "SLdOGaqmNv");
        setField(term28913, term28913.getClass(), "shp_ctlg_lut", "QZfhwDBzyR");
        setField(term28913, term28913.getClass(), "cstmz_itm_ctlg_lut", "HvnMmAOZev");
        setField(term28913, term28913.getClass(), "ngwl_lut", "JTPAQsfRtT");
        setField(term28913, term28913.getClass(), "rnk_nv_lut", "otxkkKfDfl");
        setField(term28913, term28913.getClass(), "rnk_ps_lut", "bqIuFFFwnP");
        setField(term28913, term28913.getClass(), "bi_lut", "hDxvvVgGlk");
        setField(term28913, term28913.getClass(), "cpi_lut", "XdjSvjaTqk");
        setField(term28913, term28913.getClass(), "p_std_hc_lut", "ukrlYVcvsg");
        setField(term28913, term28913.getClass(), "p_std_i_n_lut", "cpjqTCNflQ");
        setField(term28913, term28913.getClass(), "req_inv_cmd_num", "wiYGATEfmw");
        setField(term28913, term28913.getClass(), "req_inv_cmd_prm1", "FiALSqneIg");
        setField(term28913, term28913.getClass(), "req_inv_cmd_prm2", "lGVACSQceQ");
        setField(term28913, term28913.getClass(), "req_inv_cmd_prm3", "jpgWRbSvyQ");
        setField(term28913, term28913.getClass(), "req_inv_cmd_prm4", "tFMlYmPEBX");
        setBooleanField(term28913, term28913.getClass(), "pow_save_flg", false);
        setField(term28913, term28913.getClass(), "nblss_dnt_p", term29227);
        setField(term28913, term28913.getClass(), "nblss_ltt_rl_vp", term29229);
        setField(term28913, term28913.getClass(), "nblss_ex_ltt_flg", term29231);
        setField(term28913, term28913.getClass(), "nblss_dnt_st_tm", "ljkZxGNgjZ");
        setField(term28913, term28913.getClass(), "nblss_dnt_ed_tm", "hrFtgdcZKS");
        setField(term28913, term28913.getClass(), "nblss_ltt_st_tm", "ZhZJvpPaTU");
        setField(term28913, term28913.getClass(), "nblss_ltt_ed_tm", "NZwUsJxDLI");
        setField(term28913, term28913.getClass(), "cmd", "wlusYBOfXW");
        setField(term28913, term28913.getClass(), "req_id", "HEWWLhfKIa");
        setField(term28913, term28913.getClass(), "stat", "mJJkYzNPob");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mRDwekkZQg";
        callMethod(klass, "setQi_lut", argTypes, term28913, args);
    }

};


