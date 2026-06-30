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

public class PingResponse_setPstdhclut_141146284455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39497;

    public PingResponse_setPstdhclut_141146284455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39811 = new Integer(1953277050);
        Integer term39813 = new Integer(1283079251);
        Integer term39815 = new Integer(-523949691);
        term39497 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term39497, term39497.getClass(), "ping_b_msg", "QpEVWispEh");
        setField(term39497, term39497.getClass(), "ping_m_msg", "STofGrqXqL");
        setField(term39497, term39497.getClass(), "atnd_lut", "IoRhBfdSuN");
        setField(term39497, term39497.getClass(), "fi_lut", "JGdxVjQzts");
        setField(term39497, term39497.getClass(), "ci_lut", "jEdjRikQtN");
        setField(term39497, term39497.getClass(), "qi_lut", "fSNUaokVWs");
        setField(term39497, term39497.getClass(), "pvl_lut", "dTxnMmHoVm");
        setField(term39497, term39497.getClass(), "pdcl_lut", "iswxaQUQgT");
        setField(term39497, term39497.getClass(), "pnml_lut", "MxUSQqhNse");
        setField(term39497, term39497.getClass(), "cinml_lut", "skwxdosvQV");
        setField(term39497, term39497.getClass(), "rwl_lut", "DBYTggnCkD");
        setField(term39497, term39497.getClass(), "bdlol_lut", "RyXrJxJQiY");
        setField(term39497, term39497.getClass(), "shp_ctlg_lut", "JfnQeTdzWs");
        setField(term39497, term39497.getClass(), "cstmz_itm_ctlg_lut", "HGhGqMiMOk");
        setField(term39497, term39497.getClass(), "ngwl_lut", "VtTzFdKpZI");
        setField(term39497, term39497.getClass(), "rnk_nv_lut", "yCqQIOXRXO");
        setField(term39497, term39497.getClass(), "rnk_ps_lut", "aevLPMVcYW");
        setField(term39497, term39497.getClass(), "bi_lut", "orHcHVrwHz");
        setField(term39497, term39497.getClass(), "cpi_lut", "mkEWcQdwUn");
        setField(term39497, term39497.getClass(), "p_std_hc_lut", "VRjVlzFSIx");
        setField(term39497, term39497.getClass(), "p_std_i_n_lut", "fNlDLqQZFT");
        setField(term39497, term39497.getClass(), "req_inv_cmd_num", "szCfpoTDXX");
        setField(term39497, term39497.getClass(), "req_inv_cmd_prm1", "blnSDUyHkS");
        setField(term39497, term39497.getClass(), "req_inv_cmd_prm2", "byyepwHlHN");
        setField(term39497, term39497.getClass(), "req_inv_cmd_prm3", "akVNsUcFra");
        setField(term39497, term39497.getClass(), "req_inv_cmd_prm4", "BKiHMTzLoY");
        setBooleanField(term39497, term39497.getClass(), "pow_save_flg", false);
        setField(term39497, term39497.getClass(), "nblss_dnt_p", term39811);
        setField(term39497, term39497.getClass(), "nblss_ltt_rl_vp", term39813);
        setField(term39497, term39497.getClass(), "nblss_ex_ltt_flg", term39815);
        setField(term39497, term39497.getClass(), "nblss_dnt_st_tm", "arrHHpXCBD");
        setField(term39497, term39497.getClass(), "nblss_dnt_ed_tm", "zzfzxQYlis");
        setField(term39497, term39497.getClass(), "nblss_ltt_st_tm", "TJJQwVEzxz");
        setField(term39497, term39497.getClass(), "nblss_ltt_ed_tm", "kHtEHBrsFo");
        setField(term39497, term39497.getClass(), "cmd", "EmAvkhGlPV");
        setField(term39497, term39497.getClass(), "req_id", "mBrbyQVzve");
        setField(term39497, term39497.getClass(), "stat", "FQODEbQeKa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iLsUPvsdys";
        callMethod(klass, "setP_std_hc_lut", argTypes, term39497, args);
    }

};


