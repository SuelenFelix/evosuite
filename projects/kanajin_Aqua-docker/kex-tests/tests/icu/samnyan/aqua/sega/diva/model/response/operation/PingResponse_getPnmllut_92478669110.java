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

public class PingResponse_getPnmllut_92478669110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6049;

    public PingResponse_getPnmllut_92478669110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6363 = new Integer(-1007160944);
        Integer term6365 = new Integer(1135664017);
        Integer term6367 = new Integer(590364439);
        term6049 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term6049, term6049.getClass(), "ping_b_msg", "GBOEuByOfr");
        setField(term6049, term6049.getClass(), "ping_m_msg", "NHbOFFjyVK");
        setField(term6049, term6049.getClass(), "atnd_lut", "zaloBqlrSo");
        setField(term6049, term6049.getClass(), "fi_lut", "vvoLrMGCoN");
        setField(term6049, term6049.getClass(), "ci_lut", "pXdglvyrQe");
        setField(term6049, term6049.getClass(), "qi_lut", "OcfNzHYdki");
        setField(term6049, term6049.getClass(), "pvl_lut", "uPuCVuZYOI");
        setField(term6049, term6049.getClass(), "pdcl_lut", "TweMFhxNdj");
        setField(term6049, term6049.getClass(), "pnml_lut", "NBrvVzvQHe");
        setField(term6049, term6049.getClass(), "cinml_lut", "FjOiNAfBOc");
        setField(term6049, term6049.getClass(), "rwl_lut", "iCCsaLHohG");
        setField(term6049, term6049.getClass(), "bdlol_lut", "NJhGgctbdj");
        setField(term6049, term6049.getClass(), "shp_ctlg_lut", "MYWYUeLGOp");
        setField(term6049, term6049.getClass(), "cstmz_itm_ctlg_lut", "tsTGdgQYUL");
        setField(term6049, term6049.getClass(), "ngwl_lut", "TtGbVmKcnX");
        setField(term6049, term6049.getClass(), "rnk_nv_lut", "GJVkUrCVdD");
        setField(term6049, term6049.getClass(), "rnk_ps_lut", "zNdorvdUgu");
        setField(term6049, term6049.getClass(), "bi_lut", "oPxuZbkYio");
        setField(term6049, term6049.getClass(), "cpi_lut", "vKitydDVnM");
        setField(term6049, term6049.getClass(), "p_std_hc_lut", "urCiQnUFBM");
        setField(term6049, term6049.getClass(), "p_std_i_n_lut", "EKjQdtKxAM");
        setField(term6049, term6049.getClass(), "req_inv_cmd_num", "TXZAIPQJHt");
        setField(term6049, term6049.getClass(), "req_inv_cmd_prm1", "DIbeDHICho");
        setField(term6049, term6049.getClass(), "req_inv_cmd_prm2", "dJGPlmSRnz");
        setField(term6049, term6049.getClass(), "req_inv_cmd_prm3", "DPskuFUobI");
        setField(term6049, term6049.getClass(), "req_inv_cmd_prm4", "wBGfLpNNiZ");
        setBooleanField(term6049, term6049.getClass(), "pow_save_flg", false);
        setField(term6049, term6049.getClass(), "nblss_dnt_p", term6363);
        setField(term6049, term6049.getClass(), "nblss_ltt_rl_vp", term6365);
        setField(term6049, term6049.getClass(), "nblss_ex_ltt_flg", term6367);
        setField(term6049, term6049.getClass(), "nblss_dnt_st_tm", "yUGCjlqgJE");
        setField(term6049, term6049.getClass(), "nblss_dnt_ed_tm", "PXdVZyoJyC");
        setField(term6049, term6049.getClass(), "nblss_ltt_st_tm", "vLerpqavFM");
        setField(term6049, term6049.getClass(), "nblss_ltt_ed_tm", "qnvxzwuGKX");
        setField(term6049, term6049.getClass(), "cmd", "EdPAvpluZg");
        setField(term6049, term6049.getClass(), "req_id", "DzHVBMqWtE");
        setField(term6049, term6049.getClass(), "stat", "THZSpzBRYP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPnml_lut", argTypes, term6049, args);
    }

};


