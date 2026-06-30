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

public class PingResponse_getPstdhclut_188916362821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14123;

    public PingResponse_getPstdhclut_188916362821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14437 = new Integer(-184153539);
        Integer term14439 = new Integer(493620644);
        Integer term14441 = new Integer(1328271830);
        term14123 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term14123, term14123.getClass(), "ping_b_msg", "wmVoFoUVmU");
        setField(term14123, term14123.getClass(), "ping_m_msg", "lLiSiPCciB");
        setField(term14123, term14123.getClass(), "atnd_lut", "PsMKIIEwdR");
        setField(term14123, term14123.getClass(), "fi_lut", "RbQmXqfXAT");
        setField(term14123, term14123.getClass(), "ci_lut", "fcCAsvfBbe");
        setField(term14123, term14123.getClass(), "qi_lut", "mUNcKUxghj");
        setField(term14123, term14123.getClass(), "pvl_lut", "lnvLKbtveE");
        setField(term14123, term14123.getClass(), "pdcl_lut", "FfrrEhTHzQ");
        setField(term14123, term14123.getClass(), "pnml_lut", "LXnDNrMsqT");
        setField(term14123, term14123.getClass(), "cinml_lut", "ZLQamJFBmu");
        setField(term14123, term14123.getClass(), "rwl_lut", "ZWcOCwKNvd");
        setField(term14123, term14123.getClass(), "bdlol_lut", "GTmoNrziyc");
        setField(term14123, term14123.getClass(), "shp_ctlg_lut", "LvztehSlhM");
        setField(term14123, term14123.getClass(), "cstmz_itm_ctlg_lut", "njvnWFTMxN");
        setField(term14123, term14123.getClass(), "ngwl_lut", "fLRqcTSfzF");
        setField(term14123, term14123.getClass(), "rnk_nv_lut", "EBYHwsuWAU");
        setField(term14123, term14123.getClass(), "rnk_ps_lut", "PtIjKpiSix");
        setField(term14123, term14123.getClass(), "bi_lut", "NZdTuwSCIM");
        setField(term14123, term14123.getClass(), "cpi_lut", "dDHcmzPAmP");
        setField(term14123, term14123.getClass(), "p_std_hc_lut", "HEaTkWYBgv");
        setField(term14123, term14123.getClass(), "p_std_i_n_lut", "MpJsPKLTIU");
        setField(term14123, term14123.getClass(), "req_inv_cmd_num", "IiNCZfdouL");
        setField(term14123, term14123.getClass(), "req_inv_cmd_prm1", "AhOHzCsHKW");
        setField(term14123, term14123.getClass(), "req_inv_cmd_prm2", "UqgLPaaAHi");
        setField(term14123, term14123.getClass(), "req_inv_cmd_prm3", "xypryEkUPF");
        setField(term14123, term14123.getClass(), "req_inv_cmd_prm4", "zyZTzHNjQr");
        setBooleanField(term14123, term14123.getClass(), "pow_save_flg", false);
        setField(term14123, term14123.getClass(), "nblss_dnt_p", term14437);
        setField(term14123, term14123.getClass(), "nblss_ltt_rl_vp", term14439);
        setField(term14123, term14123.getClass(), "nblss_ex_ltt_flg", term14441);
        setField(term14123, term14123.getClass(), "nblss_dnt_st_tm", "YSrFKQQwXE");
        setField(term14123, term14123.getClass(), "nblss_dnt_ed_tm", "qxhOsmyyjm");
        setField(term14123, term14123.getClass(), "nblss_ltt_st_tm", "DuKcNfVVYR");
        setField(term14123, term14123.getClass(), "nblss_ltt_ed_tm", "fRujHWvXjJ");
        setField(term14123, term14123.getClass(), "cmd", "EAIAAStlTz");
        setField(term14123, term14123.getClass(), "req_id", "yIWXcOQTgy");
        setField(term14123, term14123.getClass(), "stat", "xAWekqanqc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getP_std_hc_lut", argTypes, term14123, args);
    }

};


