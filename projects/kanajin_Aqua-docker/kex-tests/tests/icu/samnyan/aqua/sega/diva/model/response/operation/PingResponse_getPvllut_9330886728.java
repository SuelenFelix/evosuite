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

public class PingResponse_getPvllut_9330886728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4581;

    public PingResponse_getPvllut_9330886728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4895 = new Integer(1622346318);
        Integer term4897 = new Integer(1048535127);
        Integer term4899 = new Integer(-655067527);
        term4581 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term4581, term4581.getClass(), "ping_b_msg", "tlzpzIjMib");
        setField(term4581, term4581.getClass(), "ping_m_msg", "AZdLeSugwv");
        setField(term4581, term4581.getClass(), "atnd_lut", "RMsXuyzKJV");
        setField(term4581, term4581.getClass(), "fi_lut", "FwPbDZcHmB");
        setField(term4581, term4581.getClass(), "ci_lut", "hOncybyCAH");
        setField(term4581, term4581.getClass(), "qi_lut", "QduALnDSVo");
        setField(term4581, term4581.getClass(), "pvl_lut", "izPpKDErnQ");
        setField(term4581, term4581.getClass(), "pdcl_lut", "NnpwZBUTvx");
        setField(term4581, term4581.getClass(), "pnml_lut", "tlQSNgTkQX");
        setField(term4581, term4581.getClass(), "cinml_lut", "PCipZnmBOF");
        setField(term4581, term4581.getClass(), "rwl_lut", "zcorEihhLK");
        setField(term4581, term4581.getClass(), "bdlol_lut", "GrqozDKFOk");
        setField(term4581, term4581.getClass(), "shp_ctlg_lut", "CFyoseFGLF");
        setField(term4581, term4581.getClass(), "cstmz_itm_ctlg_lut", "SFqCrhEWLm");
        setField(term4581, term4581.getClass(), "ngwl_lut", "GZdcJyZntS");
        setField(term4581, term4581.getClass(), "rnk_nv_lut", "OIHoJeysUi");
        setField(term4581, term4581.getClass(), "rnk_ps_lut", "WXMWFDGcLB");
        setField(term4581, term4581.getClass(), "bi_lut", "wKWbJssZuG");
        setField(term4581, term4581.getClass(), "cpi_lut", "NzBMMhkhpT");
        setField(term4581, term4581.getClass(), "p_std_hc_lut", "qCpEbQDHdF");
        setField(term4581, term4581.getClass(), "p_std_i_n_lut", "AHbZyFOmlo");
        setField(term4581, term4581.getClass(), "req_inv_cmd_num", "TwfWVQGiIj");
        setField(term4581, term4581.getClass(), "req_inv_cmd_prm1", "gUvcueTURF");
        setField(term4581, term4581.getClass(), "req_inv_cmd_prm2", "EwQBhZjCIT");
        setField(term4581, term4581.getClass(), "req_inv_cmd_prm3", "aSkmSwTnEw");
        setField(term4581, term4581.getClass(), "req_inv_cmd_prm4", "xvkbvaEGYd");
        setBooleanField(term4581, term4581.getClass(), "pow_save_flg", true);
        setField(term4581, term4581.getClass(), "nblss_dnt_p", term4895);
        setField(term4581, term4581.getClass(), "nblss_ltt_rl_vp", term4897);
        setField(term4581, term4581.getClass(), "nblss_ex_ltt_flg", term4899);
        setField(term4581, term4581.getClass(), "nblss_dnt_st_tm", "HBGNxdNURv");
        setField(term4581, term4581.getClass(), "nblss_dnt_ed_tm", "mfCpTPPQQm");
        setField(term4581, term4581.getClass(), "nblss_ltt_st_tm", "OcJCIDNIXA");
        setField(term4581, term4581.getClass(), "nblss_ltt_ed_tm", "XfRABIFVEp");
        setField(term4581, term4581.getClass(), "cmd", "MHGKyEnwKc");
        setField(term4581, term4581.getClass(), "req_id", "ShIELyuULw");
        setField(term4581, term4581.getClass(), "stat", "IpQuOGMgmj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvl_lut", argTypes, term4581, args);
    }

};


