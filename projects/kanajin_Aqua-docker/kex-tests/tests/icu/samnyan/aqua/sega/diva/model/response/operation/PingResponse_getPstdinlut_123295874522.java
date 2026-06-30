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

public class PingResponse_getPstdinlut_123295874522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14857;

    public PingResponse_getPstdinlut_123295874522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term15171 = new Integer(1596070772);
        Integer term15173 = new Integer(97029295);
        Integer term15175 = new Integer(-1371869594);
        term14857 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term14857, term14857.getClass(), "ping_b_msg", "GSOWFHMlbF");
        setField(term14857, term14857.getClass(), "ping_m_msg", "vpZIqpFbKM");
        setField(term14857, term14857.getClass(), "atnd_lut", "dAbwpJCDif");
        setField(term14857, term14857.getClass(), "fi_lut", "ATSXJPySio");
        setField(term14857, term14857.getClass(), "ci_lut", "XZkOUcbfFg");
        setField(term14857, term14857.getClass(), "qi_lut", "TGiJfagfky");
        setField(term14857, term14857.getClass(), "pvl_lut", "BJklinBmhN");
        setField(term14857, term14857.getClass(), "pdcl_lut", "IOddzvEWcl");
        setField(term14857, term14857.getClass(), "pnml_lut", "bIrtpkYJWT");
        setField(term14857, term14857.getClass(), "cinml_lut", "VuLLXpvPpZ");
        setField(term14857, term14857.getClass(), "rwl_lut", "UEdzEKEEEV");
        setField(term14857, term14857.getClass(), "bdlol_lut", "BcENaQFYSd");
        setField(term14857, term14857.getClass(), "shp_ctlg_lut", "POPYycoDBy");
        setField(term14857, term14857.getClass(), "cstmz_itm_ctlg_lut", "LuWMOXdAPA");
        setField(term14857, term14857.getClass(), "ngwl_lut", "blSffTnsOv");
        setField(term14857, term14857.getClass(), "rnk_nv_lut", "qbUMcIvEXH");
        setField(term14857, term14857.getClass(), "rnk_ps_lut", "TVxGTjeDcu");
        setField(term14857, term14857.getClass(), "bi_lut", "ABPtcyCzkR");
        setField(term14857, term14857.getClass(), "cpi_lut", "QgHhxMyKvr");
        setField(term14857, term14857.getClass(), "p_std_hc_lut", "VGiXZZTWRO");
        setField(term14857, term14857.getClass(), "p_std_i_n_lut", "MlPtwXnJOJ");
        setField(term14857, term14857.getClass(), "req_inv_cmd_num", "DbfiyFeaTe");
        setField(term14857, term14857.getClass(), "req_inv_cmd_prm1", "dQxXGBtDLZ");
        setField(term14857, term14857.getClass(), "req_inv_cmd_prm2", "EgSgEFIyyN");
        setField(term14857, term14857.getClass(), "req_inv_cmd_prm3", "iAOFcXaLSf");
        setField(term14857, term14857.getClass(), "req_inv_cmd_prm4", "EHoNUaeyvT");
        setBooleanField(term14857, term14857.getClass(), "pow_save_flg", true);
        setField(term14857, term14857.getClass(), "nblss_dnt_p", term15171);
        setField(term14857, term14857.getClass(), "nblss_ltt_rl_vp", term15173);
        setField(term14857, term14857.getClass(), "nblss_ex_ltt_flg", term15175);
        setField(term14857, term14857.getClass(), "nblss_dnt_st_tm", "ZwKmasCVIy");
        setField(term14857, term14857.getClass(), "nblss_dnt_ed_tm", "pxokrVaeMd");
        setField(term14857, term14857.getClass(), "nblss_ltt_st_tm", "ujxmmZZcbT");
        setField(term14857, term14857.getClass(), "nblss_ltt_ed_tm", "BOvgwHfoHQ");
        setField(term14857, term14857.getClass(), "cmd", "hPpFNeDBIb");
        setField(term14857, term14857.getClass(), "req_id", "DNOtiLPAIY");
        setField(term14857, term14857.getClass(), "stat", "FnEkAHBfyV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getP_std_i_n_lut", argTypes, term14857, args);
    }

};


