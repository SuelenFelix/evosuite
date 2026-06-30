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

public class PingResponse_setPingmmsg_139450824437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25889;

    public PingResponse_setPingmmsg_139450824437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26203 = new Integer(-1210583429);
        Integer term26205 = new Integer(-663691365);
        Integer term26207 = new Integer(339854490);
        term25889 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term25889, term25889.getClass(), "ping_b_msg", "rHgKCfgCsg");
        setField(term25889, term25889.getClass(), "ping_m_msg", "AWtIUOuutt");
        setField(term25889, term25889.getClass(), "atnd_lut", "jBgJZpHifl");
        setField(term25889, term25889.getClass(), "fi_lut", "azMTTmEXnh");
        setField(term25889, term25889.getClass(), "ci_lut", "BjJtxwsIpt");
        setField(term25889, term25889.getClass(), "qi_lut", "gUQhOyGfzF");
        setField(term25889, term25889.getClass(), "pvl_lut", "IqDObvPBZX");
        setField(term25889, term25889.getClass(), "pdcl_lut", "NITCrIISoC");
        setField(term25889, term25889.getClass(), "pnml_lut", "nSzzeexTDI");
        setField(term25889, term25889.getClass(), "cinml_lut", "WBrpvMhmsz");
        setField(term25889, term25889.getClass(), "rwl_lut", "ZzqRHVEXcM");
        setField(term25889, term25889.getClass(), "bdlol_lut", "YYwIEARNxi");
        setField(term25889, term25889.getClass(), "shp_ctlg_lut", "rblXBUdTFc");
        setField(term25889, term25889.getClass(), "cstmz_itm_ctlg_lut", "rbsXSOJFKW");
        setField(term25889, term25889.getClass(), "ngwl_lut", "sAgGDoUNlf");
        setField(term25889, term25889.getClass(), "rnk_nv_lut", "TSTZcXdFFi");
        setField(term25889, term25889.getClass(), "rnk_ps_lut", "RyaaOzWfYO");
        setField(term25889, term25889.getClass(), "bi_lut", "HAkxFBZZzz");
        setField(term25889, term25889.getClass(), "cpi_lut", "yejonZnVuy");
        setField(term25889, term25889.getClass(), "p_std_hc_lut", "ouesGIsvuG");
        setField(term25889, term25889.getClass(), "p_std_i_n_lut", "pHBHlmLIZQ");
        setField(term25889, term25889.getClass(), "req_inv_cmd_num", "ZWRAbOuktl");
        setField(term25889, term25889.getClass(), "req_inv_cmd_prm1", "iqFRvFmVID");
        setField(term25889, term25889.getClass(), "req_inv_cmd_prm2", "pNAEtppZdv");
        setField(term25889, term25889.getClass(), "req_inv_cmd_prm3", "VsFWNMdyRt");
        setField(term25889, term25889.getClass(), "req_inv_cmd_prm4", "QaoYFZhScg");
        setBooleanField(term25889, term25889.getClass(), "pow_save_flg", true);
        setField(term25889, term25889.getClass(), "nblss_dnt_p", term26203);
        setField(term25889, term25889.getClass(), "nblss_ltt_rl_vp", term26205);
        setField(term25889, term25889.getClass(), "nblss_ex_ltt_flg", term26207);
        setField(term25889, term25889.getClass(), "nblss_dnt_st_tm", "UTvXIenLCR");
        setField(term25889, term25889.getClass(), "nblss_dnt_ed_tm", "PLeKpWaxhQ");
        setField(term25889, term25889.getClass(), "nblss_ltt_st_tm", "EBSKhqDdUW");
        setField(term25889, term25889.getClass(), "nblss_ltt_ed_tm", "LvLbdICdfA");
        setField(term25889, term25889.getClass(), "cmd", "rtifrlITwl");
        setField(term25889, term25889.getClass(), "req_id", "yGWXZDjnPS");
        setField(term25889, term25889.getClass(), "stat", "vZucxbGVyo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZZoLNbeORl";
        callMethod(klass, "setPing_m_msg", argTypes, term25889, args);
    }

};


