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

public class PingResponse_getReqinvcmdprm3_150589074226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17793;

    public PingResponse_getReqinvcmdprm3_150589074226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18107 = new Integer(1540719661);
        Integer term18109 = new Integer(1265463001);
        Integer term18111 = new Integer(335112684);
        term17793 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term17793, term17793.getClass(), "ping_b_msg", "mrSAYJlddZ");
        setField(term17793, term17793.getClass(), "ping_m_msg", "KbwxawvYsw");
        setField(term17793, term17793.getClass(), "atnd_lut", "gvjdfHNzOa");
        setField(term17793, term17793.getClass(), "fi_lut", "HqitWglYWX");
        setField(term17793, term17793.getClass(), "ci_lut", "pOuFRlHmbK");
        setField(term17793, term17793.getClass(), "qi_lut", "WrzdBkinqV");
        setField(term17793, term17793.getClass(), "pvl_lut", "vydWXHfFTw");
        setField(term17793, term17793.getClass(), "pdcl_lut", "DRhkpDneCC");
        setField(term17793, term17793.getClass(), "pnml_lut", "vuIJRrypuA");
        setField(term17793, term17793.getClass(), "cinml_lut", "AxfSZmaiyA");
        setField(term17793, term17793.getClass(), "rwl_lut", "lBpveIKbea");
        setField(term17793, term17793.getClass(), "bdlol_lut", "uyLBVQYcOV");
        setField(term17793, term17793.getClass(), "shp_ctlg_lut", "PoTZjDuBHa");
        setField(term17793, term17793.getClass(), "cstmz_itm_ctlg_lut", "MIwvgVrhzP");
        setField(term17793, term17793.getClass(), "ngwl_lut", "HcUUieXdep");
        setField(term17793, term17793.getClass(), "rnk_nv_lut", "AbonCTtbef");
        setField(term17793, term17793.getClass(), "rnk_ps_lut", "maXrGOGoKA");
        setField(term17793, term17793.getClass(), "bi_lut", "zAkgWQVCpM");
        setField(term17793, term17793.getClass(), "cpi_lut", "yQUDyOroXU");
        setField(term17793, term17793.getClass(), "p_std_hc_lut", "xweqkPdyJH");
        setField(term17793, term17793.getClass(), "p_std_i_n_lut", "kwteHWzwcc");
        setField(term17793, term17793.getClass(), "req_inv_cmd_num", "uMsWXqNhln");
        setField(term17793, term17793.getClass(), "req_inv_cmd_prm1", "MAnhIPOtHL");
        setField(term17793, term17793.getClass(), "req_inv_cmd_prm2", "dikKjYjmRO");
        setField(term17793, term17793.getClass(), "req_inv_cmd_prm3", "GJnnMDVnEP");
        setField(term17793, term17793.getClass(), "req_inv_cmd_prm4", "zSMVllDpfk");
        setBooleanField(term17793, term17793.getClass(), "pow_save_flg", true);
        setField(term17793, term17793.getClass(), "nblss_dnt_p", term18107);
        setField(term17793, term17793.getClass(), "nblss_ltt_rl_vp", term18109);
        setField(term17793, term17793.getClass(), "nblss_ex_ltt_flg", term18111);
        setField(term17793, term17793.getClass(), "nblss_dnt_st_tm", "iptRXVDoYE");
        setField(term17793, term17793.getClass(), "nblss_dnt_ed_tm", "kucsxnvbES");
        setField(term17793, term17793.getClass(), "nblss_ltt_st_tm", "IdGzDFfcZf");
        setField(term17793, term17793.getClass(), "nblss_ltt_ed_tm", "KDdRNhZmnU");
        setField(term17793, term17793.getClass(), "cmd", "iMsqJaKlDC");
        setField(term17793, term17793.getClass(), "req_id", "aPkGHbZyjj");
        setField(term17793, term17793.getClass(), "stat", "nSWdsVyJRI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReq_inv_cmd_prm3", argTypes, term17793, args);
    }

};


