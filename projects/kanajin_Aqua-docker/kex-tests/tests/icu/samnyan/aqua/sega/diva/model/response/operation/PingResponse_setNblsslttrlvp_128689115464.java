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

public class PingResponse_setNblsslttrlvp_128689115464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46261;
     Object term46665;

    public PingResponse_setNblsslttrlvp_128689115464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term46575 = new Integer(-1896376975);
        Integer term46577 = new Integer(729658803);
        Integer term46579 = new Integer(114754804);
        term46261 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term46261, term46261.getClass(), "ping_b_msg", "ZmfocrvaII");
        setField(term46261, term46261.getClass(), "ping_m_msg", "LTbQXrGKuA");
        setField(term46261, term46261.getClass(), "atnd_lut", "gzmGmDALUv");
        setField(term46261, term46261.getClass(), "fi_lut", "ZRoptBRTDM");
        setField(term46261, term46261.getClass(), "ci_lut", "vVVFChfeBQ");
        setField(term46261, term46261.getClass(), "qi_lut", "aASfcqfBbh");
        setField(term46261, term46261.getClass(), "pvl_lut", "DwpOIkpRFT");
        setField(term46261, term46261.getClass(), "pdcl_lut", "LPlTDoLrUy");
        setField(term46261, term46261.getClass(), "pnml_lut", "XETimBHIKG");
        setField(term46261, term46261.getClass(), "cinml_lut", "nOKVZSyfbZ");
        setField(term46261, term46261.getClass(), "rwl_lut", "adHZFgDoEH");
        setField(term46261, term46261.getClass(), "bdlol_lut", "vjNETNMDhQ");
        setField(term46261, term46261.getClass(), "shp_ctlg_lut", "pexqQqwSNj");
        setField(term46261, term46261.getClass(), "cstmz_itm_ctlg_lut", "myfXkIEBSV");
        setField(term46261, term46261.getClass(), "ngwl_lut", "LSrqDVjzEP");
        setField(term46261, term46261.getClass(), "rnk_nv_lut", "CPZCLJxTuA");
        setField(term46261, term46261.getClass(), "rnk_ps_lut", "ivAOXnVjmg");
        setField(term46261, term46261.getClass(), "bi_lut", "FivesaUeHG");
        setField(term46261, term46261.getClass(), "cpi_lut", "TnpXhZmCRY");
        setField(term46261, term46261.getClass(), "p_std_hc_lut", "ECVAXFhrTP");
        setField(term46261, term46261.getClass(), "p_std_i_n_lut", "ypytdNbrBc");
        setField(term46261, term46261.getClass(), "req_inv_cmd_num", "XvrJCOSYei");
        setField(term46261, term46261.getClass(), "req_inv_cmd_prm1", "QdRcxOxNSl");
        setField(term46261, term46261.getClass(), "req_inv_cmd_prm2", "lvdsucnNvR");
        setField(term46261, term46261.getClass(), "req_inv_cmd_prm3", "mSjSKfeMUn");
        setField(term46261, term46261.getClass(), "req_inv_cmd_prm4", "nVXCBYnEcg");
        setBooleanField(term46261, term46261.getClass(), "pow_save_flg", true);
        setField(term46261, term46261.getClass(), "nblss_dnt_p", term46575);
        setField(term46261, term46261.getClass(), "nblss_ltt_rl_vp", term46577);
        setField(term46261, term46261.getClass(), "nblss_ex_ltt_flg", term46579);
        setField(term46261, term46261.getClass(), "nblss_dnt_st_tm", "fcLnKXxzfM");
        setField(term46261, term46261.getClass(), "nblss_dnt_ed_tm", "FtyaWnfsgn");
        setField(term46261, term46261.getClass(), "nblss_ltt_st_tm", "qphbpPdwrD");
        setField(term46261, term46261.getClass(), "nblss_ltt_ed_tm", "xHdHafzFSM");
        setField(term46261, term46261.getClass(), "cmd", "fAsiOEKVaH");
        setField(term46261, term46261.getClass(), "req_id", "EltrILhEwT");
        setField(term46261, term46261.getClass(), "stat", "wCcSeUJzhg");
        term46665 = new Integer(1687361082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term46665;
        callMethod(klass, "setNblss_ltt_rl_vp", argTypes, term46261, args);
    }

};


