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

public class PingResponse_setReqinvcmdprm3_168162804660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43277;

    public PingResponse_setReqinvcmdprm3_168162804660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term43591 = new Integer(663292551);
        Integer term43593 = new Integer(-1885090354);
        Integer term43595 = new Integer(-2066804303);
        term43277 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term43277, term43277.getClass(), "ping_b_msg", "ylUHzURWyg");
        setField(term43277, term43277.getClass(), "ping_m_msg", "VuAuFBlHxQ");
        setField(term43277, term43277.getClass(), "atnd_lut", "nOLtCslMMH");
        setField(term43277, term43277.getClass(), "fi_lut", "dIQWOeKQVj");
        setField(term43277, term43277.getClass(), "ci_lut", "tHiDGaNXAL");
        setField(term43277, term43277.getClass(), "qi_lut", "VsizBWhPWL");
        setField(term43277, term43277.getClass(), "pvl_lut", "jAFSxnVMcD");
        setField(term43277, term43277.getClass(), "pdcl_lut", "BuNQAVaNCe");
        setField(term43277, term43277.getClass(), "pnml_lut", "iaYiUQnOLD");
        setField(term43277, term43277.getClass(), "cinml_lut", "upnleTLVdf");
        setField(term43277, term43277.getClass(), "rwl_lut", "pvjlKAnxzJ");
        setField(term43277, term43277.getClass(), "bdlol_lut", "ejxUBDQQKB");
        setField(term43277, term43277.getClass(), "shp_ctlg_lut", "IbOvZLmtSE");
        setField(term43277, term43277.getClass(), "cstmz_itm_ctlg_lut", "AOsIglRFcp");
        setField(term43277, term43277.getClass(), "ngwl_lut", "bdONLhBZoA");
        setField(term43277, term43277.getClass(), "rnk_nv_lut", "qPVeRcolUe");
        setField(term43277, term43277.getClass(), "rnk_ps_lut", "AscZyfQFkU");
        setField(term43277, term43277.getClass(), "bi_lut", "nPfruizWey");
        setField(term43277, term43277.getClass(), "cpi_lut", "RvgkUqMUFX");
        setField(term43277, term43277.getClass(), "p_std_hc_lut", "nOqmldTbXj");
        setField(term43277, term43277.getClass(), "p_std_i_n_lut", "xNDnWDGUNx");
        setField(term43277, term43277.getClass(), "req_inv_cmd_num", "faGVqjLquQ");
        setField(term43277, term43277.getClass(), "req_inv_cmd_prm1", "MbsTNUmNqV");
        setField(term43277, term43277.getClass(), "req_inv_cmd_prm2", "VdDIonpedU");
        setField(term43277, term43277.getClass(), "req_inv_cmd_prm3", "VjtXZcUFNx");
        setField(term43277, term43277.getClass(), "req_inv_cmd_prm4", "bOZSTccXbt");
        setBooleanField(term43277, term43277.getClass(), "pow_save_flg", false);
        setField(term43277, term43277.getClass(), "nblss_dnt_p", term43591);
        setField(term43277, term43277.getClass(), "nblss_ltt_rl_vp", term43593);
        setField(term43277, term43277.getClass(), "nblss_ex_ltt_flg", term43595);
        setField(term43277, term43277.getClass(), "nblss_dnt_st_tm", "MBSsxxeNUU");
        setField(term43277, term43277.getClass(), "nblss_dnt_ed_tm", "NmUhmPLSgG");
        setField(term43277, term43277.getClass(), "nblss_ltt_st_tm", "WJosrfBMfA");
        setField(term43277, term43277.getClass(), "nblss_ltt_ed_tm", "ttlGywalKc");
        setField(term43277, term43277.getClass(), "cmd", "rQFBspqBzf");
        setField(term43277, term43277.getClass(), "req_id", "FmWhAOGAMI");
        setField(term43277, term43277.getClass(), "stat", "GdjCkRsIrS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MJNyYzLhkh";
        callMethod(klass, "setReq_inv_cmd_prm3", argTypes, term43277, args);
    }

};


