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

public class PingResponse_setAtndlut_103089717738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26645;

    public PingResponse_setAtndlut_103089717738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26959 = new Integer(-615654495);
        Integer term26961 = new Integer(-1476117762);
        Integer term26963 = new Integer(-341962980);
        term26645 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term26645, term26645.getClass(), "ping_b_msg", "XjIOUIzJUP");
        setField(term26645, term26645.getClass(), "ping_m_msg", "iGTpXnnTqB");
        setField(term26645, term26645.getClass(), "atnd_lut", "XgJzBOYfQB");
        setField(term26645, term26645.getClass(), "fi_lut", "GAPGgDekVG");
        setField(term26645, term26645.getClass(), "ci_lut", "WmTogHwGLE");
        setField(term26645, term26645.getClass(), "qi_lut", "qYOIXsGycY");
        setField(term26645, term26645.getClass(), "pvl_lut", "sJNXNshRLe");
        setField(term26645, term26645.getClass(), "pdcl_lut", "AYnbmgRCKr");
        setField(term26645, term26645.getClass(), "pnml_lut", "iQRfDlaoYD");
        setField(term26645, term26645.getClass(), "cinml_lut", "kpcyrjDQzN");
        setField(term26645, term26645.getClass(), "rwl_lut", "IyukykAHLQ");
        setField(term26645, term26645.getClass(), "bdlol_lut", "CwZcgFJqMh");
        setField(term26645, term26645.getClass(), "shp_ctlg_lut", "RldCZqgRbO");
        setField(term26645, term26645.getClass(), "cstmz_itm_ctlg_lut", "LOVugCAgJs");
        setField(term26645, term26645.getClass(), "ngwl_lut", "SNmHXwCiFY");
        setField(term26645, term26645.getClass(), "rnk_nv_lut", "HZfkWoqyUW");
        setField(term26645, term26645.getClass(), "rnk_ps_lut", "QRwANPSyfT");
        setField(term26645, term26645.getClass(), "bi_lut", "DbZKLwYBgy");
        setField(term26645, term26645.getClass(), "cpi_lut", "LnNRVsjmxw");
        setField(term26645, term26645.getClass(), "p_std_hc_lut", "PlOnDkNrvX");
        setField(term26645, term26645.getClass(), "p_std_i_n_lut", "MltgFGldop");
        setField(term26645, term26645.getClass(), "req_inv_cmd_num", "JCWSoxnBJs");
        setField(term26645, term26645.getClass(), "req_inv_cmd_prm1", "vAxcpvjEEa");
        setField(term26645, term26645.getClass(), "req_inv_cmd_prm2", "FCkOgIBqXE");
        setField(term26645, term26645.getClass(), "req_inv_cmd_prm3", "kadRHthQRD");
        setField(term26645, term26645.getClass(), "req_inv_cmd_prm4", "cGbJSRSpNn");
        setBooleanField(term26645, term26645.getClass(), "pow_save_flg", true);
        setField(term26645, term26645.getClass(), "nblss_dnt_p", term26959);
        setField(term26645, term26645.getClass(), "nblss_ltt_rl_vp", term26961);
        setField(term26645, term26645.getClass(), "nblss_ex_ltt_flg", term26963);
        setField(term26645, term26645.getClass(), "nblss_dnt_st_tm", "MzXzaqaiHW");
        setField(term26645, term26645.getClass(), "nblss_dnt_ed_tm", "jWOWtrhVkA");
        setField(term26645, term26645.getClass(), "nblss_ltt_st_tm", "IyOhWYyaDV");
        setField(term26645, term26645.getClass(), "nblss_ltt_ed_tm", "omWrkCSFzy");
        setField(term26645, term26645.getClass(), "cmd", "VFYvUTgYFB");
        setField(term26645, term26645.getClass(), "req_id", "BrWqhEIUUj");
        setField(term26645, term26645.getClass(), "stat", "WfUmxdiHcU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BRrftvRvmF";
        callMethod(klass, "setAtnd_lut", argTypes, term26645, args);
    }

};


