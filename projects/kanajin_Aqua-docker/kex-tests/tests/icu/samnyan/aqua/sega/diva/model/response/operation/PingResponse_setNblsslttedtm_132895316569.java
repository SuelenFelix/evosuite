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

public class PingResponse_setNblsslttedtm_132895316569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50001;

    public PingResponse_setNblsslttedtm_132895316569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term50315 = new Integer(-1870495012);
        Integer term50317 = new Integer(-1310015129);
        Integer term50319 = new Integer(-2104981311);
        term50001 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term50001, term50001.getClass(), "ping_b_msg", "hoCKQzIOhx");
        setField(term50001, term50001.getClass(), "ping_m_msg", "znUxTdEvUD");
        setField(term50001, term50001.getClass(), "atnd_lut", "PvtJhtGffh");
        setField(term50001, term50001.getClass(), "fi_lut", "KReGJTSQuY");
        setField(term50001, term50001.getClass(), "ci_lut", "hqZmoXoMuS");
        setField(term50001, term50001.getClass(), "qi_lut", "PUPJWadLXP");
        setField(term50001, term50001.getClass(), "pvl_lut", "TBNsemBBKA");
        setField(term50001, term50001.getClass(), "pdcl_lut", "DpNDxwXKkX");
        setField(term50001, term50001.getClass(), "pnml_lut", "uxoFwkPfXf");
        setField(term50001, term50001.getClass(), "cinml_lut", "OoVnZTvxUt");
        setField(term50001, term50001.getClass(), "rwl_lut", "MnqnyndkhF");
        setField(term50001, term50001.getClass(), "bdlol_lut", "MZzoPKpFlh");
        setField(term50001, term50001.getClass(), "shp_ctlg_lut", "skVZETaBKX");
        setField(term50001, term50001.getClass(), "cstmz_itm_ctlg_lut", "jcJNIBACPb");
        setField(term50001, term50001.getClass(), "ngwl_lut", "mPQmjoknqi");
        setField(term50001, term50001.getClass(), "rnk_nv_lut", "gLgvePQRQT");
        setField(term50001, term50001.getClass(), "rnk_ps_lut", "SCmsfHIEPK");
        setField(term50001, term50001.getClass(), "bi_lut", "dFOuezLNWb");
        setField(term50001, term50001.getClass(), "cpi_lut", "PUWJnLuyiR");
        setField(term50001, term50001.getClass(), "p_std_hc_lut", "ADhJCRgHaS");
        setField(term50001, term50001.getClass(), "p_std_i_n_lut", "qociGUMzem");
        setField(term50001, term50001.getClass(), "req_inv_cmd_num", "HHAfSjIdNi");
        setField(term50001, term50001.getClass(), "req_inv_cmd_prm1", "oTqQEKklHi");
        setField(term50001, term50001.getClass(), "req_inv_cmd_prm2", "riyKkxMvWm");
        setField(term50001, term50001.getClass(), "req_inv_cmd_prm3", "WENnGcBSTd");
        setField(term50001, term50001.getClass(), "req_inv_cmd_prm4", "juEYcOCxLW");
        setBooleanField(term50001, term50001.getClass(), "pow_save_flg", true);
        setField(term50001, term50001.getClass(), "nblss_dnt_p", term50315);
        setField(term50001, term50001.getClass(), "nblss_ltt_rl_vp", term50317);
        setField(term50001, term50001.getClass(), "nblss_ex_ltt_flg", term50319);
        setField(term50001, term50001.getClass(), "nblss_dnt_st_tm", "YsWgGEhEmC");
        setField(term50001, term50001.getClass(), "nblss_dnt_ed_tm", "PBcepqkBBV");
        setField(term50001, term50001.getClass(), "nblss_ltt_st_tm", "mukHRKZmND");
        setField(term50001, term50001.getClass(), "nblss_ltt_ed_tm", "WVPSokrFPV");
        setField(term50001, term50001.getClass(), "cmd", "jELmrpQCNf");
        setField(term50001, term50001.getClass(), "req_id", "NkjAcBXmmT");
        setField(term50001, term50001.getClass(), "stat", "KgtGJGInhu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mVHDjrsMAV";
        callMethod(klass, "setNblss_ltt_ed_tm", argTypes, term50001, args);
    }

};


