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

public class PingResponse_setPingbmsg_22190234536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25133;

    public PingResponse_setPingbmsg_22190234536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25447 = new Integer(683666002);
        Integer term25449 = new Integer(1596213415);
        Integer term25451 = new Integer(-268815336);
        term25133 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term25133, term25133.getClass(), "ping_b_msg", "cuWgFcYkPC");
        setField(term25133, term25133.getClass(), "ping_m_msg", "HfbcOKkXBm");
        setField(term25133, term25133.getClass(), "atnd_lut", "pLbTzSMbsN");
        setField(term25133, term25133.getClass(), "fi_lut", "lFSbxerCPP");
        setField(term25133, term25133.getClass(), "ci_lut", "vjaZIyixCm");
        setField(term25133, term25133.getClass(), "qi_lut", "gAAPyftlIR");
        setField(term25133, term25133.getClass(), "pvl_lut", "kevWstoxwq");
        setField(term25133, term25133.getClass(), "pdcl_lut", "aSYOhFwzSm");
        setField(term25133, term25133.getClass(), "pnml_lut", "pVZlzrBeDB");
        setField(term25133, term25133.getClass(), "cinml_lut", "EfSUvjuZAA");
        setField(term25133, term25133.getClass(), "rwl_lut", "PrHWfHydsG");
        setField(term25133, term25133.getClass(), "bdlol_lut", "igruEzTbBE");
        setField(term25133, term25133.getClass(), "shp_ctlg_lut", "LFjgROsRUV");
        setField(term25133, term25133.getClass(), "cstmz_itm_ctlg_lut", "kHxujKiCsr");
        setField(term25133, term25133.getClass(), "ngwl_lut", "cseZveWowm");
        setField(term25133, term25133.getClass(), "rnk_nv_lut", "idfslIPhgx");
        setField(term25133, term25133.getClass(), "rnk_ps_lut", "HyFLOXeoDX");
        setField(term25133, term25133.getClass(), "bi_lut", "crkNabVaWs");
        setField(term25133, term25133.getClass(), "cpi_lut", "qBcAJgrABE");
        setField(term25133, term25133.getClass(), "p_std_hc_lut", "JKdZuLFRwC");
        setField(term25133, term25133.getClass(), "p_std_i_n_lut", "hfhLLoWnRU");
        setField(term25133, term25133.getClass(), "req_inv_cmd_num", "RpofnOPYha");
        setField(term25133, term25133.getClass(), "req_inv_cmd_prm1", "CQYmAsjvPU");
        setField(term25133, term25133.getClass(), "req_inv_cmd_prm2", "NNkIIFpxiB");
        setField(term25133, term25133.getClass(), "req_inv_cmd_prm3", "sBmtvFPDso");
        setField(term25133, term25133.getClass(), "req_inv_cmd_prm4", "qsUIxrLolr");
        setBooleanField(term25133, term25133.getClass(), "pow_save_flg", false);
        setField(term25133, term25133.getClass(), "nblss_dnt_p", term25447);
        setField(term25133, term25133.getClass(), "nblss_ltt_rl_vp", term25449);
        setField(term25133, term25133.getClass(), "nblss_ex_ltt_flg", term25451);
        setField(term25133, term25133.getClass(), "nblss_dnt_st_tm", "IlQxArYcgB");
        setField(term25133, term25133.getClass(), "nblss_dnt_ed_tm", "lIgKCvCuoH");
        setField(term25133, term25133.getClass(), "nblss_ltt_st_tm", "dHuWgRwLOm");
        setField(term25133, term25133.getClass(), "nblss_ltt_ed_tm", "PsTQDxNIld");
        setField(term25133, term25133.getClass(), "cmd", "uoBijJjvaj");
        setField(term25133, term25133.getClass(), "req_id", "BdsLFSRWda");
        setField(term25133, term25133.getClass(), "stat", "tMhhBYonAI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AaQRshwIQC";
        callMethod(klass, "setPing_b_msg", argTypes, term25133, args);
    }

};


