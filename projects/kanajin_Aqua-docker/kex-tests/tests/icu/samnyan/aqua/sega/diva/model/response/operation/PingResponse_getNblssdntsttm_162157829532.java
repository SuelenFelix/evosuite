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

public class PingResponse_getNblssdntsttm_162157829532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22197;

    public PingResponse_getNblssdntsttm_162157829532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22511 = new Integer(-1772434990);
        Integer term22513 = new Integer(-1845499264);
        Integer term22515 = new Integer(-505439934);
        term22197 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term22197, term22197.getClass(), "ping_b_msg", "oApgdbwnti");
        setField(term22197, term22197.getClass(), "ping_m_msg", "YcgHACNgyo");
        setField(term22197, term22197.getClass(), "atnd_lut", "MrUPJzBTEn");
        setField(term22197, term22197.getClass(), "fi_lut", "IaSymdfFGa");
        setField(term22197, term22197.getClass(), "ci_lut", "FxSvJCIpul");
        setField(term22197, term22197.getClass(), "qi_lut", "HCjKwpexJj");
        setField(term22197, term22197.getClass(), "pvl_lut", "sCpIHVPdfl");
        setField(term22197, term22197.getClass(), "pdcl_lut", "lMUBBGRjfY");
        setField(term22197, term22197.getClass(), "pnml_lut", "olYpqbolWL");
        setField(term22197, term22197.getClass(), "cinml_lut", "MCMCjxXzjw");
        setField(term22197, term22197.getClass(), "rwl_lut", "pZbbwCURge");
        setField(term22197, term22197.getClass(), "bdlol_lut", "RsOfgdMCMv");
        setField(term22197, term22197.getClass(), "shp_ctlg_lut", "nsofCJqJOR");
        setField(term22197, term22197.getClass(), "cstmz_itm_ctlg_lut", "CitJiZwsjF");
        setField(term22197, term22197.getClass(), "ngwl_lut", "ZiyMvLArWJ");
        setField(term22197, term22197.getClass(), "rnk_nv_lut", "MaeokjEfWD");
        setField(term22197, term22197.getClass(), "rnk_ps_lut", "ocZcumnXEz");
        setField(term22197, term22197.getClass(), "bi_lut", "rNNwyactDR");
        setField(term22197, term22197.getClass(), "cpi_lut", "QJrTMTdxyh");
        setField(term22197, term22197.getClass(), "p_std_hc_lut", "rgZSPplPSs");
        setField(term22197, term22197.getClass(), "p_std_i_n_lut", "NPUSTXlEKx");
        setField(term22197, term22197.getClass(), "req_inv_cmd_num", "KKFprGoNpl");
        setField(term22197, term22197.getClass(), "req_inv_cmd_prm1", "tWVISJlxKZ");
        setField(term22197, term22197.getClass(), "req_inv_cmd_prm2", "rOZkUKEoaf");
        setField(term22197, term22197.getClass(), "req_inv_cmd_prm3", "yLnzGqyHGL");
        setField(term22197, term22197.getClass(), "req_inv_cmd_prm4", "IjprPXBDuY");
        setBooleanField(term22197, term22197.getClass(), "pow_save_flg", true);
        setField(term22197, term22197.getClass(), "nblss_dnt_p", term22511);
        setField(term22197, term22197.getClass(), "nblss_ltt_rl_vp", term22513);
        setField(term22197, term22197.getClass(), "nblss_ex_ltt_flg", term22515);
        setField(term22197, term22197.getClass(), "nblss_dnt_st_tm", "wkqPmmFDAa");
        setField(term22197, term22197.getClass(), "nblss_dnt_ed_tm", "rLTDtNqLyW");
        setField(term22197, term22197.getClass(), "nblss_ltt_st_tm", "CLsbWobdgS");
        setField(term22197, term22197.getClass(), "nblss_ltt_ed_tm", "TbYrjEyFPc");
        setField(term22197, term22197.getClass(), "cmd", "muefchpJiZ");
        setField(term22197, term22197.getClass(), "req_id", "tuYaAqvYrh");
        setField(term22197, term22197.getClass(), "stat", "CIbhheukbR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_dnt_st_tm", argTypes, term22197, args);
    }

};


