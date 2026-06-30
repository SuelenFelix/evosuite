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

public class PingResponse_setPdcllut_1511446943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30425;

    public PingResponse_setPdcllut_1511446943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30739 = new Integer(1474524152);
        Integer term30741 = new Integer(568954359);
        Integer term30743 = new Integer(53410913);
        term30425 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term30425, term30425.getClass(), "ping_b_msg", "kOaAQOLyqd");
        setField(term30425, term30425.getClass(), "ping_m_msg", "ICBWiKaeHC");
        setField(term30425, term30425.getClass(), "atnd_lut", "WAljagiCzu");
        setField(term30425, term30425.getClass(), "fi_lut", "XKMXfDZajw");
        setField(term30425, term30425.getClass(), "ci_lut", "avZoBQSrBy");
        setField(term30425, term30425.getClass(), "qi_lut", "KIXGeHXdwi");
        setField(term30425, term30425.getClass(), "pvl_lut", "tTfdvLMwEE");
        setField(term30425, term30425.getClass(), "pdcl_lut", "DiSkERzqOE");
        setField(term30425, term30425.getClass(), "pnml_lut", "hPSZZeYqHQ");
        setField(term30425, term30425.getClass(), "cinml_lut", "scReMUKyGq");
        setField(term30425, term30425.getClass(), "rwl_lut", "FmIpnxjRxA");
        setField(term30425, term30425.getClass(), "bdlol_lut", "FTjxxGvyun");
        setField(term30425, term30425.getClass(), "shp_ctlg_lut", "qsjXSwKloH");
        setField(term30425, term30425.getClass(), "cstmz_itm_ctlg_lut", "DDZHUPglvb");
        setField(term30425, term30425.getClass(), "ngwl_lut", "rWoaXvNyVg");
        setField(term30425, term30425.getClass(), "rnk_nv_lut", "FLzaBCFjGv");
        setField(term30425, term30425.getClass(), "rnk_ps_lut", "OLYhTSqTqJ");
        setField(term30425, term30425.getClass(), "bi_lut", "AIHoadcpQz");
        setField(term30425, term30425.getClass(), "cpi_lut", "fWMsLtuOEV");
        setField(term30425, term30425.getClass(), "p_std_hc_lut", "fvgZQBalnd");
        setField(term30425, term30425.getClass(), "p_std_i_n_lut", "tViQSKUCLE");
        setField(term30425, term30425.getClass(), "req_inv_cmd_num", "QbaeHheqiP");
        setField(term30425, term30425.getClass(), "req_inv_cmd_prm1", "gASHxChKwn");
        setField(term30425, term30425.getClass(), "req_inv_cmd_prm2", "iasolXlEEn");
        setField(term30425, term30425.getClass(), "req_inv_cmd_prm3", "cAObIvLmLo");
        setField(term30425, term30425.getClass(), "req_inv_cmd_prm4", "xwiCqRSWSe");
        setBooleanField(term30425, term30425.getClass(), "pow_save_flg", false);
        setField(term30425, term30425.getClass(), "nblss_dnt_p", term30739);
        setField(term30425, term30425.getClass(), "nblss_ltt_rl_vp", term30741);
        setField(term30425, term30425.getClass(), "nblss_ex_ltt_flg", term30743);
        setField(term30425, term30425.getClass(), "nblss_dnt_st_tm", "IbUFkzIgzq");
        setField(term30425, term30425.getClass(), "nblss_dnt_ed_tm", "dTOUSTDdbw");
        setField(term30425, term30425.getClass(), "nblss_ltt_st_tm", "PECfBejlfo");
        setField(term30425, term30425.getClass(), "nblss_ltt_ed_tm", "SDbDgydVpg");
        setField(term30425, term30425.getClass(), "cmd", "EEMaiNkiOH");
        setField(term30425, term30425.getClass(), "req_id", "sFdmTylvqh");
        setField(term30425, term30425.getClass(), "stat", "rgniLaOaiz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fzQzzdIOMC";
        callMethod(klass, "setPdcl_lut", argTypes, term30425, args);
    }

};


