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

public class PingResponse_getReqinvcmdnum_204668140823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15591;

    public PingResponse_getReqinvcmdnum_204668140823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term15905 = new Integer(-2095575670);
        Integer term15907 = new Integer(1225272962);
        Integer term15909 = new Integer(1324040357);
        term15591 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term15591, term15591.getClass(), "ping_b_msg", "VfmNFpEuax");
        setField(term15591, term15591.getClass(), "ping_m_msg", "ANHjlWPmZG");
        setField(term15591, term15591.getClass(), "atnd_lut", "SibzENsyyy");
        setField(term15591, term15591.getClass(), "fi_lut", "mrqGHotaef");
        setField(term15591, term15591.getClass(), "ci_lut", "UbZGBpQZQW");
        setField(term15591, term15591.getClass(), "qi_lut", "SvGTualQPa");
        setField(term15591, term15591.getClass(), "pvl_lut", "mdxcgZwsaP");
        setField(term15591, term15591.getClass(), "pdcl_lut", "XildIRoZHG");
        setField(term15591, term15591.getClass(), "pnml_lut", "lEcrFlxJXH");
        setField(term15591, term15591.getClass(), "cinml_lut", "VNdDwXMYxR");
        setField(term15591, term15591.getClass(), "rwl_lut", "bVbexZPmwW");
        setField(term15591, term15591.getClass(), "bdlol_lut", "tvxYdqiyGc");
        setField(term15591, term15591.getClass(), "shp_ctlg_lut", "ZEXFoMSKeG");
        setField(term15591, term15591.getClass(), "cstmz_itm_ctlg_lut", "HvxahUfZcJ");
        setField(term15591, term15591.getClass(), "ngwl_lut", "WkLpmqoQxy");
        setField(term15591, term15591.getClass(), "rnk_nv_lut", "XiNoscmYhd");
        setField(term15591, term15591.getClass(), "rnk_ps_lut", "asMqnMNrZp");
        setField(term15591, term15591.getClass(), "bi_lut", "pqFUMTCKJd");
        setField(term15591, term15591.getClass(), "cpi_lut", "PTEndmPMzk");
        setField(term15591, term15591.getClass(), "p_std_hc_lut", "aJQuCOCvZs");
        setField(term15591, term15591.getClass(), "p_std_i_n_lut", "lHYNCJRiOv");
        setField(term15591, term15591.getClass(), "req_inv_cmd_num", "QVLresHoaP");
        setField(term15591, term15591.getClass(), "req_inv_cmd_prm1", "IbxeAMwLVt");
        setField(term15591, term15591.getClass(), "req_inv_cmd_prm2", "bShlAqoTmZ");
        setField(term15591, term15591.getClass(), "req_inv_cmd_prm3", "nOKlKlNhtU");
        setField(term15591, term15591.getClass(), "req_inv_cmd_prm4", "gXFNBHJSey");
        setBooleanField(term15591, term15591.getClass(), "pow_save_flg", true);
        setField(term15591, term15591.getClass(), "nblss_dnt_p", term15905);
        setField(term15591, term15591.getClass(), "nblss_ltt_rl_vp", term15907);
        setField(term15591, term15591.getClass(), "nblss_ex_ltt_flg", term15909);
        setField(term15591, term15591.getClass(), "nblss_dnt_st_tm", "wUcSfItZgv");
        setField(term15591, term15591.getClass(), "nblss_dnt_ed_tm", "rOfPCPHmtJ");
        setField(term15591, term15591.getClass(), "nblss_ltt_st_tm", "EnmiAvfpJv");
        setField(term15591, term15591.getClass(), "nblss_ltt_ed_tm", "AdYzLPMcwe");
        setField(term15591, term15591.getClass(), "cmd", "FrTZLybkKk");
        setField(term15591, term15591.getClass(), "req_id", "FlxVmiMYKP");
        setField(term15591, term15591.getClass(), "stat", "fgOpAWlGYN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReq_inv_cmd_num", argTypes, term15591, args);
    }

};


