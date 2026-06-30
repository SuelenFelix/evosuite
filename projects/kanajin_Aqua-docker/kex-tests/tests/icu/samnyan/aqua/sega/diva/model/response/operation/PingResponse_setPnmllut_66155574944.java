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

public class PingResponse_setPnmllut_66155574944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31181;

    public PingResponse_setPnmllut_66155574944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31495 = new Integer(-375014958);
        Integer term31497 = new Integer(1107176718);
        Integer term31499 = new Integer(480137250);
        term31181 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term31181, term31181.getClass(), "ping_b_msg", "hLVDOhfCKX");
        setField(term31181, term31181.getClass(), "ping_m_msg", "yXLTfzOgfX");
        setField(term31181, term31181.getClass(), "atnd_lut", "MANlfBKTPY");
        setField(term31181, term31181.getClass(), "fi_lut", "mRoEmuCJhW");
        setField(term31181, term31181.getClass(), "ci_lut", "JJUWbMXpyM");
        setField(term31181, term31181.getClass(), "qi_lut", "KDrRQWVXok");
        setField(term31181, term31181.getClass(), "pvl_lut", "oOOwvWgxtf");
        setField(term31181, term31181.getClass(), "pdcl_lut", "ywoADeiUfF");
        setField(term31181, term31181.getClass(), "pnml_lut", "loHiudJxbt");
        setField(term31181, term31181.getClass(), "cinml_lut", "lRbxbybNew");
        setField(term31181, term31181.getClass(), "rwl_lut", "WzGudiEARD");
        setField(term31181, term31181.getClass(), "bdlol_lut", "IoefPqGtaj");
        setField(term31181, term31181.getClass(), "shp_ctlg_lut", "YMmtjELJuB");
        setField(term31181, term31181.getClass(), "cstmz_itm_ctlg_lut", "FzyIShiOmb");
        setField(term31181, term31181.getClass(), "ngwl_lut", "PEUfeJaZTk");
        setField(term31181, term31181.getClass(), "rnk_nv_lut", "AIvyeIdskz");
        setField(term31181, term31181.getClass(), "rnk_ps_lut", "iSQqMWMRlU");
        setField(term31181, term31181.getClass(), "bi_lut", "djWEnlbOXu");
        setField(term31181, term31181.getClass(), "cpi_lut", "MvDMzQBWME");
        setField(term31181, term31181.getClass(), "p_std_hc_lut", "sZyAwmdGVS");
        setField(term31181, term31181.getClass(), "p_std_i_n_lut", "VoKhXiLAaW");
        setField(term31181, term31181.getClass(), "req_inv_cmd_num", "CaalXzRXQI");
        setField(term31181, term31181.getClass(), "req_inv_cmd_prm1", "eRBnKPjyVg");
        setField(term31181, term31181.getClass(), "req_inv_cmd_prm2", "svPqsHBvrm");
        setField(term31181, term31181.getClass(), "req_inv_cmd_prm3", "sRzUJLYMmB");
        setField(term31181, term31181.getClass(), "req_inv_cmd_prm4", "XxILklSDwz");
        setBooleanField(term31181, term31181.getClass(), "pow_save_flg", true);
        setField(term31181, term31181.getClass(), "nblss_dnt_p", term31495);
        setField(term31181, term31181.getClass(), "nblss_ltt_rl_vp", term31497);
        setField(term31181, term31181.getClass(), "nblss_ex_ltt_flg", term31499);
        setField(term31181, term31181.getClass(), "nblss_dnt_st_tm", "TLjhFZbwKO");
        setField(term31181, term31181.getClass(), "nblss_dnt_ed_tm", "nxEbLIApFc");
        setField(term31181, term31181.getClass(), "nblss_ltt_st_tm", "zzsdNZhejE");
        setField(term31181, term31181.getClass(), "nblss_ltt_ed_tm", "ILoodMZrgR");
        setField(term31181, term31181.getClass(), "cmd", "XQiKmsCacK");
        setField(term31181, term31181.getClass(), "req_id", "cTCixEbHYT");
        setField(term31181, term31181.getClass(), "stat", "bqKksqtAdT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jAIAdEmULK";
        callMethod(klass, "setPnml_lut", argTypes, term31181, args);
    }

};


