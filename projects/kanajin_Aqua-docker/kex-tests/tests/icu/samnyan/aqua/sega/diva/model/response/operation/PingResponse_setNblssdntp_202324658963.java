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

public class PingResponse_setNblssdntp_202324658963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45525;
     Object term45929;

    public PingResponse_setNblssdntp_202324658963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45839 = new Integer(991356662);
        Integer term45841 = new Integer(-506958186);
        Integer term45843 = new Integer(-507387516);
        term45525 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term45525, term45525.getClass(), "ping_b_msg", "bANxpqKESI");
        setField(term45525, term45525.getClass(), "ping_m_msg", "sgpUSVSuVZ");
        setField(term45525, term45525.getClass(), "atnd_lut", "ZOYhOzwINI");
        setField(term45525, term45525.getClass(), "fi_lut", "sPqjQQfymN");
        setField(term45525, term45525.getClass(), "ci_lut", "tNKFzflLBd");
        setField(term45525, term45525.getClass(), "qi_lut", "xHLlctEoGh");
        setField(term45525, term45525.getClass(), "pvl_lut", "aqgUzcnqpE");
        setField(term45525, term45525.getClass(), "pdcl_lut", "yZDlWLIKEp");
        setField(term45525, term45525.getClass(), "pnml_lut", "dAEiXUxDrI");
        setField(term45525, term45525.getClass(), "cinml_lut", "AgQWngzXPH");
        setField(term45525, term45525.getClass(), "rwl_lut", "EZJmAIzdHM");
        setField(term45525, term45525.getClass(), "bdlol_lut", "LAOkeXXkDr");
        setField(term45525, term45525.getClass(), "shp_ctlg_lut", "YkZqFgrgVM");
        setField(term45525, term45525.getClass(), "cstmz_itm_ctlg_lut", "QEJBgSNviH");
        setField(term45525, term45525.getClass(), "ngwl_lut", "bjigisSVNp");
        setField(term45525, term45525.getClass(), "rnk_nv_lut", "yJCCaWqQuK");
        setField(term45525, term45525.getClass(), "rnk_ps_lut", "tgBNqkdndl");
        setField(term45525, term45525.getClass(), "bi_lut", "GXKhRJLVFZ");
        setField(term45525, term45525.getClass(), "cpi_lut", "qDflhZTJjR");
        setField(term45525, term45525.getClass(), "p_std_hc_lut", "bzQSjpIauE");
        setField(term45525, term45525.getClass(), "p_std_i_n_lut", "ESQqarFUtp");
        setField(term45525, term45525.getClass(), "req_inv_cmd_num", "TiCRQbKtcf");
        setField(term45525, term45525.getClass(), "req_inv_cmd_prm1", "shGEZulpDG");
        setField(term45525, term45525.getClass(), "req_inv_cmd_prm2", "twDnEqZglX");
        setField(term45525, term45525.getClass(), "req_inv_cmd_prm3", "TWzZFATLAj");
        setField(term45525, term45525.getClass(), "req_inv_cmd_prm4", "QjsqHrtVMY");
        setBooleanField(term45525, term45525.getClass(), "pow_save_flg", true);
        setField(term45525, term45525.getClass(), "nblss_dnt_p", term45839);
        setField(term45525, term45525.getClass(), "nblss_ltt_rl_vp", term45841);
        setField(term45525, term45525.getClass(), "nblss_ex_ltt_flg", term45843);
        setField(term45525, term45525.getClass(), "nblss_dnt_st_tm", "PlQZGGhnZK");
        setField(term45525, term45525.getClass(), "nblss_dnt_ed_tm", "sTtLCWDEPO");
        setField(term45525, term45525.getClass(), "nblss_ltt_st_tm", "UGMtNRjhnC");
        setField(term45525, term45525.getClass(), "nblss_ltt_ed_tm", "oTnPmmIphJ");
        setField(term45525, term45525.getClass(), "cmd", "vTgJolwQXF");
        setField(term45525, term45525.getClass(), "req_id", "QuNSfeKtAH");
        setField(term45525, term45525.getClass(), "stat", "vFhRdscfFA");
        term45929 = new Integer(-1970452551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term45929;
        callMethod(klass, "setNblss_dnt_p", argTypes, term45525, args);
    }

};


