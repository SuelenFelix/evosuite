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

public class PingResponse_getNblssdntp_59852586329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19995;

    public PingResponse_getNblssdntp_59852586329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20309 = new Integer(1655935355);
        Integer term20311 = new Integer(-481533957);
        Integer term20313 = new Integer(1240914516);
        term19995 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term19995, term19995.getClass(), "ping_b_msg", "WAVMPPbIfL");
        setField(term19995, term19995.getClass(), "ping_m_msg", "GISHLsgALf");
        setField(term19995, term19995.getClass(), "atnd_lut", "PVykkUSgBq");
        setField(term19995, term19995.getClass(), "fi_lut", "tnKbZaCsuj");
        setField(term19995, term19995.getClass(), "ci_lut", "ZFpcYBgLNC");
        setField(term19995, term19995.getClass(), "qi_lut", "VAGkRppBem");
        setField(term19995, term19995.getClass(), "pvl_lut", "eKcEJRxNSu");
        setField(term19995, term19995.getClass(), "pdcl_lut", "NTXQPWFYSA");
        setField(term19995, term19995.getClass(), "pnml_lut", "fOuOhBpldm");
        setField(term19995, term19995.getClass(), "cinml_lut", "qQQRKGPyIM");
        setField(term19995, term19995.getClass(), "rwl_lut", "lzcwhvjdFg");
        setField(term19995, term19995.getClass(), "bdlol_lut", "dfzWTjcjnI");
        setField(term19995, term19995.getClass(), "shp_ctlg_lut", "bsnZXGEvFv");
        setField(term19995, term19995.getClass(), "cstmz_itm_ctlg_lut", "osFrHWYeRy");
        setField(term19995, term19995.getClass(), "ngwl_lut", "scpIQUfPKw");
        setField(term19995, term19995.getClass(), "rnk_nv_lut", "QKYBpCjuYt");
        setField(term19995, term19995.getClass(), "rnk_ps_lut", "vjiRfoGdkl");
        setField(term19995, term19995.getClass(), "bi_lut", "TwaxeSHvnR");
        setField(term19995, term19995.getClass(), "cpi_lut", "paPzDETzIq");
        setField(term19995, term19995.getClass(), "p_std_hc_lut", "fufeuGfwpN");
        setField(term19995, term19995.getClass(), "p_std_i_n_lut", "XJbkXbljvz");
        setField(term19995, term19995.getClass(), "req_inv_cmd_num", "fuvdkDwBeH");
        setField(term19995, term19995.getClass(), "req_inv_cmd_prm1", "NTefzwLPhx");
        setField(term19995, term19995.getClass(), "req_inv_cmd_prm2", "dirFuhqyNu");
        setField(term19995, term19995.getClass(), "req_inv_cmd_prm3", "YVLRenzuoR");
        setField(term19995, term19995.getClass(), "req_inv_cmd_prm4", "JukEMhPWql");
        setBooleanField(term19995, term19995.getClass(), "pow_save_flg", false);
        setField(term19995, term19995.getClass(), "nblss_dnt_p", term20309);
        setField(term19995, term19995.getClass(), "nblss_ltt_rl_vp", term20311);
        setField(term19995, term19995.getClass(), "nblss_ex_ltt_flg", term20313);
        setField(term19995, term19995.getClass(), "nblss_dnt_st_tm", "ZdNcodHERG");
        setField(term19995, term19995.getClass(), "nblss_dnt_ed_tm", "CLHomjAqIM");
        setField(term19995, term19995.getClass(), "nblss_ltt_st_tm", "mzCFLzFuSj");
        setField(term19995, term19995.getClass(), "nblss_ltt_ed_tm", "WQnMpDlSfA");
        setField(term19995, term19995.getClass(), "cmd", "aOIvTQtXiv");
        setField(term19995, term19995.getClass(), "req_id", "IyjDiknqhA");
        setField(term19995, term19995.getClass(), "stat", "IHsXSAFYKi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_dnt_p", argTypes, term19995, args);
    }

};


