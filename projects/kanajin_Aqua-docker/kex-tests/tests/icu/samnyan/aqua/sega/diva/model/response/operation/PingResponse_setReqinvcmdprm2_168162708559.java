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

public class PingResponse_setReqinvcmdprm2_168162708559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42521;

    public PingResponse_setReqinvcmdprm2_168162708559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term42835 = new Integer(-1274456137);
        Integer term42837 = new Integer(1041916673);
        Integer term42839 = new Integer(-601863069);
        term42521 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term42521, term42521.getClass(), "ping_b_msg", "dUXsPNSUez");
        setField(term42521, term42521.getClass(), "ping_m_msg", "PxGDfPOAFS");
        setField(term42521, term42521.getClass(), "atnd_lut", "dZVxzYEeZe");
        setField(term42521, term42521.getClass(), "fi_lut", "TnCQRmzwPf");
        setField(term42521, term42521.getClass(), "ci_lut", "ZGnUKGTWCn");
        setField(term42521, term42521.getClass(), "qi_lut", "cHRLXsgRzr");
        setField(term42521, term42521.getClass(), "pvl_lut", "QpqQKmCtoC");
        setField(term42521, term42521.getClass(), "pdcl_lut", "AYRvbRJxWI");
        setField(term42521, term42521.getClass(), "pnml_lut", "MGNiaVqEDc");
        setField(term42521, term42521.getClass(), "cinml_lut", "qeVNCFrTbT");
        setField(term42521, term42521.getClass(), "rwl_lut", "sreEtRBWQl");
        setField(term42521, term42521.getClass(), "bdlol_lut", "UKQejaeJWY");
        setField(term42521, term42521.getClass(), "shp_ctlg_lut", "lNbVasLAKL");
        setField(term42521, term42521.getClass(), "cstmz_itm_ctlg_lut", "wKeyHBCSLZ");
        setField(term42521, term42521.getClass(), "ngwl_lut", "iQCLduwSPi");
        setField(term42521, term42521.getClass(), "rnk_nv_lut", "ZcODLNhxqg");
        setField(term42521, term42521.getClass(), "rnk_ps_lut", "iNtHOROBMq");
        setField(term42521, term42521.getClass(), "bi_lut", "GbvfbbsrOl");
        setField(term42521, term42521.getClass(), "cpi_lut", "IIZlqzOmtY");
        setField(term42521, term42521.getClass(), "p_std_hc_lut", "iRFRSxtnkr");
        setField(term42521, term42521.getClass(), "p_std_i_n_lut", "iGWkLjLGBY");
        setField(term42521, term42521.getClass(), "req_inv_cmd_num", "jUkXaNkoAg");
        setField(term42521, term42521.getClass(), "req_inv_cmd_prm1", "mZsPsRzyhQ");
        setField(term42521, term42521.getClass(), "req_inv_cmd_prm2", "IExlbTemvJ");
        setField(term42521, term42521.getClass(), "req_inv_cmd_prm3", "zaljyXXCoy");
        setField(term42521, term42521.getClass(), "req_inv_cmd_prm4", "dKoYnXLGEI");
        setBooleanField(term42521, term42521.getClass(), "pow_save_flg", true);
        setField(term42521, term42521.getClass(), "nblss_dnt_p", term42835);
        setField(term42521, term42521.getClass(), "nblss_ltt_rl_vp", term42837);
        setField(term42521, term42521.getClass(), "nblss_ex_ltt_flg", term42839);
        setField(term42521, term42521.getClass(), "nblss_dnt_st_tm", "MQvSpklpkB");
        setField(term42521, term42521.getClass(), "nblss_dnt_ed_tm", "SbTxRdDQQc");
        setField(term42521, term42521.getClass(), "nblss_ltt_st_tm", "MrVdoUYAdO");
        setField(term42521, term42521.getClass(), "nblss_ltt_ed_tm", "schPUnVfDW");
        setField(term42521, term42521.getClass(), "cmd", "CpdMEgjUka");
        setField(term42521, term42521.getClass(), "req_id", "WRisHdgnmm");
        setField(term42521, term42521.getClass(), "stat", "XxZiwWPLOx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nyqsjMHTba";
        callMethod(klass, "setReq_inv_cmd_prm2", argTypes, term42521, args);
    }

};


