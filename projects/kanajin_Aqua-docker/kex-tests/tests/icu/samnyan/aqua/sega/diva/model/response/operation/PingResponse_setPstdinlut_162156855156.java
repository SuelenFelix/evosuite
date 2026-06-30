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

public class PingResponse_setPstdinlut_162156855156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40253;

    public PingResponse_setPstdinlut_162156855156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40567 = new Integer(1398204340);
        Integer term40569 = new Integer(229204365);
        Integer term40571 = new Integer(-461771056);
        term40253 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term40253, term40253.getClass(), "ping_b_msg", "zsglFxvzdp");
        setField(term40253, term40253.getClass(), "ping_m_msg", "zhXtSGLnJR");
        setField(term40253, term40253.getClass(), "atnd_lut", "XlNXxsYNss");
        setField(term40253, term40253.getClass(), "fi_lut", "jheRZWjuaB");
        setField(term40253, term40253.getClass(), "ci_lut", "IERziToRSQ");
        setField(term40253, term40253.getClass(), "qi_lut", "mDTRMwjBpc");
        setField(term40253, term40253.getClass(), "pvl_lut", "sCLAuKoiVL");
        setField(term40253, term40253.getClass(), "pdcl_lut", "pFWiDEnVnU");
        setField(term40253, term40253.getClass(), "pnml_lut", "NeEetzFhTt");
        setField(term40253, term40253.getClass(), "cinml_lut", "UgvuvUxKed");
        setField(term40253, term40253.getClass(), "rwl_lut", "ljBBMsQpaM");
        setField(term40253, term40253.getClass(), "bdlol_lut", "hHNIOlOzJc");
        setField(term40253, term40253.getClass(), "shp_ctlg_lut", "ALRSeULyWV");
        setField(term40253, term40253.getClass(), "cstmz_itm_ctlg_lut", "WVhzXHdyFF");
        setField(term40253, term40253.getClass(), "ngwl_lut", "GLAWYoxkyw");
        setField(term40253, term40253.getClass(), "rnk_nv_lut", "cfpPTNNVnW");
        setField(term40253, term40253.getClass(), "rnk_ps_lut", "VPkEFShMUB");
        setField(term40253, term40253.getClass(), "bi_lut", "ZIgHysIFcL");
        setField(term40253, term40253.getClass(), "cpi_lut", "ofSfQtWBjp");
        setField(term40253, term40253.getClass(), "p_std_hc_lut", "vkbIpZOlcY");
        setField(term40253, term40253.getClass(), "p_std_i_n_lut", "XbAeosZekH");
        setField(term40253, term40253.getClass(), "req_inv_cmd_num", "EvGPvjswTz");
        setField(term40253, term40253.getClass(), "req_inv_cmd_prm1", "lbnnCkEZgE");
        setField(term40253, term40253.getClass(), "req_inv_cmd_prm2", "YaWdTQZkTw");
        setField(term40253, term40253.getClass(), "req_inv_cmd_prm3", "QqsjlsXtmm");
        setField(term40253, term40253.getClass(), "req_inv_cmd_prm4", "FuWUjAYXxz");
        setBooleanField(term40253, term40253.getClass(), "pow_save_flg", true);
        setField(term40253, term40253.getClass(), "nblss_dnt_p", term40567);
        setField(term40253, term40253.getClass(), "nblss_ltt_rl_vp", term40569);
        setField(term40253, term40253.getClass(), "nblss_ex_ltt_flg", term40571);
        setField(term40253, term40253.getClass(), "nblss_dnt_st_tm", "rKIvvYydou");
        setField(term40253, term40253.getClass(), "nblss_dnt_ed_tm", "KNgeIkQoef");
        setField(term40253, term40253.getClass(), "nblss_ltt_st_tm", "MeMWAHyjMR");
        setField(term40253, term40253.getClass(), "nblss_ltt_ed_tm", "lTuLOcnSnJ");
        setField(term40253, term40253.getClass(), "cmd", "govbBrRstA");
        setField(term40253, term40253.getClass(), "req_id", "zSMUNzRRyM");
        setField(term40253, term40253.getClass(), "stat", "aKwJiIZSjJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lYbeaINKud";
        callMethod(klass, "setP_std_i_n_lut", argTypes, term40253, args);
    }

};


