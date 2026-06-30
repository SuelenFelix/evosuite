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

public class PingResponse_setReqinvcmdprm1_168162612458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41765;

    public PingResponse_setReqinvcmdprm1_168162612458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term42079 = new Integer(-2014576105);
        Integer term42081 = new Integer(1296895584);
        Integer term42083 = new Integer(628918458);
        term41765 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term41765, term41765.getClass(), "ping_b_msg", "MiankJgKCp");
        setField(term41765, term41765.getClass(), "ping_m_msg", "lmZBCmpOeb");
        setField(term41765, term41765.getClass(), "atnd_lut", "cPlYOAUqsP");
        setField(term41765, term41765.getClass(), "fi_lut", "ritBUyuuKt");
        setField(term41765, term41765.getClass(), "ci_lut", "YfziBBiPvL");
        setField(term41765, term41765.getClass(), "qi_lut", "lNBaHEkYui");
        setField(term41765, term41765.getClass(), "pvl_lut", "BqxRCYZwmn");
        setField(term41765, term41765.getClass(), "pdcl_lut", "KHPDZjrXQp");
        setField(term41765, term41765.getClass(), "pnml_lut", "fpyUFzdCwQ");
        setField(term41765, term41765.getClass(), "cinml_lut", "OQqBkSGDem");
        setField(term41765, term41765.getClass(), "rwl_lut", "vZzZOvsIYn");
        setField(term41765, term41765.getClass(), "bdlol_lut", "pAIBwhAbDu");
        setField(term41765, term41765.getClass(), "shp_ctlg_lut", "iqhNUjVbRG");
        setField(term41765, term41765.getClass(), "cstmz_itm_ctlg_lut", "SSqIrPwJXd");
        setField(term41765, term41765.getClass(), "ngwl_lut", "jAxYagPvcV");
        setField(term41765, term41765.getClass(), "rnk_nv_lut", "ZXLgGUqgyW");
        setField(term41765, term41765.getClass(), "rnk_ps_lut", "PdeSzTcBgY");
        setField(term41765, term41765.getClass(), "bi_lut", "PmSvMYNoIS");
        setField(term41765, term41765.getClass(), "cpi_lut", "zejWtMxJdV");
        setField(term41765, term41765.getClass(), "p_std_hc_lut", "YUIUZeZiMK");
        setField(term41765, term41765.getClass(), "p_std_i_n_lut", "rrPETbKRef");
        setField(term41765, term41765.getClass(), "req_inv_cmd_num", "viZRlrisPY");
        setField(term41765, term41765.getClass(), "req_inv_cmd_prm1", "VSfRsPLslq");
        setField(term41765, term41765.getClass(), "req_inv_cmd_prm2", "dwygneuBjP");
        setField(term41765, term41765.getClass(), "req_inv_cmd_prm3", "LfKgkzPZpX");
        setField(term41765, term41765.getClass(), "req_inv_cmd_prm4", "belyXxMqFm");
        setBooleanField(term41765, term41765.getClass(), "pow_save_flg", false);
        setField(term41765, term41765.getClass(), "nblss_dnt_p", term42079);
        setField(term41765, term41765.getClass(), "nblss_ltt_rl_vp", term42081);
        setField(term41765, term41765.getClass(), "nblss_ex_ltt_flg", term42083);
        setField(term41765, term41765.getClass(), "nblss_dnt_st_tm", "LPotuCwkwB");
        setField(term41765, term41765.getClass(), "nblss_dnt_ed_tm", "zpCKXLOzse");
        setField(term41765, term41765.getClass(), "nblss_ltt_st_tm", "qhlWSiHAHt");
        setField(term41765, term41765.getClass(), "nblss_ltt_ed_tm", "XrKIhxpIJD");
        setField(term41765, term41765.getClass(), "cmd", "RSuRSjiLvm");
        setField(term41765, term41765.getClass(), "req_id", "aoeNWgMpNx");
        setField(term41765, term41765.getClass(), "stat", "RQvXfSweVs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jGxArBjtep";
        callMethod(klass, "setReq_inv_cmd_prm1", argTypes, term41765, args);
    }

};


