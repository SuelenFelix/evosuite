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

public class PingResponse_getReqinvcmdprm1_150588882024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16325;

    public PingResponse_getReqinvcmdprm1_150588882024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16639 = new Integer(-1588772968);
        Integer term16641 = new Integer(-93135961);
        Integer term16643 = new Integer(-112921587);
        term16325 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term16325, term16325.getClass(), "ping_b_msg", "PNzNzzjSXM");
        setField(term16325, term16325.getClass(), "ping_m_msg", "ktKcSZiuGM");
        setField(term16325, term16325.getClass(), "atnd_lut", "PSOttyUeqv");
        setField(term16325, term16325.getClass(), "fi_lut", "HmEvTlmzXo");
        setField(term16325, term16325.getClass(), "ci_lut", "BMMonTIZgJ");
        setField(term16325, term16325.getClass(), "qi_lut", "QXyFXBjFde");
        setField(term16325, term16325.getClass(), "pvl_lut", "xVFgeyYxZS");
        setField(term16325, term16325.getClass(), "pdcl_lut", "iQiGTulJiH");
        setField(term16325, term16325.getClass(), "pnml_lut", "utCuuVCKqE");
        setField(term16325, term16325.getClass(), "cinml_lut", "zSfoqzJbPT");
        setField(term16325, term16325.getClass(), "rwl_lut", "QUymMnsCIj");
        setField(term16325, term16325.getClass(), "bdlol_lut", "ikTtOgdVYS");
        setField(term16325, term16325.getClass(), "shp_ctlg_lut", "JptuwlirlS");
        setField(term16325, term16325.getClass(), "cstmz_itm_ctlg_lut", "TKOMaGswbU");
        setField(term16325, term16325.getClass(), "ngwl_lut", "YcTbglHiUq");
        setField(term16325, term16325.getClass(), "rnk_nv_lut", "TiUqHrjoEU");
        setField(term16325, term16325.getClass(), "rnk_ps_lut", "eoEvZbdLjL");
        setField(term16325, term16325.getClass(), "bi_lut", "BkIxsyPkGy");
        setField(term16325, term16325.getClass(), "cpi_lut", "mrMGwoRgVY");
        setField(term16325, term16325.getClass(), "p_std_hc_lut", "mxVLTgCwki");
        setField(term16325, term16325.getClass(), "p_std_i_n_lut", "wCurppnDSA");
        setField(term16325, term16325.getClass(), "req_inv_cmd_num", "JydxSNTMYt");
        setField(term16325, term16325.getClass(), "req_inv_cmd_prm1", "KpurAcrHYT");
        setField(term16325, term16325.getClass(), "req_inv_cmd_prm2", "QjvDwgKJGz");
        setField(term16325, term16325.getClass(), "req_inv_cmd_prm3", "ngYxiXTZrk");
        setField(term16325, term16325.getClass(), "req_inv_cmd_prm4", "YTxBqWRAlo");
        setBooleanField(term16325, term16325.getClass(), "pow_save_flg", true);
        setField(term16325, term16325.getClass(), "nblss_dnt_p", term16639);
        setField(term16325, term16325.getClass(), "nblss_ltt_rl_vp", term16641);
        setField(term16325, term16325.getClass(), "nblss_ex_ltt_flg", term16643);
        setField(term16325, term16325.getClass(), "nblss_dnt_st_tm", "ReruUQRXwl");
        setField(term16325, term16325.getClass(), "nblss_dnt_ed_tm", "DWEsVQwuaE");
        setField(term16325, term16325.getClass(), "nblss_ltt_st_tm", "qGkNzZAeDN");
        setField(term16325, term16325.getClass(), "nblss_ltt_ed_tm", "wdtiuPgTVJ");
        setField(term16325, term16325.getClass(), "cmd", "HUgzMgrpsK");
        setField(term16325, term16325.getClass(), "req_id", "ubaBUfLolu");
        setField(term16325, term16325.getClass(), "stat", "itAUCFhZhq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReq_inv_cmd_prm1", argTypes, term16325, args);
    }

};


