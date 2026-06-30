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

public class PingResponse_setReqinvcmdprm4_168162900761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44033;

    public PingResponse_setReqinvcmdprm4_168162900761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44347 = new Integer(-1731761810);
        Integer term44349 = new Integer(197109649);
        Integer term44351 = new Integer(-1239406390);
        term44033 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term44033, term44033.getClass(), "ping_b_msg", "DEugGJIaYt");
        setField(term44033, term44033.getClass(), "ping_m_msg", "lzZIObOJmC");
        setField(term44033, term44033.getClass(), "atnd_lut", "RFmGKwvSgz");
        setField(term44033, term44033.getClass(), "fi_lut", "EUEUhZglna");
        setField(term44033, term44033.getClass(), "ci_lut", "znDPtjpZrG");
        setField(term44033, term44033.getClass(), "qi_lut", "uodLjxczjr");
        setField(term44033, term44033.getClass(), "pvl_lut", "HJLVBQAtGs");
        setField(term44033, term44033.getClass(), "pdcl_lut", "dxAxECMYEm");
        setField(term44033, term44033.getClass(), "pnml_lut", "ylGHeywyhx");
        setField(term44033, term44033.getClass(), "cinml_lut", "SqMpUczXhg");
        setField(term44033, term44033.getClass(), "rwl_lut", "voDQuoTpgt");
        setField(term44033, term44033.getClass(), "bdlol_lut", "wgwSIKAsrj");
        setField(term44033, term44033.getClass(), "shp_ctlg_lut", "aGJCHRHyCe");
        setField(term44033, term44033.getClass(), "cstmz_itm_ctlg_lut", "WingwhSgfc");
        setField(term44033, term44033.getClass(), "ngwl_lut", "YEcmxINfnL");
        setField(term44033, term44033.getClass(), "rnk_nv_lut", "EGytMwlDVe");
        setField(term44033, term44033.getClass(), "rnk_ps_lut", "GFQCmYZmcg");
        setField(term44033, term44033.getClass(), "bi_lut", "qPgbFtsgtk");
        setField(term44033, term44033.getClass(), "cpi_lut", "nkmiePLZgp");
        setField(term44033, term44033.getClass(), "p_std_hc_lut", "VoCvDpwwFr");
        setField(term44033, term44033.getClass(), "p_std_i_n_lut", "zYOmoQqDOd");
        setField(term44033, term44033.getClass(), "req_inv_cmd_num", "kmgEVEqTGa");
        setField(term44033, term44033.getClass(), "req_inv_cmd_prm1", "qakIqInzyM");
        setField(term44033, term44033.getClass(), "req_inv_cmd_prm2", "EOsBgwlmva");
        setField(term44033, term44033.getClass(), "req_inv_cmd_prm3", "qcSJruZuJy");
        setField(term44033, term44033.getClass(), "req_inv_cmd_prm4", "NOSJtfgqAs");
        setBooleanField(term44033, term44033.getClass(), "pow_save_flg", false);
        setField(term44033, term44033.getClass(), "nblss_dnt_p", term44347);
        setField(term44033, term44033.getClass(), "nblss_ltt_rl_vp", term44349);
        setField(term44033, term44033.getClass(), "nblss_ex_ltt_flg", term44351);
        setField(term44033, term44033.getClass(), "nblss_dnt_st_tm", "SUDRrjpChc");
        setField(term44033, term44033.getClass(), "nblss_dnt_ed_tm", "pmpprxfFwy");
        setField(term44033, term44033.getClass(), "nblss_ltt_st_tm", "AQbnQoJwOO");
        setField(term44033, term44033.getClass(), "nblss_ltt_ed_tm", "NnicBPzNzw");
        setField(term44033, term44033.getClass(), "cmd", "WADNPbexnT");
        setField(term44033, term44033.getClass(), "req_id", "rMbsSfMKvX");
        setField(term44033, term44033.getClass(), "stat", "oCsqRJXMBc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "npPxKNoqdS";
        callMethod(klass, "setReq_inv_cmd_prm4", argTypes, term44033, args);
    }

};


