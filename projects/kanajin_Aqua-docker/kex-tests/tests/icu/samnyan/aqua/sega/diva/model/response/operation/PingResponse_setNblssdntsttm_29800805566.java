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

public class PingResponse_setNblssdntsttm_29800805566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47733;

    public PingResponse_setNblssdntsttm_29800805566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48047 = new Integer(-1410220680);
        Integer term48049 = new Integer(389427431);
        Integer term48051 = new Integer(-1945706126);
        term47733 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term47733, term47733.getClass(), "ping_b_msg", "DQhxOWqEyi");
        setField(term47733, term47733.getClass(), "ping_m_msg", "dSszYGDwAk");
        setField(term47733, term47733.getClass(), "atnd_lut", "gNeMyGSVIG");
        setField(term47733, term47733.getClass(), "fi_lut", "qxEkaqdKPG");
        setField(term47733, term47733.getClass(), "ci_lut", "VclIptmKrF");
        setField(term47733, term47733.getClass(), "qi_lut", "wcTeSHCZwz");
        setField(term47733, term47733.getClass(), "pvl_lut", "fxxnbYOiZZ");
        setField(term47733, term47733.getClass(), "pdcl_lut", "CTnRYaYXia");
        setField(term47733, term47733.getClass(), "pnml_lut", "SUIYUFtCCe");
        setField(term47733, term47733.getClass(), "cinml_lut", "eKCrPCkedw");
        setField(term47733, term47733.getClass(), "rwl_lut", "VAFSknHLsZ");
        setField(term47733, term47733.getClass(), "bdlol_lut", "MamzBtwhiz");
        setField(term47733, term47733.getClass(), "shp_ctlg_lut", "wVOypfVLsP");
        setField(term47733, term47733.getClass(), "cstmz_itm_ctlg_lut", "pEazBcUUWX");
        setField(term47733, term47733.getClass(), "ngwl_lut", "nlvRWrTxvz");
        setField(term47733, term47733.getClass(), "rnk_nv_lut", "isMKwgUmka");
        setField(term47733, term47733.getClass(), "rnk_ps_lut", "pDIyzhDtTy");
        setField(term47733, term47733.getClass(), "bi_lut", "wXiUlhXQoC");
        setField(term47733, term47733.getClass(), "cpi_lut", "gKhmgJzimH");
        setField(term47733, term47733.getClass(), "p_std_hc_lut", "OzRiWLVXNx");
        setField(term47733, term47733.getClass(), "p_std_i_n_lut", "pktmgYsknu");
        setField(term47733, term47733.getClass(), "req_inv_cmd_num", "SsMHzYNeji");
        setField(term47733, term47733.getClass(), "req_inv_cmd_prm1", "wzAFLFdaEQ");
        setField(term47733, term47733.getClass(), "req_inv_cmd_prm2", "IcbBNUXJqX");
        setField(term47733, term47733.getClass(), "req_inv_cmd_prm3", "LONFjqAsUp");
        setField(term47733, term47733.getClass(), "req_inv_cmd_prm4", "tAhydlbSMf");
        setBooleanField(term47733, term47733.getClass(), "pow_save_flg", false);
        setField(term47733, term47733.getClass(), "nblss_dnt_p", term48047);
        setField(term47733, term47733.getClass(), "nblss_ltt_rl_vp", term48049);
        setField(term47733, term47733.getClass(), "nblss_ex_ltt_flg", term48051);
        setField(term47733, term47733.getClass(), "nblss_dnt_st_tm", "wNYtcPFyIe");
        setField(term47733, term47733.getClass(), "nblss_dnt_ed_tm", "tlIqgTUSQw");
        setField(term47733, term47733.getClass(), "nblss_ltt_st_tm", "UvweyXjDhG");
        setField(term47733, term47733.getClass(), "nblss_ltt_ed_tm", "wnoVhNwdJy");
        setField(term47733, term47733.getClass(), "cmd", "uQGMBLrmAj");
        setField(term47733, term47733.getClass(), "req_id", "vNFaheDeBv");
        setField(term47733, term47733.getClass(), "stat", "CiPMRxGoHO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LauKpKmenw";
        callMethod(klass, "setNblss_dnt_st_tm", argTypes, term47733, args);
    }

};


