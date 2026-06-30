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
import java.lang.Boolean;

public class PingResponse_setPowsaveflg_36496377362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44789;
     Object term45193;

    public PingResponse_setPowsaveflg_36496377362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45103 = new Integer(1557431527);
        Integer term45105 = new Integer(-1504890659);
        Integer term45107 = new Integer(1358829571);
        term44789 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term44789, term44789.getClass(), "ping_b_msg", "tGgCtmAQPu");
        setField(term44789, term44789.getClass(), "ping_m_msg", "HokisXXNMR");
        setField(term44789, term44789.getClass(), "atnd_lut", "JbtvoXZZHr");
        setField(term44789, term44789.getClass(), "fi_lut", "eMlkqCfrnK");
        setField(term44789, term44789.getClass(), "ci_lut", "HCiwohQDUV");
        setField(term44789, term44789.getClass(), "qi_lut", "RRWTUIdKkl");
        setField(term44789, term44789.getClass(), "pvl_lut", "pBnfJsGPNO");
        setField(term44789, term44789.getClass(), "pdcl_lut", "hzaRTeUQpV");
        setField(term44789, term44789.getClass(), "pnml_lut", "RlIgxHiNOB");
        setField(term44789, term44789.getClass(), "cinml_lut", "kSpBCSqyfl");
        setField(term44789, term44789.getClass(), "rwl_lut", "OUrtbTvuiW");
        setField(term44789, term44789.getClass(), "bdlol_lut", "UnkpYLSsCR");
        setField(term44789, term44789.getClass(), "shp_ctlg_lut", "AaxnITALtd");
        setField(term44789, term44789.getClass(), "cstmz_itm_ctlg_lut", "RdnRRpWglh");
        setField(term44789, term44789.getClass(), "ngwl_lut", "YcXTXuOFYV");
        setField(term44789, term44789.getClass(), "rnk_nv_lut", "HGhIlMCaKM");
        setField(term44789, term44789.getClass(), "rnk_ps_lut", "pPxivEPfHY");
        setField(term44789, term44789.getClass(), "bi_lut", "BiitfiJmRW");
        setField(term44789, term44789.getClass(), "cpi_lut", "ILHarzuGbn");
        setField(term44789, term44789.getClass(), "p_std_hc_lut", "uNGHHAwCFL");
        setField(term44789, term44789.getClass(), "p_std_i_n_lut", "fbshyuUfqy");
        setField(term44789, term44789.getClass(), "req_inv_cmd_num", "eupNcihLEw");
        setField(term44789, term44789.getClass(), "req_inv_cmd_prm1", "iFFcolxwcm");
        setField(term44789, term44789.getClass(), "req_inv_cmd_prm2", "bAsZBSqnyM");
        setField(term44789, term44789.getClass(), "req_inv_cmd_prm3", "urrmpQzmTU");
        setField(term44789, term44789.getClass(), "req_inv_cmd_prm4", "GWoZyTTlNx");
        setBooleanField(term44789, term44789.getClass(), "pow_save_flg", false);
        setField(term44789, term44789.getClass(), "nblss_dnt_p", term45103);
        setField(term44789, term44789.getClass(), "nblss_ltt_rl_vp", term45105);
        setField(term44789, term44789.getClass(), "nblss_ex_ltt_flg", term45107);
        setField(term44789, term44789.getClass(), "nblss_dnt_st_tm", "ntUYcalSmz");
        setField(term44789, term44789.getClass(), "nblss_dnt_ed_tm", "lnZXLpyQoO");
        setField(term44789, term44789.getClass(), "nblss_ltt_st_tm", "lOIEIGbwPj");
        setField(term44789, term44789.getClass(), "nblss_ltt_ed_tm", "TvmWaJWmLY");
        setField(term44789, term44789.getClass(), "cmd", "TSUdwgvHgU");
        setField(term44789, term44789.getClass(), "req_id", "YBQxTjzIrN");
        setField(term44789, term44789.getClass(), "stat", "xfqaJVcHGx");
        term45193 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term45193;
        callMethod(klass, "setPow_save_flg", argTypes, term44789, args);
    }

};


