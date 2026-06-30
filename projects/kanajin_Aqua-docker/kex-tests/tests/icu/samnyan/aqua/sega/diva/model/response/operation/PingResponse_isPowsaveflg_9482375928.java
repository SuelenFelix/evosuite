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

public class PingResponse_isPowsaveflg_9482375928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19261;

    public PingResponse_isPowsaveflg_9482375928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19575 = new Integer(1375330971);
        Integer term19577 = new Integer(-478195677);
        Integer term19579 = new Integer(972867650);
        term19261 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term19261, term19261.getClass(), "ping_b_msg", "VWPFyrpmmb");
        setField(term19261, term19261.getClass(), "ping_m_msg", "gYYKrIeThw");
        setField(term19261, term19261.getClass(), "atnd_lut", "UsxeLMVkAK");
        setField(term19261, term19261.getClass(), "fi_lut", "ITrhiKKzcb");
        setField(term19261, term19261.getClass(), "ci_lut", "qMKmSzOQXg");
        setField(term19261, term19261.getClass(), "qi_lut", "CURQCMkqbZ");
        setField(term19261, term19261.getClass(), "pvl_lut", "VZwkkQktrm");
        setField(term19261, term19261.getClass(), "pdcl_lut", "wIuJvIvEMb");
        setField(term19261, term19261.getClass(), "pnml_lut", "EyojsbSjWT");
        setField(term19261, term19261.getClass(), "cinml_lut", "szGicGyWDL");
        setField(term19261, term19261.getClass(), "rwl_lut", "lkdvUiYwRq");
        setField(term19261, term19261.getClass(), "bdlol_lut", "XuxkPrpfND");
        setField(term19261, term19261.getClass(), "shp_ctlg_lut", "OxNXeKMDje");
        setField(term19261, term19261.getClass(), "cstmz_itm_ctlg_lut", "hGTqHomrbc");
        setField(term19261, term19261.getClass(), "ngwl_lut", "NNMBrIWEBw");
        setField(term19261, term19261.getClass(), "rnk_nv_lut", "GrTaccOQzl");
        setField(term19261, term19261.getClass(), "rnk_ps_lut", "uuSYOUCVHU");
        setField(term19261, term19261.getClass(), "bi_lut", "DfWwbodtVw");
        setField(term19261, term19261.getClass(), "cpi_lut", "kTbFMpVWqx");
        setField(term19261, term19261.getClass(), "p_std_hc_lut", "HegRNsidFg");
        setField(term19261, term19261.getClass(), "p_std_i_n_lut", "udRdJkgXmH");
        setField(term19261, term19261.getClass(), "req_inv_cmd_num", "FBCXbjHVXO");
        setField(term19261, term19261.getClass(), "req_inv_cmd_prm1", "dIWAnvmLiC");
        setField(term19261, term19261.getClass(), "req_inv_cmd_prm2", "CuWebzZQjZ");
        setField(term19261, term19261.getClass(), "req_inv_cmd_prm3", "wRVaaJxKYI");
        setField(term19261, term19261.getClass(), "req_inv_cmd_prm4", "yOQuJXRvOo");
        setBooleanField(term19261, term19261.getClass(), "pow_save_flg", false);
        setField(term19261, term19261.getClass(), "nblss_dnt_p", term19575);
        setField(term19261, term19261.getClass(), "nblss_ltt_rl_vp", term19577);
        setField(term19261, term19261.getClass(), "nblss_ex_ltt_flg", term19579);
        setField(term19261, term19261.getClass(), "nblss_dnt_st_tm", "XmLHcnVsch");
        setField(term19261, term19261.getClass(), "nblss_dnt_ed_tm", "Yrvtdcltri");
        setField(term19261, term19261.getClass(), "nblss_ltt_st_tm", "RxrsjXRVcT");
        setField(term19261, term19261.getClass(), "nblss_ltt_ed_tm", "cfRimmJxqA");
        setField(term19261, term19261.getClass(), "cmd", "oOnRVGqFmy");
        setField(term19261, term19261.getClass(), "req_id", "LaXzFIlWMk");
        setField(term19261, term19261.getClass(), "stat", "GuVQjhBxma");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPow_save_flg", argTypes, term19261, args);
    }

};


