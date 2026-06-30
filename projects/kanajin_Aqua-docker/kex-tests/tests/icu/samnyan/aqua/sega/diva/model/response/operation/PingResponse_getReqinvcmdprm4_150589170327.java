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

public class PingResponse_getReqinvcmdprm4_150589170327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18527;

    public PingResponse_getReqinvcmdprm4_150589170327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18841 = new Integer(1551099402);
        Integer term18843 = new Integer(-2027534003);
        Integer term18845 = new Integer(1063420942);
        term18527 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term18527, term18527.getClass(), "ping_b_msg", "JBOPGgGKnc");
        setField(term18527, term18527.getClass(), "ping_m_msg", "GlPTiCMCGP");
        setField(term18527, term18527.getClass(), "atnd_lut", "jlcBpLoWfd");
        setField(term18527, term18527.getClass(), "fi_lut", "oYymmLqbfJ");
        setField(term18527, term18527.getClass(), "ci_lut", "YaDWphDOSz");
        setField(term18527, term18527.getClass(), "qi_lut", "nnnmCgFBLw");
        setField(term18527, term18527.getClass(), "pvl_lut", "hSSCyNEhyH");
        setField(term18527, term18527.getClass(), "pdcl_lut", "jDFNSuvZqm");
        setField(term18527, term18527.getClass(), "pnml_lut", "pLvkKHqNYX");
        setField(term18527, term18527.getClass(), "cinml_lut", "PwqnuJJwjR");
        setField(term18527, term18527.getClass(), "rwl_lut", "NFkbBiPeiw");
        setField(term18527, term18527.getClass(), "bdlol_lut", "tlRvilQyjJ");
        setField(term18527, term18527.getClass(), "shp_ctlg_lut", "gwTUlYNpjM");
        setField(term18527, term18527.getClass(), "cstmz_itm_ctlg_lut", "uXYojRmxrM");
        setField(term18527, term18527.getClass(), "ngwl_lut", "cxRwRcodud");
        setField(term18527, term18527.getClass(), "rnk_nv_lut", "GDGBPlYeLn");
        setField(term18527, term18527.getClass(), "rnk_ps_lut", "jdQANIXSTq");
        setField(term18527, term18527.getClass(), "bi_lut", "stVcZLTNpu");
        setField(term18527, term18527.getClass(), "cpi_lut", "LgXdqWrsLL");
        setField(term18527, term18527.getClass(), "p_std_hc_lut", "bbHWyibNmy");
        setField(term18527, term18527.getClass(), "p_std_i_n_lut", "vYYOYhWMWZ");
        setField(term18527, term18527.getClass(), "req_inv_cmd_num", "FLQJOzEXff");
        setField(term18527, term18527.getClass(), "req_inv_cmd_prm1", "qlaIVJBSfQ");
        setField(term18527, term18527.getClass(), "req_inv_cmd_prm2", "lYvIWBFFsq");
        setField(term18527, term18527.getClass(), "req_inv_cmd_prm3", "tThwsqWKcE");
        setField(term18527, term18527.getClass(), "req_inv_cmd_prm4", "bkSgsDrkCN");
        setBooleanField(term18527, term18527.getClass(), "pow_save_flg", false);
        setField(term18527, term18527.getClass(), "nblss_dnt_p", term18841);
        setField(term18527, term18527.getClass(), "nblss_ltt_rl_vp", term18843);
        setField(term18527, term18527.getClass(), "nblss_ex_ltt_flg", term18845);
        setField(term18527, term18527.getClass(), "nblss_dnt_st_tm", "hwjlcimgJH");
        setField(term18527, term18527.getClass(), "nblss_dnt_ed_tm", "TLxQzxvizR");
        setField(term18527, term18527.getClass(), "nblss_ltt_st_tm", "uUgJfKAzDM");
        setField(term18527, term18527.getClass(), "nblss_ltt_ed_tm", "gZPZNkweEp");
        setField(term18527, term18527.getClass(), "cmd", "vfennwtmqe");
        setField(term18527, term18527.getClass(), "req_id", "zZxoNkohbw");
        setField(term18527, term18527.getClass(), "stat", "DQrjPcLysX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReq_inv_cmd_prm4", argTypes, term18527, args);
    }

};


