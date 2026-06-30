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

public class PingResponse_getPingmmsg_14507379243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911;

    public PingResponse_getPingmmsg_14507379243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1225 = new Integer(391863371);
        Integer term1227 = new Integer(-1922583790);
        Integer term1229 = new Integer(-616727354);
        term911 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term911, term911.getClass(), "ping_b_msg", "UlajhuVLaP");
        setField(term911, term911.getClass(), "ping_m_msg", "gGSMzuGICf");
        setField(term911, term911.getClass(), "atnd_lut", "hxCBltsObl");
        setField(term911, term911.getClass(), "fi_lut", "BndsHwAFMv");
        setField(term911, term911.getClass(), "ci_lut", "GzFkzHGYFt");
        setField(term911, term911.getClass(), "qi_lut", "tShwQLRGNe");
        setField(term911, term911.getClass(), "pvl_lut", "LvtrsXUliU");
        setField(term911, term911.getClass(), "pdcl_lut", "xLbjWUgOIL");
        setField(term911, term911.getClass(), "pnml_lut", "jDtqGUpnZN");
        setField(term911, term911.getClass(), "cinml_lut", "nGKItKLYNC");
        setField(term911, term911.getClass(), "rwl_lut", "UiUYnPrcCi");
        setField(term911, term911.getClass(), "bdlol_lut", "UoYtihxVaS");
        setField(term911, term911.getClass(), "shp_ctlg_lut", "JDswTTCZHV");
        setField(term911, term911.getClass(), "cstmz_itm_ctlg_lut", "onpbIeEKoi");
        setField(term911, term911.getClass(), "ngwl_lut", "YRHGsAkhxb");
        setField(term911, term911.getClass(), "rnk_nv_lut", "ffYhPOzlUs");
        setField(term911, term911.getClass(), "rnk_ps_lut", "MLqYREekMl");
        setField(term911, term911.getClass(), "bi_lut", "ytSBIKXogI");
        setField(term911, term911.getClass(), "cpi_lut", "nHXjMycHlU");
        setField(term911, term911.getClass(), "p_std_hc_lut", "ieCtQFdkii");
        setField(term911, term911.getClass(), "p_std_i_n_lut", "dEnhdmILtU");
        setField(term911, term911.getClass(), "req_inv_cmd_num", "hoicvmsovO");
        setField(term911, term911.getClass(), "req_inv_cmd_prm1", "eqJfYWRaEL");
        setField(term911, term911.getClass(), "req_inv_cmd_prm2", "fhkbdRViHi");
        setField(term911, term911.getClass(), "req_inv_cmd_prm3", "uWHnvSvaPl");
        setField(term911, term911.getClass(), "req_inv_cmd_prm4", "kBdSllIBVz");
        setBooleanField(term911, term911.getClass(), "pow_save_flg", false);
        setField(term911, term911.getClass(), "nblss_dnt_p", term1225);
        setField(term911, term911.getClass(), "nblss_ltt_rl_vp", term1227);
        setField(term911, term911.getClass(), "nblss_ex_ltt_flg", term1229);
        setField(term911, term911.getClass(), "nblss_dnt_st_tm", "TJmVBGfTML");
        setField(term911, term911.getClass(), "nblss_dnt_ed_tm", "tPlsykYBqO");
        setField(term911, term911.getClass(), "nblss_ltt_st_tm", "bLPjGVBhlX");
        setField(term911, term911.getClass(), "nblss_ltt_ed_tm", "whBvTVIIlC");
        setField(term911, term911.getClass(), "cmd", "IgRJUzaCwW");
        setField(term911, term911.getClass(), "req_id", "JUmudUmaaV");
        setField(term911, term911.getClass(), "stat", "KoyGrUJeJW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPing_m_msg", argTypes, term911, args);
    }

};


