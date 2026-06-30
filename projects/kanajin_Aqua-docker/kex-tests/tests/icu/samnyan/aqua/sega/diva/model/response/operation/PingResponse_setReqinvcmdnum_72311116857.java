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

public class PingResponse_setReqinvcmdnum_72311116857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41009;

    public PingResponse_setReqinvcmdnum_72311116857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41323 = new Integer(-243422082);
        Integer term41325 = new Integer(1384592638);
        Integer term41327 = new Integer(-1002370457);
        term41009 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term41009, term41009.getClass(), "ping_b_msg", "BrwuUkkatt");
        setField(term41009, term41009.getClass(), "ping_m_msg", "NjmSJhbVEM");
        setField(term41009, term41009.getClass(), "atnd_lut", "aftnGRjhKN");
        setField(term41009, term41009.getClass(), "fi_lut", "TirWkyiCHh");
        setField(term41009, term41009.getClass(), "ci_lut", "lsQrIFMkgZ");
        setField(term41009, term41009.getClass(), "qi_lut", "VgAyBhgBhq");
        setField(term41009, term41009.getClass(), "pvl_lut", "nhpssUKjpK");
        setField(term41009, term41009.getClass(), "pdcl_lut", "lnJVsFNsCN");
        setField(term41009, term41009.getClass(), "pnml_lut", "CUagRkEuzN");
        setField(term41009, term41009.getClass(), "cinml_lut", "eWIWfWobXm");
        setField(term41009, term41009.getClass(), "rwl_lut", "lkPJVVXhDd");
        setField(term41009, term41009.getClass(), "bdlol_lut", "OpMnUyJTrb");
        setField(term41009, term41009.getClass(), "shp_ctlg_lut", "ACBGZgugev");
        setField(term41009, term41009.getClass(), "cstmz_itm_ctlg_lut", "rcbQDpUkab");
        setField(term41009, term41009.getClass(), "ngwl_lut", "oZAbUeXmhW");
        setField(term41009, term41009.getClass(), "rnk_nv_lut", "NDSDpOeQda");
        setField(term41009, term41009.getClass(), "rnk_ps_lut", "HlKwxzAqTg");
        setField(term41009, term41009.getClass(), "bi_lut", "xKjkdjTYfe");
        setField(term41009, term41009.getClass(), "cpi_lut", "HcfabJkuEQ");
        setField(term41009, term41009.getClass(), "p_std_hc_lut", "JlnoFYxLfk");
        setField(term41009, term41009.getClass(), "p_std_i_n_lut", "tMMLkDkFYW");
        setField(term41009, term41009.getClass(), "req_inv_cmd_num", "EYJXMlkLoO");
        setField(term41009, term41009.getClass(), "req_inv_cmd_prm1", "qJtkJJhOSV");
        setField(term41009, term41009.getClass(), "req_inv_cmd_prm2", "vQbiGKncal");
        setField(term41009, term41009.getClass(), "req_inv_cmd_prm3", "NTSNSiYeUu");
        setField(term41009, term41009.getClass(), "req_inv_cmd_prm4", "SBTEFDmQVY");
        setBooleanField(term41009, term41009.getClass(), "pow_save_flg", false);
        setField(term41009, term41009.getClass(), "nblss_dnt_p", term41323);
        setField(term41009, term41009.getClass(), "nblss_ltt_rl_vp", term41325);
        setField(term41009, term41009.getClass(), "nblss_ex_ltt_flg", term41327);
        setField(term41009, term41009.getClass(), "nblss_dnt_st_tm", "ohZpRiNDZM");
        setField(term41009, term41009.getClass(), "nblss_dnt_ed_tm", "qEXIxhmUwz");
        setField(term41009, term41009.getClass(), "nblss_ltt_st_tm", "RlyxtfCqKY");
        setField(term41009, term41009.getClass(), "nblss_ltt_ed_tm", "kyTUkLCRYm");
        setField(term41009, term41009.getClass(), "cmd", "oAotZgNUFH");
        setField(term41009, term41009.getClass(), "req_id", "TowhQcovXu");
        setField(term41009, term41009.getClass(), "stat", "UFGOnIMOzf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ySiyRlAQpt";
        callMethod(klass, "setReq_inv_cmd_num", argTypes, term41009, args);
    }

};


