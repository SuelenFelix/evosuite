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

public class PingResponse_setNblsslttsttm_132716922768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49245;

    public PingResponse_setNblsslttsttm_132716922768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term49559 = new Integer(1102721075);
        Integer term49561 = new Integer(-426764678);
        Integer term49563 = new Integer(-1222614956);
        term49245 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term49245, term49245.getClass(), "ping_b_msg", "ZsvLlzqETk");
        setField(term49245, term49245.getClass(), "ping_m_msg", "DqrZwuHriF");
        setField(term49245, term49245.getClass(), "atnd_lut", "daaMmTkwOR");
        setField(term49245, term49245.getClass(), "fi_lut", "WfJKDOFrUv");
        setField(term49245, term49245.getClass(), "ci_lut", "CbwfWaINrF");
        setField(term49245, term49245.getClass(), "qi_lut", "AVCzSfXhGU");
        setField(term49245, term49245.getClass(), "pvl_lut", "nTUCmQGFDE");
        setField(term49245, term49245.getClass(), "pdcl_lut", "rfFTBanxEx");
        setField(term49245, term49245.getClass(), "pnml_lut", "MQJTCGewxT");
        setField(term49245, term49245.getClass(), "cinml_lut", "DRdgywxCcP");
        setField(term49245, term49245.getClass(), "rwl_lut", "uelmUHzwnS");
        setField(term49245, term49245.getClass(), "bdlol_lut", "iKuSKqVzvy");
        setField(term49245, term49245.getClass(), "shp_ctlg_lut", "SgyGAlytLF");
        setField(term49245, term49245.getClass(), "cstmz_itm_ctlg_lut", "OoXopVvpwr");
        setField(term49245, term49245.getClass(), "ngwl_lut", "lwwreKJCFL");
        setField(term49245, term49245.getClass(), "rnk_nv_lut", "PWBggYjpOQ");
        setField(term49245, term49245.getClass(), "rnk_ps_lut", "FDzNpfjYDI");
        setField(term49245, term49245.getClass(), "bi_lut", "vSbbcByIuA");
        setField(term49245, term49245.getClass(), "cpi_lut", "QSvdWzkkPx");
        setField(term49245, term49245.getClass(), "p_std_hc_lut", "vStdEtWvae");
        setField(term49245, term49245.getClass(), "p_std_i_n_lut", "iApJWgnQkP");
        setField(term49245, term49245.getClass(), "req_inv_cmd_num", "kHKzzYJxiP");
        setField(term49245, term49245.getClass(), "req_inv_cmd_prm1", "INFnBrMIka");
        setField(term49245, term49245.getClass(), "req_inv_cmd_prm2", "EwmpEgdvZs");
        setField(term49245, term49245.getClass(), "req_inv_cmd_prm3", "vRjHouXWLC");
        setField(term49245, term49245.getClass(), "req_inv_cmd_prm4", "XghDInkWEe");
        setBooleanField(term49245, term49245.getClass(), "pow_save_flg", true);
        setField(term49245, term49245.getClass(), "nblss_dnt_p", term49559);
        setField(term49245, term49245.getClass(), "nblss_ltt_rl_vp", term49561);
        setField(term49245, term49245.getClass(), "nblss_ex_ltt_flg", term49563);
        setField(term49245, term49245.getClass(), "nblss_dnt_st_tm", "zPDuGbsYGT");
        setField(term49245, term49245.getClass(), "nblss_dnt_ed_tm", "apnNoBOovC");
        setField(term49245, term49245.getClass(), "nblss_ltt_st_tm", "SyGIHWAumE");
        setField(term49245, term49245.getClass(), "nblss_ltt_ed_tm", "bMQUwQqyMc");
        setField(term49245, term49245.getClass(), "cmd", "CVaGhXmAUN");
        setField(term49245, term49245.getClass(), "req_id", "KnclcuNYRb");
        setField(term49245, term49245.getClass(), "stat", "UDZJbJPmCC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVkgUUfHis";
        callMethod(klass, "setNblss_ltt_st_tm", argTypes, term49245, args);
    }

};


