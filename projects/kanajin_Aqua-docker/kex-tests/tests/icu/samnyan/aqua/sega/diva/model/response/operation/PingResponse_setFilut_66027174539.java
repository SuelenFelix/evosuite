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

public class PingResponse_setFilut_66027174539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27401;

    public PingResponse_setFilut_66027174539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27715 = new Integer(1532716628);
        Integer term27717 = new Integer(-1801760683);
        Integer term27719 = new Integer(1141317871);
        term27401 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term27401, term27401.getClass(), "ping_b_msg", "fvoyRbZTsm");
        setField(term27401, term27401.getClass(), "ping_m_msg", "iOCnOQXWTl");
        setField(term27401, term27401.getClass(), "atnd_lut", "ARnOWpgtAg");
        setField(term27401, term27401.getClass(), "fi_lut", "MRrYxZoJBW");
        setField(term27401, term27401.getClass(), "ci_lut", "fheZXFNQZh");
        setField(term27401, term27401.getClass(), "qi_lut", "YxHVWlebna");
        setField(term27401, term27401.getClass(), "pvl_lut", "IEmAQCkrPE");
        setField(term27401, term27401.getClass(), "pdcl_lut", "lqFGhtlNRM");
        setField(term27401, term27401.getClass(), "pnml_lut", "GLxLHUsuLw");
        setField(term27401, term27401.getClass(), "cinml_lut", "HuKdqrrxIm");
        setField(term27401, term27401.getClass(), "rwl_lut", "yJKKddLqMb");
        setField(term27401, term27401.getClass(), "bdlol_lut", "LWEYaXeKBe");
        setField(term27401, term27401.getClass(), "shp_ctlg_lut", "cNoFvpHBHw");
        setField(term27401, term27401.getClass(), "cstmz_itm_ctlg_lut", "DoSWbCtsBg");
        setField(term27401, term27401.getClass(), "ngwl_lut", "NrXtkbXwDc");
        setField(term27401, term27401.getClass(), "rnk_nv_lut", "EUapSrAmOe");
        setField(term27401, term27401.getClass(), "rnk_ps_lut", "dUHylIprea");
        setField(term27401, term27401.getClass(), "bi_lut", "FKDqHRpMcc");
        setField(term27401, term27401.getClass(), "cpi_lut", "mIRMQIxHUD");
        setField(term27401, term27401.getClass(), "p_std_hc_lut", "FbBMtntDbw");
        setField(term27401, term27401.getClass(), "p_std_i_n_lut", "zRnpRGaHlI");
        setField(term27401, term27401.getClass(), "req_inv_cmd_num", "dVHfxjbMRK");
        setField(term27401, term27401.getClass(), "req_inv_cmd_prm1", "LzwyLxKJpw");
        setField(term27401, term27401.getClass(), "req_inv_cmd_prm2", "ZhWJlplAVK");
        setField(term27401, term27401.getClass(), "req_inv_cmd_prm3", "pnmjTuTojv");
        setField(term27401, term27401.getClass(), "req_inv_cmd_prm4", "eMtshhmGEm");
        setBooleanField(term27401, term27401.getClass(), "pow_save_flg", true);
        setField(term27401, term27401.getClass(), "nblss_dnt_p", term27715);
        setField(term27401, term27401.getClass(), "nblss_ltt_rl_vp", term27717);
        setField(term27401, term27401.getClass(), "nblss_ex_ltt_flg", term27719);
        setField(term27401, term27401.getClass(), "nblss_dnt_st_tm", "VJUbzHGOvg");
        setField(term27401, term27401.getClass(), "nblss_dnt_ed_tm", "SiwcigIrfD");
        setField(term27401, term27401.getClass(), "nblss_ltt_st_tm", "MFIdGVLoDo");
        setField(term27401, term27401.getClass(), "nblss_ltt_ed_tm", "kbxgTcnXyU");
        setField(term27401, term27401.getClass(), "cmd", "lnJvDbbuwo");
        setField(term27401, term27401.getClass(), "req_id", "KExnWkKGvF");
        setField(term27401, term27401.getClass(), "stat", "luGUNfvmKk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oOUHomyJff";
        callMethod(klass, "setFi_lut", argTypes, term27401, args);
    }

};


