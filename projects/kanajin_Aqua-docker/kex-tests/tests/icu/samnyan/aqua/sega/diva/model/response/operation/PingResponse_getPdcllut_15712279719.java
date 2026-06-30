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

public class PingResponse_getPdcllut_15712279719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5315;

    public PingResponse_getPdcllut_15712279719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5629 = new Integer(-6029667);
        Integer term5631 = new Integer(-2068769794);
        Integer term5633 = new Integer(-117576464);
        term5315 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term5315, term5315.getClass(), "ping_b_msg", "pJbnHTYrxn");
        setField(term5315, term5315.getClass(), "ping_m_msg", "iIRsCSYqXH");
        setField(term5315, term5315.getClass(), "atnd_lut", "nghfqDXyCG");
        setField(term5315, term5315.getClass(), "fi_lut", "WBAOTqErtm");
        setField(term5315, term5315.getClass(), "ci_lut", "PqtVXXZMqK");
        setField(term5315, term5315.getClass(), "qi_lut", "rYbtIDVdnd");
        setField(term5315, term5315.getClass(), "pvl_lut", "UKAReurpHG");
        setField(term5315, term5315.getClass(), "pdcl_lut", "WVRMUmrljA");
        setField(term5315, term5315.getClass(), "pnml_lut", "NTlKJDDWlk");
        setField(term5315, term5315.getClass(), "cinml_lut", "vOuMEpOQAg");
        setField(term5315, term5315.getClass(), "rwl_lut", "SIODFGaQhr");
        setField(term5315, term5315.getClass(), "bdlol_lut", "qYzsiuXOgS");
        setField(term5315, term5315.getClass(), "shp_ctlg_lut", "bxrCBbrrct");
        setField(term5315, term5315.getClass(), "cstmz_itm_ctlg_lut", "CKWpJaaaxX");
        setField(term5315, term5315.getClass(), "ngwl_lut", "UBRmXJmfrt");
        setField(term5315, term5315.getClass(), "rnk_nv_lut", "WZzvmIHhzZ");
        setField(term5315, term5315.getClass(), "rnk_ps_lut", "doQLHkjpNm");
        setField(term5315, term5315.getClass(), "bi_lut", "lCyLIcSuom");
        setField(term5315, term5315.getClass(), "cpi_lut", "CGOpQSZZwI");
        setField(term5315, term5315.getClass(), "p_std_hc_lut", "ypEdrstygY");
        setField(term5315, term5315.getClass(), "p_std_i_n_lut", "sNQFlATEeQ");
        setField(term5315, term5315.getClass(), "req_inv_cmd_num", "ZKMLioamsY");
        setField(term5315, term5315.getClass(), "req_inv_cmd_prm1", "WVbxuoDBcn");
        setField(term5315, term5315.getClass(), "req_inv_cmd_prm2", "pvDEABOxLt");
        setField(term5315, term5315.getClass(), "req_inv_cmd_prm3", "beAMpkroCQ");
        setField(term5315, term5315.getClass(), "req_inv_cmd_prm4", "uSUvKAyuvd");
        setBooleanField(term5315, term5315.getClass(), "pow_save_flg", true);
        setField(term5315, term5315.getClass(), "nblss_dnt_p", term5629);
        setField(term5315, term5315.getClass(), "nblss_ltt_rl_vp", term5631);
        setField(term5315, term5315.getClass(), "nblss_ex_ltt_flg", term5633);
        setField(term5315, term5315.getClass(), "nblss_dnt_st_tm", "onQLVONGuf");
        setField(term5315, term5315.getClass(), "nblss_dnt_ed_tm", "SOrEHbcbmn");
        setField(term5315, term5315.getClass(), "nblss_ltt_st_tm", "bnsyeQXFdu");
        setField(term5315, term5315.getClass(), "nblss_ltt_ed_tm", "BwtdjiefJn");
        setField(term5315, term5315.getClass(), "cmd", "jDmhBrIoDa");
        setField(term5315, term5315.getClass(), "req_id", "SPtPatHeOm");
        setField(term5315, term5315.getClass(), "stat", "ywmcuThdfL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdcl_lut", argTypes, term5315, args);
    }

};


