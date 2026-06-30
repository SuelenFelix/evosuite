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

public class PingResponse_setBilut_201600229953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37985;

    public PingResponse_setBilut_201600229953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38299 = new Integer(-1498296052);
        Integer term38301 = new Integer(2098647989);
        Integer term38303 = new Integer(1598895173);
        term37985 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term37985, term37985.getClass(), "ping_b_msg", "jSTBfkWjge");
        setField(term37985, term37985.getClass(), "ping_m_msg", "uKYhZULSHp");
        setField(term37985, term37985.getClass(), "atnd_lut", "xdYuLllgpn");
        setField(term37985, term37985.getClass(), "fi_lut", "ayonlqalLA");
        setField(term37985, term37985.getClass(), "ci_lut", "fzzIOVxKdF");
        setField(term37985, term37985.getClass(), "qi_lut", "cdvmxZaBEK");
        setField(term37985, term37985.getClass(), "pvl_lut", "QHYZiyDyPC");
        setField(term37985, term37985.getClass(), "pdcl_lut", "kcHMyiheuH");
        setField(term37985, term37985.getClass(), "pnml_lut", "DGMBBNDEYs");
        setField(term37985, term37985.getClass(), "cinml_lut", "vpuKZSMmKQ");
        setField(term37985, term37985.getClass(), "rwl_lut", "IXQQwaXITf");
        setField(term37985, term37985.getClass(), "bdlol_lut", "fNzFTiRCjp");
        setField(term37985, term37985.getClass(), "shp_ctlg_lut", "yaCGGogKro");
        setField(term37985, term37985.getClass(), "cstmz_itm_ctlg_lut", "qxrRUnjshF");
        setField(term37985, term37985.getClass(), "ngwl_lut", "WmVcapKAeJ");
        setField(term37985, term37985.getClass(), "rnk_nv_lut", "jevOVdQdpc");
        setField(term37985, term37985.getClass(), "rnk_ps_lut", "TLLVSGTNsz");
        setField(term37985, term37985.getClass(), "bi_lut", "mbBWfaHCrP");
        setField(term37985, term37985.getClass(), "cpi_lut", "wFyiZloCxg");
        setField(term37985, term37985.getClass(), "p_std_hc_lut", "xYztJEIPWy");
        setField(term37985, term37985.getClass(), "p_std_i_n_lut", "TDQIAXaJru");
        setField(term37985, term37985.getClass(), "req_inv_cmd_num", "frPMFqGmrE");
        setField(term37985, term37985.getClass(), "req_inv_cmd_prm1", "DvfOYWcNBN");
        setField(term37985, term37985.getClass(), "req_inv_cmd_prm2", "cvbvwpPlNk");
        setField(term37985, term37985.getClass(), "req_inv_cmd_prm3", "uCdLbhvYeG");
        setField(term37985, term37985.getClass(), "req_inv_cmd_prm4", "ipoyEHBfoG");
        setBooleanField(term37985, term37985.getClass(), "pow_save_flg", false);
        setField(term37985, term37985.getClass(), "nblss_dnt_p", term38299);
        setField(term37985, term37985.getClass(), "nblss_ltt_rl_vp", term38301);
        setField(term37985, term37985.getClass(), "nblss_ex_ltt_flg", term38303);
        setField(term37985, term37985.getClass(), "nblss_dnt_st_tm", "iSBTpbiteU");
        setField(term37985, term37985.getClass(), "nblss_dnt_ed_tm", "MTwFbEoMZj");
        setField(term37985, term37985.getClass(), "nblss_ltt_st_tm", "uEQbnHbyAn");
        setField(term37985, term37985.getClass(), "nblss_ltt_ed_tm", "JpFIuyNEKW");
        setField(term37985, term37985.getClass(), "cmd", "NksHsgcqDx");
        setField(term37985, term37985.getClass(), "req_id", "RjSNvOEvcT");
        setField(term37985, term37985.getClass(), "stat", "HLzuMxigqS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wiBOoDCyzd";
        callMethod(klass, "setBi_lut", argTypes, term37985, args);
    }

};


