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

public class PingResponse_getNblsslttsttm_359898734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23665;

    public PingResponse_getNblsslttsttm_359898734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23979 = new Integer(-1034506028);
        Integer term23981 = new Integer(-1263114719);
        Integer term23983 = new Integer(-894662986);
        term23665 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term23665, term23665.getClass(), "ping_b_msg", "GXoLEdKEIe");
        setField(term23665, term23665.getClass(), "ping_m_msg", "EugWXkztim");
        setField(term23665, term23665.getClass(), "atnd_lut", "DvRdOzzihn");
        setField(term23665, term23665.getClass(), "fi_lut", "wIygCdQAKO");
        setField(term23665, term23665.getClass(), "ci_lut", "JsXroBYqwr");
        setField(term23665, term23665.getClass(), "qi_lut", "YciMAObLwl");
        setField(term23665, term23665.getClass(), "pvl_lut", "qAmVqwwdyf");
        setField(term23665, term23665.getClass(), "pdcl_lut", "IXPaHQnEUy");
        setField(term23665, term23665.getClass(), "pnml_lut", "zhcWVVrrjs");
        setField(term23665, term23665.getClass(), "cinml_lut", "EAMaFLdmaG");
        setField(term23665, term23665.getClass(), "rwl_lut", "DYZSJMwbhX");
        setField(term23665, term23665.getClass(), "bdlol_lut", "QGcshsIIWo");
        setField(term23665, term23665.getClass(), "shp_ctlg_lut", "dPHtrzKWgf");
        setField(term23665, term23665.getClass(), "cstmz_itm_ctlg_lut", "olmFxfIVeh");
        setField(term23665, term23665.getClass(), "ngwl_lut", "iSPirUEhXs");
        setField(term23665, term23665.getClass(), "rnk_nv_lut", "WWyLFmYpAy");
        setField(term23665, term23665.getClass(), "rnk_ps_lut", "vbSWeJWOQh");
        setField(term23665, term23665.getClass(), "bi_lut", "hyvFdAvkOr");
        setField(term23665, term23665.getClass(), "cpi_lut", "ewbQRtustW");
        setField(term23665, term23665.getClass(), "p_std_hc_lut", "cABEHYBnys");
        setField(term23665, term23665.getClass(), "p_std_i_n_lut", "EhlWSobaco");
        setField(term23665, term23665.getClass(), "req_inv_cmd_num", "hEuycunsSe");
        setField(term23665, term23665.getClass(), "req_inv_cmd_prm1", "IMFzXhpNCx");
        setField(term23665, term23665.getClass(), "req_inv_cmd_prm2", "xAtFmANjwD");
        setField(term23665, term23665.getClass(), "req_inv_cmd_prm3", "ICysuFllEZ");
        setField(term23665, term23665.getClass(), "req_inv_cmd_prm4", "cGQJTTxcXr");
        setBooleanField(term23665, term23665.getClass(), "pow_save_flg", true);
        setField(term23665, term23665.getClass(), "nblss_dnt_p", term23979);
        setField(term23665, term23665.getClass(), "nblss_ltt_rl_vp", term23981);
        setField(term23665, term23665.getClass(), "nblss_ex_ltt_flg", term23983);
        setField(term23665, term23665.getClass(), "nblss_dnt_st_tm", "aKaqvssiby");
        setField(term23665, term23665.getClass(), "nblss_dnt_ed_tm", "tTVbtBVAfo");
        setField(term23665, term23665.getClass(), "nblss_ltt_st_tm", "cjaaJUnNCR");
        setField(term23665, term23665.getClass(), "nblss_ltt_ed_tm", "ETbxNuJLii");
        setField(term23665, term23665.getClass(), "cmd", "YJhnPtWtJR");
        setField(term23665, term23665.getClass(), "req_id", "xzGnrvbExX");
        setField(term23665, term23665.getClass(), "stat", "LFZNDELxUZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_st_tm", argTypes, term23665, args);
    }

};


