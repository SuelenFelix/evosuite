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

public class PingResponse_getReqinvcmdprm2_150588978125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17059;

    public PingResponse_getReqinvcmdprm2_150588978125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17373 = new Integer(933028652);
        Integer term17375 = new Integer(287287233);
        Integer term17377 = new Integer(962840079);
        term17059 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term17059, term17059.getClass(), "ping_b_msg", "bIqaKgXgPm");
        setField(term17059, term17059.getClass(), "ping_m_msg", "uOJFOUcNvv");
        setField(term17059, term17059.getClass(), "atnd_lut", "tkmmGweDwJ");
        setField(term17059, term17059.getClass(), "fi_lut", "pMfTuAFXxg");
        setField(term17059, term17059.getClass(), "ci_lut", "XCZmhkblRc");
        setField(term17059, term17059.getClass(), "qi_lut", "gFUWMydGCU");
        setField(term17059, term17059.getClass(), "pvl_lut", "LLegSTfqJt");
        setField(term17059, term17059.getClass(), "pdcl_lut", "XQfmqLbqHS");
        setField(term17059, term17059.getClass(), "pnml_lut", "jLVLqQSjqg");
        setField(term17059, term17059.getClass(), "cinml_lut", "JKGueoHesL");
        setField(term17059, term17059.getClass(), "rwl_lut", "CRAUqtVBkU");
        setField(term17059, term17059.getClass(), "bdlol_lut", "DddqUYfomL");
        setField(term17059, term17059.getClass(), "shp_ctlg_lut", "YQwoogpPyi");
        setField(term17059, term17059.getClass(), "cstmz_itm_ctlg_lut", "rnPhHoorxj");
        setField(term17059, term17059.getClass(), "ngwl_lut", "GuwJLKquuI");
        setField(term17059, term17059.getClass(), "rnk_nv_lut", "vYMCjgnztg");
        setField(term17059, term17059.getClass(), "rnk_ps_lut", "YupgKTSEiI");
        setField(term17059, term17059.getClass(), "bi_lut", "HuOUlaFmvJ");
        setField(term17059, term17059.getClass(), "cpi_lut", "dWVwcwFGNo");
        setField(term17059, term17059.getClass(), "p_std_hc_lut", "PNdLRrSAIY");
        setField(term17059, term17059.getClass(), "p_std_i_n_lut", "nJnRIRiLZK");
        setField(term17059, term17059.getClass(), "req_inv_cmd_num", "eWnrMSbYbT");
        setField(term17059, term17059.getClass(), "req_inv_cmd_prm1", "AjoFvDFyCY");
        setField(term17059, term17059.getClass(), "req_inv_cmd_prm2", "OFTJwdPiTG");
        setField(term17059, term17059.getClass(), "req_inv_cmd_prm3", "QiUprSEluR");
        setField(term17059, term17059.getClass(), "req_inv_cmd_prm4", "cDOXXottZh");
        setBooleanField(term17059, term17059.getClass(), "pow_save_flg", true);
        setField(term17059, term17059.getClass(), "nblss_dnt_p", term17373);
        setField(term17059, term17059.getClass(), "nblss_ltt_rl_vp", term17375);
        setField(term17059, term17059.getClass(), "nblss_ex_ltt_flg", term17377);
        setField(term17059, term17059.getClass(), "nblss_dnt_st_tm", "rfqJDkDppz");
        setField(term17059, term17059.getClass(), "nblss_dnt_ed_tm", "MGorMVGauT");
        setField(term17059, term17059.getClass(), "nblss_ltt_st_tm", "jXKxUGTuEF");
        setField(term17059, term17059.getClass(), "nblss_ltt_ed_tm", "nDCcyhiTnS");
        setField(term17059, term17059.getClass(), "cmd", "Bcivwcjece");
        setField(term17059, term17059.getClass(), "req_id", "QTefjRuiez");
        setField(term17059, term17059.getClass(), "stat", "SQZVNkAVBB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReq_inv_cmd_prm2", argTypes, term17059, args);
    }

};


